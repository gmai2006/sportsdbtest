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
import com.sportsdb.test.entity.AmericanFootballOffensiveStats;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class AmericanFootballOffensiveStatsServiceTest {
    private static DefaultAmericanFootballOffensiveStatsService serviceMock;
    private static AmericanFootballOffensiveStats[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultAmericanFootballOffensiveStatsService.class);
        String inputFile = "AmericanFootballOffensiveStats.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, AmericanFootballOffensiveStats[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        AmericanFootballOffensiveStats testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals offensivePlaysYards ",
                records[0].getOffensivePlaysYards(),
                testResult.getOffensivePlaysYards());
        org.junit.Assert.assertEquals(
                "expect equals offensivePlaysNumber ",
                records[0].getOffensivePlaysNumber(),
                testResult.getOffensivePlaysNumber());
        org.junit.Assert.assertEquals(
                "expect equals offensivePlaysAverageYardsPer ",
                records[0].getOffensivePlaysAverageYardsPer(),
                testResult.getOffensivePlaysAverageYardsPer());
        org.junit.Assert.assertEquals(
                "expect equals possessionDuration ",
                records[0].getPossessionDuration(),
                testResult.getPossessionDuration());
        org.junit.Assert.assertEquals(
                "expect equals turnoversGiveaway ",
                records[0].getTurnoversGiveaway(),
                testResult.getTurnoversGiveaway());
    }
}
