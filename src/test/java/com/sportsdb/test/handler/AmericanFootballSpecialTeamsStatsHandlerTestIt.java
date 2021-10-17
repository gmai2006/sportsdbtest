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
import com.sportsdb.test.entity.AmericanFootballSpecialTeamsStats;
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

public class AmericanFootballSpecialTeamsStatsHandlerTestIt {
    static final String inputFile = "AmericanFootballSpecialTeamsStats.json";
    static AmericanFootballSpecialTeamsStatsHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private AmericanFootballSpecialTeamsStats[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new AmericanFootballSpecialTeamsStatsHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, AmericanFootballSpecialTeamsStats[].class);
        assertEquals("match count", count, records.length);
        AmericanFootballSpecialTeamsStats testResult =
                jpa.find(AmericanFootballSpecialTeamsStats.class, records[0].getId());
        assertEquals(
                "expect equals returnsPuntTotal ",
                this.records[0].getReturnsPuntTotal(),
                testResult.getReturnsPuntTotal());
        assertEquals(
                "expect equals returnsPuntYards ",
                this.records[0].getReturnsPuntYards(),
                testResult.getReturnsPuntYards());
        assertEquals(
                "expect equals returnsPuntAverage ",
                this.records[0].getReturnsPuntAverage(),
                testResult.getReturnsPuntAverage());
        assertEquals(
                "expect equals returnsPuntLongest ",
                this.records[0].getReturnsPuntLongest(),
                testResult.getReturnsPuntLongest());
        assertEquals(
                "expect equals returnsPuntTouchdown ",
                this.records[0].getReturnsPuntTouchdown(),
                testResult.getReturnsPuntTouchdown());
        assertEquals(
                "expect equals returnsKickoffTotal ",
                this.records[0].getReturnsKickoffTotal(),
                testResult.getReturnsKickoffTotal());
        assertEquals(
                "expect equals returnsKickoffYards ",
                this.records[0].getReturnsKickoffYards(),
                testResult.getReturnsKickoffYards());
        assertEquals(
                "expect equals returnsKickoffAverage ",
                this.records[0].getReturnsKickoffAverage(),
                testResult.getReturnsKickoffAverage());
        assertEquals(
                "expect equals returnsKickoffLongest ",
                this.records[0].getReturnsKickoffLongest(),
                testResult.getReturnsKickoffLongest());
        assertEquals(
                "expect equals returnsKickoffTouchdown ",
                this.records[0].getReturnsKickoffTouchdown(),
                testResult.getReturnsKickoffTouchdown());
        assertEquals(
                "expect equals returnsTotal ",
                this.records[0].getReturnsTotal(),
                testResult.getReturnsTotal());
        assertEquals(
                "expect equals returnsYards ",
                this.records[0].getReturnsYards(),
                testResult.getReturnsYards());
        assertEquals(
                "expect equals puntsTotal ",
                this.records[0].getPuntsTotal(),
                testResult.getPuntsTotal());
        assertEquals(
                "expect equals puntsYardsGross ",
                this.records[0].getPuntsYardsGross(),
                testResult.getPuntsYardsGross());
        assertEquals(
                "expect equals puntsYardsNet ",
                this.records[0].getPuntsYardsNet(),
                testResult.getPuntsYardsNet());
        assertEquals(
                "expect equals puntsLongest ",
                this.records[0].getPuntsLongest(),
                testResult.getPuntsLongest());
        assertEquals(
                "expect equals puntsInside20 ",
                this.records[0].getPuntsInside20(),
                testResult.getPuntsInside20());
        assertEquals(
                "expect equals puntsInside20Percentage ",
                this.records[0].getPuntsInside20Percentage(),
                testResult.getPuntsInside20Percentage());
        assertEquals(
                "expect equals puntsAverage ",
                this.records[0].getPuntsAverage(),
                testResult.getPuntsAverage());
        assertEquals(
                "expect equals puntsBlocked ",
                this.records[0].getPuntsBlocked(),
                testResult.getPuntsBlocked());
        assertEquals(
                "expect equals touchbacksTotal ",
                this.records[0].getTouchbacksTotal(),
                testResult.getTouchbacksTotal());
        assertEquals(
                "expect equals touchbacksTotalPercentage ",
                this.records[0].getTouchbacksTotalPercentage(),
                testResult.getTouchbacksTotalPercentage());
        assertEquals(
                "expect equals touchbacksKickoffs ",
                this.records[0].getTouchbacksKickoffs(),
                testResult.getTouchbacksKickoffs());
        assertEquals(
                "expect equals touchbacksKickoffsPercentage ",
                this.records[0].getTouchbacksKickoffsPercentage(),
                testResult.getTouchbacksKickoffsPercentage());
        assertEquals(
                "expect equals touchbacksPunts ",
                this.records[0].getTouchbacksPunts(),
                testResult.getTouchbacksPunts());
        assertEquals(
                "expect equals touchbacksPuntsPercentage ",
                this.records[0].getTouchbacksPuntsPercentage(),
                testResult.getTouchbacksPuntsPercentage());
        assertEquals(
                "expect equals touchbacksInterceptions ",
                this.records[0].getTouchbacksInterceptions(),
                testResult.getTouchbacksInterceptions());
        assertEquals(
                "expect equals touchbacksInterceptionsPercentage ",
                this.records[0].getTouchbacksInterceptionsPercentage(),
                testResult.getTouchbacksInterceptionsPercentage());
        assertEquals(
                "expect equals fairCatches ",
                this.records[0].getFairCatches(),
                testResult.getFairCatches());

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
