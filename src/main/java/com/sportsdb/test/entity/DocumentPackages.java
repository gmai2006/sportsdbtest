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
@Table(name = "document_packages")
public class DocumentPackages implements Serializable {
  private static final long serialVersionUID = 166867004232687551L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: package_key. */
  @Basic
  @Column(name = "package_key", length = 100)
  private java.lang.String packageKey;
  /** Description: package_name. */
  @Basic
  @Column(name = "package_name", length = 100)
  private java.lang.String packageName;
  /** Description: date_time. */
  @Basic
  @Column(name = "date_time")
  private java.util.Date dateTime;

  public DocumentPackages() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getPackageKey() {
    return this.packageKey;
  }

  public java.lang.String getPackageName() {
    return this.packageName;
  }

  public java.util.Date getDateTime() {
    return this.dateTime;
  }

  public void setPackageKey(java.lang.String packageKey) {
    this.packageKey = packageKey;
  }

  public void setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
  }

  public void setDateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
  }
}
