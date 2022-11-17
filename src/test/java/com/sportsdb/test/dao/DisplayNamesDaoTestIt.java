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
import com.sportsdb.test.entity.DisplayNames;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class DisplayNamesDaoTestIt {
  static final String inputFile = "DisplayNames.json";
  static DisplayNamesDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private DisplayNames[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultDisplayNamesDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, DisplayNames[].class);
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
    DisplayNames testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals language ", this.records[1].getLanguage(), testResult.getLanguage());
    org.junit.Assert.assertEquals(
        "expect equals entityType ", this.records[1].getEntityType(), testResult.getEntityType());
    org.junit.Assert.assertTrue(
        "expect equals entityId ", this.records[1].getEntityId() == testResult.getEntityId());
    org.junit.Assert.assertEquals(
        "expect equals fullName ", this.records[1].getFullName(), testResult.getFullName());
    org.junit.Assert.assertEquals(
        "expect equals firstName ", this.records[1].getFirstName(), testResult.getFirstName());
    org.junit.Assert.assertEquals(
        "expect equals middleName ", this.records[1].getMiddleName(), testResult.getMiddleName());
    org.junit.Assert.assertEquals(
        "expect equals lastName ", this.records[1].getLastName(), testResult.getLastName());
    org.junit.Assert.assertEquals(
        "expect equals alias ", this.records[1].getAlias(), testResult.getAlias());
    org.junit.Assert.assertEquals(
        "expect equals abbreviation ",
        this.records[1].getAbbreviation(),
        testResult.getAbbreviation());
    org.junit.Assert.assertEquals(
        "expect equals shortName ", this.records[1].getShortName(), testResult.getShortName());
    org.junit.Assert.assertEquals(
        "expect equals prefix ", this.records[1].getPrefix(), testResult.getPrefix());
    org.junit.Assert.assertEquals(
        "expect equals suffix ", this.records[1].getSuffix(), testResult.getSuffix());
  }
}
