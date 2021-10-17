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
@Table(name = "tennis_action_volleys")
public class TennisActionVolleys implements Serializable {
    private static final long serialVersionUID = 163445241936724984L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: sequence_number. */
    @Basic
    @Column(name = "sequence_number", length = 100)
    private java.lang.String sequenceNumber;
    /** Description: tennis_action_points_id. */
    @Basic
    @Column(name = "tennis_action_points_id")
    private java.lang.Integer tennisActionPointsId;
    /** Description: landing_location. */
    @Basic
    @Column(name = "landing_location", length = 100)
    private java.lang.String landingLocation;
    /** Description: swing_type. */
    @Basic
    @Column(name = "swing_type", length = 100)
    private java.lang.String swingType;
    /** Description: result. */
    @Basic
    @Column(name = "result", length = 100)
    private java.lang.String result;
    /** Description: spin_type. */
    @Basic
    @Column(name = "spin_type", length = 100)
    private java.lang.String spinType;
    /** Description: trajectory_details. */
    @Basic
    @Column(name = "trajectory_details", length = 100)
    private java.lang.String trajectoryDetails;

    public TennisActionVolleys() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getSequenceNumber() {
        return this.sequenceNumber;
    }

    public java.lang.Integer getTennisActionPointsId() {
        return this.tennisActionPointsId;
    }

    public java.lang.String getLandingLocation() {
        return this.landingLocation;
    }

    public java.lang.String getSwingType() {
        return this.swingType;
    }

    public java.lang.String getResult() {
        return this.result;
    }

    public java.lang.String getSpinType() {
        return this.spinType;
    }

    public java.lang.String getTrajectoryDetails() {
        return this.trajectoryDetails;
    }

    public void setSequenceNumber(java.lang.String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setTennisActionPointsId(java.lang.Integer tennisActionPointsId) {
        this.tennisActionPointsId = tennisActionPointsId;
    }

    public void setLandingLocation(java.lang.String landingLocation) {
        this.landingLocation = landingLocation;
    }

    public void setSwingType(java.lang.String swingType) {
        this.swingType = swingType;
    }

    public void setResult(java.lang.String result) {
        this.result = result;
    }

    public void setSpinType(java.lang.String spinType) {
        this.spinType = spinType;
    }

    public void setTrajectoryDetails(java.lang.String trajectoryDetails) {
        this.trajectoryDetails = trajectoryDetails;
    }
}
