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
import com.sportsdb.test.entity.DisplayNames;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("DisplayNamesHandler")
public class DisplayNamesHandler extends DelimiterFileHandler<DisplayNames> {

    @Inject
    @Named("DefaultJpaDao")
    public DisplayNamesHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected DisplayNames parseLine(List<String> headers, List<String> tokens) {
        DisplayNames record = new DisplayNames();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "id":
                    record.setId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "language":
                    record.setLanguage(tokens.get(i));
                    break;

                case "entityType":
                    record.setEntityType(tokens.get(i));
                    break;

                case "entityId":
                    record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "fullName":
                    record.setFullName(tokens.get(i));
                    break;

                case "firstName":
                    record.setFirstName(tokens.get(i));
                    break;

                case "middleName":
                    record.setMiddleName(tokens.get(i));
                    break;

                case "lastName":
                    record.setLastName(tokens.get(i));
                    break;

                case "alias":
                    record.setAlias(tokens.get(i));
                    break;

                case "abbreviation":
                    record.setAbbreviation(tokens.get(i));
                    break;

                case "shortName":
                    record.setShortName(tokens.get(i));
                    break;

                case "prefix":
                    record.setPrefix(tokens.get(i));
                    break;

                case "suffix":
                    record.setSuffix(tokens.get(i));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
