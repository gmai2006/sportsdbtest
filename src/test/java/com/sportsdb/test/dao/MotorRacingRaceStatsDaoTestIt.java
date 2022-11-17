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
import com.sportsdb.test.entity.MotorRacingRaceStats;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class MotorRacingRaceStatsDaoTestIt {
  static final String inputFile = "MotorRacingRaceStats.json";
  static MotorRacingRaceStatsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private MotorRacingRaceStats[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultMotorRacingRaceStatsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MotorRacingRaceStats[].class);
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
    MotorRacingRaceStats testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals timeBehindLeader ",
        this.records[1].getTimeBehindLeader(),
        testResult.getTimeBehindLeader());
    org.junit.Assert.assertEquals(
        "expect equals lapsBehindLeader ",
        this.records[1].getLapsBehindLeader(),
        testResult.getLapsBehindLeader());
    org.junit.Assert.assertEquals(
        "expect equals timeAheadFollower ",
        this.records[1].getTimeAheadFollower(),
        testResult.getTimeAheadFollower());
    org.junit.Assert.assertEquals(
        "expect equals lapsAheadFollower ",
        this.records[1].getLapsAheadFollower(),
        testResult.getLapsAheadFollower());
    org.junit.Assert.assertEquals(
        "expect equals time ", this.records[1].getTime(), testResult.getTime());
    org.junit.Assert.assertEquals(
        "expect equals points ", this.records[1].getPoints(), testResult.getPoints());
    org.junit.Assert.assertEquals(
        "expect equals pointsRookie ",
        this.records[1].getPointsRookie(),
        testResult.getPointsRookie());
    org.junit.Assert.assertEquals(
        "expect equals bonus ", this.records[1].getBonus(), testResult.getBonus());
    org.junit.Assert.assertEquals(
        "expect equals lapsCompleted ",
        this.records[1].getLapsCompleted(),
        testResult.getLapsCompleted());
    org.junit.Assert.assertEquals(
        "expect equals lapsLeadingTotal ",
        this.records[1].getLapsLeadingTotal(),
        testResult.getLapsLeadingTotal());
    org.junit.Assert.assertEquals(
        "expect equals distanceLeading ",
        this.records[1].getDistanceLeading(),
        testResult.getDistanceLeading());
    org.junit.Assert.assertEquals(
        "expect equals distanceCompleted ",
        this.records[1].getDistanceCompleted(),
        testResult.getDistanceCompleted());
    org.junit.Assert.assertEquals(
        "expect equals distanceUnits ",
        this.records[1].getDistanceUnits(),
        testResult.getDistanceUnits());
    org.junit.Assert.assertEquals(
        "expect equals speedAverage ",
        this.records[1].getSpeedAverage(),
        testResult.getSpeedAverage());
    org.junit.Assert.assertEquals(
        "expect equals speedUnits ", this.records[1].getSpeedUnits(), testResult.getSpeedUnits());
    org.junit.Assert.assertEquals(
        "expect equals status ", this.records[1].getStatus(), testResult.getStatus());
    org.junit.Assert.assertEquals(
        "expect equals finishesTop5 ",
        this.records[1].getFinishesTop5(),
        testResult.getFinishesTop5());
    org.junit.Assert.assertEquals(
        "expect equals finishesTop10 ",
        this.records[1].getFinishesTop10(),
        testResult.getFinishesTop10());
    org.junit.Assert.assertEquals(
        "expect equals starts ", this.records[1].getStarts(), testResult.getStarts());
    org.junit.Assert.assertEquals(
        "expect equals finishes ", this.records[1].getFinishes(), testResult.getFinishes());
    org.junit.Assert.assertEquals(
        "expect equals nonFinishes ",
        this.records[1].getNonFinishes(),
        testResult.getNonFinishes());
    org.junit.Assert.assertEquals(
        "expect equals wins ", this.records[1].getWins(), testResult.getWins());
    org.junit.Assert.assertEquals(
        "expect equals racesLeading ",
        this.records[1].getRacesLeading(),
        testResult.getRacesLeading());
    org.junit.Assert.assertEquals(
        "expect equals money ", this.records[1].getMoney(), testResult.getMoney());
    org.junit.Assert.assertEquals(
        "expect equals moneyUnits ", this.records[1].getMoneyUnits(), testResult.getMoneyUnits());
    org.junit.Assert.assertEquals(
        "expect equals leadsTotal ", this.records[1].getLeadsTotal(), testResult.getLeadsTotal());
  }
}
