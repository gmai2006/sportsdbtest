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
import com.sportsdb.test.entity.OutcomeTotals;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class OutcomeTotalsDaoTestIt {
  static final String inputFile = "OutcomeTotals.json";
  static OutcomeTotalsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private OutcomeTotals[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultOutcomeTotalsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, OutcomeTotals[].class);
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
    OutcomeTotals testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals standingSubgroupId ",
        this.records[1].getStandingSubgroupId() == testResult.getStandingSubgroupId());
    org.junit.Assert.assertEquals(
        "expect equals outcomeHolderType ",
        this.records[1].getOutcomeHolderType(),
        testResult.getOutcomeHolderType());
    org.junit.Assert.assertTrue(
        "expect equals outcomeHolderId ",
        this.records[1].getOutcomeHolderId() == testResult.getOutcomeHolderId());
    org.junit.Assert.assertEquals(
        "expect equals rank ", this.records[1].getRank(), testResult.getRank());
    org.junit.Assert.assertEquals(
        "expect equals wins ", this.records[1].getWins(), testResult.getWins());
    org.junit.Assert.assertEquals(
        "expect equals losses ", this.records[1].getLosses(), testResult.getLosses());
    org.junit.Assert.assertEquals(
        "expect equals ties ", this.records[1].getTies(), testResult.getTies());
    org.junit.Assert.assertEquals(
        "expect equals undecideds ", this.records[1].getUndecideds(), testResult.getUndecideds());
    org.junit.Assert.assertEquals(
        "expect equals winningPercentage ",
        this.records[1].getWinningPercentage(),
        testResult.getWinningPercentage());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredFor ",
        this.records[1].getPointsScoredFor(),
        testResult.getPointsScoredFor());
    org.junit.Assert.assertEquals(
        "expect equals pointsScoredAgainst ",
        this.records[1].getPointsScoredAgainst(),
        testResult.getPointsScoredAgainst());
    org.junit.Assert.assertEquals(
        "expect equals pointsDifference ",
        this.records[1].getPointsDifference(),
        testResult.getPointsDifference());
    org.junit.Assert.assertEquals(
        "expect equals standingPoints ",
        this.records[1].getStandingPoints(),
        testResult.getStandingPoints());
    org.junit.Assert.assertEquals(
        "expect equals streakType ", this.records[1].getStreakType(), testResult.getStreakType());
    org.junit.Assert.assertEquals(
        "expect equals streakDuration ",
        this.records[1].getStreakDuration(),
        testResult.getStreakDuration());
    org.junit.Assert.assertEquals(
        "expect equals streakTotal ",
        this.records[1].getStreakTotal(),
        testResult.getStreakTotal());
  }
}
