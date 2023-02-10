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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SortField;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * SortOrder
 */
@JsonPropertyOrder({
  SortOrder.JSON_PROPERTY_ORDER_ID,
  SortOrder.JSON_PROPERTY_FIELDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-02-09T17:36:38.183060-08:00[America/Los_Angeles]")
public class SortOrder   {
  public static final String JSON_PROPERTY_ORDER_ID = "order-id";
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  private Integer orderId;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  @JsonProperty(JSON_PROPERTY_FIELDS)
  private List<SortField> fields = new ArrayList<>();

  public SortOrder orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
   **/
  @JsonProperty(value = "order-id", access = JsonProperty.Access.READ_ONLY)
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public SortOrder fields(List<SortField> fields) {
    this.fields = fields;
    return this;
  }

  public SortOrder addFieldsItem(SortField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
   **/
  @JsonProperty(value = "fields")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public List<SortField> getFields() {
    return fields;
  }

  public void setFields(List<SortField> fields) {
    this.fields = fields;
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

