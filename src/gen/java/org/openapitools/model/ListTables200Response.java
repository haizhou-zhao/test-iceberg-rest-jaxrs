package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.TableIdentifier;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("listTables_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class ListTables200Response   {
  private @Valid Set<TableIdentifier> identifiers = null;

  /**
   **/
  public ListTables200Response identifiers(Set<TableIdentifier> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("identifiers")
  public Set<TableIdentifier> getIdentifiers() {
    return identifiers;
  }

  @JsonProperty("identifiers")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setIdentifiers(Set<TableIdentifier> identifiers) {
    this.identifiers = identifiers;
  }

  public ListTables200Response addIdentifiersItem(TableIdentifier identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new LinkedHashSet<>();
    }

    this.identifiers.add(identifiersItem);
    return this;
  }

  public ListTables200Response removeIdentifiersItem(TableIdentifier identifiersItem) {
    if (identifiersItem != null && this.identifiers != null) {
      this.identifiers.remove(identifiersItem);
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
    ListTables200Response listTables200Response = (ListTables200Response) o;
    return Objects.equals(this.identifiers, listTables200Response.identifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTables200Response {\n");
    
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
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

