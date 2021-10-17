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
@Table(name = "document_fixtures")
public class DocumentFixtures implements Serializable {
    private static final long serialVersionUID = 163445241894787492L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: fixture_key. */
    @Basic
    @Column(name = "fixture_key", length = 100)
    private java.lang.String fixtureKey;
    /** Description: publisher_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "publisher_id")
    private java.lang.Integer publisherId;
    /** Description: name. */
    @Basic
    @Column(name = "name", length = 100)
    private java.lang.String name;
    /** Description: document_class_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "document_class_id")
    private java.lang.Integer documentClassId;

    public DocumentFixtures() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getFixtureKey() {
        return this.fixtureKey;
    }

    public java.lang.Integer getPublisherId() {
        return this.publisherId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.Integer getDocumentClassId() {
        return this.documentClassId;
    }

    public void setFixtureKey(java.lang.String fixtureKey) {
        this.fixtureKey = fixtureKey;
    }

    public void setPublisherId(java.lang.Integer publisherId) {
        this.publisherId = publisherId;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setDocumentClassId(java.lang.Integer documentClassId) {
        this.documentClassId = documentClassId;
    }
}
