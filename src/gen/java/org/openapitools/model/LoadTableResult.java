package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.TableMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result used when a table is successfully loaded.  The table metadata JSON is returned in the &#x60;metadata&#x60; field. The corresponding file location of table metadata should be returned in the &#x60;metadata-location&#x60; field, unless the metadata is not yet committed. For example, a create transaction may return metadata that is staged but not committed. Clients can check whether metadata has changed by comparing metadata locations after the table has been created.  The &#x60;config&#x60; map returns table-specific configuration for the table&#39;s resources, including its HTTP client and FileIO. For example, config may contain a specific FileIO implementation class for the table depending on its underlying storage.
 **/
@ApiModel(description = "Result used when a table is successfully loaded.  The table metadata JSON is returned in the `metadata` field. The corresponding file location of table metadata should be returned in the `metadata-location` field, unless the metadata is not yet committed. For example, a create transaction may return metadata that is staged but not committed. Clients can check whether metadata has changed by comparing metadata locations after the table has been created.  The `config` map returns table-specific configuration for the table's resources, including its HTTP client and FileIO. For example, config may contain a specific FileIO implementation class for the table depending on its underlying storage.")
@JsonTypeName("LoadTableResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class LoadTableResult   {
  private @Valid String metadataLocation;
  private @Valid TableMetadata metadata;
  private @Valid Map<String, String> config = null;

  /**
   * May be null if the table is staged as part of a transaction
   **/
  public LoadTableResult metadataLocation(String metadataLocation) {
    this.metadataLocation = metadataLocation;
    return this;
  }

  
  @ApiModelProperty(value = "May be null if the table is staged as part of a transaction")
  @JsonProperty("metadata-location")
  public String getMetadataLocation() {
    return metadataLocation;
  }

  @JsonProperty("metadata-location")
  public void setMetadataLocation(String metadataLocation) {
    this.metadataLocation = metadataLocation;
  }

  /**
   **/
  public LoadTableResult metadata(TableMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("metadata")
  @NotNull
  public TableMetadata getMetadata() {
    return metadata;
  }

  @JsonProperty("metadata")
  public void setMetadata(TableMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  public LoadTableResult config(Map<String, String> config) {
    this.config = config;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("config")
  public Map<String, String> getConfig() {
    return config;
  }

  @JsonProperty("config")
  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  public LoadTableResult putConfigItem(String key, String configItem) {
    if (this.config == null) {
      this.config = new HashMap<>();
    }

    this.config.put(key, configItem);
    return this;
  }

  public LoadTableResult removeConfigItem(String configItem) {
    if (configItem != null && this.config != null) {
      this.config.remove(configItem);
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
    LoadTableResult loadTableResult = (LoadTableResult) o;
    return Objects.equals(this.metadataLocation, loadTableResult.metadataLocation) &&
        Objects.equals(this.metadata, loadTableResult.metadata) &&
        Objects.equals(this.config, loadTableResult.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataLocation, metadata, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadTableResult {\n");
    
    sb.append("    metadataLocation: ").append(toIndentedString(metadataLocation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

