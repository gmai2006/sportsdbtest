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
@Table(name = "addresses")
public class Addresses implements Serializable {
  private static final long serialVersionUID = 166867004207499024L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: location_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "location_id")
  private java.lang.Integer locationId;
  /** Description: language. */
  @Basic
  @Column(name = "language", length = 100)
  private java.lang.String language;
  /** Description: suite. */
  @Basic
  @Column(name = "suite", length = 100)
  private java.lang.String suite;
  /** Description: floor. */
  @Basic
  @Column(name = "floor", length = 100)
  private java.lang.String floor;
  /** Description: building. */
  @Basic
  @Column(name = "building", length = 100)
  private java.lang.String building;
  /** Description: street_number. */
  @Basic
  @Column(name = "street_number", length = 100)
  private java.lang.String streetNumber;
  /** Description: street_prefix. */
  @Basic
  @Column(name = "street_prefix", length = 100)
  private java.lang.String streetPrefix;
  /** Description: street. */
  @Basic
  @Column(name = "street", length = 100)
  private java.lang.String street;
  /** Description: street_suffix. */
  @Basic
  @Column(name = "street_suffix", length = 100)
  private java.lang.String streetSuffix;
  /** Description: neighborhood. */
  @Basic
  @Column(name = "neighborhood", length = 100)
  private java.lang.String neighborhood;
  /** Description: district. */
  @Basic
  @Column(name = "district", length = 100)
  private java.lang.String district;
  /** Description: locality. */
  @Basic
  @Column(name = "locality", length = 100)
  private java.lang.String locality;
  /** Description: county. */
  @Basic
  @Column(name = "county", length = 100)
  private java.lang.String county;
  /** Description: region. */
  @Basic
  @Column(name = "region", length = 100)
  private java.lang.String region;
  /** Description: postal_code. */
  @Basic
  @Column(name = "postal_code", length = 100)
  private java.lang.String postalCode;
  /** Description: country. */
  @Basic
  @Column(name = "country", length = 100)
  private java.lang.String country;

  public Addresses() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getLocationId() {
    return this.locationId;
  }

  public java.lang.String getLanguage() {
    return this.language;
  }

  public java.lang.String getSuite() {
    return this.suite;
  }

  public java.lang.String getFloor() {
    return this.floor;
  }

  public java.lang.String getBuilding() {
    return this.building;
  }

  public java.lang.String getStreetNumber() {
    return this.streetNumber;
  }

  public java.lang.String getStreetPrefix() {
    return this.streetPrefix;
  }

  public java.lang.String getStreet() {
    return this.street;
  }

  public java.lang.String getStreetSuffix() {
    return this.streetSuffix;
  }

  public java.lang.String getNeighborhood() {
    return this.neighborhood;
  }

  public java.lang.String getDistrict() {
    return this.district;
  }

  public java.lang.String getLocality() {
    return this.locality;
  }

  public java.lang.String getCounty() {
    return this.county;
  }

  public java.lang.String getRegion() {
    return this.region;
  }

  public java.lang.String getPostalCode() {
    return this.postalCode;
  }

  public java.lang.String getCountry() {
    return this.country;
  }

  public void setLocationId(java.lang.Integer locationId) {
    this.locationId = locationId;
  }

  public void setLanguage(java.lang.String language) {
    this.language = language;
  }

  public void setSuite(java.lang.String suite) {
    this.suite = suite;
  }

  public void setFloor(java.lang.String floor) {
    this.floor = floor;
  }

  public void setBuilding(java.lang.String building) {
    this.building = building;
  }

  public void setStreetNumber(java.lang.String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public void setStreetPrefix(java.lang.String streetPrefix) {
    this.streetPrefix = streetPrefix;
  }

  public void setStreet(java.lang.String street) {
    this.street = street;
  }

  public void setStreetSuffix(java.lang.String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }

  public void setNeighborhood(java.lang.String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public void setDistrict(java.lang.String district) {
    this.district = district;
  }

  public void setLocality(java.lang.String locality) {
    this.locality = locality;
  }

  public void setCounty(java.lang.String county) {
    this.county = county;
  }

  public void setRegion(java.lang.String region) {
    this.region = region;
  }

  public void setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
  }

  public void setCountry(java.lang.String country) {
    this.country = country;
  }
}
