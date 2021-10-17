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

import com.sportsdb.test.dao.EventsSubSeasonsDao;
import com.sportsdb.test.entity.EventsSubSeasons;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultEventsSubSeasonsService")
public class DefaultEventsSubSeasonsService implements EventsSubSeasonsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final EventsSubSeasonsDao dao;

    @Inject
    @Named("DefaultEventsSubSeasonsDao")
    public DefaultEventsSubSeasonsService(final EventsSubSeasonsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public EventsSubSeasons find(java.lang.String id) {

        final EventsSubSeasons result = dao.find(id);
        logger.info("find(EventsSubSeasons) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<EventsSubSeasons> select(int maxResult) {
        final List<EventsSubSeasons> result = dao.select(maxResult);
        logger.info("select(EventsSubSeasons) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<EventsSubSeasons> selectAll() {
        final List<EventsSubSeasons> results = dao.selectAll();
        logger.info("selectAll(EventsSubSeasons) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public EventsSubSeasons create(EventsSubSeasons bean) {
        requireNonNull(bean);
        logger.info("create(EventsSubSeasons={}) - entered bean ");

        final EventsSubSeasons result = dao.create(bean);

        logger.info("create(EventsSubSeasons) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public EventsSubSeasons update(EventsSubSeasons bean) {
        requireNonNull(bean);
        logger.info("update(EventsSubSeasons={}) - entered bean ");

        final EventsSubSeasons result = dao.update(bean);

        logger.info("update(EventsSubSeasons) - exited - return value={} result ");
        return result;
    }
}
