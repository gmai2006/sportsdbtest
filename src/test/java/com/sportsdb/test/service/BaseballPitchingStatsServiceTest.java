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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sportsdb.test.entity.BaseballPitchingStats;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseballPitchingStatsServiceTest {
    private static DefaultBaseballPitchingStatsService serviceMock;
    private static BaseballPitchingStats[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultBaseballPitchingStatsService.class);
        String inputFile = "BaseballPitchingStats.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, BaseballPitchingStats[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        BaseballPitchingStats testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals runsAllowed ",
                records[0].getRunsAllowed() == testResult.getRunsAllowed());
        org.junit.Assert.assertTrue(
                "expect equals singlesAllowed ",
                records[0].getSinglesAllowed() == testResult.getSinglesAllowed());
        org.junit.Assert.assertTrue(
                "expect equals doublesAllowed ",
                records[0].getDoublesAllowed() == testResult.getDoublesAllowed());
        org.junit.Assert.assertTrue(
                "expect equals triplesAllowed ",
                records[0].getTriplesAllowed() == testResult.getTriplesAllowed());
        org.junit.Assert.assertTrue(
                "expect equals homeRunsAllowed ",
                records[0].getHomeRunsAllowed() == testResult.getHomeRunsAllowed());
        org.junit.Assert.assertEquals(
                "expect equals inningsPitched ",
                records[0].getInningsPitched(),
                testResult.getInningsPitched());
        org.junit.Assert.assertTrue(
                "expect equals hits ", records[0].getHits() == testResult.getHits());
        org.junit.Assert.assertTrue(
                "expect equals earnedRuns ",
                records[0].getEarnedRuns() == testResult.getEarnedRuns());
        org.junit.Assert.assertTrue(
                "expect equals unearnedRuns ",
                records[0].getUnearnedRuns() == testResult.getUnearnedRuns());
        org.junit.Assert.assertTrue(
                "expect equals basesOnBalls ",
                records[0].getBasesOnBalls() == testResult.getBasesOnBalls());
        org.junit.Assert.assertTrue(
                "expect equals basesOnBallsIntentional ",
                records[0].getBasesOnBallsIntentional() == testResult.getBasesOnBallsIntentional());
        org.junit.Assert.assertTrue(
                "expect equals strikeouts ",
                records[0].getStrikeouts() == testResult.getStrikeouts());
        org.junit.Assert.assertTrue(
                "expect equals strikeoutToBbRatio ",
                records[0].getStrikeoutToBbRatio() == testResult.getStrikeoutToBbRatio());
        org.junit.Assert.assertTrue(
                "expect equals numberOfPitches ",
                records[0].getNumberOfPitches() == testResult.getNumberOfPitches());
        org.junit.Assert.assertTrue(
                "expect equals era ", records[0].getEra() == testResult.getEra());
        org.junit.Assert.assertTrue(
                "expect equals inheritedRunnersScored ",
                records[0].getInheritedRunnersScored() == testResult.getInheritedRunnersScored());
        org.junit.Assert.assertTrue(
                "expect equals pickOffs ", records[0].getPickOffs() == testResult.getPickOffs());
        org.junit.Assert.assertTrue(
                "expect equals errorsHitWithPitch ",
                records[0].getErrorsHitWithPitch() == testResult.getErrorsHitWithPitch());
        org.junit.Assert.assertTrue(
                "expect equals errorsWildPitch ",
                records[0].getErrorsWildPitch() == testResult.getErrorsWildPitch());
        org.junit.Assert.assertTrue(
                "expect equals balks ", records[0].getBalks() == testResult.getBalks());
        org.junit.Assert.assertTrue(
                "expect equals wins ", records[0].getWins() == testResult.getWins());
        org.junit.Assert.assertTrue(
                "expect equals losses ", records[0].getLosses() == testResult.getLosses());
        org.junit.Assert.assertTrue(
                "expect equals saves ", records[0].getSaves() == testResult.getSaves());
        org.junit.Assert.assertTrue(
                "expect equals shutouts ", records[0].getShutouts() == testResult.getShutouts());
        org.junit.Assert.assertTrue(
                "expect equals gamesComplete ",
                records[0].getGamesComplete() == testResult.getGamesComplete());
        org.junit.Assert.assertTrue(
                "expect equals gamesFinished ",
                records[0].getGamesFinished() == testResult.getGamesFinished());
        org.junit.Assert.assertTrue(
                "expect equals winningPercentage ",
                records[0].getWinningPercentage() == testResult.getWinningPercentage());
        org.junit.Assert.assertEquals(
                "expect equals eventCredit ",
                records[0].getEventCredit(),
                testResult.getEventCredit());
        org.junit.Assert.assertEquals(
                "expect equals saveCredit ",
                records[0].getSaveCredit(),
                testResult.getSaveCredit());
    }
}
