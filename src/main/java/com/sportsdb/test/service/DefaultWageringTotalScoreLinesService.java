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

import com.sportsdb.test.dao.WageringTotalScoreLinesDao;
import com.sportsdb.test.entity.WageringTotalScoreLines;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultWageringTotalScoreLinesService")
public class DefaultWageringTotalScoreLinesService implements WageringTotalScoreLinesService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final WageringTotalScoreLinesDao dao;

    @Inject
    @Named("DefaultWageringTotalScoreLinesDao")
    public DefaultWageringTotalScoreLinesService(final WageringTotalScoreLinesDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public WageringTotalScoreLines find(java.lang.Integer id) {

        final WageringTotalScoreLines result = dao.find(id);
        logger.info("find(WageringTotalScoreLines) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<WageringTotalScoreLines> select(int maxResult) {
        final List<WageringTotalScoreLines> result = dao.select(maxResult);
        logger.info("select(WageringTotalScoreLines) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<WageringTotalScoreLines> selectAll() {
        final List<WageringTotalScoreLines> results = dao.selectAll();
        logger.info("selectAll(WageringTotalScoreLines) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public WageringTotalScoreLines create(WageringTotalScoreLines bean) {
        requireNonNull(bean);
        logger.info("create(WageringTotalScoreLines={}) - entered bean ");

        final WageringTotalScoreLines result = dao.create(bean);

        logger.info("create(WageringTotalScoreLines) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public WageringTotalScoreLines update(WageringTotalScoreLines bean) {
        requireNonNull(bean);
        logger.info("update(WageringTotalScoreLines={}) - entered bean ");

        final WageringTotalScoreLines result = dao.update(bean);

        logger.info("update(WageringTotalScoreLines) - exited - return value={} result ");
        return result;
    }
}
