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
import com.sportsdb.test.entity.BaseballPitchingStats;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("BaseballPitchingStatsHandler")
public class BaseballPitchingStatsHandler extends DelimiterFileHandler<BaseballPitchingStats> {

    @Inject
    @Named("DefaultJpaDao")
    public BaseballPitchingStatsHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected BaseballPitchingStats parseLine(List<String> headers, List<String> tokens) {
        BaseballPitchingStats record = new BaseballPitchingStats();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "id":
                    record.setId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "runsAllowed":
                    record.setRunsAllowed(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "singlesAllowed":
                    record.setSinglesAllowed(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "doublesAllowed":
                    record.setDoublesAllowed(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "triplesAllowed":
                    record.setTriplesAllowed(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "homeRunsAllowed":
                    record.setHomeRunsAllowed(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "inningsPitched":
                    record.setInningsPitched(tokens.get(i));
                    break;

                case "hits":
                    record.setHits(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "earnedRuns":
                    record.setEarnedRuns(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "unearnedRuns":
                    record.setUnearnedRuns(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "basesOnBalls":
                    record.setBasesOnBalls(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "basesOnBallsIntentional":
                    record.setBasesOnBallsIntentional(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "strikeouts":
                    record.setStrikeouts(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "strikeoutToBbRatio":
                    record.setStrikeoutToBbRatio(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "numberOfPitches":
                    record.setNumberOfPitches(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "era":
                    record.setEra(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "inheritedRunnersScored":
                    record.setInheritedRunnersScored(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "pickOffs":
                    record.setPickOffs(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "errorsHitWithPitch":
                    record.setErrorsHitWithPitch(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "errorsWildPitch":
                    record.setErrorsWildPitch(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "balks":
                    record.setBalks(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "wins":
                    record.setWins(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "losses":
                    record.setLosses(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "saves":
                    record.setSaves(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "shutouts":
                    record.setShutouts(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "gamesComplete":
                    record.setGamesComplete(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "gamesFinished":
                    record.setGamesFinished(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "winningPercentage":
                    record.setWinningPercentage(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "eventCredit":
                    record.setEventCredit(tokens.get(i));
                    break;

                case "saveCredit":
                    record.setSaveCredit(tokens.get(i));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
