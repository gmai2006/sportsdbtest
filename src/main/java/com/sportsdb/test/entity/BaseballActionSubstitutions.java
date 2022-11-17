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
@Table(name = "baseball_action_substitutions")
public class BaseballActionSubstitutions implements Serializable {
  private static final long serialVersionUID = 1668670042210648L;

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
  /** Description: sequence_number. */
  @Basic
  @Column(name = "sequence_number")
  private java.lang.Integer sequenceNumber;
  /** Description: person_type. */
  @Basic
  @Column(name = "person_type", length = 100)
  private java.lang.String personType;
  /** Description: person_original_id. */
  @Basic
  @Column(name = "person_original_id")
  private java.lang.Integer personOriginalId;
  /** Description: person_original_position_id. */
  @Basic
  @Column(name = "person_original_position_id")
  private java.lang.Integer personOriginalPositionId;
  /** Description: person_original_lineup_slot. */
  @Basic
  @Column(name = "person_original_lineup_slot")
  private java.lang.Integer personOriginalLineupSlot;
  /** Description: person_replacing_id. */
  @Basic
  @Column(name = "person_replacing_id")
  private java.lang.Integer personReplacingId;
  /** Description: person_replacing_position_id. */
  @Basic
  @Column(name = "person_replacing_position_id")
  private java.lang.Integer personReplacingPositionId;
  /** Description: person_replacing_lineup_slot. */
  @Basic
  @Column(name = "person_replacing_lineup_slot")
  private java.lang.Integer personReplacingLineupSlot;
  /** Description: substitution_reason. */
  @Basic
  @Column(name = "substitution_reason", length = 100)
  private java.lang.String substitutionReason;
  /** Description: comment. */
  @Basic
  @Column(name = "comment", length = 100)
  private java.lang.String comment;

  public BaseballActionSubstitutions() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getBaseballEventStateId() {
    return this.baseballEventStateId;
  }

  public java.lang.Integer getSequenceNumber() {
    return this.sequenceNumber;
  }

  public java.lang.String getPersonType() {
    return this.personType;
  }

  public java.lang.Integer getPersonOriginalId() {
    return this.personOriginalId;
  }

  public java.lang.Integer getPersonOriginalPositionId() {
    return this.personOriginalPositionId;
  }

  public java.lang.Integer getPersonOriginalLineupSlot() {
    return this.personOriginalLineupSlot;
  }

  public java.lang.Integer getPersonReplacingId() {
    return this.personReplacingId;
  }

  public java.lang.Integer getPersonReplacingPositionId() {
    return this.personReplacingPositionId;
  }

  public java.lang.Integer getPersonReplacingLineupSlot() {
    return this.personReplacingLineupSlot;
  }

  public java.lang.String getSubstitutionReason() {
    return this.substitutionReason;
  }

  public java.lang.String getComment() {
    return this.comment;
  }

  public void setBaseballEventStateId(java.lang.Integer baseballEventStateId) {
    this.baseballEventStateId = baseballEventStateId;
  }

  public void setSequenceNumber(java.lang.Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public void setPersonType(java.lang.String personType) {
    this.personType = personType;
  }

  public void setPersonOriginalId(java.lang.Integer personOriginalId) {
    this.personOriginalId = personOriginalId;
  }

  public void setPersonOriginalPositionId(java.lang.Integer personOriginalPositionId) {
    this.personOriginalPositionId = personOriginalPositionId;
  }

  public void setPersonOriginalLineupSlot(java.lang.Integer personOriginalLineupSlot) {
    this.personOriginalLineupSlot = personOriginalLineupSlot;
  }

  public void setPersonReplacingId(java.lang.Integer personReplacingId) {
    this.personReplacingId = personReplacingId;
  }

  public void setPersonReplacingPositionId(java.lang.Integer personReplacingPositionId) {
    this.personReplacingPositionId = personReplacingPositionId;
  }

  public void setPersonReplacingLineupSlot(java.lang.Integer personReplacingLineupSlot) {
    this.personReplacingLineupSlot = personReplacingLineupSlot;
  }

  public void setSubstitutionReason(java.lang.String substitutionReason) {
    this.substitutionReason = substitutionReason;
  }

  public void setComment(java.lang.String comment) {
    this.comment = comment;
  }
}
