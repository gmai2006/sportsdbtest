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
import com.sportsdb.test.entity.BaseballActionContactDetails;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseballActionContactDetailsServiceTest {
    private static DefaultBaseballActionContactDetailsService serviceMock;
    private static BaseballActionContactDetails[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultBaseballActionContactDetailsService.class);
        String inputFile = "BaseballActionContactDetails.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, BaseballActionContactDetails[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        BaseballActionContactDetails testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals baseballActionPitchId ",
                records[0].getBaseballActionPitchId() == testResult.getBaseballActionPitchId());
        org.junit.Assert.assertEquals(
                "expect equals location ", records[0].getLocation(), testResult.getLocation());
        org.junit.Assert.assertEquals(
                "expect equals strength ", records[0].getStrength(), testResult.getStrength());
        org.junit.Assert.assertTrue(
                "expect equals velocity ", records[0].getVelocity() == testResult.getVelocity());
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
    }
}
