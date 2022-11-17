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
import com.sportsdb.test.entity.SoccerOffensiveStats;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultSoccerOffensiveStatsDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SoccerOffensiveStatsHandlerTestIt {
  static final String inputFile = "SoccerOffensiveStats.json";
  static SoccerOffensiveStatsHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SoccerOffensiveStats[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new SoccerOffensiveStatsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/SoccerOffensiveStats.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, SoccerOffensiveStats[].class);
    assertEquals("match count", count, records.length);
    SoccerOffensiveStats testResult = jpa.find(SoccerOffensiveStats.class, records[0].getId());
    assertEquals(
        "expect equals goalsGameWinning ",
        this.records[0].getGoalsGameWinning(),
        testResult.getGoalsGameWinning());
    assertEquals(
        "expect equals goalsGameTying ",
        this.records[0].getGoalsGameTying(),
        testResult.getGoalsGameTying());
    assertEquals(
        "expect equals goalsOvertime ",
        this.records[0].getGoalsOvertime(),
        testResult.getGoalsOvertime());
    assertEquals(
        "expect equals goalsShootout ",
        this.records[0].getGoalsShootout(),
        testResult.getGoalsShootout());
    assertEquals(
        "expect equals goalsTotal ", this.records[0].getGoalsTotal(), testResult.getGoalsTotal());
    assertEquals(
        "expect equals assistsGameWinning ",
        this.records[0].getAssistsGameWinning(),
        testResult.getAssistsGameWinning());
    assertEquals(
        "expect equals assistsGameTying ",
        this.records[0].getAssistsGameTying(),
        testResult.getAssistsGameTying());
    assertEquals(
        "expect equals assistsOvertime ",
        this.records[0].getAssistsOvertime(),
        testResult.getAssistsOvertime());
    assertEquals(
        "expect equals assistsTotal ",
        this.records[0].getAssistsTotal(),
        testResult.getAssistsTotal());
    assertEquals("expect equals points ", this.records[0].getPoints(), testResult.getPoints());
    assertEquals(
        "expect equals shotsTotal ", this.records[0].getShotsTotal(), testResult.getShotsTotal());
    assertEquals(
        "expect equals shotsOnGoalTotal ",
        this.records[0].getShotsOnGoalTotal(),
        testResult.getShotsOnGoalTotal());
    assertEquals(
        "expect equals shotsHitFrame ",
        this.records[0].getShotsHitFrame(),
        testResult.getShotsHitFrame());
    assertEquals(
        "expect equals shotsPenaltyShotTaken ",
        this.records[0].getShotsPenaltyShotTaken(),
        testResult.getShotsPenaltyShotTaken());
    assertEquals(
        "expect equals shotsPenaltyShotScored ",
        this.records[0].getShotsPenaltyShotScored(),
        testResult.getShotsPenaltyShotScored());
    assertEquals(
        "expect equals shotsPenaltyShotMissed ",
        this.records[0].getShotsPenaltyShotMissed(),
        testResult.getShotsPenaltyShotMissed());
    assertEquals(
        "expect equals shotsPenaltyShotPercentage ",
        this.records[0].getShotsPenaltyShotPercentage(),
        testResult.getShotsPenaltyShotPercentage());
    assertEquals(
        "expect equals shotsShootoutTaken ",
        this.records[0].getShotsShootoutTaken(),
        testResult.getShotsShootoutTaken());
    assertEquals(
        "expect equals shotsShootoutScored ",
        this.records[0].getShotsShootoutScored(),
        testResult.getShotsShootoutScored());
    assertEquals(
        "expect equals shotsShootoutMissed ",
        this.records[0].getShotsShootoutMissed(),
        testResult.getShotsShootoutMissed());
    assertEquals(
        "expect equals shotsShootoutPercentage ",
        this.records[0].getShotsShootoutPercentage(),
        testResult.getShotsShootoutPercentage());
    assertEquals(
        "expect equals giveaways ", this.records[0].getGiveaways(), testResult.getGiveaways());
    assertEquals(
        "expect equals offsides ", this.records[0].getOffsides(), testResult.getOffsides());
    assertEquals(
        "expect equals cornerKicks ",
        this.records[0].getCornerKicks(),
        testResult.getCornerKicks());
    assertEquals(
        "expect equals hatTricks ", this.records[0].getHatTricks(), testResult.getHatTricks());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
