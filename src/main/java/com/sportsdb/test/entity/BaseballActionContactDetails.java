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
@Table(name = "baseball_action_contact_details")
public class BaseballActionContactDetails implements Serializable {
  private static final long serialVersionUID = 166867004219271212L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: baseball_action_pitch_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "baseball_action_pitch_id")
  private java.lang.Integer baseballActionPitchId;
  /** Description: location. */
  @Basic
  @Column(name = "location", length = 100)
  private java.lang.String location;
  /** Description: strength. */
  @Basic
  @Column(name = "strength", length = 100)
  private java.lang.String strength;
  /** Description: velocity. */
  @Basic
  @Column(name = "velocity")
  private java.lang.Integer velocity;
  /** Description: comment. */
  @Basic
  @Column(name = "comment", length = 0)
  private java.lang.String comment;
  /** Description: trajectory_coordinates. */
  @Basic
  @Column(name = "trajectory_coordinates", length = 100)
  private java.lang.String trajectoryCoordinates;
  /** Description: trajectory_formula. */
  @Basic
  @Column(name = "trajectory_formula", length = 100)
  private java.lang.String trajectoryFormula;

  public BaseballActionContactDetails() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getBaseballActionPitchId() {
    return this.baseballActionPitchId;
  }

  public java.lang.String getLocation() {
    return this.location;
  }

  public java.lang.String getStrength() {
    return this.strength;
  }

  public java.lang.Integer getVelocity() {
    return this.velocity;
  }

  public java.lang.String getComment() {
    return this.comment;
  }

  public java.lang.String getTrajectoryCoordinates() {
    return this.trajectoryCoordinates;
  }

  public java.lang.String getTrajectoryFormula() {
    return this.trajectoryFormula;
  }

  public void setBaseballActionPitchId(java.lang.Integer baseballActionPitchId) {
    this.baseballActionPitchId = baseballActionPitchId;
  }

  public void setLocation(java.lang.String location) {
    this.location = location;
  }

  public void setStrength(java.lang.String strength) {
    this.strength = strength;
  }

  public void setVelocity(java.lang.Integer velocity) {
    this.velocity = velocity;
  }

  public void setComment(java.lang.String comment) {
    this.comment = comment;
  }

  public void setTrajectoryCoordinates(java.lang.String trajectoryCoordinates) {
    this.trajectoryCoordinates = trajectoryCoordinates;
  }

  public void setTrajectoryFormula(java.lang.String trajectoryFormula) {
    this.trajectoryFormula = trajectoryFormula;
  }
}
