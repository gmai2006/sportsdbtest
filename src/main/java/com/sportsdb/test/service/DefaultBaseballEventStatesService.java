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

import com.sportsdb.test.dao.BaseballEventStatesDao;
import com.sportsdb.test.entity.BaseballEventStates;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultBaseballEventStatesService")
public class DefaultBaseballEventStatesService implements BaseballEventStatesService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final BaseballEventStatesDao dao;

    @Inject
    @Named("DefaultBaseballEventStatesDao")
    public DefaultBaseballEventStatesService(final BaseballEventStatesDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballEventStates find(java.lang.Integer id) {

        final BaseballEventStates result = dao.find(id);
        logger.info("find(BaseballEventStates) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballEventStates> select(int maxResult) {
        final List<BaseballEventStates> result = dao.select(maxResult);
        logger.info("select(BaseballEventStates) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballEventStates> selectAll() {
        final List<BaseballEventStates> results = dao.selectAll();
        logger.info("selectAll(BaseballEventStates) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballEventStates create(BaseballEventStates bean) {
        requireNonNull(bean);
        logger.info("create(BaseballEventStates={}) - entered bean ");

        final BaseballEventStates result = dao.create(bean);

        logger.info("create(BaseballEventStates) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballEventStates update(BaseballEventStates bean) {
        requireNonNull(bean);
        logger.info("update(BaseballEventStates={}) - entered bean ");

        final BaseballEventStates result = dao.update(bean);

        logger.info("update(BaseballEventStates) - exited - return value={} result ");
        return result;
    }
}
