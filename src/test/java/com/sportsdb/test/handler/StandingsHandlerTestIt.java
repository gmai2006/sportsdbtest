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
import com.sportsdb.test.entity.Standings;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultStandingsDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StandingsHandlerTestIt {
  static final String inputFile = "Standings.json";
  static StandingsHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private Standings[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new StandingsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/Standings.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, Standings[].class);
    assertEquals("match count", count, records.length);
    Standings testResult = jpa.find(Standings.class, records[0].getId());
    org.junit.Assert.assertEquals(
        "expect equals affiliationId ",
        this.records[0].getAffiliationId(),
        testResult.getAffiliationId());
    assertEquals(
        "expect equals standingType ",
        this.records[0].getStandingType(),
        testResult.getStandingType());
    org.junit.Assert.assertEquals(
        "expect equals subSeasonId ",
        this.records[0].getSubSeasonId(),
        testResult.getSubSeasonId());
    assertEquals(
        "expect equals lastUpdated ",
        this.records[0].getLastUpdated(),
        testResult.getLastUpdated());
    assertEquals(
        "expect equals durationScope ",
        this.records[0].getDurationScope(),
        testResult.getDurationScope());
    assertEquals(
        "expect equals competitionScope ",
        this.records[0].getCompetitionScope(),
        testResult.getCompetitionScope());
    assertEquals(
        "expect equals competitionScopeId ",
        this.records[0].getCompetitionScopeId(),
        testResult.getCompetitionScopeId());
    assertEquals(
        "expect equals alignmentScope ",
        this.records[0].getAlignmentScope(),
        testResult.getAlignmentScope());
    assertEquals(
        "expect equals siteScope ", this.records[0].getSiteScope(), testResult.getSiteScope());
    assertEquals(
        "expect equals scopingLabel ",
        this.records[0].getScopingLabel(),
        testResult.getScopingLabel());
    org.junit.Assert.assertEquals(
        "expect equals publisherId ",
        this.records[0].getPublisherId(),
        testResult.getPublisherId());
    assertEquals("expect equals source ", this.records[0].getSource(), testResult.getSource());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
