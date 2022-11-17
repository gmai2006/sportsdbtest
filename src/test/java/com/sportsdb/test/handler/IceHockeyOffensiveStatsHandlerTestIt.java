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
import com.sportsdb.test.entity.IceHockeyOffensiveStats;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultIceHockeyOffensiveStatsDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IceHockeyOffensiveStatsHandlerTestIt {
  static final String inputFile = "IceHockeyOffensiveStats.json";
  static IceHockeyOffensiveStatsHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private IceHockeyOffensiveStats[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new IceHockeyOffensiveStatsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/IceHockeyOffensiveStats.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, IceHockeyOffensiveStats[].class);
    assertEquals("match count", count, records.length);
    IceHockeyOffensiveStats testResult =
        jpa.find(IceHockeyOffensiveStats.class, records[0].getId());
    assertEquals(
        "expect equals goalsGameWinning ",
        this.records[0].getGoalsGameWinning(),
        testResult.getGoalsGameWinning());
    assertEquals(
        "expect equals goalsGameTying ",
        this.records[0].getGoalsGameTying(),
        testResult.getGoalsGameTying());
    assertEquals(
        "expect equals goalsPowerPlay ",
        this.records[0].getGoalsPowerPlay(),
        testResult.getGoalsPowerPlay());
    assertEquals(
        "expect equals goalsShortHanded ",
        this.records[0].getGoalsShortHanded(),
        testResult.getGoalsShortHanded());
    assertEquals(
        "expect equals goalsEvenStrength ",
        this.records[0].getGoalsEvenStrength(),
        testResult.getGoalsEvenStrength());
    assertEquals(
        "expect equals goalsEmptyNet ",
        this.records[0].getGoalsEmptyNet(),
        testResult.getGoalsEmptyNet());
    assertEquals(
        "expect equals goalsOvertime ",
        this.records[0].getGoalsOvertime(),
        testResult.getGoalsOvertime());
    assertEquals(
        "expect equals goalsShootout ",
        this.records[0].getGoalsShootout(),
        testResult.getGoalsShootout());
    assertEquals(
        "expect equals goalsPenaltyShot ",
        this.records[0].getGoalsPenaltyShot(),
        testResult.getGoalsPenaltyShot());
    assertEquals("expect equals assists ", this.records[0].getAssists(), testResult.getAssists());
    assertEquals("expect equals points ", this.records[0].getPoints(), testResult.getPoints());
    assertEquals(
        "expect equals powerPlayAmount ",
        this.records[0].getPowerPlayAmount(),
        testResult.getPowerPlayAmount());
    assertEquals(
        "expect equals powerPlayPercentage ",
        this.records[0].getPowerPlayPercentage(),
        testResult.getPowerPlayPercentage());
    assertEquals(
        "expect equals shotsPenaltyShotTaken ",
        this.records[0].getShotsPenaltyShotTaken(),
        testResult.getShotsPenaltyShotTaken());
    assertEquals(
        "expect equals shotsPenaltyShotMissed ",
        this.records[0].getShotsPenaltyShotMissed(),
        testResult.getShotsPenaltyShotMissed());
    assertEquals(
        "expect equals shotsPenaltyShotPercentage ",
        this.records[0].getShotsPenaltyShotPercentage(),
        testResult.getShotsPenaltyShotPercentage());
    assertEquals(
        "expect equals giveaways ", this.records[0].getGiveaways(), testResult.getGiveaways());
    assertEquals(
        "expect equals minutesPowerPlay ",
        this.records[0].getMinutesPowerPlay(),
        testResult.getMinutesPowerPlay());
    assertEquals(
        "expect equals faceoffWins ",
        this.records[0].getFaceoffWins(),
        testResult.getFaceoffWins());
    assertEquals(
        "expect equals faceoffLosses ",
        this.records[0].getFaceoffLosses(),
        testResult.getFaceoffLosses());
    assertEquals(
        "expect equals faceoffWinPercentage ",
        this.records[0].getFaceoffWinPercentage(),
        testResult.getFaceoffWinPercentage());
    assertEquals(
        "expect equals scoringChances ",
        this.records[0].getScoringChances(),
        testResult.getScoringChances());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
