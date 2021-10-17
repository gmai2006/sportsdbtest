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
import com.sportsdb.test.entity.CorePersonStats;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class CorePersonStatsServiceTest {
    private static DefaultCorePersonStatsService serviceMock;
    private static CorePersonStats[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultCorePersonStatsService.class);
        String inputFile = "CorePersonStats.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, CorePersonStats[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        CorePersonStats testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals timePlayedEvent ",
                records[0].getTimePlayedEvent(),
                testResult.getTimePlayedEvent());
        org.junit.Assert.assertEquals(
                "expect equals timePlayedTotal ",
                records[0].getTimePlayedTotal(),
                testResult.getTimePlayedTotal());
        org.junit.Assert.assertEquals(
                "expect equals timePlayedEventAverage ",
                records[0].getTimePlayedEventAverage(),
                testResult.getTimePlayedEventAverage());
        org.junit.Assert.assertTrue(
                "expect equals eventsPlayed ",
                records[0].getEventsPlayed() == testResult.getEventsPlayed());
        org.junit.Assert.assertTrue(
                "expect equals eventsStarted ",
                records[0].getEventsStarted() == testResult.getEventsStarted());
        org.junit.Assert.assertTrue(
                "expect equals positionId ",
                records[0].getPositionId() == testResult.getPositionId());
    }
}
