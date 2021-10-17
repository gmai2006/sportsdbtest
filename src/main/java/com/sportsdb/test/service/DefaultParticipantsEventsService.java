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

import com.sportsdb.test.dao.ParticipantsEventsDao;
import com.sportsdb.test.entity.ParticipantsEvents;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultParticipantsEventsService")
public class DefaultParticipantsEventsService implements ParticipantsEventsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final ParticipantsEventsDao dao;

    @Inject
    @Named("DefaultParticipantsEventsDao")
    public DefaultParticipantsEventsService(final ParticipantsEventsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public ParticipantsEvents find(java.lang.Integer id) {

        final ParticipantsEvents result = dao.find(id);
        logger.info("find(ParticipantsEvents) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<ParticipantsEvents> select(int maxResult) {
        final List<ParticipantsEvents> result = dao.select(maxResult);
        logger.info("select(ParticipantsEvents) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<ParticipantsEvents> selectAll() {
        final List<ParticipantsEvents> results = dao.selectAll();
        logger.info("selectAll(ParticipantsEvents) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public ParticipantsEvents create(ParticipantsEvents bean) {
        requireNonNull(bean);
        logger.info("create(ParticipantsEvents={}) - entered bean ");

        final ParticipantsEvents result = dao.create(bean);

        logger.info("create(ParticipantsEvents) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public ParticipantsEvents update(ParticipantsEvents bean) {
        requireNonNull(bean);
        logger.info("update(ParticipantsEvents={}) - entered bean ");

        final ParticipantsEvents result = dao.update(bean);

        logger.info("update(ParticipantsEvents) - exited - return value={} result ");
        return result;
    }
}
