import React from 'react';
import init from "../init";
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import Addresses from '../pages/tables/Addresses';
import AffiliationPhases from '../pages/tables/AffiliationPhases';
import Affiliations from '../pages/tables/Affiliations';
import AffiliationsDocuments from '../pages/tables/AffiliationsDocuments';
import AffiliationsEvents from '../pages/tables/AffiliationsEvents';
import AffiliationsMedia from '../pages/tables/AffiliationsMedia';
import AmericanFootballActionParticipants from '../pages/tables/AmericanFootballActionParticipants';
import AmericanFootballActionPlays from '../pages/tables/AmericanFootballActionPlays';
import AmericanFootballDefensiveStats from '../pages/tables/AmericanFootballDefensiveStats';
import AmericanFootballDownProgressStats from '../pages/tables/AmericanFootballDownProgressStats';
import AmericanFootballEventStates from '../pages/tables/AmericanFootballEventStates';
import AmericanFootballFumblesStats from '../pages/tables/AmericanFootballFumblesStats';
import AmericanFootballOffensiveStats from '../pages/tables/AmericanFootballOffensiveStats';
import AmericanFootballPassingStats from '../pages/tables/AmericanFootballPassingStats';
import AmericanFootballPenaltiesStats from '../pages/tables/AmericanFootballPenaltiesStats';
import AmericanFootballRushingStats from '../pages/tables/AmericanFootballRushingStats';
import AmericanFootballSacksAgainstStats from '../pages/tables/AmericanFootballSacksAgainstStats';
import AmericanFootballScoringStats from '../pages/tables/AmericanFootballScoringStats';
import AmericanFootballSpecialTeamsStats from '../pages/tables/AmericanFootballSpecialTeamsStats';
import BaseballActionContactDetails from '../pages/tables/BaseballActionContactDetails';
import BaseballActionPitches from '../pages/tables/BaseballActionPitches';
import BaseballActionPlays from '../pages/tables/BaseballActionPlays';
import BaseballActionSubstitutions from '../pages/tables/BaseballActionSubstitutions';
import BaseballDefensiveGroup from '../pages/tables/BaseballDefensiveGroup';
import BaseballDefensivePlayers from '../pages/tables/BaseballDefensivePlayers';
import BaseballDefensiveStats from '../pages/tables/BaseballDefensiveStats';
import BaseballEventStates from '../pages/tables/BaseballEventStates';
import BaseballOffensiveStats from '../pages/tables/BaseballOffensiveStats';
import BaseballPitchingStats from '../pages/tables/BaseballPitchingStats';
import BasketballDefensiveStats from '../pages/tables/BasketballDefensiveStats';
import BasketballEventStates from '../pages/tables/BasketballEventStates';
import BasketballOffensiveStats from '../pages/tables/BasketballOffensiveStats';
import BasketballReboundingStats from '../pages/tables/BasketballReboundingStats';
import BasketballTeamStats from '../pages/tables/BasketballTeamStats';
import Bookmakers from '../pages/tables/Bookmakers';
import CorePersonStats from '../pages/tables/CorePersonStats';
import CoreStats from '../pages/tables/CoreStats';
import DbInfo from '../pages/tables/DbInfo';
import DisplayNames from '../pages/tables/DisplayNames';
import DocumentClasses from '../pages/tables/DocumentClasses';
import DocumentContents from '../pages/tables/DocumentContents';
import DocumentFixtures from '../pages/tables/DocumentFixtures';
import DocumentFixturesEvents from '../pages/tables/DocumentFixturesEvents';
import DocumentPackageEntry from '../pages/tables/DocumentPackageEntry';
import DocumentPackages from '../pages/tables/DocumentPackages';
import Documents from '../pages/tables/Documents';
import DocumentsMedia from '../pages/tables/DocumentsMedia';
import Events from '../pages/tables/Events';
import EventsDocuments from '../pages/tables/EventsDocuments';
import EventsMedia from '../pages/tables/EventsMedia';
import EventsSubSeasons from '../pages/tables/EventsSubSeasons';
import IceHockeyActionParticipants from '../pages/tables/IceHockeyActionParticipants';
import IceHockeyActionPlays from '../pages/tables/IceHockeyActionPlays';
import IceHockeyDefensiveStats from '../pages/tables/IceHockeyDefensiveStats';
import IceHockeyEventStates from '../pages/tables/IceHockeyEventStates';
import IceHockeyOffensiveStats from '../pages/tables/IceHockeyOffensiveStats';
import IceHockeyPlayerStats from '../pages/tables/IceHockeyPlayerStats';
import InjuryPhases from '../pages/tables/InjuryPhases';
import KeyAliases from '../pages/tables/KeyAliases';
import KeyRoots from '../pages/tables/KeyRoots';
import LatestRevisions from '../pages/tables/LatestRevisions';
import Locations from '../pages/tables/Locations';
import Media from '../pages/tables/Media';
import MediaCaptions from '../pages/tables/MediaCaptions';
import MediaContents from '../pages/tables/MediaContents';
import MediaKeywords from '../pages/tables/MediaKeywords';
import MotorRacingEventStates from '../pages/tables/MotorRacingEventStates';
import MotorRacingQualifyingStats from '../pages/tables/MotorRacingQualifyingStats';
import MotorRacingRaceStats from '../pages/tables/MotorRacingRaceStats';
import OutcomeTotals from '../pages/tables/OutcomeTotals';
import ParticipantsEvents from '../pages/tables/ParticipantsEvents';
import Periods from '../pages/tables/Periods';
import PersonEventMetadata from '../pages/tables/PersonEventMetadata';
import PersonPhases from '../pages/tables/PersonPhases';
import Persons from '../pages/tables/Persons';
import PersonsDocuments from '../pages/tables/PersonsDocuments';
import PersonsMedia from '../pages/tables/PersonsMedia';
import Positions from '../pages/tables/Positions';
import Publishers from '../pages/tables/Publishers';
import Roles from '../pages/tables/Roles';
import Seasons from '../pages/tables/Seasons';
import Sites from '../pages/tables/Sites';
import SoccerDefensiveStats from '../pages/tables/SoccerDefensiveStats';
import SoccerEventStates from '../pages/tables/SoccerEventStates';
import SoccerFoulStats from '../pages/tables/SoccerFoulStats';
import SoccerOffensiveStats from '../pages/tables/SoccerOffensiveStats';
import StandingSubgroups from '../pages/tables/StandingSubgroups';
import Standings from '../pages/tables/Standings';
import Stats from '../pages/tables/Stats';
import SubPeriods from '../pages/tables/SubPeriods';
import SubSeasons from '../pages/tables/SubSeasons';
import TeamAmericanFootballStats from '../pages/tables/TeamAmericanFootballStats';
import TeamPhases from '../pages/tables/TeamPhases';
import Teams from '../pages/tables/Teams';
import TeamsDocuments from '../pages/tables/TeamsDocuments';
import TeamsMedia from '../pages/tables/TeamsMedia';
import TennisActionPoints from '../pages/tables/TennisActionPoints';
import TennisActionVolleys from '../pages/tables/TennisActionVolleys';
import TennisEventStates from '../pages/tables/TennisEventStates';
import TennisReturnStats from '../pages/tables/TennisReturnStats';
import TennisServiceStats from '../pages/tables/TennisServiceStats';
import WageringMoneylines from '../pages/tables/WageringMoneylines';
import WageringOddsLines from '../pages/tables/WageringOddsLines';
import WageringRunlines from '../pages/tables/WageringRunlines';
import WageringStraightSpreadLines from '../pages/tables/WageringStraightSpreadLines';
import WageringTotalScoreLines from '../pages/tables/WageringTotalScoreLines';
import WeatherConditions from '../pages/tables/WeatherConditions';;

const TableMenu = () => {
  const path = '/' + init.appName;
  return (
    <div>
      <Switch>

          <Route path={path + '/tables/addresses'} component={Addresses} />
          <Route path={path + '/tables/affiliationphases'} component={AffiliationPhases} />
          <Route path={path + '/tables/affiliations'} component={Affiliations} />
          <Route path={path + '/tables/affiliationsdocuments'} component={AffiliationsDocuments} />
          <Route path={path + '/tables/affiliationsevents'} component={AffiliationsEvents} />
          <Route path={path + '/tables/affiliationsmedia'} component={AffiliationsMedia} />
          <Route path={path + '/tables/americanfootballactionparticipants'} component={AmericanFootballActionParticipants} />
          <Route path={path + '/tables/americanfootballactionplays'} component={AmericanFootballActionPlays} />
          <Route path={path + '/tables/americanfootballdefensivestats'} component={AmericanFootballDefensiveStats} />
          <Route path={path + '/tables/americanfootballdownprogressstats'} component={AmericanFootballDownProgressStats} />
          <Route path={path + '/tables/americanfootballeventstates'} component={AmericanFootballEventStates} />
          <Route path={path + '/tables/americanfootballfumblesstats'} component={AmericanFootballFumblesStats} />
          <Route path={path + '/tables/americanfootballoffensivestats'} component={AmericanFootballOffensiveStats} />
          <Route path={path + '/tables/americanfootballpassingstats'} component={AmericanFootballPassingStats} />
          <Route path={path + '/tables/americanfootballpenaltiesstats'} component={AmericanFootballPenaltiesStats} />
          <Route path={path + '/tables/americanfootballrushingstats'} component={AmericanFootballRushingStats} />
          <Route path={path + '/tables/americanfootballsacksagainststats'} component={AmericanFootballSacksAgainstStats} />
          <Route path={path + '/tables/americanfootballscoringstats'} component={AmericanFootballScoringStats} />
          <Route path={path + '/tables/americanfootballspecialteamsstats'} component={AmericanFootballSpecialTeamsStats} />
          <Route path={path + '/tables/baseballactioncontactdetails'} component={BaseballActionContactDetails} />
          <Route path={path + '/tables/baseballactionpitches'} component={BaseballActionPitches} />
          <Route path={path + '/tables/baseballactionplays'} component={BaseballActionPlays} />
          <Route path={path + '/tables/baseballactionsubstitutions'} component={BaseballActionSubstitutions} />
          <Route path={path + '/tables/baseballdefensivegroup'} component={BaseballDefensiveGroup} />
          <Route path={path + '/tables/baseballdefensiveplayers'} component={BaseballDefensivePlayers} />
          <Route path={path + '/tables/baseballdefensivestats'} component={BaseballDefensiveStats} />
          <Route path={path + '/tables/baseballeventstates'} component={BaseballEventStates} />
          <Route path={path + '/tables/baseballoffensivestats'} component={BaseballOffensiveStats} />
          <Route path={path + '/tables/baseballpitchingstats'} component={BaseballPitchingStats} />
          <Route path={path + '/tables/basketballdefensivestats'} component={BasketballDefensiveStats} />
          <Route path={path + '/tables/basketballeventstates'} component={BasketballEventStates} />
          <Route path={path + '/tables/basketballoffensivestats'} component={BasketballOffensiveStats} />
          <Route path={path + '/tables/basketballreboundingstats'} component={BasketballReboundingStats} />
          <Route path={path + '/tables/basketballteamstats'} component={BasketballTeamStats} />
          <Route path={path + '/tables/bookmakers'} component={Bookmakers} />
          <Route path={path + '/tables/corepersonstats'} component={CorePersonStats} />
          <Route path={path + '/tables/corestats'} component={CoreStats} />
          <Route path={path + '/tables/dbinfo'} component={DbInfo} />
          <Route path={path + '/tables/displaynames'} component={DisplayNames} />
          <Route path={path + '/tables/documentclasses'} component={DocumentClasses} />
          <Route path={path + '/tables/documentcontents'} component={DocumentContents} />
          <Route path={path + '/tables/documentfixtures'} component={DocumentFixtures} />
          <Route path={path + '/tables/documentfixturesevents'} component={DocumentFixturesEvents} />
          <Route path={path + '/tables/documentpackageentry'} component={DocumentPackageEntry} />
          <Route path={path + '/tables/documentpackages'} component={DocumentPackages} />
          <Route path={path + '/tables/documents'} component={Documents} />
          <Route path={path + '/tables/documentsmedia'} component={DocumentsMedia} />
          <Route path={path + '/tables/events'} component={Events} />
          <Route path={path + '/tables/eventsdocuments'} component={EventsDocuments} />
          <Route path={path + '/tables/eventsmedia'} component={EventsMedia} />
          <Route path={path + '/tables/eventssubseasons'} component={EventsSubSeasons} />
          <Route path={path + '/tables/icehockeyactionparticipants'} component={IceHockeyActionParticipants} />
          <Route path={path + '/tables/icehockeyactionplays'} component={IceHockeyActionPlays} />
          <Route path={path + '/tables/icehockeydefensivestats'} component={IceHockeyDefensiveStats} />
          <Route path={path + '/tables/icehockeyeventstates'} component={IceHockeyEventStates} />
          <Route path={path + '/tables/icehockeyoffensivestats'} component={IceHockeyOffensiveStats} />
          <Route path={path + '/tables/icehockeyplayerstats'} component={IceHockeyPlayerStats} />
          <Route path={path + '/tables/injuryphases'} component={InjuryPhases} />
          <Route path={path + '/tables/keyaliases'} component={KeyAliases} />
          <Route path={path + '/tables/keyroots'} component={KeyRoots} />
          <Route path={path + '/tables/latestrevisions'} component={LatestRevisions} />
          <Route path={path + '/tables/locations'} component={Locations} />
          <Route path={path + '/tables/media'} component={Media} />
          <Route path={path + '/tables/mediacaptions'} component={MediaCaptions} />
          <Route path={path + '/tables/mediacontents'} component={MediaContents} />
          <Route path={path + '/tables/mediakeywords'} component={MediaKeywords} />
          <Route path={path + '/tables/motorracingeventstates'} component={MotorRacingEventStates} />
          <Route path={path + '/tables/motorracingqualifyingstats'} component={MotorRacingQualifyingStats} />
          <Route path={path + '/tables/motorracingracestats'} component={MotorRacingRaceStats} />
          <Route path={path + '/tables/outcometotals'} component={OutcomeTotals} />
          <Route path={path + '/tables/participantsevents'} component={ParticipantsEvents} />
          <Route path={path + '/tables/periods'} component={Periods} />
          <Route path={path + '/tables/personeventmetadata'} component={PersonEventMetadata} />
          <Route path={path + '/tables/personphases'} component={PersonPhases} />
          <Route path={path + '/tables/persons'} component={Persons} />
          <Route path={path + '/tables/personsdocuments'} component={PersonsDocuments} />
          <Route path={path + '/tables/personsmedia'} component={PersonsMedia} />
          <Route path={path + '/tables/positions'} component={Positions} />
          <Route path={path + '/tables/publishers'} component={Publishers} />
          <Route path={path + '/tables/roles'} component={Roles} />
          <Route path={path + '/tables/seasons'} component={Seasons} />
          <Route path={path + '/tables/sites'} component={Sites} />
          <Route path={path + '/tables/soccerdefensivestats'} component={SoccerDefensiveStats} />
          <Route path={path + '/tables/soccereventstates'} component={SoccerEventStates} />
          <Route path={path + '/tables/soccerfoulstats'} component={SoccerFoulStats} />
          <Route path={path + '/tables/socceroffensivestats'} component={SoccerOffensiveStats} />
          <Route path={path + '/tables/standingsubgroups'} component={StandingSubgroups} />
          <Route path={path + '/tables/standings'} component={Standings} />
          <Route path={path + '/tables/stats'} component={Stats} />
          <Route path={path + '/tables/subperiods'} component={SubPeriods} />
          <Route path={path + '/tables/subseasons'} component={SubSeasons} />
          <Route path={path + '/tables/teamamericanfootballstats'} component={TeamAmericanFootballStats} />
          <Route path={path + '/tables/teamphases'} component={TeamPhases} />
          <Route path={path + '/tables/teams'} component={Teams} />
          <Route path={path + '/tables/teamsdocuments'} component={TeamsDocuments} />
          <Route path={path + '/tables/teamsmedia'} component={TeamsMedia} />
          <Route path={path + '/tables/tennisactionpoints'} component={TennisActionPoints} />
          <Route path={path + '/tables/tennisactionvolleys'} component={TennisActionVolleys} />
          <Route path={path + '/tables/tenniseventstates'} component={TennisEventStates} />
          <Route path={path + '/tables/tennisreturnstats'} component={TennisReturnStats} />
          <Route path={path + '/tables/tennisservicestats'} component={TennisServiceStats} />
          <Route path={path + '/tables/wageringmoneylines'} component={WageringMoneylines} />
          <Route path={path + '/tables/wageringoddslines'} component={WageringOddsLines} />
          <Route path={path + '/tables/wageringrunlines'} component={WageringRunlines} />
          <Route path={path + '/tables/wageringstraightspreadlines'} component={WageringStraightSpreadLines} />
          <Route path={path + '/tables/wageringtotalscorelines'} component={WageringTotalScoreLines} />
          <Route path={path + '/tables/weatherconditions'} component={WeatherConditions} />
      </Switch>
  </div>
)};

export default TableMenu;