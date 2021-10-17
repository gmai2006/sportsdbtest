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
import com.sportsdb.test.entity.WageringRunlines;
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

public class WageringRunlinesHandlerTestIt {
    static final String inputFile = "WageringRunlines.json";
    static WageringRunlinesHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private WageringRunlines[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new WageringRunlinesHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, WageringRunlines[].class);
        assertEquals("match count", count, records.length);
        WageringRunlines testResult = jpa.find(WageringRunlines.class, records[0].getId());
        org.junit.Assert.assertEquals(
                "expect equals bookmakerId ",
                this.records[0].getBookmakerId(),
                testResult.getBookmakerId());
        org.junit.Assert.assertEquals(
                "expect equals eventId ", this.records[0].getEventId(), testResult.getEventId());
        org.junit.Assert.assertEquals(
                "expect equals teamId ", this.records[0].getTeamId(), testResult.getTeamId());
        org.junit.Assert.assertEquals(
                "expect equals personId ", this.records[0].getPersonId(), testResult.getPersonId());
        assertEquals(
                "expect equals rotationKey ",
                this.records[0].getRotationKey(),
                testResult.getRotationKey());
        assertEquals(
                "expect equals comment ", this.records[0].getComment(), testResult.getComment());
        assertEquals(
                "expect equals vigorish ", this.records[0].getVigorish(), testResult.getVigorish());
        assertEquals("expect equals line ", this.records[0].getLine(), testResult.getLine());
        assertEquals(
                "expect equals lineOpening ",
                this.records[0].getLineOpening(),
                testResult.getLineOpening());
        assertEquals(
                "expect equals lineValue ",
                this.records[0].getLineValue(),
                testResult.getLineValue());
        assertEquals(
                "expect equals prediction ",
                this.records[0].getPrediction(),
                testResult.getPrediction());

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
