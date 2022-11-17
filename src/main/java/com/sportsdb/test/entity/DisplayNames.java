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
@Table(name = "display_names")
public class DisplayNames implements Serializable {
  private static final long serialVersionUID = 166867004230347955L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: language. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "language", length = 100)
  private java.lang.String language;
  /** Description: entity_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity_type", length = 100)
  private java.lang.String entityType;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity_id")
  private java.lang.Integer entityId;
  /** Description: full_name. */
  @Basic
  @Column(name = "full_name", length = 100)
  private java.lang.String fullName;
  /** Description: first_name. */
  @Basic
  @Column(name = "first_name", length = 100)
  private java.lang.String firstName;
  /** Description: middle_name. */
  @Basic
  @Column(name = "middle_name", length = 100)
  private java.lang.String middleName;
  /** Description: last_name. */
  @Basic
  @Column(name = "last_name", length = 100)
  private java.lang.String lastName;
  /** Description: alias. */
  @Basic
  @Column(name = "alias", length = 100)
  private java.lang.String alias;
  /** Description: abbreviation. */
  @Basic
  @Column(name = "abbreviation", length = 100)
  private java.lang.String abbreviation;
  /** Description: short_name. */
  @Basic
  @Column(name = "short_name", length = 100)
  private java.lang.String shortName;
  /** Description: prefix. */
  @Basic
  @Column(name = "prefix", length = 20)
  private java.lang.String prefix;
  /** Description: suffix. */
  @Basic
  @Column(name = "suffix", length = 20)
  private java.lang.String suffix;

  public DisplayNames() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getLanguage() {
    return this.language;
  }

  public java.lang.String getEntityType() {
    return this.entityType;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public java.lang.String getFullName() {
    return this.fullName;
  }

  public java.lang.String getFirstName() {
    return this.firstName;
  }

  public java.lang.String getMiddleName() {
    return this.middleName;
  }

  public java.lang.String getLastName() {
    return this.lastName;
  }

  public java.lang.String getAlias() {
    return this.alias;
  }

  public java.lang.String getAbbreviation() {
    return this.abbreviation;
  }

  public java.lang.String getShortName() {
    return this.shortName;
  }

  public java.lang.String getPrefix() {
    return this.prefix;
  }

  public java.lang.String getSuffix() {
    return this.suffix;
  }

  public void setLanguage(java.lang.String language) {
    this.language = language;
  }

  public void setEntityType(java.lang.String entityType) {
    this.entityType = entityType;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public void setFullName(java.lang.String fullName) {
    this.fullName = fullName;
  }

  public void setFirstName(java.lang.String firstName) {
    this.firstName = firstName;
  }

  public void setMiddleName(java.lang.String middleName) {
    this.middleName = middleName;
  }

  public void setLastName(java.lang.String lastName) {
    this.lastName = lastName;
  }

  public void setAlias(java.lang.String alias) {
    this.alias = alias;
  }

  public void setAbbreviation(java.lang.String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public void setShortName(java.lang.String shortName) {
    this.shortName = shortName;
  }

  public void setPrefix(java.lang.String prefix) {
    this.prefix = prefix;
  }

  public void setSuffix(java.lang.String suffix) {
    this.suffix = suffix;
  }
}
