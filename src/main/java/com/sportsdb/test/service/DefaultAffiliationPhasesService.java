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
import com.sportsdb.test.dao.AffiliationPhasesDao;
import com.sportsdb.test.entity.AffiliationPhases;

@Stateless
@Named("DefaultAffiliationPhasesService")
public class DefaultAffiliationPhasesService implements AffiliationPhasesService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AffiliationPhasesDao dao;

  @Inject
  @Named("DefaultAffiliationPhasesDao")
  public DefaultAffiliationPhasesService(final AffiliationPhasesDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public AffiliationPhases find(java.lang.Integer id) {

    final AffiliationPhases result = dao.find(id);
    logger.info("find(AffiliationPhases) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<AffiliationPhases> select(int maxResult) {
    final List<AffiliationPhases> result = dao.select(maxResult);
    logger.info("select(AffiliationPhases) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<AffiliationPhases> selectAll() {
    final List<AffiliationPhases> results = dao.selectAll();
    logger.info("selectAll(AffiliationPhases) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public AffiliationPhases create(AffiliationPhases bean) {
    requireNonNull(bean);
    logger.info("create(AffiliationPhases={}) - entered bean ");

    final AffiliationPhases result = dao.create(bean);

    logger.info("create(AffiliationPhases) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public AffiliationPhases update(AffiliationPhases bean) {
    requireNonNull(bean);
    logger.info("update(AffiliationPhases={}) - entered bean ");

    final AffiliationPhases result = dao.update(bean);

    logger.info("update(AffiliationPhases) - exited - return value={} result ");
    return result;
  }
}
