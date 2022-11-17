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
package com.sportsdb.test.dao;

import java.util.List;
import com.sportsdb.test.entity.BaseballActionContactDetails;

public interface BaseballActionContactDetailsDao {
  /**
   * Retrieve all records BaseballActionContactDetails.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of BaseballActionContactDetails
   */
  public List<BaseballActionContactDetails> select(int maxResult);

  /**
   * Retrieve all records BaseballActionContactDetails.
   *
   * @return A list of BaseballActionContactDetails
   */
  public List<BaseballActionContactDetails> selectAll();

  /**
   * Find an entity.
   *
   * @param id An BaseballActionContactDetails id.
   * @return The same BaseballActionContactDetails.
   */
  public BaseballActionContactDetails find(java.lang.Integer id);

  /**
   * Create an BaseballActionContactDetails.
   *
   * @param e the BaseballActionContactDetails.
   * @return The same BaseballActionContactDetails.
   */
  public BaseballActionContactDetails create(BaseballActionContactDetails e);

  /**
   * Update the BaseballActionContactDetails.
   *
   * @param e the BaseballActionContactDetails.
   * @return The same BaseballActionContactDetails.
   */
  public BaseballActionContactDetails update(BaseballActionContactDetails e);
}
