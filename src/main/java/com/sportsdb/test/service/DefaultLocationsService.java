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
import com.sportsdb.test.dao.LocationsDao;
import com.sportsdb.test.entity.Locations;

@Stateless
@Named("DefaultLocationsService")
public class DefaultLocationsService implements LocationsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LocationsDao dao;

  @Inject
  @Named("DefaultLocationsDao")
  public DefaultLocationsService(final LocationsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Locations find(java.lang.Integer id) {

    final Locations result = dao.find(id);
    logger.info("find(Locations) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Locations> select(int maxResult) {
    final List<Locations> result = dao.select(maxResult);
    logger.info("select(Locations) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Locations> selectAll() {
    final List<Locations> results = dao.selectAll();
    logger.info("selectAll(Locations) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Locations create(Locations bean) {
    requireNonNull(bean);
    logger.info("create(Locations={}) - entered bean ");

    final Locations result = dao.create(bean);

    logger.info("create(Locations) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Locations update(Locations bean) {
    requireNonNull(bean);
    logger.info("update(Locations={}) - entered bean ");

    final Locations result = dao.update(bean);

    logger.info("update(Locations) - exited - return value={} result ");
    return result;
  }
}
