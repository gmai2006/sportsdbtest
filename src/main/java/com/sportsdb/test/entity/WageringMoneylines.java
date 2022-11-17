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
@Table(name = "wagering_moneylines")
public class WageringMoneylines implements Serializable {
  private static final long serialVersionUID = 166867004261039694L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: bookmaker_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "bookmaker_id")
  private java.lang.Integer bookmakerId;
  /** Description: event_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "event_id")
  private java.lang.Integer eventId;
  /** Description: date_time. */
  @Basic
  @Column(name = "date_time")
  private java.util.Date dateTime;
  /** Description: team_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "team_id")
  private java.lang.Integer teamId;
  /** Description: person_id. */
  @Basic
  @Column(name = "person_id")
  private java.lang.Integer personId;
  /** Description: rotation_key. */
  @Basic
  @Column(name = "rotation_key", length = 100)
  private java.lang.String rotationKey;
  /** Description: comment. */
  @Basic
  @Column(name = "comment", length = 100)
  private java.lang.String comment;
  /** Description: vigorish. */
  @Basic
  @Column(name = "vigorish", length = 100)
  private java.lang.String vigorish;
  /** Description: line. */
  @Basic
  @Column(name = "line", length = 100)
  private java.lang.String line;
  /** Description: line_opening. */
  @Basic
  @Column(name = "line_opening", length = 100)
  private java.lang.String lineOpening;
  /** Description: prediction. */
  @Basic
  @Column(name = "prediction", length = 100)
  private java.lang.String prediction;

  public WageringMoneylines() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getBookmakerId() {
    return this.bookmakerId;
  }

  public java.lang.Integer getEventId() {
    return this.eventId;
  }

  public java.util.Date getDateTime() {
    return this.dateTime;
  }

  public java.lang.Integer getTeamId() {
    return this.teamId;
  }

  public java.lang.Integer getPersonId() {
    return this.personId;
  }

  public java.lang.String getRotationKey() {
    return this.rotationKey;
  }

  public java.lang.String getComment() {
    return this.comment;
  }

  public java.lang.String getVigorish() {
    return this.vigorish;
  }

  public java.lang.String getLine() {
    return this.line;
  }

  public java.lang.String getLineOpening() {
    return this.lineOpening;
  }

  public java.lang.String getPrediction() {
    return this.prediction;
  }

  public void setBookmakerId(java.lang.Integer bookmakerId) {
    this.bookmakerId = bookmakerId;
  }

  public void setEventId(java.lang.Integer eventId) {
    this.eventId = eventId;
  }

  public void setDateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
  }

  public void setTeamId(java.lang.Integer teamId) {
    this.teamId = teamId;
  }

  public void setPersonId(java.lang.Integer personId) {
    this.personId = personId;
  }

  public void setRotationKey(java.lang.String rotationKey) {
    this.rotationKey = rotationKey;
  }

  public void setComment(java.lang.String comment) {
    this.comment = comment;
  }

  public void setVigorish(java.lang.String vigorish) {
    this.vigorish = vigorish;
  }

  public void setLine(java.lang.String line) {
    this.line = line;
  }

  public void setLineOpening(java.lang.String lineOpening) {
    this.lineOpening = lineOpening;
  }

  public void setPrediction(java.lang.String prediction) {
    this.prediction = prediction;
  }
}
