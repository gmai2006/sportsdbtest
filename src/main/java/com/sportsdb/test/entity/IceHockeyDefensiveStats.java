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
@Table(name = "ice_hockey_defensive_stats")
public class IceHockeyDefensiveStats implements Serializable {
  private static final long serialVersionUID = 166867004237343939L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: shots_power_play_allowed. */
  @Basic
  @Column(name = "shots_power_play_allowed", length = 100)
  private java.lang.String shotsPowerPlayAllowed;
  /** Description: shots_penalty_shot_allowed. */
  @Basic
  @Column(name = "shots_penalty_shot_allowed", length = 100)
  private java.lang.String shotsPenaltyShotAllowed;
  /** Description: goals_power_play_allowed. */
  @Basic
  @Column(name = "goals_power_play_allowed", length = 100)
  private java.lang.String goalsPowerPlayAllowed;
  /** Description: goals_penalty_shot_allowed. */
  @Basic
  @Column(name = "goals_penalty_shot_allowed", length = 100)
  private java.lang.String goalsPenaltyShotAllowed;
  /** Description: goals_against_average. */
  @Basic
  @Column(name = "goals_against_average", length = 100)
  private java.lang.String goalsAgainstAverage;
  /** Description: saves. */
  @Basic
  @Column(name = "saves", length = 100)
  private java.lang.String saves;
  /** Description: save_percentage. */
  @Basic
  @Column(name = "save_percentage", length = 100)
  private java.lang.String savePercentage;
  /** Description: penalty_killing_amount. */
  @Basic
  @Column(name = "penalty_killing_amount", length = 100)
  private java.lang.String penaltyKillingAmount;
  /** Description: penalty_killing_percentage. */
  @Basic
  @Column(name = "penalty_killing_percentage", length = 100)
  private java.lang.String penaltyKillingPercentage;
  /** Description: shots_blocked. */
  @Basic
  @Column(name = "shots_blocked", length = 100)
  private java.lang.String shotsBlocked;
  /** Description: takeaways. */
  @Basic
  @Column(name = "takeaways", length = 100)
  private java.lang.String takeaways;
  /** Description: shutouts. */
  @Basic
  @Column(name = "shutouts", length = 100)
  private java.lang.String shutouts;
  /** Description: minutes_penalty_killing. */
  @Basic
  @Column(name = "minutes_penalty_killing", length = 100)
  private java.lang.String minutesPenaltyKilling;
  /** Description: hits. */
  @Basic
  @Column(name = "hits", length = 100)
  private java.lang.String hits;
  /** Description: goals_empty_net_allowed. */
  @Basic
  @Column(name = "goals_empty_net_allowed", length = 100)
  private java.lang.String goalsEmptyNetAllowed;
  /** Description: goals_short_handed_allowed. */
  @Basic
  @Column(name = "goals_short_handed_allowed", length = 100)
  private java.lang.String goalsShortHandedAllowed;
  /** Description: goals_shootout_allowed. */
  @Basic
  @Column(name = "goals_shootout_allowed", length = 100)
  private java.lang.String goalsShootoutAllowed;
  /** Description: shots_shootout_allowed. */
  @Basic
  @Column(name = "shots_shootout_allowed", length = 100)
  private java.lang.String shotsShootoutAllowed;

  public IceHockeyDefensiveStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getShotsPowerPlayAllowed() {
    return this.shotsPowerPlayAllowed;
  }

  public java.lang.String getShotsPenaltyShotAllowed() {
    return this.shotsPenaltyShotAllowed;
  }

  public java.lang.String getGoalsPowerPlayAllowed() {
    return this.goalsPowerPlayAllowed;
  }

  public java.lang.String getGoalsPenaltyShotAllowed() {
    return this.goalsPenaltyShotAllowed;
  }

  public java.lang.String getGoalsAgainstAverage() {
    return this.goalsAgainstAverage;
  }

  public java.lang.String getSaves() {
    return this.saves;
  }

  public java.lang.String getSavePercentage() {
    return this.savePercentage;
  }

  public java.lang.String getPenaltyKillingAmount() {
    return this.penaltyKillingAmount;
  }

  public java.lang.String getPenaltyKillingPercentage() {
    return this.penaltyKillingPercentage;
  }

  public java.lang.String getShotsBlocked() {
    return this.shotsBlocked;
  }

  public java.lang.String getTakeaways() {
    return this.takeaways;
  }

  public java.lang.String getShutouts() {
    return this.shutouts;
  }

  public java.lang.String getMinutesPenaltyKilling() {
    return this.minutesPenaltyKilling;
  }

  public java.lang.String getHits() {
    return this.hits;
  }

  public java.lang.String getGoalsEmptyNetAllowed() {
    return this.goalsEmptyNetAllowed;
  }

  public java.lang.String getGoalsShortHandedAllowed() {
    return this.goalsShortHandedAllowed;
  }

  public java.lang.String getGoalsShootoutAllowed() {
    return this.goalsShootoutAllowed;
  }

  public java.lang.String getShotsShootoutAllowed() {
    return this.shotsShootoutAllowed;
  }

  public void setShotsPowerPlayAllowed(java.lang.String shotsPowerPlayAllowed) {
    this.shotsPowerPlayAllowed = shotsPowerPlayAllowed;
  }

  public void setShotsPenaltyShotAllowed(java.lang.String shotsPenaltyShotAllowed) {
    this.shotsPenaltyShotAllowed = shotsPenaltyShotAllowed;
  }

  public void setGoalsPowerPlayAllowed(java.lang.String goalsPowerPlayAllowed) {
    this.goalsPowerPlayAllowed = goalsPowerPlayAllowed;
  }

  public void setGoalsPenaltyShotAllowed(java.lang.String goalsPenaltyShotAllowed) {
    this.goalsPenaltyShotAllowed = goalsPenaltyShotAllowed;
  }

  public void setGoalsAgainstAverage(java.lang.String goalsAgainstAverage) {
    this.goalsAgainstAverage = goalsAgainstAverage;
  }

  public void setSaves(java.lang.String saves) {
    this.saves = saves;
  }

  public void setSavePercentage(java.lang.String savePercentage) {
    this.savePercentage = savePercentage;
  }

  public void setPenaltyKillingAmount(java.lang.String penaltyKillingAmount) {
    this.penaltyKillingAmount = penaltyKillingAmount;
  }

  public void setPenaltyKillingPercentage(java.lang.String penaltyKillingPercentage) {
    this.penaltyKillingPercentage = penaltyKillingPercentage;
  }

  public void setShotsBlocked(java.lang.String shotsBlocked) {
    this.shotsBlocked = shotsBlocked;
  }

  public void setTakeaways(java.lang.String takeaways) {
    this.takeaways = takeaways;
  }

  public void setShutouts(java.lang.String shutouts) {
    this.shutouts = shutouts;
  }

  public void setMinutesPenaltyKilling(java.lang.String minutesPenaltyKilling) {
    this.minutesPenaltyKilling = minutesPenaltyKilling;
  }

  public void setHits(java.lang.String hits) {
    this.hits = hits;
  }

  public void setGoalsEmptyNetAllowed(java.lang.String goalsEmptyNetAllowed) {
    this.goalsEmptyNetAllowed = goalsEmptyNetAllowed;
  }

  public void setGoalsShortHandedAllowed(java.lang.String goalsShortHandedAllowed) {
    this.goalsShortHandedAllowed = goalsShortHandedAllowed;
  }

  public void setGoalsShootoutAllowed(java.lang.String goalsShootoutAllowed) {
    this.goalsShootoutAllowed = goalsShootoutAllowed;
  }

  public void setShotsShootoutAllowed(java.lang.String shotsShootoutAllowed) {
    this.shotsShootoutAllowed = shotsShootoutAllowed;
  }
}
