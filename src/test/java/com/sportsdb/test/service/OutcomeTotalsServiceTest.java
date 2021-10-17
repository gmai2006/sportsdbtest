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
import com.sportsdb.test.entity.OutcomeTotals;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OutcomeTotalsServiceTest {
    private static DefaultOutcomeTotalsService serviceMock;
    private static OutcomeTotals[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOutcomeTotalsService.class);
        String inputFile = "OutcomeTotals.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OutcomeTotals[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OutcomeTotals testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals standingSubgroupId ",
                records[0].getStandingSubgroupId() == testResult.getStandingSubgroupId());
        org.junit.Assert.assertEquals(
                "expect equals outcomeHolderType ",
                records[0].getOutcomeHolderType(),
                testResult.getOutcomeHolderType());
        org.junit.Assert.assertTrue(
                "expect equals outcomeHolderId ",
                records[0].getOutcomeHolderId() == testResult.getOutcomeHolderId());
        org.junit.Assert.assertEquals(
                "expect equals rank ", records[0].getRank(), testResult.getRank());
        org.junit.Assert.assertEquals(
                "expect equals wins ", records[0].getWins(), testResult.getWins());
        org.junit.Assert.assertEquals(
                "expect equals losses ", records[0].getLosses(), testResult.getLosses());
        org.junit.Assert.assertEquals(
                "expect equals ties ", records[0].getTies(), testResult.getTies());
        org.junit.Assert.assertEquals(
                "expect equals undecideds ",
                records[0].getUndecideds(),
                testResult.getUndecideds());
        org.junit.Assert.assertEquals(
                "expect equals winningPercentage ",
                records[0].getWinningPercentage(),
                testResult.getWinningPercentage());
        org.junit.Assert.assertEquals(
                "expect equals pointsScoredFor ",
                records[0].getPointsScoredFor(),
                testResult.getPointsScoredFor());
        org.junit.Assert.assertEquals(
                "expect equals pointsScoredAgainst ",
                records[0].getPointsScoredAgainst(),
                testResult.getPointsScoredAgainst());
        org.junit.Assert.assertEquals(
                "expect equals pointsDifference ",
                records[0].getPointsDifference(),
                testResult.getPointsDifference());
        org.junit.Assert.assertEquals(
                "expect equals standingPoints ",
                records[0].getStandingPoints(),
                testResult.getStandingPoints());
        org.junit.Assert.assertEquals(
                "expect equals streakType ",
                records[0].getStreakType(),
                testResult.getStreakType());
        org.junit.Assert.assertEquals(
                "expect equals streakDuration ",
                records[0].getStreakDuration(),
                testResult.getStreakDuration());
        org.junit.Assert.assertEquals(
                "expect equals streakTotal ",
                records[0].getStreakTotal(),
                testResult.getStreakTotal());
    }
}
