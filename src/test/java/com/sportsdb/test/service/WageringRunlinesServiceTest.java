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
import com.sportsdb.test.entity.WageringRunlines;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class WageringRunlinesServiceTest {
    private static DefaultWageringRunlinesService serviceMock;
    private static WageringRunlines[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultWageringRunlinesService.class);
        String inputFile = "WageringRunlines.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, WageringRunlines[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        WageringRunlines testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals bookmakerId ",
                records[0].getBookmakerId() == testResult.getBookmakerId());
        org.junit.Assert.assertTrue(
                "expect equals eventId ", records[0].getEventId() == testResult.getEventId());
        org.junit.Assert.assertTrue(
                "expect equals teamId ", records[0].getTeamId() == testResult.getTeamId());
        org.junit.Assert.assertTrue(
                "expect equals personId ", records[0].getPersonId() == testResult.getPersonId());
        org.junit.Assert.assertEquals(
                "expect equals rotationKey ",
                records[0].getRotationKey(),
                testResult.getRotationKey());
        org.junit.Assert.assertEquals(
                "expect equals comment ", records[0].getComment(), testResult.getComment());
        org.junit.Assert.assertEquals(
                "expect equals vigorish ", records[0].getVigorish(), testResult.getVigorish());
        org.junit.Assert.assertEquals(
                "expect equals line ", records[0].getLine(), testResult.getLine());
        org.junit.Assert.assertEquals(
                "expect equals lineOpening ",
                records[0].getLineOpening(),
                testResult.getLineOpening());
        org.junit.Assert.assertEquals(
                "expect equals lineValue ", records[0].getLineValue(), testResult.getLineValue());
        org.junit.Assert.assertEquals(
                "expect equals prediction ",
                records[0].getPrediction(),
                testResult.getPrediction());
    }
}
