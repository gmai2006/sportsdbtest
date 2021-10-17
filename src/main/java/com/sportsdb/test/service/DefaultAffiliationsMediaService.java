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

import com.sportsdb.test.dao.AffiliationsMediaDao;
import com.sportsdb.test.entity.AffiliationsMedia;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultAffiliationsMediaService")
public class DefaultAffiliationsMediaService implements AffiliationsMediaService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final AffiliationsMediaDao dao;

    @Inject
    @Named("DefaultAffiliationsMediaDao")
    public DefaultAffiliationsMediaService(final AffiliationsMediaDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public AffiliationsMedia find(java.lang.String id) {

        final AffiliationsMedia result = dao.find(id);
        logger.info("find(AffiliationsMedia) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<AffiliationsMedia> select(int maxResult) {
        final List<AffiliationsMedia> result = dao.select(maxResult);
        logger.info("select(AffiliationsMedia) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<AffiliationsMedia> selectAll() {
        final List<AffiliationsMedia> results = dao.selectAll();
        logger.info("selectAll(AffiliationsMedia) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public AffiliationsMedia create(AffiliationsMedia bean) {
        requireNonNull(bean);
        logger.info("create(AffiliationsMedia={}) - entered bean ");

        final AffiliationsMedia result = dao.create(bean);

        logger.info("create(AffiliationsMedia) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public AffiliationsMedia update(AffiliationsMedia bean) {
        requireNonNull(bean);
        logger.info("update(AffiliationsMedia={}) - entered bean ");

        final AffiliationsMedia result = dao.update(bean);

        logger.info("update(AffiliationsMedia) - exited - return value={} result ");
        return result;
    }
}
