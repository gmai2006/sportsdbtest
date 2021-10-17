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

import com.sportsdb.test.dao.AmericanFootballActionParticipantsDao;
import com.sportsdb.test.entity.AmericanFootballActionParticipants;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultAmericanFootballActionParticipantsService")
public class DefaultAmericanFootballActionParticipantsService
        implements AmericanFootballActionParticipantsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final AmericanFootballActionParticipantsDao dao;

    @Inject
    @Named("DefaultAmericanFootballActionParticipantsDao")
    public DefaultAmericanFootballActionParticipantsService(
            final AmericanFootballActionParticipantsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public AmericanFootballActionParticipants find(java.lang.Integer id) {

        final AmericanFootballActionParticipants result = dao.find(id);
        logger.info("find(AmericanFootballActionParticipants) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<AmericanFootballActionParticipants> select(int maxResult) {
        final List<AmericanFootballActionParticipants> result = dao.select(maxResult);
        logger.info(
                "select(AmericanFootballActionParticipants) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<AmericanFootballActionParticipants> selectAll() {
        final List<AmericanFootballActionParticipants> results = dao.selectAll();
        logger.info(
                "selectAll(AmericanFootballActionParticipants) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public AmericanFootballActionParticipants create(AmericanFootballActionParticipants bean) {
        requireNonNull(bean);
        logger.info("create(AmericanFootballActionParticipants={}) - entered bean ");

        final AmericanFootballActionParticipants result = dao.create(bean);

        logger.info(
                "create(AmericanFootballActionParticipants) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public AmericanFootballActionParticipants update(AmericanFootballActionParticipants bean) {
        requireNonNull(bean);
        logger.info("update(AmericanFootballActionParticipants={}) - entered bean ");

        final AmericanFootballActionParticipants result = dao.update(bean);

        logger.info(
                "update(AmericanFootballActionParticipants) - exited - return value={} result ");
        return result;
    }
}
