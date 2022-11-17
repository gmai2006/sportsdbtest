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
@Table(name = "participants_events")
public class ParticipantsEvents implements Serializable {
  private static final long serialVersionUID = 166867004247164069L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: participant_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "participant_type", length = 100)
  private java.lang.String participantType;
  /** Description: participant_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "participant_id")
  private java.lang.Integer participantId;
  /** Description: event_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "event_id")
  private java.lang.Integer eventId;
  /** Description: alignment. */
  @Basic
  @Column(name = "alignment", length = 100)
  private java.lang.String alignment;
  /** Description: score. */
  @Basic
  @Column(name = "score", length = 100)
  private java.lang.String score;
  /** Description: event_outcome. */
  @Basic
  @Column(name = "event_outcome", length = 100)
  private java.lang.String eventOutcome;
  /** Description: rank. */
  @Basic
  @Column(name = "rank")
  private java.lang.Integer rank;

  public ParticipantsEvents() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getParticipantType() {
    return this.participantType;
  }

  public java.lang.Integer getParticipantId() {
    return this.participantId;
  }

  public java.lang.Integer getEventId() {
    return this.eventId;
  }

  public java.lang.String getAlignment() {
    return this.alignment;
  }

  public java.lang.String getScore() {
    return this.score;
  }

  public java.lang.String getEventOutcome() {
    return this.eventOutcome;
  }

  public java.lang.Integer getRank() {
    return this.rank;
  }

  public void setParticipantType(java.lang.String participantType) {
    this.participantType = participantType;
  }

  public void setParticipantId(java.lang.Integer participantId) {
    this.participantId = participantId;
  }

  public void setEventId(java.lang.Integer eventId) {
    this.eventId = eventId;
  }

  public void setAlignment(java.lang.String alignment) {
    this.alignment = alignment;
  }

  public void setScore(java.lang.String score) {
    this.score = score;
  }

  public void setEventOutcome(java.lang.String eventOutcome) {
    this.eventOutcome = eventOutcome;
  }

  public void setRank(java.lang.Integer rank) {
    this.rank = rank;
  }
}
