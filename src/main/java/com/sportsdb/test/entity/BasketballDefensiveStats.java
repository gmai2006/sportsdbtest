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
@Table(name = "basketball_defensive_stats")
public class BasketballDefensiveStats implements Serializable {
    private static final long serialVersionUID = 163445241887636522L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: steals_total. */
    @Basic
    @Column(name = "steals_total", length = 100)
    private java.lang.String stealsTotal;
    /** Description: steals_per_game. */
    @Basic
    @Column(name = "steals_per_game", length = 100)
    private java.lang.String stealsPerGame;
    /** Description: blocks_total. */
    @Basic
    @Column(name = "blocks_total", length = 100)
    private java.lang.String blocksTotal;
    /** Description: blocks_per_game. */
    @Basic
    @Column(name = "blocks_per_game", length = 100)
    private java.lang.String blocksPerGame;

    public BasketballDefensiveStats() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getStealsTotal() {
        return this.stealsTotal;
    }

    public java.lang.String getStealsPerGame() {
        return this.stealsPerGame;
    }

    public java.lang.String getBlocksTotal() {
        return this.blocksTotal;
    }

    public java.lang.String getBlocksPerGame() {
        return this.blocksPerGame;
    }

    public void setStealsTotal(java.lang.String stealsTotal) {
        this.stealsTotal = stealsTotal;
    }

    public void setStealsPerGame(java.lang.String stealsPerGame) {
        this.stealsPerGame = stealsPerGame;
    }

    public void setBlocksTotal(java.lang.String blocksTotal) {
        this.blocksTotal = blocksTotal;
    }

    public void setBlocksPerGame(java.lang.String blocksPerGame) {
        this.blocksPerGame = blocksPerGame;
    }
}
