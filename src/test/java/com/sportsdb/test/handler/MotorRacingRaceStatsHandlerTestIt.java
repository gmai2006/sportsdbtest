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
import com.sportsdb.test.entity.MotorRacingRaceStats;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultMotorRacingRaceStatsDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MotorRacingRaceStatsHandlerTestIt {
  static final String inputFile = "MotorRacingRaceStats.json";
  static MotorRacingRaceStatsHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private MotorRacingRaceStats[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new MotorRacingRaceStatsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/MotorRacingRaceStats.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, MotorRacingRaceStats[].class);
    assertEquals("match count", count, records.length);
    MotorRacingRaceStats testResult = jpa.find(MotorRacingRaceStats.class, records[0].getId());
    assertEquals(
        "expect equals timeBehindLeader ",
        this.records[0].getTimeBehindLeader(),
        testResult.getTimeBehindLeader());
    assertEquals(
        "expect equals lapsBehindLeader ",
        this.records[0].getLapsBehindLeader(),
        testResult.getLapsBehindLeader());
    assertEquals(
        "expect equals timeAheadFollower ",
        this.records[0].getTimeAheadFollower(),
        testResult.getTimeAheadFollower());
    assertEquals(
        "expect equals lapsAheadFollower ",
        this.records[0].getLapsAheadFollower(),
        testResult.getLapsAheadFollower());
    assertEquals("expect equals time ", this.records[0].getTime(), testResult.getTime());
    assertEquals("expect equals points ", this.records[0].getPoints(), testResult.getPoints());
    assertEquals(
        "expect equals pointsRookie ",
        this.records[0].getPointsRookie(),
        testResult.getPointsRookie());
    assertEquals("expect equals bonus ", this.records[0].getBonus(), testResult.getBonus());
    assertEquals(
        "expect equals lapsCompleted ",
        this.records[0].getLapsCompleted(),
        testResult.getLapsCompleted());
    assertEquals(
        "expect equals lapsLeadingTotal ",
        this.records[0].getLapsLeadingTotal(),
        testResult.getLapsLeadingTotal());
    assertEquals(
        "expect equals distanceLeading ",
        this.records[0].getDistanceLeading(),
        testResult.getDistanceLeading());
    assertEquals(
        "expect equals distanceCompleted ",
        this.records[0].getDistanceCompleted(),
        testResult.getDistanceCompleted());
    assertEquals(
        "expect equals distanceUnits ",
        this.records[0].getDistanceUnits(),
        testResult.getDistanceUnits());
    assertEquals(
        "expect equals speedAverage ",
        this.records[0].getSpeedAverage(),
        testResult.getSpeedAverage());
    assertEquals(
        "expect equals speedUnits ", this.records[0].getSpeedUnits(), testResult.getSpeedUnits());
    assertEquals("expect equals status ", this.records[0].getStatus(), testResult.getStatus());
    assertEquals(
        "expect equals finishesTop5 ",
        this.records[0].getFinishesTop5(),
        testResult.getFinishesTop5());
    assertEquals(
        "expect equals finishesTop10 ",
        this.records[0].getFinishesTop10(),
        testResult.getFinishesTop10());
    assertEquals("expect equals starts ", this.records[0].getStarts(), testResult.getStarts());
    assertEquals(
        "expect equals finishes ", this.records[0].getFinishes(), testResult.getFinishes());
    assertEquals(
        "expect equals nonFinishes ",
        this.records[0].getNonFinishes(),
        testResult.getNonFinishes());
    assertEquals("expect equals wins ", this.records[0].getWins(), testResult.getWins());
    assertEquals(
        "expect equals racesLeading ",
        this.records[0].getRacesLeading(),
        testResult.getRacesLeading());
    assertEquals("expect equals money ", this.records[0].getMoney(), testResult.getMoney());
    assertEquals(
        "expect equals moneyUnits ", this.records[0].getMoneyUnits(), testResult.getMoneyUnits());
    assertEquals(
        "expect equals leadsTotal ", this.records[0].getLeadsTotal(), testResult.getLeadsTotal());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
