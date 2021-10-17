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

import com.sportsdb.test.dao.PersonsDao;
import com.sportsdb.test.entity.Persons;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultPersonsService")
public class DefaultPersonsService implements PersonsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final PersonsDao dao;

    @Inject
    @Named("DefaultPersonsDao")
    public DefaultPersonsService(final PersonsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public Persons find(java.lang.Integer id) {

        final Persons result = dao.find(id);
        logger.info("find(Persons) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<Persons> select(int maxResult) {
        final List<Persons> result = dao.select(maxResult);
        logger.info("select(Persons) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<Persons> selectAll() {
        final List<Persons> results = dao.selectAll();
        logger.info("selectAll(Persons) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public Persons create(Persons bean) {
        requireNonNull(bean);
        logger.info("create(Persons={}) - entered bean ");

        final Persons result = dao.create(bean);

        logger.info("create(Persons) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public Persons update(Persons bean) {
        requireNonNull(bean);
        logger.info("update(Persons={}) - entered bean ");

        final Persons result = dao.update(bean);

        logger.info("update(Persons) - exited - return value={} result ");
        return result;
    }
}
