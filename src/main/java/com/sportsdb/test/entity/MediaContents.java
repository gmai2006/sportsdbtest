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
@Table(name = "media_contents")
public class MediaContents implements Serializable {
  private static final long serialVersionUID = 166867004242641858L;

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
  /** Description: object. */
  @Basic
  @Column(name = "object", length = 100)
  private java.lang.String object;
  /** Description: format. */
  @Basic
  @Column(name = "format", length = 100)
  private java.lang.String format;
  /** Description: mime_type. */
  @Basic
  @Column(name = "mime_type", length = 100)
  private java.lang.String mimeType;
  /** Description: height. */
  @Basic
  @Column(name = "height", length = 100)
  private java.lang.String height;
  /** Description: width. */
  @Basic
  @Column(name = "width", length = 100)
  private java.lang.String width;
  /** Description: duration. */
  @Basic
  @Column(name = "duration", length = 100)
  private java.lang.String duration;
  /** Description: file_size. */
  @Basic
  @Column(name = "file_size", length = 100)
  private java.lang.String fileSize;
  /** Description: resolution. */
  @Basic
  @Column(name = "resolution", length = 100)
  private java.lang.String resolution;

  public MediaContents() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getMediaId() {
    return this.mediaId;
  }

  public java.lang.String getObject() {
    return this.object;
  }

  public java.lang.String getFormat() {
    return this.format;
  }

  public java.lang.String getMimeType() {
    return this.mimeType;
  }

  public java.lang.String getHeight() {
    return this.height;
  }

  public java.lang.String getWidth() {
    return this.width;
  }

  public java.lang.String getDuration() {
    return this.duration;
  }

  public java.lang.String getFileSize() {
    return this.fileSize;
  }

  public java.lang.String getResolution() {
    return this.resolution;
  }

  public void setMediaId(java.lang.Integer mediaId) {
    this.mediaId = mediaId;
  }

  public void setObject(java.lang.String object) {
    this.object = object;
  }

  public void setFormat(java.lang.String format) {
    this.format = format;
  }

  public void setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
  }

  public void setHeight(java.lang.String height) {
    this.height = height;
  }

  public void setWidth(java.lang.String width) {
    this.width = width;
  }

  public void setDuration(java.lang.String duration) {
    this.duration = duration;
  }

  public void setFileSize(java.lang.String fileSize) {
    this.fileSize = fileSize;
  }

  public void setResolution(java.lang.String resolution) {
    this.resolution = resolution;
  }
}
