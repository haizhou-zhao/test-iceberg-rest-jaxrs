package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TableIdentifier;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("RenameTableRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class RenameTableRequest   {
  private @Valid TableIdentifier source;
  private @Valid TableIdentifier destination;

  /**
   **/
  public RenameTableRequest source(TableIdentifier source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source")
  @NotNull
  public TableIdentifier getSource() {
    return source;
  }

  @JsonProperty("source")
  public void setSource(TableIdentifier source) {
    this.source = source;
  }

  /**
   **/
  public RenameTableRequest destination(TableIdentifier destination) {
    this.destination = destination;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("destination")
  @NotNull
  public TableIdentifier getDestination() {
    return destination;
  }

  @JsonProperty("destination")
  public void setDestination(TableIdentifier destination) {
    this.destination = destination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenameTableRequest renameTableRequest = (RenameTableRequest) o;
    return Objects.equals(this.source, renameTableRequest.source) &&
        Objects.equals(this.destination, renameTableRequest.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, destination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenameTableRequest {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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

