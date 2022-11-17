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
import com.sportsdb.test.dao.AmericanFootballDownProgressStatsDao;
import com.sportsdb.test.entity.AmericanFootballDownProgressStats;

@Stateless
@Named("DefaultAmericanFootballDownProgressStatsService")
public class DefaultAmericanFootballDownProgressStatsService
    implements AmericanFootballDownProgressStatsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AmericanFootballDownProgressStatsDao dao;

  @Inject
  @Named("DefaultAmericanFootballDownProgressStatsDao")
  public DefaultAmericanFootballDownProgressStatsService(
      final AmericanFootballDownProgressStatsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public AmericanFootballDownProgressStats find(java.lang.Integer id) {

    final AmericanFootballDownProgressStats result = dao.find(id);
    logger.info("find(AmericanFootballDownProgressStats) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<AmericanFootballDownProgressStats> select(int maxResult) {
    final List<AmericanFootballDownProgressStats> result = dao.select(maxResult);
    logger.info("select(AmericanFootballDownProgressStats) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<AmericanFootballDownProgressStats> selectAll() {
    final List<AmericanFootballDownProgressStats> results = dao.selectAll();
    logger.info("selectAll(AmericanFootballDownProgressStats) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public AmericanFootballDownProgressStats create(AmericanFootballDownProgressStats bean) {
    requireNonNull(bean);
    logger.info("create(AmericanFootballDownProgressStats={}) - entered bean ");

    final AmericanFootballDownProgressStats result = dao.create(bean);

    logger.info("create(AmericanFootballDownProgressStats) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public AmericanFootballDownProgressStats update(AmericanFootballDownProgressStats bean) {
    requireNonNull(bean);
    logger.info("update(AmericanFootballDownProgressStats={}) - entered bean ");

    final AmericanFootballDownProgressStats result = dao.update(bean);

    logger.info("update(AmericanFootballDownProgressStats) - exited - return value={} result ");
    return result;
  }
}
