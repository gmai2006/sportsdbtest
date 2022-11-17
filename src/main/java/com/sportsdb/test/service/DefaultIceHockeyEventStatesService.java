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
import com.sportsdb.test.dao.IceHockeyEventStatesDao;
import com.sportsdb.test.entity.IceHockeyEventStates;

@Stateless
@Named("DefaultIceHockeyEventStatesService")
public class DefaultIceHockeyEventStatesService implements IceHockeyEventStatesService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final IceHockeyEventStatesDao dao;

  @Inject
  @Named("DefaultIceHockeyEventStatesDao")
  public DefaultIceHockeyEventStatesService(final IceHockeyEventStatesDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public IceHockeyEventStates find(java.lang.Integer id) {

    final IceHockeyEventStates result = dao.find(id);
    logger.info("find(IceHockeyEventStates) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<IceHockeyEventStates> select(int maxResult) {
    final List<IceHockeyEventStates> result = dao.select(maxResult);
    logger.info("select(IceHockeyEventStates) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<IceHockeyEventStates> selectAll() {
    final List<IceHockeyEventStates> results = dao.selectAll();
    logger.info("selectAll(IceHockeyEventStates) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public IceHockeyEventStates create(IceHockeyEventStates bean) {
    requireNonNull(bean);
    logger.info("create(IceHockeyEventStates={}) - entered bean ");

    final IceHockeyEventStates result = dao.create(bean);

    logger.info("create(IceHockeyEventStates) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public IceHockeyEventStates update(IceHockeyEventStates bean) {
    requireNonNull(bean);
    logger.info("update(IceHockeyEventStates={}) - entered bean ");

    final IceHockeyEventStates result = dao.update(bean);

    logger.info("update(IceHockeyEventStates) - exited - return value={} result ");
    return result;
  }
}
