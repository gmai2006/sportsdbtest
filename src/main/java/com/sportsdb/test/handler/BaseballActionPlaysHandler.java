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
import com.sportsdb.test.entity.BaseballActionPlays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("BaseballActionPlaysHandler")
public class BaseballActionPlaysHandler extends DelimiterFileHandler<BaseballActionPlays> {

    @Inject
    @Named("DefaultJpaDao")
    public BaseballActionPlaysHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected BaseballActionPlays parseLine(List<String> headers, List<String> tokens) {
        BaseballActionPlays record = new BaseballActionPlays();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "id":
                    record.setId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "baseballEventStateId":
                    record.setBaseballEventStateId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "playType":
                    record.setPlayType(tokens.get(i));
                    break;

                case "notation":
                    record.setNotation(tokens.get(i));
                    break;

                case "notationYaml":
                    record.setNotationYaml(tokens.get(i));
                    break;

                case "baseballDefensiveGroupId":
                    record.setBaseballDefensiveGroupId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "comment":
                    record.setComment(tokens.get(i));
                    break;

                case "runnerOnFirstAdvance":
                    record.setRunnerOnFirstAdvance(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "runnerOnSecondAdvance":
                    record.setRunnerOnSecondAdvance(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "runnerOnThirdAdvance":
                    record.setRunnerOnThirdAdvance(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "outsRecorded":
                    record.setOutsRecorded(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "rbi":
                    record.setRbi(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "runsScored":
                    record.setRunsScored(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "earnedRunsScored":
                    record.setEarnedRunsScored(tokens.get(i));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
