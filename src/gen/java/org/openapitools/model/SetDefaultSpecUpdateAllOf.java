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



@JsonTypeName("SetDefaultSpecUpdate_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SetDefaultSpecUpdateAllOf   {
  private @Valid Integer specId;

  /**
   * Partition spec ID to set as the default, or -1 to set last added spec
   **/
  public SetDefaultSpecUpdateAllOf specId(Integer specId) {
    this.specId = specId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Partition spec ID to set as the default, or -1 to set last added spec")
  @JsonProperty("spec-id")
  @NotNull
  public Integer getSpecId() {
    return specId;
  }

  @JsonProperty("spec-id")
  public void setSpecId(Integer specId) {
    this.specId = specId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDefaultSpecUpdateAllOf setDefaultSpecUpdateAllOf = (SetDefaultSpecUpdateAllOf) o;
    return Objects.equals(this.specId, setDefaultSpecUpdateAllOf.specId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDefaultSpecUpdateAllOf {\n");
    
    sb.append("    specId: ").append(toIndentedString(specId)).append("\n");
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

