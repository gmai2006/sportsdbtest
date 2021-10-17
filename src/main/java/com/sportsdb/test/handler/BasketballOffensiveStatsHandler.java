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
package com.sportsdb.test.handler;

import com.sportsdb.test.dao.JpaDao;
import com.sportsdb.test.entity.BasketballOffensiveStats;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("BasketballOffensiveStatsHandler")
public class BasketballOffensiveStatsHandler
        extends DelimiterFileHandler<BasketballOffensiveStats> {

    @Inject
    @Named("DefaultJpaDao")
    public BasketballOffensiveStatsHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected BasketballOffensiveStats parseLine(List<String> headers, List<String> tokens) {
        BasketballOffensiveStats record = new BasketballOffensiveStats();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "id":
                    record.setId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "fieldGoalsMade":
                    record.setFieldGoalsMade(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "fieldGoalsAttempted":
                    record.setFieldGoalsAttempted(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "fieldGoalsPercentage":
                    record.setFieldGoalsPercentage(tokens.get(i));
                    break;

                case "fieldGoalsPerGame":
                    record.setFieldGoalsPerGame(tokens.get(i));
                    break;

                case "fieldGoalsAttemptedPerGame":
                    record.setFieldGoalsAttemptedPerGame(tokens.get(i));
                    break;

                case "fieldGoalsPercentageAdjusted":
                    record.setFieldGoalsPercentageAdjusted(tokens.get(i));
                    break;

                case "threePointersMade":
                    record.setThreePointersMade(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "threePointersAttempted":
                    record.setThreePointersAttempted(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "threePointersPercentage":
                    record.setThreePointersPercentage(tokens.get(i));
                    break;

                case "threePointersPerGame":
                    record.setThreePointersPerGame(tokens.get(i));
                    break;

                case "threePointersAttemptedPerGame":
                    record.setThreePointersAttemptedPerGame(tokens.get(i));
                    break;

                case "freeThrowsMade":
                    record.setFreeThrowsMade(tokens.get(i));
                    break;

                case "freeThrowsAttempted":
                    record.setFreeThrowsAttempted(tokens.get(i));
                    break;

                case "freeThrowsPercentage":
                    record.setFreeThrowsPercentage(tokens.get(i));
                    break;

                case "freeThrowsPerGame":
                    record.setFreeThrowsPerGame(tokens.get(i));
                    break;

                case "freeThrowsAttemptedPerGame":
                    record.setFreeThrowsAttemptedPerGame(tokens.get(i));
                    break;

                case "pointsScoredTotal":
                    record.setPointsScoredTotal(tokens.get(i));
                    break;

                case "pointsScoredPerGame":
                    record.setPointsScoredPerGame(tokens.get(i));
                    break;

                case "assistsTotal":
                    record.setAssistsTotal(tokens.get(i));
                    break;

                case "assistsPerGame":
                    record.setAssistsPerGame(tokens.get(i));
                    break;

                case "turnoversTotal":
                    record.setTurnoversTotal(tokens.get(i));
                    break;

                case "turnoversPerGame":
                    record.setTurnoversPerGame(tokens.get(i));
                    break;

                case "pointsScoredOffTurnovers":
                    record.setPointsScoredOffTurnovers(tokens.get(i));
                    break;

                case "pointsScoredInPaint":
                    record.setPointsScoredInPaint(tokens.get(i));
                    break;

                case "pointsScoredOnSecondChance":
                    record.setPointsScoredOnSecondChance(tokens.get(i));
                    break;

                case "pointsScoredOnFastBreak":
                    record.setPointsScoredOnFastBreak(tokens.get(i));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
