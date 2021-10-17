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
import com.sportsdb.test.entity.TeamPhases;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class TeamPhasesServiceTest {
    private static DefaultTeamPhasesService serviceMock;
    private static TeamPhases[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultTeamPhasesService.class);
        String inputFile = "TeamPhases.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, TeamPhases[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        TeamPhases testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals teamId ", records[0].getTeamId() == testResult.getTeamId());
        org.junit.Assert.assertTrue(
                "expect equals startSeasonId ",
                records[0].getStartSeasonId() == testResult.getStartSeasonId());
        org.junit.Assert.assertTrue(
                "expect equals endSeasonId ",
                records[0].getEndSeasonId() == testResult.getEndSeasonId());
        org.junit.Assert.assertTrue(
                "expect equals affiliationId ",
                records[0].getAffiliationId() == testResult.getAffiliationId());
        org.junit.Assert.assertEquals(
                "expect equals startDateTime ",
                records[0].getStartDateTime(),
                testResult.getStartDateTime());
        org.junit.Assert.assertEquals(
                "expect equals endDateTime ",
                records[0].getEndDateTime(),
                testResult.getEndDateTime());
        org.junit.Assert.assertEquals(
                "expect equals phaseStatus ",
                records[0].getPhaseStatus(),
                testResult.getPhaseStatus());
        org.junit.Assert.assertTrue(
                "expect equals roleId ", records[0].getRoleId() == testResult.getRoleId());
    }
}
