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

import com.sportsdb.test.dao.StatsDao;
import com.sportsdb.test.entity.Stats;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultStatsService")
public class DefaultStatsService implements StatsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final StatsDao dao;

    @Inject
    @Named("DefaultStatsDao")
    public DefaultStatsService(final StatsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public Stats find(java.lang.Integer id) {

        final Stats result = dao.find(id);
        logger.info("find(Stats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<Stats> select(int maxResult) {
        final List<Stats> result = dao.select(maxResult);
        logger.info("select(Stats) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<Stats> selectAll() {
        final List<Stats> results = dao.selectAll();
        logger.info("selectAll(Stats) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public Stats create(Stats bean) {
        requireNonNull(bean);
        logger.info("create(Stats={}) - entered bean ");

        final Stats result = dao.create(bean);

        logger.info("create(Stats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public Stats update(Stats bean) {
        requireNonNull(bean);
        logger.info("update(Stats={}) - entered bean ");

        final Stats result = dao.update(bean);

        logger.info("update(Stats) - exited - return value={} result ");
        return result;
    }
}
