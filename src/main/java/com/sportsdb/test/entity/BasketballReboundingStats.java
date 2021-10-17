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
@Table(name = "basketball_rebounding_stats")
public class BasketballReboundingStats implements Serializable {
    private static final long serialVersionUID = 163445241889920895L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: rebounds_total. */
    @Basic
    @Column(name = "rebounds_total", length = 100)
    private java.lang.String reboundsTotal;
    /** Description: rebounds_per_game. */
    @Basic
    @Column(name = "rebounds_per_game", length = 100)
    private java.lang.String reboundsPerGame;
    /** Description: rebounds_defensive. */
    @Basic
    @Column(name = "rebounds_defensive", length = 100)
    private java.lang.String reboundsDefensive;
    /** Description: rebounds_offensive. */
    @Basic
    @Column(name = "rebounds_offensive", length = 100)
    private java.lang.String reboundsOffensive;
    /** Description: team_rebounds_total. */
    @Basic
    @Column(name = "team_rebounds_total", length = 100)
    private java.lang.String teamReboundsTotal;
    /** Description: team_rebounds_per_game. */
    @Basic
    @Column(name = "team_rebounds_per_game", length = 100)
    private java.lang.String teamReboundsPerGame;
    /** Description: team_rebounds_defensive. */
    @Basic
    @Column(name = "team_rebounds_defensive", length = 100)
    private java.lang.String teamReboundsDefensive;
    /** Description: team_rebounds_offensive. */
    @Basic
    @Column(name = "team_rebounds_offensive", length = 100)
    private java.lang.String teamReboundsOffensive;

    public BasketballReboundingStats() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getReboundsTotal() {
        return this.reboundsTotal;
    }

    public java.lang.String getReboundsPerGame() {
        return this.reboundsPerGame;
    }

    public java.lang.String getReboundsDefensive() {
        return this.reboundsDefensive;
    }

    public java.lang.String getReboundsOffensive() {
        return this.reboundsOffensive;
    }

    public java.lang.String getTeamReboundsTotal() {
        return this.teamReboundsTotal;
    }

    public java.lang.String getTeamReboundsPerGame() {
        return this.teamReboundsPerGame;
    }

    public java.lang.String getTeamReboundsDefensive() {
        return this.teamReboundsDefensive;
    }

    public java.lang.String getTeamReboundsOffensive() {
        return this.teamReboundsOffensive;
    }

    public void setReboundsTotal(java.lang.String reboundsTotal) {
        this.reboundsTotal = reboundsTotal;
    }

    public void setReboundsPerGame(java.lang.String reboundsPerGame) {
        this.reboundsPerGame = reboundsPerGame;
    }

    public void setReboundsDefensive(java.lang.String reboundsDefensive) {
        this.reboundsDefensive = reboundsDefensive;
    }

    public void setReboundsOffensive(java.lang.String reboundsOffensive) {
        this.reboundsOffensive = reboundsOffensive;
    }

    public void setTeamReboundsTotal(java.lang.String teamReboundsTotal) {
        this.teamReboundsTotal = teamReboundsTotal;
    }

    public void setTeamReboundsPerGame(java.lang.String teamReboundsPerGame) {
        this.teamReboundsPerGame = teamReboundsPerGame;
    }

    public void setTeamReboundsDefensive(java.lang.String teamReboundsDefensive) {
        this.teamReboundsDefensive = teamReboundsDefensive;
    }

    public void setTeamReboundsOffensive(java.lang.String teamReboundsOffensive) {
        this.teamReboundsOffensive = teamReboundsOffensive;
    }
}
