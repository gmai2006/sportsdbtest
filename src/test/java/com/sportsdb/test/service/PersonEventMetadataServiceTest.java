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

import com.sportsdb.test.entity.PersonEventMetadata;

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

public class PersonEventMetadataServiceTest {
  private static DefaultPersonEventMetadataService serviceMock;
  private static PersonEventMetadata[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultPersonEventMetadataService.class);
    String inputFile = "PersonEventMetadata.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, PersonEventMetadata[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    PersonEventMetadata testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals personId ", records[0].getPersonId() == testResult.getPersonId());
    org.junit.Assert.assertTrue(
        "expect equals eventId ", records[0].getEventId() == testResult.getEventId());
    org.junit.Assert.assertEquals(
        "expect equals status ", records[0].getStatus(), testResult.getStatus());
    org.junit.Assert.assertEquals(
        "expect equals health ", records[0].getHealth(), testResult.getHealth());
    org.junit.Assert.assertEquals(
        "expect equals weight ", records[0].getWeight(), testResult.getWeight());
    org.junit.Assert.assertTrue(
        "expect equals roleId ", records[0].getRoleId() == testResult.getRoleId());
    org.junit.Assert.assertTrue(
        "expect equals positionId ", records[0].getPositionId() == testResult.getPositionId());
    org.junit.Assert.assertTrue(
        "expect equals teamId ", records[0].getTeamId() == testResult.getTeamId());
    org.junit.Assert.assertTrue(
        "expect equals lineupSlot ", records[0].getLineupSlot() == testResult.getLineupSlot());
    org.junit.Assert.assertTrue(
        "expect equals lineupSlotSequence ",
        records[0].getLineupSlotSequence() == testResult.getLineupSlotSequence());
  }
}
