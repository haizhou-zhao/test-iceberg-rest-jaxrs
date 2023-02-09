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



@JsonTypeName("SetSnapshotRefUpdate_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SetSnapshotRefUpdateAllOf   {
  private @Valid String refName;

  /**
   **/
  public SetSnapshotRefUpdateAllOf refName(String refName) {
    this.refName = refName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ref-name")
  @NotNull
  public String getRefName() {
    return refName;
  }

  @JsonProperty("ref-name")
  public void setRefName(String refName) {
    this.refName = refName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetSnapshotRefUpdateAllOf setSnapshotRefUpdateAllOf = (SetSnapshotRefUpdateAllOf) o;
    return Objects.equals(this.refName, setSnapshotRefUpdateAllOf.refName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetSnapshotRefUpdateAllOf {\n");
    
    sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
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

