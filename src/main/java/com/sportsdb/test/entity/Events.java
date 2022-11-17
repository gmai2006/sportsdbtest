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
@Table(name = "events")
public class Events implements Serializable {
  private static final long serialVersionUID = 166867004234045868L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: event_key. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "event_key", length = 100)
  private java.lang.String eventKey;
  /** Description: publisher_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "publisher_id")
  private java.lang.Integer publisherId;
  /** Description: start_date_time. */
  @Basic
  @Column(name = "start_date_time")
  private java.util.Date startDateTime;
  /** Description: site_id. */
  @Basic
  @Column(name = "site_id")
  private java.lang.Integer siteId;
  /** Description: site_alignment. */
  @Basic
  @Column(name = "site_alignment", length = 100)
  private java.lang.String siteAlignment;
  /** Description: event_status. */
  @Basic
  @Column(name = "event_status", length = 100)
  private java.lang.String eventStatus;
  /** Description: duration. */
  @Basic
  @Column(name = "duration", length = 100)
  private java.lang.String duration;
  /** Description: attendance. */
  @Basic
  @Column(name = "attendance", length = 100)
  private java.lang.String attendance;
  /** Description: last_update. */
  @Basic
  @Column(name = "last_update")
  private java.util.Date lastUpdate;

  public Events() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getEventKey() {
    return this.eventKey;
  }

  public java.lang.Integer getPublisherId() {
    return this.publisherId;
  }

  public java.util.Date getStartDateTime() {
    return this.startDateTime;
  }

  public java.lang.Integer getSiteId() {
    return this.siteId;
  }

  public java.lang.String getSiteAlignment() {
    return this.siteAlignment;
  }

  public java.lang.String getEventStatus() {
    return this.eventStatus;
  }

  public java.lang.String getDuration() {
    return this.duration;
  }

  public java.lang.String getAttendance() {
    return this.attendance;
  }

  public java.util.Date getLastUpdate() {
    return this.lastUpdate;
  }

  public void setEventKey(java.lang.String eventKey) {
    this.eventKey = eventKey;
  }

  public void setPublisherId(java.lang.Integer publisherId) {
    this.publisherId = publisherId;
  }

  public void setStartDateTime(java.util.Date startDateTime) {
    this.startDateTime = startDateTime;
  }

  public void setSiteId(java.lang.Integer siteId) {
    this.siteId = siteId;
  }

  public void setSiteAlignment(java.lang.String siteAlignment) {
    this.siteAlignment = siteAlignment;
  }

  public void setEventStatus(java.lang.String eventStatus) {
    this.eventStatus = eventStatus;
  }

  public void setDuration(java.lang.String duration) {
    this.duration = duration;
  }

  public void setAttendance(java.lang.String attendance) {
    this.attendance = attendance;
  }

  public void setLastUpdate(java.util.Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }
}
