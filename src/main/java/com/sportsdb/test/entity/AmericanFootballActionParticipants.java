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
@Table(name = "american_football_action_participants")
public class AmericanFootballActionParticipants implements Serializable {
    private static final long serialVersionUID = 163445241868274183L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: american_football_action_play_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "american_football_action_play_id")
    private java.lang.Integer americanFootballActionPlayId;
    /** Description: person_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "person_id")
    private java.lang.Integer personId;
    /** Description: participant_role. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "participant_role", length = 100)
    private java.lang.String participantRole;
    /** Description: score_type. */
    @Basic
    @Column(name = "score_type", length = 100)
    private java.lang.String scoreType;
    /** Description: field_line. */
    @Basic
    @Column(name = "field_line")
    private java.lang.Integer fieldLine;
    /** Description: yardage. */
    @Basic
    @Column(name = "yardage")
    private java.lang.Integer yardage;
    /** Description: score_credit. */
    @Basic
    @Column(name = "score_credit")
    private java.lang.Integer scoreCredit;
    /** Description: yards_gained. */
    @Basic
    @Column(name = "yards_gained")
    private java.lang.Integer yardsGained;

    public AmericanFootballActionParticipants() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getAmericanFootballActionPlayId() {
        return this.americanFootballActionPlayId;
    }

    public java.lang.Integer getPersonId() {
        return this.personId;
    }

    public java.lang.String getParticipantRole() {
        return this.participantRole;
    }

    public java.lang.String getScoreType() {
        return this.scoreType;
    }

    public java.lang.Integer getFieldLine() {
        return this.fieldLine;
    }

    public java.lang.Integer getYardage() {
        return this.yardage;
    }

    public java.lang.Integer getScoreCredit() {
        return this.scoreCredit;
    }

    public java.lang.Integer getYardsGained() {
        return this.yardsGained;
    }

    public void setAmericanFootballActionPlayId(java.lang.Integer americanFootballActionPlayId) {
        this.americanFootballActionPlayId = americanFootballActionPlayId;
    }

    public void setPersonId(java.lang.Integer personId) {
        this.personId = personId;
    }

    public void setParticipantRole(java.lang.String participantRole) {
        this.participantRole = participantRole;
    }

    public void setScoreType(java.lang.String scoreType) {
        this.scoreType = scoreType;
    }

    public void setFieldLine(java.lang.Integer fieldLine) {
        this.fieldLine = fieldLine;
    }

    public void setYardage(java.lang.Integer yardage) {
        this.yardage = yardage;
    }

    public void setScoreCredit(java.lang.Integer scoreCredit) {
        this.scoreCredit = scoreCredit;
    }

    public void setYardsGained(java.lang.Integer yardsGained) {
        this.yardsGained = yardsGained;
    }
}
