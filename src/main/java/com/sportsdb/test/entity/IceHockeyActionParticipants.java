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
@Table(name = "ice_hockey_action_participants")
public class IceHockeyActionParticipants implements Serializable {
    private static final long serialVersionUID = 163445241900686249L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Long id;

    /** Description: ice_hockey_action_play_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "ice_hockey_action_play_id")
    private java.lang.Integer iceHockeyActionPlayId;
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
    /** Description: point_credit. */
    @Basic
    @Column(name = "point_credit")
    private java.lang.Integer pointCredit;

    public IceHockeyActionParticipants() {}

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Integer getIceHockeyActionPlayId() {
        return this.iceHockeyActionPlayId;
    }

    public java.lang.Integer getPersonId() {
        return this.personId;
    }

    public java.lang.String getParticipantRole() {
        return this.participantRole;
    }

    public java.lang.Integer getPointCredit() {
        return this.pointCredit;
    }

    public void setIceHockeyActionPlayId(java.lang.Integer iceHockeyActionPlayId) {
        this.iceHockeyActionPlayId = iceHockeyActionPlayId;
    }

    public void setPersonId(java.lang.Integer personId) {
        this.personId = personId;
    }

    public void setParticipantRole(java.lang.String participantRole) {
        this.participantRole = participantRole;
    }

    public void setPointCredit(java.lang.Integer pointCredit) {
        this.pointCredit = pointCredit;
    }
}
