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
import com.sportsdb.test.entity.AmericanFootballFumblesStats;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class AmericanFootballFumblesStatsDaoTestIt {
  static final String inputFile = "AmericanFootballFumblesStats.json";
  static AmericanFootballFumblesStatsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private AmericanFootballFumblesStats[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultAmericanFootballFumblesStatsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, AmericanFootballFumblesStats[].class);
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
    AmericanFootballFumblesStats testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals fumblesCommitted ",
        this.records[1].getFumblesCommitted(),
        testResult.getFumblesCommitted());
    org.junit.Assert.assertEquals(
        "expect equals fumblesForced ",
        this.records[1].getFumblesForced(),
        testResult.getFumblesForced());
    org.junit.Assert.assertEquals(
        "expect equals fumblesRecovered ",
        this.records[1].getFumblesRecovered(),
        testResult.getFumblesRecovered());
    org.junit.Assert.assertEquals(
        "expect equals fumblesLost ",
        this.records[1].getFumblesLost(),
        testResult.getFumblesLost());
    org.junit.Assert.assertEquals(
        "expect equals fumblesYardsGained ",
        this.records[1].getFumblesYardsGained(),
        testResult.getFumblesYardsGained());
    org.junit.Assert.assertEquals(
        "expect equals fumblesOwnCommitted ",
        this.records[1].getFumblesOwnCommitted(),
        testResult.getFumblesOwnCommitted());
    org.junit.Assert.assertEquals(
        "expect equals fumblesOwnRecovered ",
        this.records[1].getFumblesOwnRecovered(),
        testResult.getFumblesOwnRecovered());
    org.junit.Assert.assertEquals(
        "expect equals fumblesOwnLost ",
        this.records[1].getFumblesOwnLost(),
        testResult.getFumblesOwnLost());
    org.junit.Assert.assertEquals(
        "expect equals fumblesOwnYardsGained ",
        this.records[1].getFumblesOwnYardsGained(),
        testResult.getFumblesOwnYardsGained());
    org.junit.Assert.assertEquals(
        "expect equals fumblesOpposingCommitted ",
        this.records[1].getFumblesOpposingCommitted(),
        testResult.getFumblesOpposingCommitted());
    org.junit.Assert.assertEquals(
        "expect equals fumblesOpposingRecovered ",
        this.records[1].getFumblesOpposingRecovered(),
        testResult.getFumblesOpposingRecovered());
    org.junit.Assert.assertEquals(
        "expect equals fumblesOpposingLost ",
        this.records[1].getFumblesOpposingLost(),
        testResult.getFumblesOpposingLost());
    org.junit.Assert.assertEquals(
        "expect equals fumblesOpposingYardsGained ",
        this.records[1].getFumblesOpposingYardsGained(),
        testResult.getFumblesOpposingYardsGained());
  }
}
