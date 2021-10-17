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
import com.sportsdb.test.entity.TennisServiceStats;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class TennisServiceStatsServiceTest {
    private static DefaultTennisServiceStatsService serviceMock;
    private static TennisServiceStats[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultTennisServiceStatsService.class);
        String inputFile = "TennisServiceStats.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, TennisServiceStats[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        TennisServiceStats testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals servicesPlayed ",
                records[0].getServicesPlayed(),
                testResult.getServicesPlayed());
        org.junit.Assert.assertEquals(
                "expect equals matchesPlayed ",
                records[0].getMatchesPlayed(),
                testResult.getMatchesPlayed());
        org.junit.Assert.assertEquals(
                "expect equals aces ", records[0].getAces(), testResult.getAces());
        org.junit.Assert.assertEquals(
                "expect equals firstServicesGood ",
                records[0].getFirstServicesGood(),
                testResult.getFirstServicesGood());
        org.junit.Assert.assertEquals(
                "expect equals firstServicesGoodPct ",
                records[0].getFirstServicesGoodPct(),
                testResult.getFirstServicesGoodPct());
        org.junit.Assert.assertEquals(
                "expect equals firstServicePointsWon ",
                records[0].getFirstServicePointsWon(),
                testResult.getFirstServicePointsWon());
        org.junit.Assert.assertEquals(
                "expect equals firstServicePointsWonPct ",
                records[0].getFirstServicePointsWonPct(),
                testResult.getFirstServicePointsWonPct());
        org.junit.Assert.assertEquals(
                "expect equals secondServicePointsWon ",
                records[0].getSecondServicePointsWon(),
                testResult.getSecondServicePointsWon());
        org.junit.Assert.assertEquals(
                "expect equals secondServicePointsWonPct ",
                records[0].getSecondServicePointsWonPct(),
                testResult.getSecondServicePointsWonPct());
        org.junit.Assert.assertEquals(
                "expect equals serviceGamesPlayed ",
                records[0].getServiceGamesPlayed(),
                testResult.getServiceGamesPlayed());
        org.junit.Assert.assertEquals(
                "expect equals serviceGamesWon ",
                records[0].getServiceGamesWon(),
                testResult.getServiceGamesWon());
        org.junit.Assert.assertEquals(
                "expect equals serviceGamesWonPct ",
                records[0].getServiceGamesWonPct(),
                testResult.getServiceGamesWonPct());
        org.junit.Assert.assertEquals(
                "expect equals breakPointsPlayed ",
                records[0].getBreakPointsPlayed(),
                testResult.getBreakPointsPlayed());
        org.junit.Assert.assertEquals(
                "expect equals breakPointsSaved ",
                records[0].getBreakPointsSaved(),
                testResult.getBreakPointsSaved());
        org.junit.Assert.assertEquals(
                "expect equals breakPointsSavedPct ",
                records[0].getBreakPointsSavedPct(),
                testResult.getBreakPointsSavedPct());
    }
}
