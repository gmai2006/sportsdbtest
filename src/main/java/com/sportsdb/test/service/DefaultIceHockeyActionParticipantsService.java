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
import com.sportsdb.test.dao.IceHockeyActionParticipantsDao;
import com.sportsdb.test.entity.IceHockeyActionParticipants;

@Stateless
@Named("DefaultIceHockeyActionParticipantsService")
public class DefaultIceHockeyActionParticipantsService
    implements IceHockeyActionParticipantsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final IceHockeyActionParticipantsDao dao;

  @Inject
  @Named("DefaultIceHockeyActionParticipantsDao")
  public DefaultIceHockeyActionParticipantsService(final IceHockeyActionParticipantsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public IceHockeyActionParticipants find(java.lang.Long id) {

    final IceHockeyActionParticipants result = dao.find(id);
    logger.info("find(IceHockeyActionParticipants) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<IceHockeyActionParticipants> select(int maxResult) {
    final List<IceHockeyActionParticipants> result = dao.select(maxResult);
    logger.info("select(IceHockeyActionParticipants) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<IceHockeyActionParticipants> selectAll() {
    final List<IceHockeyActionParticipants> results = dao.selectAll();
    logger.info("selectAll(IceHockeyActionParticipants) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public IceHockeyActionParticipants create(IceHockeyActionParticipants bean) {
    requireNonNull(bean);
    logger.info("create(IceHockeyActionParticipants={}) - entered bean ");

    final IceHockeyActionParticipants result = dao.create(bean);

    logger.info("create(IceHockeyActionParticipants) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public IceHockeyActionParticipants update(IceHockeyActionParticipants bean) {
    requireNonNull(bean);
    logger.info("update(IceHockeyActionParticipants={}) - entered bean ");

    final IceHockeyActionParticipants result = dao.update(bean);

    logger.info("update(IceHockeyActionParticipants) - exited - return value={} result ");
    return result;
  }
}
