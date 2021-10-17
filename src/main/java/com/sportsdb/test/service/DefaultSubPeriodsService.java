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
package com.sportsdb.test.service;

import static java.util.Objects.requireNonNull;

import com.sportsdb.test.dao.SubPeriodsDao;
import com.sportsdb.test.entity.SubPeriods;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultSubPeriodsService")
public class DefaultSubPeriodsService implements SubPeriodsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final SubPeriodsDao dao;

    @Inject
    @Named("DefaultSubPeriodsDao")
    public DefaultSubPeriodsService(final SubPeriodsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public SubPeriods find(java.lang.Integer id) {

        final SubPeriods result = dao.find(id);
        logger.info("find(SubPeriods) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<SubPeriods> select(int maxResult) {
        final List<SubPeriods> result = dao.select(maxResult);
        logger.info("select(SubPeriods) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<SubPeriods> selectAll() {
        final List<SubPeriods> results = dao.selectAll();
        logger.info("selectAll(SubPeriods) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public SubPeriods create(SubPeriods bean) {
        requireNonNull(bean);
        logger.info("create(SubPeriods={}) - entered bean ");

        final SubPeriods result = dao.create(bean);

        logger.info("create(SubPeriods) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public SubPeriods update(SubPeriods bean) {
        requireNonNull(bean);
        logger.info("update(SubPeriods={}) - entered bean ");

        final SubPeriods result = dao.update(bean);

        logger.info("update(SubPeriods) - exited - return value={} result ");
        return result;
    }
}
