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
import com.sportsdb.test.entity.IceHockeyOffensiveStats;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class IceHockeyOffensiveStatsDaoTestIt {
  static final String inputFile = "IceHockeyOffensiveStats.json";
  static IceHockeyOffensiveStatsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private IceHockeyOffensiveStats[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultIceHockeyOffensiveStatsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, IceHockeyOffensiveStats[].class);
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
    IceHockeyOffensiveStats testResult = dao.find(records[1].getId());
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
        "expect equals goalsPowerPlay ",
        this.records[1].getGoalsPowerPlay(),
        testResult.getGoalsPowerPlay());
    org.junit.Assert.assertEquals(
        "expect equals goalsShortHanded ",
        this.records[1].getGoalsShortHanded(),
        testResult.getGoalsShortHanded());
    org.junit.Assert.assertEquals(
        "expect equals goalsEvenStrength ",
        this.records[1].getGoalsEvenStrength(),
        testResult.getGoalsEvenStrength());
    org.junit.Assert.assertEquals(
        "expect equals goalsEmptyNet ",
        this.records[1].getGoalsEmptyNet(),
        testResult.getGoalsEmptyNet());
    org.junit.Assert.assertEquals(
        "expect equals goalsOvertime ",
        this.records[1].getGoalsOvertime(),
        testResult.getGoalsOvertime());
    org.junit.Assert.assertEquals(
        "expect equals goalsShootout ",
        this.records[1].getGoalsShootout(),
        testResult.getGoalsShootout());
    org.junit.Assert.assertEquals(
        "expect equals goalsPenaltyShot ",
        this.records[1].getGoalsPenaltyShot(),
        testResult.getGoalsPenaltyShot());
    org.junit.Assert.assertEquals(
        "expect equals assists ", this.records[1].getAssists(), testResult.getAssists());
    org.junit.Assert.assertEquals(
        "expect equals points ", this.records[1].getPoints(), testResult.getPoints());
    org.junit.Assert.assertEquals(
        "expect equals powerPlayAmount ",
        this.records[1].getPowerPlayAmount(),
        testResult.getPowerPlayAmount());
    org.junit.Assert.assertEquals(
        "expect equals powerPlayPercentage ",
        this.records[1].getPowerPlayPercentage(),
        testResult.getPowerPlayPercentage());
    org.junit.Assert.assertEquals(
        "expect equals shotsPenaltyShotTaken ",
        this.records[1].getShotsPenaltyShotTaken(),
        testResult.getShotsPenaltyShotTaken());
    org.junit.Assert.assertEquals(
        "expect equals shotsPenaltyShotMissed ",
        this.records[1].getShotsPenaltyShotMissed(),
        testResult.getShotsPenaltyShotMissed());
    org.junit.Assert.assertEquals(
        "expect equals shotsPenaltyShotPercentage ",
        this.records[1].getShotsPenaltyShotPercentage(),
        testResult.getShotsPenaltyShotPercentage());
    org.junit.Assert.assertEquals(
        "expect equals giveaways ", this.records[1].getGiveaways(), testResult.getGiveaways());
    org.junit.Assert.assertEquals(
        "expect equals minutesPowerPlay ",
        this.records[1].getMinutesPowerPlay(),
        testResult.getMinutesPowerPlay());
    org.junit.Assert.assertEquals(
        "expect equals faceoffWins ",
        this.records[1].getFaceoffWins(),
        testResult.getFaceoffWins());
    org.junit.Assert.assertEquals(
        "expect equals faceoffLosses ",
        this.records[1].getFaceoffLosses(),
        testResult.getFaceoffLosses());
    org.junit.Assert.assertEquals(
        "expect equals faceoffWinPercentage ",
        this.records[1].getFaceoffWinPercentage(),
        testResult.getFaceoffWinPercentage());
    org.junit.Assert.assertEquals(
        "expect equals scoringChances ",
        this.records[1].getScoringChances(),
        testResult.getScoringChances());
  }
}
