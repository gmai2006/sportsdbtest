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

import com.sportsdb.test.dao.DefaultJpaDao;
import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.handler.*;
import java.io.*;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataLoader {

    public static void main(String[] args) {
        String inputDir = "./data/";
        Path inputPath = Paths.get(inputDir);
        if (!Files.exists(inputPath)) {
            System.err.println("Not found " + inputDir);
            System.exit(0);
        }

        loadData(inputPath);
        System.exit(0);
    }

    private static void loadData(Path inputPath) {
        EntityManager manager = null;
        try {

            EntityManagerFactory entityManagerFactory =
                    Persistence.createEntityManagerFactory("localpersistence");

            manager = entityManagerFactory.createEntityManager();
            final JpaDao jpa = new DefaultJpaDao(manager);

            Stream<Path> stream = Files.walk(inputPath, 1, FileVisitOption.FOLLOW_LINKS);
            stream.filter(path -> path.toString().endsWith(".csv"))
                    .forEach(path -> process(path, jpa));

        } catch (IOException e) {
            System.err.println("Cannot load data:" + e.getLocalizedMessage());
        } finally {
            manager.close();
        }
    }

    private static void process(Path inputPath, JpaDao jpa) {
        DelimiterFileHandler handler = null;
        String handlerName = getFileNameWithoutExtension(inputPath.getFileName().toString());
        InputStream inputStream = null;

        try {
            inputStream = new BufferedInputStream(new FileInputStream(inputPath.toFile()));

            switch (handlerName) {
                case "Addresses":
                    handler = new AddressesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AffiliationPhases":
                    handler = new AffiliationPhasesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Affiliations":
                    handler = new AffiliationsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AffiliationsDocuments":
                    handler = new AffiliationsDocumentsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AffiliationsEvents":
                    handler = new AffiliationsEventsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AffiliationsMedia":
                    handler = new AffiliationsMediaHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballActionParticipants":
                    handler = new AmericanFootballActionParticipantsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballActionPlays":
                    handler = new AmericanFootballActionPlaysHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballDefensiveStats":
                    handler = new AmericanFootballDefensiveStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballDownProgressStats":
                    handler = new AmericanFootballDownProgressStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballEventStates":
                    handler = new AmericanFootballEventStatesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballFumblesStats":
                    handler = new AmericanFootballFumblesStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballOffensiveStats":
                    handler = new AmericanFootballOffensiveStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballPassingStats":
                    handler = new AmericanFootballPassingStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballPenaltiesStats":
                    handler = new AmericanFootballPenaltiesStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballRushingStats":
                    handler = new AmericanFootballRushingStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballSacksAgainstStats":
                    handler = new AmericanFootballSacksAgainstStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballScoringStats":
                    handler = new AmericanFootballScoringStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "AmericanFootballSpecialTeamsStats":
                    handler = new AmericanFootballSpecialTeamsStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BaseballActionContactDetails":
                    handler = new BaseballActionContactDetailsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BaseballActionPitches":
                    handler = new BaseballActionPitchesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BaseballActionPlays":
                    handler = new BaseballActionPlaysHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BaseballActionSubstitutions":
                    handler = new BaseballActionSubstitutionsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BaseballDefensiveGroup":
                    handler = new BaseballDefensiveGroupHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BaseballDefensivePlayers":
                    handler = new BaseballDefensivePlayersHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BaseballDefensiveStats":
                    handler = new BaseballDefensiveStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BaseballEventStates":
                    handler = new BaseballEventStatesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BaseballOffensiveStats":
                    handler = new BaseballOffensiveStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BaseballPitchingStats":
                    handler = new BaseballPitchingStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BasketballDefensiveStats":
                    handler = new BasketballDefensiveStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BasketballEventStates":
                    handler = new BasketballEventStatesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BasketballOffensiveStats":
                    handler = new BasketballOffensiveStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BasketballReboundingStats":
                    handler = new BasketballReboundingStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "BasketballTeamStats":
                    handler = new BasketballTeamStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Bookmakers":
                    handler = new BookmakersHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "CorePersonStats":
                    handler = new CorePersonStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "CoreStats":
                    handler = new CoreStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "DbInfo":
                    handler = new DbInfoHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "DisplayNames":
                    handler = new DisplayNamesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "DocumentClasses":
                    handler = new DocumentClassesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "DocumentContents":
                    handler = new DocumentContentsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "DocumentFixtures":
                    handler = new DocumentFixturesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "DocumentFixturesEvents":
                    handler = new DocumentFixturesEventsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "DocumentPackageEntry":
                    handler = new DocumentPackageEntryHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "DocumentPackages":
                    handler = new DocumentPackagesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Documents":
                    handler = new DocumentsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "DocumentsMedia":
                    handler = new DocumentsMediaHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Events":
                    handler = new EventsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "EventsDocuments":
                    handler = new EventsDocumentsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "EventsMedia":
                    handler = new EventsMediaHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "EventsSubSeasons":
                    handler = new EventsSubSeasonsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "IceHockeyActionParticipants":
                    handler = new IceHockeyActionParticipantsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "IceHockeyActionPlays":
                    handler = new IceHockeyActionPlaysHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "IceHockeyDefensiveStats":
                    handler = new IceHockeyDefensiveStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "IceHockeyEventStates":
                    handler = new IceHockeyEventStatesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "IceHockeyOffensiveStats":
                    handler = new IceHockeyOffensiveStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "IceHockeyPlayerStats":
                    handler = new IceHockeyPlayerStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "InjuryPhases":
                    handler = new InjuryPhasesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "KeyAliases":
                    handler = new KeyAliasesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "KeyRoots":
                    handler = new KeyRootsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LatestRevisions":
                    handler = new LatestRevisionsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Locations":
                    handler = new LocationsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Media":
                    handler = new MediaHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "MediaCaptions":
                    handler = new MediaCaptionsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "MediaContents":
                    handler = new MediaContentsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "MediaKeywords":
                    handler = new MediaKeywordsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "MotorRacingEventStates":
                    handler = new MotorRacingEventStatesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "MotorRacingQualifyingStats":
                    handler = new MotorRacingQualifyingStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "MotorRacingRaceStats":
                    handler = new MotorRacingRaceStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "OutcomeTotals":
                    handler = new OutcomeTotalsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "ParticipantsEvents":
                    handler = new ParticipantsEventsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Periods":
                    handler = new PeriodsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "PersonEventMetadata":
                    handler = new PersonEventMetadataHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "PersonPhases":
                    handler = new PersonPhasesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Persons":
                    handler = new PersonsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "PersonsDocuments":
                    handler = new PersonsDocumentsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "PersonsMedia":
                    handler = new PersonsMediaHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Positions":
                    handler = new PositionsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Publishers":
                    handler = new PublishersHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Roles":
                    handler = new RolesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Seasons":
                    handler = new SeasonsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Sites":
                    handler = new SitesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "SoccerDefensiveStats":
                    handler = new SoccerDefensiveStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "SoccerEventStates":
                    handler = new SoccerEventStatesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "SoccerFoulStats":
                    handler = new SoccerFoulStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "SoccerOffensiveStats":
                    handler = new SoccerOffensiveStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "StandingSubgroups":
                    handler = new StandingSubgroupsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Standings":
                    handler = new StandingsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Stats":
                    handler = new StatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "SubPeriods":
                    handler = new SubPeriodsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "SubSeasons":
                    handler = new SubSeasonsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "TeamAmericanFootballStats":
                    handler = new TeamAmericanFootballStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "TeamPhases":
                    handler = new TeamPhasesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "Teams":
                    handler = new TeamsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "TeamsDocuments":
                    handler = new TeamsDocumentsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "TeamsMedia":
                    handler = new TeamsMediaHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "TennisActionPoints":
                    handler = new TennisActionPointsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "TennisActionVolleys":
                    handler = new TennisActionVolleysHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "TennisEventStates":
                    handler = new TennisEventStatesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "TennisReturnStats":
                    handler = new TennisReturnStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "TennisServiceStats":
                    handler = new TennisServiceStatsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "WageringMoneylines":
                    handler = new WageringMoneylinesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "WageringOddsLines":
                    handler = new WageringOddsLinesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "WageringRunlines":
                    handler = new WageringRunlinesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "WageringStraightSpreadLines":
                    handler = new WageringStraightSpreadLinesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "WageringTotalScoreLines":
                    handler = new WageringTotalScoreLinesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "WeatherConditions":
                    handler = new WeatherConditionsHandler(jpa);
                    handler.process(inputStream);
                    break;

                default:
                    System.out.println("Not found " + handlerName);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException ignored) {
                }
            }
        }
    }

    private static String getFileNameWithoutExtension(String fileName) {
        int lastIndex = fileName.lastIndexOf(".");
        if (lastIndex > 0) return fileName.substring(0, lastIndex);
        return fileName;
    }
}
