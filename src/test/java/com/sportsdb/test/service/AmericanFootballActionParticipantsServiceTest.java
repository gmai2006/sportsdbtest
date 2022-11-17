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

import com.sportsdb.test.entity.AmericanFootballActionParticipants;

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

public class AmericanFootballActionParticipantsServiceTest {
  private static DefaultAmericanFootballActionParticipantsService serviceMock;
  private static AmericanFootballActionParticipants[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultAmericanFootballActionParticipantsService.class);
    String inputFile = "AmericanFootballActionParticipants.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, AmericanFootballActionParticipants[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    AmericanFootballActionParticipants testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals americanFootballActionPlayId ",
        records[0].getAmericanFootballActionPlayId()
            == testResult.getAmericanFootballActionPlayId());
    org.junit.Assert.assertTrue(
        "expect equals personId ", records[0].getPersonId() == testResult.getPersonId());
    org.junit.Assert.assertEquals(
        "expect equals participantRole ",
        records[0].getParticipantRole(),
        testResult.getParticipantRole());
    org.junit.Assert.assertEquals(
        "expect equals scoreType ", records[0].getScoreType(), testResult.getScoreType());
    org.junit.Assert.assertTrue(
        "expect equals fieldLine ", records[0].getFieldLine() == testResult.getFieldLine());
    org.junit.Assert.assertTrue(
        "expect equals yardage ", records[0].getYardage() == testResult.getYardage());
    org.junit.Assert.assertTrue(
        "expect equals scoreCredit ", records[0].getScoreCredit() == testResult.getScoreCredit());
    org.junit.Assert.assertTrue(
        "expect equals yardsGained ", records[0].getYardsGained() == testResult.getYardsGained());
  }
}
