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

import com.sportsdb.test.entity.DisplayNames;

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

public class DisplayNamesServiceTest {
  private static DefaultDisplayNamesService serviceMock;
  private static DisplayNames[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultDisplayNamesService.class);
    String inputFile = "DisplayNames.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, DisplayNames[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    DisplayNames testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals language ", records[0].getLanguage(), testResult.getLanguage());
    org.junit.Assert.assertEquals(
        "expect equals entityType ", records[0].getEntityType(), testResult.getEntityType());
    org.junit.Assert.assertTrue(
        "expect equals entityId ", records[0].getEntityId() == testResult.getEntityId());
    org.junit.Assert.assertEquals(
        "expect equals fullName ", records[0].getFullName(), testResult.getFullName());
    org.junit.Assert.assertEquals(
        "expect equals firstName ", records[0].getFirstName(), testResult.getFirstName());
    org.junit.Assert.assertEquals(
        "expect equals middleName ", records[0].getMiddleName(), testResult.getMiddleName());
    org.junit.Assert.assertEquals(
        "expect equals lastName ", records[0].getLastName(), testResult.getLastName());
    org.junit.Assert.assertEquals(
        "expect equals alias ", records[0].getAlias(), testResult.getAlias());
    org.junit.Assert.assertEquals(
        "expect equals abbreviation ", records[0].getAbbreviation(), testResult.getAbbreviation());
    org.junit.Assert.assertEquals(
        "expect equals shortName ", records[0].getShortName(), testResult.getShortName());
    org.junit.Assert.assertEquals(
        "expect equals prefix ", records[0].getPrefix(), testResult.getPrefix());
    org.junit.Assert.assertEquals(
        "expect equals suffix ", records[0].getSuffix(), testResult.getSuffix());
  }
}
