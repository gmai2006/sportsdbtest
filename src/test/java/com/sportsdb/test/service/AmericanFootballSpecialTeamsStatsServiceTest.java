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

import com.sportsdb.test.entity.AmericanFootballSpecialTeamsStats;

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

public class AmericanFootballSpecialTeamsStatsServiceTest {
  private static DefaultAmericanFootballSpecialTeamsStatsService serviceMock;
  private static AmericanFootballSpecialTeamsStats[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultAmericanFootballSpecialTeamsStatsService.class);
    String inputFile = "AmericanFootballSpecialTeamsStats.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, AmericanFootballSpecialTeamsStats[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    AmericanFootballSpecialTeamsStats testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals returnsPuntTotal ",
        records[0].getReturnsPuntTotal(),
        testResult.getReturnsPuntTotal());
    org.junit.Assert.assertEquals(
        "expect equals returnsPuntYards ",
        records[0].getReturnsPuntYards(),
        testResult.getReturnsPuntYards());
    org.junit.Assert.assertEquals(
        "expect equals returnsPuntAverage ",
        records[0].getReturnsPuntAverage(),
        testResult.getReturnsPuntAverage());
    org.junit.Assert.assertEquals(
        "expect equals returnsPuntLongest ",
        records[0].getReturnsPuntLongest(),
        testResult.getReturnsPuntLongest());
    org.junit.Assert.assertEquals(
        "expect equals returnsPuntTouchdown ",
        records[0].getReturnsPuntTouchdown(),
        testResult.getReturnsPuntTouchdown());
    org.junit.Assert.assertEquals(
        "expect equals returnsKickoffTotal ",
        records[0].getReturnsKickoffTotal(),
        testResult.getReturnsKickoffTotal());
    org.junit.Assert.assertEquals(
        "expect equals returnsKickoffYards ",
        records[0].getReturnsKickoffYards(),
        testResult.getReturnsKickoffYards());
    org.junit.Assert.assertEquals(
        "expect equals returnsKickoffAverage ",
        records[0].getReturnsKickoffAverage(),
        testResult.getReturnsKickoffAverage());
    org.junit.Assert.assertEquals(
        "expect equals returnsKickoffLongest ",
        records[0].getReturnsKickoffLongest(),
        testResult.getReturnsKickoffLongest());
    org.junit.Assert.assertEquals(
        "expect equals returnsKickoffTouchdown ",
        records[0].getReturnsKickoffTouchdown(),
        testResult.getReturnsKickoffTouchdown());
    org.junit.Assert.assertEquals(
        "expect equals returnsTotal ", records[0].getReturnsTotal(), testResult.getReturnsTotal());
    org.junit.Assert.assertEquals(
        "expect equals returnsYards ", records[0].getReturnsYards(), testResult.getReturnsYards());
    org.junit.Assert.assertEquals(
        "expect equals puntsTotal ", records[0].getPuntsTotal(), testResult.getPuntsTotal());
    org.junit.Assert.assertEquals(
        "expect equals puntsYardsGross ",
        records[0].getPuntsYardsGross(),
        testResult.getPuntsYardsGross());
    org.junit.Assert.assertEquals(
        "expect equals puntsYardsNet ",
        records[0].getPuntsYardsNet(),
        testResult.getPuntsYardsNet());
    org.junit.Assert.assertEquals(
        "expect equals puntsLongest ", records[0].getPuntsLongest(), testResult.getPuntsLongest());
    org.junit.Assert.assertEquals(
        "expect equals puntsInside20 ",
        records[0].getPuntsInside20(),
        testResult.getPuntsInside20());
    org.junit.Assert.assertEquals(
        "expect equals puntsInside20Percentage ",
        records[0].getPuntsInside20Percentage(),
        testResult.getPuntsInside20Percentage());
    org.junit.Assert.assertEquals(
        "expect equals puntsAverage ", records[0].getPuntsAverage(), testResult.getPuntsAverage());
    org.junit.Assert.assertEquals(
        "expect equals puntsBlocked ", records[0].getPuntsBlocked(), testResult.getPuntsBlocked());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksTotal ",
        records[0].getTouchbacksTotal(),
        testResult.getTouchbacksTotal());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksTotalPercentage ",
        records[0].getTouchbacksTotalPercentage(),
        testResult.getTouchbacksTotalPercentage());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksKickoffs ",
        records[0].getTouchbacksKickoffs(),
        testResult.getTouchbacksKickoffs());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksKickoffsPercentage ",
        records[0].getTouchbacksKickoffsPercentage(),
        testResult.getTouchbacksKickoffsPercentage());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksPunts ",
        records[0].getTouchbacksPunts(),
        testResult.getTouchbacksPunts());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksPuntsPercentage ",
        records[0].getTouchbacksPuntsPercentage(),
        testResult.getTouchbacksPuntsPercentage());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksInterceptions ",
        records[0].getTouchbacksInterceptions(),
        testResult.getTouchbacksInterceptions());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksInterceptionsPercentage ",
        records[0].getTouchbacksInterceptionsPercentage(),
        testResult.getTouchbacksInterceptionsPercentage());
    org.junit.Assert.assertEquals(
        "expect equals fairCatches ", records[0].getFairCatches(), testResult.getFairCatches());
  }
}
