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
@Table(name = "stats")
public class Stats implements Serializable {
  private static final long serialVersionUID = 16686700425556773L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: stat_repository_type. */
  @Basic
  @Column(name = "stat_repository_type", length = 100)
  private java.lang.String statRepositoryType;
  /** Description: stat_repository_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "stat_repository_id")
  private java.lang.Integer statRepositoryId;
  /** Description: stat_holder_type. */
  @Basic
  @Column(name = "stat_holder_type", length = 100)
  private java.lang.String statHolderType;
  /** Description: stat_holder_id. */
  @Basic
  @Column(name = "stat_holder_id")
  private java.lang.Integer statHolderId;
  /** Description: stat_coverage_type. */
  @Basic
  @Column(name = "stat_coverage_type", length = 100)
  private java.lang.String statCoverageType;
  /** Description: stat_coverage_id. */
  @Basic
  @Column(name = "stat_coverage_id")
  private java.lang.Integer statCoverageId;
  /** Description: context. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "context", length = 40)
  private java.lang.String context;

  public Stats() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getStatRepositoryType() {
    return this.statRepositoryType;
  }

  public java.lang.Integer getStatRepositoryId() {
    return this.statRepositoryId;
  }

  public java.lang.String getStatHolderType() {
    return this.statHolderType;
  }

  public java.lang.Integer getStatHolderId() {
    return this.statHolderId;
  }

  public java.lang.String getStatCoverageType() {
    return this.statCoverageType;
  }

  public java.lang.Integer getStatCoverageId() {
    return this.statCoverageId;
  }

  public java.lang.String getContext() {
    return this.context;
  }

  public void setStatRepositoryType(java.lang.String statRepositoryType) {
    this.statRepositoryType = statRepositoryType;
  }

  public void setStatRepositoryId(java.lang.Integer statRepositoryId) {
    this.statRepositoryId = statRepositoryId;
  }

  public void setStatHolderType(java.lang.String statHolderType) {
    this.statHolderType = statHolderType;
  }

  public void setStatHolderId(java.lang.Integer statHolderId) {
    this.statHolderId = statHolderId;
  }

  public void setStatCoverageType(java.lang.String statCoverageType) {
    this.statCoverageType = statCoverageType;
  }

  public void setStatCoverageId(java.lang.Integer statCoverageId) {
    this.statCoverageId = statCoverageId;
  }

  public void setContext(java.lang.String context) {
    this.context = context;
  }
}
