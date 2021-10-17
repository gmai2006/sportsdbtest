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
package com.sportsdb.test.rest;

import static java.util.Objects.requireNonNull;

import com.sportsdb.test.entity.BaseballDefensiveStats;
import com.sportsdb.test.service.BaseballDefensiveStatsService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/baseballdefensivestats")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
public class BaseballDefensiveStatsResource {

    @Inject private BaseballDefensiveStatsService service;

    public BaseballDefensiveStatsResource() {}

    public BaseballDefensiveStatsResource(final BaseballDefensiveStatsService service) {
        requireNonNull(service);
        this.service = service;
    }

    /**
     * hello.
     *
     * @return a hello.
     */
    @GET
    @Path("")
    public Response hello() {
        return Response.status(Response.Status.OK).entity(this.getClass().getName()).build();
    }

    /**
     * InIdempotent method. Update existing BaseballDefensiveStats.
     *
     * @param obj - instance of BaseballDefensiveStats.
     * @return BaseballDefensiveStats.
     */
    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    public BaseballDefensiveStats update(BaseballDefensiveStats obj) {
        return this.service.update(obj);
    }

    /**
     * Delete existing BaseballDefensiveStats.
     *
     * @param id instance of BaseballDefensiveStats.
     * @return BaseballDefensiveStats.
     */

    /**
     * Select all BaseballDefensiveStats with limit of returned records.
     *
     * @param max - number of records.
     * @return a list BaseballDefensiveStats.
     */
    @GET
    @Path("select/{max}")
    public Response findWithLimit(@PathParam("max") String max) {
        Integer input = null;
        try {
            input = Integer.valueOf(max);
        } catch (NumberFormatException ex) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }
        List<BaseballDefensiveStats> result = service.select(input);

        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header(
                        "Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .entity(result)
                .build();
    }

    /**
     * Select all BaseballDefensiveStats records.
     *
     * @return a list BaseballDefensiveStats.
     */
    @GET
    @Path("selectAll")
    public Response selectAll() {
        List<BaseballDefensiveStats> result = service.selectAll();

        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header(
                        "Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .entity(result)
                .build();
    }
}
