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
@Table(name = "baseball_defensive_players")
public class BaseballDefensivePlayers implements Serializable {
    private static final long serialVersionUID = 16344524188246209L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: baseball_defensive_group_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "baseball_defensive_group_id")
    private java.lang.Integer baseballDefensiveGroupId;
    /** Description: player_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "player_id")
    private java.lang.Integer playerId;
    /** Description: position_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "position_id")
    private java.lang.Integer positionId;

    public BaseballDefensivePlayers() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getBaseballDefensiveGroupId() {
        return this.baseballDefensiveGroupId;
    }

    public java.lang.Integer getPlayerId() {
        return this.playerId;
    }

    public java.lang.Integer getPositionId() {
        return this.positionId;
    }

    public void setBaseballDefensiveGroupId(java.lang.Integer baseballDefensiveGroupId) {
        this.baseballDefensiveGroupId = baseballDefensiveGroupId;
    }

    public void setPlayerId(java.lang.Integer playerId) {
        this.playerId = playerId;
    }

    public void setPositionId(java.lang.Integer positionId) {
        this.positionId = positionId;
    }
}
