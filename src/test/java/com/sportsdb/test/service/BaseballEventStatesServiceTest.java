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
import com.sportsdb.test.entity.BaseballEventStates;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseballEventStatesServiceTest {
    private static DefaultBaseballEventStatesService serviceMock;
    private static BaseballEventStates[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultBaseballEventStatesService.class);
        String inputFile = "BaseballEventStates.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, BaseballEventStates[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        BaseballEventStates testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals eventId ", records[0].getEventId() == testResult.getEventId());
        org.junit.Assert.assertTrue(
                "expect equals currentState ",
                records[0].getCurrentState() == testResult.getCurrentState());
        org.junit.Assert.assertTrue(
                "expect equals sequenceNumber ",
                records[0].getSequenceNumber() == testResult.getSequenceNumber());
        org.junit.Assert.assertTrue(
                "expect equals atBatNumber ",
                records[0].getAtBatNumber() == testResult.getAtBatNumber());
        org.junit.Assert.assertTrue(
                "expect equals inningValue ",
                records[0].getInningValue() == testResult.getInningValue());
        org.junit.Assert.assertEquals(
                "expect equals inningHalf ",
                records[0].getInningHalf(),
                testResult.getInningHalf());
        org.junit.Assert.assertTrue(
                "expect equals outs ", records[0].getOuts() == testResult.getOuts());
        org.junit.Assert.assertTrue(
                "expect equals balls ", records[0].getBalls() == testResult.getBalls());
        org.junit.Assert.assertTrue(
                "expect equals strikes ", records[0].getStrikes() == testResult.getStrikes());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnFirstId ",
                records[0].getRunnerOnFirstId() == testResult.getRunnerOnFirstId());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnSecondId ",
                records[0].getRunnerOnSecondId() == testResult.getRunnerOnSecondId());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnThirdId ",
                records[0].getRunnerOnThirdId() == testResult.getRunnerOnThirdId());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnFirst ",
                records[0].getRunnerOnFirst() == testResult.getRunnerOnFirst());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnSecond ",
                records[0].getRunnerOnSecond() == testResult.getRunnerOnSecond());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnThird ",
                records[0].getRunnerOnThird() == testResult.getRunnerOnThird());
        org.junit.Assert.assertTrue(
                "expect equals runsThisInningHalf ",
                records[0].getRunsThisInningHalf() == testResult.getRunsThisInningHalf());
        org.junit.Assert.assertTrue(
                "expect equals pitcherId ", records[0].getPitcherId() == testResult.getPitcherId());
        org.junit.Assert.assertTrue(
                "expect equals batterId ", records[0].getBatterId() == testResult.getBatterId());
        org.junit.Assert.assertEquals(
                "expect equals batterSide ",
                records[0].getBatterSide(),
                testResult.getBatterSide());
        org.junit.Assert.assertEquals(
                "expect equals context ", records[0].getContext(), testResult.getContext());
    }
}
