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

import com.sportsdb.test.entity.SoccerDefensiveStats;

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

public class SoccerDefensiveStatsServiceTest {
  private static DefaultSoccerDefensiveStatsService serviceMock;
  private static SoccerDefensiveStats[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultSoccerDefensiveStatsService.class);
    String inputFile = "SoccerDefensiveStats.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SoccerDefensiveStats[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    SoccerDefensiveStats testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals shotsPenaltyShotAllowed ",
        records[0].getShotsPenaltyShotAllowed(),
        testResult.getShotsPenaltyShotAllowed());
    org.junit.Assert.assertEquals(
        "expect equals goalsPenaltyShotAllowed ",
        records[0].getGoalsPenaltyShotAllowed(),
        testResult.getGoalsPenaltyShotAllowed());
    org.junit.Assert.assertEquals(
        "expect equals goalsAgainstAverage ",
        records[0].getGoalsAgainstAverage(),
        testResult.getGoalsAgainstAverage());
    org.junit.Assert.assertEquals(
        "expect equals goalsAgainstTotal ",
        records[0].getGoalsAgainstTotal(),
        testResult.getGoalsAgainstTotal());
    org.junit.Assert.assertEquals(
        "expect equals saves ", records[0].getSaves(), testResult.getSaves());
    org.junit.Assert.assertEquals(
        "expect equals savePercentage ",
        records[0].getSavePercentage(),
        testResult.getSavePercentage());
    org.junit.Assert.assertEquals(
        "expect equals catchesPunches ",
        records[0].getCatchesPunches(),
        testResult.getCatchesPunches());
    org.junit.Assert.assertEquals(
        "expect equals shotsOnGoalTotal ",
        records[0].getShotsOnGoalTotal(),
        testResult.getShotsOnGoalTotal());
    org.junit.Assert.assertEquals(
        "expect equals shotsShootoutTotal ",
        records[0].getShotsShootoutTotal(),
        testResult.getShotsShootoutTotal());
    org.junit.Assert.assertEquals(
        "expect equals shotsShootoutAllowed ",
        records[0].getShotsShootoutAllowed(),
        testResult.getShotsShootoutAllowed());
    org.junit.Assert.assertEquals(
        "expect equals shotsBlocked ", records[0].getShotsBlocked(), testResult.getShotsBlocked());
    org.junit.Assert.assertEquals(
        "expect equals shutouts ", records[0].getShutouts(), testResult.getShutouts());
  }
}
