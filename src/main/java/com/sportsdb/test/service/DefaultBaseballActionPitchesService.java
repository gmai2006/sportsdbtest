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
import com.sportsdb.test.dao.BaseballActionPitchesDao;
import com.sportsdb.test.entity.BaseballActionPitches;

@Stateless
@Named("DefaultBaseballActionPitchesService")
public class DefaultBaseballActionPitchesService implements BaseballActionPitchesService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final BaseballActionPitchesDao dao;

  @Inject
  @Named("DefaultBaseballActionPitchesDao")
  public DefaultBaseballActionPitchesService(final BaseballActionPitchesDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public BaseballActionPitches find(java.lang.Integer id) {

    final BaseballActionPitches result = dao.find(id);
    logger.info("find(BaseballActionPitches) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<BaseballActionPitches> select(int maxResult) {
    final List<BaseballActionPitches> result = dao.select(maxResult);
    logger.info("select(BaseballActionPitches) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<BaseballActionPitches> selectAll() {
    final List<BaseballActionPitches> results = dao.selectAll();
    logger.info("selectAll(BaseballActionPitches) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public BaseballActionPitches create(BaseballActionPitches bean) {
    requireNonNull(bean);
    logger.info("create(BaseballActionPitches={}) - entered bean ");

    final BaseballActionPitches result = dao.create(bean);

    logger.info("create(BaseballActionPitches) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public BaseballActionPitches update(BaseballActionPitches bean) {
    requireNonNull(bean);
    logger.info("update(BaseballActionPitches={}) - entered bean ");

    final BaseballActionPitches result = dao.update(bean);

    logger.info("update(BaseballActionPitches) - exited - return value={} result ");
    return result;
  }
}
