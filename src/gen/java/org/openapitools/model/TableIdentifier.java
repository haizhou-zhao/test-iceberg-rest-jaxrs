package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TableIdentifier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class TableIdentifier   {
  private @Valid List<String> namespace = new ArrayList<>();
  private @Valid String name;

  /**
   * Reference to one or more levels of a namespace
   **/
  public TableIdentifier namespace(List<String> namespace) {
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

  public TableIdentifier addNamespaceItem(String namespaceItem) {
    if (this.namespace == null) {
      this.namespace = new ArrayList<>();
    }

    this.namespace.add(namespaceItem);
    return this;
  }

  public TableIdentifier removeNamespaceItem(String namespaceItem) {
    if (namespaceItem != null && this.namespace != null) {
      this.namespace.remove(namespaceItem);
    }

    return this;
  }
  /**
   **/
  public TableIdentifier name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableIdentifier tableIdentifier = (TableIdentifier) o;
    return Objects.equals(this.namespace, tableIdentifier.namespace) &&
        Objects.equals(this.name, tableIdentifier.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableIdentifier {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

