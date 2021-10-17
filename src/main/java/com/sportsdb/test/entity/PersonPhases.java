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
@Table(name = "person_phases")
public class PersonPhases implements Serializable {
    private static final long serialVersionUID = 163445241920468385L;

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
    /** Description: membership_type. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "membership_type", length = 40)
    private java.lang.String membershipType;
    /** Description: membership_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "membership_id")
    private java.lang.Integer membershipId;
    /** Description: role_id. */
    @Basic
    @Column(name = "role_id")
    private java.lang.Integer roleId;
    /** Description: role_status. */
    @Basic
    @Column(name = "role_status", length = 40)
    private java.lang.String roleStatus;
    /** Description: phase_status. */
    @Basic
    @Column(name = "phase_status", length = 40)
    private java.lang.String phaseStatus;
    /** Description: uniform_number. */
    @Basic
    @Column(name = "uniform_number", length = 20)
    private java.lang.String uniformNumber;
    /** Description: regular_position_id. */
    @Basic
    @Column(name = "regular_position_id")
    private java.lang.Integer regularPositionId;
    /** Description: regular_position_depth. */
    @Basic
    @Column(name = "regular_position_depth", length = 40)
    private java.lang.String regularPositionDepth;
    /** Description: height. */
    @Basic
    @Column(name = "height", length = 100)
    private java.lang.String height;
    /** Description: weight. */
    @Basic
    @Column(name = "weight", length = 100)
    private java.lang.String weight;
    /** Description: start_date_time. */
    @Basic
    @Column(name = "start_date_time")
    private java.util.Date startDateTime;
    /** Description: start_season_id. */
    @Basic
    @Column(name = "start_season_id")
    private java.lang.Integer startSeasonId;
    /** Description: end_date_time. */
    @Basic
    @Column(name = "end_date_time")
    private java.util.Date endDateTime;
    /** Description: end_season_id. */
    @Basic
    @Column(name = "end_season_id")
    private java.lang.Integer endSeasonId;
    /** Description: entry_reason. */
    @Basic
    @Column(name = "entry_reason", length = 40)
    private java.lang.String entryReason;
    /** Description: exit_reason. */
    @Basic
    @Column(name = "exit_reason", length = 40)
    private java.lang.String exitReason;
    /** Description: selection_level. */
    @Basic
    @Column(name = "selection_level")
    private java.lang.Integer selectionLevel;
    /** Description: selection_sublevel. */
    @Basic
    @Column(name = "selection_sublevel")
    private java.lang.Integer selectionSublevel;
    /** Description: selection_overall. */
    @Basic
    @Column(name = "selection_overall")
    private java.lang.Integer selectionOverall;

    public PersonPhases() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getPersonId() {
        return this.personId;
    }

    public java.lang.String getMembershipType() {
        return this.membershipType;
    }

    public java.lang.Integer getMembershipId() {
        return this.membershipId;
    }

    public java.lang.Integer getRoleId() {
        return this.roleId;
    }

    public java.lang.String getRoleStatus() {
        return this.roleStatus;
    }

    public java.lang.String getPhaseStatus() {
        return this.phaseStatus;
    }

    public java.lang.String getUniformNumber() {
        return this.uniformNumber;
    }

    public java.lang.Integer getRegularPositionId() {
        return this.regularPositionId;
    }

    public java.lang.String getRegularPositionDepth() {
        return this.regularPositionDepth;
    }

    public java.lang.String getHeight() {
        return this.height;
    }

    public java.lang.String getWeight() {
        return this.weight;
    }

    public java.util.Date getStartDateTime() {
        return this.startDateTime;
    }

    public java.lang.Integer getStartSeasonId() {
        return this.startSeasonId;
    }

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    public java.lang.Integer getEndSeasonId() {
        return this.endSeasonId;
    }

    public java.lang.String getEntryReason() {
        return this.entryReason;
    }

    public java.lang.String getExitReason() {
        return this.exitReason;
    }

    public java.lang.Integer getSelectionLevel() {
        return this.selectionLevel;
    }

    public java.lang.Integer getSelectionSublevel() {
        return this.selectionSublevel;
    }

    public java.lang.Integer getSelectionOverall() {
        return this.selectionOverall;
    }

    public void setPersonId(java.lang.Integer personId) {
        this.personId = personId;
    }

    public void setMembershipType(java.lang.String membershipType) {
        this.membershipType = membershipType;
    }

    public void setMembershipId(java.lang.Integer membershipId) {
        this.membershipId = membershipId;
    }

    public void setRoleId(java.lang.Integer roleId) {
        this.roleId = roleId;
    }

    public void setRoleStatus(java.lang.String roleStatus) {
        this.roleStatus = roleStatus;
    }

    public void setPhaseStatus(java.lang.String phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    public void setUniformNumber(java.lang.String uniformNumber) {
        this.uniformNumber = uniformNumber;
    }

    public void setRegularPositionId(java.lang.Integer regularPositionId) {
        this.regularPositionId = regularPositionId;
    }

    public void setRegularPositionDepth(java.lang.String regularPositionDepth) {
        this.regularPositionDepth = regularPositionDepth;
    }

    public void setHeight(java.lang.String height) {
        this.height = height;
    }

    public void setWeight(java.lang.String weight) {
        this.weight = weight;
    }

    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public void setStartSeasonId(java.lang.Integer startSeasonId) {
        this.startSeasonId = startSeasonId;
    }

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public void setEndSeasonId(java.lang.Integer endSeasonId) {
        this.endSeasonId = endSeasonId;
    }

    public void setEntryReason(java.lang.String entryReason) {
        this.entryReason = entryReason;
    }

    public void setExitReason(java.lang.String exitReason) {
        this.exitReason = exitReason;
    }

    public void setSelectionLevel(java.lang.Integer selectionLevel) {
        this.selectionLevel = selectionLevel;
    }

    public void setSelectionSublevel(java.lang.Integer selectionSublevel) {
        this.selectionSublevel = selectionSublevel;
    }

    public void setSelectionOverall(java.lang.Integer selectionOverall) {
        this.selectionOverall = selectionOverall;
    }
}
