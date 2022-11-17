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
import com.sportsdb.test.entity.AmericanFootballActionPlays;
import com.sportsdb.test.dao.JpaDao;

import com.sportsdb.test.utils.DelimiterParser;

// @Stateless
@Named("AmericanFootballActionPlaysHandler")
public class AmericanFootballActionPlaysHandler
    extends DelimiterFileHandler<AmericanFootballActionPlays> {

  @Inject
  @Named("DefaultJpaDao")
  public AmericanFootballActionPlaysHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected AmericanFootballActionPlays parseLine(List<String> headers, List<String> tokens) {
    AmericanFootballActionPlays record = new AmericanFootballActionPlays();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "americanFootballEventStateId":
          record.setAmericanFootballEventStateId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "playType":
          record.setPlayType(tokens.get(i));
          break;

        case "scoreAttemptType":
          record.setScoreAttemptType(tokens.get(i));
          break;

        case "driveResult":
          record.setDriveResult(tokens.get(i));
          break;

        case "points":
          record.setPoints(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "comment":
          record.setComment(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
