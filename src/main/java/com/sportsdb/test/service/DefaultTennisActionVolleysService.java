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

import com.sportsdb.test.dao.TennisActionVolleysDao;
import com.sportsdb.test.entity.TennisActionVolleys;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultTennisActionVolleysService")
public class DefaultTennisActionVolleysService implements TennisActionVolleysService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final TennisActionVolleysDao dao;

    @Inject
    @Named("DefaultTennisActionVolleysDao")
    public DefaultTennisActionVolleysService(final TennisActionVolleysDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public TennisActionVolleys find(java.lang.Integer id) {

        final TennisActionVolleys result = dao.find(id);
        logger.info("find(TennisActionVolleys) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<TennisActionVolleys> select(int maxResult) {
        final List<TennisActionVolleys> result = dao.select(maxResult);
        logger.info("select(TennisActionVolleys) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<TennisActionVolleys> selectAll() {
        final List<TennisActionVolleys> results = dao.selectAll();
        logger.info("selectAll(TennisActionVolleys) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public TennisActionVolleys create(TennisActionVolleys bean) {
        requireNonNull(bean);
        logger.info("create(TennisActionVolleys={}) - entered bean ");

        final TennisActionVolleys result = dao.create(bean);

        logger.info("create(TennisActionVolleys) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public TennisActionVolleys update(TennisActionVolleys bean) {
        requireNonNull(bean);
        logger.info("update(TennisActionVolleys={}) - entered bean ");

        final TennisActionVolleys result = dao.update(bean);

        logger.info("update(TennisActionVolleys) - exited - return value={} result ");
        return result;
    }
}
