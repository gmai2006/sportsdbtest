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

import com.sportsdb.test.dao.TeamsDocumentsDao;
import com.sportsdb.test.entity.TeamsDocuments;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultTeamsDocumentsService")
public class DefaultTeamsDocumentsService implements TeamsDocumentsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final TeamsDocumentsDao dao;

    @Inject
    @Named("DefaultTeamsDocumentsDao")
    public DefaultTeamsDocumentsService(final TeamsDocumentsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public TeamsDocuments find(java.lang.String id) {

        final TeamsDocuments result = dao.find(id);
        logger.info("find(TeamsDocuments) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<TeamsDocuments> select(int maxResult) {
        final List<TeamsDocuments> result = dao.select(maxResult);
        logger.info("select(TeamsDocuments) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<TeamsDocuments> selectAll() {
        final List<TeamsDocuments> results = dao.selectAll();
        logger.info("selectAll(TeamsDocuments) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public TeamsDocuments create(TeamsDocuments bean) {
        requireNonNull(bean);
        logger.info("create(TeamsDocuments={}) - entered bean ");

        final TeamsDocuments result = dao.create(bean);

        logger.info("create(TeamsDocuments) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public TeamsDocuments update(TeamsDocuments bean) {
        requireNonNull(bean);
        logger.info("update(TeamsDocuments={}) - entered bean ");

        final TeamsDocuments result = dao.update(bean);

        logger.info("update(TeamsDocuments) - exited - return value={} result ");
        return result;
    }
}
