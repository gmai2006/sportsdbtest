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
@Table(name = "basketball_team_stats")
public class BasketballTeamStats implements Serializable {
  private static final long serialVersionUID = 166867004228426L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: timeouts_left. */
  @Basic
  @Column(name = "timeouts_left", length = 100)
  private java.lang.String timeoutsLeft;
  /** Description: largest_lead. */
  @Basic
  @Column(name = "largest_lead", length = 100)
  private java.lang.String largestLead;
  /** Description: fouls_total. */
  @Basic
  @Column(name = "fouls_total", length = 100)
  private java.lang.String foulsTotal;
  /** Description: turnover_margin. */
  @Basic
  @Column(name = "turnover_margin", length = 100)
  private java.lang.String turnoverMargin;

  public BasketballTeamStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getTimeoutsLeft() {
    return this.timeoutsLeft;
  }

  public java.lang.String getLargestLead() {
    return this.largestLead;
  }

  public java.lang.String getFoulsTotal() {
    return this.foulsTotal;
  }

  public java.lang.String getTurnoverMargin() {
    return this.turnoverMargin;
  }

  public void setTimeoutsLeft(java.lang.String timeoutsLeft) {
    this.timeoutsLeft = timeoutsLeft;
  }

  public void setLargestLead(java.lang.String largestLead) {
    this.largestLead = largestLead;
  }

  public void setFoulsTotal(java.lang.String foulsTotal) {
    this.foulsTotal = foulsTotal;
  }

  public void setTurnoverMargin(java.lang.String turnoverMargin) {
    this.turnoverMargin = turnoverMargin;
  }
}
