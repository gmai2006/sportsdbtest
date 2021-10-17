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
import com.sportsdb.test.entity.IceHockeyOffensiveStats;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("IceHockeyOffensiveStatsHandler")
public class IceHockeyOffensiveStatsHandler extends DelimiterFileHandler<IceHockeyOffensiveStats> {

    @Inject
    @Named("DefaultJpaDao")
    public IceHockeyOffensiveStatsHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected IceHockeyOffensiveStats parseLine(List<String> headers, List<String> tokens) {
        IceHockeyOffensiveStats record = new IceHockeyOffensiveStats();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "id":
                    record.setId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "goalsGameWinning":
                    record.setGoalsGameWinning(tokens.get(i));
                    break;

                case "goalsGameTying":
                    record.setGoalsGameTying(tokens.get(i));
                    break;

                case "goalsPowerPlay":
                    record.setGoalsPowerPlay(tokens.get(i));
                    break;

                case "goalsShortHanded":
                    record.setGoalsShortHanded(tokens.get(i));
                    break;

                case "goalsEvenStrength":
                    record.setGoalsEvenStrength(tokens.get(i));
                    break;

                case "goalsEmptyNet":
                    record.setGoalsEmptyNet(tokens.get(i));
                    break;

                case "goalsOvertime":
                    record.setGoalsOvertime(tokens.get(i));
                    break;

                case "goalsShootout":
                    record.setGoalsShootout(tokens.get(i));
                    break;

                case "goalsPenaltyShot":
                    record.setGoalsPenaltyShot(tokens.get(i));
                    break;

                case "assists":
                    record.setAssists(tokens.get(i));
                    break;

                case "points":
                    record.setPoints(tokens.get(i));
                    break;

                case "powerPlayAmount":
                    record.setPowerPlayAmount(tokens.get(i));
                    break;

                case "powerPlayPercentage":
                    record.setPowerPlayPercentage(tokens.get(i));
                    break;

                case "shotsPenaltyShotTaken":
                    record.setShotsPenaltyShotTaken(tokens.get(i));
                    break;

                case "shotsPenaltyShotMissed":
                    record.setShotsPenaltyShotMissed(tokens.get(i));
                    break;

                case "shotsPenaltyShotPercentage":
                    record.setShotsPenaltyShotPercentage(tokens.get(i));
                    break;

                case "giveaways":
                    record.setGiveaways(tokens.get(i));
                    break;

                case "minutesPowerPlay":
                    record.setMinutesPowerPlay(tokens.get(i));
                    break;

                case "faceoffWins":
                    record.setFaceoffWins(tokens.get(i));
                    break;

                case "faceoffLosses":
                    record.setFaceoffLosses(tokens.get(i));
                    break;

                case "faceoffWinPercentage":
                    record.setFaceoffWinPercentage(tokens.get(i));
                    break;

                case "scoringChances":
                    record.setScoringChances(tokens.get(i));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
