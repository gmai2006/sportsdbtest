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
@Table(name = "team_american_football_stats")
public class TeamAmericanFootballStats implements Serializable {
  private static final long serialVersionUID = 166867004256745827L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: yards_per_attempt. */
  @Basic
  @Column(name = "yards_per_attempt", length = 100)
  private java.lang.String yardsPerAttempt;
  /** Description: average_starting_position. */
  @Basic
  @Column(name = "average_starting_position", length = 100)
  private java.lang.String averageStartingPosition;
  /** Description: timeouts. */
  @Basic
  @Column(name = "timeouts", length = 100)
  private java.lang.String timeouts;
  /** Description: time_of_possession. */
  @Basic
  @Column(name = "time_of_possession", length = 100)
  private java.lang.String timeOfPossession;
  /** Description: turnover_ratio. */
  @Basic
  @Column(name = "turnover_ratio", length = 100)
  private java.lang.String turnoverRatio;

  public TeamAmericanFootballStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getYardsPerAttempt() {
    return this.yardsPerAttempt;
  }

  public java.lang.String getAverageStartingPosition() {
    return this.averageStartingPosition;
  }

  public java.lang.String getTimeouts() {
    return this.timeouts;
  }

  public java.lang.String getTimeOfPossession() {
    return this.timeOfPossession;
  }

  public java.lang.String getTurnoverRatio() {
    return this.turnoverRatio;
  }

  public void setYardsPerAttempt(java.lang.String yardsPerAttempt) {
    this.yardsPerAttempt = yardsPerAttempt;
  }

  public void setAverageStartingPosition(java.lang.String averageStartingPosition) {
    this.averageStartingPosition = averageStartingPosition;
  }

  public void setTimeouts(java.lang.String timeouts) {
    this.timeouts = timeouts;
  }

  public void setTimeOfPossession(java.lang.String timeOfPossession) {
    this.timeOfPossession = timeOfPossession;
  }

  public void setTurnoverRatio(java.lang.String turnoverRatio) {
    this.turnoverRatio = turnoverRatio;
  }
}
