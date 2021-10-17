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

import com.sportsdb.test.dao.AffiliationsDocumentsDao;
import com.sportsdb.test.entity.AffiliationsDocuments;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultAffiliationsDocumentsService")
public class DefaultAffiliationsDocumentsService implements AffiliationsDocumentsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final AffiliationsDocumentsDao dao;

    @Inject
    @Named("DefaultAffiliationsDocumentsDao")
    public DefaultAffiliationsDocumentsService(final AffiliationsDocumentsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public AffiliationsDocuments find(java.lang.String id) {

        final AffiliationsDocuments result = dao.find(id);
        logger.info("find(AffiliationsDocuments) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<AffiliationsDocuments> select(int maxResult) {
        final List<AffiliationsDocuments> result = dao.select(maxResult);
        logger.info("select(AffiliationsDocuments) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<AffiliationsDocuments> selectAll() {
        final List<AffiliationsDocuments> results = dao.selectAll();
        logger.info("selectAll(AffiliationsDocuments) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public AffiliationsDocuments create(AffiliationsDocuments bean) {
        requireNonNull(bean);
        logger.info("create(AffiliationsDocuments={}) - entered bean ");

        final AffiliationsDocuments result = dao.create(bean);

        logger.info("create(AffiliationsDocuments) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public AffiliationsDocuments update(AffiliationsDocuments bean) {
        requireNonNull(bean);
        logger.info("update(AffiliationsDocuments={}) - entered bean ");

        final AffiliationsDocuments result = dao.update(bean);

        logger.info("update(AffiliationsDocuments) - exited - return value={} result ");
        return result;
    }
}
