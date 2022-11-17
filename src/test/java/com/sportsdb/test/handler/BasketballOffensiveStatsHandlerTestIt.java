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
import com.sportsdb.test.entity.BasketballOffensiveStats;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultBasketballOffensiveStatsDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasketballOffensiveStatsHandlerTestIt {
  static final String inputFile = "BasketballOffensiveStats.json";
  static BasketballOffensiveStatsHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private BasketballOffensiveStats[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new BasketballOffensiveStatsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/BasketballOffensiveStats.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, BasketballOffensiveStats[].class);
    assertEquals("match count", count, records.length);
    BasketballOffensiveStats testResult =
        jpa.find(BasketballOffensiveStats.class, records[0].getId());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsMade ",
        this.records[0].getFieldGoalsMade(),
        testResult.getFieldGoalsMade());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsAttempted ",
        this.records[0].getFieldGoalsAttempted(),
        testResult.getFieldGoalsAttempted());
    assertEquals(
        "expect equals fieldGoalsPercentage ",
        this.records[0].getFieldGoalsPercentage(),
        testResult.getFieldGoalsPercentage());
    assertEquals(
        "expect equals fieldGoalsPerGame ",
        this.records[0].getFieldGoalsPerGame(),
        testResult.getFieldGoalsPerGame());
    assertEquals(
        "expect equals fieldGoalsAttemptedPerGame ",
        this.records[0].getFieldGoalsAttemptedPerGame(),
        testResult.getFieldGoalsAttemptedPerGame());
    assertEquals(
        "expect equals fieldGoalsPercentageAdjusted ",
        this.records[0].getFieldGoalsPercentageAdjusted(),
        testResult.getFieldGoalsPercentageAdjusted());
    org.junit.Assert.assertEquals(
        "expect equals threePointersMade ",
        this.records[0].getThreePointersMade(),
        testResult.getThreePointersMade());
    org.junit.Assert.assertEquals(
        "expect equals threePointersAttempted ",
        this.records[0].getThreePointersAttempted(),
        testResult.getThreePointersAttempted());
    assertEquals(
        "expect equals threePointersPercentage ",
        this.records[0].getThreePointersPercentage(),
        testResult.getThreePointersPercentage());
    assertEquals(
        "expect equals threePointersPerGame ",
        this.records[0].getThreePointersPerGame(),
        testResult.getThreePointersPerGame());
    assertEquals(
        "expect equals threePointersAttemptedPerGame ",
        this.records[0].getThreePointersAttemptedPerGame(),
        testResult.getThreePointersAttemptedPerGame());
    assertEquals(
        "expect equals freeThrowsMade ",
        this.records[0].getFreeThrowsMade(),
        testResult.getFreeThrowsMade());
    assertEquals(
        "expect equals freeThrowsAttempted ",
        this.records[0].getFreeThrowsAttempted(),
        testResult.getFreeThrowsAttempted());
    assertEquals(
        "expect equals freeThrowsPercentage ",
        this.records[0].getFreeThrowsPercentage(),
        testResult.getFreeThrowsPercentage());
    assertEquals(
        "expect equals freeThrowsPerGame ",
        this.records[0].getFreeThrowsPerGame(),
        testResult.getFreeThrowsPerGame());
    assertEquals(
        "expect equals freeThrowsAttemptedPerGame ",
        this.records[0].getFreeThrowsAttemptedPerGame(),
        testResult.getFreeThrowsAttemptedPerGame());
    assertEquals(
        "expect equals pointsScoredTotal ",
        this.records[0].getPointsScoredTotal(),
        testResult.getPointsScoredTotal());
    assertEquals(
        "expect equals pointsScoredPerGame ",
        this.records[0].getPointsScoredPerGame(),
        testResult.getPointsScoredPerGame());
    assertEquals(
        "expect equals assistsTotal ",
        this.records[0].getAssistsTotal(),
        testResult.getAssistsTotal());
    assertEquals(
        "expect equals assistsPerGame ",
        this.records[0].getAssistsPerGame(),
        testResult.getAssistsPerGame());
    assertEquals(
        "expect equals turnoversTotal ",
        this.records[0].getTurnoversTotal(),
        testResult.getTurnoversTotal());
    assertEquals(
        "expect equals turnoversPerGame ",
        this.records[0].getTurnoversPerGame(),
        testResult.getTurnoversPerGame());
    assertEquals(
        "expect equals pointsScoredOffTurnovers ",
        this.records[0].getPointsScoredOffTurnovers(),
        testResult.getPointsScoredOffTurnovers());
    assertEquals(
        "expect equals pointsScoredInPaint ",
        this.records[0].getPointsScoredInPaint(),
        testResult.getPointsScoredInPaint());
    assertEquals(
        "expect equals pointsScoredOnSecondChance ",
        this.records[0].getPointsScoredOnSecondChance(),
        testResult.getPointsScoredOnSecondChance());
    assertEquals(
        "expect equals pointsScoredOnFastBreak ",
        this.records[0].getPointsScoredOnFastBreak(),
        testResult.getPointsScoredOnFastBreak());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
