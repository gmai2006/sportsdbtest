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
@Table(name = "baseball_defensive_stats")
public class BaseballDefensiveStats implements Serializable {
  private static final long serialVersionUID = 16686700422239272L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: double_plays. */
  @Basic
  @Column(name = "double_plays")
  private java.lang.Integer doublePlays;
  /** Description: triple_plays. */
  @Basic
  @Column(name = "triple_plays")
  private java.lang.Integer triplePlays;
  /** Description: putouts. */
  @Basic
  @Column(name = "putouts")
  private java.lang.Integer putouts;
  /** Description: assists. */
  @Basic
  @Column(name = "assists")
  private java.lang.Integer assists;
  /** Description: errors. */
  @Basic
  @Column(name = "errors")
  private java.lang.Integer errors;
  /** Description: fielding_percentage. */
  @Basic
  @Column(name = "fielding_percentage")
  private java.lang.Float fieldingPercentage;
  /** Description: defensive_average. */
  @Basic
  @Column(name = "defensive_average")
  private java.lang.Float defensiveAverage;
  /** Description: errors_passed_ball. */
  @Basic
  @Column(name = "errors_passed_ball")
  private java.lang.Integer errorsPassedBall;
  /** Description: errors_catchers_interference. */
  @Basic
  @Column(name = "errors_catchers_interference")
  private java.lang.Integer errorsCatchersInterference;

  public BaseballDefensiveStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getDoublePlays() {
    return this.doublePlays;
  }

  public java.lang.Integer getTriplePlays() {
    return this.triplePlays;
  }

  public java.lang.Integer getPutouts() {
    return this.putouts;
  }

  public java.lang.Integer getAssists() {
    return this.assists;
  }

  public java.lang.Integer getErrors() {
    return this.errors;
  }

  public java.lang.Float getFieldingPercentage() {
    return this.fieldingPercentage;
  }

  public java.lang.Float getDefensiveAverage() {
    return this.defensiveAverage;
  }

  public java.lang.Integer getErrorsPassedBall() {
    return this.errorsPassedBall;
  }

  public java.lang.Integer getErrorsCatchersInterference() {
    return this.errorsCatchersInterference;
  }

  public void setDoublePlays(java.lang.Integer doublePlays) {
    this.doublePlays = doublePlays;
  }

  public void setTriplePlays(java.lang.Integer triplePlays) {
    this.triplePlays = triplePlays;
  }

  public void setPutouts(java.lang.Integer putouts) {
    this.putouts = putouts;
  }

  public void setAssists(java.lang.Integer assists) {
    this.assists = assists;
  }

  public void setErrors(java.lang.Integer errors) {
    this.errors = errors;
  }

  public void setFieldingPercentage(java.lang.Float fieldingPercentage) {
    this.fieldingPercentage = fieldingPercentage;
  }

  public void setDefensiveAverage(java.lang.Float defensiveAverage) {
    this.defensiveAverage = defensiveAverage;
  }

  public void setErrorsPassedBall(java.lang.Integer errorsPassedBall) {
    this.errorsPassedBall = errorsPassedBall;
  }

  public void setErrorsCatchersInterference(java.lang.Integer errorsCatchersInterference) {
    this.errorsCatchersInterference = errorsCatchersInterference;
  }
}
