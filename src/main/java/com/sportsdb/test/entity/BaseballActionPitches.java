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

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "baseball_action_pitches")
public class BaseballActionPitches implements Serializable {
    private static final long serialVersionUID = 163445241879369958L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: baseball_action_play_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "baseball_action_play_id")
    private java.lang.Integer baseballActionPlayId;
    /** Description: sequence_number. */
    @Basic
    @Column(name = "sequence_number")
    private java.lang.Integer sequenceNumber;
    /** Description: baseball_defensive_group_id. */
    @Basic
    @Column(name = "baseball_defensive_group_id")
    private java.lang.Integer baseballDefensiveGroupId;
    /** Description: umpire_call. */
    @Basic
    @Column(name = "umpire_call", length = 100)
    private java.lang.String umpireCall;
    /** Description: pitch_location. */
    @Basic
    @Column(name = "pitch_location", length = 100)
    private java.lang.String pitchLocation;
    /** Description: pitch_type. */
    @Basic
    @Column(name = "pitch_type", length = 100)
    private java.lang.String pitchType;
    /** Description: pitch_velocity. */
    @Basic
    @Column(name = "pitch_velocity")
    private java.lang.Integer pitchVelocity;
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
    /** Description: ball_type. */
    @Basic
    @Column(name = "ball_type", length = 40)
    private java.lang.String ballType;
    /** Description: strike_type. */
    @Basic
    @Column(name = "strike_type", length = 40)
    private java.lang.String strikeType;

    public BaseballActionPitches() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getBaseballActionPlayId() {
        return this.baseballActionPlayId;
    }

    public java.lang.Integer getSequenceNumber() {
        return this.sequenceNumber;
    }

    public java.lang.Integer getBaseballDefensiveGroupId() {
        return this.baseballDefensiveGroupId;
    }

    public java.lang.String getUmpireCall() {
        return this.umpireCall;
    }

    public java.lang.String getPitchLocation() {
        return this.pitchLocation;
    }

    public java.lang.String getPitchType() {
        return this.pitchType;
    }

    public java.lang.Integer getPitchVelocity() {
        return this.pitchVelocity;
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

    public java.lang.String getBallType() {
        return this.ballType;
    }

    public java.lang.String getStrikeType() {
        return this.strikeType;
    }

    public void setBaseballActionPlayId(java.lang.Integer baseballActionPlayId) {
        this.baseballActionPlayId = baseballActionPlayId;
    }

    public void setSequenceNumber(java.lang.Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setBaseballDefensiveGroupId(java.lang.Integer baseballDefensiveGroupId) {
        this.baseballDefensiveGroupId = baseballDefensiveGroupId;
    }

    public void setUmpireCall(java.lang.String umpireCall) {
        this.umpireCall = umpireCall;
    }

    public void setPitchLocation(java.lang.String pitchLocation) {
        this.pitchLocation = pitchLocation;
    }

    public void setPitchType(java.lang.String pitchType) {
        this.pitchType = pitchType;
    }

    public void setPitchVelocity(java.lang.Integer pitchVelocity) {
        this.pitchVelocity = pitchVelocity;
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

    public void setBallType(java.lang.String ballType) {
        this.ballType = ballType;
    }

    public void setStrikeType(java.lang.String strikeType) {
        this.strikeType = strikeType;
    }
}
