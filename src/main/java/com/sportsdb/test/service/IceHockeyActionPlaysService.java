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

import com.sportsdb.test.entity.IceHockeyActionPlays;
import java.util.List;

public interface IceHockeyActionPlaysService {
    public IceHockeyActionPlays find(java.lang.Long id);

    /**
     * Select a list of IceHockeyActionPlays based on a given maximum number of returning records.
     *
     * @param maxResult : a specified maximum number of returned records.
     * @return IceHockeyActionPlays records.
     */
    public List<IceHockeyActionPlays> select(int maxResult);

    /**
     * Select all IceHockeyActionPlays.
     *
     * @return all IceHockeyActionPlays records.
     */
    public List<IceHockeyActionPlays> selectAll();

    /**
     * Create IceHockeyActionPlays.
     *
     * @param bean The IceHockeyActionPlays.
     * @return The IceHockeyActionPlays.
     */
    public IceHockeyActionPlays create(IceHockeyActionPlays bean);

    /**
     * Update a IceHockeyActionPlays.
     *
     * @param bean - The IceHockeyActionPlays.
     * @return IceHockeyActionPlays.
     */
    public IceHockeyActionPlays update(IceHockeyActionPlays bean);
}
