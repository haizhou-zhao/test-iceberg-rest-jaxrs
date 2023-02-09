package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NullOrder;
import org.openapitools.model.SortDirection;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SortField")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SortField   {
  private @Valid Integer sourceId;
  private @Valid String transform;
  private @Valid SortDirection direction;
  private @Valid NullOrder nullOrder;

  /**
   **/
  public SortField sourceId(Integer sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source-id")
  @NotNull
  public Integer getSourceId() {
    return sourceId;
  }

  @JsonProperty("source-id")
  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }

  /**
   **/
  public SortField transform(String transform) {
    this.transform = transform;
    return this;
  }

  
  @ApiModelProperty(example = "[\"identity\",\"year\",\"month\",\"day\",\"hour\",\"bucket[256]\",\"truncate[16]\"]", required = true, value = "")
  @JsonProperty("transform")
  @NotNull
  public String getTransform() {
    return transform;
  }

  @JsonProperty("transform")
  public void setTransform(String transform) {
    this.transform = transform;
  }

  /**
   **/
  public SortField direction(SortDirection direction) {
    this.direction = direction;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("direction")
  @NotNull
  public SortDirection getDirection() {
    return direction;
  }

  @JsonProperty("direction")
  public void setDirection(SortDirection direction) {
    this.direction = direction;
  }

  /**
   **/
  public SortField nullOrder(NullOrder nullOrder) {
    this.nullOrder = nullOrder;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("null-order")
  @NotNull
  public NullOrder getNullOrder() {
    return nullOrder;
  }

  @JsonProperty("null-order")
  public void setNullOrder(NullOrder nullOrder) {
    this.nullOrder = nullOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortField sortField = (SortField) o;
    return Objects.equals(this.sourceId, sortField.sourceId) &&
        Objects.equals(this.transform, sortField.transform) &&
        Objects.equals(this.direction, sortField.direction) &&
        Objects.equals(this.nullOrder, sortField.nullOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, transform, direction, nullOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortField {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    nullOrder: ").append(toIndentedString(nullOrder)).append("\n");
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

