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

import com.sportsdb.test.dao.CorePersonStatsDao;
import com.sportsdb.test.entity.CorePersonStats;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultCorePersonStatsService")
public class DefaultCorePersonStatsService implements CorePersonStatsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final CorePersonStatsDao dao;

    @Inject
    @Named("DefaultCorePersonStatsDao")
    public DefaultCorePersonStatsService(final CorePersonStatsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public CorePersonStats find(java.lang.Integer id) {

        final CorePersonStats result = dao.find(id);
        logger.info("find(CorePersonStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<CorePersonStats> select(int maxResult) {
        final List<CorePersonStats> result = dao.select(maxResult);
        logger.info("select(CorePersonStats) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<CorePersonStats> selectAll() {
        final List<CorePersonStats> results = dao.selectAll();
        logger.info("selectAll(CorePersonStats) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public CorePersonStats create(CorePersonStats bean) {
        requireNonNull(bean);
        logger.info("create(CorePersonStats={}) - entered bean ");

        final CorePersonStats result = dao.create(bean);

        logger.info("create(CorePersonStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public CorePersonStats update(CorePersonStats bean) {
        requireNonNull(bean);
        logger.info("update(CorePersonStats={}) - entered bean ");

        final CorePersonStats result = dao.update(bean);

        logger.info("update(CorePersonStats) - exited - return value={} result ");
        return result;
    }
}
