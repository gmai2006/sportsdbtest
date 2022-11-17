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
import com.sportsdb.test.entity.BaseballActionSubstitutions;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultBaseballActionSubstitutionsDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseballActionSubstitutionsHandlerTestIt {
  static final String inputFile = "BaseballActionSubstitutions.json";
  static BaseballActionSubstitutionsHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private BaseballActionSubstitutions[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new BaseballActionSubstitutionsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/BaseballActionSubstitutions.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, BaseballActionSubstitutions[].class);
    assertEquals("match count", count, records.length);
    BaseballActionSubstitutions testResult =
        jpa.find(BaseballActionSubstitutions.class, records[0].getId());
    org.junit.Assert.assertEquals(
        "expect equals baseballEventStateId ",
        this.records[0].getBaseballEventStateId(),
        testResult.getBaseballEventStateId());
    org.junit.Assert.assertEquals(
        "expect equals sequenceNumber ",
        this.records[0].getSequenceNumber(),
        testResult.getSequenceNumber());
    assertEquals(
        "expect equals personType ", this.records[0].getPersonType(), testResult.getPersonType());
    org.junit.Assert.assertEquals(
        "expect equals personOriginalId ",
        this.records[0].getPersonOriginalId(),
        testResult.getPersonOriginalId());
    org.junit.Assert.assertEquals(
        "expect equals personOriginalPositionId ",
        this.records[0].getPersonOriginalPositionId(),
        testResult.getPersonOriginalPositionId());
    org.junit.Assert.assertEquals(
        "expect equals personOriginalLineupSlot ",
        this.records[0].getPersonOriginalLineupSlot(),
        testResult.getPersonOriginalLineupSlot());
    org.junit.Assert.assertEquals(
        "expect equals personReplacingId ",
        this.records[0].getPersonReplacingId(),
        testResult.getPersonReplacingId());
    org.junit.Assert.assertEquals(
        "expect equals personReplacingPositionId ",
        this.records[0].getPersonReplacingPositionId(),
        testResult.getPersonReplacingPositionId());
    org.junit.Assert.assertEquals(
        "expect equals personReplacingLineupSlot ",
        this.records[0].getPersonReplacingLineupSlot(),
        testResult.getPersonReplacingLineupSlot());
    assertEquals(
        "expect equals substitutionReason ",
        this.records[0].getSubstitutionReason(),
        testResult.getSubstitutionReason());
    assertEquals("expect equals comment ", this.records[0].getComment(), testResult.getComment());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
