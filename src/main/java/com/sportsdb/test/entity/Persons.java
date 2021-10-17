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

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Persons implements Serializable {
    private static final long serialVersionUID = 163445241921769738L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: person_key. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "person_key", length = 100)
    private java.lang.String personKey;
    /** Description: publisher_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "publisher_id")
    private java.lang.Integer publisherId;
    /** Description: gender. */
    @Basic
    @Column(name = "gender", length = 20)
    private java.lang.String gender;
    /** Description: birth_date. */
    @Basic
    @Column(name = "birth_date", length = 30)
    private java.lang.String birthDate;
    /** Description: death_date. */
    @Basic
    @Column(name = "death_date", length = 30)
    private java.lang.String deathDate;
    /** Description: birth_location_id. */
    @Basic
    @Column(name = "birth_location_id")
    private java.lang.Integer birthLocationId;
    /** Description: hometown_location_id. */
    @Basic
    @Column(name = "hometown_location_id")
    private java.lang.Integer hometownLocationId;
    /** Description: residence_location_id. */
    @Basic
    @Column(name = "residence_location_id")
    private java.lang.Integer residenceLocationId;
    /** Description: death_location_id. */
    @Basic
    @Column(name = "death_location_id")
    private java.lang.Integer deathLocationId;

    public Persons() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getPersonKey() {
        return this.personKey;
    }

    public java.lang.Integer getPublisherId() {
        return this.publisherId;
    }

    public java.lang.String getGender() {
        return this.gender;
    }

    public java.lang.String getBirthDate() {
        return this.birthDate;
    }

    public java.lang.String getDeathDate() {
        return this.deathDate;
    }

    public java.lang.Integer getBirthLocationId() {
        return this.birthLocationId;
    }

    public java.lang.Integer getHometownLocationId() {
        return this.hometownLocationId;
    }

    public java.lang.Integer getResidenceLocationId() {
        return this.residenceLocationId;
    }

    public java.lang.Integer getDeathLocationId() {
        return this.deathLocationId;
    }

    public void setPersonKey(java.lang.String personKey) {
        this.personKey = personKey;
    }

    public void setPublisherId(java.lang.Integer publisherId) {
        this.publisherId = publisherId;
    }

    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }

    public void setBirthDate(java.lang.String birthDate) {
        this.birthDate = birthDate;
    }

    public void setDeathDate(java.lang.String deathDate) {
        this.deathDate = deathDate;
    }

    public void setBirthLocationId(java.lang.Integer birthLocationId) {
        this.birthLocationId = birthLocationId;
    }

    public void setHometownLocationId(java.lang.Integer hometownLocationId) {
        this.hometownLocationId = hometownLocationId;
    }

    public void setResidenceLocationId(java.lang.Integer residenceLocationId) {
        this.residenceLocationId = residenceLocationId;
    }

    public void setDeathLocationId(java.lang.Integer deathLocationId) {
        this.deathLocationId = deathLocationId;
    }
}
