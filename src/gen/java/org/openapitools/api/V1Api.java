package org.openapitools.api;

import org.openapitools.api.V1ApiService;
import org.openapitools.api.factories.V1ApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/v1")


@io.swagger.annotations.Api(description = "the v1 API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-02-09T17:36:38.183060-08:00[America/Los_Angeles]")
public class V1Api  {
   private final V1ApiService delegate;

   public V1Api(@Context ServletConfig servletContext) {
      V1ApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("V1Api.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (V1ApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = V1ApiServiceFactory.getV1Api();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/{prefix}/namespaces")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a namespace", notes = "Create a namespace, with an optional set of properties. The server might also add properties, such as `last_modified_time` etc.", response = CreateNamespace200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Represents a successful call to create a namespace. Returns the namespace created, as well as any properties that were stored for the namespace, including those the server might have added. Implementations are not required to support namespace properties.", response = CreateNamespace200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 406, message = "Not Acceptable / Unsupported Operation. The server does not support this operation.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict - The namespace already exists", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response createNamespace(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "") @Valid  CreateNamespaceRequest createNamespaceRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createNamespace(prefix, createNamespaceRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{prefix}/namespaces/{namespace}/tables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a table in the given namespace", notes = "Create a table or start a create transaction, like atomic CTAS.  If `stage-create` is false, the table is created immediately.  If `stage-create` is true, the table is not created, but table metadata is initialized and returned. The service should prepare as needed for a commit to the table commit endpoint to complete the create transaction. The client uses the returned metadata to begin a transaction. To commit the transaction, the client sends all create and subsequent changes to the table commit route. Changes from the table create operation include changes like AddSchemaUpdate and SetCurrentSchemaUpdate that set the initial table state.", response = LoadTableResult.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Table metadata result after creating a table", response = LoadTableResult.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found - The namespace specified does not exist", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict - The table already exists", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response createTable(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "A namespace identifier as a single string. Multipart namespace parts should be separated by the unit separator (`0x1F`) byte.", required = true) @PathParam("namespace") @NotNull  String namespace,@ApiParam(value = "") @Valid  CreateTableRequest createTableRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTable(prefix, namespace, createTableRequest, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{prefix}/namespaces/{namespace}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Drop a namespace from the catalog. Namespace must be empty.", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Success, no content", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found - Namespace to delete does not exist.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response dropNamespace(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "A namespace identifier as a single string. Multipart namespace parts should be separated by the unit separator (`0x1F`) byte.", required = true) @PathParam("namespace") @NotNull  String namespace,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dropNamespace(prefix, namespace, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{prefix}/namespaces/{namespace}/tables/{table}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Drop a table from the catalog", notes = "Remove a table from the catalog", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Success, no content", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found - NoSuchTableException, Table to drop does not exist", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response dropTable(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "A namespace identifier as a single string. Multipart namespace parts should be separated by the unit separator (`0x1F`) byte.", required = true) @PathParam("namespace") @NotNull  String namespace,@ApiParam(value = "A table name", required = true) @PathParam("table") @NotNull  String table,@ApiParam(value = "Whether the user requested to purge the underlying table's data and metadata", defaultValue = "false") @DefaultValue("false") @QueryParam("purgeRequested")  Boolean purgeRequested,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dropTable(prefix, namespace, table, purgeRequested, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/config")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List all catalog configuration settings", notes = " All REST clients should first call this route to get catalog configuration properties from the server to configure the catalog and its HTTP client. Configuration from the server consists of two sets of key/value pairs. - defaults -  properties that should be used as default configuration; applied before client configuration - overrides - properties that should be used to override client configuration; applied after defaults and client configuration  Catalog configuration is constructed by setting the defaults, then client- provided configuration, and finally overrides. The final property set is then used to configure the catalog.  For example, a default configuration property might set the size of the client pool, which can be replaced with a client-specific setting. An override might be used to set the warehouse location, which is stored on the server rather than in client configuration.  Common catalog configuration settings are documented at https://iceberg.apache.org/configuration/#catalog-properties ", response = CatalogConfig.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Configuration API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Server specified configuration values.", response = CatalogConfig.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response getConfig(@ApiParam(value = "Warehouse location or identifier to request from the service") @QueryParam("warehouse")  String warehouse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getConfig(warehouse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/oauth/tokens")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a token using an OAuth2 flow", notes = "Exchange credentials for a token using the OAuth2 client credentials flow or token exchange.  This endpoint is used for three purposes - 1. To exchange client credentials (client ID and secret) for an access token This uses the client credentials flow. 2. To exchange a client token and an identity token for a more specific access token This uses the token exchange flow. 3. To exchange an access token for one with the same claims and a refreshed expiration period This uses the token exchange flow.  For example, a catalog client may be configured with client credentials from the OAuth2 Authorization flow. This client would exchange its client ID and secret for an access token using the client credentials request with this endpoint (1). Subsequent requests would then use that access token.  Some clients may also handle sessions that have additional user context. These clients would use the token exchange flow to exchange a user token (the \"subject\" token) from the session for a more specific access token for that user, using the catalog's access token as the \"actor\" token (2). The user ID token is the \"subject\" token and can be any token type allowed by the OAuth2 token exchange flow, including a unsecured JWT token with a sub claim. This request should use the catalog's bearer token in the \"Authorization\" header.  Clients may also use the token exchange flow to refresh a token that is about to expire by sending a token exchange request (3). The request's \"subject\" token should be the expiring token. This request should use the subject token in the \"Authorization\" header.", response = GetToken200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "OAuth2 API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OAuth2 token response for client credentials or token exchange", response = GetToken200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "OAuth2 error response", response = GetToken400Response.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "OAuth2 error response", response = GetToken400Response.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "OAuth2 error response", response = GetToken400Response.class)
    })
    public Response getToken(@ApiParam(value = "", allowableValues="urn:ietf:params:oauth:grant-type:token-exchange")  @FormParam("grant_type")  String grantType,@ApiParam(value = "")  @FormParam("scope")  String scope,@ApiParam(value = "Client ID  This can be sent in the request body, but OAuth2 recommends sending it in a Basic Authorization header.")  @FormParam("client_id")  String clientId,@ApiParam(value = "Client secret  This can be sent in the request body, but OAuth2 recommends sending it in a Basic Authorization header.")  @FormParam("client_secret")  String clientSecret,@ApiParam(value = "", allowableValues="urn:ietf:params:oauth:token-type:access_token, urn:ietf:params:oauth:token-type:refresh_token, urn:ietf:params:oauth:token-type:id_token, urn:ietf:params:oauth:token-type:saml1, urn:ietf:params:oauth:token-type:saml2, urn:ietf:params:oauth:token-type:jwt")  @FormParam("requested_token_type")  TokenType requestedTokenType,@ApiParam(value = "Subject token for token exchange request")  @FormParam("subject_token")  String subjectToken,@ApiParam(value = "", allowableValues="urn:ietf:params:oauth:token-type:access_token, urn:ietf:params:oauth:token-type:refresh_token, urn:ietf:params:oauth:token-type:id_token, urn:ietf:params:oauth:token-type:saml1, urn:ietf:params:oauth:token-type:saml2, urn:ietf:params:oauth:token-type:jwt")  @FormParam("subject_token_type")  TokenType subjectTokenType,@ApiParam(value = "Actor token for token exchange request")  @FormParam("actor_token")  String actorToken,@ApiParam(value = "", allowableValues="urn:ietf:params:oauth:token-type:access_token, urn:ietf:params:oauth:token-type:refresh_token, urn:ietf:params:oauth:token-type:id_token, urn:ietf:params:oauth:token-type:saml1, urn:ietf:params:oauth:token-type:saml2, urn:ietf:params:oauth:token-type:jwt")  @FormParam("actor_token_type")  TokenType actorTokenType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getToken(grantType, scope, clientId, clientSecret, requestedTokenType, subjectToken, subjectTokenType, actorToken, actorTokenType, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{prefix}/namespaces")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List namespaces, optionally providing a parent namespace to list underneath", notes = "List all namespaces at a certain level, optionally starting from a given parent namespace. For example, if table accounting.tax.paid exists, using 'SELECT NAMESPACE IN accounting' would translate into `GET /namespaces?parent=accounting` and must return a namespace, [\"accounting\", \"tax\"]. If `parent` is not provided, all top-level namespaces should be listed.", response = ListNamespaces200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of namespaces", response = ListNamespaces200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found - Namespace provided in the `parent` query parameter is not found.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response listNamespaces(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "An optional namespace, underneath which to list namespaces. If not provided or empty, all top-level namespaces should be listed. If parent is a multipart namespace, the parts must be separated by the unit separator (`0x1F`) byte.") @QueryParam("parent")  String parent,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listNamespaces(prefix, parent, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{prefix}/namespaces/{namespace}/tables")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List all table identifiers underneath a given namespace", notes = "Return all table identifiers under this namespace", response = ListTables200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of table identifiers", response = ListTables200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found - The namespace specified does not exist", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response listTables(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "A namespace identifier as a single string. Multipart namespace parts should be separated by the unit separator (`0x1F`) byte.", required = true) @PathParam("namespace") @NotNull  String namespace,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listTables(prefix, namespace, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{prefix}/namespaces/{namespace}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Load the metadata properties for a namespace", notes = "Return all stored metadata properties for a given namespace", response = LoadNamespaceMetadata200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns a namespace, as well as any properties stored on the namespace if namespace properties are supported by the server.", response = LoadNamespaceMetadata200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found - Namespace not found", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response loadNamespaceMetadata(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "A namespace identifier as a single string. Multipart namespace parts should be separated by the unit separator (`0x1F`) byte.", required = true) @PathParam("namespace") @NotNull  String namespace,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loadNamespaceMetadata(prefix, namespace, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{prefix}/namespaces/{namespace}/tables/{table}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Load a table from the catalog", notes = "Load a table from the catalog.  The response contains both configuration and table metadata. The configuration, if non-empty is used as additional configuration for the table that overrides catalog configuration. For example, this configuration may change the FileIO implementation to be used for the table.  The response also contains the table's full metadata, matching the table metadata JSON file.  The catalog configuration may contain credentials that should be used for subsequent requests for the table. The configuration key \"token\" is used to pass an access token to be used as a bearer token for table requests. Otherwise, a token may be passed using a RFC 8693 token type as a configuration key. For example, \"urn:ietf:params:oauth:token-type:jwt=<JWT-token>\".", response = LoadTableResult.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Table metadata result when loading a table", response = LoadTableResult.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found - NoSuchTableException, table to load does not exist", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response loadTable(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "A namespace identifier as a single string. Multipart namespace parts should be separated by the unit separator (`0x1F`) byte.", required = true) @PathParam("namespace") @NotNull  String namespace,@ApiParam(value = "A table name", required = true) @PathParam("table") @NotNull  String table,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loadTable(prefix, namespace, table, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{prefix}/tables/rename")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Rename a table from its current name to a new name", notes = "Rename a table from one identifier to another. It's valid to move a table across namespaces, but the server implementation is not required to support it.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found - NoSuchTableException, Table to rename does not exist - NoSuchNamespaceException, The target namespace of the new table identifier does not exist", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 406, message = "Not Acceptable / Unsupported Operation. The server does not support this operation.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict - The target table identifier to rename to already exists", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response renameTable(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "Current table identifier to rename and new table identifier to rename to", required = true) @NotNull @Valid  RenameTableRequest renameTableRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.renameTable(prefix, renameTableRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{prefix}/namespaces/{namespace}/tables/{table}/metrics")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Send a metrics report to this endpoint to be processed by the backend", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Success, no content", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found - NoSuchTableException, table to load does not exist", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response reportMetrics(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "A namespace identifier as a single string. Multipart namespace parts should be separated by the unit separator (`0x1F`) byte.", required = true) @PathParam("namespace") @NotNull  String namespace,@ApiParam(value = "A table name", required = true) @PathParam("table") @NotNull  String table,@ApiParam(value = "The request containing the metrics report to be sent", required = true) @NotNull @Valid  ReportMetricsRequest reportMetricsRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reportMetrics(prefix, namespace, table, reportMetricsRequest, securityContext);
    }
    @javax.ws.rs.HEAD
    @Path("/{prefix}/namespaces/{namespace}/tables/{table}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Check if a table exists", notes = "Check if a table exists within a given namespace. This request does not return a response body.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK - Table Exists", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response tableExists(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "A namespace identifier as a single string. Multipart namespace parts should be separated by the unit separator (`0x1F`) byte.", required = true) @PathParam("namespace") @NotNull  String namespace,@ApiParam(value = "A table name", required = true) @PathParam("table") @NotNull  String table,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.tableExists(prefix, namespace, table, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{prefix}/namespaces/{namespace}/properties")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Set or remove properties on a namespace", notes = "Set and/or remove properties on a namespace. The request body specifies a list of properties to remove and a map of key value pairs to update. Properties that are not in the request are not modified or removed by this call. Server implementations are not required to support namespace properties.", response = UpdateProperties200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "JSON data response for a synchronous update properties request.", response = UpdateProperties200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found - Namespace not found", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 406, message = "Not Acceptable / Unsupported Operation. The server does not support this operation.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable Entity - A property key was included in both `removals` and `updates`", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable from the client side. Used for server 5xx errors without more specific documentation in individual routes.", response = ErrorModel.class)
    })
    public Response updateProperties(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "A namespace identifier as a single string. Multipart namespace parts should be separated by the unit separator (`0x1F`) byte.", required = true) @PathParam("namespace") @NotNull  String namespace,@ApiParam(value = "") @Valid  UpdateNamespacePropertiesRequest updateNamespacePropertiesRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateProperties(prefix, namespace, updateNamespacePropertiesRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{prefix}/namespaces/{namespace}/tables/{table}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Commit updates to a table", notes = "Commit updates to a table.  Commits have two parts, requirements and updates. Requirements are assertions that will be validated before attempting to make and commit changes. For example, `assert-ref-snapshot-id` will check that a named ref's snapshot ID has a certain value.  Updates are changes to make to table metadata. For example, after asserting that the current main ref is at the expected snapshot, a commit may add a new child snapshot and set the ref to the new snapshot id.  Create table transactions that are started by createTable with `stage-create` set to true are committed using this route. Transactions should include all changes to the table, including table initialization, like AddSchemaUpdate and SetCurrentSchemaUpdate. The `assert-create` requirement is used to ensure that the table was not created concurrently.", response = UpdateTable200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "BearerAuth"),
        @io.swagger.annotations.Authorization(value = "OAuth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalog", description = "Allows interacting with the Config and Catalog APIs")
        })
    }, tags={ "Catalog API", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response used when a table is successfully updated. The table metadata JSON is returned in the metadata field. The corresponding file location of table metadata must be returned in the metadata-location field. Clients can check whether metadata has changed by comparing metadata locations.", response = UpdateTable200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure, such as invalid json. Usually serves application/json content, although in some cases simple text/plain content might be returned by the server's middleware.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. Authentication is required and has failed or has not yet been provided.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Authenticated user does not have the necessary permissions.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found - NoSuchTableException, table to load does not exist", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict - CommitFailedException, one or more requirements failed. The client may retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 419, message = "Credentials have timed out. If possible, the client should refresh credentials and retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unknown server-side problem occurred; the commit state is unknown.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is not ready to handle the request. The client should wait and retry.  The service may additionally send a Retry-After header to indicate when to retry.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 502, message = "A gateway or proxy received an invalid response from the upstream server; the commit state is unknown.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 504, message = "A server-side gateway timeout occurred; the commit state is unknown.", response = ErrorModel.class),
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "A server-side problem that might not be addressable on the client.", response = ErrorModel.class)
    })
    public Response updateTable(@ApiParam(value = "An optional prefix in the path", required = true) @PathParam("prefix") @NotNull  String prefix,@ApiParam(value = "A namespace identifier as a single string. Multipart namespace parts should be separated by the unit separator (`0x1F`) byte.", required = true) @PathParam("namespace") @NotNull  String namespace,@ApiParam(value = "A table name", required = true) @PathParam("table") @NotNull  String table,@ApiParam(value = "") @Valid  CommitTableRequest commitTableRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateTable(prefix, namespace, table, commitTableRequest, securityContext);
    }
}
