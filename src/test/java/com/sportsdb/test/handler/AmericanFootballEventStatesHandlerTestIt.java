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
import com.sportsdb.test.entity.AmericanFootballEventStates;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.dao.DefaultAmericanFootballEventStatesDao;
import com.sportsdb.test.utils.DelimiterParser;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AmericanFootballEventStatesHandlerTestIt {
  static final String inputFile = "AmericanFootballEventStates.json";
  static AmericanFootballEventStatesHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private AmericanFootballEventStates[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new AmericanFootballEventStatesHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/AmericanFootballEventStates.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, AmericanFootballEventStates[].class);
    assertEquals("match count", count, records.length);
    AmericanFootballEventStates testResult =
        jpa.find(AmericanFootballEventStates.class, records[0].getId());
    org.junit.Assert.assertEquals(
        "expect equals eventId ", this.records[0].getEventId(), testResult.getEventId());
    org.junit.Assert.assertEquals(
        "expect equals currentState ",
        this.records[0].getCurrentState(),
        testResult.getCurrentState());
    org.junit.Assert.assertEquals(
        "expect equals sequenceNumber ",
        this.records[0].getSequenceNumber(),
        testResult.getSequenceNumber());
    org.junit.Assert.assertEquals(
        "expect equals periodValue ",
        this.records[0].getPeriodValue(),
        testResult.getPeriodValue());
    assertEquals(
        "expect equals periodTimeElapsed ",
        this.records[0].getPeriodTimeElapsed(),
        testResult.getPeriodTimeElapsed());
    assertEquals(
        "expect equals periodTimeRemaining ",
        this.records[0].getPeriodTimeRemaining(),
        testResult.getPeriodTimeRemaining());
    assertEquals(
        "expect equals clockState ", this.records[0].getClockState(), testResult.getClockState());
    org.junit.Assert.assertEquals(
        "expect equals down ", this.records[0].getDown(), testResult.getDown());
    org.junit.Assert.assertEquals(
        "expect equals teamInPossessionId ",
        this.records[0].getTeamInPossessionId(),
        testResult.getTeamInPossessionId());
    org.junit.Assert.assertEquals(
        "expect equals distanceFor1stDown ",
        this.records[0].getDistanceFor1stDown(),
        testResult.getDistanceFor1stDown());
    assertEquals(
        "expect equals fieldSide ", this.records[0].getFieldSide(), testResult.getFieldSide());
    org.junit.Assert.assertEquals(
        "expect equals fieldLine ", this.records[0].getFieldLine(), testResult.getFieldLine());
    assertEquals("expect equals context ", this.records[0].getContext(), testResult.getContext());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
