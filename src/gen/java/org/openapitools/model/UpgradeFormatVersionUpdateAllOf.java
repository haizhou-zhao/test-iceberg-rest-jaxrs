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



@JsonTypeName("UpgradeFormatVersionUpdate_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class UpgradeFormatVersionUpdateAllOf   {
  private @Valid Integer formatVersion;

  /**
   **/
  public UpgradeFormatVersionUpdateAllOf formatVersion(Integer formatVersion) {
    this.formatVersion = formatVersion;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("format-version")
  @NotNull
  public Integer getFormatVersion() {
    return formatVersion;
  }

  @JsonProperty("format-version")
  public void setFormatVersion(Integer formatVersion) {
    this.formatVersion = formatVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeFormatVersionUpdateAllOf upgradeFormatVersionUpdateAllOf = (UpgradeFormatVersionUpdateAllOf) o;
    return Objects.equals(this.formatVersion, upgradeFormatVersionUpdateAllOf.formatVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeFormatVersionUpdateAllOf {\n");
    
    sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
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

