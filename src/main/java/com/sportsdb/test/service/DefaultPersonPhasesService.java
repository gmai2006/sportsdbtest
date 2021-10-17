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

import com.sportsdb.test.dao.PersonPhasesDao;
import com.sportsdb.test.entity.PersonPhases;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultPersonPhasesService")
public class DefaultPersonPhasesService implements PersonPhasesService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final PersonPhasesDao dao;

    @Inject
    @Named("DefaultPersonPhasesDao")
    public DefaultPersonPhasesService(final PersonPhasesDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public PersonPhases find(java.lang.Integer id) {

        final PersonPhases result = dao.find(id);
        logger.info("find(PersonPhases) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<PersonPhases> select(int maxResult) {
        final List<PersonPhases> result = dao.select(maxResult);
        logger.info("select(PersonPhases) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<PersonPhases> selectAll() {
        final List<PersonPhases> results = dao.selectAll();
        logger.info("selectAll(PersonPhases) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public PersonPhases create(PersonPhases bean) {
        requireNonNull(bean);
        logger.info("create(PersonPhases={}) - entered bean ");

        final PersonPhases result = dao.create(bean);

        logger.info("create(PersonPhases) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public PersonPhases update(PersonPhases bean) {
        requireNonNull(bean);
        logger.info("update(PersonPhases={}) - entered bean ");

        final PersonPhases result = dao.update(bean);

        logger.info("update(PersonPhases) - exited - return value={} result ");
        return result;
    }
}
