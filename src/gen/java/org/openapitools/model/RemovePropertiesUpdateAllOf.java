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



@JsonTypeName("RemovePropertiesUpdate_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class RemovePropertiesUpdateAllOf   {
  private @Valid List<String> removals = new ArrayList<>();

  /**
   **/
  public RemovePropertiesUpdateAllOf removals(List<String> removals) {
    this.removals = removals;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("removals")
  @NotNull
  public List<String> getRemovals() {
    return removals;
  }

  @JsonProperty("removals")
  public void setRemovals(List<String> removals) {
    this.removals = removals;
  }

  public RemovePropertiesUpdateAllOf addRemovalsItem(String removalsItem) {
    if (this.removals == null) {
      this.removals = new ArrayList<>();
    }

    this.removals.add(removalsItem);
    return this;
  }

  public RemovePropertiesUpdateAllOf removeRemovalsItem(String removalsItem) {
    if (removalsItem != null && this.removals != null) {
      this.removals.remove(removalsItem);
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
    RemovePropertiesUpdateAllOf removePropertiesUpdateAllOf = (RemovePropertiesUpdateAllOf) o;
    return Objects.equals(this.removals, removePropertiesUpdateAllOf.removals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemovePropertiesUpdateAllOf {\n");
    
    sb.append("    removals: ").append(toIndentedString(removals)).append("\n");
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

