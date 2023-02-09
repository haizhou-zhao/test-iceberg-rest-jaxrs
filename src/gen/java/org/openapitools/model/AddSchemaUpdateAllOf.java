package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AddSchemaUpdate_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class AddSchemaUpdateAllOf   {
  private @Valid Schema schema;

  /**
   **/
  public AddSchemaUpdateAllOf schema(Schema schema) {
    this.schema = schema;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("schema")
  @NotNull
  public Schema getSchema() {
    return schema;
  }

  @JsonProperty("schema")
  public void setSchema(Schema schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddSchemaUpdateAllOf addSchemaUpdateAllOf = (AddSchemaUpdateAllOf) o;
    return Objects.equals(this.schema, addSchemaUpdateAllOf.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSchemaUpdateAllOf {\n");
    
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

