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
import com.sportsdb.test.entity.Persons;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("PersonsHandler")
public class PersonsHandler extends DelimiterFileHandler<Persons> {

    @Inject
    @Named("DefaultJpaDao")
    public PersonsHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected Persons parseLine(List<String> headers, List<String> tokens) {
        Persons record = new Persons();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "id":
                    record.setId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "personKey":
                    record.setPersonKey(tokens.get(i));
                    break;

                case "publisherId":
                    record.setPublisherId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "gender":
                    record.setGender(tokens.get(i));
                    break;

                case "birthDate":
                    record.setBirthDate(tokens.get(i));
                    break;

                case "deathDate":
                    record.setDeathDate(tokens.get(i));
                    break;

                case "birthLocationId":
                    record.setBirthLocationId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "hometownLocationId":
                    record.setHometownLocationId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "residenceLocationId":
                    record.setResidenceLocationId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "deathLocationId":
                    record.setDeathLocationId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
