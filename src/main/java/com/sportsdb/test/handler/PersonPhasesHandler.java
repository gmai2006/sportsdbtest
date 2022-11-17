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
import com.sportsdb.test.entity.PersonPhases;
import com.sportsdb.test.dao.JpaDao;

import com.sportsdb.test.utils.DelimiterParser;

// @Stateless
@Named("PersonPhasesHandler")
public class PersonPhasesHandler extends DelimiterFileHandler<PersonPhases> {

  @Inject
  @Named("DefaultJpaDao")
  public PersonPhasesHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected PersonPhases parseLine(List<String> headers, List<String> tokens) {
    PersonPhases record = new PersonPhases();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "personId":
          record.setPersonId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "membershipType":
          record.setMembershipType(tokens.get(i));
          break;

        case "membershipId":
          record.setMembershipId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "roleId":
          record.setRoleId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "roleStatus":
          record.setRoleStatus(tokens.get(i));
          break;

        case "phaseStatus":
          record.setPhaseStatus(tokens.get(i));
          break;

        case "uniformNumber":
          record.setUniformNumber(tokens.get(i));
          break;

        case "regularPositionId":
          record.setRegularPositionId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "regularPositionDepth":
          record.setRegularPositionDepth(tokens.get(i));
          break;

        case "height":
          record.setHeight(tokens.get(i));
          break;

        case "weight":
          record.setWeight(tokens.get(i));
          break;

        case "startDateTime":
          record.setStartDateTime(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "startSeasonId":
          record.setStartSeasonId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "endDateTime":
          record.setEndDateTime(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "endSeasonId":
          record.setEndSeasonId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "entryReason":
          record.setEntryReason(tokens.get(i));
          break;

        case "exitReason":
          record.setExitReason(tokens.get(i));
          break;

        case "selectionLevel":
          record.setSelectionLevel(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "selectionSublevel":
          record.setSelectionSublevel(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "selectionOverall":
          record.setSelectionOverall(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
