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

import com.sportsdb.test.entity.BaseballActionPlays;

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

public class BaseballActionPlaysServiceTest {
  private static DefaultBaseballActionPlaysService serviceMock;
  private static BaseballActionPlays[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultBaseballActionPlaysService.class);
    String inputFile = "BaseballActionPlays.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, BaseballActionPlays[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    BaseballActionPlays testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals baseballEventStateId ",
        records[0].getBaseballEventStateId() == testResult.getBaseballEventStateId());
    org.junit.Assert.assertEquals(
        "expect equals playType ", records[0].getPlayType(), testResult.getPlayType());
    org.junit.Assert.assertEquals(
        "expect equals notation ", records[0].getNotation(), testResult.getNotation());
    org.junit.Assert.assertEquals(
        "expect equals notationYaml ", records[0].getNotationYaml(), testResult.getNotationYaml());
    org.junit.Assert.assertTrue(
        "expect equals baseballDefensiveGroupId ",
        records[0].getBaseballDefensiveGroupId() == testResult.getBaseballDefensiveGroupId());
    org.junit.Assert.assertEquals(
        "expect equals comment ", records[0].getComment(), testResult.getComment());
    org.junit.Assert.assertTrue(
        "expect equals runnerOnFirstAdvance ",
        records[0].getRunnerOnFirstAdvance() == testResult.getRunnerOnFirstAdvance());
    org.junit.Assert.assertTrue(
        "expect equals runnerOnSecondAdvance ",
        records[0].getRunnerOnSecondAdvance() == testResult.getRunnerOnSecondAdvance());
    org.junit.Assert.assertTrue(
        "expect equals runnerOnThirdAdvance ",
        records[0].getRunnerOnThirdAdvance() == testResult.getRunnerOnThirdAdvance());
    org.junit.Assert.assertTrue(
        "expect equals outsRecorded ",
        records[0].getOutsRecorded() == testResult.getOutsRecorded());
    org.junit.Assert.assertTrue("expect equals rbi ", records[0].getRbi() == testResult.getRbi());
    org.junit.Assert.assertTrue(
        "expect equals runsScored ", records[0].getRunsScored() == testResult.getRunsScored());
    org.junit.Assert.assertEquals(
        "expect equals earnedRunsScored ",
        records[0].getEarnedRunsScored(),
        testResult.getEarnedRunsScored());
  }
}
