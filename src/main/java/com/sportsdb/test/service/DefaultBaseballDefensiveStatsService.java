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

import com.sportsdb.test.dao.BaseballDefensiveStatsDao;
import com.sportsdb.test.entity.BaseballDefensiveStats;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultBaseballDefensiveStatsService")
public class DefaultBaseballDefensiveStatsService implements BaseballDefensiveStatsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final BaseballDefensiveStatsDao dao;

    @Inject
    @Named("DefaultBaseballDefensiveStatsDao")
    public DefaultBaseballDefensiveStatsService(final BaseballDefensiveStatsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballDefensiveStats find(java.lang.Integer id) {

        final BaseballDefensiveStats result = dao.find(id);
        logger.info("find(BaseballDefensiveStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballDefensiveStats> select(int maxResult) {
        final List<BaseballDefensiveStats> result = dao.select(maxResult);
        logger.info("select(BaseballDefensiveStats) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballDefensiveStats> selectAll() {
        final List<BaseballDefensiveStats> results = dao.selectAll();
        logger.info("selectAll(BaseballDefensiveStats) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballDefensiveStats create(BaseballDefensiveStats bean) {
        requireNonNull(bean);
        logger.info("create(BaseballDefensiveStats={}) - entered bean ");

        final BaseballDefensiveStats result = dao.create(bean);

        logger.info("create(BaseballDefensiveStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballDefensiveStats update(BaseballDefensiveStats bean) {
        requireNonNull(bean);
        logger.info("update(BaseballDefensiveStats={}) - entered bean ");

        final BaseballDefensiveStats result = dao.update(bean);

        logger.info("update(BaseballDefensiveStats) - exited - return value={} result ");
        return result;
    }
}
