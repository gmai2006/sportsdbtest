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
import com.sportsdb.test.entity.PersonEventMetadata;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("PersonEventMetadataHandler")
public class PersonEventMetadataHandler extends DelimiterFileHandler<PersonEventMetadata> {

    @Inject
    @Named("DefaultJpaDao")
    public PersonEventMetadataHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected PersonEventMetadata parseLine(List<String> headers, List<String> tokens) {
        PersonEventMetadata record = new PersonEventMetadata();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "id":
                    record.setId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "personId":
                    record.setPersonId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "eventId":
                    record.setEventId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "status":
                    record.setStatus(tokens.get(i));
                    break;

                case "health":
                    record.setHealth(tokens.get(i));
                    break;

                case "weight":
                    record.setWeight(tokens.get(i));
                    break;

                case "roleId":
                    record.setRoleId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "positionId":
                    record.setPositionId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "teamId":
                    record.setTeamId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "lineupSlot":
                    record.setLineupSlot(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "lineupSlotSequence":
                    record.setLineupSlotSequence(java.lang.Integer.valueOf((tokens.get(i))));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
