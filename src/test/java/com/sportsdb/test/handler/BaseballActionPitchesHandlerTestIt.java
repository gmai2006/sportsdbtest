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
import com.sportsdb.test.entity.BaseballActionPitches;
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

public class BaseballActionPitchesHandlerTestIt {
    static final String inputFile = "BaseballActionPitches.json";
    static BaseballActionPitchesHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private BaseballActionPitches[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new BaseballActionPitchesHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, BaseballActionPitches[].class);
        assertEquals("match count", count, records.length);
        BaseballActionPitches testResult =
                jpa.find(BaseballActionPitches.class, records[0].getId());
        org.junit.Assert.assertEquals(
                "expect equals baseballActionPlayId ",
                this.records[0].getBaseballActionPlayId(),
                testResult.getBaseballActionPlayId());
        org.junit.Assert.assertEquals(
                "expect equals sequenceNumber ",
                this.records[0].getSequenceNumber(),
                testResult.getSequenceNumber());
        org.junit.Assert.assertEquals(
                "expect equals baseballDefensiveGroupId ",
                this.records[0].getBaseballDefensiveGroupId(),
                testResult.getBaseballDefensiveGroupId());
        assertEquals(
                "expect equals umpireCall ",
                this.records[0].getUmpireCall(),
                testResult.getUmpireCall());
        assertEquals(
                "expect equals pitchLocation ",
                this.records[0].getPitchLocation(),
                testResult.getPitchLocation());
        assertEquals(
                "expect equals pitchType ",
                this.records[0].getPitchType(),
                testResult.getPitchType());
        org.junit.Assert.assertEquals(
                "expect equals pitchVelocity ",
                this.records[0].getPitchVelocity(),
                testResult.getPitchVelocity());
        assertEquals(
                "expect equals comment ", this.records[0].getComment(), testResult.getComment());
        assertEquals(
                "expect equals trajectoryCoordinates ",
                this.records[0].getTrajectoryCoordinates(),
                testResult.getTrajectoryCoordinates());
        assertEquals(
                "expect equals trajectoryFormula ",
                this.records[0].getTrajectoryFormula(),
                testResult.getTrajectoryFormula());
        assertEquals(
                "expect equals ballType ", this.records[0].getBallType(), testResult.getBallType());
        assertEquals(
                "expect equals strikeType ",
                this.records[0].getStrikeType(),
                testResult.getStrikeType());

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
