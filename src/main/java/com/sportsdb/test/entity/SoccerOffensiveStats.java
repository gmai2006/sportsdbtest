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
@Table(name = "soccer_offensive_stats")
public class SoccerOffensiveStats implements Serializable {
  private static final long serialVersionUID = 166867004253755317L;

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
  /** Description: goals_overtime. */
  @Basic
  @Column(name = "goals_overtime", length = 100)
  private java.lang.String goalsOvertime;
  /** Description: goals_shootout. */
  @Basic
  @Column(name = "goals_shootout", length = 100)
  private java.lang.String goalsShootout;
  /** Description: goals_total. */
  @Basic
  @Column(name = "goals_total", length = 100)
  private java.lang.String goalsTotal;
  /** Description: assists_game_winning. */
  @Basic
  @Column(name = "assists_game_winning", length = 100)
  private java.lang.String assistsGameWinning;
  /** Description: assists_game_tying. */
  @Basic
  @Column(name = "assists_game_tying", length = 100)
  private java.lang.String assistsGameTying;
  /** Description: assists_overtime. */
  @Basic
  @Column(name = "assists_overtime", length = 100)
  private java.lang.String assistsOvertime;
  /** Description: assists_total. */
  @Basic
  @Column(name = "assists_total", length = 100)
  private java.lang.String assistsTotal;
  /** Description: points. */
  @Basic
  @Column(name = "points", length = 100)
  private java.lang.String points;
  /** Description: shots_total. */
  @Basic
  @Column(name = "shots_total", length = 100)
  private java.lang.String shotsTotal;
  /** Description: shots_on_goal_total. */
  @Basic
  @Column(name = "shots_on_goal_total", length = 100)
  private java.lang.String shotsOnGoalTotal;
  /** Description: shots_hit_frame. */
  @Basic
  @Column(name = "shots_hit_frame", length = 100)
  private java.lang.String shotsHitFrame;
  /** Description: shots_penalty_shot_taken. */
  @Basic
  @Column(name = "shots_penalty_shot_taken", length = 100)
  private java.lang.String shotsPenaltyShotTaken;
  /** Description: shots_penalty_shot_scored. */
  @Basic
  @Column(name = "shots_penalty_shot_scored", length = 100)
  private java.lang.String shotsPenaltyShotScored;
  /** Description: shots_penalty_shot_missed. */
  @Basic
  @Column(name = "shots_penalty_shot_missed", length = 40)
  private java.lang.String shotsPenaltyShotMissed;
  /** Description: shots_penalty_shot_percentage. */
  @Basic
  @Column(name = "shots_penalty_shot_percentage", length = 40)
  private java.lang.String shotsPenaltyShotPercentage;
  /** Description: shots_shootout_taken. */
  @Basic
  @Column(name = "shots_shootout_taken", length = 40)
  private java.lang.String shotsShootoutTaken;
  /** Description: shots_shootout_scored. */
  @Basic
  @Column(name = "shots_shootout_scored", length = 40)
  private java.lang.String shotsShootoutScored;
  /** Description: shots_shootout_missed. */
  @Basic
  @Column(name = "shots_shootout_missed", length = 40)
  private java.lang.String shotsShootoutMissed;
  /** Description: shots_shootout_percentage. */
  @Basic
  @Column(name = "shots_shootout_percentage", length = 40)
  private java.lang.String shotsShootoutPercentage;
  /** Description: giveaways. */
  @Basic
  @Column(name = "giveaways", length = 40)
  private java.lang.String giveaways;
  /** Description: offsides. */
  @Basic
  @Column(name = "offsides", length = 40)
  private java.lang.String offsides;
  /** Description: corner_kicks. */
  @Basic
  @Column(name = "corner_kicks", length = 40)
  private java.lang.String cornerKicks;
  /** Description: hat_tricks. */
  @Basic
  @Column(name = "hat_tricks", length = 40)
  private java.lang.String hatTricks;

  public SoccerOffensiveStats() {}

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

  public java.lang.String getGoalsOvertime() {
    return this.goalsOvertime;
  }

  public java.lang.String getGoalsShootout() {
    return this.goalsShootout;
  }

  public java.lang.String getGoalsTotal() {
    return this.goalsTotal;
  }

  public java.lang.String getAssistsGameWinning() {
    return this.assistsGameWinning;
  }

  public java.lang.String getAssistsGameTying() {
    return this.assistsGameTying;
  }

  public java.lang.String getAssistsOvertime() {
    return this.assistsOvertime;
  }

  public java.lang.String getAssistsTotal() {
    return this.assistsTotal;
  }

  public java.lang.String getPoints() {
    return this.points;
  }

  public java.lang.String getShotsTotal() {
    return this.shotsTotal;
  }

  public java.lang.String getShotsOnGoalTotal() {
    return this.shotsOnGoalTotal;
  }

  public java.lang.String getShotsHitFrame() {
    return this.shotsHitFrame;
  }

  public java.lang.String getShotsPenaltyShotTaken() {
    return this.shotsPenaltyShotTaken;
  }

  public java.lang.String getShotsPenaltyShotScored() {
    return this.shotsPenaltyShotScored;
  }

  public java.lang.String getShotsPenaltyShotMissed() {
    return this.shotsPenaltyShotMissed;
  }

  public java.lang.String getShotsPenaltyShotPercentage() {
    return this.shotsPenaltyShotPercentage;
  }

  public java.lang.String getShotsShootoutTaken() {
    return this.shotsShootoutTaken;
  }

  public java.lang.String getShotsShootoutScored() {
    return this.shotsShootoutScored;
  }

  public java.lang.String getShotsShootoutMissed() {
    return this.shotsShootoutMissed;
  }

  public java.lang.String getShotsShootoutPercentage() {
    return this.shotsShootoutPercentage;
  }

  public java.lang.String getGiveaways() {
    return this.giveaways;
  }

  public java.lang.String getOffsides() {
    return this.offsides;
  }

  public java.lang.String getCornerKicks() {
    return this.cornerKicks;
  }

  public java.lang.String getHatTricks() {
    return this.hatTricks;
  }

  public void setGoalsGameWinning(java.lang.String goalsGameWinning) {
    this.goalsGameWinning = goalsGameWinning;
  }

  public void setGoalsGameTying(java.lang.String goalsGameTying) {
    this.goalsGameTying = goalsGameTying;
  }

  public void setGoalsOvertime(java.lang.String goalsOvertime) {
    this.goalsOvertime = goalsOvertime;
  }

  public void setGoalsShootout(java.lang.String goalsShootout) {
    this.goalsShootout = goalsShootout;
  }

  public void setGoalsTotal(java.lang.String goalsTotal) {
    this.goalsTotal = goalsTotal;
  }

  public void setAssistsGameWinning(java.lang.String assistsGameWinning) {
    this.assistsGameWinning = assistsGameWinning;
  }

  public void setAssistsGameTying(java.lang.String assistsGameTying) {
    this.assistsGameTying = assistsGameTying;
  }

  public void setAssistsOvertime(java.lang.String assistsOvertime) {
    this.assistsOvertime = assistsOvertime;
  }

  public void setAssistsTotal(java.lang.String assistsTotal) {
    this.assistsTotal = assistsTotal;
  }

  public void setPoints(java.lang.String points) {
    this.points = points;
  }

  public void setShotsTotal(java.lang.String shotsTotal) {
    this.shotsTotal = shotsTotal;
  }

  public void setShotsOnGoalTotal(java.lang.String shotsOnGoalTotal) {
    this.shotsOnGoalTotal = shotsOnGoalTotal;
  }

  public void setShotsHitFrame(java.lang.String shotsHitFrame) {
    this.shotsHitFrame = shotsHitFrame;
  }

  public void setShotsPenaltyShotTaken(java.lang.String shotsPenaltyShotTaken) {
    this.shotsPenaltyShotTaken = shotsPenaltyShotTaken;
  }

  public void setShotsPenaltyShotScored(java.lang.String shotsPenaltyShotScored) {
    this.shotsPenaltyShotScored = shotsPenaltyShotScored;
  }

  public void setShotsPenaltyShotMissed(java.lang.String shotsPenaltyShotMissed) {
    this.shotsPenaltyShotMissed = shotsPenaltyShotMissed;
  }

  public void setShotsPenaltyShotPercentage(java.lang.String shotsPenaltyShotPercentage) {
    this.shotsPenaltyShotPercentage = shotsPenaltyShotPercentage;
  }

  public void setShotsShootoutTaken(java.lang.String shotsShootoutTaken) {
    this.shotsShootoutTaken = shotsShootoutTaken;
  }

  public void setShotsShootoutScored(java.lang.String shotsShootoutScored) {
    this.shotsShootoutScored = shotsShootoutScored;
  }

  public void setShotsShootoutMissed(java.lang.String shotsShootoutMissed) {
    this.shotsShootoutMissed = shotsShootoutMissed;
  }

  public void setShotsShootoutPercentage(java.lang.String shotsShootoutPercentage) {
    this.shotsShootoutPercentage = shotsShootoutPercentage;
  }

  public void setGiveaways(java.lang.String giveaways) {
    this.giveaways = giveaways;
  }

  public void setOffsides(java.lang.String offsides) {
    this.offsides = offsides;
  }

  public void setCornerKicks(java.lang.String cornerKicks) {
    this.cornerKicks = cornerKicks;
  }

  public void setHatTricks(java.lang.String hatTricks) {
    this.hatTricks = hatTricks;
  }
}
