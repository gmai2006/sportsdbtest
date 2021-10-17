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

import com.sportsdb.test.dao.SubSeasonsDao;
import com.sportsdb.test.entity.SubSeasons;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultSubSeasonsService")
public class DefaultSubSeasonsService implements SubSeasonsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final SubSeasonsDao dao;

    @Inject
    @Named("DefaultSubSeasonsDao")
    public DefaultSubSeasonsService(final SubSeasonsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public SubSeasons find(java.lang.Integer id) {

        final SubSeasons result = dao.find(id);
        logger.info("find(SubSeasons) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<SubSeasons> select(int maxResult) {
        final List<SubSeasons> result = dao.select(maxResult);
        logger.info("select(SubSeasons) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<SubSeasons> selectAll() {
        final List<SubSeasons> results = dao.selectAll();
        logger.info("selectAll(SubSeasons) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public SubSeasons create(SubSeasons bean) {
        requireNonNull(bean);
        logger.info("create(SubSeasons={}) - entered bean ");

        final SubSeasons result = dao.create(bean);

        logger.info("create(SubSeasons) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public SubSeasons update(SubSeasons bean) {
        requireNonNull(bean);
        logger.info("update(SubSeasons={}) - entered bean ");

        final SubSeasons result = dao.update(bean);

        logger.info("update(SubSeasons) - exited - return value={} result ");
        return result;
    }
}
