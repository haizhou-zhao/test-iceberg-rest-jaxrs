package org.openapitools.api.factories;

import org.openapitools.api.V1ApiService;
import org.openapitools.api.impl.V1ApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-02-09T17:36:38.183060-08:00[America/Los_Angeles]")
public class V1ApiServiceFactory {
    private static final V1ApiService service = new V1ApiServiceImpl();

    public static V1ApiService getV1Api() {
        return service;
    }
}
