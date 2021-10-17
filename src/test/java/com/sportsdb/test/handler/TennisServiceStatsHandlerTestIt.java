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
import com.sportsdb.test.entity.TennisServiceStats;
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

public class TennisServiceStatsHandlerTestIt {
    static final String inputFile = "TennisServiceStats.json";
    static TennisServiceStatsHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private TennisServiceStats[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new TennisServiceStatsHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, TennisServiceStats[].class);
        assertEquals("match count", count, records.length);
        TennisServiceStats testResult = jpa.find(TennisServiceStats.class, records[0].getId());
        assertEquals(
                "expect equals servicesPlayed ",
                this.records[0].getServicesPlayed(),
                testResult.getServicesPlayed());
        assertEquals(
                "expect equals matchesPlayed ",
                this.records[0].getMatchesPlayed(),
                testResult.getMatchesPlayed());
        assertEquals("expect equals aces ", this.records[0].getAces(), testResult.getAces());
        assertEquals(
                "expect equals firstServicesGood ",
                this.records[0].getFirstServicesGood(),
                testResult.getFirstServicesGood());
        assertEquals(
                "expect equals firstServicesGoodPct ",
                this.records[0].getFirstServicesGoodPct(),
                testResult.getFirstServicesGoodPct());
        assertEquals(
                "expect equals firstServicePointsWon ",
                this.records[0].getFirstServicePointsWon(),
                testResult.getFirstServicePointsWon());
        assertEquals(
                "expect equals firstServicePointsWonPct ",
                this.records[0].getFirstServicePointsWonPct(),
                testResult.getFirstServicePointsWonPct());
        assertEquals(
                "expect equals secondServicePointsWon ",
                this.records[0].getSecondServicePointsWon(),
                testResult.getSecondServicePointsWon());
        assertEquals(
                "expect equals secondServicePointsWonPct ",
                this.records[0].getSecondServicePointsWonPct(),
                testResult.getSecondServicePointsWonPct());
        assertEquals(
                "expect equals serviceGamesPlayed ",
                this.records[0].getServiceGamesPlayed(),
                testResult.getServiceGamesPlayed());
        assertEquals(
                "expect equals serviceGamesWon ",
                this.records[0].getServiceGamesWon(),
                testResult.getServiceGamesWon());
        assertEquals(
                "expect equals serviceGamesWonPct ",
                this.records[0].getServiceGamesWonPct(),
                testResult.getServiceGamesWonPct());
        assertEquals(
                "expect equals breakPointsPlayed ",
                this.records[0].getBreakPointsPlayed(),
                testResult.getBreakPointsPlayed());
        assertEquals(
                "expect equals breakPointsSaved ",
                this.records[0].getBreakPointsSaved(),
                testResult.getBreakPointsSaved());
        assertEquals(
                "expect equals breakPointsSavedPct ",
                this.records[0].getBreakPointsSavedPct(),
                testResult.getBreakPointsSavedPct());

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
