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
package com.sportsdb.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "baseball_pitching_stats")
public class BaseballPitchingStats implements Serializable {
  private static final long serialVersionUID = 16686700422499234L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: runs_allowed. */
  @Basic
  @Column(name = "runs_allowed")
  private java.lang.Integer runsAllowed;
  /** Description: singles_allowed. */
  @Basic
  @Column(name = "singles_allowed")
  private java.lang.Integer singlesAllowed;
  /** Description: doubles_allowed. */
  @Basic
  @Column(name = "doubles_allowed")
  private java.lang.Integer doublesAllowed;
  /** Description: triples_allowed. */
  @Basic
  @Column(name = "triples_allowed")
  private java.lang.Integer triplesAllowed;
  /** Description: home_runs_allowed. */
  @Basic
  @Column(name = "home_runs_allowed")
  private java.lang.Integer homeRunsAllowed;
  /** Description: innings_pitched. */
  @Basic
  @Column(name = "innings_pitched", length = 20)
  private java.lang.String inningsPitched;
  /** Description: hits. */
  @Basic
  @Column(name = "hits")
  private java.lang.Integer hits;
  /** Description: earned_runs. */
  @Basic
  @Column(name = "earned_runs")
  private java.lang.Integer earnedRuns;
  /** Description: unearned_runs. */
  @Basic
  @Column(name = "unearned_runs")
  private java.lang.Integer unearnedRuns;
  /** Description: bases_on_balls. */
  @Basic
  @Column(name = "bases_on_balls")
  private java.lang.Integer basesOnBalls;
  /** Description: bases_on_balls_intentional. */
  @Basic
  @Column(name = "bases_on_balls_intentional")
  private java.lang.Integer basesOnBallsIntentional;
  /** Description: strikeouts. */
  @Basic
  @Column(name = "strikeouts")
  private java.lang.Integer strikeouts;
  /** Description: strikeout_to_bb_ratio. */
  @Basic
  @Column(name = "strikeout_to_bb_ratio")
  private java.lang.Float strikeoutToBbRatio;
  /** Description: number_of_pitches. */
  @Basic
  @Column(name = "number_of_pitches")
  private java.lang.Integer numberOfPitches;
  /** Description: era. */
  @Basic
  @Column(name = "era")
  private java.lang.Float era;
  /** Description: inherited_runners_scored. */
  @Basic
  @Column(name = "inherited_runners_scored")
  private java.lang.Integer inheritedRunnersScored;
  /** Description: pick_offs. */
  @Basic
  @Column(name = "pick_offs")
  private java.lang.Integer pickOffs;
  /** Description: errors_hit_with_pitch. */
  @Basic
  @Column(name = "errors_hit_with_pitch")
  private java.lang.Integer errorsHitWithPitch;
  /** Description: errors_wild_pitch. */
  @Basic
  @Column(name = "errors_wild_pitch")
  private java.lang.Integer errorsWildPitch;
  /** Description: balks. */
  @Basic
  @Column(name = "balks")
  private java.lang.Integer balks;
  /** Description: wins. */
  @Basic
  @Column(name = "wins")
  private java.lang.Integer wins;
  /** Description: losses. */
  @Basic
  @Column(name = "losses")
  private java.lang.Integer losses;
  /** Description: saves. */
  @Basic
  @Column(name = "saves")
  private java.lang.Integer saves;
  /** Description: shutouts. */
  @Basic
  @Column(name = "shutouts")
  private java.lang.Integer shutouts;
  /** Description: games_complete. */
  @Basic
  @Column(name = "games_complete")
  private java.lang.Integer gamesComplete;
  /** Description: games_finished. */
  @Basic
  @Column(name = "games_finished")
  private java.lang.Integer gamesFinished;
  /** Description: winning_percentage. */
  @Basic
  @Column(name = "winning_percentage")
  private java.lang.Float winningPercentage;
  /** Description: event_credit. */
  @Basic
  @Column(name = "event_credit", length = 40)
  private java.lang.String eventCredit;
  /** Description: save_credit. */
  @Basic
  @Column(name = "save_credit", length = 40)
  private java.lang.String saveCredit;

  public BaseballPitchingStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getRunsAllowed() {
    return this.runsAllowed;
  }

  public java.lang.Integer getSinglesAllowed() {
    return this.singlesAllowed;
  }

  public java.lang.Integer getDoublesAllowed() {
    return this.doublesAllowed;
  }

  public java.lang.Integer getTriplesAllowed() {
    return this.triplesAllowed;
  }

  public java.lang.Integer getHomeRunsAllowed() {
    return this.homeRunsAllowed;
  }

  public java.lang.String getInningsPitched() {
    return this.inningsPitched;
  }

  public java.lang.Integer getHits() {
    return this.hits;
  }

  public java.lang.Integer getEarnedRuns() {
    return this.earnedRuns;
  }

  public java.lang.Integer getUnearnedRuns() {
    return this.unearnedRuns;
  }

  public java.lang.Integer getBasesOnBalls() {
    return this.basesOnBalls;
  }

  public java.lang.Integer getBasesOnBallsIntentional() {
    return this.basesOnBallsIntentional;
  }

  public java.lang.Integer getStrikeouts() {
    return this.strikeouts;
  }

  public java.lang.Float getStrikeoutToBbRatio() {
    return this.strikeoutToBbRatio;
  }

  public java.lang.Integer getNumberOfPitches() {
    return this.numberOfPitches;
  }

  public java.lang.Float getEra() {
    return this.era;
  }

  public java.lang.Integer getInheritedRunnersScored() {
    return this.inheritedRunnersScored;
  }

  public java.lang.Integer getPickOffs() {
    return this.pickOffs;
  }

  public java.lang.Integer getErrorsHitWithPitch() {
    return this.errorsHitWithPitch;
  }

  public java.lang.Integer getErrorsWildPitch() {
    return this.errorsWildPitch;
  }

  public java.lang.Integer getBalks() {
    return this.balks;
  }

  public java.lang.Integer getWins() {
    return this.wins;
  }

  public java.lang.Integer getLosses() {
    return this.losses;
  }

  public java.lang.Integer getSaves() {
    return this.saves;
  }

  public java.lang.Integer getShutouts() {
    return this.shutouts;
  }

  public java.lang.Integer getGamesComplete() {
    return this.gamesComplete;
  }

  public java.lang.Integer getGamesFinished() {
    return this.gamesFinished;
  }

  public java.lang.Float getWinningPercentage() {
    return this.winningPercentage;
  }

  public java.lang.String getEventCredit() {
    return this.eventCredit;
  }

  public java.lang.String getSaveCredit() {
    return this.saveCredit;
  }

  public void setRunsAllowed(java.lang.Integer runsAllowed) {
    this.runsAllowed = runsAllowed;
  }

  public void setSinglesAllowed(java.lang.Integer singlesAllowed) {
    this.singlesAllowed = singlesAllowed;
  }

  public void setDoublesAllowed(java.lang.Integer doublesAllowed) {
    this.doublesAllowed = doublesAllowed;
  }

  public void setTriplesAllowed(java.lang.Integer triplesAllowed) {
    this.triplesAllowed = triplesAllowed;
  }

  public void setHomeRunsAllowed(java.lang.Integer homeRunsAllowed) {
    this.homeRunsAllowed = homeRunsAllowed;
  }

  public void setInningsPitched(java.lang.String inningsPitched) {
    this.inningsPitched = inningsPitched;
  }

  public void setHits(java.lang.Integer hits) {
    this.hits = hits;
  }

  public void setEarnedRuns(java.lang.Integer earnedRuns) {
    this.earnedRuns = earnedRuns;
  }

  public void setUnearnedRuns(java.lang.Integer unearnedRuns) {
    this.unearnedRuns = unearnedRuns;
  }

  public void setBasesOnBalls(java.lang.Integer basesOnBalls) {
    this.basesOnBalls = basesOnBalls;
  }

  public void setBasesOnBallsIntentional(java.lang.Integer basesOnBallsIntentional) {
    this.basesOnBallsIntentional = basesOnBallsIntentional;
  }

  public void setStrikeouts(java.lang.Integer strikeouts) {
    this.strikeouts = strikeouts;
  }

  public void setStrikeoutToBbRatio(java.lang.Float strikeoutToBbRatio) {
    this.strikeoutToBbRatio = strikeoutToBbRatio;
  }

  public void setNumberOfPitches(java.lang.Integer numberOfPitches) {
    this.numberOfPitches = numberOfPitches;
  }

  public void setEra(java.lang.Float era) {
    this.era = era;
  }

  public void setInheritedRunnersScored(java.lang.Integer inheritedRunnersScored) {
    this.inheritedRunnersScored = inheritedRunnersScored;
  }

  public void setPickOffs(java.lang.Integer pickOffs) {
    this.pickOffs = pickOffs;
  }

  public void setErrorsHitWithPitch(java.lang.Integer errorsHitWithPitch) {
    this.errorsHitWithPitch = errorsHitWithPitch;
  }

  public void setErrorsWildPitch(java.lang.Integer errorsWildPitch) {
    this.errorsWildPitch = errorsWildPitch;
  }

  public void setBalks(java.lang.Integer balks) {
    this.balks = balks;
  }

  public void setWins(java.lang.Integer wins) {
    this.wins = wins;
  }

  public void setLosses(java.lang.Integer losses) {
    this.losses = losses;
  }

  public void setSaves(java.lang.Integer saves) {
    this.saves = saves;
  }

  public void setShutouts(java.lang.Integer shutouts) {
    this.shutouts = shutouts;
  }

  public void setGamesComplete(java.lang.Integer gamesComplete) {
    this.gamesComplete = gamesComplete;
  }

  public void setGamesFinished(java.lang.Integer gamesFinished) {
    this.gamesFinished = gamesFinished;
  }

  public void setWinningPercentage(java.lang.Float winningPercentage) {
    this.winningPercentage = winningPercentage;
  }

  public void setEventCredit(java.lang.String eventCredit) {
    this.eventCredit = eventCredit;
  }

  public void setSaveCredit(java.lang.String saveCredit) {
    this.saveCredit = saveCredit;
  }
}
