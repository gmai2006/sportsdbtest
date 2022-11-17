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

import com.sportsdb.test.entity.IceHockeyOffensiveStats;

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

public class IceHockeyOffensiveStatsServiceTest {
  private static DefaultIceHockeyOffensiveStatsService serviceMock;
  private static IceHockeyOffensiveStats[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultIceHockeyOffensiveStatsService.class);
    String inputFile = "IceHockeyOffensiveStats.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, IceHockeyOffensiveStats[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    IceHockeyOffensiveStats testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals goalsGameWinning ",
        records[0].getGoalsGameWinning(),
        testResult.getGoalsGameWinning());
    org.junit.Assert.assertEquals(
        "expect equals goalsGameTying ",
        records[0].getGoalsGameTying(),
        testResult.getGoalsGameTying());
    org.junit.Assert.assertEquals(
        "expect equals goalsPowerPlay ",
        records[0].getGoalsPowerPlay(),
        testResult.getGoalsPowerPlay());
    org.junit.Assert.assertEquals(
        "expect equals goalsShortHanded ",
        records[0].getGoalsShortHanded(),
        testResult.getGoalsShortHanded());
    org.junit.Assert.assertEquals(
        "expect equals goalsEvenStrength ",
        records[0].getGoalsEvenStrength(),
        testResult.getGoalsEvenStrength());
    org.junit.Assert.assertEquals(
        "expect equals goalsEmptyNet ",
        records[0].getGoalsEmptyNet(),
        testResult.getGoalsEmptyNet());
    org.junit.Assert.assertEquals(
        "expect equals goalsOvertime ",
        records[0].getGoalsOvertime(),
        testResult.getGoalsOvertime());
    org.junit.Assert.assertEquals(
        "expect equals goalsShootout ",
        records[0].getGoalsShootout(),
        testResult.getGoalsShootout());
    org.junit.Assert.assertEquals(
        "expect equals goalsPenaltyShot ",
        records[0].getGoalsPenaltyShot(),
        testResult.getGoalsPenaltyShot());
    org.junit.Assert.assertEquals(
        "expect equals assists ", records[0].getAssists(), testResult.getAssists());
    org.junit.Assert.assertEquals(
        "expect equals points ", records[0].getPoints(), testResult.getPoints());
    org.junit.Assert.assertEquals(
        "expect equals powerPlayAmount ",
        records[0].getPowerPlayAmount(),
        testResult.getPowerPlayAmount());
    org.junit.Assert.assertEquals(
        "expect equals powerPlayPercentage ",
        records[0].getPowerPlayPercentage(),
        testResult.getPowerPlayPercentage());
    org.junit.Assert.assertEquals(
        "expect equals shotsPenaltyShotTaken ",
        records[0].getShotsPenaltyShotTaken(),
        testResult.getShotsPenaltyShotTaken());
    org.junit.Assert.assertEquals(
        "expect equals shotsPenaltyShotMissed ",
        records[0].getShotsPenaltyShotMissed(),
        testResult.getShotsPenaltyShotMissed());
    org.junit.Assert.assertEquals(
        "expect equals shotsPenaltyShotPercentage ",
        records[0].getShotsPenaltyShotPercentage(),
        testResult.getShotsPenaltyShotPercentage());
    org.junit.Assert.assertEquals(
        "expect equals giveaways ", records[0].getGiveaways(), testResult.getGiveaways());
    org.junit.Assert.assertEquals(
        "expect equals minutesPowerPlay ",
        records[0].getMinutesPowerPlay(),
        testResult.getMinutesPowerPlay());
    org.junit.Assert.assertEquals(
        "expect equals faceoffWins ", records[0].getFaceoffWins(), testResult.getFaceoffWins());
    org.junit.Assert.assertEquals(
        "expect equals faceoffLosses ",
        records[0].getFaceoffLosses(),
        testResult.getFaceoffLosses());
    org.junit.Assert.assertEquals(
        "expect equals faceoffWinPercentage ",
        records[0].getFaceoffWinPercentage(),
        testResult.getFaceoffWinPercentage());
    org.junit.Assert.assertEquals(
        "expect equals scoringChances ",
        records[0].getScoringChances(),
        testResult.getScoringChances());
  }
}
