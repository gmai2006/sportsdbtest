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

import com.sportsdb.test.dao.DocumentContentsDao;
import com.sportsdb.test.entity.DocumentContents;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultDocumentContentsService")
public class DefaultDocumentContentsService implements DocumentContentsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final DocumentContentsDao dao;

    @Inject
    @Named("DefaultDocumentContentsDao")
    public DefaultDocumentContentsService(final DocumentContentsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentContents find(java.lang.Integer id) {

        final DocumentContents result = dao.find(id);
        logger.info("find(DocumentContents) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<DocumentContents> select(int maxResult) {
        final List<DocumentContents> result = dao.select(maxResult);
        logger.info("select(DocumentContents) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<DocumentContents> selectAll() {
        final List<DocumentContents> results = dao.selectAll();
        logger.info("selectAll(DocumentContents) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentContents create(DocumentContents bean) {
        requireNonNull(bean);
        logger.info("create(DocumentContents={}) - entered bean ");

        final DocumentContents result = dao.create(bean);

        logger.info("create(DocumentContents) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentContents update(DocumentContents bean) {
        requireNonNull(bean);
        logger.info("update(DocumentContents={}) - entered bean ");

        final DocumentContents result = dao.update(bean);

        logger.info("update(DocumentContents) - exited - return value={} result ");
        return result;
    }
}
