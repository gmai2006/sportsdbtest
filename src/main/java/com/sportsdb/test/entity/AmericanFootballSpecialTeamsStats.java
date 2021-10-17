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
@Table(name = "american_football_special_teams_stats")
public class AmericanFootballSpecialTeamsStats implements Serializable {
    private static final long serialVersionUID = 163445241877026958L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: returns_punt_total. */
    @Basic
    @Column(name = "returns_punt_total", length = 100)
    private java.lang.String returnsPuntTotal;
    /** Description: returns_punt_yards. */
    @Basic
    @Column(name = "returns_punt_yards", length = 100)
    private java.lang.String returnsPuntYards;
    /** Description: returns_punt_average. */
    @Basic
    @Column(name = "returns_punt_average", length = 100)
    private java.lang.String returnsPuntAverage;
    /** Description: returns_punt_longest. */
    @Basic
    @Column(name = "returns_punt_longest", length = 100)
    private java.lang.String returnsPuntLongest;
    /** Description: returns_punt_touchdown. */
    @Basic
    @Column(name = "returns_punt_touchdown", length = 100)
    private java.lang.String returnsPuntTouchdown;
    /** Description: returns_kickoff_total. */
    @Basic
    @Column(name = "returns_kickoff_total", length = 100)
    private java.lang.String returnsKickoffTotal;
    /** Description: returns_kickoff_yards. */
    @Basic
    @Column(name = "returns_kickoff_yards", length = 100)
    private java.lang.String returnsKickoffYards;
    /** Description: returns_kickoff_average. */
    @Basic
    @Column(name = "returns_kickoff_average", length = 100)
    private java.lang.String returnsKickoffAverage;
    /** Description: returns_kickoff_longest. */
    @Basic
    @Column(name = "returns_kickoff_longest", length = 100)
    private java.lang.String returnsKickoffLongest;
    /** Description: returns_kickoff_touchdown. */
    @Basic
    @Column(name = "returns_kickoff_touchdown", length = 100)
    private java.lang.String returnsKickoffTouchdown;
    /** Description: returns_total. */
    @Basic
    @Column(name = "returns_total", length = 100)
    private java.lang.String returnsTotal;
    /** Description: returns_yards. */
    @Basic
    @Column(name = "returns_yards", length = 100)
    private java.lang.String returnsYards;
    /** Description: punts_total. */
    @Basic
    @Column(name = "punts_total", length = 100)
    private java.lang.String puntsTotal;
    /** Description: punts_yards_gross. */
    @Basic
    @Column(name = "punts_yards_gross", length = 100)
    private java.lang.String puntsYardsGross;
    /** Description: punts_yards_net. */
    @Basic
    @Column(name = "punts_yards_net", length = 100)
    private java.lang.String puntsYardsNet;
    /** Description: punts_longest. */
    @Basic
    @Column(name = "punts_longest", length = 100)
    private java.lang.String puntsLongest;
    /** Description: punts_inside_20. */
    @Basic
    @Column(name = "punts_inside_20", length = 100)
    private java.lang.String puntsInside20;
    /** Description: punts_inside_20_percentage. */
    @Basic
    @Column(name = "punts_inside_20_percentage", length = 100)
    private java.lang.String puntsInside20Percentage;
    /** Description: punts_average. */
    @Basic
    @Column(name = "punts_average", length = 100)
    private java.lang.String puntsAverage;
    /** Description: punts_blocked. */
    @Basic
    @Column(name = "punts_blocked", length = 100)
    private java.lang.String puntsBlocked;
    /** Description: touchbacks_total. */
    @Basic
    @Column(name = "touchbacks_total", length = 100)
    private java.lang.String touchbacksTotal;
    /** Description: touchbacks_total_percentage. */
    @Basic
    @Column(name = "touchbacks_total_percentage", length = 100)
    private java.lang.String touchbacksTotalPercentage;
    /** Description: touchbacks_kickoffs. */
    @Basic
    @Column(name = "touchbacks_kickoffs", length = 100)
    private java.lang.String touchbacksKickoffs;
    /** Description: touchbacks_kickoffs_percentage. */
    @Basic
    @Column(name = "touchbacks_kickoffs_percentage", length = 100)
    private java.lang.String touchbacksKickoffsPercentage;
    /** Description: touchbacks_punts. */
    @Basic
    @Column(name = "touchbacks_punts", length = 100)
    private java.lang.String touchbacksPunts;
    /** Description: touchbacks_punts_percentage. */
    @Basic
    @Column(name = "touchbacks_punts_percentage", length = 100)
    private java.lang.String touchbacksPuntsPercentage;
    /** Description: touchbacks_interceptions. */
    @Basic
    @Column(name = "touchbacks_interceptions", length = 100)
    private java.lang.String touchbacksInterceptions;
    /** Description: touchbacks_interceptions_percentage. */
    @Basic
    @Column(name = "touchbacks_interceptions_percentage", length = 100)
    private java.lang.String touchbacksInterceptionsPercentage;
    /** Description: fair_catches. */
    @Basic
    @Column(name = "fair_catches", length = 100)
    private java.lang.String fairCatches;

    public AmericanFootballSpecialTeamsStats() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getReturnsPuntTotal() {
        return this.returnsPuntTotal;
    }

    public java.lang.String getReturnsPuntYards() {
        return this.returnsPuntYards;
    }

    public java.lang.String getReturnsPuntAverage() {
        return this.returnsPuntAverage;
    }

    public java.lang.String getReturnsPuntLongest() {
        return this.returnsPuntLongest;
    }

    public java.lang.String getReturnsPuntTouchdown() {
        return this.returnsPuntTouchdown;
    }

    public java.lang.String getReturnsKickoffTotal() {
        return this.returnsKickoffTotal;
    }

    public java.lang.String getReturnsKickoffYards() {
        return this.returnsKickoffYards;
    }

    public java.lang.String getReturnsKickoffAverage() {
        return this.returnsKickoffAverage;
    }

    public java.lang.String getReturnsKickoffLongest() {
        return this.returnsKickoffLongest;
    }

    public java.lang.String getReturnsKickoffTouchdown() {
        return this.returnsKickoffTouchdown;
    }

    public java.lang.String getReturnsTotal() {
        return this.returnsTotal;
    }

    public java.lang.String getReturnsYards() {
        return this.returnsYards;
    }

    public java.lang.String getPuntsTotal() {
        return this.puntsTotal;
    }

    public java.lang.String getPuntsYardsGross() {
        return this.puntsYardsGross;
    }

    public java.lang.String getPuntsYardsNet() {
        return this.puntsYardsNet;
    }

    public java.lang.String getPuntsLongest() {
        return this.puntsLongest;
    }

    public java.lang.String getPuntsInside20() {
        return this.puntsInside20;
    }

    public java.lang.String getPuntsInside20Percentage() {
        return this.puntsInside20Percentage;
    }

    public java.lang.String getPuntsAverage() {
        return this.puntsAverage;
    }

    public java.lang.String getPuntsBlocked() {
        return this.puntsBlocked;
    }

    public java.lang.String getTouchbacksTotal() {
        return this.touchbacksTotal;
    }

    public java.lang.String getTouchbacksTotalPercentage() {
        return this.touchbacksTotalPercentage;
    }

    public java.lang.String getTouchbacksKickoffs() {
        return this.touchbacksKickoffs;
    }

    public java.lang.String getTouchbacksKickoffsPercentage() {
        return this.touchbacksKickoffsPercentage;
    }

    public java.lang.String getTouchbacksPunts() {
        return this.touchbacksPunts;
    }

    public java.lang.String getTouchbacksPuntsPercentage() {
        return this.touchbacksPuntsPercentage;
    }

    public java.lang.String getTouchbacksInterceptions() {
        return this.touchbacksInterceptions;
    }

    public java.lang.String getTouchbacksInterceptionsPercentage() {
        return this.touchbacksInterceptionsPercentage;
    }

    public java.lang.String getFairCatches() {
        return this.fairCatches;
    }

    public void setReturnsPuntTotal(java.lang.String returnsPuntTotal) {
        this.returnsPuntTotal = returnsPuntTotal;
    }

    public void setReturnsPuntYards(java.lang.String returnsPuntYards) {
        this.returnsPuntYards = returnsPuntYards;
    }

    public void setReturnsPuntAverage(java.lang.String returnsPuntAverage) {
        this.returnsPuntAverage = returnsPuntAverage;
    }

    public void setReturnsPuntLongest(java.lang.String returnsPuntLongest) {
        this.returnsPuntLongest = returnsPuntLongest;
    }

    public void setReturnsPuntTouchdown(java.lang.String returnsPuntTouchdown) {
        this.returnsPuntTouchdown = returnsPuntTouchdown;
    }

    public void setReturnsKickoffTotal(java.lang.String returnsKickoffTotal) {
        this.returnsKickoffTotal = returnsKickoffTotal;
    }

    public void setReturnsKickoffYards(java.lang.String returnsKickoffYards) {
        this.returnsKickoffYards = returnsKickoffYards;
    }

    public void setReturnsKickoffAverage(java.lang.String returnsKickoffAverage) {
        this.returnsKickoffAverage = returnsKickoffAverage;
    }

    public void setReturnsKickoffLongest(java.lang.String returnsKickoffLongest) {
        this.returnsKickoffLongest = returnsKickoffLongest;
    }

    public void setReturnsKickoffTouchdown(java.lang.String returnsKickoffTouchdown) {
        this.returnsKickoffTouchdown = returnsKickoffTouchdown;
    }

    public void setReturnsTotal(java.lang.String returnsTotal) {
        this.returnsTotal = returnsTotal;
    }

    public void setReturnsYards(java.lang.String returnsYards) {
        this.returnsYards = returnsYards;
    }

    public void setPuntsTotal(java.lang.String puntsTotal) {
        this.puntsTotal = puntsTotal;
    }

    public void setPuntsYardsGross(java.lang.String puntsYardsGross) {
        this.puntsYardsGross = puntsYardsGross;
    }

    public void setPuntsYardsNet(java.lang.String puntsYardsNet) {
        this.puntsYardsNet = puntsYardsNet;
    }

    public void setPuntsLongest(java.lang.String puntsLongest) {
        this.puntsLongest = puntsLongest;
    }

    public void setPuntsInside20(java.lang.String puntsInside20) {
        this.puntsInside20 = puntsInside20;
    }

    public void setPuntsInside20Percentage(java.lang.String puntsInside20Percentage) {
        this.puntsInside20Percentage = puntsInside20Percentage;
    }

    public void setPuntsAverage(java.lang.String puntsAverage) {
        this.puntsAverage = puntsAverage;
    }

    public void setPuntsBlocked(java.lang.String puntsBlocked) {
        this.puntsBlocked = puntsBlocked;
    }

    public void setTouchbacksTotal(java.lang.String touchbacksTotal) {
        this.touchbacksTotal = touchbacksTotal;
    }

    public void setTouchbacksTotalPercentage(java.lang.String touchbacksTotalPercentage) {
        this.touchbacksTotalPercentage = touchbacksTotalPercentage;
    }

    public void setTouchbacksKickoffs(java.lang.String touchbacksKickoffs) {
        this.touchbacksKickoffs = touchbacksKickoffs;
    }

    public void setTouchbacksKickoffsPercentage(java.lang.String touchbacksKickoffsPercentage) {
        this.touchbacksKickoffsPercentage = touchbacksKickoffsPercentage;
    }

    public void setTouchbacksPunts(java.lang.String touchbacksPunts) {
        this.touchbacksPunts = touchbacksPunts;
    }

    public void setTouchbacksPuntsPercentage(java.lang.String touchbacksPuntsPercentage) {
        this.touchbacksPuntsPercentage = touchbacksPuntsPercentage;
    }

    public void setTouchbacksInterceptions(java.lang.String touchbacksInterceptions) {
        this.touchbacksInterceptions = touchbacksInterceptions;
    }

    public void setTouchbacksInterceptionsPercentage(
            java.lang.String touchbacksInterceptionsPercentage) {
        this.touchbacksInterceptionsPercentage = touchbacksInterceptionsPercentage;
    }

    public void setFairCatches(java.lang.String fairCatches) {
        this.fairCatches = fairCatches;
    }
}
