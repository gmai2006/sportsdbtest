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
import com.sportsdb.test.entity.BaseballPitchingStats;
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

public class BaseballPitchingStatsDaoTestIt {
    static final String inputFile = "BaseballPitchingStats.json";
    static BaseballPitchingStatsDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private BaseballPitchingStats[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultBaseballPitchingStatsDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, BaseballPitchingStats[].class);
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
        BaseballPitchingStats testResult = dao.find(records[1].getId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertTrue(
                "expect equals runsAllowed ",
                this.records[1].getRunsAllowed() == testResult.getRunsAllowed());
        org.junit.Assert.assertTrue(
                "expect equals singlesAllowed ",
                this.records[1].getSinglesAllowed() == testResult.getSinglesAllowed());
        org.junit.Assert.assertTrue(
                "expect equals doublesAllowed ",
                this.records[1].getDoublesAllowed() == testResult.getDoublesAllowed());
        org.junit.Assert.assertTrue(
                "expect equals triplesAllowed ",
                this.records[1].getTriplesAllowed() == testResult.getTriplesAllowed());
        org.junit.Assert.assertTrue(
                "expect equals homeRunsAllowed ",
                this.records[1].getHomeRunsAllowed() == testResult.getHomeRunsAllowed());
        org.junit.Assert.assertEquals(
                "expect equals inningsPitched ",
                this.records[1].getInningsPitched(),
                testResult.getInningsPitched());
        org.junit.Assert.assertTrue(
                "expect equals hits ", this.records[1].getHits() == testResult.getHits());
        org.junit.Assert.assertTrue(
                "expect equals earnedRuns ",
                this.records[1].getEarnedRuns() == testResult.getEarnedRuns());
        org.junit.Assert.assertTrue(
                "expect equals unearnedRuns ",
                this.records[1].getUnearnedRuns() == testResult.getUnearnedRuns());
        org.junit.Assert.assertTrue(
                "expect equals basesOnBalls ",
                this.records[1].getBasesOnBalls() == testResult.getBasesOnBalls());
        org.junit.Assert.assertTrue(
                "expect equals basesOnBallsIntentional ",
                this.records[1].getBasesOnBallsIntentional()
                        == testResult.getBasesOnBallsIntentional());
        org.junit.Assert.assertTrue(
                "expect equals strikeouts ",
                this.records[1].getStrikeouts() == testResult.getStrikeouts());
        org.junit.Assert.assertTrue(
                "expect equals strikeoutToBbRatio ",
                this.records[1].getStrikeoutToBbRatio() == testResult.getStrikeoutToBbRatio());
        org.junit.Assert.assertTrue(
                "expect equals numberOfPitches ",
                this.records[1].getNumberOfPitches() == testResult.getNumberOfPitches());
        org.junit.Assert.assertTrue(
                "expect equals era ", this.records[1].getEra() == testResult.getEra());
        org.junit.Assert.assertTrue(
                "expect equals inheritedRunnersScored ",
                this.records[1].getInheritedRunnersScored()
                        == testResult.getInheritedRunnersScored());
        org.junit.Assert.assertTrue(
                "expect equals pickOffs ",
                this.records[1].getPickOffs() == testResult.getPickOffs());
        org.junit.Assert.assertTrue(
                "expect equals errorsHitWithPitch ",
                this.records[1].getErrorsHitWithPitch() == testResult.getErrorsHitWithPitch());
        org.junit.Assert.assertTrue(
                "expect equals errorsWildPitch ",
                this.records[1].getErrorsWildPitch() == testResult.getErrorsWildPitch());
        org.junit.Assert.assertTrue(
                "expect equals balks ", this.records[1].getBalks() == testResult.getBalks());
        org.junit.Assert.assertTrue(
                "expect equals wins ", this.records[1].getWins() == testResult.getWins());
        org.junit.Assert.assertTrue(
                "expect equals losses ", this.records[1].getLosses() == testResult.getLosses());
        org.junit.Assert.assertTrue(
                "expect equals saves ", this.records[1].getSaves() == testResult.getSaves());
        org.junit.Assert.assertTrue(
                "expect equals shutouts ",
                this.records[1].getShutouts() == testResult.getShutouts());
        org.junit.Assert.assertTrue(
                "expect equals gamesComplete ",
                this.records[1].getGamesComplete() == testResult.getGamesComplete());
        org.junit.Assert.assertTrue(
                "expect equals gamesFinished ",
                this.records[1].getGamesFinished() == testResult.getGamesFinished());
        org.junit.Assert.assertTrue(
                "expect equals winningPercentage ",
                this.records[1].getWinningPercentage() == testResult.getWinningPercentage());
        org.junit.Assert.assertEquals(
                "expect equals eventCredit ",
                this.records[1].getEventCredit(),
                testResult.getEventCredit());
        org.junit.Assert.assertEquals(
                "expect equals saveCredit ",
                this.records[1].getSaveCredit(),
                testResult.getSaveCredit());
    }
}
