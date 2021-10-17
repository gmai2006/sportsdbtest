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
import com.sportsdb.test.entity.Media;
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

public class MediaDaoTestIt {
    static final String inputFile = "Media.json";
    static MediaDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private Media[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultMediaDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, Media[].class);
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
        Media testResult = dao.find(records[1].getId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertTrue(
                "expect equals objectId ",
                this.records[1].getObjectId() == testResult.getObjectId());
        org.junit.Assert.assertTrue(
                "expect equals sourceId ",
                this.records[1].getSourceId() == testResult.getSourceId());
        org.junit.Assert.assertTrue(
                "expect equals revisionId ",
                this.records[1].getRevisionId() == testResult.getRevisionId());
        org.junit.Assert.assertEquals(
                "expect equals mediaType ",
                this.records[1].getMediaType(),
                testResult.getMediaType());
        org.junit.Assert.assertTrue(
                "expect equals publisherId ",
                this.records[1].getPublisherId() == testResult.getPublisherId());
        org.junit.Assert.assertEquals(
                "expect equals dateTime ", this.records[1].getDateTime(), testResult.getDateTime());
        org.junit.Assert.assertTrue(
                "expect equals creditId ",
                this.records[1].getCreditId() == testResult.getCreditId());
        org.junit.Assert.assertTrue(
                "expect equals creationLocationId ",
                this.records[1].getCreationLocationId() == testResult.getCreationLocationId());
    }
}
