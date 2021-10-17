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

import com.sportsdb.test.dao.SeasonsDao;
import com.sportsdb.test.entity.Seasons;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultSeasonsService")
public class DefaultSeasonsService implements SeasonsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final SeasonsDao dao;

    @Inject
    @Named("DefaultSeasonsDao")
    public DefaultSeasonsService(final SeasonsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public Seasons find(java.lang.Integer id) {

        final Seasons result = dao.find(id);
        logger.info("find(Seasons) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<Seasons> select(int maxResult) {
        final List<Seasons> result = dao.select(maxResult);
        logger.info("select(Seasons) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<Seasons> selectAll() {
        final List<Seasons> results = dao.selectAll();
        logger.info("selectAll(Seasons) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public Seasons create(Seasons bean) {
        requireNonNull(bean);
        logger.info("create(Seasons={}) - entered bean ");

        final Seasons result = dao.create(bean);

        logger.info("create(Seasons) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public Seasons update(Seasons bean) {
        requireNonNull(bean);
        logger.info("update(Seasons={}) - entered bean ");

        final Seasons result = dao.update(bean);

        logger.info("update(Seasons) - exited - return value={} result ");
        return result;
    }
}
