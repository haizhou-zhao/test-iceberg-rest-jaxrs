package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.MetricResult;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CommitReport")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class CommitReport   {
  private @Valid String tableName;
  private @Valid Long snapshotId;
  private @Valid Long sequenceNumber;
  private @Valid String operation;
  private @Valid Map<String, MetricResult> metrics = new HashMap<>();
  private @Valid Map<String, String> metadata = null;

  /**
   **/
  public CommitReport tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("table-name")
  @NotNull
  public String getTableName() {
    return tableName;
  }

  @JsonProperty("table-name")
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  /**
   **/
  public CommitReport snapshotId(Long snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("snapshot-id")
  @NotNull
  public Long getSnapshotId() {
    return snapshotId;
  }

  @JsonProperty("snapshot-id")
  public void setSnapshotId(Long snapshotId) {
    this.snapshotId = snapshotId;
  }

  /**
   **/
  public CommitReport sequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sequence-number")
  @NotNull
  public Long getSequenceNumber() {
    return sequenceNumber;
  }

  @JsonProperty("sequence-number")
  public void setSequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  /**
   **/
  public CommitReport operation(String operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull
  public String getOperation() {
    return operation;
  }

  @JsonProperty("operation")
  public void setOperation(String operation) {
    this.operation = operation;
  }

  /**
   **/
  public CommitReport metrics(Map<String, MetricResult> metrics) {
    this.metrics = metrics;
    return this;
  }

  
  @ApiModelProperty(example = "{\"metrics\":{\"total-planning-duration\":{\"count\":1,\"time-unit\":\"nanoseconds\",\"total-duration\":2644235116},\"result-data-files\":{\"unit\":\"count\",\"value\":1},\"result-delete-files\":{\"unit\":\"count\",\"value\":0},\"total-data-manifests\":{\"unit\":\"count\",\"value\":1},\"total-delete-manifests\":{\"unit\":\"count\",\"value\":0},\"scanned-data-manifests\":{\"unit\":\"count\",\"value\":1},\"skipped-data-manifests\":{\"unit\":\"count\",\"value\":0},\"total-file-size-bytes\":{\"unit\":\"bytes\",\"value\":10},\"total-delete-file-size-bytes\":{\"unit\":\"bytes\",\"value\":0}}}", required = true, value = "")
  @JsonProperty("metrics")
  @NotNull
  public Map<String, MetricResult> getMetrics() {
    return metrics;
  }

  @JsonProperty("metrics")
  public void setMetrics(Map<String, MetricResult> metrics) {
    this.metrics = metrics;
  }

  public CommitReport putMetricsItem(String key, MetricResult metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }

    this.metrics.put(key, metricsItem);
    return this;
  }

  public CommitReport removeMetricsItem(MetricResult metricsItem) {
    if (metricsItem != null && this.metrics != null) {
      this.metrics.remove(metricsItem);
    }

    return this;
  }
  /**
   **/
  public CommitReport metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  @JsonProperty("metadata")
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public CommitReport putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }

    this.metadata.put(key, metadataItem);
    return this;
  }

  public CommitReport removeMetadataItem(String metadataItem) {
    if (metadataItem != null && this.metadata != null) {
      this.metadata.remove(metadataItem);
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
    CommitReport commitReport = (CommitReport) o;
    return Objects.equals(this.tableName, commitReport.tableName) &&
        Objects.equals(this.snapshotId, commitReport.snapshotId) &&
        Objects.equals(this.sequenceNumber, commitReport.sequenceNumber) &&
        Objects.equals(this.operation, commitReport.operation) &&
        Objects.equals(this.metrics, commitReport.metrics) &&
        Objects.equals(this.metadata, commitReport.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName, snapshotId, sequenceNumber, operation, metrics, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitReport {\n");
    
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

