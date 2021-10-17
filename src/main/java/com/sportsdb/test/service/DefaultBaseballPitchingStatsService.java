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

import com.sportsdb.test.dao.BaseballPitchingStatsDao;
import com.sportsdb.test.entity.BaseballPitchingStats;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultBaseballPitchingStatsService")
public class DefaultBaseballPitchingStatsService implements BaseballPitchingStatsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final BaseballPitchingStatsDao dao;

    @Inject
    @Named("DefaultBaseballPitchingStatsDao")
    public DefaultBaseballPitchingStatsService(final BaseballPitchingStatsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballPitchingStats find(java.lang.Integer id) {

        final BaseballPitchingStats result = dao.find(id);
        logger.info("find(BaseballPitchingStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballPitchingStats> select(int maxResult) {
        final List<BaseballPitchingStats> result = dao.select(maxResult);
        logger.info("select(BaseballPitchingStats) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballPitchingStats> selectAll() {
        final List<BaseballPitchingStats> results = dao.selectAll();
        logger.info("selectAll(BaseballPitchingStats) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballPitchingStats create(BaseballPitchingStats bean) {
        requireNonNull(bean);
        logger.info("create(BaseballPitchingStats={}) - entered bean ");

        final BaseballPitchingStats result = dao.create(bean);

        logger.info("create(BaseballPitchingStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballPitchingStats update(BaseballPitchingStats bean) {
        requireNonNull(bean);
        logger.info("update(BaseballPitchingStats={}) - entered bean ");

        final BaseballPitchingStats result = dao.update(bean);

        logger.info("update(BaseballPitchingStats) - exited - return value={} result ");
        return result;
    }
}
