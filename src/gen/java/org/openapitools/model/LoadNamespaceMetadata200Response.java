package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("loadNamespaceMetadata_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class LoadNamespaceMetadata200Response   {
  private @Valid List<String> namespace = new ArrayList<>();
  private @Valid Map<String, String> properties = null;

  /**
   * Reference to one or more levels of a namespace
   **/
  public LoadNamespaceMetadata200Response namespace(List<String> namespace) {
    this.namespace = namespace;
    return this;
  }

  
  @ApiModelProperty(example = "[\"accounting\",\"tax\"]", required = true, value = "Reference to one or more levels of a namespace")
  @JsonProperty("namespace")
  @NotNull
  public List<String> getNamespace() {
    return namespace;
  }

  @JsonProperty("namespace")
  public void setNamespace(List<String> namespace) {
    this.namespace = namespace;
  }

  public LoadNamespaceMetadata200Response addNamespaceItem(String namespaceItem) {
    if (this.namespace == null) {
      this.namespace = new ArrayList<>();
    }

    this.namespace.add(namespaceItem);
    return this;
  }

  public LoadNamespaceMetadata200Response removeNamespaceItem(String namespaceItem) {
    if (namespaceItem != null && this.namespace != null) {
      this.namespace.remove(namespaceItem);
    }

    return this;
  }
  /**
   * Properties stored on the namespace, if supported by the server. If the server does not support namespace properties, it should return null for this field. If namespace properties are supported, but none are set, it should return an empty object.
   **/
  public LoadNamespaceMetadata200Response properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(example = "{\"owner\":\"Ralph\",\"transient_lastDdlTime\":\"1452120468\"}", value = "Properties stored on the namespace, if supported by the server. If the server does not support namespace properties, it should return null for this field. If namespace properties are supported, but none are set, it should return an empty object.")
  @JsonProperty("properties")
  public Map<String, String> getProperties() {
    return properties;
  }

  @JsonProperty("properties")
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public LoadNamespaceMetadata200Response putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = null;
    }

    this.properties.put(key, propertiesItem);
    return this;
  }

  public LoadNamespaceMetadata200Response removePropertiesItem(String propertiesItem) {
    if (propertiesItem != null && this.properties != null) {
      this.properties.remove(propertiesItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadNamespaceMetadata200Response loadNamespaceMetadata200Response = (LoadNamespaceMetadata200Response) o;
    return Objects.equals(this.namespace, loadNamespaceMetadata200Response.namespace) &&
        Objects.equals(this.properties, loadNamespaceMetadata200Response.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadNamespaceMetadata200Response {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

