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
import com.sportsdb.test.entity.TennisEventStates;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class TennisEventStatesDaoTestIt {
  static final String inputFile = "TennisEventStates.json";
  static TennisEventStatesDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private TennisEventStates[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultTennisEventStatesDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, TennisEventStates[].class);
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
    TennisEventStates testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals eventId ", this.records[1].getEventId() == testResult.getEventId());
    org.junit.Assert.assertTrue(
        "expect equals currentState ",
        this.records[1].getCurrentState() == testResult.getCurrentState());
    org.junit.Assert.assertTrue(
        "expect equals sequenceNumber ",
        this.records[1].getSequenceNumber() == testResult.getSequenceNumber());
    org.junit.Assert.assertEquals(
        "expect equals tennisSet ", this.records[1].getTennisSet(), testResult.getTennisSet());
    org.junit.Assert.assertEquals(
        "expect equals game ", this.records[1].getGame(), testResult.getGame());
    org.junit.Assert.assertTrue(
        "expect equals serverPersonId ",
        this.records[1].getServerPersonId() == testResult.getServerPersonId());
    org.junit.Assert.assertEquals(
        "expect equals serverScore ",
        this.records[1].getServerScore(),
        testResult.getServerScore());
    org.junit.Assert.assertTrue(
        "expect equals receiverPersonId ",
        this.records[1].getReceiverPersonId() == testResult.getReceiverPersonId());
    org.junit.Assert.assertEquals(
        "expect equals receiverScore ",
        this.records[1].getReceiverScore(),
        testResult.getReceiverScore());
    org.junit.Assert.assertEquals(
        "expect equals serviceNumber ",
        this.records[1].getServiceNumber(),
        testResult.getServiceNumber());
    org.junit.Assert.assertEquals(
        "expect equals context ", this.records[1].getContext(), testResult.getContext());
  }
}
