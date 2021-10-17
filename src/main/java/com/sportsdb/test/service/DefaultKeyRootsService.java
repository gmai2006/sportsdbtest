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

import com.sportsdb.test.dao.KeyRootsDao;
import com.sportsdb.test.entity.KeyRoots;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultKeyRootsService")
public class DefaultKeyRootsService implements KeyRootsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final KeyRootsDao dao;

    @Inject
    @Named("DefaultKeyRootsDao")
    public DefaultKeyRootsService(final KeyRootsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public KeyRoots find(java.lang.Integer id) {

        final KeyRoots result = dao.find(id);
        logger.info("find(KeyRoots) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<KeyRoots> select(int maxResult) {
        final List<KeyRoots> result = dao.select(maxResult);
        logger.info("select(KeyRoots) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<KeyRoots> selectAll() {
        final List<KeyRoots> results = dao.selectAll();
        logger.info("selectAll(KeyRoots) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public KeyRoots create(KeyRoots bean) {
        requireNonNull(bean);
        logger.info("create(KeyRoots={}) - entered bean ");

        final KeyRoots result = dao.create(bean);

        logger.info("create(KeyRoots) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public KeyRoots update(KeyRoots bean) {
        requireNonNull(bean);
        logger.info("update(KeyRoots={}) - entered bean ");

        final KeyRoots result = dao.update(bean);

        logger.info("update(KeyRoots) - exited - return value={} result ");
        return result;
    }
}
