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

import com.sportsdb.test.dao.MediaKeywordsDao;
import com.sportsdb.test.entity.MediaKeywords;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultMediaKeywordsService")
public class DefaultMediaKeywordsService implements MediaKeywordsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final MediaKeywordsDao dao;

    @Inject
    @Named("DefaultMediaKeywordsDao")
    public DefaultMediaKeywordsService(final MediaKeywordsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public MediaKeywords find(java.lang.Integer id) {

        final MediaKeywords result = dao.find(id);
        logger.info("find(MediaKeywords) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<MediaKeywords> select(int maxResult) {
        final List<MediaKeywords> result = dao.select(maxResult);
        logger.info("select(MediaKeywords) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<MediaKeywords> selectAll() {
        final List<MediaKeywords> results = dao.selectAll();
        logger.info("selectAll(MediaKeywords) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public MediaKeywords create(MediaKeywords bean) {
        requireNonNull(bean);
        logger.info("create(MediaKeywords={}) - entered bean ");

        final MediaKeywords result = dao.create(bean);

        logger.info("create(MediaKeywords) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public MediaKeywords update(MediaKeywords bean) {
        requireNonNull(bean);
        logger.info("update(MediaKeywords={}) - entered bean ");

        final MediaKeywords result = dao.update(bean);

        logger.info("update(MediaKeywords) - exited - return value={} result ");
        return result;
    }
}
