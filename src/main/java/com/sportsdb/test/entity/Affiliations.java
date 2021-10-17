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
@Table(name = "affiliations")
public class Affiliations implements Serializable {
    private static final long serialVersionUID = 163445241865934572L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: affiliation_key. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "affiliation_key", length = 100)
    private java.lang.String affiliationKey;
    /** Description: affiliation_type. */
    @Basic
    @Column(name = "affiliation_type", length = 100)
    private java.lang.String affiliationType;
    /** Description: publisher_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "publisher_id")
    private java.lang.Integer publisherId;

    public Affiliations() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getAffiliationKey() {
        return this.affiliationKey;
    }

    public java.lang.String getAffiliationType() {
        return this.affiliationType;
    }

    public java.lang.Integer getPublisherId() {
        return this.publisherId;
    }

    public void setAffiliationKey(java.lang.String affiliationKey) {
        this.affiliationKey = affiliationKey;
    }

    public void setAffiliationType(java.lang.String affiliationType) {
        this.affiliationType = affiliationType;
    }

    public void setPublisherId(java.lang.Integer publisherId) {
        this.publisherId = publisherId;
    }
}
