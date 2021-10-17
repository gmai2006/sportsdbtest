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
import com.sportsdb.test.entity.IceHockeyDefensiveStats;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("IceHockeyDefensiveStatsHandler")
public class IceHockeyDefensiveStatsHandler extends DelimiterFileHandler<IceHockeyDefensiveStats> {

    @Inject
    @Named("DefaultJpaDao")
    public IceHockeyDefensiveStatsHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected IceHockeyDefensiveStats parseLine(List<String> headers, List<String> tokens) {
        IceHockeyDefensiveStats record = new IceHockeyDefensiveStats();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "id":
                    record.setId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "shotsPowerPlayAllowed":
                    record.setShotsPowerPlayAllowed(tokens.get(i));
                    break;

                case "shotsPenaltyShotAllowed":
                    record.setShotsPenaltyShotAllowed(tokens.get(i));
                    break;

                case "goalsPowerPlayAllowed":
                    record.setGoalsPowerPlayAllowed(tokens.get(i));
                    break;

                case "goalsPenaltyShotAllowed":
                    record.setGoalsPenaltyShotAllowed(tokens.get(i));
                    break;

                case "goalsAgainstAverage":
                    record.setGoalsAgainstAverage(tokens.get(i));
                    break;

                case "saves":
                    record.setSaves(tokens.get(i));
                    break;

                case "savePercentage":
                    record.setSavePercentage(tokens.get(i));
                    break;

                case "penaltyKillingAmount":
                    record.setPenaltyKillingAmount(tokens.get(i));
                    break;

                case "penaltyKillingPercentage":
                    record.setPenaltyKillingPercentage(tokens.get(i));
                    break;

                case "shotsBlocked":
                    record.setShotsBlocked(tokens.get(i));
                    break;

                case "takeaways":
                    record.setTakeaways(tokens.get(i));
                    break;

                case "shutouts":
                    record.setShutouts(tokens.get(i));
                    break;

                case "minutesPenaltyKilling":
                    record.setMinutesPenaltyKilling(tokens.get(i));
                    break;

                case "hits":
                    record.setHits(tokens.get(i));
                    break;

                case "goalsEmptyNetAllowed":
                    record.setGoalsEmptyNetAllowed(tokens.get(i));
                    break;

                case "goalsShortHandedAllowed":
                    record.setGoalsShortHandedAllowed(tokens.get(i));
                    break;

                case "goalsShootoutAllowed":
                    record.setGoalsShootoutAllowed(tokens.get(i));
                    break;

                case "shotsShootoutAllowed":
                    record.setShotsShootoutAllowed(tokens.get(i));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
