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
@Table(name = "american_football_down_progress_stats")
public class AmericanFootballDownProgressStats implements Serializable {
  private static final long serialVersionUID = 166867004212771687L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: first_downs_total. */
  @Basic
  @Column(name = "first_downs_total", length = 100)
  private java.lang.String firstDownsTotal;
  /** Description: first_downs_pass. */
  @Basic
  @Column(name = "first_downs_pass", length = 100)
  private java.lang.String firstDownsPass;
  /** Description: first_downs_run. */
  @Basic
  @Column(name = "first_downs_run", length = 100)
  private java.lang.String firstDownsRun;
  /** Description: first_downs_penalty. */
  @Basic
  @Column(name = "first_downs_penalty", length = 100)
  private java.lang.String firstDownsPenalty;
  /** Description: conversions_third_down. */
  @Basic
  @Column(name = "conversions_third_down", length = 100)
  private java.lang.String conversionsThirdDown;
  /** Description: conversions_third_down_attempts. */
  @Basic
  @Column(name = "conversions_third_down_attempts", length = 100)
  private java.lang.String conversionsThirdDownAttempts;
  /** Description: conversions_third_down_percentage. */
  @Basic
  @Column(name = "conversions_third_down_percentage", length = 100)
  private java.lang.String conversionsThirdDownPercentage;
  /** Description: conversions_fourth_down. */
  @Basic
  @Column(name = "conversions_fourth_down", length = 100)
  private java.lang.String conversionsFourthDown;
  /** Description: conversions_fourth_down_attempts. */
  @Basic
  @Column(name = "conversions_fourth_down_attempts", length = 100)
  private java.lang.String conversionsFourthDownAttempts;
  /** Description: conversions_fourth_down_percentage. */
  @Basic
  @Column(name = "conversions_fourth_down_percentage", length = 100)
  private java.lang.String conversionsFourthDownPercentage;

  public AmericanFootballDownProgressStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getFirstDownsTotal() {
    return this.firstDownsTotal;
  }

  public java.lang.String getFirstDownsPass() {
    return this.firstDownsPass;
  }

  public java.lang.String getFirstDownsRun() {
    return this.firstDownsRun;
  }

  public java.lang.String getFirstDownsPenalty() {
    return this.firstDownsPenalty;
  }

  public java.lang.String getConversionsThirdDown() {
    return this.conversionsThirdDown;
  }

  public java.lang.String getConversionsThirdDownAttempts() {
    return this.conversionsThirdDownAttempts;
  }

  public java.lang.String getConversionsThirdDownPercentage() {
    return this.conversionsThirdDownPercentage;
  }

  public java.lang.String getConversionsFourthDown() {
    return this.conversionsFourthDown;
  }

  public java.lang.String getConversionsFourthDownAttempts() {
    return this.conversionsFourthDownAttempts;
  }

  public java.lang.String getConversionsFourthDownPercentage() {
    return this.conversionsFourthDownPercentage;
  }

  public void setFirstDownsTotal(java.lang.String firstDownsTotal) {
    this.firstDownsTotal = firstDownsTotal;
  }

  public void setFirstDownsPass(java.lang.String firstDownsPass) {
    this.firstDownsPass = firstDownsPass;
  }

  public void setFirstDownsRun(java.lang.String firstDownsRun) {
    this.firstDownsRun = firstDownsRun;
  }

  public void setFirstDownsPenalty(java.lang.String firstDownsPenalty) {
    this.firstDownsPenalty = firstDownsPenalty;
  }

  public void setConversionsThirdDown(java.lang.String conversionsThirdDown) {
    this.conversionsThirdDown = conversionsThirdDown;
  }

  public void setConversionsThirdDownAttempts(java.lang.String conversionsThirdDownAttempts) {
    this.conversionsThirdDownAttempts = conversionsThirdDownAttempts;
  }

  public void setConversionsThirdDownPercentage(java.lang.String conversionsThirdDownPercentage) {
    this.conversionsThirdDownPercentage = conversionsThirdDownPercentage;
  }

  public void setConversionsFourthDown(java.lang.String conversionsFourthDown) {
    this.conversionsFourthDown = conversionsFourthDown;
  }

  public void setConversionsFourthDownAttempts(java.lang.String conversionsFourthDownAttempts) {
    this.conversionsFourthDownAttempts = conversionsFourthDownAttempts;
  }

  public void setConversionsFourthDownPercentage(java.lang.String conversionsFourthDownPercentage) {
    this.conversionsFourthDownPercentage = conversionsFourthDownPercentage;
  }
}
