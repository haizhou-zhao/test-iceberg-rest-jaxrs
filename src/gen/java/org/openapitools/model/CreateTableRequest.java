package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.PartitionSpec;
import org.openapitools.model.Schema;
import org.openapitools.model.SortOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CreateTableRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class CreateTableRequest   {
  private @Valid String name;
  private @Valid String location;
  private @Valid Schema schema;
  private @Valid PartitionSpec partitionSpec;
  private @Valid SortOrder writeOrder;
  private @Valid Boolean stageCreate;
  private @Valid Map<String, String> properties = null;

  /**
   **/
  public CreateTableRequest name(String name) {
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
  public CreateTableRequest location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  @JsonProperty("location")
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   **/
  public CreateTableRequest schema(Schema schema) {
    this.schema = schema;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("schema")
  @NotNull
  public Schema getSchema() {
    return schema;
  }

  @JsonProperty("schema")
  public void setSchema(Schema schema) {
    this.schema = schema;
  }

  /**
   **/
  public CreateTableRequest partitionSpec(PartitionSpec partitionSpec) {
    this.partitionSpec = partitionSpec;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partition-spec")
  public PartitionSpec getPartitionSpec() {
    return partitionSpec;
  }

  @JsonProperty("partition-spec")
  public void setPartitionSpec(PartitionSpec partitionSpec) {
    this.partitionSpec = partitionSpec;
  }

  /**
   **/
  public CreateTableRequest writeOrder(SortOrder writeOrder) {
    this.writeOrder = writeOrder;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("write-order")
  public SortOrder getWriteOrder() {
    return writeOrder;
  }

  @JsonProperty("write-order")
  public void setWriteOrder(SortOrder writeOrder) {
    this.writeOrder = writeOrder;
  }

  /**
   **/
  public CreateTableRequest stageCreate(Boolean stageCreate) {
    this.stageCreate = stageCreate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stage-create")
  public Boolean getStageCreate() {
    return stageCreate;
  }

  @JsonProperty("stage-create")
  public void setStageCreate(Boolean stageCreate) {
    this.stageCreate = stageCreate;
  }

  /**
   **/
  public CreateTableRequest properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public Map<String, String> getProperties() {
    return properties;
  }

  @JsonProperty("properties")
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public CreateTableRequest putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }

    this.properties.put(key, propertiesItem);
    return this;
  }

  public CreateTableRequest removePropertiesItem(String propertiesItem) {
    if (propertiesItem != null && this.properties != null) {
      this.properties.remove(propertiesItem);
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
    CreateTableRequest createTableRequest = (CreateTableRequest) o;
    return Objects.equals(this.name, createTableRequest.name) &&
        Objects.equals(this.location, createTableRequest.location) &&
        Objects.equals(this.schema, createTableRequest.schema) &&
        Objects.equals(this.partitionSpec, createTableRequest.partitionSpec) &&
        Objects.equals(this.writeOrder, createTableRequest.writeOrder) &&
        Objects.equals(this.stageCreate, createTableRequest.stageCreate) &&
        Objects.equals(this.properties, createTableRequest.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location, schema, partitionSpec, writeOrder, stageCreate, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTableRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    partitionSpec: ").append(toIndentedString(partitionSpec)).append("\n");
    sb.append("    writeOrder: ").append(toIndentedString(writeOrder)).append("\n");
    sb.append("    stageCreate: ").append(toIndentedString(stageCreate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

