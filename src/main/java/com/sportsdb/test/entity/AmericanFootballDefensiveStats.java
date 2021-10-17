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
@Table(name = "american_football_defensive_stats")
public class AmericanFootballDefensiveStats implements Serializable {
    private static final long serialVersionUID = 163445241869541737L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: tackles_total. */
    @Basic
    @Column(name = "tackles_total", length = 100)
    private java.lang.String tacklesTotal;
    /** Description: tackles_solo. */
    @Basic
    @Column(name = "tackles_solo", length = 100)
    private java.lang.String tacklesSolo;
    /** Description: tackles_assists. */
    @Basic
    @Column(name = "tackles_assists", length = 100)
    private java.lang.String tacklesAssists;
    /** Description: interceptions_total. */
    @Basic
    @Column(name = "interceptions_total", length = 100)
    private java.lang.String interceptionsTotal;
    /** Description: interceptions_yards. */
    @Basic
    @Column(name = "interceptions_yards", length = 100)
    private java.lang.String interceptionsYards;
    /** Description: interceptions_average. */
    @Basic
    @Column(name = "interceptions_average", length = 100)
    private java.lang.String interceptionsAverage;
    /** Description: interceptions_longest. */
    @Basic
    @Column(name = "interceptions_longest", length = 100)
    private java.lang.String interceptionsLongest;
    /** Description: interceptions_touchdown. */
    @Basic
    @Column(name = "interceptions_touchdown", length = 100)
    private java.lang.String interceptionsTouchdown;
    /** Description: quarterback_hurries. */
    @Basic
    @Column(name = "quarterback_hurries", length = 100)
    private java.lang.String quarterbackHurries;
    /** Description: sacks_total. */
    @Basic
    @Column(name = "sacks_total", length = 100)
    private java.lang.String sacksTotal;
    /** Description: sacks_yards. */
    @Basic
    @Column(name = "sacks_yards", length = 100)
    private java.lang.String sacksYards;
    /** Description: passes_defensed. */
    @Basic
    @Column(name = "passes_defensed", length = 100)
    private java.lang.String passesDefensed;

    public AmericanFootballDefensiveStats() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getTacklesTotal() {
        return this.tacklesTotal;
    }

    public java.lang.String getTacklesSolo() {
        return this.tacklesSolo;
    }

    public java.lang.String getTacklesAssists() {
        return this.tacklesAssists;
    }

    public java.lang.String getInterceptionsTotal() {
        return this.interceptionsTotal;
    }

    public java.lang.String getInterceptionsYards() {
        return this.interceptionsYards;
    }

    public java.lang.String getInterceptionsAverage() {
        return this.interceptionsAverage;
    }

    public java.lang.String getInterceptionsLongest() {
        return this.interceptionsLongest;
    }

    public java.lang.String getInterceptionsTouchdown() {
        return this.interceptionsTouchdown;
    }

    public java.lang.String getQuarterbackHurries() {
        return this.quarterbackHurries;
    }

    public java.lang.String getSacksTotal() {
        return this.sacksTotal;
    }

    public java.lang.String getSacksYards() {
        return this.sacksYards;
    }

    public java.lang.String getPassesDefensed() {
        return this.passesDefensed;
    }

    public void setTacklesTotal(java.lang.String tacklesTotal) {
        this.tacklesTotal = tacklesTotal;
    }

    public void setTacklesSolo(java.lang.String tacklesSolo) {
        this.tacklesSolo = tacklesSolo;
    }

    public void setTacklesAssists(java.lang.String tacklesAssists) {
        this.tacklesAssists = tacklesAssists;
    }

    public void setInterceptionsTotal(java.lang.String interceptionsTotal) {
        this.interceptionsTotal = interceptionsTotal;
    }

    public void setInterceptionsYards(java.lang.String interceptionsYards) {
        this.interceptionsYards = interceptionsYards;
    }

    public void setInterceptionsAverage(java.lang.String interceptionsAverage) {
        this.interceptionsAverage = interceptionsAverage;
    }

    public void setInterceptionsLongest(java.lang.String interceptionsLongest) {
        this.interceptionsLongest = interceptionsLongest;
    }

    public void setInterceptionsTouchdown(java.lang.String interceptionsTouchdown) {
        this.interceptionsTouchdown = interceptionsTouchdown;
    }

    public void setQuarterbackHurries(java.lang.String quarterbackHurries) {
        this.quarterbackHurries = quarterbackHurries;
    }

    public void setSacksTotal(java.lang.String sacksTotal) {
        this.sacksTotal = sacksTotal;
    }

    public void setSacksYards(java.lang.String sacksYards) {
        this.sacksYards = sacksYards;
    }

    public void setPassesDefensed(java.lang.String passesDefensed) {
        this.passesDefensed = passesDefensed;
    }
}
