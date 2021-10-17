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

import com.sportsdb.test.dao.BaseballActionContactDetailsDao;
import com.sportsdb.test.entity.BaseballActionContactDetails;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultBaseballActionContactDetailsService")
public class DefaultBaseballActionContactDetailsService
        implements BaseballActionContactDetailsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final BaseballActionContactDetailsDao dao;

    @Inject
    @Named("DefaultBaseballActionContactDetailsDao")
    public DefaultBaseballActionContactDetailsService(final BaseballActionContactDetailsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballActionContactDetails find(java.lang.Integer id) {

        final BaseballActionContactDetails result = dao.find(id);
        logger.info("find(BaseballActionContactDetails) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballActionContactDetails> select(int maxResult) {
        final List<BaseballActionContactDetails> result = dao.select(maxResult);
        logger.info("select(BaseballActionContactDetails) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<BaseballActionContactDetails> selectAll() {
        final List<BaseballActionContactDetails> results = dao.selectAll();
        logger.info("selectAll(BaseballActionContactDetails) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballActionContactDetails create(BaseballActionContactDetails bean) {
        requireNonNull(bean);
        logger.info("create(BaseballActionContactDetails={}) - entered bean ");

        final BaseballActionContactDetails result = dao.create(bean);

        logger.info("create(BaseballActionContactDetails) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public BaseballActionContactDetails update(BaseballActionContactDetails bean) {
        requireNonNull(bean);
        logger.info("update(BaseballActionContactDetails={}) - entered bean ");

        final BaseballActionContactDetails result = dao.update(bean);

        logger.info("update(BaseballActionContactDetails) - exited - return value={} result ");
        return result;
    }
}
