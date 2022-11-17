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
@Table(name = "american_football_offensive_stats")
public class AmericanFootballOffensiveStats implements Serializable {
  private static final long serialVersionUID = 166867004214733111L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: offensive_plays_yards. */
  @Basic
  @Column(name = "offensive_plays_yards", length = 100)
  private java.lang.String offensivePlaysYards;
  /** Description: offensive_plays_number. */
  @Basic
  @Column(name = "offensive_plays_number", length = 100)
  private java.lang.String offensivePlaysNumber;
  /** Description: offensive_plays_average_yards_per. */
  @Basic
  @Column(name = "offensive_plays_average_yards_per", length = 100)
  private java.lang.String offensivePlaysAverageYardsPer;
  /** Description: possession_duration. */
  @Basic
  @Column(name = "possession_duration", length = 100)
  private java.lang.String possessionDuration;
  /** Description: turnovers_giveaway. */
  @Basic
  @Column(name = "turnovers_giveaway", length = 100)
  private java.lang.String turnoversGiveaway;

  public AmericanFootballOffensiveStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getOffensivePlaysYards() {
    return this.offensivePlaysYards;
  }

  public java.lang.String getOffensivePlaysNumber() {
    return this.offensivePlaysNumber;
  }

  public java.lang.String getOffensivePlaysAverageYardsPer() {
    return this.offensivePlaysAverageYardsPer;
  }

  public java.lang.String getPossessionDuration() {
    return this.possessionDuration;
  }

  public java.lang.String getTurnoversGiveaway() {
    return this.turnoversGiveaway;
  }

  public void setOffensivePlaysYards(java.lang.String offensivePlaysYards) {
    this.offensivePlaysYards = offensivePlaysYards;
  }

  public void setOffensivePlaysNumber(java.lang.String offensivePlaysNumber) {
    this.offensivePlaysNumber = offensivePlaysNumber;
  }

  public void setOffensivePlaysAverageYardsPer(java.lang.String offensivePlaysAverageYardsPer) {
    this.offensivePlaysAverageYardsPer = offensivePlaysAverageYardsPer;
  }

  public void setPossessionDuration(java.lang.String possessionDuration) {
    this.possessionDuration = possessionDuration;
  }

  public void setTurnoversGiveaway(java.lang.String turnoversGiveaway) {
    this.turnoversGiveaway = turnoversGiveaway;
  }
}
