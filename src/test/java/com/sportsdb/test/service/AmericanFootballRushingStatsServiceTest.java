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

import com.sportsdb.test.entity.AmericanFootballRushingStats;

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

public class AmericanFootballRushingStatsServiceTest {
  private static DefaultAmericanFootballRushingStatsService serviceMock;
  private static AmericanFootballRushingStats[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultAmericanFootballRushingStatsService.class);
    String inputFile = "AmericanFootballRushingStats.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, AmericanFootballRushingStats[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    AmericanFootballRushingStats testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals rushesAttempts ",
        records[0].getRushesAttempts(),
        testResult.getRushesAttempts());
    org.junit.Assert.assertEquals(
        "expect equals rushesYards ", records[0].getRushesYards(), testResult.getRushesYards());
    org.junit.Assert.assertEquals(
        "expect equals rushesTouchdowns ",
        records[0].getRushesTouchdowns(),
        testResult.getRushesTouchdowns());
    org.junit.Assert.assertEquals(
        "expect equals rushingAverageYardsPer ",
        records[0].getRushingAverageYardsPer(),
        testResult.getRushingAverageYardsPer());
    org.junit.Assert.assertEquals(
        "expect equals rushesFirstDown ",
        records[0].getRushesFirstDown(),
        testResult.getRushesFirstDown());
    org.junit.Assert.assertEquals(
        "expect equals rushesLongest ",
        records[0].getRushesLongest(),
        testResult.getRushesLongest());
  }
}
