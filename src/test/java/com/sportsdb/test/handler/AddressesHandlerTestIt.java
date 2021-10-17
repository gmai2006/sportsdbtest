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
import com.sportsdb.test.entity.Addresses;
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

public class AddressesHandlerTestIt {
    static final String inputFile = "Addresses.json";
    static AddressesHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private Addresses[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new AddressesHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, Addresses[].class);
        assertEquals("match count", count, records.length);
        Addresses testResult = jpa.find(Addresses.class, records[0].getId());
        org.junit.Assert.assertEquals(
                "expect equals locationId ",
                this.records[0].getLocationId(),
                testResult.getLocationId());
        assertEquals(
                "expect equals language ", this.records[0].getLanguage(), testResult.getLanguage());
        assertEquals("expect equals suite ", this.records[0].getSuite(), testResult.getSuite());
        assertEquals("expect equals floor ", this.records[0].getFloor(), testResult.getFloor());
        assertEquals(
                "expect equals building ", this.records[0].getBuilding(), testResult.getBuilding());
        assertEquals(
                "expect equals streetNumber ",
                this.records[0].getStreetNumber(),
                testResult.getStreetNumber());
        assertEquals(
                "expect equals streetPrefix ",
                this.records[0].getStreetPrefix(),
                testResult.getStreetPrefix());
        assertEquals("expect equals street ", this.records[0].getStreet(), testResult.getStreet());
        assertEquals(
                "expect equals streetSuffix ",
                this.records[0].getStreetSuffix(),
                testResult.getStreetSuffix());
        assertEquals(
                "expect equals neighborhood ",
                this.records[0].getNeighborhood(),
                testResult.getNeighborhood());
        assertEquals(
                "expect equals district ", this.records[0].getDistrict(), testResult.getDistrict());
        assertEquals(
                "expect equals locality ", this.records[0].getLocality(), testResult.getLocality());
        assertEquals("expect equals county ", this.records[0].getCounty(), testResult.getCounty());
        assertEquals("expect equals region ", this.records[0].getRegion(), testResult.getRegion());
        assertEquals(
                "expect equals postalCode ",
                this.records[0].getPostalCode(),
                testResult.getPostalCode());
        assertEquals(
                "expect equals country ", this.records[0].getCountry(), testResult.getCountry());

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
