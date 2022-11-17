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
import com.sportsdb.test.entity.MediaContents;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultMediaContentsDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MediaContentsHandlerTestIt {
  static final String inputFile = "MediaContents.json";
  static MediaContentsHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private MediaContents[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new MediaContentsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/MediaContents.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, MediaContents[].class);
    assertEquals("match count", count, records.length);
    MediaContents testResult = jpa.find(MediaContents.class, records[0].getId());
    org.junit.Assert.assertEquals(
        "expect equals mediaId ", this.records[0].getMediaId(), testResult.getMediaId());
    assertEquals("expect equals object ", this.records[0].getObject(), testResult.getObject());
    assertEquals("expect equals format ", this.records[0].getFormat(), testResult.getFormat());
    assertEquals(
        "expect equals mimeType ", this.records[0].getMimeType(), testResult.getMimeType());
    assertEquals("expect equals height ", this.records[0].getHeight(), testResult.getHeight());
    assertEquals("expect equals width ", this.records[0].getWidth(), testResult.getWidth());
    assertEquals(
        "expect equals duration ", this.records[0].getDuration(), testResult.getDuration());
    assertEquals(
        "expect equals fileSize ", this.records[0].getFileSize(), testResult.getFileSize());
    assertEquals(
        "expect equals resolution ", this.records[0].getResolution(), testResult.getResolution());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
