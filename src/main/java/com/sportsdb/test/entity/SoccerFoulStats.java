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
@Table(name = "soccer_foul_stats")
public class SoccerFoulStats implements Serializable {
  private static final long serialVersionUID = 166867004253343340L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: fouls_suffered. */
  @Basic
  @Column(name = "fouls_suffered", length = 100)
  private java.lang.String foulsSuffered;
  /** Description: fouls_commited. */
  @Basic
  @Column(name = "fouls_commited", length = 100)
  private java.lang.String foulsCommited;
  /** Description: cautions_total. */
  @Basic
  @Column(name = "cautions_total", length = 100)
  private java.lang.String cautionsTotal;
  /** Description: cautions_pending. */
  @Basic
  @Column(name = "cautions_pending", length = 100)
  private java.lang.String cautionsPending;
  /** Description: caution_points_total. */
  @Basic
  @Column(name = "caution_points_total", length = 100)
  private java.lang.String cautionPointsTotal;
  /** Description: caution_points_pending. */
  @Basic
  @Column(name = "caution_points_pending", length = 100)
  private java.lang.String cautionPointsPending;
  /** Description: ejections_total. */
  @Basic
  @Column(name = "ejections_total", length = 100)
  private java.lang.String ejectionsTotal;

  public SoccerFoulStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getFoulsSuffered() {
    return this.foulsSuffered;
  }

  public java.lang.String getFoulsCommited() {
    return this.foulsCommited;
  }

  public java.lang.String getCautionsTotal() {
    return this.cautionsTotal;
  }

  public java.lang.String getCautionsPending() {
    return this.cautionsPending;
  }

  public java.lang.String getCautionPointsTotal() {
    return this.cautionPointsTotal;
  }

  public java.lang.String getCautionPointsPending() {
    return this.cautionPointsPending;
  }

  public java.lang.String getEjectionsTotal() {
    return this.ejectionsTotal;
  }

  public void setFoulsSuffered(java.lang.String foulsSuffered) {
    this.foulsSuffered = foulsSuffered;
  }

  public void setFoulsCommited(java.lang.String foulsCommited) {
    this.foulsCommited = foulsCommited;
  }

  public void setCautionsTotal(java.lang.String cautionsTotal) {
    this.cautionsTotal = cautionsTotal;
  }

  public void setCautionsPending(java.lang.String cautionsPending) {
    this.cautionsPending = cautionsPending;
  }

  public void setCautionPointsTotal(java.lang.String cautionPointsTotal) {
    this.cautionPointsTotal = cautionPointsTotal;
  }

  public void setCautionPointsPending(java.lang.String cautionPointsPending) {
    this.cautionPointsPending = cautionPointsPending;
  }

  public void setEjectionsTotal(java.lang.String ejectionsTotal) {
    this.ejectionsTotal = ejectionsTotal;
  }
}
