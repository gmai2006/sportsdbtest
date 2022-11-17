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

import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.sportsdb.test.entity.AmericanFootballSpecialTeamsStats;
import com.sportsdb.test.utils.FileUtils;
import com.sportsdb.test.utils.ByteArrayToBase64TypeAdapter;

public class AmericanFootballSpecialTeamsStatsDaoTestIt {
  static final String inputFile = "AmericanFootballSpecialTeamsStats.json";
  static AmericanFootballSpecialTeamsStatsDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private AmericanFootballSpecialTeamsStats[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultAmericanFootballSpecialTeamsStatsDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, AmericanFootballSpecialTeamsStats[].class);
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
    AmericanFootballSpecialTeamsStats testResult = dao.find(records[1].getId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals returnsPuntTotal ",
        this.records[1].getReturnsPuntTotal(),
        testResult.getReturnsPuntTotal());
    org.junit.Assert.assertEquals(
        "expect equals returnsPuntYards ",
        this.records[1].getReturnsPuntYards(),
        testResult.getReturnsPuntYards());
    org.junit.Assert.assertEquals(
        "expect equals returnsPuntAverage ",
        this.records[1].getReturnsPuntAverage(),
        testResult.getReturnsPuntAverage());
    org.junit.Assert.assertEquals(
        "expect equals returnsPuntLongest ",
        this.records[1].getReturnsPuntLongest(),
        testResult.getReturnsPuntLongest());
    org.junit.Assert.assertEquals(
        "expect equals returnsPuntTouchdown ",
        this.records[1].getReturnsPuntTouchdown(),
        testResult.getReturnsPuntTouchdown());
    org.junit.Assert.assertEquals(
        "expect equals returnsKickoffTotal ",
        this.records[1].getReturnsKickoffTotal(),
        testResult.getReturnsKickoffTotal());
    org.junit.Assert.assertEquals(
        "expect equals returnsKickoffYards ",
        this.records[1].getReturnsKickoffYards(),
        testResult.getReturnsKickoffYards());
    org.junit.Assert.assertEquals(
        "expect equals returnsKickoffAverage ",
        this.records[1].getReturnsKickoffAverage(),
        testResult.getReturnsKickoffAverage());
    org.junit.Assert.assertEquals(
        "expect equals returnsKickoffLongest ",
        this.records[1].getReturnsKickoffLongest(),
        testResult.getReturnsKickoffLongest());
    org.junit.Assert.assertEquals(
        "expect equals returnsKickoffTouchdown ",
        this.records[1].getReturnsKickoffTouchdown(),
        testResult.getReturnsKickoffTouchdown());
    org.junit.Assert.assertEquals(
        "expect equals returnsTotal ",
        this.records[1].getReturnsTotal(),
        testResult.getReturnsTotal());
    org.junit.Assert.assertEquals(
        "expect equals returnsYards ",
        this.records[1].getReturnsYards(),
        testResult.getReturnsYards());
    org.junit.Assert.assertEquals(
        "expect equals puntsTotal ", this.records[1].getPuntsTotal(), testResult.getPuntsTotal());
    org.junit.Assert.assertEquals(
        "expect equals puntsYardsGross ",
        this.records[1].getPuntsYardsGross(),
        testResult.getPuntsYardsGross());
    org.junit.Assert.assertEquals(
        "expect equals puntsYardsNet ",
        this.records[1].getPuntsYardsNet(),
        testResult.getPuntsYardsNet());
    org.junit.Assert.assertEquals(
        "expect equals puntsLongest ",
        this.records[1].getPuntsLongest(),
        testResult.getPuntsLongest());
    org.junit.Assert.assertEquals(
        "expect equals puntsInside20 ",
        this.records[1].getPuntsInside20(),
        testResult.getPuntsInside20());
    org.junit.Assert.assertEquals(
        "expect equals puntsInside20Percentage ",
        this.records[1].getPuntsInside20Percentage(),
        testResult.getPuntsInside20Percentage());
    org.junit.Assert.assertEquals(
        "expect equals puntsAverage ",
        this.records[1].getPuntsAverage(),
        testResult.getPuntsAverage());
    org.junit.Assert.assertEquals(
        "expect equals puntsBlocked ",
        this.records[1].getPuntsBlocked(),
        testResult.getPuntsBlocked());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksTotal ",
        this.records[1].getTouchbacksTotal(),
        testResult.getTouchbacksTotal());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksTotalPercentage ",
        this.records[1].getTouchbacksTotalPercentage(),
        testResult.getTouchbacksTotalPercentage());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksKickoffs ",
        this.records[1].getTouchbacksKickoffs(),
        testResult.getTouchbacksKickoffs());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksKickoffsPercentage ",
        this.records[1].getTouchbacksKickoffsPercentage(),
        testResult.getTouchbacksKickoffsPercentage());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksPunts ",
        this.records[1].getTouchbacksPunts(),
        testResult.getTouchbacksPunts());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksPuntsPercentage ",
        this.records[1].getTouchbacksPuntsPercentage(),
        testResult.getTouchbacksPuntsPercentage());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksInterceptions ",
        this.records[1].getTouchbacksInterceptions(),
        testResult.getTouchbacksInterceptions());
    org.junit.Assert.assertEquals(
        "expect equals touchbacksInterceptionsPercentage ",
        this.records[1].getTouchbacksInterceptionsPercentage(),
        testResult.getTouchbacksInterceptionsPercentage());
    org.junit.Assert.assertEquals(
        "expect equals fairCatches ",
        this.records[1].getFairCatches(),
        testResult.getFairCatches());
  }
}
