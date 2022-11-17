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
import com.sportsdb.test.entity.BaseballEventStates;
import com.sportsdb.test.dao.JpaDao;

import com.sportsdb.test.utils.DelimiterParser;

// @Stateless
@Named("BaseballEventStatesHandler")
public class BaseballEventStatesHandler extends DelimiterFileHandler<BaseballEventStates> {

  @Inject
  @Named("DefaultJpaDao")
  public BaseballEventStatesHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected BaseballEventStates parseLine(List<String> headers, List<String> tokens) {
    BaseballEventStates record = new BaseballEventStates();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "eventId":
          record.setEventId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "currentState":
          record.setCurrentState(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "sequenceNumber":
          record.setSequenceNumber(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "atBatNumber":
          record.setAtBatNumber(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "inningValue":
          record.setInningValue(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "inningHalf":
          record.setInningHalf(tokens.get(i));
          break;

        case "outs":
          record.setOuts(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "balls":
          record.setBalls(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "strikes":
          record.setStrikes(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "runnerOnFirstId":
          record.setRunnerOnFirstId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "runnerOnSecondId":
          record.setRunnerOnSecondId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "runnerOnThirdId":
          record.setRunnerOnThirdId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "runnerOnFirst":
          record.setRunnerOnFirst(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "runnerOnSecond":
          record.setRunnerOnSecond(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "runnerOnThird":
          record.setRunnerOnThird(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "runsThisInningHalf":
          record.setRunsThisInningHalf(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "pitcherId":
          record.setPitcherId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "batterId":
          record.setBatterId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "batterSide":
          record.setBatterSide(tokens.get(i));
          break;

        case "context":
          record.setContext(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
