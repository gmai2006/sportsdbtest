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
import com.sportsdb.test.entity.Addresses;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("AddressesHandler")
public class AddressesHandler extends DelimiterFileHandler<Addresses> {

    @Inject
    @Named("DefaultJpaDao")
    public AddressesHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected Addresses parseLine(List<String> headers, List<String> tokens) {
        Addresses record = new Addresses();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "id":
                    record.setId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "locationId":
                    record.setLocationId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "language":
                    record.setLanguage(tokens.get(i));
                    break;

                case "suite":
                    record.setSuite(tokens.get(i));
                    break;

                case "floor":
                    record.setFloor(tokens.get(i));
                    break;

                case "building":
                    record.setBuilding(tokens.get(i));
                    break;

                case "streetNumber":
                    record.setStreetNumber(tokens.get(i));
                    break;

                case "streetPrefix":
                    record.setStreetPrefix(tokens.get(i));
                    break;

                case "street":
                    record.setStreet(tokens.get(i));
                    break;

                case "streetSuffix":
                    record.setStreetSuffix(tokens.get(i));
                    break;

                case "neighborhood":
                    record.setNeighborhood(tokens.get(i));
                    break;

                case "district":
                    record.setDistrict(tokens.get(i));
                    break;

                case "locality":
                    record.setLocality(tokens.get(i));
                    break;

                case "county":
                    record.setCounty(tokens.get(i));
                    break;

                case "region":
                    record.setRegion(tokens.get(i));
                    break;

                case "postalCode":
                    record.setPostalCode(tokens.get(i));
                    break;

                case "country":
                    record.setCountry(tokens.get(i));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
