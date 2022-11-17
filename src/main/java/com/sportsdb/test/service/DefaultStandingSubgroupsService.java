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
import com.sportsdb.test.dao.StandingSubgroupsDao;
import com.sportsdb.test.entity.StandingSubgroups;

@Stateless
@Named("DefaultStandingSubgroupsService")
public class DefaultStandingSubgroupsService implements StandingSubgroupsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final StandingSubgroupsDao dao;

  @Inject
  @Named("DefaultStandingSubgroupsDao")
  public DefaultStandingSubgroupsService(final StandingSubgroupsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public StandingSubgroups find(java.lang.Integer id) {

    final StandingSubgroups result = dao.find(id);
    logger.info("find(StandingSubgroups) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<StandingSubgroups> select(int maxResult) {
    final List<StandingSubgroups> result = dao.select(maxResult);
    logger.info("select(StandingSubgroups) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<StandingSubgroups> selectAll() {
    final List<StandingSubgroups> results = dao.selectAll();
    logger.info("selectAll(StandingSubgroups) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public StandingSubgroups create(StandingSubgroups bean) {
    requireNonNull(bean);
    logger.info("create(StandingSubgroups={}) - entered bean ");

    final StandingSubgroups result = dao.create(bean);

    logger.info("create(StandingSubgroups) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public StandingSubgroups update(StandingSubgroups bean) {
    requireNonNull(bean);
    logger.info("update(StandingSubgroups={}) - entered bean ");

    final StandingSubgroups result = dao.update(bean);

    logger.info("update(StandingSubgroups) - exited - return value={} result ");
    return result;
  }
}
