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
import com.sportsdb.test.entity.BaseballActionSubstitutions;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class BaseballActionSubstitutionsDaoTestIt {
  static final String inputFile = "BaseballActionSubstitutions.json";
  static BaseballActionSubstitutionsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private BaseballActionSubstitutions[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultBaseballActionSubstitutionsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, BaseballActionSubstitutions[].class);
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
    BaseballActionSubstitutions testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals baseballEventStateId ",
        this.records[1].getBaseballEventStateId() == testResult.getBaseballEventStateId());
    org.junit.Assert.assertTrue(
        "expect equals sequenceNumber ",
        this.records[1].getSequenceNumber() == testResult.getSequenceNumber());
    org.junit.Assert.assertEquals(
        "expect equals personType ", this.records[1].getPersonType(), testResult.getPersonType());
    org.junit.Assert.assertTrue(
        "expect equals personOriginalId ",
        this.records[1].getPersonOriginalId() == testResult.getPersonOriginalId());
    org.junit.Assert.assertTrue(
        "expect equals personOriginalPositionId ",
        this.records[1].getPersonOriginalPositionId() == testResult.getPersonOriginalPositionId());
    org.junit.Assert.assertTrue(
        "expect equals personOriginalLineupSlot ",
        this.records[1].getPersonOriginalLineupSlot() == testResult.getPersonOriginalLineupSlot());
    org.junit.Assert.assertTrue(
        "expect equals personReplacingId ",
        this.records[1].getPersonReplacingId() == testResult.getPersonReplacingId());
    org.junit.Assert.assertTrue(
        "expect equals personReplacingPositionId ",
        this.records[1].getPersonReplacingPositionId()
            == testResult.getPersonReplacingPositionId());
    org.junit.Assert.assertTrue(
        "expect equals personReplacingLineupSlot ",
        this.records[1].getPersonReplacingLineupSlot()
            == testResult.getPersonReplacingLineupSlot());
    org.junit.Assert.assertEquals(
        "expect equals substitutionReason ",
        this.records[1].getSubstitutionReason(),
        testResult.getSubstitutionReason());
    org.junit.Assert.assertEquals(
        "expect equals comment ", this.records[1].getComment(), testResult.getComment());
  }
}
