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
import com.sportsdb.test.entity.AmericanFootballDefensiveStats;
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

public class AmericanFootballDefensiveStatsDaoTestIt {
    static final String inputFile = "AmericanFootballDefensiveStats.json";
    static AmericanFootballDefensiveStatsDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private AmericanFootballDefensiveStats[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultAmericanFootballDefensiveStatsDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, AmericanFootballDefensiveStats[].class);
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
        AmericanFootballDefensiveStats testResult = dao.find(records[1].getId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertEquals(
                "expect equals tacklesTotal ",
                this.records[1].getTacklesTotal(),
                testResult.getTacklesTotal());
        org.junit.Assert.assertEquals(
                "expect equals tacklesSolo ",
                this.records[1].getTacklesSolo(),
                testResult.getTacklesSolo());
        org.junit.Assert.assertEquals(
                "expect equals tacklesAssists ",
                this.records[1].getTacklesAssists(),
                testResult.getTacklesAssists());
        org.junit.Assert.assertEquals(
                "expect equals interceptionsTotal ",
                this.records[1].getInterceptionsTotal(),
                testResult.getInterceptionsTotal());
        org.junit.Assert.assertEquals(
                "expect equals interceptionsYards ",
                this.records[1].getInterceptionsYards(),
                testResult.getInterceptionsYards());
        org.junit.Assert.assertEquals(
                "expect equals interceptionsAverage ",
                this.records[1].getInterceptionsAverage(),
                testResult.getInterceptionsAverage());
        org.junit.Assert.assertEquals(
                "expect equals interceptionsLongest ",
                this.records[1].getInterceptionsLongest(),
                testResult.getInterceptionsLongest());
        org.junit.Assert.assertEquals(
                "expect equals interceptionsTouchdown ",
                this.records[1].getInterceptionsTouchdown(),
                testResult.getInterceptionsTouchdown());
        org.junit.Assert.assertEquals(
                "expect equals quarterbackHurries ",
                this.records[1].getQuarterbackHurries(),
                testResult.getQuarterbackHurries());
        org.junit.Assert.assertEquals(
                "expect equals sacksTotal ",
                this.records[1].getSacksTotal(),
                testResult.getSacksTotal());
        org.junit.Assert.assertEquals(
                "expect equals sacksYards ",
                this.records[1].getSacksYards(),
                testResult.getSacksYards());
        org.junit.Assert.assertEquals(
                "expect equals passesDefensed ",
                this.records[1].getPassesDefensed(),
                testResult.getPassesDefensed());
    }
}
