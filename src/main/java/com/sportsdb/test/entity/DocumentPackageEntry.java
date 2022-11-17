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
@Table(name = "document_package_entry")
public class DocumentPackageEntry implements Serializable {
  private static final long serialVersionUID = 166867004232277168L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: document_package_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "document_package_id")
  private java.lang.Integer documentPackageId;
  /** Description: rank. */
  @Basic
  @Column(name = "rank", length = 100)
  private java.lang.String rank;
  /** Description: document_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "document_id")
  private java.lang.Integer documentId;
  /** Description: headline. */
  @Basic
  @Column(name = "headline", length = 100)
  private java.lang.String headline;
  /** Description: short_headline. */
  @Basic
  @Column(name = "short_headline", length = 100)
  private java.lang.String shortHeadline;

  public DocumentPackageEntry() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getDocumentPackageId() {
    return this.documentPackageId;
  }

  public java.lang.String getRank() {
    return this.rank;
  }

  public java.lang.Integer getDocumentId() {
    return this.documentId;
  }

  public java.lang.String getHeadline() {
    return this.headline;
  }

  public java.lang.String getShortHeadline() {
    return this.shortHeadline;
  }

  public void setDocumentPackageId(java.lang.Integer documentPackageId) {
    this.documentPackageId = documentPackageId;
  }

  public void setRank(java.lang.String rank) {
    this.rank = rank;
  }

  public void setDocumentId(java.lang.Integer documentId) {
    this.documentId = documentId;
  }

  public void setHeadline(java.lang.String headline) {
    this.headline = headline;
  }

  public void setShortHeadline(java.lang.String shortHeadline) {
    this.shortHeadline = shortHeadline;
  }
}
