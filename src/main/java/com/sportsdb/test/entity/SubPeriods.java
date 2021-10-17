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
@Table(name = "sub_periods")
public class SubPeriods implements Serializable {
    private static final long serialVersionUID = 163445241932755697L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: period_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "period_id")
    private java.lang.Integer periodId;
    /** Description: sub_period_value. */
    @Basic
    @Column(name = "sub_period_value", length = 100)
    private java.lang.String subPeriodValue;
    /** Description: score. */
    @Basic
    @Column(name = "score", length = 100)
    private java.lang.String score;

    public SubPeriods() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getPeriodId() {
        return this.periodId;
    }

    public java.lang.String getSubPeriodValue() {
        return this.subPeriodValue;
    }

    public java.lang.String getScore() {
        return this.score;
    }

    public void setPeriodId(java.lang.Integer periodId) {
        this.periodId = periodId;
    }

    public void setSubPeriodValue(java.lang.String subPeriodValue) {
        this.subPeriodValue = subPeriodValue;
    }

    public void setScore(java.lang.String score) {
        this.score = score;
    }
}
