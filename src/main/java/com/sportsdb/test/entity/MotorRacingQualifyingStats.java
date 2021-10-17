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
@Table(name = "motor_racing_qualifying_stats")
public class MotorRacingQualifyingStats implements Serializable {
    private static final long serialVersionUID = 163445241914539204L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: grid. */
    @Basic
    @Column(name = "grid", length = 100)
    private java.lang.String grid;
    /** Description: pole_position. */
    @Basic
    @Column(name = "pole_position", length = 100)
    private java.lang.String polePosition;
    /** Description: pole_wins. */
    @Basic
    @Column(name = "pole_wins", length = 100)
    private java.lang.String poleWins;
    /** Description: qualifying_speed. */
    @Basic
    @Column(name = "qualifying_speed", length = 100)
    private java.lang.String qualifyingSpeed;
    /** Description: qualifying_speed_units. */
    @Basic
    @Column(name = "qualifying_speed_units", length = 100)
    private java.lang.String qualifyingSpeedUnits;
    /** Description: qualifying_time. */
    @Basic
    @Column(name = "qualifying_time", length = 100)
    private java.lang.String qualifyingTime;
    /** Description: qualifying_position. */
    @Basic
    @Column(name = "qualifying_position", length = 100)
    private java.lang.String qualifyingPosition;

    public MotorRacingQualifyingStats() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getGrid() {
        return this.grid;
    }

    public java.lang.String getPolePosition() {
        return this.polePosition;
    }

    public java.lang.String getPoleWins() {
        return this.poleWins;
    }

    public java.lang.String getQualifyingSpeed() {
        return this.qualifyingSpeed;
    }

    public java.lang.String getQualifyingSpeedUnits() {
        return this.qualifyingSpeedUnits;
    }

    public java.lang.String getQualifyingTime() {
        return this.qualifyingTime;
    }

    public java.lang.String getQualifyingPosition() {
        return this.qualifyingPosition;
    }

    public void setGrid(java.lang.String grid) {
        this.grid = grid;
    }

    public void setPolePosition(java.lang.String polePosition) {
        this.polePosition = polePosition;
    }

    public void setPoleWins(java.lang.String poleWins) {
        this.poleWins = poleWins;
    }

    public void setQualifyingSpeed(java.lang.String qualifyingSpeed) {
        this.qualifyingSpeed = qualifyingSpeed;
    }

    public void setQualifyingSpeedUnits(java.lang.String qualifyingSpeedUnits) {
        this.qualifyingSpeedUnits = qualifyingSpeedUnits;
    }

    public void setQualifyingTime(java.lang.String qualifyingTime) {
        this.qualifyingTime = qualifyingTime;
    }

    public void setQualifyingPosition(java.lang.String qualifyingPosition) {
        this.qualifyingPosition = qualifyingPosition;
    }
}
