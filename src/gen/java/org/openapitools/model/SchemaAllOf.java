package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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



@JsonTypeName("Schema_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SchemaAllOf   {
  private @Valid Integer schemaId;
  private @Valid List<Integer> identifierFieldIds = null;

  /**
   **/
  public SchemaAllOf schemaId(Integer schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("schema-id")
  public Integer getSchemaId() {
    return schemaId;
  }

  @JsonProperty("schema-id")
  public void setSchemaId(Integer schemaId) {
    this.schemaId = schemaId;
  }

  /**
   **/
  public SchemaAllOf identifierFieldIds(List<Integer> identifierFieldIds) {
    this.identifierFieldIds = identifierFieldIds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("identifier-field-ids")
  public List<Integer> getIdentifierFieldIds() {
    return identifierFieldIds;
  }

  @JsonProperty("identifier-field-ids")
  public void setIdentifierFieldIds(List<Integer> identifierFieldIds) {
    this.identifierFieldIds = identifierFieldIds;
  }

  public SchemaAllOf addIdentifierFieldIdsItem(Integer identifierFieldIdsItem) {
    if (this.identifierFieldIds == null) {
      this.identifierFieldIds = new ArrayList<>();
    }

    this.identifierFieldIds.add(identifierFieldIdsItem);
    return this;
  }

  public SchemaAllOf removeIdentifierFieldIdsItem(Integer identifierFieldIdsItem) {
    if (identifierFieldIdsItem != null && this.identifierFieldIds != null) {
      this.identifierFieldIds.remove(identifierFieldIdsItem);
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
    SchemaAllOf schemaAllOf = (SchemaAllOf) o;
    return Objects.equals(this.schemaId, schemaAllOf.schemaId) &&
        Objects.equals(this.identifierFieldIds, schemaAllOf.identifierFieldIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaId, identifierFieldIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaAllOf {\n");
    
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    identifierFieldIds: ").append(toIndentedString(identifierFieldIds)).append("\n");
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

