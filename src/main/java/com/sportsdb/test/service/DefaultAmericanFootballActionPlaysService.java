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

import com.sportsdb.test.dao.AmericanFootballActionPlaysDao;
import com.sportsdb.test.entity.AmericanFootballActionPlays;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultAmericanFootballActionPlaysService")
public class DefaultAmericanFootballActionPlaysService
        implements AmericanFootballActionPlaysService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final AmericanFootballActionPlaysDao dao;

    @Inject
    @Named("DefaultAmericanFootballActionPlaysDao")
    public DefaultAmericanFootballActionPlaysService(final AmericanFootballActionPlaysDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public AmericanFootballActionPlays find(java.lang.Integer id) {

        final AmericanFootballActionPlays result = dao.find(id);
        logger.info("find(AmericanFootballActionPlays) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<AmericanFootballActionPlays> select(int maxResult) {
        final List<AmericanFootballActionPlays> result = dao.select(maxResult);
        logger.info("select(AmericanFootballActionPlays) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<AmericanFootballActionPlays> selectAll() {
        final List<AmericanFootballActionPlays> results = dao.selectAll();
        logger.info("selectAll(AmericanFootballActionPlays) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public AmericanFootballActionPlays create(AmericanFootballActionPlays bean) {
        requireNonNull(bean);
        logger.info("create(AmericanFootballActionPlays={}) - entered bean ");

        final AmericanFootballActionPlays result = dao.create(bean);

        logger.info("create(AmericanFootballActionPlays) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public AmericanFootballActionPlays update(AmericanFootballActionPlays bean) {
        requireNonNull(bean);
        logger.info("update(AmericanFootballActionPlays={}) - entered bean ");

        final AmericanFootballActionPlays result = dao.update(bean);

        logger.info("update(AmericanFootballActionPlays) - exited - return value={} result ");
        return result;
    }
}
