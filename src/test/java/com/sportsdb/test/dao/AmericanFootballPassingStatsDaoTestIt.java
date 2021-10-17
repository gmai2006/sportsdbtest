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
import com.sportsdb.test.entity.AmericanFootballPassingStats;
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

public class AmericanFootballPassingStatsDaoTestIt {
    static final String inputFile = "AmericanFootballPassingStats.json";
    static AmericanFootballPassingStatsDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private AmericanFootballPassingStats[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultAmericanFootballPassingStatsDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, AmericanFootballPassingStats[].class);
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
        AmericanFootballPassingStats testResult = dao.find(records[1].getId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertEquals(
                "expect equals passesAttempts ",
                this.records[1].getPassesAttempts(),
                testResult.getPassesAttempts());
        org.junit.Assert.assertEquals(
                "expect equals passesCompletions ",
                this.records[1].getPassesCompletions(),
                testResult.getPassesCompletions());
        org.junit.Assert.assertEquals(
                "expect equals passesPercentage ",
                this.records[1].getPassesPercentage(),
                testResult.getPassesPercentage());
        org.junit.Assert.assertEquals(
                "expect equals passesYardsGross ",
                this.records[1].getPassesYardsGross(),
                testResult.getPassesYardsGross());
        org.junit.Assert.assertEquals(
                "expect equals passesYardsNet ",
                this.records[1].getPassesYardsNet(),
                testResult.getPassesYardsNet());
        org.junit.Assert.assertEquals(
                "expect equals passesYardsLost ",
                this.records[1].getPassesYardsLost(),
                testResult.getPassesYardsLost());
        org.junit.Assert.assertEquals(
                "expect equals passesTouchdowns ",
                this.records[1].getPassesTouchdowns(),
                testResult.getPassesTouchdowns());
        org.junit.Assert.assertEquals(
                "expect equals passesTouchdownsPercentage ",
                this.records[1].getPassesTouchdownsPercentage(),
                testResult.getPassesTouchdownsPercentage());
        org.junit.Assert.assertEquals(
                "expect equals passesInterceptions ",
                this.records[1].getPassesInterceptions(),
                testResult.getPassesInterceptions());
        org.junit.Assert.assertEquals(
                "expect equals passesInterceptionsPercentage ",
                this.records[1].getPassesInterceptionsPercentage(),
                testResult.getPassesInterceptionsPercentage());
        org.junit.Assert.assertEquals(
                "expect equals passesLongest ",
                this.records[1].getPassesLongest(),
                testResult.getPassesLongest());
        org.junit.Assert.assertEquals(
                "expect equals passesAverageYardsPer ",
                this.records[1].getPassesAverageYardsPer(),
                testResult.getPassesAverageYardsPer());
        org.junit.Assert.assertEquals(
                "expect equals passerRating ",
                this.records[1].getPasserRating(),
                testResult.getPasserRating());
        org.junit.Assert.assertEquals(
                "expect equals receptionsTotal ",
                this.records[1].getReceptionsTotal(),
                testResult.getReceptionsTotal());
        org.junit.Assert.assertEquals(
                "expect equals receptionsYards ",
                this.records[1].getReceptionsYards(),
                testResult.getReceptionsYards());
        org.junit.Assert.assertEquals(
                "expect equals receptionsTouchdowns ",
                this.records[1].getReceptionsTouchdowns(),
                testResult.getReceptionsTouchdowns());
        org.junit.Assert.assertEquals(
                "expect equals receptionsFirstDown ",
                this.records[1].getReceptionsFirstDown(),
                testResult.getReceptionsFirstDown());
        org.junit.Assert.assertEquals(
                "expect equals receptionsLongest ",
                this.records[1].getReceptionsLongest(),
                testResult.getReceptionsLongest());
        org.junit.Assert.assertEquals(
                "expect equals receptionsAverageYardsPer ",
                this.records[1].getReceptionsAverageYardsPer(),
                testResult.getReceptionsAverageYardsPer());
    }
}
