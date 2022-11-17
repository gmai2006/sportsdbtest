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
@Table(name = "american_football_passing_stats")
public class AmericanFootballPassingStats implements Serializable {
  private static final long serialVersionUID = 166867004215131392L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: passes_attempts. */
  @Basic
  @Column(name = "passes_attempts", length = 100)
  private java.lang.String passesAttempts;
  /** Description: passes_completions. */
  @Basic
  @Column(name = "passes_completions", length = 100)
  private java.lang.String passesCompletions;
  /** Description: passes_percentage. */
  @Basic
  @Column(name = "passes_percentage", length = 100)
  private java.lang.String passesPercentage;
  /** Description: passes_yards_gross. */
  @Basic
  @Column(name = "passes_yards_gross", length = 100)
  private java.lang.String passesYardsGross;
  /** Description: passes_yards_net. */
  @Basic
  @Column(name = "passes_yards_net", length = 100)
  private java.lang.String passesYardsNet;
  /** Description: passes_yards_lost. */
  @Basic
  @Column(name = "passes_yards_lost", length = 100)
  private java.lang.String passesYardsLost;
  /** Description: passes_touchdowns. */
  @Basic
  @Column(name = "passes_touchdowns", length = 100)
  private java.lang.String passesTouchdowns;
  /** Description: passes_touchdowns_percentage. */
  @Basic
  @Column(name = "passes_touchdowns_percentage", length = 100)
  private java.lang.String passesTouchdownsPercentage;
  /** Description: passes_interceptions. */
  @Basic
  @Column(name = "passes_interceptions", length = 100)
  private java.lang.String passesInterceptions;
  /** Description: passes_interceptions_percentage. */
  @Basic
  @Column(name = "passes_interceptions_percentage", length = 100)
  private java.lang.String passesInterceptionsPercentage;
  /** Description: passes_longest. */
  @Basic
  @Column(name = "passes_longest", length = 100)
  private java.lang.String passesLongest;
  /** Description: passes_average_yards_per. */
  @Basic
  @Column(name = "passes_average_yards_per", length = 100)
  private java.lang.String passesAverageYardsPer;
  /** Description: passer_rating. */
  @Basic
  @Column(name = "passer_rating", length = 100)
  private java.lang.String passerRating;
  /** Description: receptions_total. */
  @Basic
  @Column(name = "receptions_total", length = 100)
  private java.lang.String receptionsTotal;
  /** Description: receptions_yards. */
  @Basic
  @Column(name = "receptions_yards", length = 100)
  private java.lang.String receptionsYards;
  /** Description: receptions_touchdowns. */
  @Basic
  @Column(name = "receptions_touchdowns", length = 100)
  private java.lang.String receptionsTouchdowns;
  /** Description: receptions_first_down. */
  @Basic
  @Column(name = "receptions_first_down", length = 100)
  private java.lang.String receptionsFirstDown;
  /** Description: receptions_longest. */
  @Basic
  @Column(name = "receptions_longest", length = 100)
  private java.lang.String receptionsLongest;
  /** Description: receptions_average_yards_per. */
  @Basic
  @Column(name = "receptions_average_yards_per", length = 100)
  private java.lang.String receptionsAverageYardsPer;

  public AmericanFootballPassingStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getPassesAttempts() {
    return this.passesAttempts;
  }

  public java.lang.String getPassesCompletions() {
    return this.passesCompletions;
  }

  public java.lang.String getPassesPercentage() {
    return this.passesPercentage;
  }

  public java.lang.String getPassesYardsGross() {
    return this.passesYardsGross;
  }

  public java.lang.String getPassesYardsNet() {
    return this.passesYardsNet;
  }

  public java.lang.String getPassesYardsLost() {
    return this.passesYardsLost;
  }

  public java.lang.String getPassesTouchdowns() {
    return this.passesTouchdowns;
  }

  public java.lang.String getPassesTouchdownsPercentage() {
    return this.passesTouchdownsPercentage;
  }

  public java.lang.String getPassesInterceptions() {
    return this.passesInterceptions;
  }

  public java.lang.String getPassesInterceptionsPercentage() {
    return this.passesInterceptionsPercentage;
  }

  public java.lang.String getPassesLongest() {
    return this.passesLongest;
  }

  public java.lang.String getPassesAverageYardsPer() {
    return this.passesAverageYardsPer;
  }

  public java.lang.String getPasserRating() {
    return this.passerRating;
  }

  public java.lang.String getReceptionsTotal() {
    return this.receptionsTotal;
  }

  public java.lang.String getReceptionsYards() {
    return this.receptionsYards;
  }

  public java.lang.String getReceptionsTouchdowns() {
    return this.receptionsTouchdowns;
  }

  public java.lang.String getReceptionsFirstDown() {
    return this.receptionsFirstDown;
  }

  public java.lang.String getReceptionsLongest() {
    return this.receptionsLongest;
  }

  public java.lang.String getReceptionsAverageYardsPer() {
    return this.receptionsAverageYardsPer;
  }

  public void setPassesAttempts(java.lang.String passesAttempts) {
    this.passesAttempts = passesAttempts;
  }

  public void setPassesCompletions(java.lang.String passesCompletions) {
    this.passesCompletions = passesCompletions;
  }

  public void setPassesPercentage(java.lang.String passesPercentage) {
    this.passesPercentage = passesPercentage;
  }

  public void setPassesYardsGross(java.lang.String passesYardsGross) {
    this.passesYardsGross = passesYardsGross;
  }

  public void setPassesYardsNet(java.lang.String passesYardsNet) {
    this.passesYardsNet = passesYardsNet;
  }

  public void setPassesYardsLost(java.lang.String passesYardsLost) {
    this.passesYardsLost = passesYardsLost;
  }

  public void setPassesTouchdowns(java.lang.String passesTouchdowns) {
    this.passesTouchdowns = passesTouchdowns;
  }

  public void setPassesTouchdownsPercentage(java.lang.String passesTouchdownsPercentage) {
    this.passesTouchdownsPercentage = passesTouchdownsPercentage;
  }

  public void setPassesInterceptions(java.lang.String passesInterceptions) {
    this.passesInterceptions = passesInterceptions;
  }

  public void setPassesInterceptionsPercentage(java.lang.String passesInterceptionsPercentage) {
    this.passesInterceptionsPercentage = passesInterceptionsPercentage;
  }

  public void setPassesLongest(java.lang.String passesLongest) {
    this.passesLongest = passesLongest;
  }

  public void setPassesAverageYardsPer(java.lang.String passesAverageYardsPer) {
    this.passesAverageYardsPer = passesAverageYardsPer;
  }

  public void setPasserRating(java.lang.String passerRating) {
    this.passerRating = passerRating;
  }

  public void setReceptionsTotal(java.lang.String receptionsTotal) {
    this.receptionsTotal = receptionsTotal;
  }

  public void setReceptionsYards(java.lang.String receptionsYards) {
    this.receptionsYards = receptionsYards;
  }

  public void setReceptionsTouchdowns(java.lang.String receptionsTouchdowns) {
    this.receptionsTouchdowns = receptionsTouchdowns;
  }

  public void setReceptionsFirstDown(java.lang.String receptionsFirstDown) {
    this.receptionsFirstDown = receptionsFirstDown;
  }

  public void setReceptionsLongest(java.lang.String receptionsLongest) {
    this.receptionsLongest = receptionsLongest;
  }

  public void setReceptionsAverageYardsPer(java.lang.String receptionsAverageYardsPer) {
    this.receptionsAverageYardsPer = receptionsAverageYardsPer;
  }
}
