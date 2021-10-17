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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.sportsdb.test.entity.*;
import java.util.Objects;

public class JsonHelper {
    static final Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Addresses.
     */
    public static Addresses fromJson2Addresses(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Addresses.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AffiliationPhases.
     */
    public static AffiliationPhases fromJson2AffiliationPhases(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AffiliationPhases.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Affiliations.
     */
    public static Affiliations fromJson2Affiliations(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Affiliations.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AffiliationsDocuments.
     */
    public static AffiliationsDocuments fromJson2AffiliationsDocuments(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AffiliationsDocuments.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AffiliationsEvents.
     */
    public static AffiliationsEvents fromJson2AffiliationsEvents(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AffiliationsEvents.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AffiliationsMedia.
     */
    public static AffiliationsMedia fromJson2AffiliationsMedia(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AffiliationsMedia.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballActionParticipants.
     */
    public static AmericanFootballActionParticipants fromJson2AmericanFootballActionParticipants(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballActionParticipants.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballActionPlays.
     */
    public static AmericanFootballActionPlays fromJson2AmericanFootballActionPlays(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballActionPlays.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballDefensiveStats.
     */
    public static AmericanFootballDefensiveStats fromJson2AmericanFootballDefensiveStats(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballDefensiveStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballDownProgressStats.
     */
    public static AmericanFootballDownProgressStats fromJson2AmericanFootballDownProgressStats(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballDownProgressStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballEventStates.
     */
    public static AmericanFootballEventStates fromJson2AmericanFootballEventStates(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballEventStates.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballFumblesStats.
     */
    public static AmericanFootballFumblesStats fromJson2AmericanFootballFumblesStats(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballFumblesStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballOffensiveStats.
     */
    public static AmericanFootballOffensiveStats fromJson2AmericanFootballOffensiveStats(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballOffensiveStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballPassingStats.
     */
    public static AmericanFootballPassingStats fromJson2AmericanFootballPassingStats(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballPassingStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballPenaltiesStats.
     */
    public static AmericanFootballPenaltiesStats fromJson2AmericanFootballPenaltiesStats(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballPenaltiesStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballRushingStats.
     */
    public static AmericanFootballRushingStats fromJson2AmericanFootballRushingStats(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballRushingStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballSacksAgainstStats.
     */
    public static AmericanFootballSacksAgainstStats fromJson2AmericanFootballSacksAgainstStats(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballSacksAgainstStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballScoringStats.
     */
    public static AmericanFootballScoringStats fromJson2AmericanFootballScoringStats(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballScoringStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The AmericanFootballSpecialTeamsStats.
     */
    public static AmericanFootballSpecialTeamsStats fromJson2AmericanFootballSpecialTeamsStats(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, AmericanFootballSpecialTeamsStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BaseballActionContactDetails.
     */
    public static BaseballActionContactDetails fromJson2BaseballActionContactDetails(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BaseballActionContactDetails.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BaseballActionPitches.
     */
    public static BaseballActionPitches fromJson2BaseballActionPitches(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BaseballActionPitches.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BaseballActionPlays.
     */
    public static BaseballActionPlays fromJson2BaseballActionPlays(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BaseballActionPlays.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BaseballActionSubstitutions.
     */
    public static BaseballActionSubstitutions fromJson2BaseballActionSubstitutions(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BaseballActionSubstitutions.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BaseballDefensiveGroup.
     */
    public static BaseballDefensiveGroup fromJson2BaseballDefensiveGroup(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BaseballDefensiveGroup.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BaseballDefensivePlayers.
     */
    public static BaseballDefensivePlayers fromJson2BaseballDefensivePlayers(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BaseballDefensivePlayers.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BaseballDefensiveStats.
     */
    public static BaseballDefensiveStats fromJson2BaseballDefensiveStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BaseballDefensiveStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BaseballEventStates.
     */
    public static BaseballEventStates fromJson2BaseballEventStates(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BaseballEventStates.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BaseballOffensiveStats.
     */
    public static BaseballOffensiveStats fromJson2BaseballOffensiveStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BaseballOffensiveStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BaseballPitchingStats.
     */
    public static BaseballPitchingStats fromJson2BaseballPitchingStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BaseballPitchingStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BasketballDefensiveStats.
     */
    public static BasketballDefensiveStats fromJson2BasketballDefensiveStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BasketballDefensiveStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BasketballEventStates.
     */
    public static BasketballEventStates fromJson2BasketballEventStates(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BasketballEventStates.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BasketballOffensiveStats.
     */
    public static BasketballOffensiveStats fromJson2BasketballOffensiveStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BasketballOffensiveStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BasketballReboundingStats.
     */
    public static BasketballReboundingStats fromJson2BasketballReboundingStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BasketballReboundingStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The BasketballTeamStats.
     */
    public static BasketballTeamStats fromJson2BasketballTeamStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, BasketballTeamStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Bookmakers.
     */
    public static Bookmakers fromJson2Bookmakers(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Bookmakers.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The CorePersonStats.
     */
    public static CorePersonStats fromJson2CorePersonStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, CorePersonStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The CoreStats.
     */
    public static CoreStats fromJson2CoreStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, CoreStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The DbInfo.
     */
    public static DbInfo fromJson2DbInfo(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, DbInfo.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The DisplayNames.
     */
    public static DisplayNames fromJson2DisplayNames(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, DisplayNames.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The DocumentClasses.
     */
    public static DocumentClasses fromJson2DocumentClasses(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, DocumentClasses.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The DocumentContents.
     */
    public static DocumentContents fromJson2DocumentContents(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, DocumentContents.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The DocumentFixtures.
     */
    public static DocumentFixtures fromJson2DocumentFixtures(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, DocumentFixtures.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The DocumentFixturesEvents.
     */
    public static DocumentFixturesEvents fromJson2DocumentFixturesEvents(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, DocumentFixturesEvents.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The DocumentPackageEntry.
     */
    public static DocumentPackageEntry fromJson2DocumentPackageEntry(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, DocumentPackageEntry.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The DocumentPackages.
     */
    public static DocumentPackages fromJson2DocumentPackages(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, DocumentPackages.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Documents.
     */
    public static Documents fromJson2Documents(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Documents.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The DocumentsMedia.
     */
    public static DocumentsMedia fromJson2DocumentsMedia(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, DocumentsMedia.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Events.
     */
    public static Events fromJson2Events(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Events.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The EventsDocuments.
     */
    public static EventsDocuments fromJson2EventsDocuments(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, EventsDocuments.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The EventsMedia.
     */
    public static EventsMedia fromJson2EventsMedia(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, EventsMedia.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The EventsSubSeasons.
     */
    public static EventsSubSeasons fromJson2EventsSubSeasons(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, EventsSubSeasons.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The IceHockeyActionParticipants.
     */
    public static IceHockeyActionParticipants fromJson2IceHockeyActionParticipants(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, IceHockeyActionParticipants.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The IceHockeyActionPlays.
     */
    public static IceHockeyActionPlays fromJson2IceHockeyActionPlays(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, IceHockeyActionPlays.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The IceHockeyDefensiveStats.
     */
    public static IceHockeyDefensiveStats fromJson2IceHockeyDefensiveStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, IceHockeyDefensiveStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The IceHockeyEventStates.
     */
    public static IceHockeyEventStates fromJson2IceHockeyEventStates(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, IceHockeyEventStates.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The IceHockeyOffensiveStats.
     */
    public static IceHockeyOffensiveStats fromJson2IceHockeyOffensiveStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, IceHockeyOffensiveStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The IceHockeyPlayerStats.
     */
    public static IceHockeyPlayerStats fromJson2IceHockeyPlayerStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, IceHockeyPlayerStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The InjuryPhases.
     */
    public static InjuryPhases fromJson2InjuryPhases(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, InjuryPhases.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The KeyAliases.
     */
    public static KeyAliases fromJson2KeyAliases(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, KeyAliases.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The KeyRoots.
     */
    public static KeyRoots fromJson2KeyRoots(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, KeyRoots.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LatestRevisions.
     */
    public static LatestRevisions fromJson2LatestRevisions(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LatestRevisions.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Locations.
     */
    public static Locations fromJson2Locations(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Locations.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Media.
     */
    public static Media fromJson2Media(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Media.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The MediaCaptions.
     */
    public static MediaCaptions fromJson2MediaCaptions(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, MediaCaptions.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The MediaContents.
     */
    public static MediaContents fromJson2MediaContents(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, MediaContents.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The MediaKeywords.
     */
    public static MediaKeywords fromJson2MediaKeywords(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, MediaKeywords.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The MotorRacingEventStates.
     */
    public static MotorRacingEventStates fromJson2MotorRacingEventStates(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, MotorRacingEventStates.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The MotorRacingQualifyingStats.
     */
    public static MotorRacingQualifyingStats fromJson2MotorRacingQualifyingStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, MotorRacingQualifyingStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The MotorRacingRaceStats.
     */
    public static MotorRacingRaceStats fromJson2MotorRacingRaceStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, MotorRacingRaceStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OutcomeTotals.
     */
    public static OutcomeTotals fromJson2OutcomeTotals(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OutcomeTotals.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The ParticipantsEvents.
     */
    public static ParticipantsEvents fromJson2ParticipantsEvents(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, ParticipantsEvents.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Periods.
     */
    public static Periods fromJson2Periods(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Periods.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The PersonEventMetadata.
     */
    public static PersonEventMetadata fromJson2PersonEventMetadata(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, PersonEventMetadata.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The PersonPhases.
     */
    public static PersonPhases fromJson2PersonPhases(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, PersonPhases.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Persons.
     */
    public static Persons fromJson2Persons(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Persons.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The PersonsDocuments.
     */
    public static PersonsDocuments fromJson2PersonsDocuments(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, PersonsDocuments.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The PersonsMedia.
     */
    public static PersonsMedia fromJson2PersonsMedia(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, PersonsMedia.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Positions.
     */
    public static Positions fromJson2Positions(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Positions.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Publishers.
     */
    public static Publishers fromJson2Publishers(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Publishers.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Roles.
     */
    public static Roles fromJson2Roles(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Roles.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Seasons.
     */
    public static Seasons fromJson2Seasons(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Seasons.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Sites.
     */
    public static Sites fromJson2Sites(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Sites.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The SoccerDefensiveStats.
     */
    public static SoccerDefensiveStats fromJson2SoccerDefensiveStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, SoccerDefensiveStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The SoccerEventStates.
     */
    public static SoccerEventStates fromJson2SoccerEventStates(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, SoccerEventStates.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The SoccerFoulStats.
     */
    public static SoccerFoulStats fromJson2SoccerFoulStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, SoccerFoulStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The SoccerOffensiveStats.
     */
    public static SoccerOffensiveStats fromJson2SoccerOffensiveStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, SoccerOffensiveStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The StandingSubgroups.
     */
    public static StandingSubgroups fromJson2StandingSubgroups(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, StandingSubgroups.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Standings.
     */
    public static Standings fromJson2Standings(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Standings.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Stats.
     */
    public static Stats fromJson2Stats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Stats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The SubPeriods.
     */
    public static SubPeriods fromJson2SubPeriods(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, SubPeriods.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The SubSeasons.
     */
    public static SubSeasons fromJson2SubSeasons(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, SubSeasons.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The TeamAmericanFootballStats.
     */
    public static TeamAmericanFootballStats fromJson2TeamAmericanFootballStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, TeamAmericanFootballStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The TeamPhases.
     */
    public static TeamPhases fromJson2TeamPhases(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, TeamPhases.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The Teams.
     */
    public static Teams fromJson2Teams(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, Teams.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The TeamsDocuments.
     */
    public static TeamsDocuments fromJson2TeamsDocuments(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, TeamsDocuments.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The TeamsMedia.
     */
    public static TeamsMedia fromJson2TeamsMedia(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, TeamsMedia.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The TennisActionPoints.
     */
    public static TennisActionPoints fromJson2TennisActionPoints(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, TennisActionPoints.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The TennisActionVolleys.
     */
    public static TennisActionVolleys fromJson2TennisActionVolleys(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, TennisActionVolleys.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The TennisEventStates.
     */
    public static TennisEventStates fromJson2TennisEventStates(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, TennisEventStates.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The TennisReturnStats.
     */
    public static TennisReturnStats fromJson2TennisReturnStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, TennisReturnStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The TennisServiceStats.
     */
    public static TennisServiceStats fromJson2TennisServiceStats(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, TennisServiceStats.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The WageringMoneylines.
     */
    public static WageringMoneylines fromJson2WageringMoneylines(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, WageringMoneylines.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The WageringOddsLines.
     */
    public static WageringOddsLines fromJson2WageringOddsLines(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, WageringOddsLines.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The WageringRunlines.
     */
    public static WageringRunlines fromJson2WageringRunlines(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, WageringRunlines.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The WageringStraightSpreadLines.
     */
    public static WageringStraightSpreadLines fromJson2WageringStraightSpreadLines(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, WageringStraightSpreadLines.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The WageringTotalScoreLines.
     */
    public static WageringTotalScoreLines fromJson2WageringTotalScoreLines(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, WageringTotalScoreLines.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The WeatherConditions.
     */
    public static WeatherConditions fromJson2WeatherConditions(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, WeatherConditions.class);
    }

    /**
     * Helper function that converts JSON to an JSON array.
     *
     * @param json The JSON string.
     * @return an JSON array.
     */
    public static JsonArray fromJson2Arr(String json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, JsonArray.class);
    }
}
