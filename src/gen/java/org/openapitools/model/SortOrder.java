package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SortField;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SortOrder")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SortOrder   {
  private @Valid Integer orderId;
  private @Valid List<SortField> fields = new ArrayList<>();

  /**
   **/
  public SortOrder orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("order-id")
  @NotNull
  public Integer getOrderId() {
    return orderId;
  }

  @JsonProperty("order-id")
  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  /**
   **/
  public SortOrder fields(List<SortField> fields) {
    this.fields = fields;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("fields")
  @NotNull
  public List<SortField> getFields() {
    return fields;
  }

  @JsonProperty("fields")
  public void setFields(List<SortField> fields) {
    this.fields = fields;
  }

  public SortOrder addFieldsItem(SortField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }

    this.fields.add(fieldsItem);
    return this;
  }

  public SortOrder removeFieldsItem(SortField fieldsItem) {
    if (fieldsItem != null && this.fields != null) {
      this.fields.remove(fieldsItem);
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
    SortOrder sortOrder = (SortOrder) o;
    return Objects.equals(this.orderId, sortOrder.orderId) &&
        Objects.equals(this.fields, sortOrder.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortOrder {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

