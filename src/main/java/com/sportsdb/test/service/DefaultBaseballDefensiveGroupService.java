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

import com.sportsdb.test.dao.BaseballDefensiveGroupDao;
import com.sportsdb.test.entity.BaseballDefensiveGroup;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultBaseballDefensiveGroupService")
public class DefaultBaseballDefensiveGroupService implements BaseballDefensiveGroupService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final BaseballDefensiveGroupDao dao;

    @Inject
    @Named("DefaultBaseballDefensiveGroupDao")
    public DefaultBaseballDefensiveGroupService(final BaseballDefensiveGroupDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballDefensiveGroup find(java.lang.Integer id) {

        final BaseballDefensiveGroup result = dao.find(id);
        logger.info("find(BaseballDefensiveGroup) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballDefensiveGroup> select(int maxResult) {
        final List<BaseballDefensiveGroup> result = dao.select(maxResult);
        logger.info("select(BaseballDefensiveGroup) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballDefensiveGroup> selectAll() {
        final List<BaseballDefensiveGroup> results = dao.selectAll();
        logger.info("selectAll(BaseballDefensiveGroup) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballDefensiveGroup create(BaseballDefensiveGroup bean) {
        requireNonNull(bean);
        logger.info("create(BaseballDefensiveGroup={}) - entered bean ");

        final BaseballDefensiveGroup result = dao.create(bean);

        logger.info("create(BaseballDefensiveGroup) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballDefensiveGroup update(BaseballDefensiveGroup bean) {
        requireNonNull(bean);
        logger.info("update(BaseballDefensiveGroup={}) - entered bean ");

        final BaseballDefensiveGroup result = dao.update(bean);

        logger.info("update(BaseballDefensiveGroup) - exited - return value={} result ");
        return result;
    }
}
