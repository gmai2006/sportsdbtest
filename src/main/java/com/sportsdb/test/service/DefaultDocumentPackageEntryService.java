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

import com.sportsdb.test.dao.DocumentPackageEntryDao;
import com.sportsdb.test.entity.DocumentPackageEntry;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultDocumentPackageEntryService")
public class DefaultDocumentPackageEntryService implements DocumentPackageEntryService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final DocumentPackageEntryDao dao;

    @Inject
    @Named("DefaultDocumentPackageEntryDao")
    public DefaultDocumentPackageEntryService(final DocumentPackageEntryDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentPackageEntry find(java.lang.Integer id) {

        final DocumentPackageEntry result = dao.find(id);
        logger.info("find(DocumentPackageEntry) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<DocumentPackageEntry> select(int maxResult) {
        final List<DocumentPackageEntry> result = dao.select(maxResult);
        logger.info("select(DocumentPackageEntry) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<DocumentPackageEntry> selectAll() {
        final List<DocumentPackageEntry> results = dao.selectAll();
        logger.info("selectAll(DocumentPackageEntry) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentPackageEntry create(DocumentPackageEntry bean) {
        requireNonNull(bean);
        logger.info("create(DocumentPackageEntry={}) - entered bean ");

        final DocumentPackageEntry result = dao.create(bean);

        logger.info("create(DocumentPackageEntry) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentPackageEntry update(DocumentPackageEntry bean) {
        requireNonNull(bean);
        logger.info("update(DocumentPackageEntry={}) - entered bean ");

        final DocumentPackageEntry result = dao.update(bean);

        logger.info("update(DocumentPackageEntry) - exited - return value={} result ");
        return result;
    }
}
