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
package com.sportsdb.test.dao;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.sportsdb.test.entity.Addresses;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class AddressesDaoTestIt {
  static final String inputFile = "Addresses.json";
  static AddressesDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private Addresses[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultAddressesDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, Addresses[].class);
      json = null;
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @After
  public void after() {
    records = null;
  }

  @Test
  public void testSelect() {
    Addresses testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals locationId ", this.records[1].getLocationId() == testResult.getLocationId());
    org.junit.Assert.assertEquals(
        "expect equals language ", this.records[1].getLanguage(), testResult.getLanguage());
    org.junit.Assert.assertEquals(
        "expect equals suite ", this.records[1].getSuite(), testResult.getSuite());
    org.junit.Assert.assertEquals(
        "expect equals floor ", this.records[1].getFloor(), testResult.getFloor());
    org.junit.Assert.assertEquals(
        "expect equals building ", this.records[1].getBuilding(), testResult.getBuilding());
    org.junit.Assert.assertEquals(
        "expect equals streetNumber ",
        this.records[1].getStreetNumber(),
        testResult.getStreetNumber());
    org.junit.Assert.assertEquals(
        "expect equals streetPrefix ",
        this.records[1].getStreetPrefix(),
        testResult.getStreetPrefix());
    org.junit.Assert.assertEquals(
        "expect equals street ", this.records[1].getStreet(), testResult.getStreet());
    org.junit.Assert.assertEquals(
        "expect equals streetSuffix ",
        this.records[1].getStreetSuffix(),
        testResult.getStreetSuffix());
    org.junit.Assert.assertEquals(
        "expect equals neighborhood ",
        this.records[1].getNeighborhood(),
        testResult.getNeighborhood());
    org.junit.Assert.assertEquals(
        "expect equals district ", this.records[1].getDistrict(), testResult.getDistrict());
    org.junit.Assert.assertEquals(
        "expect equals locality ", this.records[1].getLocality(), testResult.getLocality());
    org.junit.Assert.assertEquals(
        "expect equals county ", this.records[1].getCounty(), testResult.getCounty());
    org.junit.Assert.assertEquals(
        "expect equals region ", this.records[1].getRegion(), testResult.getRegion());
    org.junit.Assert.assertEquals(
        "expect equals postalCode ", this.records[1].getPostalCode(), testResult.getPostalCode());
    org.junit.Assert.assertEquals(
        "expect equals country ", this.records[1].getCountry(), testResult.getCountry());
  }
}
