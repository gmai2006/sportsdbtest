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
import com.sportsdb.test.entity.MotorRacingRaceStats;
import com.sportsdb.test.dao.JpaDao;

import com.sportsdb.test.utils.DelimiterParser;

// @Stateless
@Named("MotorRacingRaceStatsHandler")
public class MotorRacingRaceStatsHandler extends DelimiterFileHandler<MotorRacingRaceStats> {

  @Inject
  @Named("DefaultJpaDao")
  public MotorRacingRaceStatsHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected MotorRacingRaceStats parseLine(List<String> headers, List<String> tokens) {
    MotorRacingRaceStats record = new MotorRacingRaceStats();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "timeBehindLeader":
          record.setTimeBehindLeader(tokens.get(i));
          break;

        case "lapsBehindLeader":
          record.setLapsBehindLeader(tokens.get(i));
          break;

        case "timeAheadFollower":
          record.setTimeAheadFollower(tokens.get(i));
          break;

        case "lapsAheadFollower":
          record.setLapsAheadFollower(tokens.get(i));
          break;

        case "time":
          record.setTime(tokens.get(i));
          break;

        case "points":
          record.setPoints(tokens.get(i));
          break;

        case "pointsRookie":
          record.setPointsRookie(tokens.get(i));
          break;

        case "bonus":
          record.setBonus(tokens.get(i));
          break;

        case "lapsCompleted":
          record.setLapsCompleted(tokens.get(i));
          break;

        case "lapsLeadingTotal":
          record.setLapsLeadingTotal(tokens.get(i));
          break;

        case "distanceLeading":
          record.setDistanceLeading(tokens.get(i));
          break;

        case "distanceCompleted":
          record.setDistanceCompleted(tokens.get(i));
          break;

        case "distanceUnits":
          record.setDistanceUnits(tokens.get(i));
          break;

        case "speedAverage":
          record.setSpeedAverage(tokens.get(i));
          break;

        case "speedUnits":
          record.setSpeedUnits(tokens.get(i));
          break;

        case "status":
          record.setStatus(tokens.get(i));
          break;

        case "finishesTop5":
          record.setFinishesTop5(tokens.get(i));
          break;

        case "finishesTop10":
          record.setFinishesTop10(tokens.get(i));
          break;

        case "starts":
          record.setStarts(tokens.get(i));
          break;

        case "finishes":
          record.setFinishes(tokens.get(i));
          break;

        case "nonFinishes":
          record.setNonFinishes(tokens.get(i));
          break;

        case "wins":
          record.setWins(tokens.get(i));
          break;

        case "racesLeading":
          record.setRacesLeading(tokens.get(i));
          break;

        case "money":
          record.setMoney(tokens.get(i));
          break;

        case "moneyUnits":
          record.setMoneyUnits(tokens.get(i));
          break;

        case "leadsTotal":
          record.setLeadsTotal(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
