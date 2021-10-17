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
import com.sportsdb.test.entity.BaseballActionPitches;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseballActionPitchesServiceTest {
    private static DefaultBaseballActionPitchesService serviceMock;
    private static BaseballActionPitches[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultBaseballActionPitchesService.class);
        String inputFile = "BaseballActionPitches.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, BaseballActionPitches[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        BaseballActionPitches testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals baseballActionPlayId ",
                records[0].getBaseballActionPlayId() == testResult.getBaseballActionPlayId());
        org.junit.Assert.assertTrue(
                "expect equals sequenceNumber ",
                records[0].getSequenceNumber() == testResult.getSequenceNumber());
        org.junit.Assert.assertTrue(
                "expect equals baseballDefensiveGroupId ",
                records[0].getBaseballDefensiveGroupId()
                        == testResult.getBaseballDefensiveGroupId());
        org.junit.Assert.assertEquals(
                "expect equals umpireCall ",
                records[0].getUmpireCall(),
                testResult.getUmpireCall());
        org.junit.Assert.assertEquals(
                "expect equals pitchLocation ",
                records[0].getPitchLocation(),
                testResult.getPitchLocation());
        org.junit.Assert.assertEquals(
                "expect equals pitchType ", records[0].getPitchType(), testResult.getPitchType());
        org.junit.Assert.assertTrue(
                "expect equals pitchVelocity ",
                records[0].getPitchVelocity() == testResult.getPitchVelocity());
        org.junit.Assert.assertEquals(
                "expect equals comment ", records[0].getComment(), testResult.getComment());
        org.junit.Assert.assertEquals(
                "expect equals trajectoryCoordinates ",
                records[0].getTrajectoryCoordinates(),
                testResult.getTrajectoryCoordinates());
        org.junit.Assert.assertEquals(
                "expect equals trajectoryFormula ",
                records[0].getTrajectoryFormula(),
                testResult.getTrajectoryFormula());
        org.junit.Assert.assertEquals(
                "expect equals ballType ", records[0].getBallType(), testResult.getBallType());
        org.junit.Assert.assertEquals(
                "expect equals strikeType ",
                records[0].getStrikeType(),
                testResult.getStrikeType());
    }
}
