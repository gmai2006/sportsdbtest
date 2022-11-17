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
import com.sportsdb.test.entity.AmericanFootballScoringStats;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class AmericanFootballScoringStatsDaoTestIt {
  static final String inputFile = "AmericanFootballScoringStats.json";
  static AmericanFootballScoringStatsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private AmericanFootballScoringStats[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultAmericanFootballScoringStatsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, AmericanFootballScoringStats[].class);
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
    AmericanFootballScoringStats testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals touchdownsTotal ",
        this.records[1].getTouchdownsTotal(),
        testResult.getTouchdownsTotal());
    org.junit.Assert.assertEquals(
        "expect equals touchdownsPassing ",
        this.records[1].getTouchdownsPassing(),
        testResult.getTouchdownsPassing());
    org.junit.Assert.assertEquals(
        "expect equals touchdownsRushing ",
        this.records[1].getTouchdownsRushing(),
        testResult.getTouchdownsRushing());
    org.junit.Assert.assertEquals(
        "expect equals touchdownsSpecialTeams ",
        this.records[1].getTouchdownsSpecialTeams(),
        testResult.getTouchdownsSpecialTeams());
    org.junit.Assert.assertEquals(
        "expect equals touchdownsDefensive ",
        this.records[1].getTouchdownsDefensive(),
        testResult.getTouchdownsDefensive());
    org.junit.Assert.assertEquals(
        "expect equals extraPointsAttempts ",
        this.records[1].getExtraPointsAttempts(),
        testResult.getExtraPointsAttempts());
    org.junit.Assert.assertEquals(
        "expect equals extraPointsMade ",
        this.records[1].getExtraPointsMade(),
        testResult.getExtraPointsMade());
    org.junit.Assert.assertEquals(
        "expect equals extraPointsMissed ",
        this.records[1].getExtraPointsMissed(),
        testResult.getExtraPointsMissed());
    org.junit.Assert.assertEquals(
        "expect equals extraPointsBlocked ",
        this.records[1].getExtraPointsBlocked(),
        testResult.getExtraPointsBlocked());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalAttempts ",
        this.records[1].getFieldGoalAttempts(),
        testResult.getFieldGoalAttempts());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsMade ",
        this.records[1].getFieldGoalsMade(),
        testResult.getFieldGoalsMade());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsMissed ",
        this.records[1].getFieldGoalsMissed(),
        testResult.getFieldGoalsMissed());
    org.junit.Assert.assertEquals(
        "expect equals fieldGoalsBlocked ",
        this.records[1].getFieldGoalsBlocked(),
        testResult.getFieldGoalsBlocked());
    org.junit.Assert.assertEquals(
        "expect equals safetiesAgainst ",
        this.records[1].getSafetiesAgainst(),
        testResult.getSafetiesAgainst());
    org.junit.Assert.assertEquals(
        "expect equals twoPointConversionsAttempts ",
        this.records[1].getTwoPointConversionsAttempts(),
        testResult.getTwoPointConversionsAttempts());
    org.junit.Assert.assertEquals(
        "expect equals twoPointConversionsMade ",
        this.records[1].getTwoPointConversionsMade(),
        testResult.getTwoPointConversionsMade());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksTotal ",
        this.records[1].getTouchbacksTotal(),
        testResult.getTouchbacksTotal());
  }
}
