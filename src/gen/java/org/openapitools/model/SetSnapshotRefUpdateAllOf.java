/*
 * Apache Iceberg REST Catalog API
 * Defines the specification for the first version of the REST Catalog API. Implementations should ideally support both Iceberg table specs v1 and v2, with priority given to v2.
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * SetSnapshotRefUpdateAllOf
 */
@JsonPropertyOrder({
  SetSnapshotRefUpdateAllOf.JSON_PROPERTY_REF_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-02-09T17:36:38.183060-08:00[America/Los_Angeles]")
public class SetSnapshotRefUpdateAllOf   {
  public static final String JSON_PROPERTY_REF_NAME = "ref-name";
  @JsonProperty(JSON_PROPERTY_REF_NAME)
  private String refName;

  public SetSnapshotRefUpdateAllOf refName(String refName) {
    this.refName = refName;
    return this;
  }

  /**
   * Get refName
   * @return refName
   **/
  @JsonProperty(value = "ref-name")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public String getRefName() {
    return refName;
  }

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

