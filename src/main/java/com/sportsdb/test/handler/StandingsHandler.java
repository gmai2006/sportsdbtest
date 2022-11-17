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
import com.sportsdb.test.entity.Standings;
import com.sportsdb.test.dao.JpaDao;

import com.sportsdb.test.utils.DelimiterParser;

// @Stateless
@Named("StandingsHandler")
public class StandingsHandler extends DelimiterFileHandler<Standings> {

  @Inject
  @Named("DefaultJpaDao")
  public StandingsHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected Standings parseLine(List<String> headers, List<String> tokens) {
    Standings record = new Standings();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "affiliationId":
          record.setAffiliationId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "standingType":
          record.setStandingType(tokens.get(i));
          break;

        case "subSeasonId":
          record.setSubSeasonId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "lastUpdated":
          record.setLastUpdated(tokens.get(i));
          break;

        case "durationScope":
          record.setDurationScope(tokens.get(i));
          break;

        case "competitionScope":
          record.setCompetitionScope(tokens.get(i));
          break;

        case "competitionScopeId":
          record.setCompetitionScopeId(tokens.get(i));
          break;

        case "alignmentScope":
          record.setAlignmentScope(tokens.get(i));
          break;

        case "siteScope":
          record.setSiteScope(tokens.get(i));
          break;

        case "scopingLabel":
          record.setScopingLabel(tokens.get(i));
          break;

        case "publisherId":
          record.setPublisherId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "source":
          record.setSource(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
