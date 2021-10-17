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
import com.sportsdb.test.entity.BaseballEventStates;
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

public class BaseballEventStatesDaoTestIt {
    static final String inputFile = "BaseballEventStates.json";
    static BaseballEventStatesDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private BaseballEventStates[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultBaseballEventStatesDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, BaseballEventStates[].class);
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
        BaseballEventStates testResult = dao.find(records[1].getId());
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
                "expect equals atBatNumber ",
                this.records[1].getAtBatNumber() == testResult.getAtBatNumber());
        org.junit.Assert.assertTrue(
                "expect equals inningValue ",
                this.records[1].getInningValue() == testResult.getInningValue());
        org.junit.Assert.assertEquals(
                "expect equals inningHalf ",
                this.records[1].getInningHalf(),
                testResult.getInningHalf());
        org.junit.Assert.assertTrue(
                "expect equals outs ", this.records[1].getOuts() == testResult.getOuts());
        org.junit.Assert.assertTrue(
                "expect equals balls ", this.records[1].getBalls() == testResult.getBalls());
        org.junit.Assert.assertTrue(
                "expect equals strikes ", this.records[1].getStrikes() == testResult.getStrikes());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnFirstId ",
                this.records[1].getRunnerOnFirstId() == testResult.getRunnerOnFirstId());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnSecondId ",
                this.records[1].getRunnerOnSecondId() == testResult.getRunnerOnSecondId());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnThirdId ",
                this.records[1].getRunnerOnThirdId() == testResult.getRunnerOnThirdId());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnFirst ",
                this.records[1].getRunnerOnFirst() == testResult.getRunnerOnFirst());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnSecond ",
                this.records[1].getRunnerOnSecond() == testResult.getRunnerOnSecond());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnThird ",
                this.records[1].getRunnerOnThird() == testResult.getRunnerOnThird());
        org.junit.Assert.assertTrue(
                "expect equals runsThisInningHalf ",
                this.records[1].getRunsThisInningHalf() == testResult.getRunsThisInningHalf());
        org.junit.Assert.assertTrue(
                "expect equals pitcherId ",
                this.records[1].getPitcherId() == testResult.getPitcherId());
        org.junit.Assert.assertTrue(
                "expect equals batterId ",
                this.records[1].getBatterId() == testResult.getBatterId());
        org.junit.Assert.assertEquals(
                "expect equals batterSide ",
                this.records[1].getBatterSide(),
                testResult.getBatterSide());
        org.junit.Assert.assertEquals(
                "expect equals context ", this.records[1].getContext(), testResult.getContext());
    }
}
