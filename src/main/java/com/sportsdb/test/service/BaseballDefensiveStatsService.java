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

import java.util.List;
import com.sportsdb.test.entity.BaseballDefensiveStats;

public interface BaseballDefensiveStatsService {
  public BaseballDefensiveStats find(java.lang.Integer id);

  /**
   * Select a list of BaseballDefensiveStats based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return BaseballDefensiveStats records.
   */
  public List<BaseballDefensiveStats> select(int maxResult);

  /**
   * Select all BaseballDefensiveStats.
   *
   * @return all BaseballDefensiveStats records.
   */
  public List<BaseballDefensiveStats> selectAll();

  /**
   * Create BaseballDefensiveStats.
   *
   * @param bean The BaseballDefensiveStats.
   * @return The BaseballDefensiveStats.
   */
  public BaseballDefensiveStats create(BaseballDefensiveStats bean);

  /**
   * Update a BaseballDefensiveStats.
   *
   * @param bean - The BaseballDefensiveStats.
   * @return BaseballDefensiveStats.
   */
  public BaseballDefensiveStats update(BaseballDefensiveStats bean);
}
