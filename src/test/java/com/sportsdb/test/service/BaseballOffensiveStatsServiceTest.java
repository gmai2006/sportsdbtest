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

import com.sportsdb.test.entity.BaseballOffensiveStats;

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

public class BaseballOffensiveStatsServiceTest {
  private static DefaultBaseballOffensiveStatsService serviceMock;
  private static BaseballOffensiveStats[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultBaseballOffensiveStatsService.class);
    String inputFile = "BaseballOffensiveStats.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, BaseballOffensiveStats[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    BaseballOffensiveStats testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals average ", records[0].getAverage() == testResult.getAverage());
    org.junit.Assert.assertTrue(
        "expect equals runsScored ", records[0].getRunsScored() == testResult.getRunsScored());
    org.junit.Assert.assertTrue(
        "expect equals atBats ", records[0].getAtBats() == testResult.getAtBats());
    org.junit.Assert.assertTrue(
        "expect equals hits ", records[0].getHits() == testResult.getHits());
    org.junit.Assert.assertTrue("expect equals rbi ", records[0].getRbi() == testResult.getRbi());
    org.junit.Assert.assertTrue(
        "expect equals totalBases ", records[0].getTotalBases() == testResult.getTotalBases());
    org.junit.Assert.assertTrue(
        "expect equals sluggingPercentage ",
        records[0].getSluggingPercentage() == testResult.getSluggingPercentage());
    org.junit.Assert.assertTrue(
        "expect equals basesOnBalls ",
        records[0].getBasesOnBalls() == testResult.getBasesOnBalls());
    org.junit.Assert.assertTrue(
        "expect equals strikeouts ", records[0].getStrikeouts() == testResult.getStrikeouts());
    org.junit.Assert.assertTrue(
        "expect equals leftOnBase ", records[0].getLeftOnBase() == testResult.getLeftOnBase());
    org.junit.Assert.assertTrue(
        "expect equals leftInScoringPosition ",
        records[0].getLeftInScoringPosition() == testResult.getLeftInScoringPosition());
    org.junit.Assert.assertTrue(
        "expect equals singles ", records[0].getSingles() == testResult.getSingles());
    org.junit.Assert.assertTrue(
        "expect equals doubles ", records[0].getDoubles() == testResult.getDoubles());
    org.junit.Assert.assertTrue(
        "expect equals triples ", records[0].getTriples() == testResult.getTriples());
    org.junit.Assert.assertTrue(
        "expect equals homeRuns ", records[0].getHomeRuns() == testResult.getHomeRuns());
    org.junit.Assert.assertTrue(
        "expect equals grandSlams ", records[0].getGrandSlams() == testResult.getGrandSlams());
    org.junit.Assert.assertTrue(
        "expect equals atBatsPerRbi ",
        records[0].getAtBatsPerRbi() == testResult.getAtBatsPerRbi());
    org.junit.Assert.assertTrue(
        "expect equals plateAppearancesPerRbi ",
        records[0].getPlateAppearancesPerRbi() == testResult.getPlateAppearancesPerRbi());
    org.junit.Assert.assertTrue(
        "expect equals atBatsPerHomeRun ",
        records[0].getAtBatsPerHomeRun() == testResult.getAtBatsPerHomeRun());
    org.junit.Assert.assertTrue(
        "expect equals plateAppearancesPerHomeRun ",
        records[0].getPlateAppearancesPerHomeRun() == testResult.getPlateAppearancesPerHomeRun());
    org.junit.Assert.assertTrue(
        "expect equals sacFlies ", records[0].getSacFlies() == testResult.getSacFlies());
    org.junit.Assert.assertTrue(
        "expect equals sacBunts ", records[0].getSacBunts() == testResult.getSacBunts());
    org.junit.Assert.assertTrue(
        "expect equals groundedIntoDoublePlay ",
        records[0].getGroundedIntoDoublePlay() == testResult.getGroundedIntoDoublePlay());
    org.junit.Assert.assertTrue(
        "expect equals movedUp ", records[0].getMovedUp() == testResult.getMovedUp());
    org.junit.Assert.assertTrue(
        "expect equals onBasePercentage ",
        records[0].getOnBasePercentage() == testResult.getOnBasePercentage());
    org.junit.Assert.assertTrue(
        "expect equals stolenBases ", records[0].getStolenBases() == testResult.getStolenBases());
    org.junit.Assert.assertTrue(
        "expect equals stolenBasesCaught ",
        records[0].getStolenBasesCaught() == testResult.getStolenBasesCaught());
    org.junit.Assert.assertTrue(
        "expect equals stolenBasesAverage ",
        records[0].getStolenBasesAverage() == testResult.getStolenBasesAverage());
    org.junit.Assert.assertTrue(
        "expect equals hitByPitch ", records[0].getHitByPitch() == testResult.getHitByPitch());
    org.junit.Assert.assertTrue(
        "expect equals defensiveInterferanceReaches ",
        records[0].getDefensiveInterferanceReaches()
            == testResult.getDefensiveInterferanceReaches());
    org.junit.Assert.assertTrue(
        "expect equals onBasePlusSlugging ",
        records[0].getOnBasePlusSlugging() == testResult.getOnBasePlusSlugging());
    org.junit.Assert.assertTrue(
        "expect equals plateAppearances ",
        records[0].getPlateAppearances() == testResult.getPlateAppearances());
    org.junit.Assert.assertTrue(
        "expect equals hitsExtraBase ",
        records[0].getHitsExtraBase() == testResult.getHitsExtraBase());
  }
}
