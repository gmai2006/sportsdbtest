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
import com.sportsdb.test.entity.MotorRacingRaceStats;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class MotorRacingRaceStatsServiceTest {
    private static DefaultMotorRacingRaceStatsService serviceMock;
    private static MotorRacingRaceStats[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultMotorRacingRaceStatsService.class);
        String inputFile = "MotorRacingRaceStats.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, MotorRacingRaceStats[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        MotorRacingRaceStats testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals timeBehindLeader ",
                records[0].getTimeBehindLeader(),
                testResult.getTimeBehindLeader());
        org.junit.Assert.assertEquals(
                "expect equals lapsBehindLeader ",
                records[0].getLapsBehindLeader(),
                testResult.getLapsBehindLeader());
        org.junit.Assert.assertEquals(
                "expect equals timeAheadFollower ",
                records[0].getTimeAheadFollower(),
                testResult.getTimeAheadFollower());
        org.junit.Assert.assertEquals(
                "expect equals lapsAheadFollower ",
                records[0].getLapsAheadFollower(),
                testResult.getLapsAheadFollower());
        org.junit.Assert.assertEquals(
                "expect equals time ", records[0].getTime(), testResult.getTime());
        org.junit.Assert.assertEquals(
                "expect equals points ", records[0].getPoints(), testResult.getPoints());
        org.junit.Assert.assertEquals(
                "expect equals pointsRookie ",
                records[0].getPointsRookie(),
                testResult.getPointsRookie());
        org.junit.Assert.assertEquals(
                "expect equals bonus ", records[0].getBonus(), testResult.getBonus());
        org.junit.Assert.assertEquals(
                "expect equals lapsCompleted ",
                records[0].getLapsCompleted(),
                testResult.getLapsCompleted());
        org.junit.Assert.assertEquals(
                "expect equals lapsLeadingTotal ",
                records[0].getLapsLeadingTotal(),
                testResult.getLapsLeadingTotal());
        org.junit.Assert.assertEquals(
                "expect equals distanceLeading ",
                records[0].getDistanceLeading(),
                testResult.getDistanceLeading());
        org.junit.Assert.assertEquals(
                "expect equals distanceCompleted ",
                records[0].getDistanceCompleted(),
                testResult.getDistanceCompleted());
        org.junit.Assert.assertEquals(
                "expect equals distanceUnits ",
                records[0].getDistanceUnits(),
                testResult.getDistanceUnits());
        org.junit.Assert.assertEquals(
                "expect equals speedAverage ",
                records[0].getSpeedAverage(),
                testResult.getSpeedAverage());
        org.junit.Assert.assertEquals(
                "expect equals speedUnits ",
                records[0].getSpeedUnits(),
                testResult.getSpeedUnits());
        org.junit.Assert.assertEquals(
                "expect equals status ", records[0].getStatus(), testResult.getStatus());
        org.junit.Assert.assertEquals(
                "expect equals finishesTop5 ",
                records[0].getFinishesTop5(),
                testResult.getFinishesTop5());
        org.junit.Assert.assertEquals(
                "expect equals finishesTop10 ",
                records[0].getFinishesTop10(),
                testResult.getFinishesTop10());
        org.junit.Assert.assertEquals(
                "expect equals starts ", records[0].getStarts(), testResult.getStarts());
        org.junit.Assert.assertEquals(
                "expect equals finishes ", records[0].getFinishes(), testResult.getFinishes());
        org.junit.Assert.assertEquals(
                "expect equals nonFinishes ",
                records[0].getNonFinishes(),
                testResult.getNonFinishes());
        org.junit.Assert.assertEquals(
                "expect equals wins ", records[0].getWins(), testResult.getWins());
        org.junit.Assert.assertEquals(
                "expect equals racesLeading ",
                records[0].getRacesLeading(),
                testResult.getRacesLeading());
        org.junit.Assert.assertEquals(
                "expect equals money ", records[0].getMoney(), testResult.getMoney());
        org.junit.Assert.assertEquals(
                "expect equals moneyUnits ",
                records[0].getMoneyUnits(),
                testResult.getMoneyUnits());
        org.junit.Assert.assertEquals(
                "expect equals leadsTotal ",
                records[0].getLeadsTotal(),
                testResult.getLeadsTotal());
    }
}
