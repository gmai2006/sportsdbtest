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
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ejb.Stateless;
import javax.inject.Named;
import com.sportsdb.test.dao.AffiliationsEventsDao;
import com.sportsdb.test.entity.AffiliationsEvents;

@Stateless
@Named("DefaultAffiliationsEventsService")
public class DefaultAffiliationsEventsService implements AffiliationsEventsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AffiliationsEventsDao dao;

  @Inject
  @Named("DefaultAffiliationsEventsDao")
  public DefaultAffiliationsEventsService(final AffiliationsEventsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public AffiliationsEvents find(java.lang.String id) {

    final AffiliationsEvents result = dao.find(id);
    logger.info("find(AffiliationsEvents) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<AffiliationsEvents> select(int maxResult) {
    final List<AffiliationsEvents> result = dao.select(maxResult);
    logger.info("select(AffiliationsEvents) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<AffiliationsEvents> selectAll() {
    final List<AffiliationsEvents> results = dao.selectAll();
    logger.info("selectAll(AffiliationsEvents) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public AffiliationsEvents create(AffiliationsEvents bean) {
    requireNonNull(bean);
    logger.info("create(AffiliationsEvents={}) - entered bean ");

    final AffiliationsEvents result = dao.create(bean);

    logger.info("create(AffiliationsEvents) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public AffiliationsEvents update(AffiliationsEvents bean) {
    requireNonNull(bean);
    logger.info("update(AffiliationsEvents={}) - entered bean ");

    final AffiliationsEvents result = dao.update(bean);

    logger.info("update(AffiliationsEvents) - exited - return value={} result ");
    return result;
  }
}
