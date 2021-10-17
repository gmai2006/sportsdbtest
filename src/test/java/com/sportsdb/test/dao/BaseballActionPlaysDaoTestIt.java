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
import com.sportsdb.test.entity.BaseballActionPlays;
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

public class BaseballActionPlaysDaoTestIt {
    static final String inputFile = "BaseballActionPlays.json";
    static BaseballActionPlaysDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private BaseballActionPlays[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultBaseballActionPlaysDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, BaseballActionPlays[].class);
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
        BaseballActionPlays testResult = dao.find(records[1].getId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertTrue(
                "expect equals baseballEventStateId ",
                this.records[1].getBaseballEventStateId() == testResult.getBaseballEventStateId());
        org.junit.Assert.assertEquals(
                "expect equals playType ", this.records[1].getPlayType(), testResult.getPlayType());
        org.junit.Assert.assertEquals(
                "expect equals notation ", this.records[1].getNotation(), testResult.getNotation());
        org.junit.Assert.assertEquals(
                "expect equals notationYaml ",
                this.records[1].getNotationYaml(),
                testResult.getNotationYaml());
        org.junit.Assert.assertTrue(
                "expect equals baseballDefensiveGroupId ",
                this.records[1].getBaseballDefensiveGroupId()
                        == testResult.getBaseballDefensiveGroupId());
        org.junit.Assert.assertEquals(
                "expect equals comment ", this.records[1].getComment(), testResult.getComment());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnFirstAdvance ",
                this.records[1].getRunnerOnFirstAdvance() == testResult.getRunnerOnFirstAdvance());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnSecondAdvance ",
                this.records[1].getRunnerOnSecondAdvance()
                        == testResult.getRunnerOnSecondAdvance());
        org.junit.Assert.assertTrue(
                "expect equals runnerOnThirdAdvance ",
                this.records[1].getRunnerOnThirdAdvance() == testResult.getRunnerOnThirdAdvance());
        org.junit.Assert.assertTrue(
                "expect equals outsRecorded ",
                this.records[1].getOutsRecorded() == testResult.getOutsRecorded());
        org.junit.Assert.assertTrue(
                "expect equals rbi ", this.records[1].getRbi() == testResult.getRbi());
        org.junit.Assert.assertTrue(
                "expect equals runsScored ",
                this.records[1].getRunsScored() == testResult.getRunsScored());
        org.junit.Assert.assertEquals(
                "expect equals earnedRunsScored ",
                this.records[1].getEarnedRunsScored(),
                testResult.getEarnedRunsScored());
    }
}
