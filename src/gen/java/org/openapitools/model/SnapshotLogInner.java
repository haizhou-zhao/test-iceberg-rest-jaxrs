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



@JsonTypeName("SnapshotLog_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SnapshotLogInner   {
  private @Valid Integer snapshotId;
  private @Valid Integer timestampMs;

  /**
   **/
  public SnapshotLogInner snapshotId(Integer snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("snapshot-id")
  @NotNull
  public Integer getSnapshotId() {
    return snapshotId;
  }

  @JsonProperty("snapshot-id")
  public void setSnapshotId(Integer snapshotId) {
    this.snapshotId = snapshotId;
  }

  /**
   **/
  public SnapshotLogInner timestampMs(Integer timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("timestamp-ms")
  @NotNull
  public Integer getTimestampMs() {
    return timestampMs;
  }

  @JsonProperty("timestamp-ms")
  public void setTimestampMs(Integer timestampMs) {
    this.timestampMs = timestampMs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotLogInner snapshotLogInner = (SnapshotLogInner) o;
    return Objects.equals(this.snapshotId, snapshotLogInner.snapshotId) &&
        Objects.equals(this.timestampMs, snapshotLogInner.timestampMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotId, timestampMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotLogInner {\n");
    
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    timestampMs: ").append(toIndentedString(timestampMs)).append("\n");
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

