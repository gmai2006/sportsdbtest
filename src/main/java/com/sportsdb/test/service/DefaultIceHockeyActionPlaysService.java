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
import com.sportsdb.test.dao.IceHockeyActionPlaysDao;
import com.sportsdb.test.entity.IceHockeyActionPlays;

@Stateless
@Named("DefaultIceHockeyActionPlaysService")
public class DefaultIceHockeyActionPlaysService implements IceHockeyActionPlaysService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final IceHockeyActionPlaysDao dao;

  @Inject
  @Named("DefaultIceHockeyActionPlaysDao")
  public DefaultIceHockeyActionPlaysService(final IceHockeyActionPlaysDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public IceHockeyActionPlays find(java.lang.Long id) {

    final IceHockeyActionPlays result = dao.find(id);
    logger.info("find(IceHockeyActionPlays) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<IceHockeyActionPlays> select(int maxResult) {
    final List<IceHockeyActionPlays> result = dao.select(maxResult);
    logger.info("select(IceHockeyActionPlays) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<IceHockeyActionPlays> selectAll() {
    final List<IceHockeyActionPlays> results = dao.selectAll();
    logger.info("selectAll(IceHockeyActionPlays) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public IceHockeyActionPlays create(IceHockeyActionPlays bean) {
    requireNonNull(bean);
    logger.info("create(IceHockeyActionPlays={}) - entered bean ");

    final IceHockeyActionPlays result = dao.create(bean);

    logger.info("create(IceHockeyActionPlays) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public IceHockeyActionPlays update(IceHockeyActionPlays bean) {
    requireNonNull(bean);
    logger.info("update(IceHockeyActionPlays={}) - entered bean ");

    final IceHockeyActionPlays result = dao.update(bean);

    logger.info("update(IceHockeyActionPlays) - exited - return value={} result ");
    return result;
  }
}
