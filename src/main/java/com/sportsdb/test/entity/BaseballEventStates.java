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
@Table(name = "baseball_event_states")
public class BaseballEventStates implements Serializable {
  private static final long serialVersionUID = 166867004222899612L;

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
  /** Description: at_bat_number. */
  @Basic
  @Column(name = "at_bat_number")
  private java.lang.Integer atBatNumber;
  /** Description: inning_value. */
  @Basic
  @Column(name = "inning_value")
  private java.lang.Integer inningValue;
  /** Description: inning_half. */
  @Basic
  @Column(name = "inning_half", length = 100)
  private java.lang.String inningHalf;
  /** Description: outs. */
  @Basic
  @Column(name = "outs")
  private java.lang.Integer outs;
  /** Description: balls. */
  @Basic
  @Column(name = "balls")
  private java.lang.Integer balls;
  /** Description: strikes. */
  @Basic
  @Column(name = "strikes")
  private java.lang.Integer strikes;
  /** Description: runner_on_first_id. */
  @Basic
  @Column(name = "runner_on_first_id")
  private java.lang.Integer runnerOnFirstId;
  /** Description: runner_on_second_id. */
  @Basic
  @Column(name = "runner_on_second_id")
  private java.lang.Integer runnerOnSecondId;
  /** Description: runner_on_third_id. */
  @Basic
  @Column(name = "runner_on_third_id")
  private java.lang.Integer runnerOnThirdId;
  /** Description: runner_on_first. */
  @Basic
  @Column(name = "runner_on_first")
  private java.lang.Integer runnerOnFirst;
  /** Description: runner_on_second. */
  @Basic
  @Column(name = "runner_on_second")
  private java.lang.Integer runnerOnSecond;
  /** Description: runner_on_third. */
  @Basic
  @Column(name = "runner_on_third")
  private java.lang.Integer runnerOnThird;
  /** Description: runs_this_inning_half. */
  @Basic
  @Column(name = "runs_this_inning_half")
  private java.lang.Integer runsThisInningHalf;
  /** Description: pitcher_id. */
  @Basic
  @Column(name = "pitcher_id")
  private java.lang.Integer pitcherId;
  /** Description: batter_id. */
  @Basic
  @Column(name = "batter_id")
  private java.lang.Integer batterId;
  /** Description: batter_side. */
  @Basic
  @Column(name = "batter_side", length = 100)
  private java.lang.String batterSide;
  /** Description: context. */
  @Basic
  @Column(name = "context", length = 40)
  private java.lang.String context;

  public BaseballEventStates() {}

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

  public java.lang.Integer getAtBatNumber() {
    return this.atBatNumber;
  }

  public java.lang.Integer getInningValue() {
    return this.inningValue;
  }

  public java.lang.String getInningHalf() {
    return this.inningHalf;
  }

  public java.lang.Integer getOuts() {
    return this.outs;
  }

  public java.lang.Integer getBalls() {
    return this.balls;
  }

  public java.lang.Integer getStrikes() {
    return this.strikes;
  }

  public java.lang.Integer getRunnerOnFirstId() {
    return this.runnerOnFirstId;
  }

  public java.lang.Integer getRunnerOnSecondId() {
    return this.runnerOnSecondId;
  }

  public java.lang.Integer getRunnerOnThirdId() {
    return this.runnerOnThirdId;
  }

  public java.lang.Integer getRunnerOnFirst() {
    return this.runnerOnFirst;
  }

  public java.lang.Integer getRunnerOnSecond() {
    return this.runnerOnSecond;
  }

  public java.lang.Integer getRunnerOnThird() {
    return this.runnerOnThird;
  }

  public java.lang.Integer getRunsThisInningHalf() {
    return this.runsThisInningHalf;
  }

  public java.lang.Integer getPitcherId() {
    return this.pitcherId;
  }

  public java.lang.Integer getBatterId() {
    return this.batterId;
  }

  public java.lang.String getBatterSide() {
    return this.batterSide;
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

  public void setAtBatNumber(java.lang.Integer atBatNumber) {
    this.atBatNumber = atBatNumber;
  }

  public void setInningValue(java.lang.Integer inningValue) {
    this.inningValue = inningValue;
  }

  public void setInningHalf(java.lang.String inningHalf) {
    this.inningHalf = inningHalf;
  }

  public void setOuts(java.lang.Integer outs) {
    this.outs = outs;
  }

  public void setBalls(java.lang.Integer balls) {
    this.balls = balls;
  }

  public void setStrikes(java.lang.Integer strikes) {
    this.strikes = strikes;
  }

  public void setRunnerOnFirstId(java.lang.Integer runnerOnFirstId) {
    this.runnerOnFirstId = runnerOnFirstId;
  }

  public void setRunnerOnSecondId(java.lang.Integer runnerOnSecondId) {
    this.runnerOnSecondId = runnerOnSecondId;
  }

  public void setRunnerOnThirdId(java.lang.Integer runnerOnThirdId) {
    this.runnerOnThirdId = runnerOnThirdId;
  }

  public void setRunnerOnFirst(java.lang.Integer runnerOnFirst) {
    this.runnerOnFirst = runnerOnFirst;
  }

  public void setRunnerOnSecond(java.lang.Integer runnerOnSecond) {
    this.runnerOnSecond = runnerOnSecond;
  }

  public void setRunnerOnThird(java.lang.Integer runnerOnThird) {
    this.runnerOnThird = runnerOnThird;
  }

  public void setRunsThisInningHalf(java.lang.Integer runsThisInningHalf) {
    this.runsThisInningHalf = runsThisInningHalf;
  }

  public void setPitcherId(java.lang.Integer pitcherId) {
    this.pitcherId = pitcherId;
  }

  public void setBatterId(java.lang.Integer batterId) {
    this.batterId = batterId;
  }

  public void setBatterSide(java.lang.String batterSide) {
    this.batterSide = batterSide;
  }

  public void setContext(java.lang.String context) {
    this.context = context;
  }
}
