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
@Table(name = "soccer_defensive_stats")
public class SoccerDefensiveStats implements Serializable {
  private static final long serialVersionUID = 166867004252215217L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: shots_penalty_shot_allowed. */
  @Basic
  @Column(name = "shots_penalty_shot_allowed", length = 100)
  private java.lang.String shotsPenaltyShotAllowed;
  /** Description: goals_penalty_shot_allowed. */
  @Basic
  @Column(name = "goals_penalty_shot_allowed", length = 100)
  private java.lang.String goalsPenaltyShotAllowed;
  /** Description: goals_against_average. */
  @Basic
  @Column(name = "goals_against_average", length = 100)
  private java.lang.String goalsAgainstAverage;
  /** Description: goals_against_total. */
  @Basic
  @Column(name = "goals_against_total", length = 100)
  private java.lang.String goalsAgainstTotal;
  /** Description: saves. */
  @Basic
  @Column(name = "saves", length = 100)
  private java.lang.String saves;
  /** Description: save_percentage. */
  @Basic
  @Column(name = "save_percentage", length = 100)
  private java.lang.String savePercentage;
  /** Description: catches_punches. */
  @Basic
  @Column(name = "catches_punches", length = 100)
  private java.lang.String catchesPunches;
  /** Description: shots_on_goal_total. */
  @Basic
  @Column(name = "shots_on_goal_total", length = 100)
  private java.lang.String shotsOnGoalTotal;
  /** Description: shots_shootout_total. */
  @Basic
  @Column(name = "shots_shootout_total", length = 100)
  private java.lang.String shotsShootoutTotal;
  /** Description: shots_shootout_allowed. */
  @Basic
  @Column(name = "shots_shootout_allowed", length = 100)
  private java.lang.String shotsShootoutAllowed;
  /** Description: shots_blocked. */
  @Basic
  @Column(name = "shots_blocked", length = 100)
  private java.lang.String shotsBlocked;
  /** Description: shutouts. */
  @Basic
  @Column(name = "shutouts", length = 100)
  private java.lang.String shutouts;

  public SoccerDefensiveStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getShotsPenaltyShotAllowed() {
    return this.shotsPenaltyShotAllowed;
  }

  public java.lang.String getGoalsPenaltyShotAllowed() {
    return this.goalsPenaltyShotAllowed;
  }

  public java.lang.String getGoalsAgainstAverage() {
    return this.goalsAgainstAverage;
  }

  public java.lang.String getGoalsAgainstTotal() {
    return this.goalsAgainstTotal;
  }

  public java.lang.String getSaves() {
    return this.saves;
  }

  public java.lang.String getSavePercentage() {
    return this.savePercentage;
  }

  public java.lang.String getCatchesPunches() {
    return this.catchesPunches;
  }

  public java.lang.String getShotsOnGoalTotal() {
    return this.shotsOnGoalTotal;
  }

  public java.lang.String getShotsShootoutTotal() {
    return this.shotsShootoutTotal;
  }

  public java.lang.String getShotsShootoutAllowed() {
    return this.shotsShootoutAllowed;
  }

  public java.lang.String getShotsBlocked() {
    return this.shotsBlocked;
  }

  public java.lang.String getShutouts() {
    return this.shutouts;
  }

  public void setShotsPenaltyShotAllowed(java.lang.String shotsPenaltyShotAllowed) {
    this.shotsPenaltyShotAllowed = shotsPenaltyShotAllowed;
  }

  public void setGoalsPenaltyShotAllowed(java.lang.String goalsPenaltyShotAllowed) {
    this.goalsPenaltyShotAllowed = goalsPenaltyShotAllowed;
  }

  public void setGoalsAgainstAverage(java.lang.String goalsAgainstAverage) {
    this.goalsAgainstAverage = goalsAgainstAverage;
  }

  public void setGoalsAgainstTotal(java.lang.String goalsAgainstTotal) {
    this.goalsAgainstTotal = goalsAgainstTotal;
  }

  public void setSaves(java.lang.String saves) {
    this.saves = saves;
  }

  public void setSavePercentage(java.lang.String savePercentage) {
    this.savePercentage = savePercentage;
  }

  public void setCatchesPunches(java.lang.String catchesPunches) {
    this.catchesPunches = catchesPunches;
  }

  public void setShotsOnGoalTotal(java.lang.String shotsOnGoalTotal) {
    this.shotsOnGoalTotal = shotsOnGoalTotal;
  }

  public void setShotsShootoutTotal(java.lang.String shotsShootoutTotal) {
    this.shotsShootoutTotal = shotsShootoutTotal;
  }

  public void setShotsShootoutAllowed(java.lang.String shotsShootoutAllowed) {
    this.shotsShootoutAllowed = shotsShootoutAllowed;
  }

  public void setShotsBlocked(java.lang.String shotsBlocked) {
    this.shotsBlocked = shotsBlocked;
  }

  public void setShutouts(java.lang.String shutouts) {
    this.shutouts = shutouts;
  }
}
