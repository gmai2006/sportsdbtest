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
@Table(name = "ice_hockey_action_plays")
public class IceHockeyActionPlays implements Serializable {
    private static final long serialVersionUID = 163445241901133869L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Long id;

    /** Description: ice_hockey_event_state_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "ice_hockey_event_state_id")
    private java.lang.Integer iceHockeyEventStateId;
    /** Description: play_type. */
    @Basic
    @Column(name = "play_type", length = 100)
    private java.lang.String playType;
    /** Description: score_attempt_type. */
    @Basic
    @Column(name = "score_attempt_type", length = 100)
    private java.lang.String scoreAttemptType;
    /** Description: play_result. */
    @Basic
    @Column(name = "play_result", length = 100)
    private java.lang.String playResult;
    /** Description: comment. */
    @Basic
    @Column(name = "comment", length = 255)
    private java.lang.String comment;

    public IceHockeyActionPlays() {}

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Integer getIceHockeyEventStateId() {
        return this.iceHockeyEventStateId;
    }

    public java.lang.String getPlayType() {
        return this.playType;
    }

    public java.lang.String getScoreAttemptType() {
        return this.scoreAttemptType;
    }

    public java.lang.String getPlayResult() {
        return this.playResult;
    }

    public java.lang.String getComment() {
        return this.comment;
    }

    public void setIceHockeyEventStateId(java.lang.Integer iceHockeyEventStateId) {
        this.iceHockeyEventStateId = iceHockeyEventStateId;
    }

    public void setPlayType(java.lang.String playType) {
        this.playType = playType;
    }

    public void setScoreAttemptType(java.lang.String scoreAttemptType) {
        this.scoreAttemptType = scoreAttemptType;
    }

    public void setPlayResult(java.lang.String playResult) {
        this.playResult = playResult;
    }

    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }
}
