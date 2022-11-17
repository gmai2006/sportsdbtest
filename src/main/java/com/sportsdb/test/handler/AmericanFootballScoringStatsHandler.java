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
import com.sportsdb.test.entity.AmericanFootballScoringStats;
import com.sportsdb.test.dao.JpaDao;

import com.sportsdb.test.utils.DelimiterParser;

// @Stateless
@Named("AmericanFootballScoringStatsHandler")
public class AmericanFootballScoringStatsHandler
    extends DelimiterFileHandler<AmericanFootballScoringStats> {

  @Inject
  @Named("DefaultJpaDao")
  public AmericanFootballScoringStatsHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected AmericanFootballScoringStats parseLine(List<String> headers, List<String> tokens) {
    AmericanFootballScoringStats record = new AmericanFootballScoringStats();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "touchdownsTotal":
          record.setTouchdownsTotal(tokens.get(i));
          break;

        case "touchdownsPassing":
          record.setTouchdownsPassing(tokens.get(i));
          break;

        case "touchdownsRushing":
          record.setTouchdownsRushing(tokens.get(i));
          break;

        case "touchdownsSpecialTeams":
          record.setTouchdownsSpecialTeams(tokens.get(i));
          break;

        case "touchdownsDefensive":
          record.setTouchdownsDefensive(tokens.get(i));
          break;

        case "extraPointsAttempts":
          record.setExtraPointsAttempts(tokens.get(i));
          break;

        case "extraPointsMade":
          record.setExtraPointsMade(tokens.get(i));
          break;

        case "extraPointsMissed":
          record.setExtraPointsMissed(tokens.get(i));
          break;

        case "extraPointsBlocked":
          record.setExtraPointsBlocked(tokens.get(i));
          break;

        case "fieldGoalAttempts":
          record.setFieldGoalAttempts(tokens.get(i));
          break;

        case "fieldGoalsMade":
          record.setFieldGoalsMade(tokens.get(i));
          break;

        case "fieldGoalsMissed":
          record.setFieldGoalsMissed(tokens.get(i));
          break;

        case "fieldGoalsBlocked":
          record.setFieldGoalsBlocked(tokens.get(i));
          break;

        case "safetiesAgainst":
          record.setSafetiesAgainst(tokens.get(i));
          break;

        case "twoPointConversionsAttempts":
          record.setTwoPointConversionsAttempts(tokens.get(i));
          break;

        case "twoPointConversionsMade":
          record.setTwoPointConversionsMade(tokens.get(i));
          break;

        case "touchbacksTotal":
          record.setTouchbacksTotal(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
