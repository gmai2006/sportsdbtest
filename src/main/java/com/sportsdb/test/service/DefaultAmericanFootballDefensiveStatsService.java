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
import com.sportsdb.test.dao.AmericanFootballDefensiveStatsDao;
import com.sportsdb.test.entity.AmericanFootballDefensiveStats;

@Stateless
@Named("DefaultAmericanFootballDefensiveStatsService")
public class DefaultAmericanFootballDefensiveStatsService
    implements AmericanFootballDefensiveStatsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AmericanFootballDefensiveStatsDao dao;

  @Inject
  @Named("DefaultAmericanFootballDefensiveStatsDao")
  public DefaultAmericanFootballDefensiveStatsService(final AmericanFootballDefensiveStatsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public AmericanFootballDefensiveStats find(java.lang.Integer id) {

    final AmericanFootballDefensiveStats result = dao.find(id);
    logger.info("find(AmericanFootballDefensiveStats) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<AmericanFootballDefensiveStats> select(int maxResult) {
    final List<AmericanFootballDefensiveStats> result = dao.select(maxResult);
    logger.info("select(AmericanFootballDefensiveStats) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<AmericanFootballDefensiveStats> selectAll() {
    final List<AmericanFootballDefensiveStats> results = dao.selectAll();
    logger.info("selectAll(AmericanFootballDefensiveStats) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public AmericanFootballDefensiveStats create(AmericanFootballDefensiveStats bean) {
    requireNonNull(bean);
    logger.info("create(AmericanFootballDefensiveStats={}) - entered bean ");

    final AmericanFootballDefensiveStats result = dao.create(bean);

    logger.info("create(AmericanFootballDefensiveStats) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public AmericanFootballDefensiveStats update(AmericanFootballDefensiveStats bean) {
    requireNonNull(bean);
    logger.info("update(AmericanFootballDefensiveStats={}) - entered bean ");

    final AmericanFootballDefensiveStats result = dao.update(bean);

    logger.info("update(AmericanFootballDefensiveStats) - exited - return value={} result ");
    return result;
  }
}
