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
package com.sportsdb.test.handler;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.CDL;
import org.json.JSONArray;
import com.google.gson.Gson;
import com.sportsdb.test.entity.IceHockeyDefensiveStats;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultIceHockeyDefensiveStatsDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IceHockeyDefensiveStatsHandlerTestIt {
  static final String inputFile = "IceHockeyDefensiveStats.json";
  static IceHockeyDefensiveStatsHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private IceHockeyDefensiveStats[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new IceHockeyDefensiveStatsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/IceHockeyDefensiveStats.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, IceHockeyDefensiveStats[].class);
    assertEquals("match count", count, records.length);
    IceHockeyDefensiveStats testResult =
        jpa.find(IceHockeyDefensiveStats.class, records[0].getId());
    assertEquals(
        "expect equals shotsPowerPlayAllowed ",
        this.records[0].getShotsPowerPlayAllowed(),
        testResult.getShotsPowerPlayAllowed());
    assertEquals(
        "expect equals shotsPenaltyShotAllowed ",
        this.records[0].getShotsPenaltyShotAllowed(),
        testResult.getShotsPenaltyShotAllowed());
    assertEquals(
        "expect equals goalsPowerPlayAllowed ",
        this.records[0].getGoalsPowerPlayAllowed(),
        testResult.getGoalsPowerPlayAllowed());
    assertEquals(
        "expect equals goalsPenaltyShotAllowed ",
        this.records[0].getGoalsPenaltyShotAllowed(),
        testResult.getGoalsPenaltyShotAllowed());
    assertEquals(
        "expect equals goalsAgainstAverage ",
        this.records[0].getGoalsAgainstAverage(),
        testResult.getGoalsAgainstAverage());
    assertEquals("expect equals saves ", this.records[0].getSaves(), testResult.getSaves());
    assertEquals(
        "expect equals savePercentage ",
        this.records[0].getSavePercentage(),
        testResult.getSavePercentage());
    assertEquals(
        "expect equals penaltyKillingAmount ",
        this.records[0].getPenaltyKillingAmount(),
        testResult.getPenaltyKillingAmount());
    assertEquals(
        "expect equals penaltyKillingPercentage ",
        this.records[0].getPenaltyKillingPercentage(),
        testResult.getPenaltyKillingPercentage());
    assertEquals(
        "expect equals shotsBlocked ",
        this.records[0].getShotsBlocked(),
        testResult.getShotsBlocked());
    assertEquals(
        "expect equals takeaways ", this.records[0].getTakeaways(), testResult.getTakeaways());
    assertEquals(
        "expect equals shutouts ", this.records[0].getShutouts(), testResult.getShutouts());
    assertEquals(
        "expect equals minutesPenaltyKilling ",
        this.records[0].getMinutesPenaltyKilling(),
        testResult.getMinutesPenaltyKilling());
    assertEquals("expect equals hits ", this.records[0].getHits(), testResult.getHits());
    assertEquals(
        "expect equals goalsEmptyNetAllowed ",
        this.records[0].getGoalsEmptyNetAllowed(),
        testResult.getGoalsEmptyNetAllowed());
    assertEquals(
        "expect equals goalsShortHandedAllowed ",
        this.records[0].getGoalsShortHandedAllowed(),
        testResult.getGoalsShortHandedAllowed());
    assertEquals(
        "expect equals goalsShootoutAllowed ",
        this.records[0].getGoalsShootoutAllowed(),
        testResult.getGoalsShootoutAllowed());
    assertEquals(
        "expect equals shotsShootoutAllowed ",
        this.records[0].getShotsShootoutAllowed(),
        testResult.getShotsShootoutAllowed());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
