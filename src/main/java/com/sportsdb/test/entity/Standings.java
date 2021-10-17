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
@Table(name = "standings")
public class Standings implements Serializable {
    private static final long serialVersionUID = 163445241930994058L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: affiliation_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "affiliation_id")
    private java.lang.Integer affiliationId;
    /** Description: standing_type. */
    @Basic
    @Column(name = "standing_type", length = 100)
    private java.lang.String standingType;
    /** Description: sub_season_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sub_season_id")
    private java.lang.Integer subSeasonId;
    /** Description: last_updated. */
    @Basic
    @Column(name = "last_updated", length = 100)
    private java.lang.String lastUpdated;
    /** Description: duration_scope. */
    @Basic
    @Column(name = "duration_scope", length = 100)
    private java.lang.String durationScope;
    /** Description: competition_scope. */
    @Basic
    @Column(name = "competition_scope", length = 100)
    private java.lang.String competitionScope;
    /** Description: competition_scope_id. */
    @Basic
    @Column(name = "competition_scope_id", length = 100)
    private java.lang.String competitionScopeId;
    /** Description: alignment_scope. */
    @Basic
    @Column(name = "alignment_scope", length = 100)
    private java.lang.String alignmentScope;
    /** Description: site_scope. */
    @Basic
    @Column(name = "site_scope", length = 100)
    private java.lang.String siteScope;
    /** Description: scoping_label. */
    @Basic
    @Column(name = "scoping_label", length = 100)
    private java.lang.String scopingLabel;
    /** Description: publisher_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "publisher_id")
    private java.lang.Integer publisherId;
    /** Description: source. */
    @Basic
    @Column(name = "source", length = 100)
    private java.lang.String source;

    public Standings() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getAffiliationId() {
        return this.affiliationId;
    }

    public java.lang.String getStandingType() {
        return this.standingType;
    }

    public java.lang.Integer getSubSeasonId() {
        return this.subSeasonId;
    }

    public java.lang.String getLastUpdated() {
        return this.lastUpdated;
    }

    public java.lang.String getDurationScope() {
        return this.durationScope;
    }

    public java.lang.String getCompetitionScope() {
        return this.competitionScope;
    }

    public java.lang.String getCompetitionScopeId() {
        return this.competitionScopeId;
    }

    public java.lang.String getAlignmentScope() {
        return this.alignmentScope;
    }

    public java.lang.String getSiteScope() {
        return this.siteScope;
    }

    public java.lang.String getScopingLabel() {
        return this.scopingLabel;
    }

    public java.lang.Integer getPublisherId() {
        return this.publisherId;
    }

    public java.lang.String getSource() {
        return this.source;
    }

    public void setAffiliationId(java.lang.Integer affiliationId) {
        this.affiliationId = affiliationId;
    }

    public void setStandingType(java.lang.String standingType) {
        this.standingType = standingType;
    }

    public void setSubSeasonId(java.lang.Integer subSeasonId) {
        this.subSeasonId = subSeasonId;
    }

    public void setLastUpdated(java.lang.String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setDurationScope(java.lang.String durationScope) {
        this.durationScope = durationScope;
    }

    public void setCompetitionScope(java.lang.String competitionScope) {
        this.competitionScope = competitionScope;
    }

    public void setCompetitionScopeId(java.lang.String competitionScopeId) {
        this.competitionScopeId = competitionScopeId;
    }

    public void setAlignmentScope(java.lang.String alignmentScope) {
        this.alignmentScope = alignmentScope;
    }

    public void setSiteScope(java.lang.String siteScope) {
        this.siteScope = siteScope;
    }

    public void setScopingLabel(java.lang.String scopingLabel) {
        this.scopingLabel = scopingLabel;
    }

    public void setPublisherId(java.lang.Integer publisherId) {
        this.publisherId = publisherId;
    }

    public void setSource(java.lang.String source) {
        this.source = source;
    }
}
