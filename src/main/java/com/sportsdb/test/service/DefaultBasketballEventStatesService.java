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
import com.sportsdb.test.dao.BasketballEventStatesDao;
import com.sportsdb.test.entity.BasketballEventStates;

@Stateless
@Named("DefaultBasketballEventStatesService")
public class DefaultBasketballEventStatesService implements BasketballEventStatesService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final BasketballEventStatesDao dao;

  @Inject
  @Named("DefaultBasketballEventStatesDao")
  public DefaultBasketballEventStatesService(final BasketballEventStatesDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public BasketballEventStates find(java.lang.Integer id) {

    final BasketballEventStates result = dao.find(id);
    logger.info("find(BasketballEventStates) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<BasketballEventStates> select(int maxResult) {
    final List<BasketballEventStates> result = dao.select(maxResult);
    logger.info("select(BasketballEventStates) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<BasketballEventStates> selectAll() {
    final List<BasketballEventStates> results = dao.selectAll();
    logger.info("selectAll(BasketballEventStates) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public BasketballEventStates create(BasketballEventStates bean) {
    requireNonNull(bean);
    logger.info("create(BasketballEventStates={}) - entered bean ");

    final BasketballEventStates result = dao.create(bean);

    logger.info("create(BasketballEventStates) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public BasketballEventStates update(BasketballEventStates bean) {
    requireNonNull(bean);
    logger.info("update(BasketballEventStates={}) - entered bean ");

    final BasketballEventStates result = dao.update(bean);

    logger.info("update(BasketballEventStates) - exited - return value={} result ");
    return result;
  }
}
