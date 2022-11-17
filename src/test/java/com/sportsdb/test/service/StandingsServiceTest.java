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

import com.sportsdb.test.entity.Standings;

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

public class StandingsServiceTest {
  private static DefaultStandingsService serviceMock;
  private static Standings[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultStandingsService.class);
    String inputFile = "Standings.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, Standings[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    Standings testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals affiliationId ",
        records[0].getAffiliationId() == testResult.getAffiliationId());
    org.junit.Assert.assertEquals(
        "expect equals standingType ", records[0].getStandingType(), testResult.getStandingType());
    org.junit.Assert.assertTrue(
        "expect equals subSeasonId ", records[0].getSubSeasonId() == testResult.getSubSeasonId());
    org.junit.Assert.assertEquals(
        "expect equals lastUpdated ", records[0].getLastUpdated(), testResult.getLastUpdated());
    org.junit.Assert.assertEquals(
        "expect equals durationScope ",
        records[0].getDurationScope(),
        testResult.getDurationScope());
    org.junit.Assert.assertEquals(
        "expect equals competitionScope ",
        records[0].getCompetitionScope(),
        testResult.getCompetitionScope());
    org.junit.Assert.assertEquals(
        "expect equals competitionScopeId ",
        records[0].getCompetitionScopeId(),
        testResult.getCompetitionScopeId());
    org.junit.Assert.assertEquals(
        "expect equals alignmentScope ",
        records[0].getAlignmentScope(),
        testResult.getAlignmentScope());
    org.junit.Assert.assertEquals(
        "expect equals siteScope ", records[0].getSiteScope(), testResult.getSiteScope());
    org.junit.Assert.assertEquals(
        "expect equals scopingLabel ", records[0].getScopingLabel(), testResult.getScopingLabel());
    org.junit.Assert.assertTrue(
        "expect equals publisherId ", records[0].getPublisherId() == testResult.getPublisherId());
    org.junit.Assert.assertEquals(
        "expect equals source ", records[0].getSource(), testResult.getSource());
  }
}
