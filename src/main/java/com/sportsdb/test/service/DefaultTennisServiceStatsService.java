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
import com.sportsdb.test.dao.TennisServiceStatsDao;
import com.sportsdb.test.entity.TennisServiceStats;

@Stateless
@Named("DefaultTennisServiceStatsService")
public class DefaultTennisServiceStatsService implements TennisServiceStatsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TennisServiceStatsDao dao;

  @Inject
  @Named("DefaultTennisServiceStatsDao")
  public DefaultTennisServiceStatsService(final TennisServiceStatsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public TennisServiceStats find(java.lang.Integer id) {

    final TennisServiceStats result = dao.find(id);
    logger.info("find(TennisServiceStats) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<TennisServiceStats> select(int maxResult) {
    final List<TennisServiceStats> result = dao.select(maxResult);
    logger.info("select(TennisServiceStats) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<TennisServiceStats> selectAll() {
    final List<TennisServiceStats> results = dao.selectAll();
    logger.info("selectAll(TennisServiceStats) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public TennisServiceStats create(TennisServiceStats bean) {
    requireNonNull(bean);
    logger.info("create(TennisServiceStats={}) - entered bean ");

    final TennisServiceStats result = dao.create(bean);

    logger.info("create(TennisServiceStats) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public TennisServiceStats update(TennisServiceStats bean) {
    requireNonNull(bean);
    logger.info("update(TennisServiceStats={}) - entered bean ");

    final TennisServiceStats result = dao.update(bean);

    logger.info("update(TennisServiceStats) - exited - return value={} result ");
    return result;
  }
}
