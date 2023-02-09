package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SnapshotSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Snapshot")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class Snapshot   {
  private @Valid Integer snapshotId;
  private @Valid Integer parentSnapshotId;
  private @Valid Integer sequenceNumber;
  private @Valid Integer timestampMs;
  private @Valid String manifestList;
  private @Valid SnapshotSummary summary;
  private @Valid Integer schemaId;

  /**
   **/
  public Snapshot snapshotId(Integer snapshotId) {
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
  public Snapshot parentSnapshotId(Integer parentSnapshotId) {
    this.parentSnapshotId = parentSnapshotId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("parent-snapshot-id")
  public Integer getParentSnapshotId() {
    return parentSnapshotId;
  }

  @JsonProperty("parent-snapshot-id")
  public void setParentSnapshotId(Integer parentSnapshotId) {
    this.parentSnapshotId = parentSnapshotId;
  }

  /**
   **/
  public Snapshot sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sequence-number")
  public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  @JsonProperty("sequence-number")
  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  /**
   **/
  public Snapshot timestampMs(Integer timestampMs) {
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

  /**
   * Location of the snapshot&#39;s manifest list file
   **/
  public Snapshot manifestList(String manifestList) {
    this.manifestList = manifestList;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Location of the snapshot's manifest list file")
  @JsonProperty("manifest-list")
  @NotNull
  public String getManifestList() {
    return manifestList;
  }

  @JsonProperty("manifest-list")
  public void setManifestList(String manifestList) {
    this.manifestList = manifestList;
  }

  /**
   **/
  public Snapshot summary(SnapshotSummary summary) {
    this.summary = summary;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("summary")
  @NotNull
  public SnapshotSummary getSummary() {
    return summary;
  }

  @JsonProperty("summary")
  public void setSummary(SnapshotSummary summary) {
    this.summary = summary;
  }

  /**
   **/
  public Snapshot schemaId(Integer schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("schema-id")
  public Integer getSchemaId() {
    return schemaId;
  }

  @JsonProperty("schema-id")
  public void setSchemaId(Integer schemaId) {
    this.schemaId = schemaId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snapshot snapshot = (Snapshot) o;
    return Objects.equals(this.snapshotId, snapshot.snapshotId) &&
        Objects.equals(this.parentSnapshotId, snapshot.parentSnapshotId) &&
        Objects.equals(this.sequenceNumber, snapshot.sequenceNumber) &&
        Objects.equals(this.timestampMs, snapshot.timestampMs) &&
        Objects.equals(this.manifestList, snapshot.manifestList) &&
        Objects.equals(this.summary, snapshot.summary) &&
        Objects.equals(this.schemaId, snapshot.schemaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotId, parentSnapshotId, sequenceNumber, timestampMs, manifestList, summary, schemaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snapshot {\n");
    
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    parentSnapshotId: ").append(toIndentedString(parentSnapshotId)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    timestampMs: ").append(toIndentedString(timestampMs)).append("\n");
    sb.append("    manifestList: ").append(toIndentedString(manifestList)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
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

