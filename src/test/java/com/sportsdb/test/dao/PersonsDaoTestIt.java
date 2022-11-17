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
import com.sportsdb.test.entity.Persons;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class PersonsDaoTestIt {
  static final String inputFile = "Persons.json";
  static PersonsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private Persons[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultPersonsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, Persons[].class);
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
    Persons testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals personKey ", this.records[1].getPersonKey(), testResult.getPersonKey());
    org.junit.Assert.assertTrue(
        "expect equals publisherId ",
        this.records[1].getPublisherId() == testResult.getPublisherId());
    org.junit.Assert.assertEquals(
        "expect equals gender ", this.records[1].getGender(), testResult.getGender());
    org.junit.Assert.assertEquals(
        "expect equals birthDate ", this.records[1].getBirthDate(), testResult.getBirthDate());
    org.junit.Assert.assertEquals(
        "expect equals deathDate ", this.records[1].getDeathDate(), testResult.getDeathDate());
    org.junit.Assert.assertTrue(
        "expect equals birthLocationId ",
        this.records[1].getBirthLocationId() == testResult.getBirthLocationId());
    org.junit.Assert.assertTrue(
        "expect equals hometownLocationId ",
        this.records[1].getHometownLocationId() == testResult.getHometownLocationId());
    org.junit.Assert.assertTrue(
        "expect equals residenceLocationId ",
        this.records[1].getResidenceLocationId() == testResult.getResidenceLocationId());
    org.junit.Assert.assertTrue(
        "expect equals deathLocationId ",
        this.records[1].getDeathLocationId() == testResult.getDeathLocationId());
  }
}
