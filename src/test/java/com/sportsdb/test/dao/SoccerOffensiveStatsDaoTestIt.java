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
package com.sportsdb.test.dao;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.sportsdb.test.entity.SoccerOffensiveStats;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class SoccerOffensiveStatsDaoTestIt {
  static final String inputFile = "SoccerOffensiveStats.json";
  static SoccerOffensiveStatsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SoccerOffensiveStats[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultSoccerOffensiveStatsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SoccerOffensiveStats[].class);
      json = null;
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @After
  public void after() {
    records = null;
  }

  @Test
  public void testSelect() {
    SoccerOffensiveStats testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals goalsGameWinning ",
        this.records[1].getGoalsGameWinning(),
        testResult.getGoalsGameWinning());
    org.junit.Assert.assertEquals(
        "expect equals goalsGameTying ",
        this.records[1].getGoalsGameTying(),
        testResult.getGoalsGameTying());
    org.junit.Assert.assertEquals(
        "expect equals goalsOvertime ",
        this.records[1].getGoalsOvertime(),
        testResult.getGoalsOvertime());
    org.junit.Assert.assertEquals(
        "expect equals goalsShootout ",
        this.records[1].getGoalsShootout(),
        testResult.getGoalsShootout());
    org.junit.Assert.assertEquals(
        "expect equals goalsTotal ", this.records[1].getGoalsTotal(), testResult.getGoalsTotal());
    org.junit.Assert.assertEquals(
        "expect equals assistsGameWinning ",
        this.records[1].getAssistsGameWinning(),
        testResult.getAssistsGameWinning());
    org.junit.Assert.assertEquals(
        "expect equals assistsGameTying ",
        this.records[1].getAssistsGameTying(),
        testResult.getAssistsGameTying());
    org.junit.Assert.assertEquals(
        "expect equals assistsOvertime ",
        this.records[1].getAssistsOvertime(),
        testResult.getAssistsOvertime());
    org.junit.Assert.assertEquals(
        "expect equals assistsTotal ",
        this.records[1].getAssistsTotal(),
        testResult.getAssistsTotal());
    org.junit.Assert.assertEquals(
        "expect equals points ", this.records[1].getPoints(), testResult.getPoints());
    org.junit.Assert.assertEquals(
        "expect equals shotsTotal ", this.records[1].getShotsTotal(), testResult.getShotsTotal());
    org.junit.Assert.assertEquals(
        "expect equals shotsOnGoalTotal ",
        this.records[1].getShotsOnGoalTotal(),
        testResult.getShotsOnGoalTotal());
    org.junit.Assert.assertEquals(
        "expect equals shotsHitFrame ",
        this.records[1].getShotsHitFrame(),
        testResult.getShotsHitFrame());
    org.junit.Assert.assertEquals(
        "expect equals shotsPenaltyShotTaken ",
        this.records[1].getShotsPenaltyShotTaken(),
        testResult.getShotsPenaltyShotTaken());
    org.junit.Assert.assertEquals(
        "expect equals shotsPenaltyShotScored ",
        this.records[1].getShotsPenaltyShotScored(),
        testResult.getShotsPenaltyShotScored());
    org.junit.Assert.assertEquals(
        "expect equals shotsPenaltyShotMissed ",
        this.records[1].getShotsPenaltyShotMissed(),
        testResult.getShotsPenaltyShotMissed());
    org.junit.Assert.assertEquals(
        "expect equals shotsPenaltyShotPercentage ",
        this.records[1].getShotsPenaltyShotPercentage(),
        testResult.getShotsPenaltyShotPercentage());
    org.junit.Assert.assertEquals(
        "expect equals shotsShootoutTaken ",
        this.records[1].getShotsShootoutTaken(),
        testResult.getShotsShootoutTaken());
    org.junit.Assert.assertEquals(
        "expect equals shotsShootoutScored ",
        this.records[1].getShotsShootoutScored(),
        testResult.getShotsShootoutScored());
    org.junit.Assert.assertEquals(
        "expect equals shotsShootoutMissed ",
        this.records[1].getShotsShootoutMissed(),
        testResult.getShotsShootoutMissed());
    org.junit.Assert.assertEquals(
        "expect equals shotsShootoutPercentage ",
        this.records[1].getShotsShootoutPercentage(),
        testResult.getShotsShootoutPercentage());
    org.junit.Assert.assertEquals(
        "expect equals giveaways ", this.records[1].getGiveaways(), testResult.getGiveaways());
    org.junit.Assert.assertEquals(
        "expect equals offsides ", this.records[1].getOffsides(), testResult.getOffsides());
    org.junit.Assert.assertEquals(
        "expect equals cornerKicks ",
        this.records[1].getCornerKicks(),
        testResult.getCornerKicks());
    org.junit.Assert.assertEquals(
        "expect equals hatTricks ", this.records[1].getHatTricks(), testResult.getHatTricks());
  }
}
