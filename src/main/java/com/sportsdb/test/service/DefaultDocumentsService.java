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

import com.sportsdb.test.dao.DocumentsDao;
import com.sportsdb.test.entity.Documents;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultDocumentsService")
public class DefaultDocumentsService implements DocumentsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final DocumentsDao dao;

    @Inject
    @Named("DefaultDocumentsDao")
    public DefaultDocumentsService(final DocumentsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public Documents find(java.lang.Integer id) {

        final Documents result = dao.find(id);
        logger.info("find(Documents) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<Documents> select(int maxResult) {
        final List<Documents> result = dao.select(maxResult);
        logger.info("select(Documents) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<Documents> selectAll() {
        final List<Documents> results = dao.selectAll();
        logger.info("selectAll(Documents) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public Documents create(Documents bean) {
        requireNonNull(bean);
        logger.info("create(Documents={}) - entered bean ");

        final Documents result = dao.create(bean);

        logger.info("create(Documents) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public Documents update(Documents bean) {
        requireNonNull(bean);
        logger.info("update(Documents={}) - entered bean ");

        final Documents result = dao.update(bean);

        logger.info("update(Documents) - exited - return value={} result ");
        return result;
    }
}
