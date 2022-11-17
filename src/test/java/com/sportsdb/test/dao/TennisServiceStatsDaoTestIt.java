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
import com.sportsdb.test.entity.TennisServiceStats;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class TennisServiceStatsDaoTestIt {
  static final String inputFile = "TennisServiceStats.json";
  static TennisServiceStatsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private TennisServiceStats[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultTennisServiceStatsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, TennisServiceStats[].class);
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
    TennisServiceStats testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals servicesPlayed ",
        this.records[1].getServicesPlayed(),
        testResult.getServicesPlayed());
    org.junit.Assert.assertEquals(
        "expect equals matchesPlayed ",
        this.records[1].getMatchesPlayed(),
        testResult.getMatchesPlayed());
    org.junit.Assert.assertEquals(
        "expect equals aces ", this.records[1].getAces(), testResult.getAces());
    org.junit.Assert.assertEquals(
        "expect equals firstServicesGood ",
        this.records[1].getFirstServicesGood(),
        testResult.getFirstServicesGood());
    org.junit.Assert.assertEquals(
        "expect equals firstServicesGoodPct ",
        this.records[1].getFirstServicesGoodPct(),
        testResult.getFirstServicesGoodPct());
    org.junit.Assert.assertEquals(
        "expect equals firstServicePointsWon ",
        this.records[1].getFirstServicePointsWon(),
        testResult.getFirstServicePointsWon());
    org.junit.Assert.assertEquals(
        "expect equals firstServicePointsWonPct ",
        this.records[1].getFirstServicePointsWonPct(),
        testResult.getFirstServicePointsWonPct());
    org.junit.Assert.assertEquals(
        "expect equals secondServicePointsWon ",
        this.records[1].getSecondServicePointsWon(),
        testResult.getSecondServicePointsWon());
    org.junit.Assert.assertEquals(
        "expect equals secondServicePointsWonPct ",
        this.records[1].getSecondServicePointsWonPct(),
        testResult.getSecondServicePointsWonPct());
    org.junit.Assert.assertEquals(
        "expect equals serviceGamesPlayed ",
        this.records[1].getServiceGamesPlayed(),
        testResult.getServiceGamesPlayed());
    org.junit.Assert.assertEquals(
        "expect equals serviceGamesWon ",
        this.records[1].getServiceGamesWon(),
        testResult.getServiceGamesWon());
    org.junit.Assert.assertEquals(
        "expect equals serviceGamesWonPct ",
        this.records[1].getServiceGamesWonPct(),
        testResult.getServiceGamesWonPct());
    org.junit.Assert.assertEquals(
        "expect equals breakPointsPlayed ",
        this.records[1].getBreakPointsPlayed(),
        testResult.getBreakPointsPlayed());
    org.junit.Assert.assertEquals(
        "expect equals breakPointsSaved ",
        this.records[1].getBreakPointsSaved(),
        testResult.getBreakPointsSaved());
    org.junit.Assert.assertEquals(
        "expect equals breakPointsSavedPct ",
        this.records[1].getBreakPointsSavedPct(),
        testResult.getBreakPointsSavedPct());
  }
}
