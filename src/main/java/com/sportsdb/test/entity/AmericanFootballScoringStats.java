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
@Table(name = "american_football_scoring_stats")
public class AmericanFootballScoringStats implements Serializable {
    private static final long serialVersionUID = 163445241875976832L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: touchdowns_total. */
    @Basic
    @Column(name = "touchdowns_total", length = 100)
    private java.lang.String touchdownsTotal;
    /** Description: touchdowns_passing. */
    @Basic
    @Column(name = "touchdowns_passing", length = 100)
    private java.lang.String touchdownsPassing;
    /** Description: touchdowns_rushing. */
    @Basic
    @Column(name = "touchdowns_rushing", length = 100)
    private java.lang.String touchdownsRushing;
    /** Description: touchdowns_special_teams. */
    @Basic
    @Column(name = "touchdowns_special_teams", length = 100)
    private java.lang.String touchdownsSpecialTeams;
    /** Description: touchdowns_defensive. */
    @Basic
    @Column(name = "touchdowns_defensive", length = 100)
    private java.lang.String touchdownsDefensive;
    /** Description: extra_points_attempts. */
    @Basic
    @Column(name = "extra_points_attempts", length = 100)
    private java.lang.String extraPointsAttempts;
    /** Description: extra_points_made. */
    @Basic
    @Column(name = "extra_points_made", length = 100)
    private java.lang.String extraPointsMade;
    /** Description: extra_points_missed. */
    @Basic
    @Column(name = "extra_points_missed", length = 100)
    private java.lang.String extraPointsMissed;
    /** Description: extra_points_blocked. */
    @Basic
    @Column(name = "extra_points_blocked", length = 100)
    private java.lang.String extraPointsBlocked;
    /** Description: field_goal_attempts. */
    @Basic
    @Column(name = "field_goal_attempts", length = 100)
    private java.lang.String fieldGoalAttempts;
    /** Description: field_goals_made. */
    @Basic
    @Column(name = "field_goals_made", length = 100)
    private java.lang.String fieldGoalsMade;
    /** Description: field_goals_missed. */
    @Basic
    @Column(name = "field_goals_missed", length = 100)
    private java.lang.String fieldGoalsMissed;
    /** Description: field_goals_blocked. */
    @Basic
    @Column(name = "field_goals_blocked", length = 100)
    private java.lang.String fieldGoalsBlocked;
    /** Description: safeties_against. */
    @Basic
    @Column(name = "safeties_against", length = 100)
    private java.lang.String safetiesAgainst;
    /** Description: two_point_conversions_attempts. */
    @Basic
    @Column(name = "two_point_conversions_attempts", length = 100)
    private java.lang.String twoPointConversionsAttempts;
    /** Description: two_point_conversions_made. */
    @Basic
    @Column(name = "two_point_conversions_made", length = 100)
    private java.lang.String twoPointConversionsMade;
    /** Description: touchbacks_total. */
    @Basic
    @Column(name = "touchbacks_total", length = 100)
    private java.lang.String touchbacksTotal;

    public AmericanFootballScoringStats() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getTouchdownsTotal() {
        return this.touchdownsTotal;
    }

    public java.lang.String getTouchdownsPassing() {
        return this.touchdownsPassing;
    }

    public java.lang.String getTouchdownsRushing() {
        return this.touchdownsRushing;
    }

    public java.lang.String getTouchdownsSpecialTeams() {
        return this.touchdownsSpecialTeams;
    }

    public java.lang.String getTouchdownsDefensive() {
        return this.touchdownsDefensive;
    }

    public java.lang.String getExtraPointsAttempts() {
        return this.extraPointsAttempts;
    }

    public java.lang.String getExtraPointsMade() {
        return this.extraPointsMade;
    }

    public java.lang.String getExtraPointsMissed() {
        return this.extraPointsMissed;
    }

    public java.lang.String getExtraPointsBlocked() {
        return this.extraPointsBlocked;
    }

    public java.lang.String getFieldGoalAttempts() {
        return this.fieldGoalAttempts;
    }

    public java.lang.String getFieldGoalsMade() {
        return this.fieldGoalsMade;
    }

    public java.lang.String getFieldGoalsMissed() {
        return this.fieldGoalsMissed;
    }

    public java.lang.String getFieldGoalsBlocked() {
        return this.fieldGoalsBlocked;
    }

    public java.lang.String getSafetiesAgainst() {
        return this.safetiesAgainst;
    }

    public java.lang.String getTwoPointConversionsAttempts() {
        return this.twoPointConversionsAttempts;
    }

    public java.lang.String getTwoPointConversionsMade() {
        return this.twoPointConversionsMade;
    }

    public java.lang.String getTouchbacksTotal() {
        return this.touchbacksTotal;
    }

    public void setTouchdownsTotal(java.lang.String touchdownsTotal) {
        this.touchdownsTotal = touchdownsTotal;
    }

    public void setTouchdownsPassing(java.lang.String touchdownsPassing) {
        this.touchdownsPassing = touchdownsPassing;
    }

    public void setTouchdownsRushing(java.lang.String touchdownsRushing) {
        this.touchdownsRushing = touchdownsRushing;
    }

    public void setTouchdownsSpecialTeams(java.lang.String touchdownsSpecialTeams) {
        this.touchdownsSpecialTeams = touchdownsSpecialTeams;
    }

    public void setTouchdownsDefensive(java.lang.String touchdownsDefensive) {
        this.touchdownsDefensive = touchdownsDefensive;
    }

    public void setExtraPointsAttempts(java.lang.String extraPointsAttempts) {
        this.extraPointsAttempts = extraPointsAttempts;
    }

    public void setExtraPointsMade(java.lang.String extraPointsMade) {
        this.extraPointsMade = extraPointsMade;
    }

    public void setExtraPointsMissed(java.lang.String extraPointsMissed) {
        this.extraPointsMissed = extraPointsMissed;
    }

    public void setExtraPointsBlocked(java.lang.String extraPointsBlocked) {
        this.extraPointsBlocked = extraPointsBlocked;
    }

    public void setFieldGoalAttempts(java.lang.String fieldGoalAttempts) {
        this.fieldGoalAttempts = fieldGoalAttempts;
    }

    public void setFieldGoalsMade(java.lang.String fieldGoalsMade) {
        this.fieldGoalsMade = fieldGoalsMade;
    }

    public void setFieldGoalsMissed(java.lang.String fieldGoalsMissed) {
        this.fieldGoalsMissed = fieldGoalsMissed;
    }

    public void setFieldGoalsBlocked(java.lang.String fieldGoalsBlocked) {
        this.fieldGoalsBlocked = fieldGoalsBlocked;
    }

    public void setSafetiesAgainst(java.lang.String safetiesAgainst) {
        this.safetiesAgainst = safetiesAgainst;
    }

    public void setTwoPointConversionsAttempts(java.lang.String twoPointConversionsAttempts) {
        this.twoPointConversionsAttempts = twoPointConversionsAttempts;
    }

    public void setTwoPointConversionsMade(java.lang.String twoPointConversionsMade) {
        this.twoPointConversionsMade = twoPointConversionsMade;
    }

    public void setTouchbacksTotal(java.lang.String touchbacksTotal) {
        this.touchbacksTotal = touchbacksTotal;
    }
}
