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

import com.sportsdb.test.dao.TeamsMediaDao;
import com.sportsdb.test.entity.TeamsMedia;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultTeamsMediaService")
public class DefaultTeamsMediaService implements TeamsMediaService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final TeamsMediaDao dao;

    @Inject
    @Named("DefaultTeamsMediaDao")
    public DefaultTeamsMediaService(final TeamsMediaDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public TeamsMedia find(java.lang.String id) {

        final TeamsMedia result = dao.find(id);
        logger.info("find(TeamsMedia) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<TeamsMedia> select(int maxResult) {
        final List<TeamsMedia> result = dao.select(maxResult);
        logger.info("select(TeamsMedia) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<TeamsMedia> selectAll() {
        final List<TeamsMedia> results = dao.selectAll();
        logger.info("selectAll(TeamsMedia) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public TeamsMedia create(TeamsMedia bean) {
        requireNonNull(bean);
        logger.info("create(TeamsMedia={}) - entered bean ");

        final TeamsMedia result = dao.create(bean);

        logger.info("create(TeamsMedia) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public TeamsMedia update(TeamsMedia bean) {
        requireNonNull(bean);
        logger.info("update(TeamsMedia={}) - entered bean ");

        final TeamsMedia result = dao.update(bean);

        logger.info("update(TeamsMedia) - exited - return value={} result ");
        return result;
    }
}
