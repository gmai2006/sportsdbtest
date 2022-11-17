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
import com.sportsdb.test.entity.MotorRacingRaceStats;

public interface MotorRacingRaceStatsDao {
  /**
   * Retrieve all records MotorRacingRaceStats.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of MotorRacingRaceStats
   */
  public List<MotorRacingRaceStats> select(int maxResult);

  /**
   * Retrieve all records MotorRacingRaceStats.
   *
   * @return A list of MotorRacingRaceStats
   */
  public List<MotorRacingRaceStats> selectAll();

  /**
   * Find an entity.
   *
   * @param id An MotorRacingRaceStats id.
   * @return The same MotorRacingRaceStats.
   */
  public MotorRacingRaceStats find(java.lang.Integer id);

  /**
   * Create an MotorRacingRaceStats.
   *
   * @param e the MotorRacingRaceStats.
   * @return The same MotorRacingRaceStats.
   */
  public MotorRacingRaceStats create(MotorRacingRaceStats e);

  /**
   * Update the MotorRacingRaceStats.
   *
   * @param e the MotorRacingRaceStats.
   * @return The same MotorRacingRaceStats.
   */
  public MotorRacingRaceStats update(MotorRacingRaceStats e);
}
