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
import com.sportsdb.test.entity.BaseballPitchingStats;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultBaseballPitchingStatsDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseballPitchingStatsHandlerTestIt {
  static final String inputFile = "BaseballPitchingStats.json";
  static BaseballPitchingStatsHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private BaseballPitchingStats[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new BaseballPitchingStatsHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/BaseballPitchingStats.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, BaseballPitchingStats[].class);
    assertEquals("match count", count, records.length);
    BaseballPitchingStats testResult = jpa.find(BaseballPitchingStats.class, records[0].getId());
    org.junit.Assert.assertEquals(
        "expect equals runsAllowed ",
        this.records[0].getRunsAllowed(),
        testResult.getRunsAllowed());
    org.junit.Assert.assertEquals(
        "expect equals singlesAllowed ",
        this.records[0].getSinglesAllowed(),
        testResult.getSinglesAllowed());
    org.junit.Assert.assertEquals(
        "expect equals doublesAllowed ",
        this.records[0].getDoublesAllowed(),
        testResult.getDoublesAllowed());
    org.junit.Assert.assertEquals(
        "expect equals triplesAllowed ",
        this.records[0].getTriplesAllowed(),
        testResult.getTriplesAllowed());
    org.junit.Assert.assertEquals(
        "expect equals homeRunsAllowed ",
        this.records[0].getHomeRunsAllowed(),
        testResult.getHomeRunsAllowed());
    assertEquals(
        "expect equals inningsPitched ",
        this.records[0].getInningsPitched(),
        testResult.getInningsPitched());
    org.junit.Assert.assertEquals(
        "expect equals hits ", this.records[0].getHits(), testResult.getHits());
    org.junit.Assert.assertEquals(
        "expect equals earnedRuns ", this.records[0].getEarnedRuns(), testResult.getEarnedRuns());
    org.junit.Assert.assertEquals(
        "expect equals unearnedRuns ",
        this.records[0].getUnearnedRuns(),
        testResult.getUnearnedRuns());
    org.junit.Assert.assertEquals(
        "expect equals basesOnBalls ",
        this.records[0].getBasesOnBalls(),
        testResult.getBasesOnBalls());
    org.junit.Assert.assertEquals(
        "expect equals basesOnBallsIntentional ",
        this.records[0].getBasesOnBallsIntentional(),
        testResult.getBasesOnBallsIntentional());
    org.junit.Assert.assertEquals(
        "expect equals strikeouts ", this.records[0].getStrikeouts(), testResult.getStrikeouts());
    org.junit.Assert.assertEquals(
        "expect equals strikeoutToBbRatio ",
        this.records[0].getStrikeoutToBbRatio(),
        testResult.getStrikeoutToBbRatio());
    org.junit.Assert.assertEquals(
        "expect equals numberOfPitches ",
        this.records[0].getNumberOfPitches(),
        testResult.getNumberOfPitches());
    org.junit.Assert.assertEquals(
        "expect equals era ", this.records[0].getEra(), testResult.getEra());
    org.junit.Assert.assertEquals(
        "expect equals inheritedRunnersScored ",
        this.records[0].getInheritedRunnersScored(),
        testResult.getInheritedRunnersScored());
    org.junit.Assert.assertEquals(
        "expect equals pickOffs ", this.records[0].getPickOffs(), testResult.getPickOffs());
    org.junit.Assert.assertEquals(
        "expect equals errorsHitWithPitch ",
        this.records[0].getErrorsHitWithPitch(),
        testResult.getErrorsHitWithPitch());
    org.junit.Assert.assertEquals(
        "expect equals errorsWildPitch ",
        this.records[0].getErrorsWildPitch(),
        testResult.getErrorsWildPitch());
    org.junit.Assert.assertEquals(
        "expect equals balks ", this.records[0].getBalks(), testResult.getBalks());
    org.junit.Assert.assertEquals(
        "expect equals wins ", this.records[0].getWins(), testResult.getWins());
    org.junit.Assert.assertEquals(
        "expect equals losses ", this.records[0].getLosses(), testResult.getLosses());
    org.junit.Assert.assertEquals(
        "expect equals saves ", this.records[0].getSaves(), testResult.getSaves());
    org.junit.Assert.assertEquals(
        "expect equals shutouts ", this.records[0].getShutouts(), testResult.getShutouts());
    org.junit.Assert.assertEquals(
        "expect equals gamesComplete ",
        this.records[0].getGamesComplete(),
        testResult.getGamesComplete());
    org.junit.Assert.assertEquals(
        "expect equals gamesFinished ",
        this.records[0].getGamesFinished(),
        testResult.getGamesFinished());
    org.junit.Assert.assertEquals(
        "expect equals winningPercentage ",
        this.records[0].getWinningPercentage(),
        testResult.getWinningPercentage());
    assertEquals(
        "expect equals eventCredit ",
        this.records[0].getEventCredit(),
        testResult.getEventCredit());
    assertEquals(
        "expect equals saveCredit ", this.records[0].getSaveCredit(), testResult.getSaveCredit());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
