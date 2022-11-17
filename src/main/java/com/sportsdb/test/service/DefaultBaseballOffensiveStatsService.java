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
import com.sportsdb.test.dao.BaseballOffensiveStatsDao;
import com.sportsdb.test.entity.BaseballOffensiveStats;

@Stateless
@Named("DefaultBaseballOffensiveStatsService")
public class DefaultBaseballOffensiveStatsService implements BaseballOffensiveStatsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final BaseballOffensiveStatsDao dao;

  @Inject
  @Named("DefaultBaseballOffensiveStatsDao")
  public DefaultBaseballOffensiveStatsService(final BaseballOffensiveStatsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public BaseballOffensiveStats find(java.lang.Integer id) {

    final BaseballOffensiveStats result = dao.find(id);
    logger.info("find(BaseballOffensiveStats) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<BaseballOffensiveStats> select(int maxResult) {
    final List<BaseballOffensiveStats> result = dao.select(maxResult);
    logger.info("select(BaseballOffensiveStats) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<BaseballOffensiveStats> selectAll() {
    final List<BaseballOffensiveStats> results = dao.selectAll();
    logger.info("selectAll(BaseballOffensiveStats) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public BaseballOffensiveStats create(BaseballOffensiveStats bean) {
    requireNonNull(bean);
    logger.info("create(BaseballOffensiveStats={}) - entered bean ");

    final BaseballOffensiveStats result = dao.create(bean);

    logger.info("create(BaseballOffensiveStats) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public BaseballOffensiveStats update(BaseballOffensiveStats bean) {
    requireNonNull(bean);
    logger.info("update(BaseballOffensiveStats={}) - entered bean ");

    final BaseballOffensiveStats result = dao.update(bean);

    logger.info("update(BaseballOffensiveStats) - exited - return value={} result ");
    return result;
  }
}
