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
@Table(name = "documents")
public class Documents implements Serializable {
  private static final long serialVersionUID = 166867004233072473L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: doc_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "doc_id", length = 75)
  private java.lang.String docId;
  /** Description: publisher_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "publisher_id")
  private java.lang.Integer publisherId;
  /** Description: date_time. */
  @Basic
  @Column(name = "date_time")
  private java.util.Date dateTime;
  /** Description: title. */
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: language. */
  @Basic
  @Column(name = "language", length = 100)
  private java.lang.String language;
  /** Description: priority. */
  @Basic
  @Column(name = "priority", length = 100)
  private java.lang.String priority;
  /** Description: revision_id. */
  @Basic
  @Column(name = "revision_id", length = 75)
  private java.lang.String revisionId;
  /** Description: stats_coverage. */
  @Basic
  @Column(name = "stats_coverage", length = 100)
  private java.lang.String statsCoverage;
  /** Description: document_fixture_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "document_fixture_id")
  private java.lang.Integer documentFixtureId;
  /** Description: source_id. */
  @Basic
  @Column(name = "source_id")
  private java.lang.Integer sourceId;
  /** Description: db_loading_date_time. */
  @Basic
  @Column(name = "db_loading_date_time")
  private java.util.Date dbLoadingDateTime;

  public Documents() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getDocId() {
    return this.docId;
  }

  public java.lang.Integer getPublisherId() {
    return this.publisherId;
  }

  public java.util.Date getDateTime() {
    return this.dateTime;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.String getLanguage() {
    return this.language;
  }

  public java.lang.String getPriority() {
    return this.priority;
  }

  public java.lang.String getRevisionId() {
    return this.revisionId;
  }

  public java.lang.String getStatsCoverage() {
    return this.statsCoverage;
  }

  public java.lang.Integer getDocumentFixtureId() {
    return this.documentFixtureId;
  }

  public java.lang.Integer getSourceId() {
    return this.sourceId;
  }

  public java.util.Date getDbLoadingDateTime() {
    return this.dbLoadingDateTime;
  }

  public void setDocId(java.lang.String docId) {
    this.docId = docId;
  }

  public void setPublisherId(java.lang.Integer publisherId) {
    this.publisherId = publisherId;
  }

  public void setDateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setLanguage(java.lang.String language) {
    this.language = language;
  }

  public void setPriority(java.lang.String priority) {
    this.priority = priority;
  }

  public void setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
  }

  public void setStatsCoverage(java.lang.String statsCoverage) {
    this.statsCoverage = statsCoverage;
  }

  public void setDocumentFixtureId(java.lang.Integer documentFixtureId) {
    this.documentFixtureId = documentFixtureId;
  }

  public void setSourceId(java.lang.Integer sourceId) {
    this.sourceId = sourceId;
  }

  public void setDbLoadingDateTime(java.util.Date dbLoadingDateTime) {
    this.dbLoadingDateTime = dbLoadingDateTime;
  }
}
