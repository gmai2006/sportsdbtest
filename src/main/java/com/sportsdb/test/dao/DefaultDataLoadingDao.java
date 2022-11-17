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

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

import com.sportsdb.test.entity.Addresses;
import com.sportsdb.test.entity.AffiliationPhases;
import com.sportsdb.test.entity.Affiliations;
import com.sportsdb.test.entity.AffiliationsDocuments;
import com.sportsdb.test.entity.AffiliationsEvents;
import com.sportsdb.test.entity.AffiliationsMedia;
import com.sportsdb.test.entity.AmericanFootballActionParticipants;
import com.sportsdb.test.entity.AmericanFootballActionPlays;
import com.sportsdb.test.entity.AmericanFootballDefensiveStats;
import com.sportsdb.test.entity.AmericanFootballDownProgressStats;
import com.sportsdb.test.entity.AmericanFootballEventStates;
import com.sportsdb.test.entity.AmericanFootballFumblesStats;
import com.sportsdb.test.entity.AmericanFootballOffensiveStats;
import com.sportsdb.test.entity.AmericanFootballPassingStats;
import com.sportsdb.test.entity.AmericanFootballPenaltiesStats;
import com.sportsdb.test.entity.AmericanFootballRushingStats;
import com.sportsdb.test.entity.AmericanFootballSacksAgainstStats;
import com.sportsdb.test.entity.AmericanFootballScoringStats;
import com.sportsdb.test.entity.AmericanFootballSpecialTeamsStats;
import com.sportsdb.test.entity.BaseballActionContactDetails;
import com.sportsdb.test.entity.BaseballActionPitches;
import com.sportsdb.test.entity.BaseballActionPlays;
import com.sportsdb.test.entity.BaseballActionSubstitutions;
import com.sportsdb.test.entity.BaseballDefensiveGroup;
import com.sportsdb.test.entity.BaseballDefensivePlayers;
import com.sportsdb.test.entity.BaseballDefensiveStats;
import com.sportsdb.test.entity.BaseballEventStates;
import com.sportsdb.test.entity.BaseballOffensiveStats;
import com.sportsdb.test.entity.BaseballPitchingStats;
import com.sportsdb.test.entity.BasketballDefensiveStats;
import com.sportsdb.test.entity.BasketballEventStates;
import com.sportsdb.test.entity.BasketballOffensiveStats;
import com.sportsdb.test.entity.BasketballReboundingStats;
import com.sportsdb.test.entity.BasketballTeamStats;
import com.sportsdb.test.entity.Bookmakers;
import com.sportsdb.test.entity.CorePersonStats;
import com.sportsdb.test.entity.CoreStats;
import com.sportsdb.test.entity.DbInfo;
import com.sportsdb.test.entity.DisplayNames;
import com.sportsdb.test.entity.DocumentClasses;
import com.sportsdb.test.entity.DocumentContents;
import com.sportsdb.test.entity.DocumentFixtures;
import com.sportsdb.test.entity.DocumentFixturesEvents;
import com.sportsdb.test.entity.DocumentPackageEntry;
import com.sportsdb.test.entity.DocumentPackages;
import com.sportsdb.test.entity.Documents;
import com.sportsdb.test.entity.DocumentsMedia;
import com.sportsdb.test.entity.Events;
import com.sportsdb.test.entity.EventsDocuments;
import com.sportsdb.test.entity.EventsMedia;
import com.sportsdb.test.entity.EventsSubSeasons;
import com.sportsdb.test.entity.IceHockeyActionParticipants;
import com.sportsdb.test.entity.IceHockeyActionPlays;
import com.sportsdb.test.entity.IceHockeyDefensiveStats;
import com.sportsdb.test.entity.IceHockeyEventStates;
import com.sportsdb.test.entity.IceHockeyOffensiveStats;
import com.sportsdb.test.entity.IceHockeyPlayerStats;
import com.sportsdb.test.entity.InjuryPhases;
import com.sportsdb.test.entity.KeyAliases;
import com.sportsdb.test.entity.KeyRoots;
import com.sportsdb.test.entity.LatestRevisions;
import com.sportsdb.test.entity.Locations;
import com.sportsdb.test.entity.Media;
import com.sportsdb.test.entity.MediaCaptions;
import com.sportsdb.test.entity.MediaContents;
import com.sportsdb.test.entity.MediaKeywords;
import com.sportsdb.test.entity.MotorRacingEventStates;
import com.sportsdb.test.entity.MotorRacingQualifyingStats;
import com.sportsdb.test.entity.MotorRacingRaceStats;
import com.sportsdb.test.entity.OutcomeTotals;
import com.sportsdb.test.entity.ParticipantsEvents;
import com.sportsdb.test.entity.Periods;
import com.sportsdb.test.entity.PersonEventMetadata;
import com.sportsdb.test.entity.PersonPhases;
import com.sportsdb.test.entity.Persons;
import com.sportsdb.test.entity.PersonsDocuments;
import com.sportsdb.test.entity.PersonsMedia;
import com.sportsdb.test.entity.Positions;
import com.sportsdb.test.entity.Publishers;
import com.sportsdb.test.entity.Roles;
import com.sportsdb.test.entity.Seasons;
import com.sportsdb.test.entity.Sites;
import com.sportsdb.test.entity.SoccerDefensiveStats;
import com.sportsdb.test.entity.SoccerEventStates;
import com.sportsdb.test.entity.SoccerFoulStats;
import com.sportsdb.test.entity.SoccerOffensiveStats;
import com.sportsdb.test.entity.StandingSubgroups;
import com.sportsdb.test.entity.Standings;
import com.sportsdb.test.entity.Stats;
import com.sportsdb.test.entity.SubPeriods;
import com.sportsdb.test.entity.SubSeasons;
import com.sportsdb.test.entity.TeamAmericanFootballStats;
import com.sportsdb.test.entity.TeamPhases;
import com.sportsdb.test.entity.Teams;
import com.sportsdb.test.entity.TeamsDocuments;
import com.sportsdb.test.entity.TeamsMedia;
import com.sportsdb.test.entity.TennisActionPoints;
import com.sportsdb.test.entity.TennisActionVolleys;
import com.sportsdb.test.entity.TennisEventStates;
import com.sportsdb.test.entity.TennisReturnStats;
import com.sportsdb.test.entity.TennisServiceStats;
import com.sportsdb.test.entity.WageringMoneylines;
import com.sportsdb.test.entity.WageringOddsLines;
import com.sportsdb.test.entity.WageringRunlines;
import com.sportsdb.test.entity.WageringStraightSpreadLines;
import com.sportsdb.test.entity.WageringTotalScoreLines;
import com.sportsdb.test.entity.WeatherConditions;
import com.sportsdb.test.entity.DataLoadingStatus;
import com.sportsdb.test.entity.Loadingstatus;

@Stateless
@Named("DefaultDataLoadingDao")
public class DefaultDataLoadingDao implements DataLoadingDao {

  private static final Logger logger = Logger.getLogger(DefaultDataLoadingDao.class.getName());
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DefaultDataLoadingDao(JpaDao dao) {
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public DataLoadingStatus update(DataLoadingStatus e) {
    return dao.update(e);
  }

  /** {@inheritDoc} */
  @Override
  public DataLoadingStatus getLoadingStatus(String type) {
    DataLoadingStatus loadingStatus = dao.find(DataLoadingStatus.class, type);
    if (null == loadingStatus) {
      loadingStatus = new DataLoadingStatus(type, Loadingstatus.NEW);
      dao.create(loadingStatus);
    }
    return loadingStatus;
  }

  /** {@inheritDoc} */
  @Override
  public <E> E create(E e) {
    return dao.create(e);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(String id) {
    dao.delete(DataLoadingStatus.class, id);
  }

  /** {@inheritDoc} */
  @Override
  public void deleteAll() {
    dao.deleteAll(Addresses.class);
    dao.deleteAll(AffiliationPhases.class);
    dao.deleteAll(Affiliations.class);
    dao.deleteAll(AffiliationsDocuments.class);
    dao.deleteAll(AffiliationsEvents.class);
    dao.deleteAll(AffiliationsMedia.class);
    dao.deleteAll(AmericanFootballActionParticipants.class);
    dao.deleteAll(AmericanFootballActionPlays.class);
    dao.deleteAll(AmericanFootballDefensiveStats.class);
    dao.deleteAll(AmericanFootballDownProgressStats.class);
    dao.deleteAll(AmericanFootballEventStates.class);
    dao.deleteAll(AmericanFootballFumblesStats.class);
    dao.deleteAll(AmericanFootballOffensiveStats.class);
    dao.deleteAll(AmericanFootballPassingStats.class);
    dao.deleteAll(AmericanFootballPenaltiesStats.class);
    dao.deleteAll(AmericanFootballRushingStats.class);
    dao.deleteAll(AmericanFootballSacksAgainstStats.class);
    dao.deleteAll(AmericanFootballScoringStats.class);
    dao.deleteAll(AmericanFootballSpecialTeamsStats.class);
    dao.deleteAll(BaseballActionContactDetails.class);
    dao.deleteAll(BaseballActionPitches.class);
    dao.deleteAll(BaseballActionPlays.class);
    dao.deleteAll(BaseballActionSubstitutions.class);
    dao.deleteAll(BaseballDefensiveGroup.class);
    dao.deleteAll(BaseballDefensivePlayers.class);
    dao.deleteAll(BaseballDefensiveStats.class);
    dao.deleteAll(BaseballEventStates.class);
    dao.deleteAll(BaseballOffensiveStats.class);
    dao.deleteAll(BaseballPitchingStats.class);
    dao.deleteAll(BasketballDefensiveStats.class);
    dao.deleteAll(BasketballEventStates.class);
    dao.deleteAll(BasketballOffensiveStats.class);
    dao.deleteAll(BasketballReboundingStats.class);
    dao.deleteAll(BasketballTeamStats.class);
    dao.deleteAll(Bookmakers.class);
    dao.deleteAll(CorePersonStats.class);
    dao.deleteAll(CoreStats.class);
    dao.deleteAll(DbInfo.class);
    dao.deleteAll(DisplayNames.class);
    dao.deleteAll(DocumentClasses.class);
    dao.deleteAll(DocumentContents.class);
    dao.deleteAll(DocumentFixtures.class);
    dao.deleteAll(DocumentFixturesEvents.class);
    dao.deleteAll(DocumentPackageEntry.class);
    dao.deleteAll(DocumentPackages.class);
    dao.deleteAll(Documents.class);
    dao.deleteAll(DocumentsMedia.class);
    dao.deleteAll(Events.class);
    dao.deleteAll(EventsDocuments.class);
    dao.deleteAll(EventsMedia.class);
    dao.deleteAll(EventsSubSeasons.class);
    dao.deleteAll(IceHockeyActionParticipants.class);
    dao.deleteAll(IceHockeyActionPlays.class);
    dao.deleteAll(IceHockeyDefensiveStats.class);
    dao.deleteAll(IceHockeyEventStates.class);
    dao.deleteAll(IceHockeyOffensiveStats.class);
    dao.deleteAll(IceHockeyPlayerStats.class);
    dao.deleteAll(InjuryPhases.class);
    dao.deleteAll(KeyAliases.class);
    dao.deleteAll(KeyRoots.class);
    dao.deleteAll(LatestRevisions.class);
    dao.deleteAll(Locations.class);
    dao.deleteAll(Media.class);
    dao.deleteAll(MediaCaptions.class);
    dao.deleteAll(MediaContents.class);
    dao.deleteAll(MediaKeywords.class);
    dao.deleteAll(MotorRacingEventStates.class);
    dao.deleteAll(MotorRacingQualifyingStats.class);
    dao.deleteAll(MotorRacingRaceStats.class);
    dao.deleteAll(OutcomeTotals.class);
    dao.deleteAll(ParticipantsEvents.class);
    dao.deleteAll(Periods.class);
    dao.deleteAll(PersonEventMetadata.class);
    dao.deleteAll(PersonPhases.class);
    dao.deleteAll(Persons.class);
    dao.deleteAll(PersonsDocuments.class);
    dao.deleteAll(PersonsMedia.class);
    dao.deleteAll(Positions.class);
    dao.deleteAll(Publishers.class);
    dao.deleteAll(Roles.class);
    dao.deleteAll(Seasons.class);
    dao.deleteAll(Sites.class);
    dao.deleteAll(SoccerDefensiveStats.class);
    dao.deleteAll(SoccerEventStates.class);
    dao.deleteAll(SoccerFoulStats.class);
    dao.deleteAll(SoccerOffensiveStats.class);
    dao.deleteAll(StandingSubgroups.class);
    dao.deleteAll(Standings.class);
    dao.deleteAll(Stats.class);
    dao.deleteAll(SubPeriods.class);
    dao.deleteAll(SubSeasons.class);
    dao.deleteAll(TeamAmericanFootballStats.class);
    dao.deleteAll(TeamPhases.class);
    dao.deleteAll(Teams.class);
    dao.deleteAll(TeamsDocuments.class);
    dao.deleteAll(TeamsMedia.class);
    dao.deleteAll(TennisActionPoints.class);
    dao.deleteAll(TennisActionVolleys.class);
    dao.deleteAll(TennisEventStates.class);
    dao.deleteAll(TennisReturnStats.class);
    dao.deleteAll(TennisServiceStats.class);
    dao.deleteAll(WageringMoneylines.class);
    dao.deleteAll(WageringOddsLines.class);
    dao.deleteAll(WageringRunlines.class);
    dao.deleteAll(WageringStraightSpreadLines.class);
    dao.deleteAll(WageringTotalScoreLines.class);
    dao.deleteAll(WeatherConditions.class);
  }
}
