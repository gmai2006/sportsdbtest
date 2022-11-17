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

import com.sportsdb.test.entity.Addresses;

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

public class AddressesServiceTest {
  private static DefaultAddressesService serviceMock;
  private static Addresses[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultAddressesService.class);
    String inputFile = "Addresses.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, Addresses[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    Addresses testResult = serviceMock.find(records[0].getId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals locationId ", records[0].getLocationId() == testResult.getLocationId());
    org.junit.Assert.assertEquals(
        "expect equals language ", records[0].getLanguage(), testResult.getLanguage());
    org.junit.Assert.assertEquals(
        "expect equals suite ", records[0].getSuite(), testResult.getSuite());
    org.junit.Assert.assertEquals(
        "expect equals floor ", records[0].getFloor(), testResult.getFloor());
    org.junit.Assert.assertEquals(
        "expect equals building ", records[0].getBuilding(), testResult.getBuilding());
    org.junit.Assert.assertEquals(
        "expect equals streetNumber ", records[0].getStreetNumber(), testResult.getStreetNumber());
    org.junit.Assert.assertEquals(
        "expect equals streetPrefix ", records[0].getStreetPrefix(), testResult.getStreetPrefix());
    org.junit.Assert.assertEquals(
        "expect equals street ", records[0].getStreet(), testResult.getStreet());
    org.junit.Assert.assertEquals(
        "expect equals streetSuffix ", records[0].getStreetSuffix(), testResult.getStreetSuffix());
    org.junit.Assert.assertEquals(
        "expect equals neighborhood ", records[0].getNeighborhood(), testResult.getNeighborhood());
    org.junit.Assert.assertEquals(
        "expect equals district ", records[0].getDistrict(), testResult.getDistrict());
    org.junit.Assert.assertEquals(
        "expect equals locality ", records[0].getLocality(), testResult.getLocality());
    org.junit.Assert.assertEquals(
        "expect equals county ", records[0].getCounty(), testResult.getCounty());
    org.junit.Assert.assertEquals(
        "expect equals region ", records[0].getRegion(), testResult.getRegion());
    org.junit.Assert.assertEquals(
        "expect equals postalCode ", records[0].getPostalCode(), testResult.getPostalCode());
    org.junit.Assert.assertEquals(
        "expect equals country ", records[0].getCountry(), testResult.getCountry());
  }
}
