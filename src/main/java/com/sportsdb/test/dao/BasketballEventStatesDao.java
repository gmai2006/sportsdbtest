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

import com.sportsdb.test.entity.BasketballEventStates;
import java.util.List;

public interface BasketballEventStatesDao {
    /**
     * Retrieve all records BasketballEventStates.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of BasketballEventStates
     */
    public List<BasketballEventStates> select(int maxResult);

    /**
     * Retrieve all records BasketballEventStates.
     *
     * @return A list of BasketballEventStates
     */
    public List<BasketballEventStates> selectAll();

    /**
     * Find an entity.
     *
     * @param id An BasketballEventStates id.
     * @return The same BasketballEventStates.
     */
    public BasketballEventStates find(java.lang.Integer id);

    /**
     * Create an BasketballEventStates.
     *
     * @param e the BasketballEventStates.
     * @return The same BasketballEventStates.
     */
    public BasketballEventStates create(BasketballEventStates e);

    /**
     * Update the BasketballEventStates.
     *
     * @param e the BasketballEventStates.
     * @return The same BasketballEventStates.
     */
    public BasketballEventStates update(BasketballEventStates e);
}
