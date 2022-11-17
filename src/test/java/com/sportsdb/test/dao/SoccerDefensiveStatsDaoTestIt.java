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
import com.sportsdb.test.entity.SoccerDefensiveStats;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class SoccerDefensiveStatsDaoTestIt {
  static final String inputFile = "SoccerDefensiveStats.json";
  static SoccerDefensiveStatsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SoccerDefensiveStats[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultSoccerDefensiveStatsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SoccerDefensiveStats[].class);
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
    SoccerDefensiveStats testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals shotsPenaltyShotAllowed ",
        this.records[1].getShotsPenaltyShotAllowed(),
        testResult.getShotsPenaltyShotAllowed());
    org.junit.Assert.assertEquals(
        "expect equals goalsPenaltyShotAllowed ",
        this.records[1].getGoalsPenaltyShotAllowed(),
        testResult.getGoalsPenaltyShotAllowed());
    org.junit.Assert.assertEquals(
        "expect equals goalsAgainstAverage ",
        this.records[1].getGoalsAgainstAverage(),
        testResult.getGoalsAgainstAverage());
    org.junit.Assert.assertEquals(
        "expect equals goalsAgainstTotal ",
        this.records[1].getGoalsAgainstTotal(),
        testResult.getGoalsAgainstTotal());
    org.junit.Assert.assertEquals(
        "expect equals saves ", this.records[1].getSaves(), testResult.getSaves());
    org.junit.Assert.assertEquals(
        "expect equals savePercentage ",
        this.records[1].getSavePercentage(),
        testResult.getSavePercentage());
    org.junit.Assert.assertEquals(
        "expect equals catchesPunches ",
        this.records[1].getCatchesPunches(),
        testResult.getCatchesPunches());
    org.junit.Assert.assertEquals(
        "expect equals shotsOnGoalTotal ",
        this.records[1].getShotsOnGoalTotal(),
        testResult.getShotsOnGoalTotal());
    org.junit.Assert.assertEquals(
        "expect equals shotsShootoutTotal ",
        this.records[1].getShotsShootoutTotal(),
        testResult.getShotsShootoutTotal());
    org.junit.Assert.assertEquals(
        "expect equals shotsShootoutAllowed ",
        this.records[1].getShotsShootoutAllowed(),
        testResult.getShotsShootoutAllowed());
    org.junit.Assert.assertEquals(
        "expect equals shotsBlocked ",
        this.records[1].getShotsBlocked(),
        testResult.getShotsBlocked());
    org.junit.Assert.assertEquals(
        "expect equals shutouts ", this.records[1].getShutouts(), testResult.getShutouts());
  }
}
