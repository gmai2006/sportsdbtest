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
import com.sportsdb.test.entity.AmericanFootballPassingStats;
import com.sportsdb.test.dao.JpaDao;

import com.sportsdb.test.utils.DelimiterParser;

// @Stateless
@Named("AmericanFootballPassingStatsHandler")
public class AmericanFootballPassingStatsHandler
    extends DelimiterFileHandler<AmericanFootballPassingStats> {

  @Inject
  @Named("DefaultJpaDao")
  public AmericanFootballPassingStatsHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected AmericanFootballPassingStats parseLine(List<String> headers, List<String> tokens) {
    AmericanFootballPassingStats record = new AmericanFootballPassingStats();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "passesAttempts":
          record.setPassesAttempts(tokens.get(i));
          break;

        case "passesCompletions":
          record.setPassesCompletions(tokens.get(i));
          break;

        case "passesPercentage":
          record.setPassesPercentage(tokens.get(i));
          break;

        case "passesYardsGross":
          record.setPassesYardsGross(tokens.get(i));
          break;

        case "passesYardsNet":
          record.setPassesYardsNet(tokens.get(i));
          break;

        case "passesYardsLost":
          record.setPassesYardsLost(tokens.get(i));
          break;

        case "passesTouchdowns":
          record.setPassesTouchdowns(tokens.get(i));
          break;

        case "passesTouchdownsPercentage":
          record.setPassesTouchdownsPercentage(tokens.get(i));
          break;

        case "passesInterceptions":
          record.setPassesInterceptions(tokens.get(i));
          break;

        case "passesInterceptionsPercentage":
          record.setPassesInterceptionsPercentage(tokens.get(i));
          break;

        case "passesLongest":
          record.setPassesLongest(tokens.get(i));
          break;

        case "passesAverageYardsPer":
          record.setPassesAverageYardsPer(tokens.get(i));
          break;

        case "passerRating":
          record.setPasserRating(tokens.get(i));
          break;

        case "receptionsTotal":
          record.setReceptionsTotal(tokens.get(i));
          break;

        case "receptionsYards":
          record.setReceptionsYards(tokens.get(i));
          break;

        case "receptionsTouchdowns":
          record.setReceptionsTouchdowns(tokens.get(i));
          break;

        case "receptionsFirstDown":
          record.setReceptionsFirstDown(tokens.get(i));
          break;

        case "receptionsLongest":
          record.setReceptionsLongest(tokens.get(i));
          break;

        case "receptionsAverageYardsPer":
          record.setReceptionsAverageYardsPer(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
