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
import com.sportsdb.test.entity.TennisEventStates;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("TennisEventStatesHandler")
public class TennisEventStatesHandler extends DelimiterFileHandler<TennisEventStates> {

    @Inject
    @Named("DefaultJpaDao")
    public TennisEventStatesHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected TennisEventStates parseLine(List<String> headers, List<String> tokens) {
        TennisEventStates record = new TennisEventStates();
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
                case "tennisSet":
                    record.setTennisSet(tokens.get(i));
                    break;

                case "game":
                    record.setGame(tokens.get(i));
                    break;

                case "serverPersonId":
                    record.setServerPersonId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "serverScore":
                    record.setServerScore(tokens.get(i));
                    break;

                case "receiverPersonId":
                    record.setReceiverPersonId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "receiverScore":
                    record.setReceiverScore(tokens.get(i));
                    break;

                case "serviceNumber":
                    record.setServiceNumber(tokens.get(i));
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
