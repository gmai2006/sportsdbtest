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
import com.sportsdb.test.entity.TeamsDocuments;

public interface TeamsDocumentsDao {
  /**
   * Retrieve all records TeamsDocuments.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of TeamsDocuments
   */
  public List<TeamsDocuments> select(int maxResult);

  /**
   * Retrieve all records TeamsDocuments.
   *
   * @return A list of TeamsDocuments
   */
  public List<TeamsDocuments> selectAll();

  /**
   * Find an entity.
   *
   * @param id An TeamsDocuments id.
   * @return The same TeamsDocuments.
   */
  public TeamsDocuments find(java.lang.String id);

  /**
   * Create an TeamsDocuments.
   *
   * @param e the TeamsDocuments.
   * @return The same TeamsDocuments.
   */
  public TeamsDocuments create(TeamsDocuments e);

  /**
   * Update the TeamsDocuments.
   *
   * @param e the TeamsDocuments.
   * @return The same TeamsDocuments.
   */
  public TeamsDocuments update(TeamsDocuments e);
}
