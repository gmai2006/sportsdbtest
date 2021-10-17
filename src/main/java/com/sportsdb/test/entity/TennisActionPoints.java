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
@Table(name = "tennis_action_points")
public class TennisActionPoints implements Serializable {
    private static final long serialVersionUID = 163445241936389806L;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.Integer id;

    /** Description: sub_period_id. */
    @Basic
    @Column(name = "sub_period_id", length = 100)
    private java.lang.String subPeriodId;
    /** Description: sequence_number. */
    @Basic
    @Column(name = "sequence_number", length = 100)
    private java.lang.String sequenceNumber;
    /** Description: win_type. */
    @Basic
    @Column(name = "win_type", length = 100)
    private java.lang.String winType;

    public TennisActionPoints() {}

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getSubPeriodId() {
        return this.subPeriodId;
    }

    public java.lang.String getSequenceNumber() {
        return this.sequenceNumber;
    }

    public java.lang.String getWinType() {
        return this.winType;
    }

    public void setSubPeriodId(java.lang.String subPeriodId) {
        this.subPeriodId = subPeriodId;
    }

    public void setSequenceNumber(java.lang.String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setWinType(java.lang.String winType) {
        this.winType = winType;
    }
}
