package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("listNamespaces_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class ListNamespaces200Response   {
  private @Valid Set<List<String>> namespaces = null;

  /**
   **/
  public ListNamespaces200Response namespaces(Set<List<String>> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("namespaces")
  public Set<List<String>> getNamespaces() {
    return namespaces;
  }

  @JsonProperty("namespaces")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setNamespaces(Set<List<String>> namespaces) {
    this.namespaces = namespaces;
  }

  public ListNamespaces200Response addNamespacesItem(List<String> namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new LinkedHashSet<>();
    }

    this.namespaces.add(namespacesItem);
    return this;
  }

  public ListNamespaces200Response removeNamespacesItem(List<String> namespacesItem) {
    if (namespacesItem != null && this.namespaces != null) {
      this.namespaces.remove(namespacesItem);
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
    ListNamespaces200Response listNamespaces200Response = (ListNamespaces200Response) o;
    return Objects.equals(this.namespaces, listNamespaces200Response.namespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNamespaces200Response {\n");
    
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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

