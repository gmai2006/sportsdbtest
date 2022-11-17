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
@Table(name = "baseball_action_plays")
public class BaseballActionPlays implements Serializable {
  private static final long serialVersionUID = 166867004220314160L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: baseball_event_state_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "baseball_event_state_id")
  private java.lang.Integer baseballEventStateId;
  /** Description: play_type. */
  @Basic
  @Column(name = "play_type", length = 100)
  private java.lang.String playType;
  /** Description: notation. */
  @Basic
  @Column(name = "notation", length = 100)
  private java.lang.String notation;
  /** Description: notation_yaml. */
  @Basic
  @Column(name = "notation_yaml", length = 0)
  private java.lang.String notationYaml;
  /** Description: baseball_defensive_group_id. */
  @Basic
  @Column(name = "baseball_defensive_group_id")
  private java.lang.Integer baseballDefensiveGroupId;
  /** Description: comment. */
  @Basic
  @Column(name = "comment", length = 255)
  private java.lang.String comment;
  /** Description: runner_on_first_advance. */
  @Basic
  @Column(name = "runner_on_first_advance")
  private java.lang.Integer runnerOnFirstAdvance;
  /** Description: runner_on_second_advance. */
  @Basic
  @Column(name = "runner_on_second_advance")
  private java.lang.Integer runnerOnSecondAdvance;
  /** Description: runner_on_third_advance. */
  @Basic
  @Column(name = "runner_on_third_advance")
  private java.lang.Integer runnerOnThirdAdvance;
  /** Description: outs_recorded. */
  @Basic
  @Column(name = "outs_recorded")
  private java.lang.Integer outsRecorded;
  /** Description: rbi. */
  @Basic
  @Column(name = "rbi")
  private java.lang.Integer rbi;
  /** Description: runs_scored. */
  @Basic
  @Column(name = "runs_scored")
  private java.lang.Integer runsScored;
  /** Description: earned_runs_scored. */
  @Basic
  @Column(name = "earned_runs_scored", length = 100)
  private java.lang.String earnedRunsScored;

  public BaseballActionPlays() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getBaseballEventStateId() {
    return this.baseballEventStateId;
  }

  public java.lang.String getPlayType() {
    return this.playType;
  }

  public java.lang.String getNotation() {
    return this.notation;
  }

  public java.lang.String getNotationYaml() {
    return this.notationYaml;
  }

  public java.lang.Integer getBaseballDefensiveGroupId() {
    return this.baseballDefensiveGroupId;
  }

  public java.lang.String getComment() {
    return this.comment;
  }

  public java.lang.Integer getRunnerOnFirstAdvance() {
    return this.runnerOnFirstAdvance;
  }

  public java.lang.Integer getRunnerOnSecondAdvance() {
    return this.runnerOnSecondAdvance;
  }

  public java.lang.Integer getRunnerOnThirdAdvance() {
    return this.runnerOnThirdAdvance;
  }

  public java.lang.Integer getOutsRecorded() {
    return this.outsRecorded;
  }

  public java.lang.Integer getRbi() {
    return this.rbi;
  }

  public java.lang.Integer getRunsScored() {
    return this.runsScored;
  }

  public java.lang.String getEarnedRunsScored() {
    return this.earnedRunsScored;
  }

  public void setBaseballEventStateId(java.lang.Integer baseballEventStateId) {
    this.baseballEventStateId = baseballEventStateId;
  }

  public void setPlayType(java.lang.String playType) {
    this.playType = playType;
  }

  public void setNotation(java.lang.String notation) {
    this.notation = notation;
  }

  public void setNotationYaml(java.lang.String notationYaml) {
    this.notationYaml = notationYaml;
  }

  public void setBaseballDefensiveGroupId(java.lang.Integer baseballDefensiveGroupId) {
    this.baseballDefensiveGroupId = baseballDefensiveGroupId;
  }

  public void setComment(java.lang.String comment) {
    this.comment = comment;
  }

  public void setRunnerOnFirstAdvance(java.lang.Integer runnerOnFirstAdvance) {
    this.runnerOnFirstAdvance = runnerOnFirstAdvance;
  }

  public void setRunnerOnSecondAdvance(java.lang.Integer runnerOnSecondAdvance) {
    this.runnerOnSecondAdvance = runnerOnSecondAdvance;
  }

  public void setRunnerOnThirdAdvance(java.lang.Integer runnerOnThirdAdvance) {
    this.runnerOnThirdAdvance = runnerOnThirdAdvance;
  }

  public void setOutsRecorded(java.lang.Integer outsRecorded) {
    this.outsRecorded = outsRecorded;
  }

  public void setRbi(java.lang.Integer rbi) {
    this.rbi = rbi;
  }

  public void setRunsScored(java.lang.Integer runsScored) {
    this.runsScored = runsScored;
  }

  public void setEarnedRunsScored(java.lang.String earnedRunsScored) {
    this.earnedRunsScored = earnedRunsScored;
  }
}
