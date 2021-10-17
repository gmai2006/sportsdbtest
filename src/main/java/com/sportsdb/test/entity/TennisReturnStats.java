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
@Table(name = "tennis_return_stats")
public class TennisReturnStats implements Serializable {
    private static final long serialVersionUID = 163445241937960396L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: returns_played. */
    @Basic
    @Column(name = "returns_played", length = 100)
    private java.lang.String returnsPlayed;
    /** Description: matches_played. */
    @Basic
    @Column(name = "matches_played", length = 100)
    private java.lang.String matchesPlayed;
    /** Description: first_service_return_points_won. */
    @Basic
    @Column(name = "first_service_return_points_won", length = 100)
    private java.lang.String firstServiceReturnPointsWon;
    /** Description: first_service_return_points_won_pct. */
    @Basic
    @Column(name = "first_service_return_points_won_pct", length = 100)
    private java.lang.String firstServiceReturnPointsWonPct;
    /** Description: second_service_return_points_won. */
    @Basic
    @Column(name = "second_service_return_points_won", length = 100)
    private java.lang.String secondServiceReturnPointsWon;
    /** Description: second_service_return_points_won_pct. */
    @Basic
    @Column(name = "second_service_return_points_won_pct", length = 100)
    private java.lang.String secondServiceReturnPointsWonPct;
    /** Description: return_games_played. */
    @Basic
    @Column(name = "return_games_played", length = 100)
    private java.lang.String returnGamesPlayed;
    /** Description: return_games_won. */
    @Basic
    @Column(name = "return_games_won", length = 100)
    private java.lang.String returnGamesWon;
    /** Description: return_games_won_pct. */
    @Basic
    @Column(name = "return_games_won_pct", length = 100)
    private java.lang.String returnGamesWonPct;
    /** Description: break_points_played. */
    @Basic
    @Column(name = "break_points_played", length = 100)
    private java.lang.String breakPointsPlayed;
    /** Description: break_points_converted. */
    @Basic
    @Column(name = "break_points_converted", length = 100)
    private java.lang.String breakPointsConverted;
    /** Description: break_points_converted_pct. */
    @Basic
    @Column(name = "break_points_converted_pct", length = 100)
    private java.lang.String breakPointsConvertedPct;

    public TennisReturnStats() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getReturnsPlayed() {
        return this.returnsPlayed;
    }

    public java.lang.String getMatchesPlayed() {
        return this.matchesPlayed;
    }

    public java.lang.String getFirstServiceReturnPointsWon() {
        return this.firstServiceReturnPointsWon;
    }

    public java.lang.String getFirstServiceReturnPointsWonPct() {
        return this.firstServiceReturnPointsWonPct;
    }

    public java.lang.String getSecondServiceReturnPointsWon() {
        return this.secondServiceReturnPointsWon;
    }

    public java.lang.String getSecondServiceReturnPointsWonPct() {
        return this.secondServiceReturnPointsWonPct;
    }

    public java.lang.String getReturnGamesPlayed() {
        return this.returnGamesPlayed;
    }

    public java.lang.String getReturnGamesWon() {
        return this.returnGamesWon;
    }

    public java.lang.String getReturnGamesWonPct() {
        return this.returnGamesWonPct;
    }

    public java.lang.String getBreakPointsPlayed() {
        return this.breakPointsPlayed;
    }

    public java.lang.String getBreakPointsConverted() {
        return this.breakPointsConverted;
    }

    public java.lang.String getBreakPointsConvertedPct() {
        return this.breakPointsConvertedPct;
    }

    public void setReturnsPlayed(java.lang.String returnsPlayed) {
        this.returnsPlayed = returnsPlayed;
    }

    public void setMatchesPlayed(java.lang.String matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setFirstServiceReturnPointsWon(java.lang.String firstServiceReturnPointsWon) {
        this.firstServiceReturnPointsWon = firstServiceReturnPointsWon;
    }

    public void setFirstServiceReturnPointsWonPct(java.lang.String firstServiceReturnPointsWonPct) {
        this.firstServiceReturnPointsWonPct = firstServiceReturnPointsWonPct;
    }

    public void setSecondServiceReturnPointsWon(java.lang.String secondServiceReturnPointsWon) {
        this.secondServiceReturnPointsWon = secondServiceReturnPointsWon;
    }

    public void setSecondServiceReturnPointsWonPct(
            java.lang.String secondServiceReturnPointsWonPct) {
        this.secondServiceReturnPointsWonPct = secondServiceReturnPointsWonPct;
    }

    public void setReturnGamesPlayed(java.lang.String returnGamesPlayed) {
        this.returnGamesPlayed = returnGamesPlayed;
    }

    public void setReturnGamesWon(java.lang.String returnGamesWon) {
        this.returnGamesWon = returnGamesWon;
    }

    public void setReturnGamesWonPct(java.lang.String returnGamesWonPct) {
        this.returnGamesWonPct = returnGamesWonPct;
    }

    public void setBreakPointsPlayed(java.lang.String breakPointsPlayed) {
        this.breakPointsPlayed = breakPointsPlayed;
    }

    public void setBreakPointsConverted(java.lang.String breakPointsConverted) {
        this.breakPointsConverted = breakPointsConverted;
    }

    public void setBreakPointsConvertedPct(java.lang.String breakPointsConvertedPct) {
        this.breakPointsConvertedPct = breakPointsConvertedPct;
    }
}
