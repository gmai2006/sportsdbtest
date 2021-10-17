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

import com.sportsdb.test.dao.IceHockeyPlayerStatsDao;
import com.sportsdb.test.entity.IceHockeyPlayerStats;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultIceHockeyPlayerStatsService")
public class DefaultIceHockeyPlayerStatsService implements IceHockeyPlayerStatsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final IceHockeyPlayerStatsDao dao;

    @Inject
    @Named("DefaultIceHockeyPlayerStatsDao")
    public DefaultIceHockeyPlayerStatsService(final IceHockeyPlayerStatsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public IceHockeyPlayerStats find(java.lang.Integer id) {

        final IceHockeyPlayerStats result = dao.find(id);
        logger.info("find(IceHockeyPlayerStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<IceHockeyPlayerStats> select(int maxResult) {
        final List<IceHockeyPlayerStats> result = dao.select(maxResult);
        logger.info("select(IceHockeyPlayerStats) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<IceHockeyPlayerStats> selectAll() {
        final List<IceHockeyPlayerStats> results = dao.selectAll();
        logger.info("selectAll(IceHockeyPlayerStats) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public IceHockeyPlayerStats create(IceHockeyPlayerStats bean) {
        requireNonNull(bean);
        logger.info("create(IceHockeyPlayerStats={}) - entered bean ");

        final IceHockeyPlayerStats result = dao.create(bean);

        logger.info("create(IceHockeyPlayerStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public IceHockeyPlayerStats update(IceHockeyPlayerStats bean) {
        requireNonNull(bean);
        logger.info("update(IceHockeyPlayerStats={}) - entered bean ");

        final IceHockeyPlayerStats result = dao.update(bean);

        logger.info("update(IceHockeyPlayerStats) - exited - return value={} result ");
        return result;
    }
}
