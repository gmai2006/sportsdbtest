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

import com.sportsdb.test.entity.AmericanFootballEventStates;

import com.sportsdb.test.utils.FileUtils;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class AmericanFootballEventStatesServiceTest {
  private static DefaultAmericanFootballEventStatesService serviceMock;
  private static AmericanFootballEventStates[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultAmericanFootballEventStatesService.class);
    String inputFile = "AmericanFootballEventStates.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, AmericanFootballEventStates[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    AmericanFootballEventStates testResult = serviceMock.find(records[0].getId());

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
        "expect equals periodValue ", records[0].getPeriodValue() == testResult.getPeriodValue());
    org.junit.Assert.assertEquals(
        "expect equals periodTimeElapsed ",
        records[0].getPeriodTimeElapsed(),
        testResult.getPeriodTimeElapsed());
    org.junit.Assert.assertEquals(
        "expect equals periodTimeRemaining ",
        records[0].getPeriodTimeRemaining(),
        testResult.getPeriodTimeRemaining());
    org.junit.Assert.assertEquals(
        "expect equals clockState ", records[0].getClockState(), testResult.getClockState());
    org.junit.Assert.assertTrue(
        "expect equals down ", records[0].getDown() == testResult.getDown());
    org.junit.Assert.assertTrue(
        "expect equals teamInPossessionId ",
        records[0].getTeamInPossessionId() == testResult.getTeamInPossessionId());
    org.junit.Assert.assertTrue(
        "expect equals distanceFor1stDown ",
        records[0].getDistanceFor1stDown() == testResult.getDistanceFor1stDown());
    org.junit.Assert.assertEquals(
        "expect equals fieldSide ", records[0].getFieldSide(), testResult.getFieldSide());
    org.junit.Assert.assertTrue(
        "expect equals fieldLine ", records[0].getFieldLine() == testResult.getFieldLine());
    org.junit.Assert.assertEquals(
        "expect equals context ", records[0].getContext(), testResult.getContext());
  }
}
