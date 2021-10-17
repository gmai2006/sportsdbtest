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
import com.sportsdb.test.entity.AmericanFootballSpecialTeamsStats;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("AmericanFootballSpecialTeamsStatsHandler")
public class AmericanFootballSpecialTeamsStatsHandler
        extends DelimiterFileHandler<AmericanFootballSpecialTeamsStats> {

    @Inject
    @Named("DefaultJpaDao")
    public AmericanFootballSpecialTeamsStatsHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected AmericanFootballSpecialTeamsStats parseLine(
            List<String> headers, List<String> tokens) {
        AmericanFootballSpecialTeamsStats record = new AmericanFootballSpecialTeamsStats();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "id":
                    record.setId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "returnsPuntTotal":
                    record.setReturnsPuntTotal(tokens.get(i));
                    break;

                case "returnsPuntYards":
                    record.setReturnsPuntYards(tokens.get(i));
                    break;

                case "returnsPuntAverage":
                    record.setReturnsPuntAverage(tokens.get(i));
                    break;

                case "returnsPuntLongest":
                    record.setReturnsPuntLongest(tokens.get(i));
                    break;

                case "returnsPuntTouchdown":
                    record.setReturnsPuntTouchdown(tokens.get(i));
                    break;

                case "returnsKickoffTotal":
                    record.setReturnsKickoffTotal(tokens.get(i));
                    break;

                case "returnsKickoffYards":
                    record.setReturnsKickoffYards(tokens.get(i));
                    break;

                case "returnsKickoffAverage":
                    record.setReturnsKickoffAverage(tokens.get(i));
                    break;

                case "returnsKickoffLongest":
                    record.setReturnsKickoffLongest(tokens.get(i));
                    break;

                case "returnsKickoffTouchdown":
                    record.setReturnsKickoffTouchdown(tokens.get(i));
                    break;

                case "returnsTotal":
                    record.setReturnsTotal(tokens.get(i));
                    break;

                case "returnsYards":
                    record.setReturnsYards(tokens.get(i));
                    break;

                case "puntsTotal":
                    record.setPuntsTotal(tokens.get(i));
                    break;

                case "puntsYardsGross":
                    record.setPuntsYardsGross(tokens.get(i));
                    break;

                case "puntsYardsNet":
                    record.setPuntsYardsNet(tokens.get(i));
                    break;

                case "puntsLongest":
                    record.setPuntsLongest(tokens.get(i));
                    break;

                case "puntsInside20":
                    record.setPuntsInside20(tokens.get(i));
                    break;

                case "puntsInside20Percentage":
                    record.setPuntsInside20Percentage(tokens.get(i));
                    break;

                case "puntsAverage":
                    record.setPuntsAverage(tokens.get(i));
                    break;

                case "puntsBlocked":
                    record.setPuntsBlocked(tokens.get(i));
                    break;

                case "touchbacksTotal":
                    record.setTouchbacksTotal(tokens.get(i));
                    break;

                case "touchbacksTotalPercentage":
                    record.setTouchbacksTotalPercentage(tokens.get(i));
                    break;

                case "touchbacksKickoffs":
                    record.setTouchbacksKickoffs(tokens.get(i));
                    break;

                case "touchbacksKickoffsPercentage":
                    record.setTouchbacksKickoffsPercentage(tokens.get(i));
                    break;

                case "touchbacksPunts":
                    record.setTouchbacksPunts(tokens.get(i));
                    break;

                case "touchbacksPuntsPercentage":
                    record.setTouchbacksPuntsPercentage(tokens.get(i));
                    break;

                case "touchbacksInterceptions":
                    record.setTouchbacksInterceptions(tokens.get(i));
                    break;

                case "touchbacksInterceptionsPercentage":
                    record.setTouchbacksInterceptionsPercentage(tokens.get(i));
                    break;

                case "fairCatches":
                    record.setFairCatches(tokens.get(i));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
