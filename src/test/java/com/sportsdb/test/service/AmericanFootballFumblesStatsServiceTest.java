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
import com.sportsdb.test.entity.AmericanFootballFumblesStats;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class AmericanFootballFumblesStatsServiceTest {
    private static DefaultAmericanFootballFumblesStatsService serviceMock;
    private static AmericanFootballFumblesStats[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultAmericanFootballFumblesStatsService.class);
        String inputFile = "AmericanFootballFumblesStats.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, AmericanFootballFumblesStats[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        AmericanFootballFumblesStats testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals fumblesCommitted ",
                records[0].getFumblesCommitted(),
                testResult.getFumblesCommitted());
        org.junit.Assert.assertEquals(
                "expect equals fumblesForced ",
                records[0].getFumblesForced(),
                testResult.getFumblesForced());
        org.junit.Assert.assertEquals(
                "expect equals fumblesRecovered ",
                records[0].getFumblesRecovered(),
                testResult.getFumblesRecovered());
        org.junit.Assert.assertEquals(
                "expect equals fumblesLost ",
                records[0].getFumblesLost(),
                testResult.getFumblesLost());
        org.junit.Assert.assertEquals(
                "expect equals fumblesYardsGained ",
                records[0].getFumblesYardsGained(),
                testResult.getFumblesYardsGained());
        org.junit.Assert.assertEquals(
                "expect equals fumblesOwnCommitted ",
                records[0].getFumblesOwnCommitted(),
                testResult.getFumblesOwnCommitted());
        org.junit.Assert.assertEquals(
                "expect equals fumblesOwnRecovered ",
                records[0].getFumblesOwnRecovered(),
                testResult.getFumblesOwnRecovered());
        org.junit.Assert.assertEquals(
                "expect equals fumblesOwnLost ",
                records[0].getFumblesOwnLost(),
                testResult.getFumblesOwnLost());
        org.junit.Assert.assertEquals(
                "expect equals fumblesOwnYardsGained ",
                records[0].getFumblesOwnYardsGained(),
                testResult.getFumblesOwnYardsGained());
        org.junit.Assert.assertEquals(
                "expect equals fumblesOpposingCommitted ",
                records[0].getFumblesOpposingCommitted(),
                testResult.getFumblesOpposingCommitted());
        org.junit.Assert.assertEquals(
                "expect equals fumblesOpposingRecovered ",
                records[0].getFumblesOpposingRecovered(),
                testResult.getFumblesOpposingRecovered());
        org.junit.Assert.assertEquals(
                "expect equals fumblesOpposingLost ",
                records[0].getFumblesOpposingLost(),
                testResult.getFumblesOpposingLost());
        org.junit.Assert.assertEquals(
                "expect equals fumblesOpposingYardsGained ",
                records[0].getFumblesOpposingYardsGained(),
                testResult.getFumblesOpposingYardsGained());
    }
}
