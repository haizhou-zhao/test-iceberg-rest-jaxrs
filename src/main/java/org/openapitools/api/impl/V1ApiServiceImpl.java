package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CatalogConfig;
import org.openapitools.model.CommitTableRequest;
import org.openapitools.model.CreateNamespace200Response;
import org.openapitools.model.CreateNamespaceRequest;
import org.openapitools.model.CreateTableRequest;
import org.openapitools.model.ErrorModel;
import org.openapitools.model.GetToken200Response;
import org.openapitools.model.GetToken400Response;
import org.openapitools.model.ListNamespaces200Response;
import org.openapitools.model.ListTables200Response;
import org.openapitools.model.LoadNamespaceMetadata200Response;
import org.openapitools.model.LoadTableResult;
import org.openapitools.model.RenameTableRequest;
import org.openapitools.model.ReportMetricsRequest;
import org.openapitools.model.TokenType;
import org.openapitools.model.UpdateNamespacePropertiesRequest;
import org.openapitools.model.UpdateProperties200Response;
import org.openapitools.model.UpdateTable200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-02-09T17:36:38.183060-08:00[America/Los_Angeles]")
public class V1ApiServiceImpl extends V1ApiService {
    @Override
    public Response createNamespace(String prefix, CreateNamespaceRequest createNamespaceRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createTable(String prefix, String namespace, CreateTableRequest createTableRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response dropNamespace(String prefix, String namespace, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response dropTable(String prefix, String namespace, String table, Boolean purgeRequested, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getConfig(String warehouse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getToken(String grantType, String scope, String clientId, String clientSecret, TokenType requestedTokenType, String subjectToken, TokenType subjectTokenType, String actorToken, TokenType actorTokenType, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response listNamespaces(String prefix, String parent, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response listTables(String prefix, String namespace, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response loadNamespaceMetadata(String prefix, String namespace, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response loadTable(String prefix, String namespace, String table, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response renameTable(String prefix, RenameTableRequest renameTableRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response reportMetrics(String prefix, String namespace, String table, ReportMetricsRequest reportMetricsRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response tableExists(String prefix, String namespace, String table, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateProperties(String prefix, String namespace, UpdateNamespacePropertiesRequest updateNamespacePropertiesRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateTable(String prefix, String namespace, String table, CommitTableRequest commitTableRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
