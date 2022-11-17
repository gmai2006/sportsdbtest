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
@Table(name = "tennis_service_stats")
public class TennisServiceStats implements Serializable {
  private static final long serialVersionUID = 166867004260447691L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: services_played. */
  @Basic
  @Column(name = "services_played", length = 100)
  private java.lang.String servicesPlayed;
  /** Description: matches_played. */
  @Basic
  @Column(name = "matches_played", length = 100)
  private java.lang.String matchesPlayed;
  /** Description: aces. */
  @Basic
  @Column(name = "aces", length = 100)
  private java.lang.String aces;
  /** Description: first_services_good. */
  @Basic
  @Column(name = "first_services_good", length = 100)
  private java.lang.String firstServicesGood;
  /** Description: first_services_good_pct. */
  @Basic
  @Column(name = "first_services_good_pct", length = 100)
  private java.lang.String firstServicesGoodPct;
  /** Description: first_service_points_won. */
  @Basic
  @Column(name = "first_service_points_won", length = 100)
  private java.lang.String firstServicePointsWon;
  /** Description: first_service_points_won_pct. */
  @Basic
  @Column(name = "first_service_points_won_pct", length = 100)
  private java.lang.String firstServicePointsWonPct;
  /** Description: second_service_points_won. */
  @Basic
  @Column(name = "second_service_points_won", length = 100)
  private java.lang.String secondServicePointsWon;
  /** Description: second_service_points_won_pct. */
  @Basic
  @Column(name = "second_service_points_won_pct", length = 100)
  private java.lang.String secondServicePointsWonPct;
  /** Description: service_games_played. */
  @Basic
  @Column(name = "service_games_played", length = 100)
  private java.lang.String serviceGamesPlayed;
  /** Description: service_games_won. */
  @Basic
  @Column(name = "service_games_won", length = 100)
  private java.lang.String serviceGamesWon;
  /** Description: service_games_won_pct. */
  @Basic
  @Column(name = "service_games_won_pct", length = 100)
  private java.lang.String serviceGamesWonPct;
  /** Description: break_points_played. */
  @Basic
  @Column(name = "break_points_played", length = 100)
  private java.lang.String breakPointsPlayed;
  /** Description: break_points_saved. */
  @Basic
  @Column(name = "break_points_saved", length = 100)
  private java.lang.String breakPointsSaved;
  /** Description: break_points_saved_pct. */
  @Basic
  @Column(name = "break_points_saved_pct", length = 100)
  private java.lang.String breakPointsSavedPct;

  public TennisServiceStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getServicesPlayed() {
    return this.servicesPlayed;
  }

  public java.lang.String getMatchesPlayed() {
    return this.matchesPlayed;
  }

  public java.lang.String getAces() {
    return this.aces;
  }

  public java.lang.String getFirstServicesGood() {
    return this.firstServicesGood;
  }

  public java.lang.String getFirstServicesGoodPct() {
    return this.firstServicesGoodPct;
  }

  public java.lang.String getFirstServicePointsWon() {
    return this.firstServicePointsWon;
  }

  public java.lang.String getFirstServicePointsWonPct() {
    return this.firstServicePointsWonPct;
  }

  public java.lang.String getSecondServicePointsWon() {
    return this.secondServicePointsWon;
  }

  public java.lang.String getSecondServicePointsWonPct() {
    return this.secondServicePointsWonPct;
  }

  public java.lang.String getServiceGamesPlayed() {
    return this.serviceGamesPlayed;
  }

  public java.lang.String getServiceGamesWon() {
    return this.serviceGamesWon;
  }

  public java.lang.String getServiceGamesWonPct() {
    return this.serviceGamesWonPct;
  }

  public java.lang.String getBreakPointsPlayed() {
    return this.breakPointsPlayed;
  }

  public java.lang.String getBreakPointsSaved() {
    return this.breakPointsSaved;
  }

  public java.lang.String getBreakPointsSavedPct() {
    return this.breakPointsSavedPct;
  }

  public void setServicesPlayed(java.lang.String servicesPlayed) {
    this.servicesPlayed = servicesPlayed;
  }

  public void setMatchesPlayed(java.lang.String matchesPlayed) {
    this.matchesPlayed = matchesPlayed;
  }

  public void setAces(java.lang.String aces) {
    this.aces = aces;
  }

  public void setFirstServicesGood(java.lang.String firstServicesGood) {
    this.firstServicesGood = firstServicesGood;
  }

  public void setFirstServicesGoodPct(java.lang.String firstServicesGoodPct) {
    this.firstServicesGoodPct = firstServicesGoodPct;
  }

  public void setFirstServicePointsWon(java.lang.String firstServicePointsWon) {
    this.firstServicePointsWon = firstServicePointsWon;
  }

  public void setFirstServicePointsWonPct(java.lang.String firstServicePointsWonPct) {
    this.firstServicePointsWonPct = firstServicePointsWonPct;
  }

  public void setSecondServicePointsWon(java.lang.String secondServicePointsWon) {
    this.secondServicePointsWon = secondServicePointsWon;
  }

  public void setSecondServicePointsWonPct(java.lang.String secondServicePointsWonPct) {
    this.secondServicePointsWonPct = secondServicePointsWonPct;
  }

  public void setServiceGamesPlayed(java.lang.String serviceGamesPlayed) {
    this.serviceGamesPlayed = serviceGamesPlayed;
  }

  public void setServiceGamesWon(java.lang.String serviceGamesWon) {
    this.serviceGamesWon = serviceGamesWon;
  }

  public void setServiceGamesWonPct(java.lang.String serviceGamesWonPct) {
    this.serviceGamesWonPct = serviceGamesWonPct;
  }

  public void setBreakPointsPlayed(java.lang.String breakPointsPlayed) {
    this.breakPointsPlayed = breakPointsPlayed;
  }

  public void setBreakPointsSaved(java.lang.String breakPointsSaved) {
    this.breakPointsSaved = breakPointsSaved;
  }

  public void setBreakPointsSavedPct(java.lang.String breakPointsSavedPct) {
    this.breakPointsSavedPct = breakPointsSavedPct;
  }
}
