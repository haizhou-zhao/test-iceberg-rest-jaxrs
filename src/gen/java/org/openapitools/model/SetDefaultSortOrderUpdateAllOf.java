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



@JsonTypeName("SetDefaultSortOrderUpdate_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SetDefaultSortOrderUpdateAllOf   {
  private @Valid Integer sortOrderId;

  /**
   * Sort order ID to set as the default, or -1 to set last added sort order
   **/
  public SetDefaultSortOrderUpdateAllOf sortOrderId(Integer sortOrderId) {
    this.sortOrderId = sortOrderId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Sort order ID to set as the default, or -1 to set last added sort order")
  @JsonProperty("sort-order-id")
  @NotNull
  public Integer getSortOrderId() {
    return sortOrderId;
  }

  @JsonProperty("sort-order-id")
  public void setSortOrderId(Integer sortOrderId) {
    this.sortOrderId = sortOrderId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDefaultSortOrderUpdateAllOf setDefaultSortOrderUpdateAllOf = (SetDefaultSortOrderUpdateAllOf) o;
    return Objects.equals(this.sortOrderId, setDefaultSortOrderUpdateAllOf.sortOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDefaultSortOrderUpdateAllOf {\n");
    
    sb.append("    sortOrderId: ").append(toIndentedString(sortOrderId)).append("\n");
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

