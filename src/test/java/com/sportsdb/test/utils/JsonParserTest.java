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
package com.sportsdb.test.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.sportsdb.test.entity.*;

public class JsonParserTest {
  @Test
  public void testParsingAddresses() throws IOException {
    final String inputFile = "Addresses.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Addresses> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Addresses(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals locationId ",
          o.get("locationId").getAsInt(),
          result.get(i).getLocationId(),
          0.0001);
      assertEquals(
          "expect equals language ", o.get("language").getAsString(), result.get(i).getLanguage());
      assertEquals("expect equals suite ", o.get("suite").getAsString(), result.get(i).getSuite());
      assertEquals("expect equals floor ", o.get("floor").getAsString(), result.get(i).getFloor());
      assertEquals(
          "expect equals building ", o.get("building").getAsString(), result.get(i).getBuilding());
      assertEquals(
          "expect equals streetNumber ",
          o.get("streetNumber").getAsString(),
          result.get(i).getStreetNumber());
      assertEquals(
          "expect equals streetPrefix ",
          o.get("streetPrefix").getAsString(),
          result.get(i).getStreetPrefix());
      assertEquals(
          "expect equals street ", o.get("street").getAsString(), result.get(i).getStreet());
      assertEquals(
          "expect equals streetSuffix ",
          o.get("streetSuffix").getAsString(),
          result.get(i).getStreetSuffix());
      assertEquals(
          "expect equals neighborhood ",
          o.get("neighborhood").getAsString(),
          result.get(i).getNeighborhood());
      assertEquals(
          "expect equals district ", o.get("district").getAsString(), result.get(i).getDistrict());
      assertEquals(
          "expect equals locality ", o.get("locality").getAsString(), result.get(i).getLocality());
      assertEquals(
          "expect equals county ", o.get("county").getAsString(), result.get(i).getCounty());
      assertEquals(
          "expect equals region ", o.get("region").getAsString(), result.get(i).getRegion());
      assertEquals(
          "expect equals postalCode ",
          o.get("postalCode").getAsString(),
          result.get(i).getPostalCode());
      assertEquals(
          "expect equals country ", o.get("country").getAsString(), result.get(i).getCountry());
    }

    result.clear();
  }

  @Test
  public void testParsingAffiliationPhases() throws IOException {
    final String inputFile = "AffiliationPhases.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AffiliationPhases> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AffiliationPhases(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals affiliationId ",
          o.get("affiliationId").getAsInt(),
          result.get(i).getAffiliationId(),
          0.0001);
      assertEquals(
          "expect equals ancestorAffiliationId ",
          o.get("ancestorAffiliationId").getAsInt(),
          result.get(i).getAncestorAffiliationId(),
          0.0001);
      assertEquals(
          "expect equals startSeasonId ",
          o.get("startSeasonId").getAsInt(),
          result.get(i).getStartSeasonId(),
          0.0001);
      assertEquals(
          "expect equals endSeasonId ",
          o.get("endSeasonId").getAsInt(),
          result.get(i).getEndSeasonId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAffiliations() throws IOException {
    final String inputFile = "Affiliations.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Affiliations> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Affiliations(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals affiliationKey ",
          o.get("affiliationKey").getAsString(),
          result.get(i).getAffiliationKey());
      assertEquals(
          "expect equals affiliationType ",
          o.get("affiliationType").getAsString(),
          result.get(i).getAffiliationType());
      assertEquals(
          "expect equals publisherId ",
          o.get("publisherId").getAsInt(),
          result.get(i).getPublisherId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAffiliationsDocuments() throws IOException {
    final String inputFile = "AffiliationsDocuments.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AffiliationsDocuments> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AffiliationsDocuments(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals affiliationId ",
          o.get("affiliationId").getAsInt(),
          result.get(i).getAffiliationId(),
          0.0001);
      assertEquals(
          "expect equals documentId ",
          o.get("documentId").getAsInt(),
          result.get(i).getDocumentId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAffiliationsEvents() throws IOException {
    final String inputFile = "AffiliationsEvents.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AffiliationsEvents> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AffiliationsEvents(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals affiliationId ",
          o.get("affiliationId").getAsInt(),
          result.get(i).getAffiliationId(),
          0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAffiliationsMedia() throws IOException {
    final String inputFile = "AffiliationsMedia.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AffiliationsMedia> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AffiliationsMedia(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals affiliationId ",
          o.get("affiliationId").getAsInt(),
          result.get(i).getAffiliationId(),
          0.0001);
      assertEquals(
          "expect equals mediaId ",
          o.get("mediaId").getAsInt(),
          result.get(i).getMediaId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballActionParticipants() throws IOException {
    final String inputFile = "AmericanFootballActionParticipants.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballActionParticipants> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballActionParticipants(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals americanFootballActionPlayId ",
          o.get("americanFootballActionPlayId").getAsInt(),
          result.get(i).getAmericanFootballActionPlayId(),
          0.0001);
      assertEquals(
          "expect equals personId ",
          o.get("personId").getAsInt(),
          result.get(i).getPersonId(),
          0.0001);
      assertEquals(
          "expect equals participantRole ",
          o.get("participantRole").getAsString(),
          result.get(i).getParticipantRole());
      assertEquals(
          "expect equals scoreType ",
          o.get("scoreType").getAsString(),
          result.get(i).getScoreType());
      assertEquals(
          "expect equals fieldLine ",
          o.get("fieldLine").getAsInt(),
          result.get(i).getFieldLine(),
          0.0001);
      assertEquals(
          "expect equals yardage ",
          o.get("yardage").getAsInt(),
          result.get(i).getYardage(),
          0.0001);
      assertEquals(
          "expect equals scoreCredit ",
          o.get("scoreCredit").getAsInt(),
          result.get(i).getScoreCredit(),
          0.0001);
      assertEquals(
          "expect equals yardsGained ",
          o.get("yardsGained").getAsInt(),
          result.get(i).getYardsGained(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballActionPlays() throws IOException {
    final String inputFile = "AmericanFootballActionPlays.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballActionPlays> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballActionPlays(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals americanFootballEventStateId ",
          o.get("americanFootballEventStateId").getAsInt(),
          result.get(i).getAmericanFootballEventStateId(),
          0.0001);
      assertEquals(
          "expect equals playType ", o.get("playType").getAsString(), result.get(i).getPlayType());
      assertEquals(
          "expect equals scoreAttemptType ",
          o.get("scoreAttemptType").getAsString(),
          result.get(i).getScoreAttemptType());
      assertEquals(
          "expect equals driveResult ",
          o.get("driveResult").getAsString(),
          result.get(i).getDriveResult());
      assertEquals(
          "expect equals points ", o.get("points").getAsInt(), result.get(i).getPoints(), 0.0001);
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballDefensiveStats() throws IOException {
    final String inputFile = "AmericanFootballDefensiveStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballDefensiveStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballDefensiveStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals tacklesTotal ",
          o.get("tacklesTotal").getAsString(),
          result.get(i).getTacklesTotal());
      assertEquals(
          "expect equals tacklesSolo ",
          o.get("tacklesSolo").getAsString(),
          result.get(i).getTacklesSolo());
      assertEquals(
          "expect equals tacklesAssists ",
          o.get("tacklesAssists").getAsString(),
          result.get(i).getTacklesAssists());
      assertEquals(
          "expect equals interceptionsTotal ",
          o.get("interceptionsTotal").getAsString(),
          result.get(i).getInterceptionsTotal());
      assertEquals(
          "expect equals interceptionsYards ",
          o.get("interceptionsYards").getAsString(),
          result.get(i).getInterceptionsYards());
      assertEquals(
          "expect equals interceptionsAverage ",
          o.get("interceptionsAverage").getAsString(),
          result.get(i).getInterceptionsAverage());
      assertEquals(
          "expect equals interceptionsLongest ",
          o.get("interceptionsLongest").getAsString(),
          result.get(i).getInterceptionsLongest());
      assertEquals(
          "expect equals interceptionsTouchdown ",
          o.get("interceptionsTouchdown").getAsString(),
          result.get(i).getInterceptionsTouchdown());
      assertEquals(
          "expect equals quarterbackHurries ",
          o.get("quarterbackHurries").getAsString(),
          result.get(i).getQuarterbackHurries());
      assertEquals(
          "expect equals sacksTotal ",
          o.get("sacksTotal").getAsString(),
          result.get(i).getSacksTotal());
      assertEquals(
          "expect equals sacksYards ",
          o.get("sacksYards").getAsString(),
          result.get(i).getSacksYards());
      assertEquals(
          "expect equals passesDefensed ",
          o.get("passesDefensed").getAsString(),
          result.get(i).getPassesDefensed());
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballDownProgressStats() throws IOException {
    final String inputFile = "AmericanFootballDownProgressStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballDownProgressStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballDownProgressStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals firstDownsTotal ",
          o.get("firstDownsTotal").getAsString(),
          result.get(i).getFirstDownsTotal());
      assertEquals(
          "expect equals firstDownsPass ",
          o.get("firstDownsPass").getAsString(),
          result.get(i).getFirstDownsPass());
      assertEquals(
          "expect equals firstDownsRun ",
          o.get("firstDownsRun").getAsString(),
          result.get(i).getFirstDownsRun());
      assertEquals(
          "expect equals firstDownsPenalty ",
          o.get("firstDownsPenalty").getAsString(),
          result.get(i).getFirstDownsPenalty());
      assertEquals(
          "expect equals conversionsThirdDown ",
          o.get("conversionsThirdDown").getAsString(),
          result.get(i).getConversionsThirdDown());
      assertEquals(
          "expect equals conversionsThirdDownAttempts ",
          o.get("conversionsThirdDownAttempts").getAsString(),
          result.get(i).getConversionsThirdDownAttempts());
      assertEquals(
          "expect equals conversionsThirdDownPercentage ",
          o.get("conversionsThirdDownPercentage").getAsString(),
          result.get(i).getConversionsThirdDownPercentage());
      assertEquals(
          "expect equals conversionsFourthDown ",
          o.get("conversionsFourthDown").getAsString(),
          result.get(i).getConversionsFourthDown());
      assertEquals(
          "expect equals conversionsFourthDownAttempts ",
          o.get("conversionsFourthDownAttempts").getAsString(),
          result.get(i).getConversionsFourthDownAttempts());
      assertEquals(
          "expect equals conversionsFourthDownPercentage ",
          o.get("conversionsFourthDownPercentage").getAsString(),
          result.get(i).getConversionsFourthDownPercentage());
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballEventStates() throws IOException {
    final String inputFile = "AmericanFootballEventStates.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballEventStates> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballEventStates(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals currentState ",
          o.get("currentState").getAsInt(),
          result.get(i).getCurrentState(),
          0.0001);
      assertEquals(
          "expect equals sequenceNumber ",
          o.get("sequenceNumber").getAsInt(),
          result.get(i).getSequenceNumber(),
          0.0001);
      assertEquals(
          "expect equals periodValue ",
          o.get("periodValue").getAsInt(),
          result.get(i).getPeriodValue(),
          0.0001);
      assertEquals(
          "expect equals periodTimeElapsed ",
          o.get("periodTimeElapsed").getAsString(),
          result.get(i).getPeriodTimeElapsed());
      assertEquals(
          "expect equals periodTimeRemaining ",
          o.get("periodTimeRemaining").getAsString(),
          result.get(i).getPeriodTimeRemaining());
      assertEquals(
          "expect equals clockState ",
          o.get("clockState").getAsString(),
          result.get(i).getClockState());
      assertEquals(
          "expect equals down ", o.get("down").getAsInt(), result.get(i).getDown(), 0.0001);
      assertEquals(
          "expect equals teamInPossessionId ",
          o.get("teamInPossessionId").getAsInt(),
          result.get(i).getTeamInPossessionId(),
          0.0001);
      assertEquals(
          "expect equals distanceFor1stDown ",
          o.get("distanceFor1stDown").getAsInt(),
          result.get(i).getDistanceFor1stDown(),
          0.0001);
      assertEquals(
          "expect equals fieldSide ",
          o.get("fieldSide").getAsString(),
          result.get(i).getFieldSide());
      assertEquals(
          "expect equals fieldLine ",
          o.get("fieldLine").getAsInt(),
          result.get(i).getFieldLine(),
          0.0001);
      assertEquals(
          "expect equals context ", o.get("context").getAsString(), result.get(i).getContext());
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballFumblesStats() throws IOException {
    final String inputFile = "AmericanFootballFumblesStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballFumblesStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballFumblesStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals fumblesCommitted ",
          o.get("fumblesCommitted").getAsString(),
          result.get(i).getFumblesCommitted());
      assertEquals(
          "expect equals fumblesForced ",
          o.get("fumblesForced").getAsString(),
          result.get(i).getFumblesForced());
      assertEquals(
          "expect equals fumblesRecovered ",
          o.get("fumblesRecovered").getAsString(),
          result.get(i).getFumblesRecovered());
      assertEquals(
          "expect equals fumblesLost ",
          o.get("fumblesLost").getAsString(),
          result.get(i).getFumblesLost());
      assertEquals(
          "expect equals fumblesYardsGained ",
          o.get("fumblesYardsGained").getAsString(),
          result.get(i).getFumblesYardsGained());
      assertEquals(
          "expect equals fumblesOwnCommitted ",
          o.get("fumblesOwnCommitted").getAsString(),
          result.get(i).getFumblesOwnCommitted());
      assertEquals(
          "expect equals fumblesOwnRecovered ",
          o.get("fumblesOwnRecovered").getAsString(),
          result.get(i).getFumblesOwnRecovered());
      assertEquals(
          "expect equals fumblesOwnLost ",
          o.get("fumblesOwnLost").getAsString(),
          result.get(i).getFumblesOwnLost());
      assertEquals(
          "expect equals fumblesOwnYardsGained ",
          o.get("fumblesOwnYardsGained").getAsString(),
          result.get(i).getFumblesOwnYardsGained());
      assertEquals(
          "expect equals fumblesOpposingCommitted ",
          o.get("fumblesOpposingCommitted").getAsString(),
          result.get(i).getFumblesOpposingCommitted());
      assertEquals(
          "expect equals fumblesOpposingRecovered ",
          o.get("fumblesOpposingRecovered").getAsString(),
          result.get(i).getFumblesOpposingRecovered());
      assertEquals(
          "expect equals fumblesOpposingLost ",
          o.get("fumblesOpposingLost").getAsString(),
          result.get(i).getFumblesOpposingLost());
      assertEquals(
          "expect equals fumblesOpposingYardsGained ",
          o.get("fumblesOpposingYardsGained").getAsString(),
          result.get(i).getFumblesOpposingYardsGained());
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballOffensiveStats() throws IOException {
    final String inputFile = "AmericanFootballOffensiveStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballOffensiveStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballOffensiveStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals offensivePlaysYards ",
          o.get("offensivePlaysYards").getAsString(),
          result.get(i).getOffensivePlaysYards());
      assertEquals(
          "expect equals offensivePlaysNumber ",
          o.get("offensivePlaysNumber").getAsString(),
          result.get(i).getOffensivePlaysNumber());
      assertEquals(
          "expect equals offensivePlaysAverageYardsPer ",
          o.get("offensivePlaysAverageYardsPer").getAsString(),
          result.get(i).getOffensivePlaysAverageYardsPer());
      assertEquals(
          "expect equals possessionDuration ",
          o.get("possessionDuration").getAsString(),
          result.get(i).getPossessionDuration());
      assertEquals(
          "expect equals turnoversGiveaway ",
          o.get("turnoversGiveaway").getAsString(),
          result.get(i).getTurnoversGiveaway());
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballPassingStats() throws IOException {
    final String inputFile = "AmericanFootballPassingStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballPassingStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballPassingStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals passesAttempts ",
          o.get("passesAttempts").getAsString(),
          result.get(i).getPassesAttempts());
      assertEquals(
          "expect equals passesCompletions ",
          o.get("passesCompletions").getAsString(),
          result.get(i).getPassesCompletions());
      assertEquals(
          "expect equals passesPercentage ",
          o.get("passesPercentage").getAsString(),
          result.get(i).getPassesPercentage());
      assertEquals(
          "expect equals passesYardsGross ",
          o.get("passesYardsGross").getAsString(),
          result.get(i).getPassesYardsGross());
      assertEquals(
          "expect equals passesYardsNet ",
          o.get("passesYardsNet").getAsString(),
          result.get(i).getPassesYardsNet());
      assertEquals(
          "expect equals passesYardsLost ",
          o.get("passesYardsLost").getAsString(),
          result.get(i).getPassesYardsLost());
      assertEquals(
          "expect equals passesTouchdowns ",
          o.get("passesTouchdowns").getAsString(),
          result.get(i).getPassesTouchdowns());
      assertEquals(
          "expect equals passesTouchdownsPercentage ",
          o.get("passesTouchdownsPercentage").getAsString(),
          result.get(i).getPassesTouchdownsPercentage());
      assertEquals(
          "expect equals passesInterceptions ",
          o.get("passesInterceptions").getAsString(),
          result.get(i).getPassesInterceptions());
      assertEquals(
          "expect equals passesInterceptionsPercentage ",
          o.get("passesInterceptionsPercentage").getAsString(),
          result.get(i).getPassesInterceptionsPercentage());
      assertEquals(
          "expect equals passesLongest ",
          o.get("passesLongest").getAsString(),
          result.get(i).getPassesLongest());
      assertEquals(
          "expect equals passesAverageYardsPer ",
          o.get("passesAverageYardsPer").getAsString(),
          result.get(i).getPassesAverageYardsPer());
      assertEquals(
          "expect equals passerRating ",
          o.get("passerRating").getAsString(),
          result.get(i).getPasserRating());
      assertEquals(
          "expect equals receptionsTotal ",
          o.get("receptionsTotal").getAsString(),
          result.get(i).getReceptionsTotal());
      assertEquals(
          "expect equals receptionsYards ",
          o.get("receptionsYards").getAsString(),
          result.get(i).getReceptionsYards());
      assertEquals(
          "expect equals receptionsTouchdowns ",
          o.get("receptionsTouchdowns").getAsString(),
          result.get(i).getReceptionsTouchdowns());
      assertEquals(
          "expect equals receptionsFirstDown ",
          o.get("receptionsFirstDown").getAsString(),
          result.get(i).getReceptionsFirstDown());
      assertEquals(
          "expect equals receptionsLongest ",
          o.get("receptionsLongest").getAsString(),
          result.get(i).getReceptionsLongest());
      assertEquals(
          "expect equals receptionsAverageYardsPer ",
          o.get("receptionsAverageYardsPer").getAsString(),
          result.get(i).getReceptionsAverageYardsPer());
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballPenaltiesStats() throws IOException {
    final String inputFile = "AmericanFootballPenaltiesStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballPenaltiesStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballPenaltiesStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals penaltiesTotal ",
          o.get("penaltiesTotal").getAsString(),
          result.get(i).getPenaltiesTotal());
      assertEquals(
          "expect equals penaltyYards ",
          o.get("penaltyYards").getAsString(),
          result.get(i).getPenaltyYards());
      assertEquals(
          "expect equals penaltyFirstDowns ",
          o.get("penaltyFirstDowns").getAsString(),
          result.get(i).getPenaltyFirstDowns());
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballRushingStats() throws IOException {
    final String inputFile = "AmericanFootballRushingStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballRushingStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballRushingStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals rushesAttempts ",
          o.get("rushesAttempts").getAsString(),
          result.get(i).getRushesAttempts());
      assertEquals(
          "expect equals rushesYards ",
          o.get("rushesYards").getAsString(),
          result.get(i).getRushesYards());
      assertEquals(
          "expect equals rushesTouchdowns ",
          o.get("rushesTouchdowns").getAsString(),
          result.get(i).getRushesTouchdowns());
      assertEquals(
          "expect equals rushingAverageYardsPer ",
          o.get("rushingAverageYardsPer").getAsString(),
          result.get(i).getRushingAverageYardsPer());
      assertEquals(
          "expect equals rushesFirstDown ",
          o.get("rushesFirstDown").getAsString(),
          result.get(i).getRushesFirstDown());
      assertEquals(
          "expect equals rushesLongest ",
          o.get("rushesLongest").getAsString(),
          result.get(i).getRushesLongest());
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballSacksAgainstStats() throws IOException {
    final String inputFile = "AmericanFootballSacksAgainstStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballSacksAgainstStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballSacksAgainstStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals sacksAgainstYards ",
          o.get("sacksAgainstYards").getAsString(),
          result.get(i).getSacksAgainstYards());
      assertEquals(
          "expect equals sacksAgainstTotal ",
          o.get("sacksAgainstTotal").getAsString(),
          result.get(i).getSacksAgainstTotal());
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballScoringStats() throws IOException {
    final String inputFile = "AmericanFootballScoringStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballScoringStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballScoringStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals touchdownsTotal ",
          o.get("touchdownsTotal").getAsString(),
          result.get(i).getTouchdownsTotal());
      assertEquals(
          "expect equals touchdownsPassing ",
          o.get("touchdownsPassing").getAsString(),
          result.get(i).getTouchdownsPassing());
      assertEquals(
          "expect equals touchdownsRushing ",
          o.get("touchdownsRushing").getAsString(),
          result.get(i).getTouchdownsRushing());
      assertEquals(
          "expect equals touchdownsSpecialTeams ",
          o.get("touchdownsSpecialTeams").getAsString(),
          result.get(i).getTouchdownsSpecialTeams());
      assertEquals(
          "expect equals touchdownsDefensive ",
          o.get("touchdownsDefensive").getAsString(),
          result.get(i).getTouchdownsDefensive());
      assertEquals(
          "expect equals extraPointsAttempts ",
          o.get("extraPointsAttempts").getAsString(),
          result.get(i).getExtraPointsAttempts());
      assertEquals(
          "expect equals extraPointsMade ",
          o.get("extraPointsMade").getAsString(),
          result.get(i).getExtraPointsMade());
      assertEquals(
          "expect equals extraPointsMissed ",
          o.get("extraPointsMissed").getAsString(),
          result.get(i).getExtraPointsMissed());
      assertEquals(
          "expect equals extraPointsBlocked ",
          o.get("extraPointsBlocked").getAsString(),
          result.get(i).getExtraPointsBlocked());
      assertEquals(
          "expect equals fieldGoalAttempts ",
          o.get("fieldGoalAttempts").getAsString(),
          result.get(i).getFieldGoalAttempts());
      assertEquals(
          "expect equals fieldGoalsMade ",
          o.get("fieldGoalsMade").getAsString(),
          result.get(i).getFieldGoalsMade());
      assertEquals(
          "expect equals fieldGoalsMissed ",
          o.get("fieldGoalsMissed").getAsString(),
          result.get(i).getFieldGoalsMissed());
      assertEquals(
          "expect equals fieldGoalsBlocked ",
          o.get("fieldGoalsBlocked").getAsString(),
          result.get(i).getFieldGoalsBlocked());
      assertEquals(
          "expect equals safetiesAgainst ",
          o.get("safetiesAgainst").getAsString(),
          result.get(i).getSafetiesAgainst());
      assertEquals(
          "expect equals twoPointConversionsAttempts ",
          o.get("twoPointConversionsAttempts").getAsString(),
          result.get(i).getTwoPointConversionsAttempts());
      assertEquals(
          "expect equals twoPointConversionsMade ",
          o.get("twoPointConversionsMade").getAsString(),
          result.get(i).getTwoPointConversionsMade());
      assertEquals(
          "expect equals touchbacksTotal ",
          o.get("touchbacksTotal").getAsString(),
          result.get(i).getTouchbacksTotal());
    }

    result.clear();
  }

  @Test
  public void testParsingAmericanFootballSpecialTeamsStats() throws IOException {
    final String inputFile = "AmericanFootballSpecialTeamsStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmericanFootballSpecialTeamsStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmericanFootballSpecialTeamsStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals returnsPuntTotal ",
          o.get("returnsPuntTotal").getAsString(),
          result.get(i).getReturnsPuntTotal());
      assertEquals(
          "expect equals returnsPuntYards ",
          o.get("returnsPuntYards").getAsString(),
          result.get(i).getReturnsPuntYards());
      assertEquals(
          "expect equals returnsPuntAverage ",
          o.get("returnsPuntAverage").getAsString(),
          result.get(i).getReturnsPuntAverage());
      assertEquals(
          "expect equals returnsPuntLongest ",
          o.get("returnsPuntLongest").getAsString(),
          result.get(i).getReturnsPuntLongest());
      assertEquals(
          "expect equals returnsPuntTouchdown ",
          o.get("returnsPuntTouchdown").getAsString(),
          result.get(i).getReturnsPuntTouchdown());
      assertEquals(
          "expect equals returnsKickoffTotal ",
          o.get("returnsKickoffTotal").getAsString(),
          result.get(i).getReturnsKickoffTotal());
      assertEquals(
          "expect equals returnsKickoffYards ",
          o.get("returnsKickoffYards").getAsString(),
          result.get(i).getReturnsKickoffYards());
      assertEquals(
          "expect equals returnsKickoffAverage ",
          o.get("returnsKickoffAverage").getAsString(),
          result.get(i).getReturnsKickoffAverage());
      assertEquals(
          "expect equals returnsKickoffLongest ",
          o.get("returnsKickoffLongest").getAsString(),
          result.get(i).getReturnsKickoffLongest());
      assertEquals(
          "expect equals returnsKickoffTouchdown ",
          o.get("returnsKickoffTouchdown").getAsString(),
          result.get(i).getReturnsKickoffTouchdown());
      assertEquals(
          "expect equals returnsTotal ",
          o.get("returnsTotal").getAsString(),
          result.get(i).getReturnsTotal());
      assertEquals(
          "expect equals returnsYards ",
          o.get("returnsYards").getAsString(),
          result.get(i).getReturnsYards());
      assertEquals(
          "expect equals puntsTotal ",
          o.get("puntsTotal").getAsString(),
          result.get(i).getPuntsTotal());
      assertEquals(
          "expect equals puntsYardsGross ",
          o.get("puntsYardsGross").getAsString(),
          result.get(i).getPuntsYardsGross());
      assertEquals(
          "expect equals puntsYardsNet ",
          o.get("puntsYardsNet").getAsString(),
          result.get(i).getPuntsYardsNet());
      assertEquals(
          "expect equals puntsLongest ",
          o.get("puntsLongest").getAsString(),
          result.get(i).getPuntsLongest());
      assertEquals(
          "expect equals puntsInside20 ",
          o.get("puntsInside20").getAsString(),
          result.get(i).getPuntsInside20());
      assertEquals(
          "expect equals puntsInside20Percentage ",
          o.get("puntsInside20Percentage").getAsString(),
          result.get(i).getPuntsInside20Percentage());
      assertEquals(
          "expect equals puntsAverage ",
          o.get("puntsAverage").getAsString(),
          result.get(i).getPuntsAverage());
      assertEquals(
          "expect equals puntsBlocked ",
          o.get("puntsBlocked").getAsString(),
          result.get(i).getPuntsBlocked());
      assertEquals(
          "expect equals touchbacksTotal ",
          o.get("touchbacksTotal").getAsString(),
          result.get(i).getTouchbacksTotal());
      assertEquals(
          "expect equals touchbacksTotalPercentage ",
          o.get("touchbacksTotalPercentage").getAsString(),
          result.get(i).getTouchbacksTotalPercentage());
      assertEquals(
          "expect equals touchbacksKickoffs ",
          o.get("touchbacksKickoffs").getAsString(),
          result.get(i).getTouchbacksKickoffs());
      assertEquals(
          "expect equals touchbacksKickoffsPercentage ",
          o.get("touchbacksKickoffsPercentage").getAsString(),
          result.get(i).getTouchbacksKickoffsPercentage());
      assertEquals(
          "expect equals touchbacksPunts ",
          o.get("touchbacksPunts").getAsString(),
          result.get(i).getTouchbacksPunts());
      assertEquals(
          "expect equals touchbacksPuntsPercentage ",
          o.get("touchbacksPuntsPercentage").getAsString(),
          result.get(i).getTouchbacksPuntsPercentage());
      assertEquals(
          "expect equals touchbacksInterceptions ",
          o.get("touchbacksInterceptions").getAsString(),
          result.get(i).getTouchbacksInterceptions());
      assertEquals(
          "expect equals touchbacksInterceptionsPercentage ",
          o.get("touchbacksInterceptionsPercentage").getAsString(),
          result.get(i).getTouchbacksInterceptionsPercentage());
      assertEquals(
          "expect equals fairCatches ",
          o.get("fairCatches").getAsString(),
          result.get(i).getFairCatches());
    }

    result.clear();
  }

  @Test
  public void testParsingBaseballActionContactDetails() throws IOException {
    final String inputFile = "BaseballActionContactDetails.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BaseballActionContactDetails> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BaseballActionContactDetails(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals baseballActionPitchId ",
          o.get("baseballActionPitchId").getAsInt(),
          result.get(i).getBaseballActionPitchId(),
          0.0001);
      assertEquals(
          "expect equals location ", o.get("location").getAsString(), result.get(i).getLocation());
      assertEquals(
          "expect equals strength ", o.get("strength").getAsString(), result.get(i).getStrength());
      assertEquals(
          "expect equals velocity ",
          o.get("velocity").getAsInt(),
          result.get(i).getVelocity(),
          0.0001);
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
      assertEquals(
          "expect equals trajectoryCoordinates ",
          o.get("trajectoryCoordinates").getAsString(),
          result.get(i).getTrajectoryCoordinates());
      assertEquals(
          "expect equals trajectoryFormula ",
          o.get("trajectoryFormula").getAsString(),
          result.get(i).getTrajectoryFormula());
    }

    result.clear();
  }

  @Test
  public void testParsingBaseballActionPitches() throws IOException {
    final String inputFile = "BaseballActionPitches.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BaseballActionPitches> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BaseballActionPitches(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals baseballActionPlayId ",
          o.get("baseballActionPlayId").getAsInt(),
          result.get(i).getBaseballActionPlayId(),
          0.0001);
      assertEquals(
          "expect equals sequenceNumber ",
          o.get("sequenceNumber").getAsInt(),
          result.get(i).getSequenceNumber(),
          0.0001);
      assertEquals(
          "expect equals baseballDefensiveGroupId ",
          o.get("baseballDefensiveGroupId").getAsInt(),
          result.get(i).getBaseballDefensiveGroupId(),
          0.0001);
      assertEquals(
          "expect equals umpireCall ",
          o.get("umpireCall").getAsString(),
          result.get(i).getUmpireCall());
      assertEquals(
          "expect equals pitchLocation ",
          o.get("pitchLocation").getAsString(),
          result.get(i).getPitchLocation());
      assertEquals(
          "expect equals pitchType ",
          o.get("pitchType").getAsString(),
          result.get(i).getPitchType());
      assertEquals(
          "expect equals pitchVelocity ",
          o.get("pitchVelocity").getAsInt(),
          result.get(i).getPitchVelocity(),
          0.0001);
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
      assertEquals(
          "expect equals trajectoryCoordinates ",
          o.get("trajectoryCoordinates").getAsString(),
          result.get(i).getTrajectoryCoordinates());
      assertEquals(
          "expect equals trajectoryFormula ",
          o.get("trajectoryFormula").getAsString(),
          result.get(i).getTrajectoryFormula());
      assertEquals(
          "expect equals ballType ", o.get("ballType").getAsString(), result.get(i).getBallType());
      assertEquals(
          "expect equals strikeType ",
          o.get("strikeType").getAsString(),
          result.get(i).getStrikeType());
    }

    result.clear();
  }

  @Test
  public void testParsingBaseballActionPlays() throws IOException {
    final String inputFile = "BaseballActionPlays.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BaseballActionPlays> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BaseballActionPlays(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals baseballEventStateId ",
          o.get("baseballEventStateId").getAsInt(),
          result.get(i).getBaseballEventStateId(),
          0.0001);
      assertEquals(
          "expect equals playType ", o.get("playType").getAsString(), result.get(i).getPlayType());
      assertEquals(
          "expect equals notation ", o.get("notation").getAsString(), result.get(i).getNotation());
      assertEquals(
          "expect equals notationYaml ",
          o.get("notationYaml").getAsString(),
          result.get(i).getNotationYaml());
      assertEquals(
          "expect equals baseballDefensiveGroupId ",
          o.get("baseballDefensiveGroupId").getAsInt(),
          result.get(i).getBaseballDefensiveGroupId(),
          0.0001);
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
      assertEquals(
          "expect equals runnerOnFirstAdvance ",
          o.get("runnerOnFirstAdvance").getAsInt(),
          result.get(i).getRunnerOnFirstAdvance(),
          0.0001);
      assertEquals(
          "expect equals runnerOnSecondAdvance ",
          o.get("runnerOnSecondAdvance").getAsInt(),
          result.get(i).getRunnerOnSecondAdvance(),
          0.0001);
      assertEquals(
          "expect equals runnerOnThirdAdvance ",
          o.get("runnerOnThirdAdvance").getAsInt(),
          result.get(i).getRunnerOnThirdAdvance(),
          0.0001);
      assertEquals(
          "expect equals outsRecorded ",
          o.get("outsRecorded").getAsInt(),
          result.get(i).getOutsRecorded(),
          0.0001);
      assertEquals("expect equals rbi ", o.get("rbi").getAsInt(), result.get(i).getRbi(), 0.0001);
      assertEquals(
          "expect equals runsScored ",
          o.get("runsScored").getAsInt(),
          result.get(i).getRunsScored(),
          0.0001);
      assertEquals(
          "expect equals earnedRunsScored ",
          o.get("earnedRunsScored").getAsString(),
          result.get(i).getEarnedRunsScored());
    }

    result.clear();
  }

  @Test
  public void testParsingBaseballActionSubstitutions() throws IOException {
    final String inputFile = "BaseballActionSubstitutions.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BaseballActionSubstitutions> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BaseballActionSubstitutions(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals baseballEventStateId ",
          o.get("baseballEventStateId").getAsInt(),
          result.get(i).getBaseballEventStateId(),
          0.0001);
      assertEquals(
          "expect equals sequenceNumber ",
          o.get("sequenceNumber").getAsInt(),
          result.get(i).getSequenceNumber(),
          0.0001);
      assertEquals(
          "expect equals personType ",
          o.get("personType").getAsString(),
          result.get(i).getPersonType());
      assertEquals(
          "expect equals personOriginalId ",
          o.get("personOriginalId").getAsInt(),
          result.get(i).getPersonOriginalId(),
          0.0001);
      assertEquals(
          "expect equals personOriginalPositionId ",
          o.get("personOriginalPositionId").getAsInt(),
          result.get(i).getPersonOriginalPositionId(),
          0.0001);
      assertEquals(
          "expect equals personOriginalLineupSlot ",
          o.get("personOriginalLineupSlot").getAsInt(),
          result.get(i).getPersonOriginalLineupSlot(),
          0.0001);
      assertEquals(
          "expect equals personReplacingId ",
          o.get("personReplacingId").getAsInt(),
          result.get(i).getPersonReplacingId(),
          0.0001);
      assertEquals(
          "expect equals personReplacingPositionId ",
          o.get("personReplacingPositionId").getAsInt(),
          result.get(i).getPersonReplacingPositionId(),
          0.0001);
      assertEquals(
          "expect equals personReplacingLineupSlot ",
          o.get("personReplacingLineupSlot").getAsInt(),
          result.get(i).getPersonReplacingLineupSlot(),
          0.0001);
      assertEquals(
          "expect equals substitutionReason ",
          o.get("substitutionReason").getAsString(),
          result.get(i).getSubstitutionReason());
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
    }

    result.clear();
  }

  @Test
  public void testParsingBaseballDefensiveGroup() throws IOException {
    final String inputFile = "BaseballDefensiveGroup.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BaseballDefensiveGroup> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BaseballDefensiveGroup(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingBaseballDefensivePlayers() throws IOException {
    final String inputFile = "BaseballDefensivePlayers.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BaseballDefensivePlayers> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BaseballDefensivePlayers(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals baseballDefensiveGroupId ",
          o.get("baseballDefensiveGroupId").getAsInt(),
          result.get(i).getBaseballDefensiveGroupId(),
          0.0001);
      assertEquals(
          "expect equals playerId ",
          o.get("playerId").getAsInt(),
          result.get(i).getPlayerId(),
          0.0001);
      assertEquals(
          "expect equals positionId ",
          o.get("positionId").getAsInt(),
          result.get(i).getPositionId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingBaseballDefensiveStats() throws IOException {
    final String inputFile = "BaseballDefensiveStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BaseballDefensiveStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BaseballDefensiveStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals doublePlays ",
          o.get("doublePlays").getAsInt(),
          result.get(i).getDoublePlays(),
          0.0001);
      assertEquals(
          "expect equals triplePlays ",
          o.get("triplePlays").getAsInt(),
          result.get(i).getTriplePlays(),
          0.0001);
      assertEquals(
          "expect equals putouts ",
          o.get("putouts").getAsInt(),
          result.get(i).getPutouts(),
          0.0001);
      assertEquals(
          "expect equals assists ",
          o.get("assists").getAsInt(),
          result.get(i).getAssists(),
          0.0001);
      assertEquals(
          "expect equals errors ", o.get("errors").getAsInt(), result.get(i).getErrors(), 0.0001);
      assertEquals(
          "expect equals fieldingPercentage ",
          o.get("fieldingPercentage").getAsFloat(),
          result.get(i).getFieldingPercentage(),
          0.001);
      assertEquals(
          "expect equals defensiveAverage ",
          o.get("defensiveAverage").getAsFloat(),
          result.get(i).getDefensiveAverage(),
          0.001);
      assertEquals(
          "expect equals errorsPassedBall ",
          o.get("errorsPassedBall").getAsInt(),
          result.get(i).getErrorsPassedBall(),
          0.0001);
      assertEquals(
          "expect equals errorsCatchersInterference ",
          o.get("errorsCatchersInterference").getAsInt(),
          result.get(i).getErrorsCatchersInterference(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingBaseballEventStates() throws IOException {
    final String inputFile = "BaseballEventStates.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BaseballEventStates> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BaseballEventStates(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals currentState ",
          o.get("currentState").getAsInt(),
          result.get(i).getCurrentState(),
          0.0001);
      assertEquals(
          "expect equals sequenceNumber ",
          o.get("sequenceNumber").getAsInt(),
          result.get(i).getSequenceNumber(),
          0.0001);
      assertEquals(
          "expect equals atBatNumber ",
          o.get("atBatNumber").getAsInt(),
          result.get(i).getAtBatNumber(),
          0.0001);
      assertEquals(
          "expect equals inningValue ",
          o.get("inningValue").getAsInt(),
          result.get(i).getInningValue(),
          0.0001);
      assertEquals(
          "expect equals inningHalf ",
          o.get("inningHalf").getAsString(),
          result.get(i).getInningHalf());
      assertEquals(
          "expect equals outs ", o.get("outs").getAsInt(), result.get(i).getOuts(), 0.0001);
      assertEquals(
          "expect equals balls ", o.get("balls").getAsInt(), result.get(i).getBalls(), 0.0001);
      assertEquals(
          "expect equals strikes ",
          o.get("strikes").getAsInt(),
          result.get(i).getStrikes(),
          0.0001);
      assertEquals(
          "expect equals runnerOnFirstId ",
          o.get("runnerOnFirstId").getAsInt(),
          result.get(i).getRunnerOnFirstId(),
          0.0001);
      assertEquals(
          "expect equals runnerOnSecondId ",
          o.get("runnerOnSecondId").getAsInt(),
          result.get(i).getRunnerOnSecondId(),
          0.0001);
      assertEquals(
          "expect equals runnerOnThirdId ",
          o.get("runnerOnThirdId").getAsInt(),
          result.get(i).getRunnerOnThirdId(),
          0.0001);
      assertEquals(
          "expect equals runnerOnFirst ",
          o.get("runnerOnFirst").getAsInt(),
          result.get(i).getRunnerOnFirst(),
          0.0001);
      assertEquals(
          "expect equals runnerOnSecond ",
          o.get("runnerOnSecond").getAsInt(),
          result.get(i).getRunnerOnSecond(),
          0.0001);
      assertEquals(
          "expect equals runnerOnThird ",
          o.get("runnerOnThird").getAsInt(),
          result.get(i).getRunnerOnThird(),
          0.0001);
      assertEquals(
          "expect equals runsThisInningHalf ",
          o.get("runsThisInningHalf").getAsInt(),
          result.get(i).getRunsThisInningHalf(),
          0.0001);
      assertEquals(
          "expect equals pitcherId ",
          o.get("pitcherId").getAsInt(),
          result.get(i).getPitcherId(),
          0.0001);
      assertEquals(
          "expect equals batterId ",
          o.get("batterId").getAsInt(),
          result.get(i).getBatterId(),
          0.0001);
      assertEquals(
          "expect equals batterSide ",
          o.get("batterSide").getAsString(),
          result.get(i).getBatterSide());
      assertEquals(
          "expect equals context ", o.get("context").getAsString(), result.get(i).getContext());
    }

    result.clear();
  }

  @Test
  public void testParsingBaseballOffensiveStats() throws IOException {
    final String inputFile = "BaseballOffensiveStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BaseballOffensiveStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BaseballOffensiveStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals average ",
          o.get("average").getAsFloat(),
          result.get(i).getAverage(),
          0.001);
      assertEquals(
          "expect equals runsScored ",
          o.get("runsScored").getAsInt(),
          result.get(i).getRunsScored(),
          0.0001);
      assertEquals(
          "expect equals atBats ", o.get("atBats").getAsInt(), result.get(i).getAtBats(), 0.0001);
      assertEquals(
          "expect equals hits ", o.get("hits").getAsInt(), result.get(i).getHits(), 0.0001);
      assertEquals("expect equals rbi ", o.get("rbi").getAsInt(), result.get(i).getRbi(), 0.0001);
      assertEquals(
          "expect equals totalBases ",
          o.get("totalBases").getAsInt(),
          result.get(i).getTotalBases(),
          0.0001);
      assertEquals(
          "expect equals sluggingPercentage ",
          o.get("sluggingPercentage").getAsFloat(),
          result.get(i).getSluggingPercentage(),
          0.001);
      assertEquals(
          "expect equals basesOnBalls ",
          o.get("basesOnBalls").getAsInt(),
          result.get(i).getBasesOnBalls(),
          0.0001);
      assertEquals(
          "expect equals strikeouts ",
          o.get("strikeouts").getAsInt(),
          result.get(i).getStrikeouts(),
          0.0001);
      assertEquals(
          "expect equals leftOnBase ",
          o.get("leftOnBase").getAsInt(),
          result.get(i).getLeftOnBase(),
          0.0001);
      assertEquals(
          "expect equals leftInScoringPosition ",
          o.get("leftInScoringPosition").getAsInt(),
          result.get(i).getLeftInScoringPosition(),
          0.0001);
      assertEquals(
          "expect equals singles ",
          o.get("singles").getAsInt(),
          result.get(i).getSingles(),
          0.0001);
      assertEquals(
          "expect equals doubles ",
          o.get("doubles").getAsInt(),
          result.get(i).getDoubles(),
          0.0001);
      assertEquals(
          "expect equals triples ",
          o.get("triples").getAsInt(),
          result.get(i).getTriples(),
          0.0001);
      assertEquals(
          "expect equals homeRuns ",
          o.get("homeRuns").getAsInt(),
          result.get(i).getHomeRuns(),
          0.0001);
      assertEquals(
          "expect equals grandSlams ",
          o.get("grandSlams").getAsInt(),
          result.get(i).getGrandSlams(),
          0.0001);
      assertEquals(
          "expect equals atBatsPerRbi ",
          o.get("atBatsPerRbi").getAsFloat(),
          result.get(i).getAtBatsPerRbi(),
          0.001);
      assertEquals(
          "expect equals plateAppearancesPerRbi ",
          o.get("plateAppearancesPerRbi").getAsFloat(),
          result.get(i).getPlateAppearancesPerRbi(),
          0.001);
      assertEquals(
          "expect equals atBatsPerHomeRun ",
          o.get("atBatsPerHomeRun").getAsFloat(),
          result.get(i).getAtBatsPerHomeRun(),
          0.001);
      assertEquals(
          "expect equals plateAppearancesPerHomeRun ",
          o.get("plateAppearancesPerHomeRun").getAsFloat(),
          result.get(i).getPlateAppearancesPerHomeRun(),
          0.001);
      assertEquals(
          "expect equals sacFlies ",
          o.get("sacFlies").getAsInt(),
          result.get(i).getSacFlies(),
          0.0001);
      assertEquals(
          "expect equals sacBunts ",
          o.get("sacBunts").getAsInt(),
          result.get(i).getSacBunts(),
          0.0001);
      assertEquals(
          "expect equals groundedIntoDoublePlay ",
          o.get("groundedIntoDoublePlay").getAsInt(),
          result.get(i).getGroundedIntoDoublePlay(),
          0.0001);
      assertEquals(
          "expect equals movedUp ",
          o.get("movedUp").getAsInt(),
          result.get(i).getMovedUp(),
          0.0001);
      assertEquals(
          "expect equals onBasePercentage ",
          o.get("onBasePercentage").getAsFloat(),
          result.get(i).getOnBasePercentage(),
          0.001);
      assertEquals(
          "expect equals stolenBases ",
          o.get("stolenBases").getAsInt(),
          result.get(i).getStolenBases(),
          0.0001);
      assertEquals(
          "expect equals stolenBasesCaught ",
          o.get("stolenBasesCaught").getAsInt(),
          result.get(i).getStolenBasesCaught(),
          0.0001);
      assertEquals(
          "expect equals stolenBasesAverage ",
          o.get("stolenBasesAverage").getAsFloat(),
          result.get(i).getStolenBasesAverage(),
          0.001);
      assertEquals(
          "expect equals hitByPitch ",
          o.get("hitByPitch").getAsInt(),
          result.get(i).getHitByPitch(),
          0.0001);
      assertEquals(
          "expect equals defensiveInterferanceReaches ",
          o.get("defensiveInterferanceReaches").getAsInt(),
          result.get(i).getDefensiveInterferanceReaches(),
          0.0001);
      assertEquals(
          "expect equals onBasePlusSlugging ",
          o.get("onBasePlusSlugging").getAsFloat(),
          result.get(i).getOnBasePlusSlugging(),
          0.001);
      assertEquals(
          "expect equals plateAppearances ",
          o.get("plateAppearances").getAsInt(),
          result.get(i).getPlateAppearances(),
          0.0001);
      assertEquals(
          "expect equals hitsExtraBase ",
          o.get("hitsExtraBase").getAsInt(),
          result.get(i).getHitsExtraBase(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingBaseballPitchingStats() throws IOException {
    final String inputFile = "BaseballPitchingStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BaseballPitchingStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BaseballPitchingStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals runsAllowed ",
          o.get("runsAllowed").getAsInt(),
          result.get(i).getRunsAllowed(),
          0.0001);
      assertEquals(
          "expect equals singlesAllowed ",
          o.get("singlesAllowed").getAsInt(),
          result.get(i).getSinglesAllowed(),
          0.0001);
      assertEquals(
          "expect equals doublesAllowed ",
          o.get("doublesAllowed").getAsInt(),
          result.get(i).getDoublesAllowed(),
          0.0001);
      assertEquals(
          "expect equals triplesAllowed ",
          o.get("triplesAllowed").getAsInt(),
          result.get(i).getTriplesAllowed(),
          0.0001);
      assertEquals(
          "expect equals homeRunsAllowed ",
          o.get("homeRunsAllowed").getAsInt(),
          result.get(i).getHomeRunsAllowed(),
          0.0001);
      assertEquals(
          "expect equals inningsPitched ",
          o.get("inningsPitched").getAsString(),
          result.get(i).getInningsPitched());
      assertEquals(
          "expect equals hits ", o.get("hits").getAsInt(), result.get(i).getHits(), 0.0001);
      assertEquals(
          "expect equals earnedRuns ",
          o.get("earnedRuns").getAsInt(),
          result.get(i).getEarnedRuns(),
          0.0001);
      assertEquals(
          "expect equals unearnedRuns ",
          o.get("unearnedRuns").getAsInt(),
          result.get(i).getUnearnedRuns(),
          0.0001);
      assertEquals(
          "expect equals basesOnBalls ",
          o.get("basesOnBalls").getAsInt(),
          result.get(i).getBasesOnBalls(),
          0.0001);
      assertEquals(
          "expect equals basesOnBallsIntentional ",
          o.get("basesOnBallsIntentional").getAsInt(),
          result.get(i).getBasesOnBallsIntentional(),
          0.0001);
      assertEquals(
          "expect equals strikeouts ",
          o.get("strikeouts").getAsInt(),
          result.get(i).getStrikeouts(),
          0.0001);
      assertEquals(
          "expect equals strikeoutToBbRatio ",
          o.get("strikeoutToBbRatio").getAsFloat(),
          result.get(i).getStrikeoutToBbRatio(),
          0.001);
      assertEquals(
          "expect equals numberOfPitches ",
          o.get("numberOfPitches").getAsInt(),
          result.get(i).getNumberOfPitches(),
          0.0001);
      assertEquals("expect equals era ", o.get("era").getAsFloat(), result.get(i).getEra(), 0.001);
      assertEquals(
          "expect equals inheritedRunnersScored ",
          o.get("inheritedRunnersScored").getAsInt(),
          result.get(i).getInheritedRunnersScored(),
          0.0001);
      assertEquals(
          "expect equals pickOffs ",
          o.get("pickOffs").getAsInt(),
          result.get(i).getPickOffs(),
          0.0001);
      assertEquals(
          "expect equals errorsHitWithPitch ",
          o.get("errorsHitWithPitch").getAsInt(),
          result.get(i).getErrorsHitWithPitch(),
          0.0001);
      assertEquals(
          "expect equals errorsWildPitch ",
          o.get("errorsWildPitch").getAsInt(),
          result.get(i).getErrorsWildPitch(),
          0.0001);
      assertEquals(
          "expect equals balks ", o.get("balks").getAsInt(), result.get(i).getBalks(), 0.0001);
      assertEquals(
          "expect equals wins ", o.get("wins").getAsInt(), result.get(i).getWins(), 0.0001);
      assertEquals(
          "expect equals losses ", o.get("losses").getAsInt(), result.get(i).getLosses(), 0.0001);
      assertEquals(
          "expect equals saves ", o.get("saves").getAsInt(), result.get(i).getSaves(), 0.0001);
      assertEquals(
          "expect equals shutouts ",
          o.get("shutouts").getAsInt(),
          result.get(i).getShutouts(),
          0.0001);
      assertEquals(
          "expect equals gamesComplete ",
          o.get("gamesComplete").getAsInt(),
          result.get(i).getGamesComplete(),
          0.0001);
      assertEquals(
          "expect equals gamesFinished ",
          o.get("gamesFinished").getAsInt(),
          result.get(i).getGamesFinished(),
          0.0001);
      assertEquals(
          "expect equals winningPercentage ",
          o.get("winningPercentage").getAsFloat(),
          result.get(i).getWinningPercentage(),
          0.001);
      assertEquals(
          "expect equals eventCredit ",
          o.get("eventCredit").getAsString(),
          result.get(i).getEventCredit());
      assertEquals(
          "expect equals saveCredit ",
          o.get("saveCredit").getAsString(),
          result.get(i).getSaveCredit());
    }

    result.clear();
  }

  @Test
  public void testParsingBasketballDefensiveStats() throws IOException {
    final String inputFile = "BasketballDefensiveStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BasketballDefensiveStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BasketballDefensiveStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals stealsTotal ",
          o.get("stealsTotal").getAsString(),
          result.get(i).getStealsTotal());
      assertEquals(
          "expect equals stealsPerGame ",
          o.get("stealsPerGame").getAsString(),
          result.get(i).getStealsPerGame());
      assertEquals(
          "expect equals blocksTotal ",
          o.get("blocksTotal").getAsString(),
          result.get(i).getBlocksTotal());
      assertEquals(
          "expect equals blocksPerGame ",
          o.get("blocksPerGame").getAsString(),
          result.get(i).getBlocksPerGame());
    }

    result.clear();
  }

  @Test
  public void testParsingBasketballEventStates() throws IOException {
    final String inputFile = "BasketballEventStates.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BasketballEventStates> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BasketballEventStates(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals currentState ",
          o.get("currentState").getAsInt(),
          result.get(i).getCurrentState(),
          0.0001);
      assertEquals(
          "expect equals sequenceNumber ",
          o.get("sequenceNumber").getAsInt(),
          result.get(i).getSequenceNumber(),
          0.0001);
      assertEquals(
          "expect equals periodValue ",
          o.get("periodValue").getAsString(),
          result.get(i).getPeriodValue());
      assertEquals(
          "expect equals periodTimeElapsed ",
          o.get("periodTimeElapsed").getAsString(),
          result.get(i).getPeriodTimeElapsed());
      assertEquals(
          "expect equals periodTimeRemaining ",
          o.get("periodTimeRemaining").getAsString(),
          result.get(i).getPeriodTimeRemaining());
      assertEquals(
          "expect equals context ", o.get("context").getAsString(), result.get(i).getContext());
    }

    result.clear();
  }

  @Test
  public void testParsingBasketballOffensiveStats() throws IOException {
    final String inputFile = "BasketballOffensiveStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BasketballOffensiveStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BasketballOffensiveStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals fieldGoalsMade ",
          o.get("fieldGoalsMade").getAsInt(),
          result.get(i).getFieldGoalsMade(),
          0.0001);
      assertEquals(
          "expect equals fieldGoalsAttempted ",
          o.get("fieldGoalsAttempted").getAsInt(),
          result.get(i).getFieldGoalsAttempted(),
          0.0001);
      assertEquals(
          "expect equals fieldGoalsPercentage ",
          o.get("fieldGoalsPercentage").getAsString(),
          result.get(i).getFieldGoalsPercentage());
      assertEquals(
          "expect equals fieldGoalsPerGame ",
          o.get("fieldGoalsPerGame").getAsString(),
          result.get(i).getFieldGoalsPerGame());
      assertEquals(
          "expect equals fieldGoalsAttemptedPerGame ",
          o.get("fieldGoalsAttemptedPerGame").getAsString(),
          result.get(i).getFieldGoalsAttemptedPerGame());
      assertEquals(
          "expect equals fieldGoalsPercentageAdjusted ",
          o.get("fieldGoalsPercentageAdjusted").getAsString(),
          result.get(i).getFieldGoalsPercentageAdjusted());
      assertEquals(
          "expect equals threePointersMade ",
          o.get("threePointersMade").getAsInt(),
          result.get(i).getThreePointersMade(),
          0.0001);
      assertEquals(
          "expect equals threePointersAttempted ",
          o.get("threePointersAttempted").getAsInt(),
          result.get(i).getThreePointersAttempted(),
          0.0001);
      assertEquals(
          "expect equals threePointersPercentage ",
          o.get("threePointersPercentage").getAsString(),
          result.get(i).getThreePointersPercentage());
      assertEquals(
          "expect equals threePointersPerGame ",
          o.get("threePointersPerGame").getAsString(),
          result.get(i).getThreePointersPerGame());
      assertEquals(
          "expect equals threePointersAttemptedPerGame ",
          o.get("threePointersAttemptedPerGame").getAsString(),
          result.get(i).getThreePointersAttemptedPerGame());
      assertEquals(
          "expect equals freeThrowsMade ",
          o.get("freeThrowsMade").getAsString(),
          result.get(i).getFreeThrowsMade());
      assertEquals(
          "expect equals freeThrowsAttempted ",
          o.get("freeThrowsAttempted").getAsString(),
          result.get(i).getFreeThrowsAttempted());
      assertEquals(
          "expect equals freeThrowsPercentage ",
          o.get("freeThrowsPercentage").getAsString(),
          result.get(i).getFreeThrowsPercentage());
      assertEquals(
          "expect equals freeThrowsPerGame ",
          o.get("freeThrowsPerGame").getAsString(),
          result.get(i).getFreeThrowsPerGame());
      assertEquals(
          "expect equals freeThrowsAttemptedPerGame ",
          o.get("freeThrowsAttemptedPerGame").getAsString(),
          result.get(i).getFreeThrowsAttemptedPerGame());
      assertEquals(
          "expect equals pointsScoredTotal ",
          o.get("pointsScoredTotal").getAsString(),
          result.get(i).getPointsScoredTotal());
      assertEquals(
          "expect equals pointsScoredPerGame ",
          o.get("pointsScoredPerGame").getAsString(),
          result.get(i).getPointsScoredPerGame());
      assertEquals(
          "expect equals assistsTotal ",
          o.get("assistsTotal").getAsString(),
          result.get(i).getAssistsTotal());
      assertEquals(
          "expect equals assistsPerGame ",
          o.get("assistsPerGame").getAsString(),
          result.get(i).getAssistsPerGame());
      assertEquals(
          "expect equals turnoversTotal ",
          o.get("turnoversTotal").getAsString(),
          result.get(i).getTurnoversTotal());
      assertEquals(
          "expect equals turnoversPerGame ",
          o.get("turnoversPerGame").getAsString(),
          result.get(i).getTurnoversPerGame());
      assertEquals(
          "expect equals pointsScoredOffTurnovers ",
          o.get("pointsScoredOffTurnovers").getAsString(),
          result.get(i).getPointsScoredOffTurnovers());
      assertEquals(
          "expect equals pointsScoredInPaint ",
          o.get("pointsScoredInPaint").getAsString(),
          result.get(i).getPointsScoredInPaint());
      assertEquals(
          "expect equals pointsScoredOnSecondChance ",
          o.get("pointsScoredOnSecondChance").getAsString(),
          result.get(i).getPointsScoredOnSecondChance());
      assertEquals(
          "expect equals pointsScoredOnFastBreak ",
          o.get("pointsScoredOnFastBreak").getAsString(),
          result.get(i).getPointsScoredOnFastBreak());
    }

    result.clear();
  }

  @Test
  public void testParsingBasketballReboundingStats() throws IOException {
    final String inputFile = "BasketballReboundingStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BasketballReboundingStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BasketballReboundingStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals reboundsTotal ",
          o.get("reboundsTotal").getAsString(),
          result.get(i).getReboundsTotal());
      assertEquals(
          "expect equals reboundsPerGame ",
          o.get("reboundsPerGame").getAsString(),
          result.get(i).getReboundsPerGame());
      assertEquals(
          "expect equals reboundsDefensive ",
          o.get("reboundsDefensive").getAsString(),
          result.get(i).getReboundsDefensive());
      assertEquals(
          "expect equals reboundsOffensive ",
          o.get("reboundsOffensive").getAsString(),
          result.get(i).getReboundsOffensive());
      assertEquals(
          "expect equals teamReboundsTotal ",
          o.get("teamReboundsTotal").getAsString(),
          result.get(i).getTeamReboundsTotal());
      assertEquals(
          "expect equals teamReboundsPerGame ",
          o.get("teamReboundsPerGame").getAsString(),
          result.get(i).getTeamReboundsPerGame());
      assertEquals(
          "expect equals teamReboundsDefensive ",
          o.get("teamReboundsDefensive").getAsString(),
          result.get(i).getTeamReboundsDefensive());
      assertEquals(
          "expect equals teamReboundsOffensive ",
          o.get("teamReboundsOffensive").getAsString(),
          result.get(i).getTeamReboundsOffensive());
    }

    result.clear();
  }

  @Test
  public void testParsingBasketballTeamStats() throws IOException {
    final String inputFile = "BasketballTeamStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<BasketballTeamStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2BasketballTeamStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals timeoutsLeft ",
          o.get("timeoutsLeft").getAsString(),
          result.get(i).getTimeoutsLeft());
      assertEquals(
          "expect equals largestLead ",
          o.get("largestLead").getAsString(),
          result.get(i).getLargestLead());
      assertEquals(
          "expect equals foulsTotal ",
          o.get("foulsTotal").getAsString(),
          result.get(i).getFoulsTotal());
      assertEquals(
          "expect equals turnoverMargin ",
          o.get("turnoverMargin").getAsString(),
          result.get(i).getTurnoverMargin());
    }

    result.clear();
  }

  @Test
  public void testParsingBookmakers() throws IOException {
    final String inputFile = "Bookmakers.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Bookmakers> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Bookmakers(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals bookmakerKey ",
          o.get("bookmakerKey").getAsString(),
          result.get(i).getBookmakerKey());
      assertEquals(
          "expect equals publisherId ",
          o.get("publisherId").getAsInt(),
          result.get(i).getPublisherId(),
          0.0001);
      assertEquals(
          "expect equals locationId ",
          o.get("locationId").getAsInt(),
          result.get(i).getLocationId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCorePersonStats() throws IOException {
    final String inputFile = "CorePersonStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CorePersonStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CorePersonStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals timePlayedEvent ",
          o.get("timePlayedEvent").getAsString(),
          result.get(i).getTimePlayedEvent());
      assertEquals(
          "expect equals timePlayedTotal ",
          o.get("timePlayedTotal").getAsString(),
          result.get(i).getTimePlayedTotal());
      assertEquals(
          "expect equals timePlayedEventAverage ",
          o.get("timePlayedEventAverage").getAsString(),
          result.get(i).getTimePlayedEventAverage());
      assertEquals(
          "expect equals eventsPlayed ",
          o.get("eventsPlayed").getAsInt(),
          result.get(i).getEventsPlayed(),
          0.0001);
      assertEquals(
          "expect equals eventsStarted ",
          o.get("eventsStarted").getAsInt(),
          result.get(i).getEventsStarted(),
          0.0001);
      assertEquals(
          "expect equals positionId ",
          o.get("positionId").getAsInt(),
          result.get(i).getPositionId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCoreStats() throws IOException {
    final String inputFile = "CoreStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CoreStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CoreStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals("expect equals score ", o.get("score").getAsString(), result.get(i).getScore());
      assertEquals(
          "expect equals scoreOpposing ",
          o.get("scoreOpposing").getAsString(),
          result.get(i).getScoreOpposing());
      assertEquals(
          "expect equals scoreAttempts ",
          o.get("scoreAttempts").getAsString(),
          result.get(i).getScoreAttempts());
      assertEquals(
          "expect equals scoreAttemptsOpposing ",
          o.get("scoreAttemptsOpposing").getAsString(),
          result.get(i).getScoreAttemptsOpposing());
      assertEquals(
          "expect equals scorePercentage ",
          o.get("scorePercentage").getAsString(),
          result.get(i).getScorePercentage());
      assertEquals(
          "expect equals scorePercentageOpposing ",
          o.get("scorePercentageOpposing").getAsString(),
          result.get(i).getScorePercentageOpposing());
    }

    result.clear();
  }

  @Test
  public void testParsingDbInfo() throws IOException {
    final String inputFile = "DbInfo.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DbInfo> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DbInfo(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals version ", o.get("version").getAsString(), result.get(i).getVersion());
    }

    result.clear();
  }

  @Test
  public void testParsingDisplayNames() throws IOException {
    final String inputFile = "DisplayNames.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DisplayNames> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DisplayNames(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals language ", o.get("language").getAsString(), result.get(i).getLanguage());
      assertEquals(
          "expect equals entityType ",
          o.get("entityType").getAsString(),
          result.get(i).getEntityType());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals fullName ", o.get("fullName").getAsString(), result.get(i).getFullName());
      assertEquals(
          "expect equals firstName ",
          o.get("firstName").getAsString(),
          result.get(i).getFirstName());
      assertEquals(
          "expect equals middleName ",
          o.get("middleName").getAsString(),
          result.get(i).getMiddleName());
      assertEquals(
          "expect equals lastName ", o.get("lastName").getAsString(), result.get(i).getLastName());
      assertEquals("expect equals alias ", o.get("alias").getAsString(), result.get(i).getAlias());
      assertEquals(
          "expect equals abbreviation ",
          o.get("abbreviation").getAsString(),
          result.get(i).getAbbreviation());
      assertEquals(
          "expect equals shortName ",
          o.get("shortName").getAsString(),
          result.get(i).getShortName());
      assertEquals(
          "expect equals prefix ", o.get("prefix").getAsString(), result.get(i).getPrefix());
      assertEquals(
          "expect equals suffix ", o.get("suffix").getAsString(), result.get(i).getSuffix());
    }

    result.clear();
  }

  @Test
  public void testParsingDocumentClasses() throws IOException {
    final String inputFile = "DocumentClasses.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DocumentClasses> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DocumentClasses(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
    }

    result.clear();
  }

  @Test
  public void testParsingDocumentContents() throws IOException {
    final String inputFile = "DocumentContents.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DocumentContents> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DocumentContents(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals documentId ",
          o.get("documentId").getAsInt(),
          result.get(i).getDocumentId(),
          0.0001);
      assertEquals(
          "expect equals sportsml ", o.get("sportsml").getAsString(), result.get(i).getSportsml());
      assertEquals(
          "expect equals abstract1 ",
          o.get("abstract1").getAsString(),
          result.get(i).getAbstract1());
    }

    result.clear();
  }

  @Test
  public void testParsingDocumentFixtures() throws IOException {
    final String inputFile = "DocumentFixtures.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DocumentFixtures> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DocumentFixtures(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals fixtureKey ",
          o.get("fixtureKey").getAsString(),
          result.get(i).getFixtureKey());
      assertEquals(
          "expect equals publisherId ",
          o.get("publisherId").getAsInt(),
          result.get(i).getPublisherId(),
          0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals documentClassId ",
          o.get("documentClassId").getAsInt(),
          result.get(i).getDocumentClassId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingDocumentFixturesEvents() throws IOException {
    final String inputFile = "DocumentFixturesEvents.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DocumentFixturesEvents> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DocumentFixturesEvents(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals documentFixtureId ",
          o.get("documentFixtureId").getAsInt(),
          result.get(i).getDocumentFixtureId(),
          0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals latestDocumentId ",
          o.get("latestDocumentId").getAsInt(),
          result.get(i).getLatestDocumentId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingDocumentPackageEntry() throws IOException {
    final String inputFile = "DocumentPackageEntry.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DocumentPackageEntry> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DocumentPackageEntry(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals documentPackageId ",
          o.get("documentPackageId").getAsInt(),
          result.get(i).getDocumentPackageId(),
          0.0001);
      assertEquals("expect equals rank ", o.get("rank").getAsString(), result.get(i).getRank());
      assertEquals(
          "expect equals documentId ",
          o.get("documentId").getAsInt(),
          result.get(i).getDocumentId(),
          0.0001);
      assertEquals(
          "expect equals headline ", o.get("headline").getAsString(), result.get(i).getHeadline());
      assertEquals(
          "expect equals shortHeadline ",
          o.get("shortHeadline").getAsString(),
          result.get(i).getShortHeadline());
    }

    result.clear();
  }

  @Test
  public void testParsingDocumentPackages() throws IOException {
    final String inputFile = "DocumentPackages.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DocumentPackages> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DocumentPackages(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals packageKey ",
          o.get("packageKey").getAsString(),
          result.get(i).getPackageKey());
      assertEquals(
          "expect equals packageName ",
          o.get("packageName").getAsString(),
          result.get(i).getPackageName());
    }

    result.clear();
  }

  @Test
  public void testParsingDocuments() throws IOException {
    final String inputFile = "Documents.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Documents> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Documents(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals("expect equals docId ", o.get("docId").getAsString(), result.get(i).getDocId());
      assertEquals(
          "expect equals publisherId ",
          o.get("publisherId").getAsInt(),
          result.get(i).getPublisherId(),
          0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals language ", o.get("language").getAsString(), result.get(i).getLanguage());
      assertEquals(
          "expect equals priority ", o.get("priority").getAsString(), result.get(i).getPriority());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsString(),
          result.get(i).getRevisionId());
      assertEquals(
          "expect equals statsCoverage ",
          o.get("statsCoverage").getAsString(),
          result.get(i).getStatsCoverage());
      assertEquals(
          "expect equals documentFixtureId ",
          o.get("documentFixtureId").getAsInt(),
          result.get(i).getDocumentFixtureId(),
          0.0001);
      assertEquals(
          "expect equals sourceId ",
          o.get("sourceId").getAsInt(),
          result.get(i).getSourceId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingDocumentsMedia() throws IOException {
    final String inputFile = "DocumentsMedia.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DocumentsMedia> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DocumentsMedia(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals documentId ",
          o.get("documentId").getAsInt(),
          result.get(i).getDocumentId(),
          0.0001);
      assertEquals(
          "expect equals mediaId ",
          o.get("mediaId").getAsInt(),
          result.get(i).getMediaId(),
          0.0001);
      assertEquals(
          "expect equals mediaCaptionId ",
          o.get("mediaCaptionId").getAsInt(),
          result.get(i).getMediaCaptionId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEvents() throws IOException {
    final String inputFile = "Events.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Events> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Events(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals eventKey ", o.get("eventKey").getAsString(), result.get(i).getEventKey());
      assertEquals(
          "expect equals publisherId ",
          o.get("publisherId").getAsInt(),
          result.get(i).getPublisherId(),
          0.0001);
      assertEquals(
          "expect equals siteId ", o.get("siteId").getAsInt(), result.get(i).getSiteId(), 0.0001);
      assertEquals(
          "expect equals siteAlignment ",
          o.get("siteAlignment").getAsString(),
          result.get(i).getSiteAlignment());
      assertEquals(
          "expect equals eventStatus ",
          o.get("eventStatus").getAsString(),
          result.get(i).getEventStatus());
      assertEquals(
          "expect equals duration ", o.get("duration").getAsString(), result.get(i).getDuration());
      assertEquals(
          "expect equals attendance ",
          o.get("attendance").getAsString(),
          result.get(i).getAttendance());
    }

    result.clear();
  }

  @Test
  public void testParsingEventsDocuments() throws IOException {
    final String inputFile = "EventsDocuments.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EventsDocuments> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EventsDocuments(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals documentId ",
          o.get("documentId").getAsInt(),
          result.get(i).getDocumentId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEventsMedia() throws IOException {
    final String inputFile = "EventsMedia.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EventsMedia> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EventsMedia(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals mediaId ",
          o.get("mediaId").getAsInt(),
          result.get(i).getMediaId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEventsSubSeasons() throws IOException {
    final String inputFile = "EventsSubSeasons.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EventsSubSeasons> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EventsSubSeasons(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals subSeasonId ",
          o.get("subSeasonId").getAsInt(),
          result.get(i).getSubSeasonId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingIceHockeyActionParticipants() throws IOException {
    final String inputFile = "IceHockeyActionParticipants.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<IceHockeyActionParticipants> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2IceHockeyActionParticipants(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals iceHockeyActionPlayId ",
          o.get("iceHockeyActionPlayId").getAsInt(),
          result.get(i).getIceHockeyActionPlayId(),
          0.0001);
      assertEquals(
          "expect equals personId ",
          o.get("personId").getAsInt(),
          result.get(i).getPersonId(),
          0.0001);
      assertEquals(
          "expect equals participantRole ",
          o.get("participantRole").getAsString(),
          result.get(i).getParticipantRole());
      assertEquals(
          "expect equals pointCredit ",
          o.get("pointCredit").getAsInt(),
          result.get(i).getPointCredit(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingIceHockeyActionPlays() throws IOException {
    final String inputFile = "IceHockeyActionPlays.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<IceHockeyActionPlays> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2IceHockeyActionPlays(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals iceHockeyEventStateId ",
          o.get("iceHockeyEventStateId").getAsInt(),
          result.get(i).getIceHockeyEventStateId(),
          0.0001);
      assertEquals(
          "expect equals playType ", o.get("playType").getAsString(), result.get(i).getPlayType());
      assertEquals(
          "expect equals scoreAttemptType ",
          o.get("scoreAttemptType").getAsString(),
          result.get(i).getScoreAttemptType());
      assertEquals(
          "expect equals playResult ",
          o.get("playResult").getAsString(),
          result.get(i).getPlayResult());
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
    }

    result.clear();
  }

  @Test
  public void testParsingIceHockeyDefensiveStats() throws IOException {
    final String inputFile = "IceHockeyDefensiveStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<IceHockeyDefensiveStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2IceHockeyDefensiveStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals shotsPowerPlayAllowed ",
          o.get("shotsPowerPlayAllowed").getAsString(),
          result.get(i).getShotsPowerPlayAllowed());
      assertEquals(
          "expect equals shotsPenaltyShotAllowed ",
          o.get("shotsPenaltyShotAllowed").getAsString(),
          result.get(i).getShotsPenaltyShotAllowed());
      assertEquals(
          "expect equals goalsPowerPlayAllowed ",
          o.get("goalsPowerPlayAllowed").getAsString(),
          result.get(i).getGoalsPowerPlayAllowed());
      assertEquals(
          "expect equals goalsPenaltyShotAllowed ",
          o.get("goalsPenaltyShotAllowed").getAsString(),
          result.get(i).getGoalsPenaltyShotAllowed());
      assertEquals(
          "expect equals goalsAgainstAverage ",
          o.get("goalsAgainstAverage").getAsString(),
          result.get(i).getGoalsAgainstAverage());
      assertEquals("expect equals saves ", o.get("saves").getAsString(), result.get(i).getSaves());
      assertEquals(
          "expect equals savePercentage ",
          o.get("savePercentage").getAsString(),
          result.get(i).getSavePercentage());
      assertEquals(
          "expect equals penaltyKillingAmount ",
          o.get("penaltyKillingAmount").getAsString(),
          result.get(i).getPenaltyKillingAmount());
      assertEquals(
          "expect equals penaltyKillingPercentage ",
          o.get("penaltyKillingPercentage").getAsString(),
          result.get(i).getPenaltyKillingPercentage());
      assertEquals(
          "expect equals shotsBlocked ",
          o.get("shotsBlocked").getAsString(),
          result.get(i).getShotsBlocked());
      assertEquals(
          "expect equals takeaways ",
          o.get("takeaways").getAsString(),
          result.get(i).getTakeaways());
      assertEquals(
          "expect equals shutouts ", o.get("shutouts").getAsString(), result.get(i).getShutouts());
      assertEquals(
          "expect equals minutesPenaltyKilling ",
          o.get("minutesPenaltyKilling").getAsString(),
          result.get(i).getMinutesPenaltyKilling());
      assertEquals("expect equals hits ", o.get("hits").getAsString(), result.get(i).getHits());
      assertEquals(
          "expect equals goalsEmptyNetAllowed ",
          o.get("goalsEmptyNetAllowed").getAsString(),
          result.get(i).getGoalsEmptyNetAllowed());
      assertEquals(
          "expect equals goalsShortHandedAllowed ",
          o.get("goalsShortHandedAllowed").getAsString(),
          result.get(i).getGoalsShortHandedAllowed());
      assertEquals(
          "expect equals goalsShootoutAllowed ",
          o.get("goalsShootoutAllowed").getAsString(),
          result.get(i).getGoalsShootoutAllowed());
      assertEquals(
          "expect equals shotsShootoutAllowed ",
          o.get("shotsShootoutAllowed").getAsString(),
          result.get(i).getShotsShootoutAllowed());
    }

    result.clear();
  }

  @Test
  public void testParsingIceHockeyEventStates() throws IOException {
    final String inputFile = "IceHockeyEventStates.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<IceHockeyEventStates> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2IceHockeyEventStates(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals currentState ",
          o.get("currentState").getAsInt(),
          result.get(i).getCurrentState(),
          0.0001);
      assertEquals(
          "expect equals sequenceNumber ",
          o.get("sequenceNumber").getAsInt(),
          result.get(i).getSequenceNumber(),
          0.0001);
      assertEquals(
          "expect equals periodValue ",
          o.get("periodValue").getAsString(),
          result.get(i).getPeriodValue());
      assertEquals(
          "expect equals periodTimeElapsed ",
          o.get("periodTimeElapsed").getAsString(),
          result.get(i).getPeriodTimeElapsed());
      assertEquals(
          "expect equals periodTimeRemaining ",
          o.get("periodTimeRemaining").getAsString(),
          result.get(i).getPeriodTimeRemaining());
      assertEquals(
          "expect equals context ", o.get("context").getAsString(), result.get(i).getContext());
    }

    result.clear();
  }

  @Test
  public void testParsingIceHockeyOffensiveStats() throws IOException {
    final String inputFile = "IceHockeyOffensiveStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<IceHockeyOffensiveStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2IceHockeyOffensiveStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals goalsGameWinning ",
          o.get("goalsGameWinning").getAsString(),
          result.get(i).getGoalsGameWinning());
      assertEquals(
          "expect equals goalsGameTying ",
          o.get("goalsGameTying").getAsString(),
          result.get(i).getGoalsGameTying());
      assertEquals(
          "expect equals goalsPowerPlay ",
          o.get("goalsPowerPlay").getAsString(),
          result.get(i).getGoalsPowerPlay());
      assertEquals(
          "expect equals goalsShortHanded ",
          o.get("goalsShortHanded").getAsString(),
          result.get(i).getGoalsShortHanded());
      assertEquals(
          "expect equals goalsEvenStrength ",
          o.get("goalsEvenStrength").getAsString(),
          result.get(i).getGoalsEvenStrength());
      assertEquals(
          "expect equals goalsEmptyNet ",
          o.get("goalsEmptyNet").getAsString(),
          result.get(i).getGoalsEmptyNet());
      assertEquals(
          "expect equals goalsOvertime ",
          o.get("goalsOvertime").getAsString(),
          result.get(i).getGoalsOvertime());
      assertEquals(
          "expect equals goalsShootout ",
          o.get("goalsShootout").getAsString(),
          result.get(i).getGoalsShootout());
      assertEquals(
          "expect equals goalsPenaltyShot ",
          o.get("goalsPenaltyShot").getAsString(),
          result.get(i).getGoalsPenaltyShot());
      assertEquals(
          "expect equals assists ", o.get("assists").getAsString(), result.get(i).getAssists());
      assertEquals(
          "expect equals points ", o.get("points").getAsString(), result.get(i).getPoints());
      assertEquals(
          "expect equals powerPlayAmount ",
          o.get("powerPlayAmount").getAsString(),
          result.get(i).getPowerPlayAmount());
      assertEquals(
          "expect equals powerPlayPercentage ",
          o.get("powerPlayPercentage").getAsString(),
          result.get(i).getPowerPlayPercentage());
      assertEquals(
          "expect equals shotsPenaltyShotTaken ",
          o.get("shotsPenaltyShotTaken").getAsString(),
          result.get(i).getShotsPenaltyShotTaken());
      assertEquals(
          "expect equals shotsPenaltyShotMissed ",
          o.get("shotsPenaltyShotMissed").getAsString(),
          result.get(i).getShotsPenaltyShotMissed());
      assertEquals(
          "expect equals shotsPenaltyShotPercentage ",
          o.get("shotsPenaltyShotPercentage").getAsString(),
          result.get(i).getShotsPenaltyShotPercentage());
      assertEquals(
          "expect equals giveaways ",
          o.get("giveaways").getAsString(),
          result.get(i).getGiveaways());
      assertEquals(
          "expect equals minutesPowerPlay ",
          o.get("minutesPowerPlay").getAsString(),
          result.get(i).getMinutesPowerPlay());
      assertEquals(
          "expect equals faceoffWins ",
          o.get("faceoffWins").getAsString(),
          result.get(i).getFaceoffWins());
      assertEquals(
          "expect equals faceoffLosses ",
          o.get("faceoffLosses").getAsString(),
          result.get(i).getFaceoffLosses());
      assertEquals(
          "expect equals faceoffWinPercentage ",
          o.get("faceoffWinPercentage").getAsString(),
          result.get(i).getFaceoffWinPercentage());
      assertEquals(
          "expect equals scoringChances ",
          o.get("scoringChances").getAsString(),
          result.get(i).getScoringChances());
    }

    result.clear();
  }

  @Test
  public void testParsingIceHockeyPlayerStats() throws IOException {
    final String inputFile = "IceHockeyPlayerStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<IceHockeyPlayerStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2IceHockeyPlayerStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals plusMinus ",
          o.get("plusMinus").getAsString(),
          result.get(i).getPlusMinus());
    }

    result.clear();
  }

  @Test
  public void testParsingInjuryPhases() throws IOException {
    final String inputFile = "InjuryPhases.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<InjuryPhases> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2InjuryPhases(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals personId ",
          o.get("personId").getAsInt(),
          result.get(i).getPersonId(),
          0.0001);
      assertEquals(
          "expect equals injuryStatus ",
          o.get("injuryStatus").getAsString(),
          result.get(i).getInjuryStatus());
      assertEquals(
          "expect equals injuryType ",
          o.get("injuryType").getAsString(),
          result.get(i).getInjuryType());
      assertEquals(
          "expect equals injuryComment ",
          o.get("injuryComment").getAsString(),
          result.get(i).getInjuryComment());
      assertEquals(
          "expect equals disabledList ",
          o.get("disabledList").getAsString(),
          result.get(i).getDisabledList());
      assertEquals(
          "expect equals seasonId ",
          o.get("seasonId").getAsInt(),
          result.get(i).getSeasonId(),
          0.0001);
      assertEquals(
          "expect equals phaseType ",
          o.get("phaseType").getAsString(),
          result.get(i).getPhaseType());
      assertEquals(
          "expect equals injurySide ",
          o.get("injurySide").getAsString(),
          result.get(i).getInjurySide());
    }

    result.clear();
  }

  @Test
  public void testParsingKeyAliases() throws IOException {
    final String inputFile = "KeyAliases.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<KeyAliases> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2KeyAliases(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals keyId ", o.get("keyId").getAsInt(), result.get(i).getKeyId(), 0.0001);
      assertEquals(
          "expect equals keyRootId ",
          o.get("keyRootId").getAsInt(),
          result.get(i).getKeyRootId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingKeyRoots() throws IOException {
    final String inputFile = "KeyRoots.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<KeyRoots> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2KeyRoots(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals keyType ", o.get("keyType").getAsString(), result.get(i).getKeyType());
    }

    result.clear();
  }

  @Test
  public void testParsingLatestRevisions() throws IOException {
    final String inputFile = "LatestRevisions.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LatestRevisions> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LatestRevisions(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsString(),
          result.get(i).getRevisionId());
      assertEquals(
          "expect equals latestDocumentId ",
          o.get("latestDocumentId").getAsInt(),
          result.get(i).getLatestDocumentId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLocations() throws IOException {
    final String inputFile = "Locations.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Locations> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Locations(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals timezone ", o.get("timezone").getAsString(), result.get(i).getTimezone());
      assertEquals(
          "expect equals latitude ", o.get("latitude").getAsString(), result.get(i).getLatitude());
      assertEquals(
          "expect equals longitude ",
          o.get("longitude").getAsString(),
          result.get(i).getLongitude());
      assertEquals(
          "expect equals countryCode ",
          o.get("countryCode").getAsString(),
          result.get(i).getCountryCode());
    }

    result.clear();
  }

  @Test
  public void testParsingMedia() throws IOException {
    final String inputFile = "Media.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Media> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Media(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals objectId ",
          o.get("objectId").getAsInt(),
          result.get(i).getObjectId(),
          0.0001);
      assertEquals(
          "expect equals sourceId ",
          o.get("sourceId").getAsInt(),
          result.get(i).getSourceId(),
          0.0001);
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals mediaType ",
          o.get("mediaType").getAsString(),
          result.get(i).getMediaType());
      assertEquals(
          "expect equals publisherId ",
          o.get("publisherId").getAsInt(),
          result.get(i).getPublisherId(),
          0.0001);
      assertEquals(
          "expect equals dateTime ", o.get("dateTime").getAsString(), result.get(i).getDateTime());
      assertEquals(
          "expect equals creditId ",
          o.get("creditId").getAsInt(),
          result.get(i).getCreditId(),
          0.0001);
      assertEquals(
          "expect equals creationLocationId ",
          o.get("creationLocationId").getAsInt(),
          result.get(i).getCreationLocationId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingMediaCaptions() throws IOException {
    final String inputFile = "MediaCaptions.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MediaCaptions> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MediaCaptions(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals mediaId ",
          o.get("mediaId").getAsInt(),
          result.get(i).getMediaId(),
          0.0001);
      assertEquals(
          "expect equals captionType ",
          o.get("captionType").getAsString(),
          result.get(i).getCaptionType());
      assertEquals(
          "expect equals caption ", o.get("caption").getAsString(), result.get(i).getCaption());
      assertEquals(
          "expect equals captionAuthorId ",
          o.get("captionAuthorId").getAsInt(),
          result.get(i).getCaptionAuthorId(),
          0.0001);
      assertEquals(
          "expect equals language ", o.get("language").getAsString(), result.get(i).getLanguage());
      assertEquals(
          "expect equals captionSize ",
          o.get("captionSize").getAsString(),
          result.get(i).getCaptionSize());
    }

    result.clear();
  }

  @Test
  public void testParsingMediaContents() throws IOException {
    final String inputFile = "MediaContents.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MediaContents> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MediaContents(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals mediaId ",
          o.get("mediaId").getAsInt(),
          result.get(i).getMediaId(),
          0.0001);
      assertEquals(
          "expect equals object ", o.get("object").getAsString(), result.get(i).getObject());
      assertEquals(
          "expect equals format ", o.get("format").getAsString(), result.get(i).getFormat());
      assertEquals(
          "expect equals mimeType ", o.get("mimeType").getAsString(), result.get(i).getMimeType());
      assertEquals(
          "expect equals height ", o.get("height").getAsString(), result.get(i).getHeight());
      assertEquals("expect equals width ", o.get("width").getAsString(), result.get(i).getWidth());
      assertEquals(
          "expect equals duration ", o.get("duration").getAsString(), result.get(i).getDuration());
      assertEquals(
          "expect equals fileSize ", o.get("fileSize").getAsString(), result.get(i).getFileSize());
      assertEquals(
          "expect equals resolution ",
          o.get("resolution").getAsString(),
          result.get(i).getResolution());
    }

    result.clear();
  }

  @Test
  public void testParsingMediaKeywords() throws IOException {
    final String inputFile = "MediaKeywords.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MediaKeywords> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MediaKeywords(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals keyword ", o.get("keyword").getAsString(), result.get(i).getKeyword());
      assertEquals(
          "expect equals mediaId ",
          o.get("mediaId").getAsInt(),
          result.get(i).getMediaId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingMotorRacingEventStates() throws IOException {
    final String inputFile = "MotorRacingEventStates.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MotorRacingEventStates> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MotorRacingEventStates(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals currentState ",
          o.get("currentState").getAsInt(),
          result.get(i).getCurrentState(),
          0.0001);
      assertEquals(
          "expect equals sequenceNumber ",
          o.get("sequenceNumber").getAsInt(),
          result.get(i).getSequenceNumber(),
          0.0001);
      assertEquals("expect equals lap ", o.get("lap").getAsString(), result.get(i).getLap());
      assertEquals(
          "expect equals lapsRemaining ",
          o.get("lapsRemaining").getAsString(),
          result.get(i).getLapsRemaining());
      assertEquals(
          "expect equals timeElapsed ",
          o.get("timeElapsed").getAsString(),
          result.get(i).getTimeElapsed());
      assertEquals(
          "expect equals flagState ",
          o.get("flagState").getAsString(),
          result.get(i).getFlagState());
      assertEquals(
          "expect equals context ", o.get("context").getAsString(), result.get(i).getContext());
    }

    result.clear();
  }

  @Test
  public void testParsingMotorRacingQualifyingStats() throws IOException {
    final String inputFile = "MotorRacingQualifyingStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MotorRacingQualifyingStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MotorRacingQualifyingStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals("expect equals grid ", o.get("grid").getAsString(), result.get(i).getGrid());
      assertEquals(
          "expect equals polePosition ",
          o.get("polePosition").getAsString(),
          result.get(i).getPolePosition());
      assertEquals(
          "expect equals poleWins ", o.get("poleWins").getAsString(), result.get(i).getPoleWins());
      assertEquals(
          "expect equals qualifyingSpeed ",
          o.get("qualifyingSpeed").getAsString(),
          result.get(i).getQualifyingSpeed());
      assertEquals(
          "expect equals qualifyingSpeedUnits ",
          o.get("qualifyingSpeedUnits").getAsString(),
          result.get(i).getQualifyingSpeedUnits());
      assertEquals(
          "expect equals qualifyingTime ",
          o.get("qualifyingTime").getAsString(),
          result.get(i).getQualifyingTime());
      assertEquals(
          "expect equals qualifyingPosition ",
          o.get("qualifyingPosition").getAsString(),
          result.get(i).getQualifyingPosition());
    }

    result.clear();
  }

  @Test
  public void testParsingMotorRacingRaceStats() throws IOException {
    final String inputFile = "MotorRacingRaceStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MotorRacingRaceStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MotorRacingRaceStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals timeBehindLeader ",
          o.get("timeBehindLeader").getAsString(),
          result.get(i).getTimeBehindLeader());
      assertEquals(
          "expect equals lapsBehindLeader ",
          o.get("lapsBehindLeader").getAsString(),
          result.get(i).getLapsBehindLeader());
      assertEquals(
          "expect equals timeAheadFollower ",
          o.get("timeAheadFollower").getAsString(),
          result.get(i).getTimeAheadFollower());
      assertEquals(
          "expect equals lapsAheadFollower ",
          o.get("lapsAheadFollower").getAsString(),
          result.get(i).getLapsAheadFollower());
      assertEquals("expect equals time ", o.get("time").getAsString(), result.get(i).getTime());
      assertEquals(
          "expect equals points ", o.get("points").getAsString(), result.get(i).getPoints());
      assertEquals(
          "expect equals pointsRookie ",
          o.get("pointsRookie").getAsString(),
          result.get(i).getPointsRookie());
      assertEquals("expect equals bonus ", o.get("bonus").getAsString(), result.get(i).getBonus());
      assertEquals(
          "expect equals lapsCompleted ",
          o.get("lapsCompleted").getAsString(),
          result.get(i).getLapsCompleted());
      assertEquals(
          "expect equals lapsLeadingTotal ",
          o.get("lapsLeadingTotal").getAsString(),
          result.get(i).getLapsLeadingTotal());
      assertEquals(
          "expect equals distanceLeading ",
          o.get("distanceLeading").getAsString(),
          result.get(i).getDistanceLeading());
      assertEquals(
          "expect equals distanceCompleted ",
          o.get("distanceCompleted").getAsString(),
          result.get(i).getDistanceCompleted());
      assertEquals(
          "expect equals distanceUnits ",
          o.get("distanceUnits").getAsString(),
          result.get(i).getDistanceUnits());
      assertEquals(
          "expect equals speedAverage ",
          o.get("speedAverage").getAsString(),
          result.get(i).getSpeedAverage());
      assertEquals(
          "expect equals speedUnits ",
          o.get("speedUnits").getAsString(),
          result.get(i).getSpeedUnits());
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals(
          "expect equals finishesTop5 ",
          o.get("finishesTop5").getAsString(),
          result.get(i).getFinishesTop5());
      assertEquals(
          "expect equals finishesTop10 ",
          o.get("finishesTop10").getAsString(),
          result.get(i).getFinishesTop10());
      assertEquals(
          "expect equals starts ", o.get("starts").getAsString(), result.get(i).getStarts());
      assertEquals(
          "expect equals finishes ", o.get("finishes").getAsString(), result.get(i).getFinishes());
      assertEquals(
          "expect equals nonFinishes ",
          o.get("nonFinishes").getAsString(),
          result.get(i).getNonFinishes());
      assertEquals("expect equals wins ", o.get("wins").getAsString(), result.get(i).getWins());
      assertEquals(
          "expect equals racesLeading ",
          o.get("racesLeading").getAsString(),
          result.get(i).getRacesLeading());
      assertEquals("expect equals money ", o.get("money").getAsString(), result.get(i).getMoney());
      assertEquals(
          "expect equals moneyUnits ",
          o.get("moneyUnits").getAsString(),
          result.get(i).getMoneyUnits());
      assertEquals(
          "expect equals leadsTotal ",
          o.get("leadsTotal").getAsString(),
          result.get(i).getLeadsTotal());
    }

    result.clear();
  }

  @Test
  public void testParsingOutcomeTotals() throws IOException {
    final String inputFile = "OutcomeTotals.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<OutcomeTotals> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2OutcomeTotals(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals standingSubgroupId ",
          o.get("standingSubgroupId").getAsInt(),
          result.get(i).getStandingSubgroupId(),
          0.0001);
      assertEquals(
          "expect equals outcomeHolderType ",
          o.get("outcomeHolderType").getAsString(),
          result.get(i).getOutcomeHolderType());
      assertEquals(
          "expect equals outcomeHolderId ",
          o.get("outcomeHolderId").getAsInt(),
          result.get(i).getOutcomeHolderId(),
          0.0001);
      assertEquals("expect equals rank ", o.get("rank").getAsString(), result.get(i).getRank());
      assertEquals("expect equals wins ", o.get("wins").getAsString(), result.get(i).getWins());
      assertEquals(
          "expect equals losses ", o.get("losses").getAsString(), result.get(i).getLosses());
      assertEquals("expect equals ties ", o.get("ties").getAsString(), result.get(i).getTies());
      assertEquals(
          "expect equals undecideds ",
          o.get("undecideds").getAsString(),
          result.get(i).getUndecideds());
      assertEquals(
          "expect equals winningPercentage ",
          o.get("winningPercentage").getAsString(),
          result.get(i).getWinningPercentage());
      assertEquals(
          "expect equals pointsScoredFor ",
          o.get("pointsScoredFor").getAsString(),
          result.get(i).getPointsScoredFor());
      assertEquals(
          "expect equals pointsScoredAgainst ",
          o.get("pointsScoredAgainst").getAsString(),
          result.get(i).getPointsScoredAgainst());
      assertEquals(
          "expect equals pointsDifference ",
          o.get("pointsDifference").getAsString(),
          result.get(i).getPointsDifference());
      assertEquals(
          "expect equals standingPoints ",
          o.get("standingPoints").getAsString(),
          result.get(i).getStandingPoints());
      assertEquals(
          "expect equals streakType ",
          o.get("streakType").getAsString(),
          result.get(i).getStreakType());
      assertEquals(
          "expect equals streakDuration ",
          o.get("streakDuration").getAsString(),
          result.get(i).getStreakDuration());
      assertEquals(
          "expect equals streakTotal ",
          o.get("streakTotal").getAsString(),
          result.get(i).getStreakTotal());
    }

    result.clear();
  }

  @Test
  public void testParsingParticipantsEvents() throws IOException {
    final String inputFile = "ParticipantsEvents.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ParticipantsEvents> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ParticipantsEvents(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals participantType ",
          o.get("participantType").getAsString(),
          result.get(i).getParticipantType());
      assertEquals(
          "expect equals participantId ",
          o.get("participantId").getAsInt(),
          result.get(i).getParticipantId(),
          0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals alignment ",
          o.get("alignment").getAsString(),
          result.get(i).getAlignment());
      assertEquals("expect equals score ", o.get("score").getAsString(), result.get(i).getScore());
      assertEquals(
          "expect equals eventOutcome ",
          o.get("eventOutcome").getAsString(),
          result.get(i).getEventOutcome());
      assertEquals(
          "expect equals rank ", o.get("rank").getAsInt(), result.get(i).getRank(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingPeriods() throws IOException {
    final String inputFile = "Periods.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Periods> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Periods(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals participantEventId ",
          o.get("participantEventId").getAsInt(),
          result.get(i).getParticipantEventId(),
          0.0001);
      assertEquals(
          "expect equals periodValue ",
          o.get("periodValue").getAsString(),
          result.get(i).getPeriodValue());
      assertEquals("expect equals score ", o.get("score").getAsString(), result.get(i).getScore());
    }

    result.clear();
  }

  @Test
  public void testParsingPersonEventMetadata() throws IOException {
    final String inputFile = "PersonEventMetadata.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PersonEventMetadata> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PersonEventMetadata(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals personId ",
          o.get("personId").getAsInt(),
          result.get(i).getPersonId(),
          0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals(
          "expect equals health ", o.get("health").getAsString(), result.get(i).getHealth());
      assertEquals(
          "expect equals weight ", o.get("weight").getAsString(), result.get(i).getWeight());
      assertEquals(
          "expect equals roleId ", o.get("roleId").getAsInt(), result.get(i).getRoleId(), 0.0001);
      assertEquals(
          "expect equals positionId ",
          o.get("positionId").getAsInt(),
          result.get(i).getPositionId(),
          0.0001);
      assertEquals(
          "expect equals teamId ", o.get("teamId").getAsInt(), result.get(i).getTeamId(), 0.0001);
      assertEquals(
          "expect equals lineupSlot ",
          o.get("lineupSlot").getAsInt(),
          result.get(i).getLineupSlot(),
          0.0001);
      assertEquals(
          "expect equals lineupSlotSequence ",
          o.get("lineupSlotSequence").getAsInt(),
          result.get(i).getLineupSlotSequence(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingPersonPhases() throws IOException {
    final String inputFile = "PersonPhases.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PersonPhases> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PersonPhases(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals personId ",
          o.get("personId").getAsInt(),
          result.get(i).getPersonId(),
          0.0001);
      assertEquals(
          "expect equals membershipType ",
          o.get("membershipType").getAsString(),
          result.get(i).getMembershipType());
      assertEquals(
          "expect equals membershipId ",
          o.get("membershipId").getAsInt(),
          result.get(i).getMembershipId(),
          0.0001);
      assertEquals(
          "expect equals roleId ", o.get("roleId").getAsInt(), result.get(i).getRoleId(), 0.0001);
      assertEquals(
          "expect equals roleStatus ",
          o.get("roleStatus").getAsString(),
          result.get(i).getRoleStatus());
      assertEquals(
          "expect equals phaseStatus ",
          o.get("phaseStatus").getAsString(),
          result.get(i).getPhaseStatus());
      assertEquals(
          "expect equals uniformNumber ",
          o.get("uniformNumber").getAsString(),
          result.get(i).getUniformNumber());
      assertEquals(
          "expect equals regularPositionId ",
          o.get("regularPositionId").getAsInt(),
          result.get(i).getRegularPositionId(),
          0.0001);
      assertEquals(
          "expect equals regularPositionDepth ",
          o.get("regularPositionDepth").getAsString(),
          result.get(i).getRegularPositionDepth());
      assertEquals(
          "expect equals height ", o.get("height").getAsString(), result.get(i).getHeight());
      assertEquals(
          "expect equals weight ", o.get("weight").getAsString(), result.get(i).getWeight());
      assertEquals(
          "expect equals startSeasonId ",
          o.get("startSeasonId").getAsInt(),
          result.get(i).getStartSeasonId(),
          0.0001);
      assertEquals(
          "expect equals endSeasonId ",
          o.get("endSeasonId").getAsInt(),
          result.get(i).getEndSeasonId(),
          0.0001);
      assertEquals(
          "expect equals entryReason ",
          o.get("entryReason").getAsString(),
          result.get(i).getEntryReason());
      assertEquals(
          "expect equals exitReason ",
          o.get("exitReason").getAsString(),
          result.get(i).getExitReason());
      assertEquals(
          "expect equals selectionLevel ",
          o.get("selectionLevel").getAsInt(),
          result.get(i).getSelectionLevel(),
          0.0001);
      assertEquals(
          "expect equals selectionSublevel ",
          o.get("selectionSublevel").getAsInt(),
          result.get(i).getSelectionSublevel(),
          0.0001);
      assertEquals(
          "expect equals selectionOverall ",
          o.get("selectionOverall").getAsInt(),
          result.get(i).getSelectionOverall(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingPersons() throws IOException {
    final String inputFile = "Persons.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Persons> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Persons(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals personKey ",
          o.get("personKey").getAsString(),
          result.get(i).getPersonKey());
      assertEquals(
          "expect equals publisherId ",
          o.get("publisherId").getAsInt(),
          result.get(i).getPublisherId(),
          0.0001);
      assertEquals(
          "expect equals gender ", o.get("gender").getAsString(), result.get(i).getGender());
      assertEquals(
          "expect equals birthDate ",
          o.get("birthDate").getAsString(),
          result.get(i).getBirthDate());
      assertEquals(
          "expect equals deathDate ",
          o.get("deathDate").getAsString(),
          result.get(i).getDeathDate());
      assertEquals(
          "expect equals birthLocationId ",
          o.get("birthLocationId").getAsInt(),
          result.get(i).getBirthLocationId(),
          0.0001);
      assertEquals(
          "expect equals hometownLocationId ",
          o.get("hometownLocationId").getAsInt(),
          result.get(i).getHometownLocationId(),
          0.0001);
      assertEquals(
          "expect equals residenceLocationId ",
          o.get("residenceLocationId").getAsInt(),
          result.get(i).getResidenceLocationId(),
          0.0001);
      assertEquals(
          "expect equals deathLocationId ",
          o.get("deathLocationId").getAsInt(),
          result.get(i).getDeathLocationId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingPersonsDocuments() throws IOException {
    final String inputFile = "PersonsDocuments.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PersonsDocuments> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PersonsDocuments(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals personId ",
          o.get("personId").getAsInt(),
          result.get(i).getPersonId(),
          0.0001);
      assertEquals(
          "expect equals documentId ",
          o.get("documentId").getAsInt(),
          result.get(i).getDocumentId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingPersonsMedia() throws IOException {
    final String inputFile = "PersonsMedia.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PersonsMedia> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PersonsMedia(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals personId ",
          o.get("personId").getAsInt(),
          result.get(i).getPersonId(),
          0.0001);
      assertEquals(
          "expect equals mediaId ",
          o.get("mediaId").getAsInt(),
          result.get(i).getMediaId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingPositions() throws IOException {
    final String inputFile = "Positions.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Positions> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Positions(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals affiliationId ",
          o.get("affiliationId").getAsInt(),
          result.get(i).getAffiliationId(),
          0.0001);
      assertEquals(
          "expect equals abbreviation ",
          o.get("abbreviation").getAsString(),
          result.get(i).getAbbreviation());
    }

    result.clear();
  }

  @Test
  public void testParsingPublishers() throws IOException {
    final String inputFile = "Publishers.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Publishers> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Publishers(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals publisherKey ",
          o.get("publisherKey").getAsString(),
          result.get(i).getPublisherKey());
      assertEquals(
          "expect equals publisherName ",
          o.get("publisherName").getAsString(),
          result.get(i).getPublisherName());
    }

    result.clear();
  }

  @Test
  public void testParsingRoles() throws IOException {
    final String inputFile = "Roles.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Roles> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Roles(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals roleKey ", o.get("roleKey").getAsString(), result.get(i).getRoleKey());
      assertEquals(
          "expect equals roleName ", o.get("roleName").getAsString(), result.get(i).getRoleName());
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
    }

    result.clear();
  }

  @Test
  public void testParsingSeasons() throws IOException {
    final String inputFile = "Seasons.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Seasons> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Seasons(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals seasonKey ",
          o.get("seasonKey").getAsInt(),
          result.get(i).getSeasonKey(),
          0.0001);
      assertEquals(
          "expect equals publisherId ",
          o.get("publisherId").getAsInt(),
          result.get(i).getPublisherId(),
          0.0001);
      assertEquals(
          "expect equals leagueId ",
          o.get("leagueId").getAsInt(),
          result.get(i).getLeagueId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSites() throws IOException {
    final String inputFile = "Sites.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Sites> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Sites(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals siteKey ",
          o.get("siteKey").getAsInt(),
          result.get(i).getSiteKey(),
          0.0001);
      assertEquals(
          "expect equals publisherId ",
          o.get("publisherId").getAsInt(),
          result.get(i).getPublisherId(),
          0.0001);
      assertEquals(
          "expect equals locationId ",
          o.get("locationId").getAsInt(),
          result.get(i).getLocationId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSoccerDefensiveStats() throws IOException {
    final String inputFile = "SoccerDefensiveStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SoccerDefensiveStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SoccerDefensiveStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals shotsPenaltyShotAllowed ",
          o.get("shotsPenaltyShotAllowed").getAsString(),
          result.get(i).getShotsPenaltyShotAllowed());
      assertEquals(
          "expect equals goalsPenaltyShotAllowed ",
          o.get("goalsPenaltyShotAllowed").getAsString(),
          result.get(i).getGoalsPenaltyShotAllowed());
      assertEquals(
          "expect equals goalsAgainstAverage ",
          o.get("goalsAgainstAverage").getAsString(),
          result.get(i).getGoalsAgainstAverage());
      assertEquals(
          "expect equals goalsAgainstTotal ",
          o.get("goalsAgainstTotal").getAsString(),
          result.get(i).getGoalsAgainstTotal());
      assertEquals("expect equals saves ", o.get("saves").getAsString(), result.get(i).getSaves());
      assertEquals(
          "expect equals savePercentage ",
          o.get("savePercentage").getAsString(),
          result.get(i).getSavePercentage());
      assertEquals(
          "expect equals catchesPunches ",
          o.get("catchesPunches").getAsString(),
          result.get(i).getCatchesPunches());
      assertEquals(
          "expect equals shotsOnGoalTotal ",
          o.get("shotsOnGoalTotal").getAsString(),
          result.get(i).getShotsOnGoalTotal());
      assertEquals(
          "expect equals shotsShootoutTotal ",
          o.get("shotsShootoutTotal").getAsString(),
          result.get(i).getShotsShootoutTotal());
      assertEquals(
          "expect equals shotsShootoutAllowed ",
          o.get("shotsShootoutAllowed").getAsString(),
          result.get(i).getShotsShootoutAllowed());
      assertEquals(
          "expect equals shotsBlocked ",
          o.get("shotsBlocked").getAsString(),
          result.get(i).getShotsBlocked());
      assertEquals(
          "expect equals shutouts ", o.get("shutouts").getAsString(), result.get(i).getShutouts());
    }

    result.clear();
  }

  @Test
  public void testParsingSoccerEventStates() throws IOException {
    final String inputFile = "SoccerEventStates.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SoccerEventStates> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SoccerEventStates(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals currentState ",
          o.get("currentState").getAsInt(),
          result.get(i).getCurrentState(),
          0.0001);
      assertEquals(
          "expect equals sequenceNumber ",
          o.get("sequenceNumber").getAsInt(),
          result.get(i).getSequenceNumber(),
          0.0001);
      assertEquals(
          "expect equals periodValue ",
          o.get("periodValue").getAsString(),
          result.get(i).getPeriodValue());
      assertEquals(
          "expect equals periodTimeElapsed ",
          o.get("periodTimeElapsed").getAsString(),
          result.get(i).getPeriodTimeElapsed());
      assertEquals(
          "expect equals periodTimeRemaining ",
          o.get("periodTimeRemaining").getAsString(),
          result.get(i).getPeriodTimeRemaining());
      assertEquals(
          "expect equals minutesElapsed ",
          o.get("minutesElapsed").getAsString(),
          result.get(i).getMinutesElapsed());
      assertEquals(
          "expect equals periodMinuteElapsed ",
          o.get("periodMinuteElapsed").getAsString(),
          result.get(i).getPeriodMinuteElapsed());
      assertEquals(
          "expect equals context ", o.get("context").getAsString(), result.get(i).getContext());
    }

    result.clear();
  }

  @Test
  public void testParsingSoccerFoulStats() throws IOException {
    final String inputFile = "SoccerFoulStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SoccerFoulStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SoccerFoulStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals foulsSuffered ",
          o.get("foulsSuffered").getAsString(),
          result.get(i).getFoulsSuffered());
      assertEquals(
          "expect equals foulsCommited ",
          o.get("foulsCommited").getAsString(),
          result.get(i).getFoulsCommited());
      assertEquals(
          "expect equals cautionsTotal ",
          o.get("cautionsTotal").getAsString(),
          result.get(i).getCautionsTotal());
      assertEquals(
          "expect equals cautionsPending ",
          o.get("cautionsPending").getAsString(),
          result.get(i).getCautionsPending());
      assertEquals(
          "expect equals cautionPointsTotal ",
          o.get("cautionPointsTotal").getAsString(),
          result.get(i).getCautionPointsTotal());
      assertEquals(
          "expect equals cautionPointsPending ",
          o.get("cautionPointsPending").getAsString(),
          result.get(i).getCautionPointsPending());
      assertEquals(
          "expect equals ejectionsTotal ",
          o.get("ejectionsTotal").getAsString(),
          result.get(i).getEjectionsTotal());
    }

    result.clear();
  }

  @Test
  public void testParsingSoccerOffensiveStats() throws IOException {
    final String inputFile = "SoccerOffensiveStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SoccerOffensiveStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SoccerOffensiveStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals goalsGameWinning ",
          o.get("goalsGameWinning").getAsString(),
          result.get(i).getGoalsGameWinning());
      assertEquals(
          "expect equals goalsGameTying ",
          o.get("goalsGameTying").getAsString(),
          result.get(i).getGoalsGameTying());
      assertEquals(
          "expect equals goalsOvertime ",
          o.get("goalsOvertime").getAsString(),
          result.get(i).getGoalsOvertime());
      assertEquals(
          "expect equals goalsShootout ",
          o.get("goalsShootout").getAsString(),
          result.get(i).getGoalsShootout());
      assertEquals(
          "expect equals goalsTotal ",
          o.get("goalsTotal").getAsString(),
          result.get(i).getGoalsTotal());
      assertEquals(
          "expect equals assistsGameWinning ",
          o.get("assistsGameWinning").getAsString(),
          result.get(i).getAssistsGameWinning());
      assertEquals(
          "expect equals assistsGameTying ",
          o.get("assistsGameTying").getAsString(),
          result.get(i).getAssistsGameTying());
      assertEquals(
          "expect equals assistsOvertime ",
          o.get("assistsOvertime").getAsString(),
          result.get(i).getAssistsOvertime());
      assertEquals(
          "expect equals assistsTotal ",
          o.get("assistsTotal").getAsString(),
          result.get(i).getAssistsTotal());
      assertEquals(
          "expect equals points ", o.get("points").getAsString(), result.get(i).getPoints());
      assertEquals(
          "expect equals shotsTotal ",
          o.get("shotsTotal").getAsString(),
          result.get(i).getShotsTotal());
      assertEquals(
          "expect equals shotsOnGoalTotal ",
          o.get("shotsOnGoalTotal").getAsString(),
          result.get(i).getShotsOnGoalTotal());
      assertEquals(
          "expect equals shotsHitFrame ",
          o.get("shotsHitFrame").getAsString(),
          result.get(i).getShotsHitFrame());
      assertEquals(
          "expect equals shotsPenaltyShotTaken ",
          o.get("shotsPenaltyShotTaken").getAsString(),
          result.get(i).getShotsPenaltyShotTaken());
      assertEquals(
          "expect equals shotsPenaltyShotScored ",
          o.get("shotsPenaltyShotScored").getAsString(),
          result.get(i).getShotsPenaltyShotScored());
      assertEquals(
          "expect equals shotsPenaltyShotMissed ",
          o.get("shotsPenaltyShotMissed").getAsString(),
          result.get(i).getShotsPenaltyShotMissed());
      assertEquals(
          "expect equals shotsPenaltyShotPercentage ",
          o.get("shotsPenaltyShotPercentage").getAsString(),
          result.get(i).getShotsPenaltyShotPercentage());
      assertEquals(
          "expect equals shotsShootoutTaken ",
          o.get("shotsShootoutTaken").getAsString(),
          result.get(i).getShotsShootoutTaken());
      assertEquals(
          "expect equals shotsShootoutScored ",
          o.get("shotsShootoutScored").getAsString(),
          result.get(i).getShotsShootoutScored());
      assertEquals(
          "expect equals shotsShootoutMissed ",
          o.get("shotsShootoutMissed").getAsString(),
          result.get(i).getShotsShootoutMissed());
      assertEquals(
          "expect equals shotsShootoutPercentage ",
          o.get("shotsShootoutPercentage").getAsString(),
          result.get(i).getShotsShootoutPercentage());
      assertEquals(
          "expect equals giveaways ",
          o.get("giveaways").getAsString(),
          result.get(i).getGiveaways());
      assertEquals(
          "expect equals offsides ", o.get("offsides").getAsString(), result.get(i).getOffsides());
      assertEquals(
          "expect equals cornerKicks ",
          o.get("cornerKicks").getAsString(),
          result.get(i).getCornerKicks());
      assertEquals(
          "expect equals hatTricks ",
          o.get("hatTricks").getAsString(),
          result.get(i).getHatTricks());
    }

    result.clear();
  }

  @Test
  public void testParsingStandingSubgroups() throws IOException {
    final String inputFile = "StandingSubgroups.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<StandingSubgroups> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2StandingSubgroups(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals standingId ",
          o.get("standingId").getAsInt(),
          result.get(i).getStandingId(),
          0.0001);
      assertEquals(
          "expect equals affiliationId ",
          o.get("affiliationId").getAsInt(),
          result.get(i).getAffiliationId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingStandings() throws IOException {
    final String inputFile = "Standings.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Standings> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Standings(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals affiliationId ",
          o.get("affiliationId").getAsInt(),
          result.get(i).getAffiliationId(),
          0.0001);
      assertEquals(
          "expect equals standingType ",
          o.get("standingType").getAsString(),
          result.get(i).getStandingType());
      assertEquals(
          "expect equals subSeasonId ",
          o.get("subSeasonId").getAsInt(),
          result.get(i).getSubSeasonId(),
          0.0001);
      assertEquals(
          "expect equals lastUpdated ",
          o.get("lastUpdated").getAsString(),
          result.get(i).getLastUpdated());
      assertEquals(
          "expect equals durationScope ",
          o.get("durationScope").getAsString(),
          result.get(i).getDurationScope());
      assertEquals(
          "expect equals competitionScope ",
          o.get("competitionScope").getAsString(),
          result.get(i).getCompetitionScope());
      assertEquals(
          "expect equals competitionScopeId ",
          o.get("competitionScopeId").getAsString(),
          result.get(i).getCompetitionScopeId());
      assertEquals(
          "expect equals alignmentScope ",
          o.get("alignmentScope").getAsString(),
          result.get(i).getAlignmentScope());
      assertEquals(
          "expect equals siteScope ",
          o.get("siteScope").getAsString(),
          result.get(i).getSiteScope());
      assertEquals(
          "expect equals scopingLabel ",
          o.get("scopingLabel").getAsString(),
          result.get(i).getScopingLabel());
      assertEquals(
          "expect equals publisherId ",
          o.get("publisherId").getAsInt(),
          result.get(i).getPublisherId(),
          0.0001);
      assertEquals(
          "expect equals source ", o.get("source").getAsString(), result.get(i).getSource());
    }

    result.clear();
  }

  @Test
  public void testParsingStats() throws IOException {
    final String inputFile = "Stats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Stats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Stats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals statRepositoryType ",
          o.get("statRepositoryType").getAsString(),
          result.get(i).getStatRepositoryType());
      assertEquals(
          "expect equals statRepositoryId ",
          o.get("statRepositoryId").getAsInt(),
          result.get(i).getStatRepositoryId(),
          0.0001);
      assertEquals(
          "expect equals statHolderType ",
          o.get("statHolderType").getAsString(),
          result.get(i).getStatHolderType());
      assertEquals(
          "expect equals statHolderId ",
          o.get("statHolderId").getAsInt(),
          result.get(i).getStatHolderId(),
          0.0001);
      assertEquals(
          "expect equals statCoverageType ",
          o.get("statCoverageType").getAsString(),
          result.get(i).getStatCoverageType());
      assertEquals(
          "expect equals statCoverageId ",
          o.get("statCoverageId").getAsInt(),
          result.get(i).getStatCoverageId(),
          0.0001);
      assertEquals(
          "expect equals context ", o.get("context").getAsString(), result.get(i).getContext());
    }

    result.clear();
  }

  @Test
  public void testParsingSubPeriods() throws IOException {
    final String inputFile = "SubPeriods.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SubPeriods> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SubPeriods(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals periodId ",
          o.get("periodId").getAsInt(),
          result.get(i).getPeriodId(),
          0.0001);
      assertEquals(
          "expect equals subPeriodValue ",
          o.get("subPeriodValue").getAsString(),
          result.get(i).getSubPeriodValue());
      assertEquals("expect equals score ", o.get("score").getAsString(), result.get(i).getScore());
    }

    result.clear();
  }

  @Test
  public void testParsingSubSeasons() throws IOException {
    final String inputFile = "SubSeasons.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SubSeasons> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SubSeasons(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals subSeasonKey ",
          o.get("subSeasonKey").getAsString(),
          result.get(i).getSubSeasonKey());
      assertEquals(
          "expect equals seasonId ",
          o.get("seasonId").getAsInt(),
          result.get(i).getSeasonId(),
          0.0001);
      assertEquals(
          "expect equals subSeasonType ",
          o.get("subSeasonType").getAsString(),
          result.get(i).getSubSeasonType());
    }

    result.clear();
  }

  @Test
  public void testParsingTeamAmericanFootballStats() throws IOException {
    final String inputFile = "TeamAmericanFootballStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TeamAmericanFootballStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TeamAmericanFootballStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals yardsPerAttempt ",
          o.get("yardsPerAttempt").getAsString(),
          result.get(i).getYardsPerAttempt());
      assertEquals(
          "expect equals averageStartingPosition ",
          o.get("averageStartingPosition").getAsString(),
          result.get(i).getAverageStartingPosition());
      assertEquals(
          "expect equals timeouts ", o.get("timeouts").getAsString(), result.get(i).getTimeouts());
      assertEquals(
          "expect equals timeOfPossession ",
          o.get("timeOfPossession").getAsString(),
          result.get(i).getTimeOfPossession());
      assertEquals(
          "expect equals turnoverRatio ",
          o.get("turnoverRatio").getAsString(),
          result.get(i).getTurnoverRatio());
    }

    result.clear();
  }

  @Test
  public void testParsingTeamPhases() throws IOException {
    final String inputFile = "TeamPhases.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TeamPhases> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TeamPhases(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals teamId ", o.get("teamId").getAsInt(), result.get(i).getTeamId(), 0.0001);
      assertEquals(
          "expect equals startSeasonId ",
          o.get("startSeasonId").getAsInt(),
          result.get(i).getStartSeasonId(),
          0.0001);
      assertEquals(
          "expect equals endSeasonId ",
          o.get("endSeasonId").getAsInt(),
          result.get(i).getEndSeasonId(),
          0.0001);
      assertEquals(
          "expect equals affiliationId ",
          o.get("affiliationId").getAsInt(),
          result.get(i).getAffiliationId(),
          0.0001);
      assertEquals(
          "expect equals startDateTime ",
          o.get("startDateTime").getAsString(),
          result.get(i).getStartDateTime());
      assertEquals(
          "expect equals endDateTime ",
          o.get("endDateTime").getAsString(),
          result.get(i).getEndDateTime());
      assertEquals(
          "expect equals phaseStatus ",
          o.get("phaseStatus").getAsString(),
          result.get(i).getPhaseStatus());
      assertEquals(
          "expect equals roleId ", o.get("roleId").getAsInt(), result.get(i).getRoleId(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTeams() throws IOException {
    final String inputFile = "Teams.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Teams> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Teams(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals teamKey ", o.get("teamKey").getAsString(), result.get(i).getTeamKey());
      assertEquals(
          "expect equals publisherId ",
          o.get("publisherId").getAsInt(),
          result.get(i).getPublisherId(),
          0.0001);
      assertEquals(
          "expect equals homeSiteId ",
          o.get("homeSiteId").getAsInt(),
          result.get(i).getHomeSiteId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTeamsDocuments() throws IOException {
    final String inputFile = "TeamsDocuments.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TeamsDocuments> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TeamsDocuments(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals teamId ", o.get("teamId").getAsInt(), result.get(i).getTeamId(), 0.0001);
      assertEquals(
          "expect equals documentId ",
          o.get("documentId").getAsInt(),
          result.get(i).getDocumentId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTeamsMedia() throws IOException {
    final String inputFile = "TeamsMedia.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TeamsMedia> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TeamsMedia(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals teamId ", o.get("teamId").getAsInt(), result.get(i).getTeamId(), 0.0001);
      assertEquals(
          "expect equals mediaId ",
          o.get("mediaId").getAsInt(),
          result.get(i).getMediaId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTennisActionPoints() throws IOException {
    final String inputFile = "TennisActionPoints.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TennisActionPoints> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TennisActionPoints(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals subPeriodId ",
          o.get("subPeriodId").getAsString(),
          result.get(i).getSubPeriodId());
      assertEquals(
          "expect equals sequenceNumber ",
          o.get("sequenceNumber").getAsString(),
          result.get(i).getSequenceNumber());
      assertEquals(
          "expect equals winType ", o.get("winType").getAsString(), result.get(i).getWinType());
    }

    result.clear();
  }

  @Test
  public void testParsingTennisActionVolleys() throws IOException {
    final String inputFile = "TennisActionVolleys.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TennisActionVolleys> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TennisActionVolleys(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals sequenceNumber ",
          o.get("sequenceNumber").getAsString(),
          result.get(i).getSequenceNumber());
      assertEquals(
          "expect equals tennisActionPointsId ",
          o.get("tennisActionPointsId").getAsInt(),
          result.get(i).getTennisActionPointsId(),
          0.0001);
      assertEquals(
          "expect equals landingLocation ",
          o.get("landingLocation").getAsString(),
          result.get(i).getLandingLocation());
      assertEquals(
          "expect equals swingType ",
          o.get("swingType").getAsString(),
          result.get(i).getSwingType());
      assertEquals(
          "expect equals result ", o.get("result").getAsString(), result.get(i).getResult());
      assertEquals(
          "expect equals spinType ", o.get("spinType").getAsString(), result.get(i).getSpinType());
      assertEquals(
          "expect equals trajectoryDetails ",
          o.get("trajectoryDetails").getAsString(),
          result.get(i).getTrajectoryDetails());
    }

    result.clear();
  }

  @Test
  public void testParsingTennisEventStates() throws IOException {
    final String inputFile = "TennisEventStates.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TennisEventStates> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TennisEventStates(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals currentState ",
          o.get("currentState").getAsInt(),
          result.get(i).getCurrentState(),
          0.0001);
      assertEquals(
          "expect equals sequenceNumber ",
          o.get("sequenceNumber").getAsInt(),
          result.get(i).getSequenceNumber(),
          0.0001);
      assertEquals(
          "expect equals tennisSet ",
          o.get("tennisSet").getAsString(),
          result.get(i).getTennisSet());
      assertEquals("expect equals game ", o.get("game").getAsString(), result.get(i).getGame());
      assertEquals(
          "expect equals serverPersonId ",
          o.get("serverPersonId").getAsInt(),
          result.get(i).getServerPersonId(),
          0.0001);
      assertEquals(
          "expect equals serverScore ",
          o.get("serverScore").getAsString(),
          result.get(i).getServerScore());
      assertEquals(
          "expect equals receiverPersonId ",
          o.get("receiverPersonId").getAsInt(),
          result.get(i).getReceiverPersonId(),
          0.0001);
      assertEquals(
          "expect equals receiverScore ",
          o.get("receiverScore").getAsString(),
          result.get(i).getReceiverScore());
      assertEquals(
          "expect equals serviceNumber ",
          o.get("serviceNumber").getAsString(),
          result.get(i).getServiceNumber());
      assertEquals(
          "expect equals context ", o.get("context").getAsString(), result.get(i).getContext());
    }

    result.clear();
  }

  @Test
  public void testParsingTennisReturnStats() throws IOException {
    final String inputFile = "TennisReturnStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TennisReturnStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TennisReturnStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals returnsPlayed ",
          o.get("returnsPlayed").getAsString(),
          result.get(i).getReturnsPlayed());
      assertEquals(
          "expect equals matchesPlayed ",
          o.get("matchesPlayed").getAsString(),
          result.get(i).getMatchesPlayed());
      assertEquals(
          "expect equals firstServiceReturnPointsWon ",
          o.get("firstServiceReturnPointsWon").getAsString(),
          result.get(i).getFirstServiceReturnPointsWon());
      assertEquals(
          "expect equals firstServiceReturnPointsWonPct ",
          o.get("firstServiceReturnPointsWonPct").getAsString(),
          result.get(i).getFirstServiceReturnPointsWonPct());
      assertEquals(
          "expect equals secondServiceReturnPointsWon ",
          o.get("secondServiceReturnPointsWon").getAsString(),
          result.get(i).getSecondServiceReturnPointsWon());
      assertEquals(
          "expect equals secondServiceReturnPointsWonPct ",
          o.get("secondServiceReturnPointsWonPct").getAsString(),
          result.get(i).getSecondServiceReturnPointsWonPct());
      assertEquals(
          "expect equals returnGamesPlayed ",
          o.get("returnGamesPlayed").getAsString(),
          result.get(i).getReturnGamesPlayed());
      assertEquals(
          "expect equals returnGamesWon ",
          o.get("returnGamesWon").getAsString(),
          result.get(i).getReturnGamesWon());
      assertEquals(
          "expect equals returnGamesWonPct ",
          o.get("returnGamesWonPct").getAsString(),
          result.get(i).getReturnGamesWonPct());
      assertEquals(
          "expect equals breakPointsPlayed ",
          o.get("breakPointsPlayed").getAsString(),
          result.get(i).getBreakPointsPlayed());
      assertEquals(
          "expect equals breakPointsConverted ",
          o.get("breakPointsConverted").getAsString(),
          result.get(i).getBreakPointsConverted());
      assertEquals(
          "expect equals breakPointsConvertedPct ",
          o.get("breakPointsConvertedPct").getAsString(),
          result.get(i).getBreakPointsConvertedPct());
    }

    result.clear();
  }

  @Test
  public void testParsingTennisServiceStats() throws IOException {
    final String inputFile = "TennisServiceStats.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TennisServiceStats> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TennisServiceStats(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals servicesPlayed ",
          o.get("servicesPlayed").getAsString(),
          result.get(i).getServicesPlayed());
      assertEquals(
          "expect equals matchesPlayed ",
          o.get("matchesPlayed").getAsString(),
          result.get(i).getMatchesPlayed());
      assertEquals("expect equals aces ", o.get("aces").getAsString(), result.get(i).getAces());
      assertEquals(
          "expect equals firstServicesGood ",
          o.get("firstServicesGood").getAsString(),
          result.get(i).getFirstServicesGood());
      assertEquals(
          "expect equals firstServicesGoodPct ",
          o.get("firstServicesGoodPct").getAsString(),
          result.get(i).getFirstServicesGoodPct());
      assertEquals(
          "expect equals firstServicePointsWon ",
          o.get("firstServicePointsWon").getAsString(),
          result.get(i).getFirstServicePointsWon());
      assertEquals(
          "expect equals firstServicePointsWonPct ",
          o.get("firstServicePointsWonPct").getAsString(),
          result.get(i).getFirstServicePointsWonPct());
      assertEquals(
          "expect equals secondServicePointsWon ",
          o.get("secondServicePointsWon").getAsString(),
          result.get(i).getSecondServicePointsWon());
      assertEquals(
          "expect equals secondServicePointsWonPct ",
          o.get("secondServicePointsWonPct").getAsString(),
          result.get(i).getSecondServicePointsWonPct());
      assertEquals(
          "expect equals serviceGamesPlayed ",
          o.get("serviceGamesPlayed").getAsString(),
          result.get(i).getServiceGamesPlayed());
      assertEquals(
          "expect equals serviceGamesWon ",
          o.get("serviceGamesWon").getAsString(),
          result.get(i).getServiceGamesWon());
      assertEquals(
          "expect equals serviceGamesWonPct ",
          o.get("serviceGamesWonPct").getAsString(),
          result.get(i).getServiceGamesWonPct());
      assertEquals(
          "expect equals breakPointsPlayed ",
          o.get("breakPointsPlayed").getAsString(),
          result.get(i).getBreakPointsPlayed());
      assertEquals(
          "expect equals breakPointsSaved ",
          o.get("breakPointsSaved").getAsString(),
          result.get(i).getBreakPointsSaved());
      assertEquals(
          "expect equals breakPointsSavedPct ",
          o.get("breakPointsSavedPct").getAsString(),
          result.get(i).getBreakPointsSavedPct());
    }

    result.clear();
  }

  @Test
  public void testParsingWageringMoneylines() throws IOException {
    final String inputFile = "WageringMoneylines.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<WageringMoneylines> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2WageringMoneylines(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals bookmakerId ",
          o.get("bookmakerId").getAsInt(),
          result.get(i).getBookmakerId(),
          0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals teamId ", o.get("teamId").getAsInt(), result.get(i).getTeamId(), 0.0001);
      assertEquals(
          "expect equals personId ",
          o.get("personId").getAsInt(),
          result.get(i).getPersonId(),
          0.0001);
      assertEquals(
          "expect equals rotationKey ",
          o.get("rotationKey").getAsString(),
          result.get(i).getRotationKey());
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
      assertEquals(
          "expect equals vigorish ", o.get("vigorish").getAsString(), result.get(i).getVigorish());
      assertEquals("expect equals line ", o.get("line").getAsString(), result.get(i).getLine());
      assertEquals(
          "expect equals lineOpening ",
          o.get("lineOpening").getAsString(),
          result.get(i).getLineOpening());
      assertEquals(
          "expect equals prediction ",
          o.get("prediction").getAsString(),
          result.get(i).getPrediction());
    }

    result.clear();
  }

  @Test
  public void testParsingWageringOddsLines() throws IOException {
    final String inputFile = "WageringOddsLines.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<WageringOddsLines> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2WageringOddsLines(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals bookmakerId ",
          o.get("bookmakerId").getAsInt(),
          result.get(i).getBookmakerId(),
          0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals teamId ", o.get("teamId").getAsInt(), result.get(i).getTeamId(), 0.0001);
      assertEquals(
          "expect equals personId ",
          o.get("personId").getAsInt(),
          result.get(i).getPersonId(),
          0.0001);
      assertEquals(
          "expect equals rotationKey ",
          o.get("rotationKey").getAsString(),
          result.get(i).getRotationKey());
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
      assertEquals(
          "expect equals numerator ",
          o.get("numerator").getAsString(),
          result.get(i).getNumerator());
      assertEquals(
          "expect equals denominator ",
          o.get("denominator").getAsString(),
          result.get(i).getDenominator());
      assertEquals(
          "expect equals prediction ",
          o.get("prediction").getAsString(),
          result.get(i).getPrediction());
      assertEquals(
          "expect equals payoutCalculation ",
          o.get("payoutCalculation").getAsString(),
          result.get(i).getPayoutCalculation());
      assertEquals(
          "expect equals payoutAmount ",
          o.get("payoutAmount").getAsString(),
          result.get(i).getPayoutAmount());
    }

    result.clear();
  }

  @Test
  public void testParsingWageringRunlines() throws IOException {
    final String inputFile = "WageringRunlines.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<WageringRunlines> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2WageringRunlines(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals bookmakerId ",
          o.get("bookmakerId").getAsInt(),
          result.get(i).getBookmakerId(),
          0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals teamId ", o.get("teamId").getAsInt(), result.get(i).getTeamId(), 0.0001);
      assertEquals(
          "expect equals personId ",
          o.get("personId").getAsInt(),
          result.get(i).getPersonId(),
          0.0001);
      assertEquals(
          "expect equals rotationKey ",
          o.get("rotationKey").getAsString(),
          result.get(i).getRotationKey());
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
      assertEquals(
          "expect equals vigorish ", o.get("vigorish").getAsString(), result.get(i).getVigorish());
      assertEquals("expect equals line ", o.get("line").getAsString(), result.get(i).getLine());
      assertEquals(
          "expect equals lineOpening ",
          o.get("lineOpening").getAsString(),
          result.get(i).getLineOpening());
      assertEquals(
          "expect equals lineValue ",
          o.get("lineValue").getAsString(),
          result.get(i).getLineValue());
      assertEquals(
          "expect equals prediction ",
          o.get("prediction").getAsString(),
          result.get(i).getPrediction());
    }

    result.clear();
  }

  @Test
  public void testParsingWageringStraightSpreadLines() throws IOException {
    final String inputFile = "WageringStraightSpreadLines.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<WageringStraightSpreadLines> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2WageringStraightSpreadLines(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals bookmakerId ",
          o.get("bookmakerId").getAsInt(),
          result.get(i).getBookmakerId(),
          0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals teamId ", o.get("teamId").getAsInt(), result.get(i).getTeamId(), 0.0001);
      assertEquals(
          "expect equals personId ",
          o.get("personId").getAsInt(),
          result.get(i).getPersonId(),
          0.0001);
      assertEquals(
          "expect equals rotationKey ",
          o.get("rotationKey").getAsString(),
          result.get(i).getRotationKey());
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
      assertEquals(
          "expect equals vigorish ", o.get("vigorish").getAsString(), result.get(i).getVigorish());
      assertEquals(
          "expect equals lineValue ",
          o.get("lineValue").getAsString(),
          result.get(i).getLineValue());
      assertEquals(
          "expect equals lineValueOpening ",
          o.get("lineValueOpening").getAsString(),
          result.get(i).getLineValueOpening());
      assertEquals(
          "expect equals prediction ",
          o.get("prediction").getAsString(),
          result.get(i).getPrediction());
    }

    result.clear();
  }

  @Test
  public void testParsingWageringTotalScoreLines() throws IOException {
    final String inputFile = "WageringTotalScoreLines.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<WageringTotalScoreLines> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2WageringTotalScoreLines(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals bookmakerId ",
          o.get("bookmakerId").getAsInt(),
          result.get(i).getBookmakerId(),
          0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals teamId ", o.get("teamId").getAsInt(), result.get(i).getTeamId(), 0.0001);
      assertEquals(
          "expect equals personId ",
          o.get("personId").getAsInt(),
          result.get(i).getPersonId(),
          0.0001);
      assertEquals(
          "expect equals rotationKey ",
          o.get("rotationKey").getAsString(),
          result.get(i).getRotationKey());
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
      assertEquals(
          "expect equals vigorish ", o.get("vigorish").getAsString(), result.get(i).getVigorish());
      assertEquals(
          "expect equals lineOver ", o.get("lineOver").getAsString(), result.get(i).getLineOver());
      assertEquals(
          "expect equals lineUnder ",
          o.get("lineUnder").getAsString(),
          result.get(i).getLineUnder());
      assertEquals("expect equals total ", o.get("total").getAsString(), result.get(i).getTotal());
      assertEquals(
          "expect equals totalOpening ",
          o.get("totalOpening").getAsString(),
          result.get(i).getTotalOpening());
      assertEquals(
          "expect equals prediction ",
          o.get("prediction").getAsString(),
          result.get(i).getPrediction());
    }

    result.clear();
  }

  @Test
  public void testParsingWeatherConditions() throws IOException {
    final String inputFile = "WeatherConditions.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<WeatherConditions> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2WeatherConditions(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals eventId ",
          o.get("eventId").getAsInt(),
          result.get(i).getEventId(),
          0.0001);
      assertEquals(
          "expect equals temperature ",
          o.get("temperature").getAsString(),
          result.get(i).getTemperature());
      assertEquals(
          "expect equals temperatureUnits ",
          o.get("temperatureUnits").getAsString(),
          result.get(i).getTemperatureUnits());
      assertEquals(
          "expect equals humidity ", o.get("humidity").getAsString(), result.get(i).getHumidity());
      assertEquals(
          "expect equals clouds ", o.get("clouds").getAsString(), result.get(i).getClouds());
      assertEquals(
          "expect equals windDirection ",
          o.get("windDirection").getAsString(),
          result.get(i).getWindDirection());
      assertEquals(
          "expect equals windVelocity ",
          o.get("windVelocity").getAsString(),
          result.get(i).getWindVelocity());
      assertEquals(
          "expect equals weatherCode ",
          o.get("weatherCode").getAsString(),
          result.get(i).getWeatherCode());
    }

    result.clear();
  }
}
