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

import com.sportsdb.test.dao.MotorRacingRaceStatsDao;
import com.sportsdb.test.entity.MotorRacingRaceStats;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultMotorRacingRaceStatsService")
public class DefaultMotorRacingRaceStatsService implements MotorRacingRaceStatsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final MotorRacingRaceStatsDao dao;

    @Inject
    @Named("DefaultMotorRacingRaceStatsDao")
    public DefaultMotorRacingRaceStatsService(final MotorRacingRaceStatsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public MotorRacingRaceStats find(java.lang.Integer id) {

        final MotorRacingRaceStats result = dao.find(id);
        logger.info("find(MotorRacingRaceStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<MotorRacingRaceStats> select(int maxResult) {
        final List<MotorRacingRaceStats> result = dao.select(maxResult);
        logger.info("select(MotorRacingRaceStats) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<MotorRacingRaceStats> selectAll() {
        final List<MotorRacingRaceStats> results = dao.selectAll();
        logger.info("selectAll(MotorRacingRaceStats) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public MotorRacingRaceStats create(MotorRacingRaceStats bean) {
        requireNonNull(bean);
        logger.info("create(MotorRacingRaceStats={}) - entered bean ");

        final MotorRacingRaceStats result = dao.create(bean);

        logger.info("create(MotorRacingRaceStats) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public MotorRacingRaceStats update(MotorRacingRaceStats bean) {
        requireNonNull(bean);
        logger.info("update(MotorRacingRaceStats={}) - entered bean ");

        final MotorRacingRaceStats result = dao.update(bean);

        logger.info("update(MotorRacingRaceStats) - exited - return value={} result ");
        return result;
    }
}
