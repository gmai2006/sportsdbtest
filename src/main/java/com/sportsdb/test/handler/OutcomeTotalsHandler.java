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
import com.sportsdb.test.entity.OutcomeTotals;
import com.sportsdb.test.dao.JpaDao;

import com.sportsdb.test.utils.DelimiterParser;

// @Stateless
@Named("OutcomeTotalsHandler")
public class OutcomeTotalsHandler extends DelimiterFileHandler<OutcomeTotals> {

  @Inject
  @Named("DefaultJpaDao")
  public OutcomeTotalsHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected OutcomeTotals parseLine(List<String> headers, List<String> tokens) {
    OutcomeTotals record = new OutcomeTotals();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "standingSubgroupId":
          record.setStandingSubgroupId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "outcomeHolderType":
          record.setOutcomeHolderType(tokens.get(i));
          break;

        case "outcomeHolderId":
          record.setOutcomeHolderId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "rank":
          record.setRank(tokens.get(i));
          break;

        case "wins":
          record.setWins(tokens.get(i));
          break;

        case "losses":
          record.setLosses(tokens.get(i));
          break;

        case "ties":
          record.setTies(tokens.get(i));
          break;

        case "undecideds":
          record.setUndecideds(tokens.get(i));
          break;

        case "winningPercentage":
          record.setWinningPercentage(tokens.get(i));
          break;

        case "pointsScoredFor":
          record.setPointsScoredFor(tokens.get(i));
          break;

        case "pointsScoredAgainst":
          record.setPointsScoredAgainst(tokens.get(i));
          break;

        case "pointsDifference":
          record.setPointsDifference(tokens.get(i));
          break;

        case "standingPoints":
          record.setStandingPoints(tokens.get(i));
          break;

        case "streakType":
          record.setStreakType(tokens.get(i));
          break;

        case "streakDuration":
          record.setStreakDuration(tokens.get(i));
          break;

        case "streakTotal":
          record.setStreakTotal(tokens.get(i));
          break;

        case "streakStart":
          record.setStreakStart(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "streakEnd":
          record.setStreakEnd(new java.util.Date(parseDate(tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
