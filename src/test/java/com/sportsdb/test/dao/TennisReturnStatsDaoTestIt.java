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
import com.sportsdb.test.entity.TennisReturnStats;
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

public class TennisReturnStatsDaoTestIt {
    static final String inputFile = "TennisReturnStats.json";
    static TennisReturnStatsDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private TennisReturnStats[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultTennisReturnStatsDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, TennisReturnStats[].class);
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
        TennisReturnStats testResult = dao.find(records[1].getId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertEquals(
                "expect equals returnsPlayed ",
                this.records[1].getReturnsPlayed(),
                testResult.getReturnsPlayed());
        org.junit.Assert.assertEquals(
                "expect equals matchesPlayed ",
                this.records[1].getMatchesPlayed(),
                testResult.getMatchesPlayed());
        org.junit.Assert.assertEquals(
                "expect equals firstServiceReturnPointsWon ",
                this.records[1].getFirstServiceReturnPointsWon(),
                testResult.getFirstServiceReturnPointsWon());
        org.junit.Assert.assertEquals(
                "expect equals firstServiceReturnPointsWonPct ",
                this.records[1].getFirstServiceReturnPointsWonPct(),
                testResult.getFirstServiceReturnPointsWonPct());
        org.junit.Assert.assertEquals(
                "expect equals secondServiceReturnPointsWon ",
                this.records[1].getSecondServiceReturnPointsWon(),
                testResult.getSecondServiceReturnPointsWon());
        org.junit.Assert.assertEquals(
                "expect equals secondServiceReturnPointsWonPct ",
                this.records[1].getSecondServiceReturnPointsWonPct(),
                testResult.getSecondServiceReturnPointsWonPct());
        org.junit.Assert.assertEquals(
                "expect equals returnGamesPlayed ",
                this.records[1].getReturnGamesPlayed(),
                testResult.getReturnGamesPlayed());
        org.junit.Assert.assertEquals(
                "expect equals returnGamesWon ",
                this.records[1].getReturnGamesWon(),
                testResult.getReturnGamesWon());
        org.junit.Assert.assertEquals(
                "expect equals returnGamesWonPct ",
                this.records[1].getReturnGamesWonPct(),
                testResult.getReturnGamesWonPct());
        org.junit.Assert.assertEquals(
                "expect equals breakPointsPlayed ",
                this.records[1].getBreakPointsPlayed(),
                testResult.getBreakPointsPlayed());
        org.junit.Assert.assertEquals(
                "expect equals breakPointsConverted ",
                this.records[1].getBreakPointsConverted(),
                testResult.getBreakPointsConverted());
        org.junit.Assert.assertEquals(
                "expect equals breakPointsConvertedPct ",
                this.records[1].getBreakPointsConvertedPct(),
                testResult.getBreakPointsConvertedPct());
    }
}
