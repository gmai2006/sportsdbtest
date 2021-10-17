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

import com.sportsdb.test.dao.TennisReturnStatsDao;
import com.sportsdb.test.entity.TennisReturnStats;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultTennisReturnStatsService")
public class DefaultTennisReturnStatsService implements TennisReturnStatsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final TennisReturnStatsDao dao;

    @Inject
    @Named("DefaultTennisReturnStatsDao")
    public DefaultTennisReturnStatsService(final TennisReturnStatsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public TennisReturnStats find(java.lang.Integer id) {

        final TennisReturnStats result = dao.find(id);
        logger.info("find(TennisReturnStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<TennisReturnStats> select(int maxResult) {
        final List<TennisReturnStats> result = dao.select(maxResult);
        logger.info("select(TennisReturnStats) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<TennisReturnStats> selectAll() {
        final List<TennisReturnStats> results = dao.selectAll();
        logger.info("selectAll(TennisReturnStats) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public TennisReturnStats create(TennisReturnStats bean) {
        requireNonNull(bean);
        logger.info("create(TennisReturnStats={}) - entered bean ");

        final TennisReturnStats result = dao.create(bean);

        logger.info("create(TennisReturnStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public TennisReturnStats update(TennisReturnStats bean) {
        requireNonNull(bean);
        logger.info("update(TennisReturnStats={}) - entered bean ");

        final TennisReturnStats result = dao.update(bean);

        logger.info("update(TennisReturnStats) - exited - return value={} result ");
        return result;
    }
}
