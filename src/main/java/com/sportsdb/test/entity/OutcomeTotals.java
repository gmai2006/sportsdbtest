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
@Table(name = "outcome_totals")
public class OutcomeTotals implements Serializable {
  private static final long serialVersionUID = 166867004246321082L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: standing_subgroup_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "standing_subgroup_id")
  private java.lang.Integer standingSubgroupId;
  /** Description: outcome_holder_type. */
  @Basic
  @Column(name = "outcome_holder_type", length = 100)
  private java.lang.String outcomeHolderType;
  /** Description: outcome_holder_id. */
  @Basic
  @Column(name = "outcome_holder_id")
  private java.lang.Integer outcomeHolderId;
  /** Description: rank. */
  @Basic
  @Column(name = "rank", length = 100)
  private java.lang.String rank;
  /** Description: wins. */
  @Basic
  @Column(name = "wins", length = 100)
  private java.lang.String wins;
  /** Description: losses. */
  @Basic
  @Column(name = "losses", length = 100)
  private java.lang.String losses;
  /** Description: ties. */
  @Basic
  @Column(name = "ties", length = 100)
  private java.lang.String ties;
  /** Description: undecideds. */
  @Basic
  @Column(name = "undecideds", length = 100)
  private java.lang.String undecideds;
  /** Description: winning_percentage. */
  @Basic
  @Column(name = "winning_percentage", length = 100)
  private java.lang.String winningPercentage;
  /** Description: points_scored_for. */
  @Basic
  @Column(name = "points_scored_for", length = 100)
  private java.lang.String pointsScoredFor;
  /** Description: points_scored_against. */
  @Basic
  @Column(name = "points_scored_against", length = 100)
  private java.lang.String pointsScoredAgainst;
  /** Description: points_difference. */
  @Basic
  @Column(name = "points_difference", length = 100)
  private java.lang.String pointsDifference;
  /** Description: standing_points. */
  @Basic
  @Column(name = "standing_points", length = 100)
  private java.lang.String standingPoints;
  /** Description: streak_type. */
  @Basic
  @Column(name = "streak_type", length = 100)
  private java.lang.String streakType;
  /** Description: streak_duration. */
  @Basic
  @Column(name = "streak_duration", length = 100)
  private java.lang.String streakDuration;
  /** Description: streak_total. */
  @Basic
  @Column(name = "streak_total", length = 100)
  private java.lang.String streakTotal;
  /** Description: streak_start. */
  @Basic
  @Column(name = "streak_start")
  private java.util.Date streakStart;
  /** Description: streak_end. */
  @Basic
  @Column(name = "streak_end")
  private java.util.Date streakEnd;

  public OutcomeTotals() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getStandingSubgroupId() {
    return this.standingSubgroupId;
  }

  public java.lang.String getOutcomeHolderType() {
    return this.outcomeHolderType;
  }

  public java.lang.Integer getOutcomeHolderId() {
    return this.outcomeHolderId;
  }

  public java.lang.String getRank() {
    return this.rank;
  }

  public java.lang.String getWins() {
    return this.wins;
  }

  public java.lang.String getLosses() {
    return this.losses;
  }

  public java.lang.String getTies() {
    return this.ties;
  }

  public java.lang.String getUndecideds() {
    return this.undecideds;
  }

  public java.lang.String getWinningPercentage() {
    return this.winningPercentage;
  }

  public java.lang.String getPointsScoredFor() {
    return this.pointsScoredFor;
  }

  public java.lang.String getPointsScoredAgainst() {
    return this.pointsScoredAgainst;
  }

  public java.lang.String getPointsDifference() {
    return this.pointsDifference;
  }

  public java.lang.String getStandingPoints() {
    return this.standingPoints;
  }

  public java.lang.String getStreakType() {
    return this.streakType;
  }

  public java.lang.String getStreakDuration() {
    return this.streakDuration;
  }

  public java.lang.String getStreakTotal() {
    return this.streakTotal;
  }

  public java.util.Date getStreakStart() {
    return this.streakStart;
  }

  public java.util.Date getStreakEnd() {
    return this.streakEnd;
  }

  public void setStandingSubgroupId(java.lang.Integer standingSubgroupId) {
    this.standingSubgroupId = standingSubgroupId;
  }

  public void setOutcomeHolderType(java.lang.String outcomeHolderType) {
    this.outcomeHolderType = outcomeHolderType;
  }

  public void setOutcomeHolderId(java.lang.Integer outcomeHolderId) {
    this.outcomeHolderId = outcomeHolderId;
  }

  public void setRank(java.lang.String rank) {
    this.rank = rank;
  }

  public void setWins(java.lang.String wins) {
    this.wins = wins;
  }

  public void setLosses(java.lang.String losses) {
    this.losses = losses;
  }

  public void setTies(java.lang.String ties) {
    this.ties = ties;
  }

  public void setUndecideds(java.lang.String undecideds) {
    this.undecideds = undecideds;
  }

  public void setWinningPercentage(java.lang.String winningPercentage) {
    this.winningPercentage = winningPercentage;
  }

  public void setPointsScoredFor(java.lang.String pointsScoredFor) {
    this.pointsScoredFor = pointsScoredFor;
  }

  public void setPointsScoredAgainst(java.lang.String pointsScoredAgainst) {
    this.pointsScoredAgainst = pointsScoredAgainst;
  }

  public void setPointsDifference(java.lang.String pointsDifference) {
    this.pointsDifference = pointsDifference;
  }

  public void setStandingPoints(java.lang.String standingPoints) {
    this.standingPoints = standingPoints;
  }

  public void setStreakType(java.lang.String streakType) {
    this.streakType = streakType;
  }

  public void setStreakDuration(java.lang.String streakDuration) {
    this.streakDuration = streakDuration;
  }

  public void setStreakTotal(java.lang.String streakTotal) {
    this.streakTotal = streakTotal;
  }

  public void setStreakStart(java.util.Date streakStart) {
    this.streakStart = streakStart;
  }

  public void setStreakEnd(java.util.Date streakEnd) {
    this.streakEnd = streakEnd;
  }
}
