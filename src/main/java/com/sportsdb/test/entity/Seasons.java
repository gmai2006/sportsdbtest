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
@Table(name = "seasons")
public class Seasons implements Serializable {
  private static final long serialVersionUID = 166867004251483379L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: season_key. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "season_key")
  private java.lang.Integer seasonKey;
  /** Description: publisher_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "publisher_id")
  private java.lang.Integer publisherId;
  /** Description: league_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "league_id")
  private java.lang.Integer leagueId;
  /** Description: start_date_time. */
  @Basic
  @Column(name = "start_date_time")
  private java.util.Date startDateTime;
  /** Description: end_date_time. */
  @Basic
  @Column(name = "end_date_time")
  private java.util.Date endDateTime;

  public Seasons() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getSeasonKey() {
    return this.seasonKey;
  }

  public java.lang.Integer getPublisherId() {
    return this.publisherId;
  }

  public java.lang.Integer getLeagueId() {
    return this.leagueId;
  }

  public java.util.Date getStartDateTime() {
    return this.startDateTime;
  }

  public java.util.Date getEndDateTime() {
    return this.endDateTime;
  }

  public void setSeasonKey(java.lang.Integer seasonKey) {
    this.seasonKey = seasonKey;
  }

  public void setPublisherId(java.lang.Integer publisherId) {
    this.publisherId = publisherId;
  }

  public void setLeagueId(java.lang.Integer leagueId) {
    this.leagueId = leagueId;
  }

  public void setStartDateTime(java.util.Date startDateTime) {
    this.startDateTime = startDateTime;
  }

  public void setEndDateTime(java.util.Date endDateTime) {
    this.endDateTime = endDateTime;
  }
}
