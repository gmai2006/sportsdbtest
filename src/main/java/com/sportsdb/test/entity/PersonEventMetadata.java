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
@Table(name = "person_event_metadata")
public class PersonEventMetadata implements Serializable {
  private static final long serialVersionUID = 166867004248060944L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: person_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "person_id")
  private java.lang.Integer personId;
  /** Description: event_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "event_id")
  private java.lang.Integer eventId;
  /** Description: status. */
  @Basic
  @Column(name = "status", length = 100)
  private java.lang.String status;
  /** Description: health. */
  @Basic
  @Column(name = "health", length = 100)
  private java.lang.String health;
  /** Description: weight. */
  @Basic
  @Column(name = "weight", length = 100)
  private java.lang.String weight;
  /** Description: role_id. */
  @Basic
  @Column(name = "role_id")
  private java.lang.Integer roleId;
  /** Description: position_id. */
  @Basic
  @Column(name = "position_id")
  private java.lang.Integer positionId;
  /** Description: team_id. */
  @Basic
  @Column(name = "team_id")
  private java.lang.Integer teamId;
  /** Description: lineup_slot. */
  @Basic
  @Column(name = "lineup_slot")
  private java.lang.Integer lineupSlot;
  /** Description: lineup_slot_sequence. */
  @Basic
  @Column(name = "lineup_slot_sequence")
  private java.lang.Integer lineupSlotSequence;

  public PersonEventMetadata() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getPersonId() {
    return this.personId;
  }

  public java.lang.Integer getEventId() {
    return this.eventId;
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public java.lang.String getHealth() {
    return this.health;
  }

  public java.lang.String getWeight() {
    return this.weight;
  }

  public java.lang.Integer getRoleId() {
    return this.roleId;
  }

  public java.lang.Integer getPositionId() {
    return this.positionId;
  }

  public java.lang.Integer getTeamId() {
    return this.teamId;
  }

  public java.lang.Integer getLineupSlot() {
    return this.lineupSlot;
  }

  public java.lang.Integer getLineupSlotSequence() {
    return this.lineupSlotSequence;
  }

  public void setPersonId(java.lang.Integer personId) {
    this.personId = personId;
  }

  public void setEventId(java.lang.Integer eventId) {
    this.eventId = eventId;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public void setHealth(java.lang.String health) {
    this.health = health;
  }

  public void setWeight(java.lang.String weight) {
    this.weight = weight;
  }

  public void setRoleId(java.lang.Integer roleId) {
    this.roleId = roleId;
  }

  public void setPositionId(java.lang.Integer positionId) {
    this.positionId = positionId;
  }

  public void setTeamId(java.lang.Integer teamId) {
    this.teamId = teamId;
  }

  public void setLineupSlot(java.lang.Integer lineupSlot) {
    this.lineupSlot = lineupSlot;
  }

  public void setLineupSlotSequence(java.lang.Integer lineupSlotSequence) {
    this.lineupSlotSequence = lineupSlotSequence;
  }
}
