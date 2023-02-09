package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.CommitReport;
import org.openapitools.model.Expression;
import org.openapitools.model.MetricResult;
import org.openapitools.model.ScanReport;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ReportMetricsRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class ReportMetricsRequest   {
  private @Valid String reportType;
  private @Valid String tableName;
  private @Valid Long snapshotId;
  private @Valid Expression filter;
  private @Valid Integer schemaId;
  private @Valid List<Integer> projectedFieldIds = new ArrayList<>();
  private @Valid List<String> projectedFieldNames = new ArrayList<>();
  private @Valid Map<String, MetricResult> metrics = new HashMap<>();
  private @Valid Map<String, String> metadata = null;
  private @Valid Long sequenceNumber;
  private @Valid String operation;

  /**
   **/
  public ReportMetricsRequest reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("report-type")
  @NotNull
  public String getReportType() {
    return reportType;
  }

  @JsonProperty("report-type")
  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  /**
   **/
  public ReportMetricsRequest tableName(String tableName) {
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
  public ReportMetricsRequest snapshotId(Long snapshotId) {
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
  public ReportMetricsRequest filter(Expression filter) {
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
  public ReportMetricsRequest schemaId(Integer schemaId) {
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
  public ReportMetricsRequest projectedFieldIds(List<Integer> projectedFieldIds) {
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

  public ReportMetricsRequest addProjectedFieldIdsItem(Integer projectedFieldIdsItem) {
    if (this.projectedFieldIds == null) {
      this.projectedFieldIds = new ArrayList<>();
    }

    this.projectedFieldIds.add(projectedFieldIdsItem);
    return this;
  }

  public ReportMetricsRequest removeProjectedFieldIdsItem(Integer projectedFieldIdsItem) {
    if (projectedFieldIdsItem != null && this.projectedFieldIds != null) {
      this.projectedFieldIds.remove(projectedFieldIdsItem);
    }

    return this;
  }
  /**
   **/
  public ReportMetricsRequest projectedFieldNames(List<String> projectedFieldNames) {
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

  public ReportMetricsRequest addProjectedFieldNamesItem(String projectedFieldNamesItem) {
    if (this.projectedFieldNames == null) {
      this.projectedFieldNames = new ArrayList<>();
    }

    this.projectedFieldNames.add(projectedFieldNamesItem);
    return this;
  }

  public ReportMetricsRequest removeProjectedFieldNamesItem(String projectedFieldNamesItem) {
    if (projectedFieldNamesItem != null && this.projectedFieldNames != null) {
      this.projectedFieldNames.remove(projectedFieldNamesItem);
    }

    return this;
  }
  /**
   **/
  public ReportMetricsRequest metrics(Map<String, MetricResult> metrics) {
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

  public ReportMetricsRequest putMetricsItem(String key, MetricResult metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }

    this.metrics.put(key, metricsItem);
    return this;
  }

  public ReportMetricsRequest removeMetricsItem(MetricResult metricsItem) {
    if (metricsItem != null && this.metrics != null) {
      this.metrics.remove(metricsItem);
    }

    return this;
  }
  /**
   **/
  public ReportMetricsRequest metadata(Map<String, String> metadata) {
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

  public ReportMetricsRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }

    this.metadata.put(key, metadataItem);
    return this;
  }

  public ReportMetricsRequest removeMetadataItem(String metadataItem) {
    if (metadataItem != null && this.metadata != null) {
      this.metadata.remove(metadataItem);
    }

    return this;
  }
  /**
   **/
  public ReportMetricsRequest sequenceNumber(Long sequenceNumber) {
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
  public ReportMetricsRequest operation(String operation) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportMetricsRequest reportMetricsRequest = (ReportMetricsRequest) o;
    return Objects.equals(this.reportType, reportMetricsRequest.reportType) &&
        Objects.equals(this.tableName, reportMetricsRequest.tableName) &&
        Objects.equals(this.snapshotId, reportMetricsRequest.snapshotId) &&
        Objects.equals(this.filter, reportMetricsRequest.filter) &&
        Objects.equals(this.schemaId, reportMetricsRequest.schemaId) &&
        Objects.equals(this.projectedFieldIds, reportMetricsRequest.projectedFieldIds) &&
        Objects.equals(this.projectedFieldNames, reportMetricsRequest.projectedFieldNames) &&
        Objects.equals(this.metrics, reportMetricsRequest.metrics) &&
        Objects.equals(this.metadata, reportMetricsRequest.metadata) &&
        Objects.equals(this.sequenceNumber, reportMetricsRequest.sequenceNumber) &&
        Objects.equals(this.operation, reportMetricsRequest.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, tableName, snapshotId, filter, schemaId, projectedFieldIds, projectedFieldNames, metrics, metadata, sequenceNumber, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportMetricsRequest {\n");
    
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    projectedFieldIds: ").append(toIndentedString(projectedFieldIds)).append("\n");
    sb.append("    projectedFieldNames: ").append(toIndentedString(projectedFieldNames)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

