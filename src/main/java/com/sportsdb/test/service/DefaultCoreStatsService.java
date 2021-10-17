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

import com.sportsdb.test.dao.CoreStatsDao;
import com.sportsdb.test.entity.CoreStats;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultCoreStatsService")
public class DefaultCoreStatsService implements CoreStatsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final CoreStatsDao dao;

    @Inject
    @Named("DefaultCoreStatsDao")
    public DefaultCoreStatsService(final CoreStatsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public CoreStats find(java.lang.Integer id) {

        final CoreStats result = dao.find(id);
        logger.info("find(CoreStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<CoreStats> select(int maxResult) {
        final List<CoreStats> result = dao.select(maxResult);
        logger.info("select(CoreStats) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<CoreStats> selectAll() {
        final List<CoreStats> results = dao.selectAll();
        logger.info("selectAll(CoreStats) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public CoreStats create(CoreStats bean) {
        requireNonNull(bean);
        logger.info("create(CoreStats={}) - entered bean ");

        final CoreStats result = dao.create(bean);

        logger.info("create(CoreStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public CoreStats update(CoreStats bean) {
        requireNonNull(bean);
        logger.info("update(CoreStats={}) - entered bean ");

        final CoreStats result = dao.update(bean);

        logger.info("update(CoreStats) - exited - return value={} result ");
        return result;
    }
}
