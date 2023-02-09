package org.openapitools.api;

import org.openapitools.model.PetsPatchRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pets")
@Api(description = "the pets API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T11:34:29.236122-08:00[America/Los_Angeles]")
public class PetsApi {

    @PATCH
    @Consumes({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated", response = Void.class)
    })
    public Response petsPatch(@Valid PetsPatchRequest petsPatchRequest) {
        return Response.ok().entity("magic!").build();
    }
}
