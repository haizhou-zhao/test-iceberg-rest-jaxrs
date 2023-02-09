package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SetCurrentSchemaUpdate_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SetCurrentSchemaUpdateAllOf   {
  private @Valid Integer schemaId;

  /**
   * Schema ID to set as current, or -1 to set last added schema
   **/
  public SetCurrentSchemaUpdateAllOf schemaId(Integer schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Schema ID to set as current, or -1 to set last added schema")
  @JsonProperty("schema-id")
  @NotNull
  public Integer getSchemaId() {
    return schemaId;
  }

  @JsonProperty("schema-id")
  public void setSchemaId(Integer schemaId) {
    this.schemaId = schemaId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetCurrentSchemaUpdateAllOf setCurrentSchemaUpdateAllOf = (SetCurrentSchemaUpdateAllOf) o;
    return Objects.equals(this.schemaId, setCurrentSchemaUpdateAllOf.schemaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetCurrentSchemaUpdateAllOf {\n");
    
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
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

