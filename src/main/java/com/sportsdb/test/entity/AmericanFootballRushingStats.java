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
@Table(name = "american_football_rushing_stats")
public class AmericanFootballRushingStats implements Serializable {
  private static final long serialVersionUID = 166867004216387709L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: rushes_attempts. */
  @Basic
  @Column(name = "rushes_attempts", length = 100)
  private java.lang.String rushesAttempts;
  /** Description: rushes_yards. */
  @Basic
  @Column(name = "rushes_yards", length = 100)
  private java.lang.String rushesYards;
  /** Description: rushes_touchdowns. */
  @Basic
  @Column(name = "rushes_touchdowns", length = 100)
  private java.lang.String rushesTouchdowns;
  /** Description: rushing_average_yards_per. */
  @Basic
  @Column(name = "rushing_average_yards_per", length = 100)
  private java.lang.String rushingAverageYardsPer;
  /** Description: rushes_first_down. */
  @Basic
  @Column(name = "rushes_first_down", length = 100)
  private java.lang.String rushesFirstDown;
  /** Description: rushes_longest. */
  @Basic
  @Column(name = "rushes_longest", length = 100)
  private java.lang.String rushesLongest;

  public AmericanFootballRushingStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getRushesAttempts() {
    return this.rushesAttempts;
  }

  public java.lang.String getRushesYards() {
    return this.rushesYards;
  }

  public java.lang.String getRushesTouchdowns() {
    return this.rushesTouchdowns;
  }

  public java.lang.String getRushingAverageYardsPer() {
    return this.rushingAverageYardsPer;
  }

  public java.lang.String getRushesFirstDown() {
    return this.rushesFirstDown;
  }

  public java.lang.String getRushesLongest() {
    return this.rushesLongest;
  }

  public void setRushesAttempts(java.lang.String rushesAttempts) {
    this.rushesAttempts = rushesAttempts;
  }

  public void setRushesYards(java.lang.String rushesYards) {
    this.rushesYards = rushesYards;
  }

  public void setRushesTouchdowns(java.lang.String rushesTouchdowns) {
    this.rushesTouchdowns = rushesTouchdowns;
  }

  public void setRushingAverageYardsPer(java.lang.String rushingAverageYardsPer) {
    this.rushingAverageYardsPer = rushingAverageYardsPer;
  }

  public void setRushesFirstDown(java.lang.String rushesFirstDown) {
    this.rushesFirstDown = rushesFirstDown;
  }

  public void setRushesLongest(java.lang.String rushesLongest) {
    this.rushesLongest = rushesLongest;
  }
}
