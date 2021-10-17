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
import com.sportsdb.test.entity.BaseballDefensiveStats;
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

public class BaseballDefensiveStatsHandlerTestIt {
    static final String inputFile = "BaseballDefensiveStats.json";
    static BaseballDefensiveStatsHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private BaseballDefensiveStats[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new BaseballDefensiveStatsHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, BaseballDefensiveStats[].class);
        assertEquals("match count", count, records.length);
        BaseballDefensiveStats testResult =
                jpa.find(BaseballDefensiveStats.class, records[0].getId());
        org.junit.Assert.assertEquals(
                "expect equals doublePlays ",
                this.records[0].getDoublePlays(),
                testResult.getDoublePlays());
        org.junit.Assert.assertEquals(
                "expect equals triplePlays ",
                this.records[0].getTriplePlays(),
                testResult.getTriplePlays());
        org.junit.Assert.assertEquals(
                "expect equals putouts ", this.records[0].getPutouts(), testResult.getPutouts());
        org.junit.Assert.assertEquals(
                "expect equals assists ", this.records[0].getAssists(), testResult.getAssists());
        org.junit.Assert.assertEquals(
                "expect equals errors ", this.records[0].getErrors(), testResult.getErrors());
        org.junit.Assert.assertEquals(
                "expect equals fieldingPercentage ",
                this.records[0].getFieldingPercentage(),
                testResult.getFieldingPercentage());
        org.junit.Assert.assertEquals(
                "expect equals defensiveAverage ",
                this.records[0].getDefensiveAverage(),
                testResult.getDefensiveAverage());
        org.junit.Assert.assertEquals(
                "expect equals errorsPassedBall ",
                this.records[0].getErrorsPassedBall(),
                testResult.getErrorsPassedBall());
        org.junit.Assert.assertEquals(
                "expect equals errorsCatchersInterference ",
                this.records[0].getErrorsCatchersInterference(),
                testResult.getErrorsCatchersInterference());

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
