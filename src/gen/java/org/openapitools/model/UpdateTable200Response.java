package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TableMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("updateTable_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class UpdateTable200Response   {
  private @Valid String metadataLocation;
  private @Valid TableMetadata metadata;

  /**
   **/
  public UpdateTable200Response metadataLocation(String metadataLocation) {
    this.metadataLocation = metadataLocation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("metadata-location")
  @NotNull
  public String getMetadataLocation() {
    return metadataLocation;
  }

  @JsonProperty("metadata-location")
  public void setMetadataLocation(String metadataLocation) {
    this.metadataLocation = metadataLocation;
  }

  /**
   **/
  public UpdateTable200Response metadata(TableMetadata metadata) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTable200Response updateTable200Response = (UpdateTable200Response) o;
    return Objects.equals(this.metadataLocation, updateTable200Response.metadataLocation) &&
        Objects.equals(this.metadata, updateTable200Response.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataLocation, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTable200Response {\n");
    
    sb.append("    metadataLocation: ").append(toIndentedString(metadataLocation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

