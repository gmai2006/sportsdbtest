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
import com.sportsdb.test.entity.IceHockeyDefensiveStats;
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

public class IceHockeyDefensiveStatsDaoTestIt {
    static final String inputFile = "IceHockeyDefensiveStats.json";
    static IceHockeyDefensiveStatsDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private IceHockeyDefensiveStats[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultIceHockeyDefensiveStatsDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, IceHockeyDefensiveStats[].class);
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
        IceHockeyDefensiveStats testResult = dao.find(records[1].getId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertEquals(
                "expect equals shotsPowerPlayAllowed ",
                this.records[1].getShotsPowerPlayAllowed(),
                testResult.getShotsPowerPlayAllowed());
        org.junit.Assert.assertEquals(
                "expect equals shotsPenaltyShotAllowed ",
                this.records[1].getShotsPenaltyShotAllowed(),
                testResult.getShotsPenaltyShotAllowed());
        org.junit.Assert.assertEquals(
                "expect equals goalsPowerPlayAllowed ",
                this.records[1].getGoalsPowerPlayAllowed(),
                testResult.getGoalsPowerPlayAllowed());
        org.junit.Assert.assertEquals(
                "expect equals goalsPenaltyShotAllowed ",
                this.records[1].getGoalsPenaltyShotAllowed(),
                testResult.getGoalsPenaltyShotAllowed());
        org.junit.Assert.assertEquals(
                "expect equals goalsAgainstAverage ",
                this.records[1].getGoalsAgainstAverage(),
                testResult.getGoalsAgainstAverage());
        org.junit.Assert.assertEquals(
                "expect equals saves ", this.records[1].getSaves(), testResult.getSaves());
        org.junit.Assert.assertEquals(
                "expect equals savePercentage ",
                this.records[1].getSavePercentage(),
                testResult.getSavePercentage());
        org.junit.Assert.assertEquals(
                "expect equals penaltyKillingAmount ",
                this.records[1].getPenaltyKillingAmount(),
                testResult.getPenaltyKillingAmount());
        org.junit.Assert.assertEquals(
                "expect equals penaltyKillingPercentage ",
                this.records[1].getPenaltyKillingPercentage(),
                testResult.getPenaltyKillingPercentage());
        org.junit.Assert.assertEquals(
                "expect equals shotsBlocked ",
                this.records[1].getShotsBlocked(),
                testResult.getShotsBlocked());
        org.junit.Assert.assertEquals(
                "expect equals takeaways ",
                this.records[1].getTakeaways(),
                testResult.getTakeaways());
        org.junit.Assert.assertEquals(
                "expect equals shutouts ", this.records[1].getShutouts(), testResult.getShutouts());
        org.junit.Assert.assertEquals(
                "expect equals minutesPenaltyKilling ",
                this.records[1].getMinutesPenaltyKilling(),
                testResult.getMinutesPenaltyKilling());
        org.junit.Assert.assertEquals(
                "expect equals hits ", this.records[1].getHits(), testResult.getHits());
        org.junit.Assert.assertEquals(
                "expect equals goalsEmptyNetAllowed ",
                this.records[1].getGoalsEmptyNetAllowed(),
                testResult.getGoalsEmptyNetAllowed());
        org.junit.Assert.assertEquals(
                "expect equals goalsShortHandedAllowed ",
                this.records[1].getGoalsShortHandedAllowed(),
                testResult.getGoalsShortHandedAllowed());
        org.junit.Assert.assertEquals(
                "expect equals goalsShootoutAllowed ",
                this.records[1].getGoalsShootoutAllowed(),
                testResult.getGoalsShootoutAllowed());
        org.junit.Assert.assertEquals(
                "expect equals shotsShootoutAllowed ",
                this.records[1].getShotsShootoutAllowed(),
                testResult.getShotsShootoutAllowed());
    }
}
