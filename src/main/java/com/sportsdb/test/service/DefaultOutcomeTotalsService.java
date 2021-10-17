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

import com.sportsdb.test.dao.OutcomeTotalsDao;
import com.sportsdb.test.entity.OutcomeTotals;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOutcomeTotalsService")
public class DefaultOutcomeTotalsService implements OutcomeTotalsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OutcomeTotalsDao dao;

    @Inject
    @Named("DefaultOutcomeTotalsDao")
    public DefaultOutcomeTotalsService(final OutcomeTotalsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OutcomeTotals find(java.lang.Integer id) {

        final OutcomeTotals result = dao.find(id);
        logger.info("find(OutcomeTotals) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OutcomeTotals> select(int maxResult) {
        final List<OutcomeTotals> result = dao.select(maxResult);
        logger.info("select(OutcomeTotals) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OutcomeTotals> selectAll() {
        final List<OutcomeTotals> results = dao.selectAll();
        logger.info("selectAll(OutcomeTotals) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OutcomeTotals create(OutcomeTotals bean) {
        requireNonNull(bean);
        logger.info("create(OutcomeTotals={}) - entered bean ");

        final OutcomeTotals result = dao.create(bean);

        logger.info("create(OutcomeTotals) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OutcomeTotals update(OutcomeTotals bean) {
        requireNonNull(bean);
        logger.info("update(OutcomeTotals={}) - entered bean ");

        final OutcomeTotals result = dao.update(bean);

        logger.info("update(OutcomeTotals) - exited - return value={} result ");
        return result;
    }
}
