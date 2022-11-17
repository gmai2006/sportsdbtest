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
import com.sportsdb.test.dao.BasketballTeamStatsDao;
import com.sportsdb.test.entity.BasketballTeamStats;

@Stateless
@Named("DefaultBasketballTeamStatsService")
public class DefaultBasketballTeamStatsService implements BasketballTeamStatsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final BasketballTeamStatsDao dao;

  @Inject
  @Named("DefaultBasketballTeamStatsDao")
  public DefaultBasketballTeamStatsService(final BasketballTeamStatsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public BasketballTeamStats find(java.lang.Integer id) {

    final BasketballTeamStats result = dao.find(id);
    logger.info("find(BasketballTeamStats) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<BasketballTeamStats> select(int maxResult) {
    final List<BasketballTeamStats> result = dao.select(maxResult);
    logger.info("select(BasketballTeamStats) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<BasketballTeamStats> selectAll() {
    final List<BasketballTeamStats> results = dao.selectAll();
    logger.info("selectAll(BasketballTeamStats) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public BasketballTeamStats create(BasketballTeamStats bean) {
    requireNonNull(bean);
    logger.info("create(BasketballTeamStats={}) - entered bean ");

    final BasketballTeamStats result = dao.create(bean);

    logger.info("create(BasketballTeamStats) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public BasketballTeamStats update(BasketballTeamStats bean) {
    requireNonNull(bean);
    logger.info("update(BasketballTeamStats={}) - entered bean ");

    final BasketballTeamStats result = dao.update(bean);

    logger.info("update(BasketballTeamStats) - exited - return value={} result ");
    return result;
  }
}
