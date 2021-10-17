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
@Table(name = "tennis_event_states")
public class TennisEventStates implements Serializable {
    private static final long serialVersionUID = 163445241937212036L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: event_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "event_id")
    private java.lang.Integer eventId;
    /** Description: current_state. */
    @Basic
    @Column(name = "current_state")
    private java.lang.Integer currentState;
    /** Description: sequence_number. */
    @Basic
    @Column(name = "sequence_number")
    private java.lang.Integer sequenceNumber;
    /** Description: tennis_set. */
    @Basic
    @Column(name = "tennis_set", length = 100)
    private java.lang.String tennisSet;
    /** Description: game. */
    @Basic
    @Column(name = "game", length = 100)
    private java.lang.String game;
    /** Description: server_person_id. */
    @Basic
    @Column(name = "server_person_id")
    private java.lang.Integer serverPersonId;
    /** Description: server_score. */
    @Basic
    @Column(name = "server_score", length = 100)
    private java.lang.String serverScore;
    /** Description: receiver_person_id. */
    @Basic
    @Column(name = "receiver_person_id")
    private java.lang.Integer receiverPersonId;
    /** Description: receiver_score. */
    @Basic
    @Column(name = "receiver_score", length = 100)
    private java.lang.String receiverScore;
    /** Description: service_number. */
    @Basic
    @Column(name = "service_number", length = 100)
    private java.lang.String serviceNumber;
    /** Description: context. */
    @Basic
    @Column(name = "context", length = 40)
    private java.lang.String context;

    public TennisEventStates() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getEventId() {
        return this.eventId;
    }

    public java.lang.Integer getCurrentState() {
        return this.currentState;
    }

    public java.lang.Integer getSequenceNumber() {
        return this.sequenceNumber;
    }

    public java.lang.String getTennisSet() {
        return this.tennisSet;
    }

    public java.lang.String getGame() {
        return this.game;
    }

    public java.lang.Integer getServerPersonId() {
        return this.serverPersonId;
    }

    public java.lang.String getServerScore() {
        return this.serverScore;
    }

    public java.lang.Integer getReceiverPersonId() {
        return this.receiverPersonId;
    }

    public java.lang.String getReceiverScore() {
        return this.receiverScore;
    }

    public java.lang.String getServiceNumber() {
        return this.serviceNumber;
    }

    public java.lang.String getContext() {
        return this.context;
    }

    public void setEventId(java.lang.Integer eventId) {
        this.eventId = eventId;
    }

    public void setCurrentState(java.lang.Integer currentState) {
        this.currentState = currentState;
    }

    public void setSequenceNumber(java.lang.Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setTennisSet(java.lang.String tennisSet) {
        this.tennisSet = tennisSet;
    }

    public void setGame(java.lang.String game) {
        this.game = game;
    }

    public void setServerPersonId(java.lang.Integer serverPersonId) {
        this.serverPersonId = serverPersonId;
    }

    public void setServerScore(java.lang.String serverScore) {
        this.serverScore = serverScore;
    }

    public void setReceiverPersonId(java.lang.Integer receiverPersonId) {
        this.receiverPersonId = receiverPersonId;
    }

    public void setReceiverScore(java.lang.String receiverScore) {
        this.receiverScore = receiverScore;
    }

    public void setServiceNumber(java.lang.String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public void setContext(java.lang.String context) {
        this.context = context;
    }
}
