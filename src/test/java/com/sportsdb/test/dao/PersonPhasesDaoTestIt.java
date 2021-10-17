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
import com.sportsdb.test.entity.PersonPhases;
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

public class PersonPhasesDaoTestIt {
    static final String inputFile = "PersonPhases.json";
    static PersonPhasesDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private PersonPhases[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultPersonPhasesDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, PersonPhases[].class);
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
        PersonPhases testResult = dao.find(records[1].getId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertTrue(
                "expect equals personId ",
                this.records[1].getPersonId() == testResult.getPersonId());
        org.junit.Assert.assertEquals(
                "expect equals membershipType ",
                this.records[1].getMembershipType(),
                testResult.getMembershipType());
        org.junit.Assert.assertTrue(
                "expect equals membershipId ",
                this.records[1].getMembershipId() == testResult.getMembershipId());
        org.junit.Assert.assertTrue(
                "expect equals roleId ", this.records[1].getRoleId() == testResult.getRoleId());
        org.junit.Assert.assertEquals(
                "expect equals roleStatus ",
                this.records[1].getRoleStatus(),
                testResult.getRoleStatus());
        org.junit.Assert.assertEquals(
                "expect equals phaseStatus ",
                this.records[1].getPhaseStatus(),
                testResult.getPhaseStatus());
        org.junit.Assert.assertEquals(
                "expect equals uniformNumber ",
                this.records[1].getUniformNumber(),
                testResult.getUniformNumber());
        org.junit.Assert.assertTrue(
                "expect equals regularPositionId ",
                this.records[1].getRegularPositionId() == testResult.getRegularPositionId());
        org.junit.Assert.assertEquals(
                "expect equals regularPositionDepth ",
                this.records[1].getRegularPositionDepth(),
                testResult.getRegularPositionDepth());
        org.junit.Assert.assertEquals(
                "expect equals height ", this.records[1].getHeight(), testResult.getHeight());
        org.junit.Assert.assertEquals(
                "expect equals weight ", this.records[1].getWeight(), testResult.getWeight());
        org.junit.Assert.assertTrue(
                "expect equals startSeasonId ",
                this.records[1].getStartSeasonId() == testResult.getStartSeasonId());
        org.junit.Assert.assertTrue(
                "expect equals endSeasonId ",
                this.records[1].getEndSeasonId() == testResult.getEndSeasonId());
        org.junit.Assert.assertEquals(
                "expect equals entryReason ",
                this.records[1].getEntryReason(),
                testResult.getEntryReason());
        org.junit.Assert.assertEquals(
                "expect equals exitReason ",
                this.records[1].getExitReason(),
                testResult.getExitReason());
        org.junit.Assert.assertTrue(
                "expect equals selectionLevel ",
                this.records[1].getSelectionLevel() == testResult.getSelectionLevel());
        org.junit.Assert.assertTrue(
                "expect equals selectionSublevel ",
                this.records[1].getSelectionSublevel() == testResult.getSelectionSublevel());
        org.junit.Assert.assertTrue(
                "expect equals selectionOverall ",
                this.records[1].getSelectionOverall() == testResult.getSelectionOverall());
    }
}
