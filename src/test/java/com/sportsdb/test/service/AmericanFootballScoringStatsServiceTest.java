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

import com.sportsdb.test.entity.AmericanFootballScoringStats;

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

public class AmericanFootballScoringStatsServiceTest {
  private static DefaultAmericanFootballScoringStatsService serviceMock;
  private static AmericanFootballScoringStats[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultAmericanFootballScoringStatsService.class);
    String inputFile = "AmericanFootballScoringStats.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, AmericanFootballScoringStats[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    AmericanFootballScoringStats testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals touchdownsTotal ",
        records[0].getTouchdownsTotal(),
        testResult.getTouchdownsTotal());
    org.junit.Assert.assertEquals(
        "expect equals touchdownsPassing ",
        records[0].getTouchdownsPassing(),
        testResult.getTouchdownsPassing());
    org.junit.Assert.assertEquals(
        "expect equals touchdownsRushing ",
        records[0].getTouchdownsRushing(),
        testResult.getTouchdownsRushing());
    org.junit.Assert.assertEquals(
        "expect equals touchdownsSpecialTeams ",
        records[0].getTouchdownsSpecialTeams(),
        testResult.getTouchdownsSpecialTeams());
    org.junit.Assert.assertEquals(
        "expect equals touchdownsDefensive ",
        records[0].getTouchdownsDefensive(),
        testResult.getTouchdownsDefensive());
    org.junit.Assert.assertEquals(
        "expect equals extraPointsAttempts ",
        records[0].getExtraPointsAttempts(),
        testResult.getExtraPointsAttempts());
    org.junit.Assert.assertEquals(
        "expect equals extraPointsMade ",
        records[0].getExtraPointsMade(),
        testResult.getExtraPointsMade());
    org.junit.Assert.assertEquals(
        "expect equals extraPointsMissed ",
        records[0].getExtraPointsMissed(),
        testResult.getExtraPointsMissed());
    org.junit.Assert.assertEquals(
        "expect equals extraPointsBlocked ",
        records[0].getExtraPointsBlocked(),
        testResult.getExtraPointsBlocked());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalAttempts ",
        records[0].getFieldGoalAttempts(),
        testResult.getFieldGoalAttempts());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsMade ",
        records[0].getFieldGoalsMade(),
        testResult.getFieldGoalsMade());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsMissed ",
        records[0].getFieldGoalsMissed(),
        testResult.getFieldGoalsMissed());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsBlocked ",
        records[0].getFieldGoalsBlocked(),
        testResult.getFieldGoalsBlocked());
    org.junit.Assert.assertEquals(
        "expect equals safetiesAgainst ",
        records[0].getSafetiesAgainst(),
        testResult.getSafetiesAgainst());
    org.junit.Assert.assertEquals(
        "expect equals twoPointConversionsAttempts ",
        records[0].getTwoPointConversionsAttempts(),
        testResult.getTwoPointConversionsAttempts());
    org.junit.Assert.assertEquals(
        "expect equals twoPointConversionsMade ",
        records[0].getTwoPointConversionsMade(),
        testResult.getTwoPointConversionsMade());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksTotal ",
        records[0].getTouchbacksTotal(),
        testResult.getTouchbacksTotal());
  }
}
