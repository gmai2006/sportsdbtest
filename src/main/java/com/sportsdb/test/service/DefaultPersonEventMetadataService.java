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

import com.sportsdb.test.dao.PersonEventMetadataDao;
import com.sportsdb.test.entity.PersonEventMetadata;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultPersonEventMetadataService")
public class DefaultPersonEventMetadataService implements PersonEventMetadataService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final PersonEventMetadataDao dao;

    @Inject
    @Named("DefaultPersonEventMetadataDao")
    public DefaultPersonEventMetadataService(final PersonEventMetadataDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public PersonEventMetadata find(java.lang.Integer id) {

        final PersonEventMetadata result = dao.find(id);
        logger.info("find(PersonEventMetadata) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<PersonEventMetadata> select(int maxResult) {
        final List<PersonEventMetadata> result = dao.select(maxResult);
        logger.info("select(PersonEventMetadata) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<PersonEventMetadata> selectAll() {
        final List<PersonEventMetadata> results = dao.selectAll();
        logger.info("selectAll(PersonEventMetadata) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public PersonEventMetadata create(PersonEventMetadata bean) {
        requireNonNull(bean);
        logger.info("create(PersonEventMetadata={}) - entered bean ");

        final PersonEventMetadata result = dao.create(bean);

        logger.info("create(PersonEventMetadata) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public PersonEventMetadata update(PersonEventMetadata bean) {
        requireNonNull(bean);
        logger.info("update(PersonEventMetadata={}) - entered bean ");

        final PersonEventMetadata result = dao.update(bean);

        logger.info("update(PersonEventMetadata) - exited - return value={} result ");
        return result;
    }
}
