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
@Table(name = "american_football_action_plays")
public class AmericanFootballActionPlays implements Serializable {
  private static final long serialVersionUID = 166867004211628435L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: american_football_event_state_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "american_football_event_state_id")
  private java.lang.Integer americanFootballEventStateId;
  /** Description: play_type. */
  @Basic
  @Column(name = "play_type", length = 100)
  private java.lang.String playType;
  /** Description: score_attempt_type. */
  @Basic
  @Column(name = "score_attempt_type", length = 100)
  private java.lang.String scoreAttemptType;
  /** Description: drive_result. */
  @Basic
  @Column(name = "drive_result", length = 100)
  private java.lang.String driveResult;
  /** Description: points. */
  @Basic
  @Column(name = "points")
  private java.lang.Integer points;
  /** Description: comment. */
  @Basic
  @Column(name = "comment", length = 255)
  private java.lang.String comment;

  public AmericanFootballActionPlays() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getAmericanFootballEventStateId() {
    return this.americanFootballEventStateId;
  }

  public java.lang.String getPlayType() {
    return this.playType;
  }

  public java.lang.String getScoreAttemptType() {
    return this.scoreAttemptType;
  }

  public java.lang.String getDriveResult() {
    return this.driveResult;
  }

  public java.lang.Integer getPoints() {
    return this.points;
  }

  public java.lang.String getComment() {
    return this.comment;
  }

  public void setAmericanFootballEventStateId(java.lang.Integer americanFootballEventStateId) {
    this.americanFootballEventStateId = americanFootballEventStateId;
  }

  public void setPlayType(java.lang.String playType) {
    this.playType = playType;
  }

  public void setScoreAttemptType(java.lang.String scoreAttemptType) {
    this.scoreAttemptType = scoreAttemptType;
  }

  public void setDriveResult(java.lang.String driveResult) {
    this.driveResult = driveResult;
  }

  public void setPoints(java.lang.Integer points) {
    this.points = points;
  }

  public void setComment(java.lang.String comment) {
    this.comment = comment;
  }
}
