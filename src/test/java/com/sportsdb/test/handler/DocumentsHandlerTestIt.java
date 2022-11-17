/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.sportsdb.test.handler;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.CDL;
import org.json.JSONArray;
import com.google.gson.Gson;
import com.sportsdb.test.entity.Documents;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultDocumentsDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DocumentsHandlerTestIt {
  static final String inputFile = "Documents.json";
  static DocumentsHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private Documents[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new DocumentsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/Documents.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, Documents[].class);
    assertEquals("match count", count, records.length);
    Documents testResult = jpa.find(Documents.class, records[0].getId());
    assertEquals("expect equals docId ", this.records[0].getDocId(), testResult.getDocId());
    org.junit.Assert.assertEquals(
        "expect equals publisherId ",
        this.records[0].getPublisherId(),
        testResult.getPublisherId());
    assertEquals("expect equals title ", this.records[0].getTitle(), testResult.getTitle());
    assertEquals(
        "expect equals language ", this.records[0].getLanguage(), testResult.getLanguage());
    assertEquals(
        "expect equals priority ", this.records[0].getPriority(), testResult.getPriority());
    assertEquals(
        "expect equals revisionId ", this.records[0].getRevisionId(), testResult.getRevisionId());
    assertEquals(
        "expect equals statsCoverage ",
        this.records[0].getStatsCoverage(),
        testResult.getStatsCoverage());
    org.junit.Assert.assertEquals(
        "expect equals documentFixtureId ",
        this.records[0].getDocumentFixtureId(),
        testResult.getDocumentFixtureId());
    org.junit.Assert.assertEquals(
        "expect equals sourceId ", this.records[0].getSourceId(), testResult.getSourceId());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
