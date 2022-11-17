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
@Table(name = "weather_conditions")
public class WeatherConditions implements Serializable {
  private static final long serialVersionUID = 166867004263938505L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: event_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "event_id")
  private java.lang.Integer eventId;
  /** Description: temperature. */
  @Basic
  @Column(name = "temperature", length = 100)
  private java.lang.String temperature;
  /** Description: temperature_units. */
  @Basic
  @Column(name = "temperature_units", length = 40)
  private java.lang.String temperatureUnits;
  /** Description: humidity. */
  @Basic
  @Column(name = "humidity", length = 100)
  private java.lang.String humidity;
  /** Description: clouds. */
  @Basic
  @Column(name = "clouds", length = 100)
  private java.lang.String clouds;
  /** Description: wind_direction. */
  @Basic
  @Column(name = "wind_direction", length = 100)
  private java.lang.String windDirection;
  /** Description: wind_velocity. */
  @Basic
  @Column(name = "wind_velocity", length = 100)
  private java.lang.String windVelocity;
  /** Description: weather_code. */
  @Basic
  @Column(name = "weather_code", length = 100)
  private java.lang.String weatherCode;

  public WeatherConditions() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getEventId() {
    return this.eventId;
  }

  public java.lang.String getTemperature() {
    return this.temperature;
  }

  public java.lang.String getTemperatureUnits() {
    return this.temperatureUnits;
  }

  public java.lang.String getHumidity() {
    return this.humidity;
  }

  public java.lang.String getClouds() {
    return this.clouds;
  }

  public java.lang.String getWindDirection() {
    return this.windDirection;
  }

  public java.lang.String getWindVelocity() {
    return this.windVelocity;
  }

  public java.lang.String getWeatherCode() {
    return this.weatherCode;
  }

  public void setEventId(java.lang.Integer eventId) {
    this.eventId = eventId;
  }

  public void setTemperature(java.lang.String temperature) {
    this.temperature = temperature;
  }

  public void setTemperatureUnits(java.lang.String temperatureUnits) {
    this.temperatureUnits = temperatureUnits;
  }

  public void setHumidity(java.lang.String humidity) {
    this.humidity = humidity;
  }

  public void setClouds(java.lang.String clouds) {
    this.clouds = clouds;
  }

  public void setWindDirection(java.lang.String windDirection) {
    this.windDirection = windDirection;
  }

  public void setWindVelocity(java.lang.String windVelocity) {
    this.windVelocity = windVelocity;
  }

  public void setWeatherCode(java.lang.String weatherCode) {
    this.weatherCode = weatherCode;
  }
}
