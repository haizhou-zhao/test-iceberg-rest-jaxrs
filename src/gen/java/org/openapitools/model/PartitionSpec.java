package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PartitionField;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PartitionSpec")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class PartitionSpec   {
  private @Valid Integer specId;
  private @Valid List<PartitionField> fields = new ArrayList<>();

  /**
   **/
  public PartitionSpec specId(Integer specId) {
    this.specId = specId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("spec-id")
  public Integer getSpecId() {
    return specId;
  }

  @JsonProperty("spec-id")
  public void setSpecId(Integer specId) {
    this.specId = specId;
  }

  /**
   **/
  public PartitionSpec fields(List<PartitionField> fields) {
    this.fields = fields;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("fields")
  @NotNull
  public List<PartitionField> getFields() {
    return fields;
  }

  @JsonProperty("fields")
  public void setFields(List<PartitionField> fields) {
    this.fields = fields;
  }

  public PartitionSpec addFieldsItem(PartitionField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }

    this.fields.add(fieldsItem);
    return this;
  }

  public PartitionSpec removeFieldsItem(PartitionField fieldsItem) {
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
    PartitionSpec partitionSpec = (PartitionSpec) o;
    return Objects.equals(this.specId, partitionSpec.specId) &&
        Objects.equals(this.fields, partitionSpec.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specId, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartitionSpec {\n");
    
    sb.append("    specId: ").append(toIndentedString(specId)).append("\n");
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

