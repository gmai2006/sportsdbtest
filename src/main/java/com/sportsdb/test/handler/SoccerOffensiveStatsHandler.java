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

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import java.nio.charset.StandardCharsets;
import com.sportsdb.test.entity.SoccerOffensiveStats;
import com.sportsdb.test.dao.JpaDao;

import com.sportsdb.test.utils.DelimiterParser;

// @Stateless
@Named("SoccerOffensiveStatsHandler")
public class SoccerOffensiveStatsHandler extends DelimiterFileHandler<SoccerOffensiveStats> {

  @Inject
  @Named("DefaultJpaDao")
  public SoccerOffensiveStatsHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected SoccerOffensiveStats parseLine(List<String> headers, List<String> tokens) {
    SoccerOffensiveStats record = new SoccerOffensiveStats();
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

        case "goalsOvertime":
          record.setGoalsOvertime(tokens.get(i));
          break;

        case "goalsShootout":
          record.setGoalsShootout(tokens.get(i));
          break;

        case "goalsTotal":
          record.setGoalsTotal(tokens.get(i));
          break;

        case "assistsGameWinning":
          record.setAssistsGameWinning(tokens.get(i));
          break;

        case "assistsGameTying":
          record.setAssistsGameTying(tokens.get(i));
          break;

        case "assistsOvertime":
          record.setAssistsOvertime(tokens.get(i));
          break;

        case "assistsTotal":
          record.setAssistsTotal(tokens.get(i));
          break;

        case "points":
          record.setPoints(tokens.get(i));
          break;

        case "shotsTotal":
          record.setShotsTotal(tokens.get(i));
          break;

        case "shotsOnGoalTotal":
          record.setShotsOnGoalTotal(tokens.get(i));
          break;

        case "shotsHitFrame":
          record.setShotsHitFrame(tokens.get(i));
          break;

        case "shotsPenaltyShotTaken":
          record.setShotsPenaltyShotTaken(tokens.get(i));
          break;

        case "shotsPenaltyShotScored":
          record.setShotsPenaltyShotScored(tokens.get(i));
          break;

        case "shotsPenaltyShotMissed":
          record.setShotsPenaltyShotMissed(tokens.get(i));
          break;

        case "shotsPenaltyShotPercentage":
          record.setShotsPenaltyShotPercentage(tokens.get(i));
          break;

        case "shotsShootoutTaken":
          record.setShotsShootoutTaken(tokens.get(i));
          break;

        case "shotsShootoutScored":
          record.setShotsShootoutScored(tokens.get(i));
          break;

        case "shotsShootoutMissed":
          record.setShotsShootoutMissed(tokens.get(i));
          break;

        case "shotsShootoutPercentage":
          record.setShotsShootoutPercentage(tokens.get(i));
          break;

        case "giveaways":
          record.setGiveaways(tokens.get(i));
          break;

        case "offsides":
          record.setOffsides(tokens.get(i));
          break;

        case "cornerKicks":
          record.setCornerKicks(tokens.get(i));
          break;

        case "hatTricks":
          record.setHatTricks(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
