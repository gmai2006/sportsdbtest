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

import com.sportsdb.test.dao.PublishersDao;
import com.sportsdb.test.entity.Publishers;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultPublishersService")
public class DefaultPublishersService implements PublishersService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final PublishersDao dao;

    @Inject
    @Named("DefaultPublishersDao")
    public DefaultPublishersService(final PublishersDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public Publishers find(java.lang.Integer id) {

        final Publishers result = dao.find(id);
        logger.info("find(Publishers) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<Publishers> select(int maxResult) {
        final List<Publishers> result = dao.select(maxResult);
        logger.info("select(Publishers) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<Publishers> selectAll() {
        final List<Publishers> results = dao.selectAll();
        logger.info("selectAll(Publishers) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public Publishers create(Publishers bean) {
        requireNonNull(bean);
        logger.info("create(Publishers={}) - entered bean ");

        final Publishers result = dao.create(bean);

        logger.info("create(Publishers) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public Publishers update(Publishers bean) {
        requireNonNull(bean);
        logger.info("update(Publishers={}) - entered bean ");

        final Publishers result = dao.update(bean);

        logger.info("update(Publishers) - exited - return value={} result ");
        return result;
    }
}
