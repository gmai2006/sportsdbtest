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

import com.sportsdb.test.dao.InjuryPhasesDao;
import com.sportsdb.test.entity.InjuryPhases;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultInjuryPhasesService")
public class DefaultInjuryPhasesService implements InjuryPhasesService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final InjuryPhasesDao dao;

    @Inject
    @Named("DefaultInjuryPhasesDao")
    public DefaultInjuryPhasesService(final InjuryPhasesDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public InjuryPhases find(java.lang.Integer id) {

        final InjuryPhases result = dao.find(id);
        logger.info("find(InjuryPhases) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<InjuryPhases> select(int maxResult) {
        final List<InjuryPhases> result = dao.select(maxResult);
        logger.info("select(InjuryPhases) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<InjuryPhases> selectAll() {
        final List<InjuryPhases> results = dao.selectAll();
        logger.info("selectAll(InjuryPhases) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public InjuryPhases create(InjuryPhases bean) {
        requireNonNull(bean);
        logger.info("create(InjuryPhases={}) - entered bean ");

        final InjuryPhases result = dao.create(bean);

        logger.info("create(InjuryPhases) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public InjuryPhases update(InjuryPhases bean) {
        requireNonNull(bean);
        logger.info("update(InjuryPhases={}) - entered bean ");

        final InjuryPhases result = dao.update(bean);

        logger.info("update(InjuryPhases) - exited - return value={} result ");
        return result;
    }
}
