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

import com.sportsdb.test.dao.DocumentPackagesDao;
import com.sportsdb.test.entity.DocumentPackages;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultDocumentPackagesService")
public class DefaultDocumentPackagesService implements DocumentPackagesService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final DocumentPackagesDao dao;

    @Inject
    @Named("DefaultDocumentPackagesDao")
    public DefaultDocumentPackagesService(final DocumentPackagesDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentPackages find(java.lang.Integer id) {

        final DocumentPackages result = dao.find(id);
        logger.info("find(DocumentPackages) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<DocumentPackages> select(int maxResult) {
        final List<DocumentPackages> result = dao.select(maxResult);
        logger.info("select(DocumentPackages) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<DocumentPackages> selectAll() {
        final List<DocumentPackages> results = dao.selectAll();
        logger.info("selectAll(DocumentPackages) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentPackages create(DocumentPackages bean) {
        requireNonNull(bean);
        logger.info("create(DocumentPackages={}) - entered bean ");

        final DocumentPackages result = dao.create(bean);

        logger.info("create(DocumentPackages) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentPackages update(DocumentPackages bean) {
        requireNonNull(bean);
        logger.info("update(DocumentPackages={}) - entered bean ");

        final DocumentPackages result = dao.update(bean);

        logger.info("update(DocumentPackages) - exited - return value={} result ");
        return result;
    }
}
