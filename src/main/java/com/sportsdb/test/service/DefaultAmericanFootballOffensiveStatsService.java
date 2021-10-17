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

import com.sportsdb.test.dao.AmericanFootballOffensiveStatsDao;
import com.sportsdb.test.entity.AmericanFootballOffensiveStats;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultAmericanFootballOffensiveStatsService")
public class DefaultAmericanFootballOffensiveStatsService
        implements AmericanFootballOffensiveStatsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final AmericanFootballOffensiveStatsDao dao;

    @Inject
    @Named("DefaultAmericanFootballOffensiveStatsDao")
    public DefaultAmericanFootballOffensiveStatsService(
            final AmericanFootballOffensiveStatsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public AmericanFootballOffensiveStats find(java.lang.Integer id) {

        final AmericanFootballOffensiveStats result = dao.find(id);
        logger.info("find(AmericanFootballOffensiveStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<AmericanFootballOffensiveStats> select(int maxResult) {
        final List<AmericanFootballOffensiveStats> result = dao.select(maxResult);
        logger.info("select(AmericanFootballOffensiveStats) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<AmericanFootballOffensiveStats> selectAll() {
        final List<AmericanFootballOffensiveStats> results = dao.selectAll();
        logger.info("selectAll(AmericanFootballOffensiveStats) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public AmericanFootballOffensiveStats create(AmericanFootballOffensiveStats bean) {
        requireNonNull(bean);
        logger.info("create(AmericanFootballOffensiveStats={}) - entered bean ");

        final AmericanFootballOffensiveStats result = dao.create(bean);

        logger.info("create(AmericanFootballOffensiveStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public AmericanFootballOffensiveStats update(AmericanFootballOffensiveStats bean) {
        requireNonNull(bean);
        logger.info("update(AmericanFootballOffensiveStats={}) - entered bean ");

        final AmericanFootballOffensiveStats result = dao.update(bean);

        logger.info("update(AmericanFootballOffensiveStats) - exited - return value={} result ");
        return result;
    }
}
