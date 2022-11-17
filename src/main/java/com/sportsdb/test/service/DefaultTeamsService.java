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
import com.sportsdb.test.dao.TeamsDao;
import com.sportsdb.test.entity.Teams;

@Stateless
@Named("DefaultTeamsService")
public class DefaultTeamsService implements TeamsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TeamsDao dao;

  @Inject
  @Named("DefaultTeamsDao")
  public DefaultTeamsService(final TeamsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Teams find(java.lang.Integer id) {

    final Teams result = dao.find(id);
    logger.info("find(Teams) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Teams> select(int maxResult) {
    final List<Teams> result = dao.select(maxResult);
    logger.info("select(Teams) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Teams> selectAll() {
    final List<Teams> results = dao.selectAll();
    logger.info("selectAll(Teams) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Teams create(Teams bean) {
    requireNonNull(bean);
    logger.info("create(Teams={}) - entered bean ");

    final Teams result = dao.create(bean);

    logger.info("create(Teams) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Teams update(Teams bean) {
    requireNonNull(bean);
    logger.info("update(Teams={}) - entered bean ");

    final Teams result = dao.update(bean);

    logger.info("update(Teams) - exited - return value={} result ");
    return result;
  }
}
