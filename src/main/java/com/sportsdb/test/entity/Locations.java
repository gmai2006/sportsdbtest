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
@Table(name = "locations")
public class Locations implements Serializable {
  private static final long serialVersionUID = 166867004241263100L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: timezone. */
  @Basic
  @Column(name = "timezone", length = 100)
  private java.lang.String timezone;
  /** Description: latitude. */
  @Basic
  @Column(name = "latitude", length = 100)
  private java.lang.String latitude;
  /** Description: longitude. */
  @Basic
  @Column(name = "longitude", length = 100)
  private java.lang.String longitude;
  /** Description: country_code. */
  @Basic
  @Column(name = "country_code", length = 100)
  private java.lang.String countryCode;

  public Locations() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getTimezone() {
    return this.timezone;
  }

  public java.lang.String getLatitude() {
    return this.latitude;
  }

  public java.lang.String getLongitude() {
    return this.longitude;
  }

  public java.lang.String getCountryCode() {
    return this.countryCode;
  }

  public void setTimezone(java.lang.String timezone) {
    this.timezone = timezone;
  }

  public void setLatitude(java.lang.String latitude) {
    this.latitude = latitude;
  }

  public void setLongitude(java.lang.String longitude) {
    this.longitude = longitude;
  }

  public void setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
  }
}
