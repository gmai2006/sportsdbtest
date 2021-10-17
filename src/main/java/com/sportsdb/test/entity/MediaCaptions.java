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
@Table(name = "media_captions")
public class MediaCaptions implements Serializable {
    private static final long serialVersionUID = 163445241911718052L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: media_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "media_id")
    private java.lang.Integer mediaId;
    /** Description: caption_type. */
    @Basic
    @Column(name = "caption_type", length = 100)
    private java.lang.String captionType;
    /** Description: caption. */
    @Basic
    @Column(name = "caption", length = 100)
    private java.lang.String caption;
    /** Description: caption_author_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "caption_author_id")
    private java.lang.Integer captionAuthorId;
    /** Description: language. */
    @Basic
    @Column(name = "language", length = 100)
    private java.lang.String language;
    /** Description: caption_size. */
    @Basic
    @Column(name = "caption_size", length = 100)
    private java.lang.String captionSize;

    public MediaCaptions() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getMediaId() {
        return this.mediaId;
    }

    public java.lang.String getCaptionType() {
        return this.captionType;
    }

    public java.lang.String getCaption() {
        return this.caption;
    }

    public java.lang.Integer getCaptionAuthorId() {
        return this.captionAuthorId;
    }

    public java.lang.String getLanguage() {
        return this.language;
    }

    public java.lang.String getCaptionSize() {
        return this.captionSize;
    }

    public void setMediaId(java.lang.Integer mediaId) {
        this.mediaId = mediaId;
    }

    public void setCaptionType(java.lang.String captionType) {
        this.captionType = captionType;
    }

    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }

    public void setCaptionAuthorId(java.lang.Integer captionAuthorId) {
        this.captionAuthorId = captionAuthorId;
    }

    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    public void setCaptionSize(java.lang.String captionSize) {
        this.captionSize = captionSize;
    }
}
