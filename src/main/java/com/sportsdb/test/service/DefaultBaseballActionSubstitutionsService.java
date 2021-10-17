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

import com.sportsdb.test.dao.BaseballActionSubstitutionsDao;
import com.sportsdb.test.entity.BaseballActionSubstitutions;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultBaseballActionSubstitutionsService")
public class DefaultBaseballActionSubstitutionsService
        implements BaseballActionSubstitutionsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final BaseballActionSubstitutionsDao dao;

    @Inject
    @Named("DefaultBaseballActionSubstitutionsDao")
    public DefaultBaseballActionSubstitutionsService(final BaseballActionSubstitutionsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballActionSubstitutions find(java.lang.Integer id) {

        final BaseballActionSubstitutions result = dao.find(id);
        logger.info("find(BaseballActionSubstitutions) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballActionSubstitutions> select(int maxResult) {
        final List<BaseballActionSubstitutions> result = dao.select(maxResult);
        logger.info("select(BaseballActionSubstitutions) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballActionSubstitutions> selectAll() {
        final List<BaseballActionSubstitutions> results = dao.selectAll();
        logger.info("selectAll(BaseballActionSubstitutions) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballActionSubstitutions create(BaseballActionSubstitutions bean) {
        requireNonNull(bean);
        logger.info("create(BaseballActionSubstitutions={}) - entered bean ");

        final BaseballActionSubstitutions result = dao.create(bean);

        logger.info("create(BaseballActionSubstitutions) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballActionSubstitutions update(BaseballActionSubstitutions bean) {
        requireNonNull(bean);
        logger.info("update(BaseballActionSubstitutions={}) - entered bean ");

        final BaseballActionSubstitutions result = dao.update(bean);

        logger.info("update(BaseballActionSubstitutions) - exited - return value={} result ");
        return result;
    }
}
