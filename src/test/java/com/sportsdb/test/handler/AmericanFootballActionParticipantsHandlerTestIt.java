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
import com.sportsdb.test.entity.AmericanFootballActionParticipants;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultAmericanFootballActionParticipantsDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AmericanFootballActionParticipantsHandlerTestIt {
  static final String inputFile = "AmericanFootballActionParticipants.json";
  static AmericanFootballActionParticipantsHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private AmericanFootballActionParticipants[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new AmericanFootballActionParticipantsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/AmericanFootballActionParticipants.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, AmericanFootballActionParticipants[].class);
    assertEquals("match count", count, records.length);
    AmericanFootballActionParticipants testResult =
        jpa.find(AmericanFootballActionParticipants.class, records[0].getId());
    org.junit.Assert.assertEquals(
        "expect equals americanFootballActionPlayId ",
        this.records[0].getAmericanFootballActionPlayId(),
        testResult.getAmericanFootballActionPlayId());
    org.junit.Assert.assertEquals(
        "expect equals personId ", this.records[0].getPersonId(), testResult.getPersonId());
    assertEquals(
        "expect equals participantRole ",
        this.records[0].getParticipantRole(),
        testResult.getParticipantRole());
    assertEquals(
        "expect equals scoreType ", this.records[0].getScoreType(), testResult.getScoreType());
    org.junit.Assert.assertEquals(
        "expect equals fieldLine ", this.records[0].getFieldLine(), testResult.getFieldLine());
    org.junit.Assert.assertEquals(
        "expect equals yardage ", this.records[0].getYardage(), testResult.getYardage());
    org.junit.Assert.assertEquals(
        "expect equals scoreCredit ",
        this.records[0].getScoreCredit(),
        testResult.getScoreCredit());
    org.junit.Assert.assertEquals(
        "expect equals yardsGained ",
        this.records[0].getYardsGained(),
        testResult.getYardsGained());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
