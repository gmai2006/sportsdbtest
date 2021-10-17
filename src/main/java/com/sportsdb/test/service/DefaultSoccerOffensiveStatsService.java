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

import com.sportsdb.test.dao.SoccerOffensiveStatsDao;
import com.sportsdb.test.entity.SoccerOffensiveStats;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultSoccerOffensiveStatsService")
public class DefaultSoccerOffensiveStatsService implements SoccerOffensiveStatsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final SoccerOffensiveStatsDao dao;

    @Inject
    @Named("DefaultSoccerOffensiveStatsDao")
    public DefaultSoccerOffensiveStatsService(final SoccerOffensiveStatsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public SoccerOffensiveStats find(java.lang.Integer id) {

        final SoccerOffensiveStats result = dao.find(id);
        logger.info("find(SoccerOffensiveStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<SoccerOffensiveStats> select(int maxResult) {
        final List<SoccerOffensiveStats> result = dao.select(maxResult);
        logger.info("select(SoccerOffensiveStats) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<SoccerOffensiveStats> selectAll() {
        final List<SoccerOffensiveStats> results = dao.selectAll();
        logger.info("selectAll(SoccerOffensiveStats) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public SoccerOffensiveStats create(SoccerOffensiveStats bean) {
        requireNonNull(bean);
        logger.info("create(SoccerOffensiveStats={}) - entered bean ");

        final SoccerOffensiveStats result = dao.create(bean);

        logger.info("create(SoccerOffensiveStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public SoccerOffensiveStats update(SoccerOffensiveStats bean) {
        requireNonNull(bean);
        logger.info("update(SoccerOffensiveStats={}) - entered bean ");

        final SoccerOffensiveStats result = dao.update(bean);

        logger.info("update(SoccerOffensiveStats) - exited - return value={} result ");
        return result;
    }
}
