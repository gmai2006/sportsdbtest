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
@Table(name = "persons_documents")
public class PersonsDocuments implements Serializable {
    private static final long serialVersionUID = 163445241922570464L;

    /** Description: default_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "default_id")
    private java.lang.String defaultId;

    /** Description: person_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "person_id")
    private java.lang.Integer personId;
    /** Description: document_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "document_id")
    private java.lang.Integer documentId;

    public PersonsDocuments() {}

    public java.lang.String getDefaultId() {
        return this.defaultId;
    }

    public void setDefaultId(java.lang.String defaultId) {
        this.defaultId = defaultId;
    }

    public java.lang.Integer getPersonId() {
        return this.personId;
    }

    public java.lang.Integer getDocumentId() {
        return this.documentId;
    }

    public void setPersonId(java.lang.Integer personId) {
        this.personId = personId;
    }

    public void setDocumentId(java.lang.Integer documentId) {
        this.documentId = documentId;
    }
}
