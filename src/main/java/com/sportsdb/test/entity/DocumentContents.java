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
@Table(name = "document_contents")
public class DocumentContents implements Serializable {
    private static final long serialVersionUID = 163445241894298924L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: document_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "document_id")
    private java.lang.Integer documentId;
    /** Description: sportsml. */
    @Basic
    @Column(name = "sportsml", length = 200)
    private java.lang.String sportsml;
    /** Description: abstract1. */
    @Basic
    @Column(name = "abstract1", length = 0)
    private java.lang.String abstract1;

    public DocumentContents() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getDocumentId() {
        return this.documentId;
    }

    public java.lang.String getSportsml() {
        return this.sportsml;
    }

    public java.lang.String getAbstract1() {
        return this.abstract1;
    }

    public void setDocumentId(java.lang.Integer documentId) {
        this.documentId = documentId;
    }

    public void setSportsml(java.lang.String sportsml) {
        this.sportsml = sportsml;
    }

    public void setAbstract1(java.lang.String abstract1) {
        this.abstract1 = abstract1;
    }
}
