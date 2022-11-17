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

import com.sportsdb.test.entity.MediaContents;

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

public class MediaContentsServiceTest {
  private static DefaultMediaContentsService serviceMock;
  private static MediaContents[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultMediaContentsService.class);
    String inputFile = "MediaContents.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MediaContents[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    MediaContents testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals mediaId ", records[0].getMediaId() == testResult.getMediaId());
    org.junit.Assert.assertEquals(
        "expect equals object ", records[0].getObject(), testResult.getObject());
    org.junit.Assert.assertEquals(
        "expect equals format ", records[0].getFormat(), testResult.getFormat());
    org.junit.Assert.assertEquals(
        "expect equals mimeType ", records[0].getMimeType(), testResult.getMimeType());
    org.junit.Assert.assertEquals(
        "expect equals height ", records[0].getHeight(), testResult.getHeight());
    org.junit.Assert.assertEquals(
        "expect equals width ", records[0].getWidth(), testResult.getWidth());
    org.junit.Assert.assertEquals(
        "expect equals duration ", records[0].getDuration(), testResult.getDuration());
    org.junit.Assert.assertEquals(
        "expect equals fileSize ", records[0].getFileSize(), testResult.getFileSize());
    org.junit.Assert.assertEquals(
        "expect equals resolution ", records[0].getResolution(), testResult.getResolution());
  }
}
