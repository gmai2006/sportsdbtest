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
package com.sportsdb.test.service;

import com.sportsdb.test.entity.BasketballOffensiveStats;

import com.sportsdb.test.utils.FileUtils;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class BasketballOffensiveStatsServiceTest {
  private static DefaultBasketballOffensiveStatsService serviceMock;
  private static BasketballOffensiveStats[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultBasketballOffensiveStatsService.class);
    String inputFile = "BasketballOffensiveStats.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, BasketballOffensiveStats[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    BasketballOffensiveStats testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals fieldGoalsMade ",
        records[0].getFieldGoalsMade() == testResult.getFieldGoalsMade());
    org.junit.Assert.assertTrue(
        "expect equals fieldGoalsAttempted ",
        records[0].getFieldGoalsAttempted() == testResult.getFieldGoalsAttempted());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsPercentage ",
        records[0].getFieldGoalsPercentage(),
        testResult.getFieldGoalsPercentage());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsPerGame ",
        records[0].getFieldGoalsPerGame(),
        testResult.getFieldGoalsPerGame());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsAttemptedPerGame ",
        records[0].getFieldGoalsAttemptedPerGame(),
        testResult.getFieldGoalsAttemptedPerGame());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsPercentageAdjusted ",
        records[0].getFieldGoalsPercentageAdjusted(),
        testResult.getFieldGoalsPercentageAdjusted());
    org.junit.Assert.assertTrue(
        "expect equals threePointersMade ",
        records[0].getThreePointersMade() == testResult.getThreePointersMade());
    org.junit.Assert.assertTrue(
        "expect equals threePointersAttempted ",
        records[0].getThreePointersAttempted() == testResult.getThreePointersAttempted());
    org.junit.Assert.assertEquals(
        "expect equals threePointersPercentage ",
        records[0].getThreePointersPercentage(),
        testResult.getThreePointersPercentage());
    org.junit.Assert.assertEquals(
        "expect equals threePointersPerGame ",
        records[0].getThreePointersPerGame(),
        testResult.getThreePointersPerGame());
    org.junit.Assert.assertEquals(
        "expect equals threePointersAttemptedPerGame ",
        records[0].getThreePointersAttemptedPerGame(),
        testResult.getThreePointersAttemptedPerGame());
    org.junit.Assert.assertEquals(
        "expect equals freeThrowsMade ",
        records[0].getFreeThrowsMade(),
        testResult.getFreeThrowsMade());
    org.junit.Assert.assertEquals(
        "expect equals freeThrowsAttempted ",
        records[0].getFreeThrowsAttempted(),
        testResult.getFreeThrowsAttempted());
    org.junit.Assert.assertEquals(
        "expect equals freeThrowsPercentage ",
        records[0].getFreeThrowsPercentage(),
        testResult.getFreeThrowsPercentage());
    org.junit.Assert.assertEquals(
        "expect equals freeThrowsPerGame ",
        records[0].getFreeThrowsPerGame(),
        testResult.getFreeThrowsPerGame());
    org.junit.Assert.assertEquals(
        "expect equals freeThrowsAttemptedPerGame ",
        records[0].getFreeThrowsAttemptedPerGame(),
        testResult.getFreeThrowsAttemptedPerGame());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredTotal ",
        records[0].getPointsScoredTotal(),
        testResult.getPointsScoredTotal());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredPerGame ",
        records[0].getPointsScoredPerGame(),
        testResult.getPointsScoredPerGame());
    org.junit.Assert.assertEquals(
        "expect equals assistsTotal ", records[0].getAssistsTotal(), testResult.getAssistsTotal());
    org.junit.Assert.assertEquals(
        "expect equals assistsPerGame ",
        records[0].getAssistsPerGame(),
        testResult.getAssistsPerGame());
    org.junit.Assert.assertEquals(
        "expect equals turnoversTotal ",
        records[0].getTurnoversTotal(),
        testResult.getTurnoversTotal());
    org.junit.Assert.assertEquals(
        "expect equals turnoversPerGame ",
        records[0].getTurnoversPerGame(),
        testResult.getTurnoversPerGame());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredOffTurnovers ",
        records[0].getPointsScoredOffTurnovers(),
        testResult.getPointsScoredOffTurnovers());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredInPaint ",
        records[0].getPointsScoredInPaint(),
        testResult.getPointsScoredInPaint());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredOnSecondChance ",
        records[0].getPointsScoredOnSecondChance(),
        testResult.getPointsScoredOnSecondChance());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredOnFastBreak ",
        records[0].getPointsScoredOnFastBreak(),
        testResult.getPointsScoredOnFastBreak());
  }
}
