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

import com.sportsdb.test.dao.PersonsMediaDao;
import com.sportsdb.test.entity.PersonsMedia;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultPersonsMediaService")
public class DefaultPersonsMediaService implements PersonsMediaService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final PersonsMediaDao dao;

    @Inject
    @Named("DefaultPersonsMediaDao")
    public DefaultPersonsMediaService(final PersonsMediaDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public PersonsMedia find(java.lang.String id) {

        final PersonsMedia result = dao.find(id);
        logger.info("find(PersonsMedia) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<PersonsMedia> select(int maxResult) {
        final List<PersonsMedia> result = dao.select(maxResult);
        logger.info("select(PersonsMedia) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<PersonsMedia> selectAll() {
        final List<PersonsMedia> results = dao.selectAll();
        logger.info("selectAll(PersonsMedia) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public PersonsMedia create(PersonsMedia bean) {
        requireNonNull(bean);
        logger.info("create(PersonsMedia={}) - entered bean ");

        final PersonsMedia result = dao.create(bean);

        logger.info("create(PersonsMedia) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public PersonsMedia update(PersonsMedia bean) {
        requireNonNull(bean);
        logger.info("update(PersonsMedia={}) - entered bean ");

        final PersonsMedia result = dao.update(bean);

        logger.info("update(PersonsMedia) - exited - return value={} result ");
        return result;
    }
}
