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
@Table(name = "american_football_penalties_stats")
public class AmericanFootballPenaltiesStats implements Serializable {
  private static final long serialVersionUID = 166867004215993663L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: penalties_total. */
  @Basic
  @Column(name = "penalties_total", length = 100)
  private java.lang.String penaltiesTotal;
  /** Description: penalty_yards. */
  @Basic
  @Column(name = "penalty_yards", length = 100)
  private java.lang.String penaltyYards;
  /** Description: penalty_first_downs. */
  @Basic
  @Column(name = "penalty_first_downs", length = 100)
  private java.lang.String penaltyFirstDowns;

  public AmericanFootballPenaltiesStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getPenaltiesTotal() {
    return this.penaltiesTotal;
  }

  public java.lang.String getPenaltyYards() {
    return this.penaltyYards;
  }

  public java.lang.String getPenaltyFirstDowns() {
    return this.penaltyFirstDowns;
  }

  public void setPenaltiesTotal(java.lang.String penaltiesTotal) {
    this.penaltiesTotal = penaltiesTotal;
  }

  public void setPenaltyYards(java.lang.String penaltyYards) {
    this.penaltyYards = penaltyYards;
  }

  public void setPenaltyFirstDowns(java.lang.String penaltyFirstDowns) {
    this.penaltyFirstDowns = penaltyFirstDowns;
  }
}
