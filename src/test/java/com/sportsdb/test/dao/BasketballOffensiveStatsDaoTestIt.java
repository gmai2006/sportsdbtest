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
import com.sportsdb.test.entity.BasketballOffensiveStats;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class BasketballOffensiveStatsDaoTestIt {
  static final String inputFile = "BasketballOffensiveStats.json";
  static BasketballOffensiveStatsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private BasketballOffensiveStats[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultBasketballOffensiveStatsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, BasketballOffensiveStats[].class);
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
    BasketballOffensiveStats testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals fieldGoalsMade ",
        this.records[1].getFieldGoalsMade() == testResult.getFieldGoalsMade());
    org.junit.Assert.assertTrue(
        "expect equals fieldGoalsAttempted ",
        this.records[1].getFieldGoalsAttempted() == testResult.getFieldGoalsAttempted());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsPercentage ",
        this.records[1].getFieldGoalsPercentage(),
        testResult.getFieldGoalsPercentage());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsPerGame ",
        this.records[1].getFieldGoalsPerGame(),
        testResult.getFieldGoalsPerGame());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsAttemptedPerGame ",
        this.records[1].getFieldGoalsAttemptedPerGame(),
        testResult.getFieldGoalsAttemptedPerGame());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsPercentageAdjusted ",
        this.records[1].getFieldGoalsPercentageAdjusted(),
        testResult.getFieldGoalsPercentageAdjusted());
    org.junit.Assert.assertTrue(
        "expect equals threePointersMade ",
        this.records[1].getThreePointersMade() == testResult.getThreePointersMade());
    org.junit.Assert.assertTrue(
        "expect equals threePointersAttempted ",
        this.records[1].getThreePointersAttempted() == testResult.getThreePointersAttempted());
    org.junit.Assert.assertEquals(
        "expect equals threePointersPercentage ",
        this.records[1].getThreePointersPercentage(),
        testResult.getThreePointersPercentage());
    org.junit.Assert.assertEquals(
        "expect equals threePointersPerGame ",
        this.records[1].getThreePointersPerGame(),
        testResult.getThreePointersPerGame());
    org.junit.Assert.assertEquals(
        "expect equals threePointersAttemptedPerGame ",
        this.records[1].getThreePointersAttemptedPerGame(),
        testResult.getThreePointersAttemptedPerGame());
    org.junit.Assert.assertEquals(
        "expect equals freeThrowsMade ",
        this.records[1].getFreeThrowsMade(),
        testResult.getFreeThrowsMade());
    org.junit.Assert.assertEquals(
        "expect equals freeThrowsAttempted ",
        this.records[1].getFreeThrowsAttempted(),
        testResult.getFreeThrowsAttempted());
    org.junit.Assert.assertEquals(
        "expect equals freeThrowsPercentage ",
        this.records[1].getFreeThrowsPercentage(),
        testResult.getFreeThrowsPercentage());
    org.junit.Assert.assertEquals(
        "expect equals freeThrowsPerGame ",
        this.records[1].getFreeThrowsPerGame(),
        testResult.getFreeThrowsPerGame());
    org.junit.Assert.assertEquals(
        "expect equals freeThrowsAttemptedPerGame ",
        this.records[1].getFreeThrowsAttemptedPerGame(),
        testResult.getFreeThrowsAttemptedPerGame());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredTotal ",
        this.records[1].getPointsScoredTotal(),
        testResult.getPointsScoredTotal());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredPerGame ",
        this.records[1].getPointsScoredPerGame(),
        testResult.getPointsScoredPerGame());
    org.junit.Assert.assertEquals(
        "expect equals assistsTotal ",
        this.records[1].getAssistsTotal(),
        testResult.getAssistsTotal());
    org.junit.Assert.assertEquals(
        "expect equals assistsPerGame ",
        this.records[1].getAssistsPerGame(),
        testResult.getAssistsPerGame());
    org.junit.Assert.assertEquals(
        "expect equals turnoversTotal ",
        this.records[1].getTurnoversTotal(),
        testResult.getTurnoversTotal());
    org.junit.Assert.assertEquals(
        "expect equals turnoversPerGame ",
        this.records[1].getTurnoversPerGame(),
        testResult.getTurnoversPerGame());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredOffTurnovers ",
        this.records[1].getPointsScoredOffTurnovers(),
        testResult.getPointsScoredOffTurnovers());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredInPaint ",
        this.records[1].getPointsScoredInPaint(),
        testResult.getPointsScoredInPaint());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredOnSecondChance ",
        this.records[1].getPointsScoredOnSecondChance(),
        testResult.getPointsScoredOnSecondChance());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredOnFastBreak ",
        this.records[1].getPointsScoredOnFastBreak(),
        testResult.getPointsScoredOnFastBreak());
  }
}
