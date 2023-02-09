package org.openapitools.model;

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



@JsonTypeName("PartitionField")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class PartitionField   {
  private @Valid Integer fieldId;
  private @Valid Integer sourceId;
  private @Valid String name;
  private @Valid String transform;

  /**
   **/
  public PartitionField fieldId(Integer fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("field-id")
  public Integer getFieldId() {
    return fieldId;
  }

  @JsonProperty("field-id")
  public void setFieldId(Integer fieldId) {
    this.fieldId = fieldId;
  }

  /**
   **/
  public PartitionField sourceId(Integer sourceId) {
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
  public PartitionField name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public PartitionField transform(String transform) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartitionField partitionField = (PartitionField) o;
    return Objects.equals(this.fieldId, partitionField.fieldId) &&
        Objects.equals(this.sourceId, partitionField.sourceId) &&
        Objects.equals(this.name, partitionField.name) &&
        Objects.equals(this.transform, partitionField.transform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, sourceId, name, transform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartitionField {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
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

