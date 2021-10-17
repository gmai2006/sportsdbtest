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

import com.sportsdb.test.dao.BaseballActionPlaysDao;
import com.sportsdb.test.entity.BaseballActionPlays;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultBaseballActionPlaysService")
public class DefaultBaseballActionPlaysService implements BaseballActionPlaysService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final BaseballActionPlaysDao dao;

    @Inject
    @Named("DefaultBaseballActionPlaysDao")
    public DefaultBaseballActionPlaysService(final BaseballActionPlaysDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballActionPlays find(java.lang.Integer id) {

        final BaseballActionPlays result = dao.find(id);
        logger.info("find(BaseballActionPlays) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballActionPlays> select(int maxResult) {
        final List<BaseballActionPlays> result = dao.select(maxResult);
        logger.info("select(BaseballActionPlays) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballActionPlays> selectAll() {
        final List<BaseballActionPlays> results = dao.selectAll();
        logger.info("selectAll(BaseballActionPlays) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballActionPlays create(BaseballActionPlays bean) {
        requireNonNull(bean);
        logger.info("create(BaseballActionPlays={}) - entered bean ");

        final BaseballActionPlays result = dao.create(bean);

        logger.info("create(BaseballActionPlays) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballActionPlays update(BaseballActionPlays bean) {
        requireNonNull(bean);
        logger.info("update(BaseballActionPlays={}) - entered bean ");

        final BaseballActionPlays result = dao.update(bean);

        logger.info("update(BaseballActionPlays) - exited - return value={} result ");
        return result;
    }
}
