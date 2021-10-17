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

import com.sportsdb.test.dao.EventsDao;
import com.sportsdb.test.entity.Events;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultEventsService")
public class DefaultEventsService implements EventsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final EventsDao dao;

    @Inject
    @Named("DefaultEventsDao")
    public DefaultEventsService(final EventsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public Events find(java.lang.Integer id) {

        final Events result = dao.find(id);
        logger.info("find(Events) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<Events> select(int maxResult) {
        final List<Events> result = dao.select(maxResult);
        logger.info("select(Events) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<Events> selectAll() {
        final List<Events> results = dao.selectAll();
        logger.info("selectAll(Events) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public Events create(Events bean) {
        requireNonNull(bean);
        logger.info("create(Events={}) - entered bean ");

        final Events result = dao.create(bean);

        logger.info("create(Events) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public Events update(Events bean) {
        requireNonNull(bean);
        logger.info("update(Events={}) - entered bean ");

        final Events result = dao.update(bean);

        logger.info("update(Events) - exited - return value={} result ");
        return result;
    }
}
