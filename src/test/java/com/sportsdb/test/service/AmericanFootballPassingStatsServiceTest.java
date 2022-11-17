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

import com.sportsdb.test.entity.AmericanFootballPassingStats;

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

public class AmericanFootballPassingStatsServiceTest {
  private static DefaultAmericanFootballPassingStatsService serviceMock;
  private static AmericanFootballPassingStats[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultAmericanFootballPassingStatsService.class);
    String inputFile = "AmericanFootballPassingStats.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, AmericanFootballPassingStats[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    AmericanFootballPassingStats testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals passesAttempts ",
        records[0].getPassesAttempts(),
        testResult.getPassesAttempts());
    org.junit.Assert.assertEquals(
        "expect equals passesCompletions ",
        records[0].getPassesCompletions(),
        testResult.getPassesCompletions());
    org.junit.Assert.assertEquals(
        "expect equals passesPercentage ",
        records[0].getPassesPercentage(),
        testResult.getPassesPercentage());
    org.junit.Assert.assertEquals(
        "expect equals passesYardsGross ",
        records[0].getPassesYardsGross(),
        testResult.getPassesYardsGross());
    org.junit.Assert.assertEquals(
        "expect equals passesYardsNet ",
        records[0].getPassesYardsNet(),
        testResult.getPassesYardsNet());
    org.junit.Assert.assertEquals(
        "expect equals passesYardsLost ",
        records[0].getPassesYardsLost(),
        testResult.getPassesYardsLost());
    org.junit.Assert.assertEquals(
        "expect equals passesTouchdowns ",
        records[0].getPassesTouchdowns(),
        testResult.getPassesTouchdowns());
    org.junit.Assert.assertEquals(
        "expect equals passesTouchdownsPercentage ",
        records[0].getPassesTouchdownsPercentage(),
        testResult.getPassesTouchdownsPercentage());
    org.junit.Assert.assertEquals(
        "expect equals passesInterceptions ",
        records[0].getPassesInterceptions(),
        testResult.getPassesInterceptions());
    org.junit.Assert.assertEquals(
        "expect equals passesInterceptionsPercentage ",
        records[0].getPassesInterceptionsPercentage(),
        testResult.getPassesInterceptionsPercentage());
    org.junit.Assert.assertEquals(
        "expect equals passesLongest ",
        records[0].getPassesLongest(),
        testResult.getPassesLongest());
    org.junit.Assert.assertEquals(
        "expect equals passesAverageYardsPer ",
        records[0].getPassesAverageYardsPer(),
        testResult.getPassesAverageYardsPer());
    org.junit.Assert.assertEquals(
        "expect equals passerRating ", records[0].getPasserRating(), testResult.getPasserRating());
    org.junit.Assert.assertEquals(
        "expect equals receptionsTotal ",
        records[0].getReceptionsTotal(),
        testResult.getReceptionsTotal());
    org.junit.Assert.assertEquals(
        "expect equals receptionsYards ",
        records[0].getReceptionsYards(),
        testResult.getReceptionsYards());
    org.junit.Assert.assertEquals(
        "expect equals receptionsTouchdowns ",
        records[0].getReceptionsTouchdowns(),
        testResult.getReceptionsTouchdowns());
    org.junit.Assert.assertEquals(
        "expect equals receptionsFirstDown ",
        records[0].getReceptionsFirstDown(),
        testResult.getReceptionsFirstDown());
    org.junit.Assert.assertEquals(
        "expect equals receptionsLongest ",
        records[0].getReceptionsLongest(),
        testResult.getReceptionsLongest());
    org.junit.Assert.assertEquals(
        "expect equals receptionsAverageYardsPer ",
        records[0].getReceptionsAverageYardsPer(),
        testResult.getReceptionsAverageYardsPer());
  }
}
