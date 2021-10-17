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
import com.sportsdb.test.entity.Documents;
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

public class DocumentsDaoTestIt {
    static final String inputFile = "Documents.json";
    static DocumentsDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private Documents[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultDocumentsDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, Documents[].class);
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
        Documents testResult = dao.find(records[1].getId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertEquals(
                "expect equals docId ", this.records[1].getDocId(), testResult.getDocId());
        org.junit.Assert.assertTrue(
                "expect equals publisherId ",
                this.records[1].getPublisherId() == testResult.getPublisherId());
        org.junit.Assert.assertEquals(
                "expect equals title ", this.records[1].getTitle(), testResult.getTitle());
        org.junit.Assert.assertEquals(
                "expect equals language ", this.records[1].getLanguage(), testResult.getLanguage());
        org.junit.Assert.assertEquals(
                "expect equals priority ", this.records[1].getPriority(), testResult.getPriority());
        org.junit.Assert.assertEquals(
                "expect equals revisionId ",
                this.records[1].getRevisionId(),
                testResult.getRevisionId());
        org.junit.Assert.assertEquals(
                "expect equals statsCoverage ",
                this.records[1].getStatsCoverage(),
                testResult.getStatsCoverage());
        org.junit.Assert.assertTrue(
                "expect equals documentFixtureId ",
                this.records[1].getDocumentFixtureId() == testResult.getDocumentFixtureId());
        org.junit.Assert.assertTrue(
                "expect equals sourceId ",
                this.records[1].getSourceId() == testResult.getSourceId());
    }
}
