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
@Table(name = "core_stats")
public class CoreStats implements Serializable {
    private static final long serialVersionUID = 163445241892276741L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: score. */
    @Basic
    @Column(name = "score", length = 100)
    private java.lang.String score;
    /** Description: score_opposing. */
    @Basic
    @Column(name = "score_opposing", length = 100)
    private java.lang.String scoreOpposing;
    /** Description: score_attempts. */
    @Basic
    @Column(name = "score_attempts", length = 100)
    private java.lang.String scoreAttempts;
    /** Description: score_attempts_opposing. */
    @Basic
    @Column(name = "score_attempts_opposing", length = 100)
    private java.lang.String scoreAttemptsOpposing;
    /** Description: score_percentage. */
    @Basic
    @Column(name = "score_percentage", length = 100)
    private java.lang.String scorePercentage;
    /** Description: score_percentage_opposing. */
    @Basic
    @Column(name = "score_percentage_opposing", length = 100)
    private java.lang.String scorePercentageOpposing;

    public CoreStats() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getScore() {
        return this.score;
    }

    public java.lang.String getScoreOpposing() {
        return this.scoreOpposing;
    }

    public java.lang.String getScoreAttempts() {
        return this.scoreAttempts;
    }

    public java.lang.String getScoreAttemptsOpposing() {
        return this.scoreAttemptsOpposing;
    }

    public java.lang.String getScorePercentage() {
        return this.scorePercentage;
    }

    public java.lang.String getScorePercentageOpposing() {
        return this.scorePercentageOpposing;
    }

    public void setScore(java.lang.String score) {
        this.score = score;
    }

    public void setScoreOpposing(java.lang.String scoreOpposing) {
        this.scoreOpposing = scoreOpposing;
    }

    public void setScoreAttempts(java.lang.String scoreAttempts) {
        this.scoreAttempts = scoreAttempts;
    }

    public void setScoreAttemptsOpposing(java.lang.String scoreAttemptsOpposing) {
        this.scoreAttemptsOpposing = scoreAttemptsOpposing;
    }

    public void setScorePercentage(java.lang.String scorePercentage) {
        this.scorePercentage = scorePercentage;
    }

    public void setScorePercentageOpposing(java.lang.String scorePercentageOpposing) {
        this.scorePercentageOpposing = scorePercentageOpposing;
    }
}
