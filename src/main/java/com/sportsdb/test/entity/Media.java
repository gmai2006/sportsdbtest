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
@Table(name = "media")
public class Media implements Serializable {
    private static final long serialVersionUID = 163445241910848353L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: object_id. */
    @Basic
    @Column(name = "object_id")
    private java.lang.Integer objectId;
    /** Description: source_id. */
    @Basic
    @Column(name = "source_id")
    private java.lang.Integer sourceId;
    /** Description: revision_id. */
    @Basic
    @Column(name = "revision_id")
    private java.lang.Integer revisionId;
    /** Description: media_type. */
    @Basic
    @Column(name = "media_type", length = 100)
    private java.lang.String mediaType;
    /** Description: publisher_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "publisher_id")
    private java.lang.Integer publisherId;
    /** Description: date_time. */
    @Basic
    @Column(name = "date_time", length = 100)
    private java.lang.String dateTime;
    /** Description: credit_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "credit_id")
    private java.lang.Integer creditId;
    /** Description: db_loading_date_time. */
    @Basic
    @Column(name = "db_loading_date_time")
    private java.util.Date dbLoadingDateTime;
    /** Description: creation_location_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "creation_location_id")
    private java.lang.Integer creationLocationId;

    public Media() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getObjectId() {
        return this.objectId;
    }

    public java.lang.Integer getSourceId() {
        return this.sourceId;
    }

    public java.lang.Integer getRevisionId() {
        return this.revisionId;
    }

    public java.lang.String getMediaType() {
        return this.mediaType;
    }

    public java.lang.Integer getPublisherId() {
        return this.publisherId;
    }

    public java.lang.String getDateTime() {
        return this.dateTime;
    }

    public java.lang.Integer getCreditId() {
        return this.creditId;
    }

    public java.util.Date getDbLoadingDateTime() {
        return this.dbLoadingDateTime;
    }

    public java.lang.Integer getCreationLocationId() {
        return this.creationLocationId;
    }

    public void setObjectId(java.lang.Integer objectId) {
        this.objectId = objectId;
    }

    public void setSourceId(java.lang.Integer sourceId) {
        this.sourceId = sourceId;
    }

    public void setRevisionId(java.lang.Integer revisionId) {
        this.revisionId = revisionId;
    }

    public void setMediaType(java.lang.String mediaType) {
        this.mediaType = mediaType;
    }

    public void setPublisherId(java.lang.Integer publisherId) {
        this.publisherId = publisherId;
    }

    public void setDateTime(java.lang.String dateTime) {
        this.dateTime = dateTime;
    }

    public void setCreditId(java.lang.Integer creditId) {
        this.creditId = creditId;
    }

    public void setDbLoadingDateTime(java.util.Date dbLoadingDateTime) {
        this.dbLoadingDateTime = dbLoadingDateTime;
    }

    public void setCreationLocationId(java.lang.Integer creationLocationId) {
        this.creationLocationId = creationLocationId;
    }
}
