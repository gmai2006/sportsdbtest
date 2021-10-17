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
import com.sportsdb.test.entity.MotorRacingQualifyingStats;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class MotorRacingQualifyingStatsServiceTest {
    private static DefaultMotorRacingQualifyingStatsService serviceMock;
    private static MotorRacingQualifyingStats[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultMotorRacingQualifyingStatsService.class);
        String inputFile = "MotorRacingQualifyingStats.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, MotorRacingQualifyingStats[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        MotorRacingQualifyingStats testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals grid ", records[0].getGrid(), testResult.getGrid());
        org.junit.Assert.assertEquals(
                "expect equals polePosition ",
                records[0].getPolePosition(),
                testResult.getPolePosition());
        org.junit.Assert.assertEquals(
                "expect equals poleWins ", records[0].getPoleWins(), testResult.getPoleWins());
        org.junit.Assert.assertEquals(
                "expect equals qualifyingSpeed ",
                records[0].getQualifyingSpeed(),
                testResult.getQualifyingSpeed());
        org.junit.Assert.assertEquals(
                "expect equals qualifyingSpeedUnits ",
                records[0].getQualifyingSpeedUnits(),
                testResult.getQualifyingSpeedUnits());
        org.junit.Assert.assertEquals(
                "expect equals qualifyingTime ",
                records[0].getQualifyingTime(),
                testResult.getQualifyingTime());
        org.junit.Assert.assertEquals(
                "expect equals qualifyingPosition ",
                records[0].getQualifyingPosition(),
                testResult.getQualifyingPosition());
    }
}
