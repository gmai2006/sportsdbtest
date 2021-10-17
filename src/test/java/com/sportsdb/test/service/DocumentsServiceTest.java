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
package com.sportsdb.test.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sportsdb.test.entity.Documents;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;
import com.sportsdb.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class DocumentsServiceTest {
    private static DefaultDocumentsService serviceMock;
    private static Documents[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultDocumentsService.class);
        String inputFile = "Documents.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, Documents[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        Documents testResult = serviceMock.find(records[0].getId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals docId ", records[0].getDocId(), testResult.getDocId());
        org.junit.Assert.assertTrue(
                "expect equals publisherId ",
                records[0].getPublisherId() == testResult.getPublisherId());
        org.junit.Assert.assertEquals(
                "expect equals title ", records[0].getTitle(), testResult.getTitle());
        org.junit.Assert.assertEquals(
                "expect equals language ", records[0].getLanguage(), testResult.getLanguage());
        org.junit.Assert.assertEquals(
                "expect equals priority ", records[0].getPriority(), testResult.getPriority());
        org.junit.Assert.assertEquals(
                "expect equals revisionId ",
                records[0].getRevisionId(),
                testResult.getRevisionId());
        org.junit.Assert.assertEquals(
                "expect equals statsCoverage ",
                records[0].getStatsCoverage(),
                testResult.getStatsCoverage());
        org.junit.Assert.assertTrue(
                "expect equals documentFixtureId ",
                records[0].getDocumentFixtureId() == testResult.getDocumentFixtureId());
        org.junit.Assert.assertTrue(
                "expect equals sourceId ", records[0].getSourceId() == testResult.getSourceId());
    }
}