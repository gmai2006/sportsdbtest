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
@Table(name = "affiliations_media")
public class AffiliationsMedia implements Serializable {
  private static final long serialVersionUID = 166867004210856689L;

  /** Description: default_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "default_id")
  private java.lang.String defaultId;

  /** Description: affiliation_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "affiliation_id")
  private java.lang.Integer affiliationId;
  /** Description: media_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "media_id")
  private java.lang.Integer mediaId;

  public AffiliationsMedia() {}

  public java.lang.String getDefaultId() {
    return this.defaultId;
  }

  public void setDefaultId(java.lang.String defaultId) {
    this.defaultId = defaultId;
  }

  public java.lang.Integer getAffiliationId() {
    return this.affiliationId;
  }

  public java.lang.Integer getMediaId() {
    return this.mediaId;
  }

  public void setAffiliationId(java.lang.Integer affiliationId) {
    this.affiliationId = affiliationId;
  }

  public void setMediaId(java.lang.Integer mediaId) {
    this.mediaId = mediaId;
  }
}
