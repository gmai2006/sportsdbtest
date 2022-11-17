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
@Table(name = "american_football_event_states")
public class AmericanFootballEventStates implements Serializable {
  private static final long serialVersionUID = 166867004213311411L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: event_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "event_id")
  private java.lang.Integer eventId;
  /** Description: current_state. */
  @Basic
  @Column(name = "current_state")
  private java.lang.Integer currentState;
  /** Description: sequence_number. */
  @Basic
  @Column(name = "sequence_number")
  private java.lang.Integer sequenceNumber;
  /** Description: period_value. */
  @Basic
  @Column(name = "period_value")
  private java.lang.Integer periodValue;
  /** Description: period_time_elapsed. */
  @Basic
  @Column(name = "period_time_elapsed", length = 100)
  private java.lang.String periodTimeElapsed;
  /** Description: period_time_remaining. */
  @Basic
  @Column(name = "period_time_remaining", length = 100)
  private java.lang.String periodTimeRemaining;
  /** Description: clock_state. */
  @Basic
  @Column(name = "clock_state", length = 100)
  private java.lang.String clockState;
  /** Description: down. */
  @Basic
  @Column(name = "down")
  private java.lang.Integer down;
  /** Description: team_in_possession_id. */
  @Basic
  @Column(name = "team_in_possession_id")
  private java.lang.Integer teamInPossessionId;
  /** Description: distance_for_1st_down. */
  @Basic
  @Column(name = "distance_for_1st_down")
  private java.lang.Integer distanceFor1stDown;
  /** Description: field_side. */
  @Basic
  @Column(name = "field_side", length = 100)
  private java.lang.String fieldSide;
  /** Description: field_line. */
  @Basic
  @Column(name = "field_line")
  private java.lang.Integer fieldLine;
  /** Description: context. */
  @Basic
  @Column(name = "context", length = 40)
  private java.lang.String context;

  public AmericanFootballEventStates() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getEventId() {
    return this.eventId;
  }

  public java.lang.Integer getCurrentState() {
    return this.currentState;
  }

  public java.lang.Integer getSequenceNumber() {
    return this.sequenceNumber;
  }

  public java.lang.Integer getPeriodValue() {
    return this.periodValue;
  }

  public java.lang.String getPeriodTimeElapsed() {
    return this.periodTimeElapsed;
  }

  public java.lang.String getPeriodTimeRemaining() {
    return this.periodTimeRemaining;
  }

  public java.lang.String getClockState() {
    return this.clockState;
  }

  public java.lang.Integer getDown() {
    return this.down;
  }

  public java.lang.Integer getTeamInPossessionId() {
    return this.teamInPossessionId;
  }

  public java.lang.Integer getDistanceFor1stDown() {
    return this.distanceFor1stDown;
  }

  public java.lang.String getFieldSide() {
    return this.fieldSide;
  }

  public java.lang.Integer getFieldLine() {
    return this.fieldLine;
  }

  public java.lang.String getContext() {
    return this.context;
  }

  public void setEventId(java.lang.Integer eventId) {
    this.eventId = eventId;
  }

  public void setCurrentState(java.lang.Integer currentState) {
    this.currentState = currentState;
  }

  public void setSequenceNumber(java.lang.Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public void setPeriodValue(java.lang.Integer periodValue) {
    this.periodValue = periodValue;
  }

  public void setPeriodTimeElapsed(java.lang.String periodTimeElapsed) {
    this.periodTimeElapsed = periodTimeElapsed;
  }

  public void setPeriodTimeRemaining(java.lang.String periodTimeRemaining) {
    this.periodTimeRemaining = periodTimeRemaining;
  }

  public void setClockState(java.lang.String clockState) {
    this.clockState = clockState;
  }

  public void setDown(java.lang.Integer down) {
    this.down = down;
  }

  public void setTeamInPossessionId(java.lang.Integer teamInPossessionId) {
    this.teamInPossessionId = teamInPossessionId;
  }

  public void setDistanceFor1stDown(java.lang.Integer distanceFor1stDown) {
    this.distanceFor1stDown = distanceFor1stDown;
  }

  public void setFieldSide(java.lang.String fieldSide) {
    this.fieldSide = fieldSide;
  }

  public void setFieldLine(java.lang.Integer fieldLine) {
    this.fieldLine = fieldLine;
  }

  public void setContext(java.lang.String context) {
    this.context = context;
  }
}
