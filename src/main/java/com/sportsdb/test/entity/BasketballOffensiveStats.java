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
@Table(name = "basketball_offensive_stats")
public class BasketballOffensiveStats implements Serializable {
  private static final long serialVersionUID = 166867004226838800L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: field_goals_made. */
  @Basic
  @Column(name = "field_goals_made")
  private java.lang.Integer fieldGoalsMade;
  /** Description: field_goals_attempted. */
  @Basic
  @Column(name = "field_goals_attempted")
  private java.lang.Integer fieldGoalsAttempted;
  /** Description: field_goals_percentage. */
  @Basic
  @Column(name = "field_goals_percentage", length = 100)
  private java.lang.String fieldGoalsPercentage;
  /** Description: field_goals_per_game. */
  @Basic
  @Column(name = "field_goals_per_game", length = 100)
  private java.lang.String fieldGoalsPerGame;
  /** Description: field_goals_attempted_per_game. */
  @Basic
  @Column(name = "field_goals_attempted_per_game", length = 100)
  private java.lang.String fieldGoalsAttemptedPerGame;
  /** Description: field_goals_percentage_adjusted. */
  @Basic
  @Column(name = "field_goals_percentage_adjusted", length = 100)
  private java.lang.String fieldGoalsPercentageAdjusted;
  /** Description: three_pointers_made. */
  @Basic
  @Column(name = "three_pointers_made")
  private java.lang.Integer threePointersMade;
  /** Description: three_pointers_attempted. */
  @Basic
  @Column(name = "three_pointers_attempted")
  private java.lang.Integer threePointersAttempted;
  /** Description: three_pointers_percentage. */
  @Basic
  @Column(name = "three_pointers_percentage", length = 100)
  private java.lang.String threePointersPercentage;
  /** Description: three_pointers_per_game. */
  @Basic
  @Column(name = "three_pointers_per_game", length = 100)
  private java.lang.String threePointersPerGame;
  /** Description: three_pointers_attempted_per_game. */
  @Basic
  @Column(name = "three_pointers_attempted_per_game", length = 100)
  private java.lang.String threePointersAttemptedPerGame;
  /** Description: free_throws_made. */
  @Basic
  @Column(name = "free_throws_made", length = 100)
  private java.lang.String freeThrowsMade;
  /** Description: free_throws_attempted. */
  @Basic
  @Column(name = "free_throws_attempted", length = 100)
  private java.lang.String freeThrowsAttempted;
  /** Description: free_throws_percentage. */
  @Basic
  @Column(name = "free_throws_percentage", length = 100)
  private java.lang.String freeThrowsPercentage;
  /** Description: free_throws_per_game. */
  @Basic
  @Column(name = "free_throws_per_game", length = 100)
  private java.lang.String freeThrowsPerGame;
  /** Description: free_throws_attempted_per_game. */
  @Basic
  @Column(name = "free_throws_attempted_per_game", length = 100)
  private java.lang.String freeThrowsAttemptedPerGame;
  /** Description: points_scored_total. */
  @Basic
  @Column(name = "points_scored_total", length = 100)
  private java.lang.String pointsScoredTotal;
  /** Description: points_scored_per_game. */
  @Basic
  @Column(name = "points_scored_per_game", length = 100)
  private java.lang.String pointsScoredPerGame;
  /** Description: assists_total. */
  @Basic
  @Column(name = "assists_total", length = 100)
  private java.lang.String assistsTotal;
  /** Description: assists_per_game. */
  @Basic
  @Column(name = "assists_per_game", length = 100)
  private java.lang.String assistsPerGame;
  /** Description: turnovers_total. */
  @Basic
  @Column(name = "turnovers_total", length = 100)
  private java.lang.String turnoversTotal;
  /** Description: turnovers_per_game. */
  @Basic
  @Column(name = "turnovers_per_game", length = 100)
  private java.lang.String turnoversPerGame;
  /** Description: points_scored_off_turnovers. */
  @Basic
  @Column(name = "points_scored_off_turnovers", length = 100)
  private java.lang.String pointsScoredOffTurnovers;
  /** Description: points_scored_in_paint. */
  @Basic
  @Column(name = "points_scored_in_paint", length = 100)
  private java.lang.String pointsScoredInPaint;
  /** Description: points_scored_on_second_chance. */
  @Basic
  @Column(name = "points_scored_on_second_chance", length = 100)
  private java.lang.String pointsScoredOnSecondChance;
  /** Description: points_scored_on_fast_break. */
  @Basic
  @Column(name = "points_scored_on_fast_break", length = 100)
  private java.lang.String pointsScoredOnFastBreak;

  public BasketballOffensiveStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getFieldGoalsMade() {
    return this.fieldGoalsMade;
  }

  public java.lang.Integer getFieldGoalsAttempted() {
    return this.fieldGoalsAttempted;
  }

  public java.lang.String getFieldGoalsPercentage() {
    return this.fieldGoalsPercentage;
  }

  public java.lang.String getFieldGoalsPerGame() {
    return this.fieldGoalsPerGame;
  }

  public java.lang.String getFieldGoalsAttemptedPerGame() {
    return this.fieldGoalsAttemptedPerGame;
  }

  public java.lang.String getFieldGoalsPercentageAdjusted() {
    return this.fieldGoalsPercentageAdjusted;
  }

  public java.lang.Integer getThreePointersMade() {
    return this.threePointersMade;
  }

  public java.lang.Integer getThreePointersAttempted() {
    return this.threePointersAttempted;
  }

  public java.lang.String getThreePointersPercentage() {
    return this.threePointersPercentage;
  }

  public java.lang.String getThreePointersPerGame() {
    return this.threePointersPerGame;
  }

  public java.lang.String getThreePointersAttemptedPerGame() {
    return this.threePointersAttemptedPerGame;
  }

  public java.lang.String getFreeThrowsMade() {
    return this.freeThrowsMade;
  }

  public java.lang.String getFreeThrowsAttempted() {
    return this.freeThrowsAttempted;
  }

  public java.lang.String getFreeThrowsPercentage() {
    return this.freeThrowsPercentage;
  }

  public java.lang.String getFreeThrowsPerGame() {
    return this.freeThrowsPerGame;
  }

  public java.lang.String getFreeThrowsAttemptedPerGame() {
    return this.freeThrowsAttemptedPerGame;
  }

  public java.lang.String getPointsScoredTotal() {
    return this.pointsScoredTotal;
  }

  public java.lang.String getPointsScoredPerGame() {
    return this.pointsScoredPerGame;
  }

  public java.lang.String getAssistsTotal() {
    return this.assistsTotal;
  }

  public java.lang.String getAssistsPerGame() {
    return this.assistsPerGame;
  }

  public java.lang.String getTurnoversTotal() {
    return this.turnoversTotal;
  }

  public java.lang.String getTurnoversPerGame() {
    return this.turnoversPerGame;
  }

  public java.lang.String getPointsScoredOffTurnovers() {
    return this.pointsScoredOffTurnovers;
  }

  public java.lang.String getPointsScoredInPaint() {
    return this.pointsScoredInPaint;
  }

  public java.lang.String getPointsScoredOnSecondChance() {
    return this.pointsScoredOnSecondChance;
  }

  public java.lang.String getPointsScoredOnFastBreak() {
    return this.pointsScoredOnFastBreak;
  }

  public void setFieldGoalsMade(java.lang.Integer fieldGoalsMade) {
    this.fieldGoalsMade = fieldGoalsMade;
  }

  public void setFieldGoalsAttempted(java.lang.Integer fieldGoalsAttempted) {
    this.fieldGoalsAttempted = fieldGoalsAttempted;
  }

  public void setFieldGoalsPercentage(java.lang.String fieldGoalsPercentage) {
    this.fieldGoalsPercentage = fieldGoalsPercentage;
  }

  public void setFieldGoalsPerGame(java.lang.String fieldGoalsPerGame) {
    this.fieldGoalsPerGame = fieldGoalsPerGame;
  }

  public void setFieldGoalsAttemptedPerGame(java.lang.String fieldGoalsAttemptedPerGame) {
    this.fieldGoalsAttemptedPerGame = fieldGoalsAttemptedPerGame;
  }

  public void setFieldGoalsPercentageAdjusted(java.lang.String fieldGoalsPercentageAdjusted) {
    this.fieldGoalsPercentageAdjusted = fieldGoalsPercentageAdjusted;
  }

  public void setThreePointersMade(java.lang.Integer threePointersMade) {
    this.threePointersMade = threePointersMade;
  }

  public void setThreePointersAttempted(java.lang.Integer threePointersAttempted) {
    this.threePointersAttempted = threePointersAttempted;
  }

  public void setThreePointersPercentage(java.lang.String threePointersPercentage) {
    this.threePointersPercentage = threePointersPercentage;
  }

  public void setThreePointersPerGame(java.lang.String threePointersPerGame) {
    this.threePointersPerGame = threePointersPerGame;
  }

  public void setThreePointersAttemptedPerGame(java.lang.String threePointersAttemptedPerGame) {
    this.threePointersAttemptedPerGame = threePointersAttemptedPerGame;
  }

  public void setFreeThrowsMade(java.lang.String freeThrowsMade) {
    this.freeThrowsMade = freeThrowsMade;
  }

  public void setFreeThrowsAttempted(java.lang.String freeThrowsAttempted) {
    this.freeThrowsAttempted = freeThrowsAttempted;
  }

  public void setFreeThrowsPercentage(java.lang.String freeThrowsPercentage) {
    this.freeThrowsPercentage = freeThrowsPercentage;
  }

  public void setFreeThrowsPerGame(java.lang.String freeThrowsPerGame) {
    this.freeThrowsPerGame = freeThrowsPerGame;
  }

  public void setFreeThrowsAttemptedPerGame(java.lang.String freeThrowsAttemptedPerGame) {
    this.freeThrowsAttemptedPerGame = freeThrowsAttemptedPerGame;
  }

  public void setPointsScoredTotal(java.lang.String pointsScoredTotal) {
    this.pointsScoredTotal = pointsScoredTotal;
  }

  public void setPointsScoredPerGame(java.lang.String pointsScoredPerGame) {
    this.pointsScoredPerGame = pointsScoredPerGame;
  }

  public void setAssistsTotal(java.lang.String assistsTotal) {
    this.assistsTotal = assistsTotal;
  }

  public void setAssistsPerGame(java.lang.String assistsPerGame) {
    this.assistsPerGame = assistsPerGame;
  }

  public void setTurnoversTotal(java.lang.String turnoversTotal) {
    this.turnoversTotal = turnoversTotal;
  }

  public void setTurnoversPerGame(java.lang.String turnoversPerGame) {
    this.turnoversPerGame = turnoversPerGame;
  }

  public void setPointsScoredOffTurnovers(java.lang.String pointsScoredOffTurnovers) {
    this.pointsScoredOffTurnovers = pointsScoredOffTurnovers;
  }

  public void setPointsScoredInPaint(java.lang.String pointsScoredInPaint) {
    this.pointsScoredInPaint = pointsScoredInPaint;
  }

  public void setPointsScoredOnSecondChance(java.lang.String pointsScoredOnSecondChance) {
    this.pointsScoredOnSecondChance = pointsScoredOnSecondChance;
  }

  public void setPointsScoredOnFastBreak(java.lang.String pointsScoredOnFastBreak) {
    this.pointsScoredOnFastBreak = pointsScoredOnFastBreak;
  }
}
