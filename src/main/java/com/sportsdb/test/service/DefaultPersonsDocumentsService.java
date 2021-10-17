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

import com.sportsdb.test.dao.PersonsDocumentsDao;
import com.sportsdb.test.entity.PersonsDocuments;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultPersonsDocumentsService")
public class DefaultPersonsDocumentsService implements PersonsDocumentsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final PersonsDocumentsDao dao;

    @Inject
    @Named("DefaultPersonsDocumentsDao")
    public DefaultPersonsDocumentsService(final PersonsDocumentsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public PersonsDocuments find(java.lang.String id) {

        final PersonsDocuments result = dao.find(id);
        logger.info("find(PersonsDocuments) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<PersonsDocuments> select(int maxResult) {
        final List<PersonsDocuments> result = dao.select(maxResult);
        logger.info("select(PersonsDocuments) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<PersonsDocuments> selectAll() {
        final List<PersonsDocuments> results = dao.selectAll();
        logger.info("selectAll(PersonsDocuments) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public PersonsDocuments create(PersonsDocuments bean) {
        requireNonNull(bean);
        logger.info("create(PersonsDocuments={}) - entered bean ");

        final PersonsDocuments result = dao.create(bean);

        logger.info("create(PersonsDocuments) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public PersonsDocuments update(PersonsDocuments bean) {
        requireNonNull(bean);
        logger.info("update(PersonsDocuments={}) - entered bean ");

        final PersonsDocuments result = dao.update(bean);

        logger.info("update(PersonsDocuments) - exited - return value={} result ");
        return result;
    }
}
