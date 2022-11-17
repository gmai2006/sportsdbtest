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
@Table(name = "core_person_stats")
public class CorePersonStats implements Serializable {
  private static final long serialVersionUID = 166867004229127769L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: time_played_event. */
  @Basic
  @Column(name = "time_played_event", length = 40)
  private java.lang.String timePlayedEvent;
  /** Description: time_played_total. */
  @Basic
  @Column(name = "time_played_total", length = 40)
  private java.lang.String timePlayedTotal;
  /** Description: time_played_event_average. */
  @Basic
  @Column(name = "time_played_event_average", length = 40)
  private java.lang.String timePlayedEventAverage;
  /** Description: events_played. */
  @Basic
  @Column(name = "events_played")
  private java.lang.Integer eventsPlayed;
  /** Description: events_started. */
  @Basic
  @Column(name = "events_started")
  private java.lang.Integer eventsStarted;
  /** Description: position_id. */
  @Basic
  @Column(name = "position_id")
  private java.lang.Integer positionId;

  public CorePersonStats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getTimePlayedEvent() {
    return this.timePlayedEvent;
  }

  public java.lang.String getTimePlayedTotal() {
    return this.timePlayedTotal;
  }

  public java.lang.String getTimePlayedEventAverage() {
    return this.timePlayedEventAverage;
  }

  public java.lang.Integer getEventsPlayed() {
    return this.eventsPlayed;
  }

  public java.lang.Integer getEventsStarted() {
    return this.eventsStarted;
  }

  public java.lang.Integer getPositionId() {
    return this.positionId;
  }

  public void setTimePlayedEvent(java.lang.String timePlayedEvent) {
    this.timePlayedEvent = timePlayedEvent;
  }

  public void setTimePlayedTotal(java.lang.String timePlayedTotal) {
    this.timePlayedTotal = timePlayedTotal;
  }

  public void setTimePlayedEventAverage(java.lang.String timePlayedEventAverage) {
    this.timePlayedEventAverage = timePlayedEventAverage;
  }

  public void setEventsPlayed(java.lang.Integer eventsPlayed) {
    this.eventsPlayed = eventsPlayed;
  }

  public void setEventsStarted(java.lang.Integer eventsStarted) {
    this.eventsStarted = eventsStarted;
  }

  public void setPositionId(java.lang.Integer positionId) {
    this.positionId = positionId;
  }
}
