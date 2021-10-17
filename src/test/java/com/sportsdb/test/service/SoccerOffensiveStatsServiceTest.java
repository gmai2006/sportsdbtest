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
import com.sportsdb.test.entity.SoccerOffensiveStats;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class SoccerOffensiveStatsServiceTest {
    private static DefaultSoccerOffensiveStatsService serviceMock;
    private static SoccerOffensiveStats[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultSoccerOffensiveStatsService.class);
        String inputFile = "SoccerOffensiveStats.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, SoccerOffensiveStats[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        SoccerOffensiveStats testResult = serviceMock.find(records[0].getId());

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
                "expect equals goalsOvertime ",
                records[0].getGoalsOvertime(),
                testResult.getGoalsOvertime());
        org.junit.Assert.assertEquals(
                "expect equals goalsShootout ",
                records[0].getGoalsShootout(),
                testResult.getGoalsShootout());
        org.junit.Assert.assertEquals(
                "expect equals goalsTotal ",
                records[0].getGoalsTotal(),
                testResult.getGoalsTotal());
        org.junit.Assert.assertEquals(
                "expect equals assistsGameWinning ",
                records[0].getAssistsGameWinning(),
                testResult.getAssistsGameWinning());
        org.junit.Assert.assertEquals(
                "expect equals assistsGameTying ",
                records[0].getAssistsGameTying(),
                testResult.getAssistsGameTying());
        org.junit.Assert.assertEquals(
                "expect equals assistsOvertime ",
                records[0].getAssistsOvertime(),
                testResult.getAssistsOvertime());
        org.junit.Assert.assertEquals(
                "expect equals assistsTotal ",
                records[0].getAssistsTotal(),
                testResult.getAssistsTotal());
        org.junit.Assert.assertEquals(
                "expect equals points ", records[0].getPoints(), testResult.getPoints());
        org.junit.Assert.assertEquals(
                "expect equals shotsTotal ",
                records[0].getShotsTotal(),
                testResult.getShotsTotal());
        org.junit.Assert.assertEquals(
                "expect equals shotsOnGoalTotal ",
                records[0].getShotsOnGoalTotal(),
                testResult.getShotsOnGoalTotal());
        org.junit.Assert.assertEquals(
                "expect equals shotsHitFrame ",
                records[0].getShotsHitFrame(),
                testResult.getShotsHitFrame());
        org.junit.Assert.assertEquals(
                "expect equals shotsPenaltyShotTaken ",
                records[0].getShotsPenaltyShotTaken(),
                testResult.getShotsPenaltyShotTaken());
        org.junit.Assert.assertEquals(
                "expect equals shotsPenaltyShotScored ",
                records[0].getShotsPenaltyShotScored(),
                testResult.getShotsPenaltyShotScored());
        org.junit.Assert.assertEquals(
                "expect equals shotsPenaltyShotMissed ",
                records[0].getShotsPenaltyShotMissed(),
                testResult.getShotsPenaltyShotMissed());
        org.junit.Assert.assertEquals(
                "expect equals shotsPenaltyShotPercentage ",
                records[0].getShotsPenaltyShotPercentage(),
                testResult.getShotsPenaltyShotPercentage());
        org.junit.Assert.assertEquals(
                "expect equals shotsShootoutTaken ",
                records[0].getShotsShootoutTaken(),
                testResult.getShotsShootoutTaken());
        org.junit.Assert.assertEquals(
                "expect equals shotsShootoutScored ",
                records[0].getShotsShootoutScored(),
                testResult.getShotsShootoutScored());
        org.junit.Assert.assertEquals(
                "expect equals shotsShootoutMissed ",
                records[0].getShotsShootoutMissed(),
                testResult.getShotsShootoutMissed());
        org.junit.Assert.assertEquals(
                "expect equals shotsShootoutPercentage ",
                records[0].getShotsShootoutPercentage(),
                testResult.getShotsShootoutPercentage());
        org.junit.Assert.assertEquals(
                "expect equals giveaways ", records[0].getGiveaways(), testResult.getGiveaways());
        org.junit.Assert.assertEquals(
                "expect equals offsides ", records[0].getOffsides(), testResult.getOffsides());
        org.junit.Assert.assertEquals(
                "expect equals cornerKicks ",
                records[0].getCornerKicks(),
                testResult.getCornerKicks());
        org.junit.Assert.assertEquals(
                "expect equals hatTricks ", records[0].getHatTricks(), testResult.getHatTricks());
    }
}
