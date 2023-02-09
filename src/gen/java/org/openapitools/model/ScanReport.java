package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Expression;
import org.openapitools.model.MetricResult;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ScanReport")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class ScanReport   {
  private @Valid String tableName;
  private @Valid Long snapshotId;
  private @Valid Expression filter;
  private @Valid Integer schemaId;
  private @Valid List<Integer> projectedFieldIds = new ArrayList<>();
  private @Valid List<String> projectedFieldNames = new ArrayList<>();
  private @Valid Map<String, MetricResult> metrics = new HashMap<>();
  private @Valid Map<String, String> metadata = null;

  /**
   **/
  public ScanReport tableName(String tableName) {
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
  public ScanReport snapshotId(Long snapshotId) {
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
  public ScanReport filter(Expression filter) {
    this.filter = filter;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("filter")
  @NotNull
  public Expression getFilter() {
    return filter;
  }

  @JsonProperty("filter")
  public void setFilter(Expression filter) {
    this.filter = filter;
  }

  /**
   **/
  public ScanReport schemaId(Integer schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("schema-id")
  @NotNull
  public Integer getSchemaId() {
    return schemaId;
  }

  @JsonProperty("schema-id")
  public void setSchemaId(Integer schemaId) {
    this.schemaId = schemaId;
  }

  /**
   **/
  public ScanReport projectedFieldIds(List<Integer> projectedFieldIds) {
    this.projectedFieldIds = projectedFieldIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("projected-field-ids")
  @NotNull
  public List<Integer> getProjectedFieldIds() {
    return projectedFieldIds;
  }

  @JsonProperty("projected-field-ids")
  public void setProjectedFieldIds(List<Integer> projectedFieldIds) {
    this.projectedFieldIds = projectedFieldIds;
  }

  public ScanReport addProjectedFieldIdsItem(Integer projectedFieldIdsItem) {
    if (this.projectedFieldIds == null) {
      this.projectedFieldIds = new ArrayList<>();
    }

    this.projectedFieldIds.add(projectedFieldIdsItem);
    return this;
  }

  public ScanReport removeProjectedFieldIdsItem(Integer projectedFieldIdsItem) {
    if (projectedFieldIdsItem != null && this.projectedFieldIds != null) {
      this.projectedFieldIds.remove(projectedFieldIdsItem);
    }

    return this;
  }
  /**
   **/
  public ScanReport projectedFieldNames(List<String> projectedFieldNames) {
    this.projectedFieldNames = projectedFieldNames;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("projected-field-names")
  @NotNull
  public List<String> getProjectedFieldNames() {
    return projectedFieldNames;
  }

  @JsonProperty("projected-field-names")
  public void setProjectedFieldNames(List<String> projectedFieldNames) {
    this.projectedFieldNames = projectedFieldNames;
  }

  public ScanReport addProjectedFieldNamesItem(String projectedFieldNamesItem) {
    if (this.projectedFieldNames == null) {
      this.projectedFieldNames = new ArrayList<>();
    }

    this.projectedFieldNames.add(projectedFieldNamesItem);
    return this;
  }

  public ScanReport removeProjectedFieldNamesItem(String projectedFieldNamesItem) {
    if (projectedFieldNamesItem != null && this.projectedFieldNames != null) {
      this.projectedFieldNames.remove(projectedFieldNamesItem);
    }

    return this;
  }
  /**
   **/
  public ScanReport metrics(Map<String, MetricResult> metrics) {
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

  public ScanReport putMetricsItem(String key, MetricResult metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }

    this.metrics.put(key, metricsItem);
    return this;
  }

  public ScanReport removeMetricsItem(MetricResult metricsItem) {
    if (metricsItem != null && this.metrics != null) {
      this.metrics.remove(metricsItem);
    }

    return this;
  }
  /**
   **/
  public ScanReport metadata(Map<String, String> metadata) {
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

  public ScanReport putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }

    this.metadata.put(key, metadataItem);
    return this;
  }

  public ScanReport removeMetadataItem(String metadataItem) {
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
    ScanReport scanReport = (ScanReport) o;
    return Objects.equals(this.tableName, scanReport.tableName) &&
        Objects.equals(this.snapshotId, scanReport.snapshotId) &&
        Objects.equals(this.filter, scanReport.filter) &&
        Objects.equals(this.schemaId, scanReport.schemaId) &&
        Objects.equals(this.projectedFieldIds, scanReport.projectedFieldIds) &&
        Objects.equals(this.projectedFieldNames, scanReport.projectedFieldNames) &&
        Objects.equals(this.metrics, scanReport.metrics) &&
        Objects.equals(this.metadata, scanReport.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName, snapshotId, filter, schemaId, projectedFieldIds, projectedFieldNames, metrics, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanReport {\n");
    
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    projectedFieldIds: ").append(toIndentedString(projectedFieldIds)).append("\n");
    sb.append("    projectedFieldNames: ").append(toIndentedString(projectedFieldNames)).append("\n");
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

