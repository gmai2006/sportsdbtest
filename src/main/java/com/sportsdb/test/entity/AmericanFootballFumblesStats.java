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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "american_football_fumbles_stats")
public class AmericanFootballFumblesStats implements Serializable {
  private static final long serialVersionUID = 166867004214052804L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: fumbles_committed. */
  @Basic
  @Column(name = "fumbles_committed", length = 100)
  private java.lang.String fumblesCommitted;
  /** Description: fumbles_forced. */
  @Basic
  @Column(name = "fumbles_forced", length = 100)
  private java.lang.String fumblesForced;
  /** Description: fumbles_recovered. */
  @Basic
  @Column(name = "fumbles_recovered", length = 100)
  private java.lang.String fumblesRecovered;
  /** Description: fumbles_lost. */
  @Basic
  @Column(name = "fumbles_lost", length = 100)
  private java.lang.String fumblesLost;
  /** Description: fumbles_yards_gained. */
  @Basic
  @Column(name = "fumbles_yards_gained", length = 100)
  private java.lang.String fumblesYardsGained;
  /** Description: fumbles_own_committed. */
  @Basic
  @Column(name = "fumbles_own_committed", length = 100)
  private java.lang.String fumblesOwnCommitted;
  /** Description: fumbles_own_recovered. */
  @Basic
  @Column(name = "fumbles_own_recovered", length = 100)
  private java.lang.String fumblesOwnRecovered;
  /** Description: fumbles_own_lost. */
  @Basic
  @Column(name = "fumbles_own_lost", length = 100)
  private java.lang.String fumblesOwnLost;
  /** Description: fumbles_own_yards_gained. */
  @Basic
  @Column(name = "fumbles_own_yards_gained", length = 100)
  private java.lang.String fumblesOwnYardsGained;
  /** Description: fumbles_opposing_committed. */
  @Basic
  @Column(name = "fumbles_opposing_committed", length = 100)
  private java.lang.String fumblesOpposingCommitted;
  /** Description: fumbles_opposing_recovered. */
  @Basic
  @Column(name = "fumbles_opposing_recovered", length = 100)
  private java.lang.String fumblesOpposingRecovered;
  /** Description: fumbles_opposing_lost. */
  @Basic
  @Column(name = "fumbles_opposing_lost", length = 100)
  private java.lang.String fumblesOpposingLost;
  /** Description: fumbles_opposing_yards_gained. */
  @Basic
  @Column(name = "fumbles_opposing_yards_gained", length = 100)
  private java.lang.String fumblesOpposingYardsGained;

  public AmericanFootballFumblesStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getFumblesCommitted() {
    return this.fumblesCommitted;
  }

  public java.lang.String getFumblesForced() {
    return this.fumblesForced;
  }

  public java.lang.String getFumblesRecovered() {
    return this.fumblesRecovered;
  }

  public java.lang.String getFumblesLost() {
    return this.fumblesLost;
  }

  public java.lang.String getFumblesYardsGained() {
    return this.fumblesYardsGained;
  }

  public java.lang.String getFumblesOwnCommitted() {
    return this.fumblesOwnCommitted;
  }

  public java.lang.String getFumblesOwnRecovered() {
    return this.fumblesOwnRecovered;
  }

  public java.lang.String getFumblesOwnLost() {
    return this.fumblesOwnLost;
  }

  public java.lang.String getFumblesOwnYardsGained() {
    return this.fumblesOwnYardsGained;
  }

  public java.lang.String getFumblesOpposingCommitted() {
    return this.fumblesOpposingCommitted;
  }

  public java.lang.String getFumblesOpposingRecovered() {
    return this.fumblesOpposingRecovered;
  }

  public java.lang.String getFumblesOpposingLost() {
    return this.fumblesOpposingLost;
  }

  public java.lang.String getFumblesOpposingYardsGained() {
    return this.fumblesOpposingYardsGained;
  }

  public void setFumblesCommitted(java.lang.String fumblesCommitted) {
    this.fumblesCommitted = fumblesCommitted;
  }

  public void setFumblesForced(java.lang.String fumblesForced) {
    this.fumblesForced = fumblesForced;
  }

  public void setFumblesRecovered(java.lang.String fumblesRecovered) {
    this.fumblesRecovered = fumblesRecovered;
  }

  public void setFumblesLost(java.lang.String fumblesLost) {
    this.fumblesLost = fumblesLost;
  }

  public void setFumblesYardsGained(java.lang.String fumblesYardsGained) {
    this.fumblesYardsGained = fumblesYardsGained;
  }

  public void setFumblesOwnCommitted(java.lang.String fumblesOwnCommitted) {
    this.fumblesOwnCommitted = fumblesOwnCommitted;
  }

  public void setFumblesOwnRecovered(java.lang.String fumblesOwnRecovered) {
    this.fumblesOwnRecovered = fumblesOwnRecovered;
  }

  public void setFumblesOwnLost(java.lang.String fumblesOwnLost) {
    this.fumblesOwnLost = fumblesOwnLost;
  }

  public void setFumblesOwnYardsGained(java.lang.String fumblesOwnYardsGained) {
    this.fumblesOwnYardsGained = fumblesOwnYardsGained;
  }

  public void setFumblesOpposingCommitted(java.lang.String fumblesOpposingCommitted) {
    this.fumblesOpposingCommitted = fumblesOpposingCommitted;
  }

  public void setFumblesOpposingRecovered(java.lang.String fumblesOpposingRecovered) {
    this.fumblesOpposingRecovered = fumblesOpposingRecovered;
  }

  public void setFumblesOpposingLost(java.lang.String fumblesOpposingLost) {
    this.fumblesOpposingLost = fumblesOpposingLost;
  }

  public void setFumblesOpposingYardsGained(java.lang.String fumblesOpposingYardsGained) {
    this.fumblesOpposingYardsGained = fumblesOpposingYardsGained;
  }
}
