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
@Table(name = "ice_hockey_offensive_stats")
public class IceHockeyOffensiveStats implements Serializable {
  private static final long serialVersionUID = 166867004238598918L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: goals_game_winning. */
  @Basic
  @Column(name = "goals_game_winning", length = 100)
  private java.lang.String goalsGameWinning;
  /** Description: goals_game_tying. */
  @Basic
  @Column(name = "goals_game_tying", length = 100)
  private java.lang.String goalsGameTying;
  /** Description: goals_power_play. */
  @Basic
  @Column(name = "goals_power_play", length = 100)
  private java.lang.String goalsPowerPlay;
  /** Description: goals_short_handed. */
  @Basic
  @Column(name = "goals_short_handed", length = 100)
  private java.lang.String goalsShortHanded;
  /** Description: goals_even_strength. */
  @Basic
  @Column(name = "goals_even_strength", length = 100)
  private java.lang.String goalsEvenStrength;
  /** Description: goals_empty_net. */
  @Basic
  @Column(name = "goals_empty_net", length = 100)
  private java.lang.String goalsEmptyNet;
  /** Description: goals_overtime. */
  @Basic
  @Column(name = "goals_overtime", length = 100)
  private java.lang.String goalsOvertime;
  /** Description: goals_shootout. */
  @Basic
  @Column(name = "goals_shootout", length = 100)
  private java.lang.String goalsShootout;
  /** Description: goals_penalty_shot. */
  @Basic
  @Column(name = "goals_penalty_shot", length = 100)
  private java.lang.String goalsPenaltyShot;
  /** Description: assists. */
  @Basic
  @Column(name = "assists", length = 100)
  private java.lang.String assists;
  /** Description: points. */
  @Basic
  @Column(name = "points", length = 100)
  private java.lang.String points;
  /** Description: power_play_amount. */
  @Basic
  @Column(name = "power_play_amount", length = 100)
  private java.lang.String powerPlayAmount;
  /** Description: power_play_percentage. */
  @Basic
  @Column(name = "power_play_percentage", length = 100)
  private java.lang.String powerPlayPercentage;
  /** Description: shots_penalty_shot_taken. */
  @Basic
  @Column(name = "shots_penalty_shot_taken", length = 100)
  private java.lang.String shotsPenaltyShotTaken;
  /** Description: shots_penalty_shot_missed. */
  @Basic
  @Column(name = "shots_penalty_shot_missed", length = 100)
  private java.lang.String shotsPenaltyShotMissed;
  /** Description: shots_penalty_shot_percentage. */
  @Basic
  @Column(name = "shots_penalty_shot_percentage", length = 100)
  private java.lang.String shotsPenaltyShotPercentage;
  /** Description: giveaways. */
  @Basic
  @Column(name = "giveaways", length = 100)
  private java.lang.String giveaways;
  /** Description: minutes_power_play. */
  @Basic
  @Column(name = "minutes_power_play", length = 100)
  private java.lang.String minutesPowerPlay;
  /** Description: faceoff_wins. */
  @Basic
  @Column(name = "faceoff_wins", length = 100)
  private java.lang.String faceoffWins;
  /** Description: faceoff_losses. */
  @Basic
  @Column(name = "faceoff_losses", length = 100)
  private java.lang.String faceoffLosses;
  /** Description: faceoff_win_percentage. */
  @Basic
  @Column(name = "faceoff_win_percentage", length = 100)
  private java.lang.String faceoffWinPercentage;
  /** Description: scoring_chances. */
  @Basic
  @Column(name = "scoring_chances", length = 100)
  private java.lang.String scoringChances;

  public IceHockeyOffensiveStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getGoalsGameWinning() {
    return this.goalsGameWinning;
  }

  public java.lang.String getGoalsGameTying() {
    return this.goalsGameTying;
  }

  public java.lang.String getGoalsPowerPlay() {
    return this.goalsPowerPlay;
  }

  public java.lang.String getGoalsShortHanded() {
    return this.goalsShortHanded;
  }

  public java.lang.String getGoalsEvenStrength() {
    return this.goalsEvenStrength;
  }

  public java.lang.String getGoalsEmptyNet() {
    return this.goalsEmptyNet;
  }

  public java.lang.String getGoalsOvertime() {
    return this.goalsOvertime;
  }

  public java.lang.String getGoalsShootout() {
    return this.goalsShootout;
  }

  public java.lang.String getGoalsPenaltyShot() {
    return this.goalsPenaltyShot;
  }

  public java.lang.String getAssists() {
    return this.assists;
  }

  public java.lang.String getPoints() {
    return this.points;
  }

  public java.lang.String getPowerPlayAmount() {
    return this.powerPlayAmount;
  }

  public java.lang.String getPowerPlayPercentage() {
    return this.powerPlayPercentage;
  }

  public java.lang.String getShotsPenaltyShotTaken() {
    return this.shotsPenaltyShotTaken;
  }

  public java.lang.String getShotsPenaltyShotMissed() {
    return this.shotsPenaltyShotMissed;
  }

  public java.lang.String getShotsPenaltyShotPercentage() {
    return this.shotsPenaltyShotPercentage;
  }

  public java.lang.String getGiveaways() {
    return this.giveaways;
  }

  public java.lang.String getMinutesPowerPlay() {
    return this.minutesPowerPlay;
  }

  public java.lang.String getFaceoffWins() {
    return this.faceoffWins;
  }

  public java.lang.String getFaceoffLosses() {
    return this.faceoffLosses;
  }

  public java.lang.String getFaceoffWinPercentage() {
    return this.faceoffWinPercentage;
  }

  public java.lang.String getScoringChances() {
    return this.scoringChances;
  }

  public void setGoalsGameWinning(java.lang.String goalsGameWinning) {
    this.goalsGameWinning = goalsGameWinning;
  }

  public void setGoalsGameTying(java.lang.String goalsGameTying) {
    this.goalsGameTying = goalsGameTying;
  }

  public void setGoalsPowerPlay(java.lang.String goalsPowerPlay) {
    this.goalsPowerPlay = goalsPowerPlay;
  }

  public void setGoalsShortHanded(java.lang.String goalsShortHanded) {
    this.goalsShortHanded = goalsShortHanded;
  }

  public void setGoalsEvenStrength(java.lang.String goalsEvenStrength) {
    this.goalsEvenStrength = goalsEvenStrength;
  }

  public void setGoalsEmptyNet(java.lang.String goalsEmptyNet) {
    this.goalsEmptyNet = goalsEmptyNet;
  }

  public void setGoalsOvertime(java.lang.String goalsOvertime) {
    this.goalsOvertime = goalsOvertime;
  }

  public void setGoalsShootout(java.lang.String goalsShootout) {
    this.goalsShootout = goalsShootout;
  }

  public void setGoalsPenaltyShot(java.lang.String goalsPenaltyShot) {
    this.goalsPenaltyShot = goalsPenaltyShot;
  }

  public void setAssists(java.lang.String assists) {
    this.assists = assists;
  }

  public void setPoints(java.lang.String points) {
    this.points = points;
  }

  public void setPowerPlayAmount(java.lang.String powerPlayAmount) {
    this.powerPlayAmount = powerPlayAmount;
  }

  public void setPowerPlayPercentage(java.lang.String powerPlayPercentage) {
    this.powerPlayPercentage = powerPlayPercentage;
  }

  public void setShotsPenaltyShotTaken(java.lang.String shotsPenaltyShotTaken) {
    this.shotsPenaltyShotTaken = shotsPenaltyShotTaken;
  }

  public void setShotsPenaltyShotMissed(java.lang.String shotsPenaltyShotMissed) {
    this.shotsPenaltyShotMissed = shotsPenaltyShotMissed;
  }

  public void setShotsPenaltyShotPercentage(java.lang.String shotsPenaltyShotPercentage) {
    this.shotsPenaltyShotPercentage = shotsPenaltyShotPercentage;
  }

  public void setGiveaways(java.lang.String giveaways) {
    this.giveaways = giveaways;
  }

  public void setMinutesPowerPlay(java.lang.String minutesPowerPlay) {
    this.minutesPowerPlay = minutesPowerPlay;
  }

  public void setFaceoffWins(java.lang.String faceoffWins) {
    this.faceoffWins = faceoffWins;
  }

  public void setFaceoffLosses(java.lang.String faceoffLosses) {
    this.faceoffLosses = faceoffLosses;
  }

  public void setFaceoffWinPercentage(java.lang.String faceoffWinPercentage) {
    this.faceoffWinPercentage = faceoffWinPercentage;
  }

  public void setScoringChances(java.lang.String scoringChances) {
    this.scoringChances = scoringChances;
  }
}
