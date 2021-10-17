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
import com.sportsdb.test.entity.TennisReturnStats;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class TennisReturnStatsServiceTest {
    private static DefaultTennisReturnStatsService serviceMock;
    private static TennisReturnStats[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultTennisReturnStatsService.class);
        String inputFile = "TennisReturnStats.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, TennisReturnStats[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        TennisReturnStats testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals returnsPlayed ",
                records[0].getReturnsPlayed(),
                testResult.getReturnsPlayed());
        org.junit.Assert.assertEquals(
                "expect equals matchesPlayed ",
                records[0].getMatchesPlayed(),
                testResult.getMatchesPlayed());
        org.junit.Assert.assertEquals(
                "expect equals firstServiceReturnPointsWon ",
                records[0].getFirstServiceReturnPointsWon(),
                testResult.getFirstServiceReturnPointsWon());
        org.junit.Assert.assertEquals(
                "expect equals firstServiceReturnPointsWonPct ",
                records[0].getFirstServiceReturnPointsWonPct(),
                testResult.getFirstServiceReturnPointsWonPct());
        org.junit.Assert.assertEquals(
                "expect equals secondServiceReturnPointsWon ",
                records[0].getSecondServiceReturnPointsWon(),
                testResult.getSecondServiceReturnPointsWon());
        org.junit.Assert.assertEquals(
                "expect equals secondServiceReturnPointsWonPct ",
                records[0].getSecondServiceReturnPointsWonPct(),
                testResult.getSecondServiceReturnPointsWonPct());
        org.junit.Assert.assertEquals(
                "expect equals returnGamesPlayed ",
                records[0].getReturnGamesPlayed(),
                testResult.getReturnGamesPlayed());
        org.junit.Assert.assertEquals(
                "expect equals returnGamesWon ",
                records[0].getReturnGamesWon(),
                testResult.getReturnGamesWon());
        org.junit.Assert.assertEquals(
                "expect equals returnGamesWonPct ",
                records[0].getReturnGamesWonPct(),
                testResult.getReturnGamesWonPct());
        org.junit.Assert.assertEquals(
                "expect equals breakPointsPlayed ",
                records[0].getBreakPointsPlayed(),
                testResult.getBreakPointsPlayed());
        org.junit.Assert.assertEquals(
                "expect equals breakPointsConverted ",
                records[0].getBreakPointsConverted(),
                testResult.getBreakPointsConverted());
        org.junit.Assert.assertEquals(
                "expect equals breakPointsConvertedPct ",
                records[0].getBreakPointsConvertedPct(),
                testResult.getBreakPointsConvertedPct());
    }
}
