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
import com.sportsdb.test.entity.BaseballOffensiveStats;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class BaseballOffensiveStatsDaoTestIt {
  static final String inputFile = "BaseballOffensiveStats.json";
  static BaseballOffensiveStatsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private BaseballOffensiveStats[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultBaseballOffensiveStatsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, BaseballOffensiveStats[].class);
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
    BaseballOffensiveStats testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals average ", this.records[1].getAverage() == testResult.getAverage());
    org.junit.Assert.assertTrue(
        "expect equals runsScored ", this.records[1].getRunsScored() == testResult.getRunsScored());
    org.junit.Assert.assertTrue(
        "expect equals atBats ", this.records[1].getAtBats() == testResult.getAtBats());
    org.junit.Assert.assertTrue(
        "expect equals hits ", this.records[1].getHits() == testResult.getHits());
    org.junit.Assert.assertTrue(
        "expect equals rbi ", this.records[1].getRbi() == testResult.getRbi());
    org.junit.Assert.assertTrue(
        "expect equals totalBases ", this.records[1].getTotalBases() == testResult.getTotalBases());
    org.junit.Assert.assertTrue(
        "expect equals sluggingPercentage ",
        this.records[1].getSluggingPercentage() == testResult.getSluggingPercentage());
    org.junit.Assert.assertTrue(
        "expect equals basesOnBalls ",
        this.records[1].getBasesOnBalls() == testResult.getBasesOnBalls());
    org.junit.Assert.assertTrue(
        "expect equals strikeouts ", this.records[1].getStrikeouts() == testResult.getStrikeouts());
    org.junit.Assert.assertTrue(
        "expect equals leftOnBase ", this.records[1].getLeftOnBase() == testResult.getLeftOnBase());
    org.junit.Assert.assertTrue(
        "expect equals leftInScoringPosition ",
        this.records[1].getLeftInScoringPosition() == testResult.getLeftInScoringPosition());
    org.junit.Assert.assertTrue(
        "expect equals singles ", this.records[1].getSingles() == testResult.getSingles());
    org.junit.Assert.assertTrue(
        "expect equals doubles ", this.records[1].getDoubles() == testResult.getDoubles());
    org.junit.Assert.assertTrue(
        "expect equals triples ", this.records[1].getTriples() == testResult.getTriples());
    org.junit.Assert.assertTrue(
        "expect equals homeRuns ", this.records[1].getHomeRuns() == testResult.getHomeRuns());
    org.junit.Assert.assertTrue(
        "expect equals grandSlams ", this.records[1].getGrandSlams() == testResult.getGrandSlams());
    org.junit.Assert.assertTrue(
        "expect equals atBatsPerRbi ",
        this.records[1].getAtBatsPerRbi() == testResult.getAtBatsPerRbi());
    org.junit.Assert.assertTrue(
        "expect equals plateAppearancesPerRbi ",
        this.records[1].getPlateAppearancesPerRbi() == testResult.getPlateAppearancesPerRbi());
    org.junit.Assert.assertTrue(
        "expect equals atBatsPerHomeRun ",
        this.records[1].getAtBatsPerHomeRun() == testResult.getAtBatsPerHomeRun());
    org.junit.Assert.assertTrue(
        "expect equals plateAppearancesPerHomeRun ",
        this.records[1].getPlateAppearancesPerHomeRun()
            == testResult.getPlateAppearancesPerHomeRun());
    org.junit.Assert.assertTrue(
        "expect equals sacFlies ", this.records[1].getSacFlies() == testResult.getSacFlies());
    org.junit.Assert.assertTrue(
        "expect equals sacBunts ", this.records[1].getSacBunts() == testResult.getSacBunts());
    org.junit.Assert.assertTrue(
        "expect equals groundedIntoDoublePlay ",
        this.records[1].getGroundedIntoDoublePlay() == testResult.getGroundedIntoDoublePlay());
    org.junit.Assert.assertTrue(
        "expect equals movedUp ", this.records[1].getMovedUp() == testResult.getMovedUp());
    org.junit.Assert.assertTrue(
        "expect equals onBasePercentage ",
        this.records[1].getOnBasePercentage() == testResult.getOnBasePercentage());
    org.junit.Assert.assertTrue(
        "expect equals stolenBases ",
        this.records[1].getStolenBases() == testResult.getStolenBases());
    org.junit.Assert.assertTrue(
        "expect equals stolenBasesCaught ",
        this.records[1].getStolenBasesCaught() == testResult.getStolenBasesCaught());
    org.junit.Assert.assertTrue(
        "expect equals stolenBasesAverage ",
        this.records[1].getStolenBasesAverage() == testResult.getStolenBasesAverage());
    org.junit.Assert.assertTrue(
        "expect equals hitByPitch ", this.records[1].getHitByPitch() == testResult.getHitByPitch());
    org.junit.Assert.assertTrue(
        "expect equals defensiveInterferanceReaches ",
        this.records[1].getDefensiveInterferanceReaches()
            == testResult.getDefensiveInterferanceReaches());
    org.junit.Assert.assertTrue(
        "expect equals onBasePlusSlugging ",
        this.records[1].getOnBasePlusSlugging() == testResult.getOnBasePlusSlugging());
    org.junit.Assert.assertTrue(
        "expect equals plateAppearances ",
        this.records[1].getPlateAppearances() == testResult.getPlateAppearances());
    org.junit.Assert.assertTrue(
        "expect equals hitsExtraBase ",
        this.records[1].getHitsExtraBase() == testResult.getHitsExtraBase());
  }
}
