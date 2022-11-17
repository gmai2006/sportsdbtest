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
import com.sportsdb.test.dao.AmericanFootballEventStatesDao;
import com.sportsdb.test.entity.AmericanFootballEventStates;

@Stateless
@Named("DefaultAmericanFootballEventStatesService")
public class DefaultAmericanFootballEventStatesService
    implements AmericanFootballEventStatesService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AmericanFootballEventStatesDao dao;

  @Inject
  @Named("DefaultAmericanFootballEventStatesDao")
  public DefaultAmericanFootballEventStatesService(final AmericanFootballEventStatesDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public AmericanFootballEventStates find(java.lang.Integer id) {

    final AmericanFootballEventStates result = dao.find(id);
    logger.info("find(AmericanFootballEventStates) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<AmericanFootballEventStates> select(int maxResult) {
    final List<AmericanFootballEventStates> result = dao.select(maxResult);
    logger.info("select(AmericanFootballEventStates) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<AmericanFootballEventStates> selectAll() {
    final List<AmericanFootballEventStates> results = dao.selectAll();
    logger.info("selectAll(AmericanFootballEventStates) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public AmericanFootballEventStates create(AmericanFootballEventStates bean) {
    requireNonNull(bean);
    logger.info("create(AmericanFootballEventStates={}) - entered bean ");

    final AmericanFootballEventStates result = dao.create(bean);

    logger.info("create(AmericanFootballEventStates) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public AmericanFootballEventStates update(AmericanFootballEventStates bean) {
    requireNonNull(bean);
    logger.info("update(AmericanFootballEventStates={}) - entered bean ");

    final AmericanFootballEventStates result = dao.update(bean);

    logger.info("update(AmericanFootballEventStates) - exited - return value={} result ");
    return result;
  }
}
