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

import com.sportsdb.test.dao.BookmakersDao;
import com.sportsdb.test.entity.Bookmakers;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultBookmakersService")
public class DefaultBookmakersService implements BookmakersService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final BookmakersDao dao;

    @Inject
    @Named("DefaultBookmakersDao")
    public DefaultBookmakersService(final BookmakersDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public Bookmakers find(java.lang.Integer id) {

        final Bookmakers result = dao.find(id);
        logger.info("find(Bookmakers) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<Bookmakers> select(int maxResult) {
        final List<Bookmakers> result = dao.select(maxResult);
        logger.info("select(Bookmakers) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<Bookmakers> selectAll() {
        final List<Bookmakers> results = dao.selectAll();
        logger.info("selectAll(Bookmakers) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public Bookmakers create(Bookmakers bean) {
        requireNonNull(bean);
        logger.info("create(Bookmakers={}) - entered bean ");

        final Bookmakers result = dao.create(bean);

        logger.info("create(Bookmakers) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public Bookmakers update(Bookmakers bean) {
        requireNonNull(bean);
        logger.info("update(Bookmakers={}) - entered bean ");

        final Bookmakers result = dao.update(bean);

        logger.info("update(Bookmakers) - exited - return value={} result ");
        return result;
    }
}
