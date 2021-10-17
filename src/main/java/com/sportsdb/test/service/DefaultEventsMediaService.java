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

import com.sportsdb.test.dao.EventsMediaDao;
import com.sportsdb.test.entity.EventsMedia;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultEventsMediaService")
public class DefaultEventsMediaService implements EventsMediaService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final EventsMediaDao dao;

    @Inject
    @Named("DefaultEventsMediaDao")
    public DefaultEventsMediaService(final EventsMediaDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public EventsMedia find(java.lang.String id) {

        final EventsMedia result = dao.find(id);
        logger.info("find(EventsMedia) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<EventsMedia> select(int maxResult) {
        final List<EventsMedia> result = dao.select(maxResult);
        logger.info("select(EventsMedia) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<EventsMedia> selectAll() {
        final List<EventsMedia> results = dao.selectAll();
        logger.info("selectAll(EventsMedia) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public EventsMedia create(EventsMedia bean) {
        requireNonNull(bean);
        logger.info("create(EventsMedia={}) - entered bean ");

        final EventsMedia result = dao.create(bean);

        logger.info("create(EventsMedia) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public EventsMedia update(EventsMedia bean) {
        requireNonNull(bean);
        logger.info("update(EventsMedia={}) - entered bean ");

        final EventsMedia result = dao.update(bean);

        logger.info("update(EventsMedia) - exited - return value={} result ");
        return result;
    }
}
