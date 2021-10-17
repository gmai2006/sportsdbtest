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
import com.sportsdb.test.entity.BaseballEventStates;
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

public class BaseballEventStatesHandlerTestIt {
    static final String inputFile = "BaseballEventStates.json";
    static BaseballEventStatesHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private BaseballEventStates[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new BaseballEventStatesHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, BaseballEventStates[].class);
        assertEquals("match count", count, records.length);
        BaseballEventStates testResult = jpa.find(BaseballEventStates.class, records[0].getId());
        org.junit.Assert.assertEquals(
                "expect equals eventId ", this.records[0].getEventId(), testResult.getEventId());
        org.junit.Assert.assertEquals(
                "expect equals currentState ",
                this.records[0].getCurrentState(),
                testResult.getCurrentState());
        org.junit.Assert.assertEquals(
                "expect equals sequenceNumber ",
                this.records[0].getSequenceNumber(),
                testResult.getSequenceNumber());
        org.junit.Assert.assertEquals(
                "expect equals atBatNumber ",
                this.records[0].getAtBatNumber(),
                testResult.getAtBatNumber());
        org.junit.Assert.assertEquals(
                "expect equals inningValue ",
                this.records[0].getInningValue(),
                testResult.getInningValue());
        assertEquals(
                "expect equals inningHalf ",
                this.records[0].getInningHalf(),
                testResult.getInningHalf());
        org.junit.Assert.assertEquals(
                "expect equals outs ", this.records[0].getOuts(), testResult.getOuts());
        org.junit.Assert.assertEquals(
                "expect equals balls ", this.records[0].getBalls(), testResult.getBalls());
        org.junit.Assert.assertEquals(
                "expect equals strikes ", this.records[0].getStrikes(), testResult.getStrikes());
        org.junit.Assert.assertEquals(
                "expect equals runnerOnFirstId ",
                this.records[0].getRunnerOnFirstId(),
                testResult.getRunnerOnFirstId());
        org.junit.Assert.assertEquals(
                "expect equals runnerOnSecondId ",
                this.records[0].getRunnerOnSecondId(),
                testResult.getRunnerOnSecondId());
        org.junit.Assert.assertEquals(
                "expect equals runnerOnThirdId ",
                this.records[0].getRunnerOnThirdId(),
                testResult.getRunnerOnThirdId());
        org.junit.Assert.assertEquals(
                "expect equals runnerOnFirst ",
                this.records[0].getRunnerOnFirst(),
                testResult.getRunnerOnFirst());
        org.junit.Assert.assertEquals(
                "expect equals runnerOnSecond ",
                this.records[0].getRunnerOnSecond(),
                testResult.getRunnerOnSecond());
        org.junit.Assert.assertEquals(
                "expect equals runnerOnThird ",
                this.records[0].getRunnerOnThird(),
                testResult.getRunnerOnThird());
        org.junit.Assert.assertEquals(
                "expect equals runsThisInningHalf ",
                this.records[0].getRunsThisInningHalf(),
                testResult.getRunsThisInningHalf());
        org.junit.Assert.assertEquals(
                "expect equals pitcherId ",
                this.records[0].getPitcherId(),
                testResult.getPitcherId());
        org.junit.Assert.assertEquals(
                "expect equals batterId ", this.records[0].getBatterId(), testResult.getBatterId());
        assertEquals(
                "expect equals batterSide ",
                this.records[0].getBatterSide(),
                testResult.getBatterSide());
        assertEquals(
                "expect equals context ", this.records[0].getContext(), testResult.getContext());

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
