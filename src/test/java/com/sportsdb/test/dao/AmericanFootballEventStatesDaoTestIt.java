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

import static org.junit.Assert.assertNotNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sportsdb.test.entity.AmericanFootballEventStates;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AmericanFootballEventStatesDaoTestIt {
    static final String inputFile = "AmericanFootballEventStates.json";
    static AmericanFootballEventStatesDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private AmericanFootballEventStates[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultAmericanFootballEventStatesDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, AmericanFootballEventStates[].class);
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
        AmericanFootballEventStates testResult = dao.find(records[1].getId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertTrue(
                "expect equals eventId ", this.records[1].getEventId() == testResult.getEventId());
        org.junit.Assert.assertTrue(
                "expect equals currentState ",
                this.records[1].getCurrentState() == testResult.getCurrentState());
        org.junit.Assert.assertTrue(
                "expect equals sequenceNumber ",
                this.records[1].getSequenceNumber() == testResult.getSequenceNumber());
        org.junit.Assert.assertTrue(
                "expect equals periodValue ",
                this.records[1].getPeriodValue() == testResult.getPeriodValue());
        org.junit.Assert.assertEquals(
                "expect equals periodTimeElapsed ",
                this.records[1].getPeriodTimeElapsed(),
                testResult.getPeriodTimeElapsed());
        org.junit.Assert.assertEquals(
                "expect equals periodTimeRemaining ",
                this.records[1].getPeriodTimeRemaining(),
                testResult.getPeriodTimeRemaining());
        org.junit.Assert.assertEquals(
                "expect equals clockState ",
                this.records[1].getClockState(),
                testResult.getClockState());
        org.junit.Assert.assertTrue(
                "expect equals down ", this.records[1].getDown() == testResult.getDown());
        org.junit.Assert.assertTrue(
                "expect equals teamInPossessionId ",
                this.records[1].getTeamInPossessionId() == testResult.getTeamInPossessionId());
        org.junit.Assert.assertTrue(
                "expect equals distanceFor1stDown ",
                this.records[1].getDistanceFor1stDown() == testResult.getDistanceFor1stDown());
        org.junit.Assert.assertEquals(
                "expect equals fieldSide ",
                this.records[1].getFieldSide(),
                testResult.getFieldSide());
        org.junit.Assert.assertTrue(
                "expect equals fieldLine ",
                this.records[1].getFieldLine() == testResult.getFieldLine());
        org.junit.Assert.assertEquals(
                "expect equals context ", this.records[1].getContext(), testResult.getContext());
    }
}
