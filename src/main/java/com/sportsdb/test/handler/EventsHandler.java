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
import com.sportsdb.test.entity.Events;
import com.sportsdb.test.dao.JpaDao;

import com.sportsdb.test.utils.DelimiterParser;

// @Stateless
@Named("EventsHandler")
public class EventsHandler extends DelimiterFileHandler<Events> {

  @Inject
  @Named("DefaultJpaDao")
  public EventsHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected Events parseLine(List<String> headers, List<String> tokens) {
    Events record = new Events();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "eventKey":
          record.setEventKey(tokens.get(i));
          break;

        case "publisherId":
          record.setPublisherId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "startDateTime":
          record.setStartDateTime(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "siteId":
          record.setSiteId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "siteAlignment":
          record.setSiteAlignment(tokens.get(i));
          break;

        case "eventStatus":
          record.setEventStatus(tokens.get(i));
          break;

        case "duration":
          record.setDuration(tokens.get(i));
          break;

        case "attendance":
          record.setAttendance(tokens.get(i));
          break;

        case "lastUpdate":
          record.setLastUpdate(new java.util.Date(parseDate(tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
