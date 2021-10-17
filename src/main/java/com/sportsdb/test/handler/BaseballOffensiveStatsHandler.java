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
import com.sportsdb.test.entity.BaseballOffensiveStats;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("BaseballOffensiveStatsHandler")
public class BaseballOffensiveStatsHandler extends DelimiterFileHandler<BaseballOffensiveStats> {

    @Inject
    @Named("DefaultJpaDao")
    public BaseballOffensiveStatsHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected BaseballOffensiveStats parseLine(List<String> headers, List<String> tokens) {
        BaseballOffensiveStats record = new BaseballOffensiveStats();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "id":
                    record.setId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "average":
                    record.setAverage(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "runsScored":
                    record.setRunsScored(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "atBats":
                    record.setAtBats(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "hits":
                    record.setHits(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "rbi":
                    record.setRbi(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "totalBases":
                    record.setTotalBases(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "sluggingPercentage":
                    record.setSluggingPercentage(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "basesOnBalls":
                    record.setBasesOnBalls(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "strikeouts":
                    record.setStrikeouts(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "leftOnBase":
                    record.setLeftOnBase(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "leftInScoringPosition":
                    record.setLeftInScoringPosition(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "singles":
                    record.setSingles(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "doubles":
                    record.setDoubles(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "triples":
                    record.setTriples(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "homeRuns":
                    record.setHomeRuns(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "grandSlams":
                    record.setGrandSlams(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "atBatsPerRbi":
                    record.setAtBatsPerRbi(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "plateAppearancesPerRbi":
                    record.setPlateAppearancesPerRbi(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "atBatsPerHomeRun":
                    record.setAtBatsPerHomeRun(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "plateAppearancesPerHomeRun":
                    record.setPlateAppearancesPerHomeRun(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "sacFlies":
                    record.setSacFlies(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "sacBunts":
                    record.setSacBunts(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "groundedIntoDoublePlay":
                    record.setGroundedIntoDoublePlay(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "movedUp":
                    record.setMovedUp(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "onBasePercentage":
                    record.setOnBasePercentage(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "stolenBases":
                    record.setStolenBases(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "stolenBasesCaught":
                    record.setStolenBasesCaught(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "stolenBasesAverage":
                    record.setStolenBasesAverage(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "hitByPitch":
                    record.setHitByPitch(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "defensiveInterferanceReaches":
                    record.setDefensiveInterferanceReaches(
                            java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "onBasePlusSlugging":
                    record.setOnBasePlusSlugging(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "plateAppearances":
                    record.setPlateAppearances(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "hitsExtraBase":
                    record.setHitsExtraBase(java.lang.Integer.valueOf((tokens.get(i))));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
