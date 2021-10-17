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
import com.sportsdb.test.entity.BaseballOffensiveStats;
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

public class BaseballOffensiveStatsHandlerTestIt {
    static final String inputFile = "BaseballOffensiveStats.json";
    static BaseballOffensiveStatsHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private BaseballOffensiveStats[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new BaseballOffensiveStatsHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, BaseballOffensiveStats[].class);
        assertEquals("match count", count, records.length);
        BaseballOffensiveStats testResult =
                jpa.find(BaseballOffensiveStats.class, records[0].getId());
        org.junit.Assert.assertEquals(
                "expect equals average ", this.records[0].getAverage(), testResult.getAverage());
        org.junit.Assert.assertEquals(
                "expect equals runsScored ",
                this.records[0].getRunsScored(),
                testResult.getRunsScored());
        org.junit.Assert.assertEquals(
                "expect equals atBats ", this.records[0].getAtBats(), testResult.getAtBats());
        org.junit.Assert.assertEquals(
                "expect equals hits ", this.records[0].getHits(), testResult.getHits());
        org.junit.Assert.assertEquals(
                "expect equals rbi ", this.records[0].getRbi(), testResult.getRbi());
        org.junit.Assert.assertEquals(
                "expect equals totalBases ",
                this.records[0].getTotalBases(),
                testResult.getTotalBases());
        org.junit.Assert.assertEquals(
                "expect equals sluggingPercentage ",
                this.records[0].getSluggingPercentage(),
                testResult.getSluggingPercentage());
        org.junit.Assert.assertEquals(
                "expect equals basesOnBalls ",
                this.records[0].getBasesOnBalls(),
                testResult.getBasesOnBalls());
        org.junit.Assert.assertEquals(
                "expect equals strikeouts ",
                this.records[0].getStrikeouts(),
                testResult.getStrikeouts());
        org.junit.Assert.assertEquals(
                "expect equals leftOnBase ",
                this.records[0].getLeftOnBase(),
                testResult.getLeftOnBase());
        org.junit.Assert.assertEquals(
                "expect equals leftInScoringPosition ",
                this.records[0].getLeftInScoringPosition(),
                testResult.getLeftInScoringPosition());
        org.junit.Assert.assertEquals(
                "expect equals singles ", this.records[0].getSingles(), testResult.getSingles());
        org.junit.Assert.assertEquals(
                "expect equals doubles ", this.records[0].getDoubles(), testResult.getDoubles());
        org.junit.Assert.assertEquals(
                "expect equals triples ", this.records[0].getTriples(), testResult.getTriples());
        org.junit.Assert.assertEquals(
                "expect equals homeRuns ", this.records[0].getHomeRuns(), testResult.getHomeRuns());
        org.junit.Assert.assertEquals(
                "expect equals grandSlams ",
                this.records[0].getGrandSlams(),
                testResult.getGrandSlams());
        org.junit.Assert.assertEquals(
                "expect equals atBatsPerRbi ",
                this.records[0].getAtBatsPerRbi(),
                testResult.getAtBatsPerRbi());
        org.junit.Assert.assertEquals(
                "expect equals plateAppearancesPerRbi ",
                this.records[0].getPlateAppearancesPerRbi(),
                testResult.getPlateAppearancesPerRbi());
        org.junit.Assert.assertEquals(
                "expect equals atBatsPerHomeRun ",
                this.records[0].getAtBatsPerHomeRun(),
                testResult.getAtBatsPerHomeRun());
        org.junit.Assert.assertEquals(
                "expect equals plateAppearancesPerHomeRun ",
                this.records[0].getPlateAppearancesPerHomeRun(),
                testResult.getPlateAppearancesPerHomeRun());
        org.junit.Assert.assertEquals(
                "expect equals sacFlies ", this.records[0].getSacFlies(), testResult.getSacFlies());
        org.junit.Assert.assertEquals(
                "expect equals sacBunts ", this.records[0].getSacBunts(), testResult.getSacBunts());
        org.junit.Assert.assertEquals(
                "expect equals groundedIntoDoublePlay ",
                this.records[0].getGroundedIntoDoublePlay(),
                testResult.getGroundedIntoDoublePlay());
        org.junit.Assert.assertEquals(
                "expect equals movedUp ", this.records[0].getMovedUp(), testResult.getMovedUp());
        org.junit.Assert.assertEquals(
                "expect equals onBasePercentage ",
                this.records[0].getOnBasePercentage(),
                testResult.getOnBasePercentage());
        org.junit.Assert.assertEquals(
                "expect equals stolenBases ",
                this.records[0].getStolenBases(),
                testResult.getStolenBases());
        org.junit.Assert.assertEquals(
                "expect equals stolenBasesCaught ",
                this.records[0].getStolenBasesCaught(),
                testResult.getStolenBasesCaught());
        org.junit.Assert.assertEquals(
                "expect equals stolenBasesAverage ",
                this.records[0].getStolenBasesAverage(),
                testResult.getStolenBasesAverage());
        org.junit.Assert.assertEquals(
                "expect equals hitByPitch ",
                this.records[0].getHitByPitch(),
                testResult.getHitByPitch());
        org.junit.Assert.assertEquals(
                "expect equals defensiveInterferanceReaches ",
                this.records[0].getDefensiveInterferanceReaches(),
                testResult.getDefensiveInterferanceReaches());
        org.junit.Assert.assertEquals(
                "expect equals onBasePlusSlugging ",
                this.records[0].getOnBasePlusSlugging(),
                testResult.getOnBasePlusSlugging());
        org.junit.Assert.assertEquals(
                "expect equals plateAppearances ",
                this.records[0].getPlateAppearances(),
                testResult.getPlateAppearances());
        org.junit.Assert.assertEquals(
                "expect equals hitsExtraBase ",
                this.records[0].getHitsExtraBase(),
                testResult.getHitsExtraBase());

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
