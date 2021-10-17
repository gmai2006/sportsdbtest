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
@Table(name = "baseball_offensive_stats")
public class BaseballOffensiveStats implements Serializable {
    private static final long serialVersionUID = 163445241884680914L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: average. */
    @Basic
    @Column(name = "average")
    private java.lang.Float average;
    /** Description: runs_scored. */
    @Basic
    @Column(name = "runs_scored")
    private java.lang.Integer runsScored;
    /** Description: at_bats. */
    @Basic
    @Column(name = "at_bats")
    private java.lang.Integer atBats;
    /** Description: hits. */
    @Basic
    @Column(name = "hits")
    private java.lang.Integer hits;
    /** Description: rbi. */
    @Basic
    @Column(name = "rbi")
    private java.lang.Integer rbi;
    /** Description: total_bases. */
    @Basic
    @Column(name = "total_bases")
    private java.lang.Integer totalBases;
    /** Description: slugging_percentage. */
    @Basic
    @Column(name = "slugging_percentage")
    private java.lang.Float sluggingPercentage;
    /** Description: bases_on_balls. */
    @Basic
    @Column(name = "bases_on_balls")
    private java.lang.Integer basesOnBalls;
    /** Description: strikeouts. */
    @Basic
    @Column(name = "strikeouts")
    private java.lang.Integer strikeouts;
    /** Description: left_on_base. */
    @Basic
    @Column(name = "left_on_base")
    private java.lang.Integer leftOnBase;
    /** Description: left_in_scoring_position. */
    @Basic
    @Column(name = "left_in_scoring_position")
    private java.lang.Integer leftInScoringPosition;
    /** Description: singles. */
    @Basic
    @Column(name = "singles")
    private java.lang.Integer singles;
    /** Description: doubles. */
    @Basic
    @Column(name = "doubles")
    private java.lang.Integer doubles;
    /** Description: triples. */
    @Basic
    @Column(name = "triples")
    private java.lang.Integer triples;
    /** Description: home_runs. */
    @Basic
    @Column(name = "home_runs")
    private java.lang.Integer homeRuns;
    /** Description: grand_slams. */
    @Basic
    @Column(name = "grand_slams")
    private java.lang.Integer grandSlams;
    /** Description: at_bats_per_rbi. */
    @Basic
    @Column(name = "at_bats_per_rbi")
    private java.lang.Float atBatsPerRbi;
    /** Description: plate_appearances_per_rbi. */
    @Basic
    @Column(name = "plate_appearances_per_rbi")
    private java.lang.Float plateAppearancesPerRbi;
    /** Description: at_bats_per_home_run. */
    @Basic
    @Column(name = "at_bats_per_home_run")
    private java.lang.Float atBatsPerHomeRun;
    /** Description: plate_appearances_per_home_run. */
    @Basic
    @Column(name = "plate_appearances_per_home_run")
    private java.lang.Float plateAppearancesPerHomeRun;
    /** Description: sac_flies. */
    @Basic
    @Column(name = "sac_flies")
    private java.lang.Integer sacFlies;
    /** Description: sac_bunts. */
    @Basic
    @Column(name = "sac_bunts")
    private java.lang.Integer sacBunts;
    /** Description: grounded_into_double_play. */
    @Basic
    @Column(name = "grounded_into_double_play")
    private java.lang.Integer groundedIntoDoublePlay;
    /** Description: moved_up. */
    @Basic
    @Column(name = "moved_up")
    private java.lang.Integer movedUp;
    /** Description: on_base_percentage. */
    @Basic
    @Column(name = "on_base_percentage")
    private java.lang.Float onBasePercentage;
    /** Description: stolen_bases. */
    @Basic
    @Column(name = "stolen_bases")
    private java.lang.Integer stolenBases;
    /** Description: stolen_bases_caught. */
    @Basic
    @Column(name = "stolen_bases_caught")
    private java.lang.Integer stolenBasesCaught;
    /** Description: stolen_bases_average. */
    @Basic
    @Column(name = "stolen_bases_average")
    private java.lang.Float stolenBasesAverage;
    /** Description: hit_by_pitch. */
    @Basic
    @Column(name = "hit_by_pitch")
    private java.lang.Integer hitByPitch;
    /** Description: defensive_interferance_reaches. */
    @Basic
    @Column(name = "defensive_interferance_reaches")
    private java.lang.Integer defensiveInterferanceReaches;
    /** Description: on_base_plus_slugging. */
    @Basic
    @Column(name = "on_base_plus_slugging")
    private java.lang.Float onBasePlusSlugging;
    /** Description: plate_appearances. */
    @Basic
    @Column(name = "plate_appearances")
    private java.lang.Integer plateAppearances;
    /** Description: hits_extra_base. */
    @Basic
    @Column(name = "hits_extra_base")
    private java.lang.Integer hitsExtraBase;

    public BaseballOffensiveStats() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Float getAverage() {
        return this.average;
    }

    public java.lang.Integer getRunsScored() {
        return this.runsScored;
    }

    public java.lang.Integer getAtBats() {
        return this.atBats;
    }

    public java.lang.Integer getHits() {
        return this.hits;
    }

    public java.lang.Integer getRbi() {
        return this.rbi;
    }

    public java.lang.Integer getTotalBases() {
        return this.totalBases;
    }

    public java.lang.Float getSluggingPercentage() {
        return this.sluggingPercentage;
    }

    public java.lang.Integer getBasesOnBalls() {
        return this.basesOnBalls;
    }

    public java.lang.Integer getStrikeouts() {
        return this.strikeouts;
    }

    public java.lang.Integer getLeftOnBase() {
        return this.leftOnBase;
    }

    public java.lang.Integer getLeftInScoringPosition() {
        return this.leftInScoringPosition;
    }

    public java.lang.Integer getSingles() {
        return this.singles;
    }

    public java.lang.Integer getDoubles() {
        return this.doubles;
    }

    public java.lang.Integer getTriples() {
        return this.triples;
    }

    public java.lang.Integer getHomeRuns() {
        return this.homeRuns;
    }

    public java.lang.Integer getGrandSlams() {
        return this.grandSlams;
    }

    public java.lang.Float getAtBatsPerRbi() {
        return this.atBatsPerRbi;
    }

    public java.lang.Float getPlateAppearancesPerRbi() {
        return this.plateAppearancesPerRbi;
    }

    public java.lang.Float getAtBatsPerHomeRun() {
        return this.atBatsPerHomeRun;
    }

    public java.lang.Float getPlateAppearancesPerHomeRun() {
        return this.plateAppearancesPerHomeRun;
    }

    public java.lang.Integer getSacFlies() {
        return this.sacFlies;
    }

    public java.lang.Integer getSacBunts() {
        return this.sacBunts;
    }

    public java.lang.Integer getGroundedIntoDoublePlay() {
        return this.groundedIntoDoublePlay;
    }

    public java.lang.Integer getMovedUp() {
        return this.movedUp;
    }

    public java.lang.Float getOnBasePercentage() {
        return this.onBasePercentage;
    }

    public java.lang.Integer getStolenBases() {
        return this.stolenBases;
    }

    public java.lang.Integer getStolenBasesCaught() {
        return this.stolenBasesCaught;
    }

    public java.lang.Float getStolenBasesAverage() {
        return this.stolenBasesAverage;
    }

    public java.lang.Integer getHitByPitch() {
        return this.hitByPitch;
    }

    public java.lang.Integer getDefensiveInterferanceReaches() {
        return this.defensiveInterferanceReaches;
    }

    public java.lang.Float getOnBasePlusSlugging() {
        return this.onBasePlusSlugging;
    }

    public java.lang.Integer getPlateAppearances() {
        return this.plateAppearances;
    }

    public java.lang.Integer getHitsExtraBase() {
        return this.hitsExtraBase;
    }

    public void setAverage(java.lang.Float average) {
        this.average = average;
    }

    public void setRunsScored(java.lang.Integer runsScored) {
        this.runsScored = runsScored;
    }

    public void setAtBats(java.lang.Integer atBats) {
        this.atBats = atBats;
    }

    public void setHits(java.lang.Integer hits) {
        this.hits = hits;
    }

    public void setRbi(java.lang.Integer rbi) {
        this.rbi = rbi;
    }

    public void setTotalBases(java.lang.Integer totalBases) {
        this.totalBases = totalBases;
    }

    public void setSluggingPercentage(java.lang.Float sluggingPercentage) {
        this.sluggingPercentage = sluggingPercentage;
    }

    public void setBasesOnBalls(java.lang.Integer basesOnBalls) {
        this.basesOnBalls = basesOnBalls;
    }

    public void setStrikeouts(java.lang.Integer strikeouts) {
        this.strikeouts = strikeouts;
    }

    public void setLeftOnBase(java.lang.Integer leftOnBase) {
        this.leftOnBase = leftOnBase;
    }

    public void setLeftInScoringPosition(java.lang.Integer leftInScoringPosition) {
        this.leftInScoringPosition = leftInScoringPosition;
    }

    public void setSingles(java.lang.Integer singles) {
        this.singles = singles;
    }

    public void setDoubles(java.lang.Integer doubles) {
        this.doubles = doubles;
    }

    public void setTriples(java.lang.Integer triples) {
        this.triples = triples;
    }

    public void setHomeRuns(java.lang.Integer homeRuns) {
        this.homeRuns = homeRuns;
    }

    public void setGrandSlams(java.lang.Integer grandSlams) {
        this.grandSlams = grandSlams;
    }

    public void setAtBatsPerRbi(java.lang.Float atBatsPerRbi) {
        this.atBatsPerRbi = atBatsPerRbi;
    }

    public void setPlateAppearancesPerRbi(java.lang.Float plateAppearancesPerRbi) {
        this.plateAppearancesPerRbi = plateAppearancesPerRbi;
    }

    public void setAtBatsPerHomeRun(java.lang.Float atBatsPerHomeRun) {
        this.atBatsPerHomeRun = atBatsPerHomeRun;
    }

    public void setPlateAppearancesPerHomeRun(java.lang.Float plateAppearancesPerHomeRun) {
        this.plateAppearancesPerHomeRun = plateAppearancesPerHomeRun;
    }

    public void setSacFlies(java.lang.Integer sacFlies) {
        this.sacFlies = sacFlies;
    }

    public void setSacBunts(java.lang.Integer sacBunts) {
        this.sacBunts = sacBunts;
    }

    public void setGroundedIntoDoublePlay(java.lang.Integer groundedIntoDoublePlay) {
        this.groundedIntoDoublePlay = groundedIntoDoublePlay;
    }

    public void setMovedUp(java.lang.Integer movedUp) {
        this.movedUp = movedUp;
    }

    public void setOnBasePercentage(java.lang.Float onBasePercentage) {
        this.onBasePercentage = onBasePercentage;
    }

    public void setStolenBases(java.lang.Integer stolenBases) {
        this.stolenBases = stolenBases;
    }

    public void setStolenBasesCaught(java.lang.Integer stolenBasesCaught) {
        this.stolenBasesCaught = stolenBasesCaught;
    }

    public void setStolenBasesAverage(java.lang.Float stolenBasesAverage) {
        this.stolenBasesAverage = stolenBasesAverage;
    }

    public void setHitByPitch(java.lang.Integer hitByPitch) {
        this.hitByPitch = hitByPitch;
    }

    public void setDefensiveInterferanceReaches(java.lang.Integer defensiveInterferanceReaches) {
        this.defensiveInterferanceReaches = defensiveInterferanceReaches;
    }

    public void setOnBasePlusSlugging(java.lang.Float onBasePlusSlugging) {
        this.onBasePlusSlugging = onBasePlusSlugging;
    }

    public void setPlateAppearances(java.lang.Integer plateAppearances) {
        this.plateAppearances = plateAppearances;
    }

    public void setHitsExtraBase(java.lang.Integer hitsExtraBase) {
        this.hitsExtraBase = hitsExtraBase;
    }
}
