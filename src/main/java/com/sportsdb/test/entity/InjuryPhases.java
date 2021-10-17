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
@Table(name = "injury_phases")
public class InjuryPhases implements Serializable {
    private static final long serialVersionUID = 163445241904731668L;

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
    /** Description: injury_status. */
    @Basic
    @Column(name = "injury_status", length = 100)
    private java.lang.String injuryStatus;
    /** Description: injury_type. */
    @Basic
    @Column(name = "injury_type", length = 100)
    private java.lang.String injuryType;
    /** Description: injury_comment. */
    @Basic
    @Column(name = "injury_comment", length = 100)
    private java.lang.String injuryComment;
    /** Description: disabled_list. */
    @Basic
    @Column(name = "disabled_list", length = 100)
    private java.lang.String disabledList;
    /** Description: start_date_time. */
    @Basic
    @Column(name = "start_date_time")
    private java.util.Date startDateTime;
    /** Description: end_date_time. */
    @Basic
    @Column(name = "end_date_time")
    private java.util.Date endDateTime;
    /** Description: season_id. */
    @Basic
    @Column(name = "season_id")
    private java.lang.Integer seasonId;
    /** Description: phase_type. */
    @Basic
    @Column(name = "phase_type", length = 100)
    private java.lang.String phaseType;
    /** Description: injury_side. */
    @Basic
    @Column(name = "injury_side", length = 100)
    private java.lang.String injurySide;

    public InjuryPhases() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getPersonId() {
        return this.personId;
    }

    public java.lang.String getInjuryStatus() {
        return this.injuryStatus;
    }

    public java.lang.String getInjuryType() {
        return this.injuryType;
    }

    public java.lang.String getInjuryComment() {
        return this.injuryComment;
    }

    public java.lang.String getDisabledList() {
        return this.disabledList;
    }

    public java.util.Date getStartDateTime() {
        return this.startDateTime;
    }

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    public java.lang.Integer getSeasonId() {
        return this.seasonId;
    }

    public java.lang.String getPhaseType() {
        return this.phaseType;
    }

    public java.lang.String getInjurySide() {
        return this.injurySide;
    }

    public void setPersonId(java.lang.Integer personId) {
        this.personId = personId;
    }

    public void setInjuryStatus(java.lang.String injuryStatus) {
        this.injuryStatus = injuryStatus;
    }

    public void setInjuryType(java.lang.String injuryType) {
        this.injuryType = injuryType;
    }

    public void setInjuryComment(java.lang.String injuryComment) {
        this.injuryComment = injuryComment;
    }

    public void setDisabledList(java.lang.String disabledList) {
        this.disabledList = disabledList;
    }

    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public void setSeasonId(java.lang.Integer seasonId) {
        this.seasonId = seasonId;
    }

    public void setPhaseType(java.lang.String phaseType) {
        this.phaseType = phaseType;
    }

    public void setInjurySide(java.lang.String injurySide) {
        this.injurySide = injurySide;
    }
}
