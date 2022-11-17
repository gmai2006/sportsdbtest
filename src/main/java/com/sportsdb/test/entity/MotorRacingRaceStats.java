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
@Table(name = "motor_racing_race_stats")
public class MotorRacingRaceStats implements Serializable {
  private static final long serialVersionUID = 16686700424445618L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: time_behind_leader. */
  @Basic
  @Column(name = "time_behind_leader", length = 100)
  private java.lang.String timeBehindLeader;
  /** Description: laps_behind_leader. */
  @Basic
  @Column(name = "laps_behind_leader", length = 100)
  private java.lang.String lapsBehindLeader;
  /** Description: time_ahead_follower. */
  @Basic
  @Column(name = "time_ahead_follower", length = 100)
  private java.lang.String timeAheadFollower;
  /** Description: laps_ahead_follower. */
  @Basic
  @Column(name = "laps_ahead_follower", length = 100)
  private java.lang.String lapsAheadFollower;
  /** Description: time. */
  @Basic
  @Column(name = "time", length = 100)
  private java.lang.String time;
  /** Description: points. */
  @Basic
  @Column(name = "points", length = 100)
  private java.lang.String points;
  /** Description: points_rookie. */
  @Basic
  @Column(name = "points_rookie", length = 100)
  private java.lang.String pointsRookie;
  /** Description: bonus. */
  @Basic
  @Column(name = "bonus", length = 100)
  private java.lang.String bonus;
  /** Description: laps_completed. */
  @Basic
  @Column(name = "laps_completed", length = 100)
  private java.lang.String lapsCompleted;
  /** Description: laps_leading_total. */
  @Basic
  @Column(name = "laps_leading_total", length = 100)
  private java.lang.String lapsLeadingTotal;
  /** Description: distance_leading. */
  @Basic
  @Column(name = "distance_leading", length = 100)
  private java.lang.String distanceLeading;
  /** Description: distance_completed. */
  @Basic
  @Column(name = "distance_completed", length = 100)
  private java.lang.String distanceCompleted;
  /** Description: distance_units. */
  @Basic
  @Column(name = "distance_units", length = 40)
  private java.lang.String distanceUnits;
  /** Description: speed_average. */
  @Basic
  @Column(name = "speed_average", length = 40)
  private java.lang.String speedAverage;
  /** Description: speed_units. */
  @Basic
  @Column(name = "speed_units", length = 40)
  private java.lang.String speedUnits;
  /** Description: status. */
  @Basic
  @Column(name = "status", length = 40)
  private java.lang.String status;
  /** Description: finishes_top_5. */
  @Basic
  @Column(name = "finishes_top_5", length = 40)
  private java.lang.String finishesTop5;
  /** Description: finishes_top_10. */
  @Basic
  @Column(name = "finishes_top_10", length = 40)
  private java.lang.String finishesTop10;
  /** Description: starts. */
  @Basic
  @Column(name = "starts", length = 40)
  private java.lang.String starts;
  /** Description: finishes. */
  @Basic
  @Column(name = "finishes", length = 40)
  private java.lang.String finishes;
  /** Description: non_finishes. */
  @Basic
  @Column(name = "non_finishes", length = 40)
  private java.lang.String nonFinishes;
  /** Description: wins. */
  @Basic
  @Column(name = "wins", length = 40)
  private java.lang.String wins;
  /** Description: races_leading. */
  @Basic
  @Column(name = "races_leading", length = 40)
  private java.lang.String racesLeading;
  /** Description: money. */
  @Basic
  @Column(name = "money", length = 40)
  private java.lang.String money;
  /** Description: money_units. */
  @Basic
  @Column(name = "money_units", length = 40)
  private java.lang.String moneyUnits;
  /** Description: leads_total. */
  @Basic
  @Column(name = "leads_total", length = 40)
  private java.lang.String leadsTotal;

  public MotorRacingRaceStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getTimeBehindLeader() {
    return this.timeBehindLeader;
  }

  public java.lang.String getLapsBehindLeader() {
    return this.lapsBehindLeader;
  }

  public java.lang.String getTimeAheadFollower() {
    return this.timeAheadFollower;
  }

  public java.lang.String getLapsAheadFollower() {
    return this.lapsAheadFollower;
  }

  public java.lang.String getTime() {
    return this.time;
  }

  public java.lang.String getPoints() {
    return this.points;
  }

  public java.lang.String getPointsRookie() {
    return this.pointsRookie;
  }

  public java.lang.String getBonus() {
    return this.bonus;
  }

  public java.lang.String getLapsCompleted() {
    return this.lapsCompleted;
  }

  public java.lang.String getLapsLeadingTotal() {
    return this.lapsLeadingTotal;
  }

  public java.lang.String getDistanceLeading() {
    return this.distanceLeading;
  }

  public java.lang.String getDistanceCompleted() {
    return this.distanceCompleted;
  }

  public java.lang.String getDistanceUnits() {
    return this.distanceUnits;
  }

  public java.lang.String getSpeedAverage() {
    return this.speedAverage;
  }

  public java.lang.String getSpeedUnits() {
    return this.speedUnits;
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public java.lang.String getFinishesTop5() {
    return this.finishesTop5;
  }

  public java.lang.String getFinishesTop10() {
    return this.finishesTop10;
  }

  public java.lang.String getStarts() {
    return this.starts;
  }

  public java.lang.String getFinishes() {
    return this.finishes;
  }

  public java.lang.String getNonFinishes() {
    return this.nonFinishes;
  }

  public java.lang.String getWins() {
    return this.wins;
  }

  public java.lang.String getRacesLeading() {
    return this.racesLeading;
  }

  public java.lang.String getMoney() {
    return this.money;
  }

  public java.lang.String getMoneyUnits() {
    return this.moneyUnits;
  }

  public java.lang.String getLeadsTotal() {
    return this.leadsTotal;
  }

  public void setTimeBehindLeader(java.lang.String timeBehindLeader) {
    this.timeBehindLeader = timeBehindLeader;
  }

  public void setLapsBehindLeader(java.lang.String lapsBehindLeader) {
    this.lapsBehindLeader = lapsBehindLeader;
  }

  public void setTimeAheadFollower(java.lang.String timeAheadFollower) {
    this.timeAheadFollower = timeAheadFollower;
  }

  public void setLapsAheadFollower(java.lang.String lapsAheadFollower) {
    this.lapsAheadFollower = lapsAheadFollower;
  }

  public void setTime(java.lang.String time) {
    this.time = time;
  }

  public void setPoints(java.lang.String points) {
    this.points = points;
  }

  public void setPointsRookie(java.lang.String pointsRookie) {
    this.pointsRookie = pointsRookie;
  }

  public void setBonus(java.lang.String bonus) {
    this.bonus = bonus;
  }

  public void setLapsCompleted(java.lang.String lapsCompleted) {
    this.lapsCompleted = lapsCompleted;
  }

  public void setLapsLeadingTotal(java.lang.String lapsLeadingTotal) {
    this.lapsLeadingTotal = lapsLeadingTotal;
  }

  public void setDistanceLeading(java.lang.String distanceLeading) {
    this.distanceLeading = distanceLeading;
  }

  public void setDistanceCompleted(java.lang.String distanceCompleted) {
    this.distanceCompleted = distanceCompleted;
  }

  public void setDistanceUnits(java.lang.String distanceUnits) {
    this.distanceUnits = distanceUnits;
  }

  public void setSpeedAverage(java.lang.String speedAverage) {
    this.speedAverage = speedAverage;
  }

  public void setSpeedUnits(java.lang.String speedUnits) {
    this.speedUnits = speedUnits;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public void setFinishesTop5(java.lang.String finishesTop5) {
    this.finishesTop5 = finishesTop5;
  }

  public void setFinishesTop10(java.lang.String finishesTop10) {
    this.finishesTop10 = finishesTop10;
  }

  public void setStarts(java.lang.String starts) {
    this.starts = starts;
  }

  public void setFinishes(java.lang.String finishes) {
    this.finishes = finishes;
  }

  public void setNonFinishes(java.lang.String nonFinishes) {
    this.nonFinishes = nonFinishes;
  }

  public void setWins(java.lang.String wins) {
    this.wins = wins;
  }

  public void setRacesLeading(java.lang.String racesLeading) {
    this.racesLeading = racesLeading;
  }

  public void setMoney(java.lang.String money) {
    this.money = money;
  }

  public void setMoneyUnits(java.lang.String moneyUnits) {
    this.moneyUnits = moneyUnits;
  }

  public void setLeadsTotal(java.lang.String leadsTotal) {
    this.leadsTotal = leadsTotal;
  }
}
