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

import com.sportsdb.test.entity.WeatherConditions;

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

public class WeatherConditionsServiceTest {
  private static DefaultWeatherConditionsService serviceMock;
  private static WeatherConditions[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultWeatherConditionsService.class);
    String inputFile = "WeatherConditions.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, WeatherConditions[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    WeatherConditions testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals eventId ", records[0].getEventId() == testResult.getEventId());
    org.junit.Assert.assertEquals(
        "expect equals temperature ", records[0].getTemperature(), testResult.getTemperature());
    org.junit.Assert.assertEquals(
        "expect equals temperatureUnits ",
        records[0].getTemperatureUnits(),
        testResult.getTemperatureUnits());
    org.junit.Assert.assertEquals(
        "expect equals humidity ", records[0].getHumidity(), testResult.getHumidity());
    org.junit.Assert.assertEquals(
        "expect equals clouds ", records[0].getClouds(), testResult.getClouds());
    org.junit.Assert.assertEquals(
        "expect equals windDirection ",
        records[0].getWindDirection(),
        testResult.getWindDirection());
    org.junit.Assert.assertEquals(
        "expect equals windVelocity ", records[0].getWindVelocity(), testResult.getWindVelocity());
    org.junit.Assert.assertEquals(
        "expect equals weatherCode ", records[0].getWeatherCode(), testResult.getWeatherCode());
  }
}
