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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.dao.StandaloneJpaDao;
import com.sportsdb.test.entity.AmericanFootballScoringStats;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.json.CDL;
import org.json.JSONArray;
import org.junit.BeforeClass;
import org.junit.Test;

public class AmericanFootballScoringStatsHandlerTestIt {
    static final String inputFile = "AmericanFootballScoringStats.json";
    static AmericanFootballScoringStatsHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private AmericanFootballScoringStats[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new AmericanFootballScoringStatsHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, AmericanFootballScoringStats[].class);
        assertEquals("match count", count, records.length);
        AmericanFootballScoringStats testResult =
                jpa.find(AmericanFootballScoringStats.class, records[0].getId());
        assertEquals(
                "expect equals touchdownsTotal ",
                this.records[0].getTouchdownsTotal(),
                testResult.getTouchdownsTotal());
        assertEquals(
                "expect equals touchdownsPassing ",
                this.records[0].getTouchdownsPassing(),
                testResult.getTouchdownsPassing());
        assertEquals(
                "expect equals touchdownsRushing ",
                this.records[0].getTouchdownsRushing(),
                testResult.getTouchdownsRushing());
        assertEquals(
                "expect equals touchdownsSpecialTeams ",
                this.records[0].getTouchdownsSpecialTeams(),
                testResult.getTouchdownsSpecialTeams());
        assertEquals(
                "expect equals touchdownsDefensive ",
                this.records[0].getTouchdownsDefensive(),
                testResult.getTouchdownsDefensive());
        assertEquals(
                "expect equals extraPointsAttempts ",
                this.records[0].getExtraPointsAttempts(),
                testResult.getExtraPointsAttempts());
        assertEquals(
                "expect equals extraPointsMade ",
                this.records[0].getExtraPointsMade(),
                testResult.getExtraPointsMade());
        assertEquals(
                "expect equals extraPointsMissed ",
                this.records[0].getExtraPointsMissed(),
                testResult.getExtraPointsMissed());
        assertEquals(
                "expect equals extraPointsBlocked ",
                this.records[0].getExtraPointsBlocked(),
                testResult.getExtraPointsBlocked());
        assertEquals(
                "expect equals fieldGoalAttempts ",
                this.records[0].getFieldGoalAttempts(),
                testResult.getFieldGoalAttempts());
        assertEquals(
                "expect equals fieldGoalsMade ",
                this.records[0].getFieldGoalsMade(),
                testResult.getFieldGoalsMade());
        assertEquals(
                "expect equals fieldGoalsMissed ",
                this.records[0].getFieldGoalsMissed(),
                testResult.getFieldGoalsMissed());
        assertEquals(
                "expect equals fieldGoalsBlocked ",
                this.records[0].getFieldGoalsBlocked(),
                testResult.getFieldGoalsBlocked());
        assertEquals(
                "expect equals safetiesAgainst ",
                this.records[0].getSafetiesAgainst(),
                testResult.getSafetiesAgainst());
        assertEquals(
                "expect equals twoPointConversionsAttempts ",
                this.records[0].getTwoPointConversionsAttempts(),
                testResult.getTwoPointConversionsAttempts());
        assertEquals(
                "expect equals twoPointConversionsMade ",
                this.records[0].getTwoPointConversionsMade(),
                testResult.getTwoPointConversionsMade());
        assertEquals(
                "expect equals touchbacksTotal ",
                this.records[0].getTouchbacksTotal(),
                testResult.getTouchbacksTotal());

        // cleanup
        inputStream.close();
        json = null;
        records = null;
    }

    /**
     * Construct a delimiter file from a json file.
     *
     * @param inputFile the json file.
     * @param charset default charset.
     * @return
     */
    private File createRecordInputStreamFromJsonFile(String inputFile, Charset charset) {
        try {
            final File tempFile = File.createTempFile(inputFile, ".txt");
            tempFile.deleteOnExit();
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            JSONArray docs = new JSONArray(json);
            String csv = CDL.toString(docs);
            org.apache.commons.io.FileUtils.writeStringToFile(
                    tempFile, csv, Charset.defaultCharset());
            return tempFile;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
