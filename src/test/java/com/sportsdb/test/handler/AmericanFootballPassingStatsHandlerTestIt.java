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
import com.sportsdb.test.entity.AmericanFootballPassingStats;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultAmericanFootballPassingStatsDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AmericanFootballPassingStatsHandlerTestIt {
  static final String inputFile = "AmericanFootballPassingStats.json";
  static AmericanFootballPassingStatsHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private AmericanFootballPassingStats[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new AmericanFootballPassingStatsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/AmericanFootballPassingStats.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, AmericanFootballPassingStats[].class);
    assertEquals("match count", count, records.length);
    AmericanFootballPassingStats testResult =
        jpa.find(AmericanFootballPassingStats.class, records[0].getId());
    assertEquals(
        "expect equals passesAttempts ",
        this.records[0].getPassesAttempts(),
        testResult.getPassesAttempts());
    assertEquals(
        "expect equals passesCompletions ",
        this.records[0].getPassesCompletions(),
        testResult.getPassesCompletions());
    assertEquals(
        "expect equals passesPercentage ",
        this.records[0].getPassesPercentage(),
        testResult.getPassesPercentage());
    assertEquals(
        "expect equals passesYardsGross ",
        this.records[0].getPassesYardsGross(),
        testResult.getPassesYardsGross());
    assertEquals(
        "expect equals passesYardsNet ",
        this.records[0].getPassesYardsNet(),
        testResult.getPassesYardsNet());
    assertEquals(
        "expect equals passesYardsLost ",
        this.records[0].getPassesYardsLost(),
        testResult.getPassesYardsLost());
    assertEquals(
        "expect equals passesTouchdowns ",
        this.records[0].getPassesTouchdowns(),
        testResult.getPassesTouchdowns());
    assertEquals(
        "expect equals passesTouchdownsPercentage ",
        this.records[0].getPassesTouchdownsPercentage(),
        testResult.getPassesTouchdownsPercentage());
    assertEquals(
        "expect equals passesInterceptions ",
        this.records[0].getPassesInterceptions(),
        testResult.getPassesInterceptions());
    assertEquals(
        "expect equals passesInterceptionsPercentage ",
        this.records[0].getPassesInterceptionsPercentage(),
        testResult.getPassesInterceptionsPercentage());
    assertEquals(
        "expect equals passesLongest ",
        this.records[0].getPassesLongest(),
        testResult.getPassesLongest());
    assertEquals(
        "expect equals passesAverageYardsPer ",
        this.records[0].getPassesAverageYardsPer(),
        testResult.getPassesAverageYardsPer());
    assertEquals(
        "expect equals passerRating ",
        this.records[0].getPasserRating(),
        testResult.getPasserRating());
    assertEquals(
        "expect equals receptionsTotal ",
        this.records[0].getReceptionsTotal(),
        testResult.getReceptionsTotal());
    assertEquals(
        "expect equals receptionsYards ",
        this.records[0].getReceptionsYards(),
        testResult.getReceptionsYards());
    assertEquals(
        "expect equals receptionsTouchdowns ",
        this.records[0].getReceptionsTouchdowns(),
        testResult.getReceptionsTouchdowns());
    assertEquals(
        "expect equals receptionsFirstDown ",
        this.records[0].getReceptionsFirstDown(),
        testResult.getReceptionsFirstDown());
    assertEquals(
        "expect equals receptionsLongest ",
        this.records[0].getReceptionsLongest(),
        testResult.getReceptionsLongest());
    assertEquals(
        "expect equals receptionsAverageYardsPer ",
        this.records[0].getReceptionsAverageYardsPer(),
        testResult.getReceptionsAverageYardsPer());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
