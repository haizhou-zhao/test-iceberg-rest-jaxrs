package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.MetadataLogInner;
import org.openapitools.model.PartitionSpec;
import org.openapitools.model.Schema;
import org.openapitools.model.Snapshot;
import org.openapitools.model.SnapshotLogInner;
import org.openapitools.model.SnapshotReference;
import org.openapitools.model.SortOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TableMetadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class TableMetadata   {
  private @Valid Integer formatVersion;
  private @Valid String tableUuid;
  private @Valid String location;
  private @Valid Integer lastUpdatedMs;
  private @Valid Map<String, String> properties = null;
  private @Valid List<Schema> schemas = null;
  private @Valid Integer currentSchemaId;
  private @Valid Integer lastColumnId;
  private @Valid List<PartitionSpec> partitionSpecs = null;
  private @Valid Integer defaultSpecId;
  private @Valid Integer lastPartitionId;
  private @Valid List<SortOrder> sortOrders = null;
  private @Valid Integer defaultSortOrderId;
  private @Valid List<Snapshot> snapshots = null;
  private @Valid Map<String, SnapshotReference> refs = null;
  private @Valid Integer currentSnapshotId;
  private @Valid List<SnapshotLogInner> snapshotLog = null;
  private @Valid List<MetadataLogInner> metadataLog = null;

  /**
   * minimum: 1
   * maximum: 2
   **/
  public TableMetadata formatVersion(Integer formatVersion) {
    this.formatVersion = formatVersion;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("format-version")
  @NotNull
 @Min(1) @Max(2)  public Integer getFormatVersion() {
    return formatVersion;
  }

  @JsonProperty("format-version")
  public void setFormatVersion(Integer formatVersion) {
    this.formatVersion = formatVersion;
  }

  /**
   **/
  public TableMetadata tableUuid(String tableUuid) {
    this.tableUuid = tableUuid;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("table-uuid")
  @NotNull
  public String getTableUuid() {
    return tableUuid;
  }

  @JsonProperty("table-uuid")
  public void setTableUuid(String tableUuid) {
    this.tableUuid = tableUuid;
  }

  /**
   **/
  public TableMetadata location(String location) {
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
  public TableMetadata lastUpdatedMs(Integer lastUpdatedMs) {
    this.lastUpdatedMs = lastUpdatedMs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("last-updated-ms")
  public Integer getLastUpdatedMs() {
    return lastUpdatedMs;
  }

  @JsonProperty("last-updated-ms")
  public void setLastUpdatedMs(Integer lastUpdatedMs) {
    this.lastUpdatedMs = lastUpdatedMs;
  }

  /**
   **/
  public TableMetadata properties(Map<String, String> properties) {
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

  public TableMetadata putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }

    this.properties.put(key, propertiesItem);
    return this;
  }

  public TableMetadata removePropertiesItem(String propertiesItem) {
    if (propertiesItem != null && this.properties != null) {
      this.properties.remove(propertiesItem);
    }

    return this;
  }
  /**
   **/
  public TableMetadata schemas(List<Schema> schemas) {
    this.schemas = schemas;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("schemas")
  public List<Schema> getSchemas() {
    return schemas;
  }

  @JsonProperty("schemas")
  public void setSchemas(List<Schema> schemas) {
    this.schemas = schemas;
  }

  public TableMetadata addSchemasItem(Schema schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<>();
    }

    this.schemas.add(schemasItem);
    return this;
  }

  public TableMetadata removeSchemasItem(Schema schemasItem) {
    if (schemasItem != null && this.schemas != null) {
      this.schemas.remove(schemasItem);
    }

    return this;
  }
  /**
   **/
  public TableMetadata currentSchemaId(Integer currentSchemaId) {
    this.currentSchemaId = currentSchemaId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("current-schema-id")
  public Integer getCurrentSchemaId() {
    return currentSchemaId;
  }

  @JsonProperty("current-schema-id")
  public void setCurrentSchemaId(Integer currentSchemaId) {
    this.currentSchemaId = currentSchemaId;
  }

  /**
   **/
  public TableMetadata lastColumnId(Integer lastColumnId) {
    this.lastColumnId = lastColumnId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("last-column-id")
  public Integer getLastColumnId() {
    return lastColumnId;
  }

  @JsonProperty("last-column-id")
  public void setLastColumnId(Integer lastColumnId) {
    this.lastColumnId = lastColumnId;
  }

  /**
   **/
  public TableMetadata partitionSpecs(List<PartitionSpec> partitionSpecs) {
    this.partitionSpecs = partitionSpecs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partition-specs")
  public List<PartitionSpec> getPartitionSpecs() {
    return partitionSpecs;
  }

  @JsonProperty("partition-specs")
  public void setPartitionSpecs(List<PartitionSpec> partitionSpecs) {
    this.partitionSpecs = partitionSpecs;
  }

  public TableMetadata addPartitionSpecsItem(PartitionSpec partitionSpecsItem) {
    if (this.partitionSpecs == null) {
      this.partitionSpecs = new ArrayList<>();
    }

    this.partitionSpecs.add(partitionSpecsItem);
    return this;
  }

  public TableMetadata removePartitionSpecsItem(PartitionSpec partitionSpecsItem) {
    if (partitionSpecsItem != null && this.partitionSpecs != null) {
      this.partitionSpecs.remove(partitionSpecsItem);
    }

    return this;
  }
  /**
   **/
  public TableMetadata defaultSpecId(Integer defaultSpecId) {
    this.defaultSpecId = defaultSpecId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default-spec-id")
  public Integer getDefaultSpecId() {
    return defaultSpecId;
  }

  @JsonProperty("default-spec-id")
  public void setDefaultSpecId(Integer defaultSpecId) {
    this.defaultSpecId = defaultSpecId;
  }

  /**
   **/
  public TableMetadata lastPartitionId(Integer lastPartitionId) {
    this.lastPartitionId = lastPartitionId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("last-partition-id")
  public Integer getLastPartitionId() {
    return lastPartitionId;
  }

  @JsonProperty("last-partition-id")
  public void setLastPartitionId(Integer lastPartitionId) {
    this.lastPartitionId = lastPartitionId;
  }

  /**
   **/
  public TableMetadata sortOrders(List<SortOrder> sortOrders) {
    this.sortOrders = sortOrders;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sort-orders")
  public List<SortOrder> getSortOrders() {
    return sortOrders;
  }

  @JsonProperty("sort-orders")
  public void setSortOrders(List<SortOrder> sortOrders) {
    this.sortOrders = sortOrders;
  }

  public TableMetadata addSortOrdersItem(SortOrder sortOrdersItem) {
    if (this.sortOrders == null) {
      this.sortOrders = new ArrayList<>();
    }

    this.sortOrders.add(sortOrdersItem);
    return this;
  }

  public TableMetadata removeSortOrdersItem(SortOrder sortOrdersItem) {
    if (sortOrdersItem != null && this.sortOrders != null) {
      this.sortOrders.remove(sortOrdersItem);
    }

    return this;
  }
  /**
   **/
  public TableMetadata defaultSortOrderId(Integer defaultSortOrderId) {
    this.defaultSortOrderId = defaultSortOrderId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default-sort-order-id")
  public Integer getDefaultSortOrderId() {
    return defaultSortOrderId;
  }

  @JsonProperty("default-sort-order-id")
  public void setDefaultSortOrderId(Integer defaultSortOrderId) {
    this.defaultSortOrderId = defaultSortOrderId;
  }

  /**
   **/
  public TableMetadata snapshots(List<Snapshot> snapshots) {
    this.snapshots = snapshots;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("snapshots")
  public List<Snapshot> getSnapshots() {
    return snapshots;
  }

  @JsonProperty("snapshots")
  public void setSnapshots(List<Snapshot> snapshots) {
    this.snapshots = snapshots;
  }

  public TableMetadata addSnapshotsItem(Snapshot snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<>();
    }

    this.snapshots.add(snapshotsItem);
    return this;
  }

  public TableMetadata removeSnapshotsItem(Snapshot snapshotsItem) {
    if (snapshotsItem != null && this.snapshots != null) {
      this.snapshots.remove(snapshotsItem);
    }

    return this;
  }
  /**
   **/
  public TableMetadata refs(Map<String, SnapshotReference> refs) {
    this.refs = refs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("refs")
  public Map<String, SnapshotReference> getRefs() {
    return refs;
  }

  @JsonProperty("refs")
  public void setRefs(Map<String, SnapshotReference> refs) {
    this.refs = refs;
  }

  public TableMetadata putRefsItem(String key, SnapshotReference refsItem) {
    if (this.refs == null) {
      this.refs = new HashMap<>();
    }

    this.refs.put(key, refsItem);
    return this;
  }

  public TableMetadata removeRefsItem(SnapshotReference refsItem) {
    if (refsItem != null && this.refs != null) {
      this.refs.remove(refsItem);
    }

    return this;
  }
  /**
   **/
  public TableMetadata currentSnapshotId(Integer currentSnapshotId) {
    this.currentSnapshotId = currentSnapshotId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("current-snapshot-id")
  public Integer getCurrentSnapshotId() {
    return currentSnapshotId;
  }

  @JsonProperty("current-snapshot-id")
  public void setCurrentSnapshotId(Integer currentSnapshotId) {
    this.currentSnapshotId = currentSnapshotId;
  }

  /**
   **/
  public TableMetadata snapshotLog(List<SnapshotLogInner> snapshotLog) {
    this.snapshotLog = snapshotLog;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("snapshot-log")
  public List<SnapshotLogInner> getSnapshotLog() {
    return snapshotLog;
  }

  @JsonProperty("snapshot-log")
  public void setSnapshotLog(List<SnapshotLogInner> snapshotLog) {
    this.snapshotLog = snapshotLog;
  }

  public TableMetadata addSnapshotLogItem(SnapshotLogInner snapshotLogItem) {
    if (this.snapshotLog == null) {
      this.snapshotLog = new ArrayList<>();
    }

    this.snapshotLog.add(snapshotLogItem);
    return this;
  }

  public TableMetadata removeSnapshotLogItem(SnapshotLogInner snapshotLogItem) {
    if (snapshotLogItem != null && this.snapshotLog != null) {
      this.snapshotLog.remove(snapshotLogItem);
    }

    return this;
  }
  /**
   **/
  public TableMetadata metadataLog(List<MetadataLogInner> metadataLog) {
    this.metadataLog = metadataLog;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("metadata-log")
  public List<MetadataLogInner> getMetadataLog() {
    return metadataLog;
  }

  @JsonProperty("metadata-log")
  public void setMetadataLog(List<MetadataLogInner> metadataLog) {
    this.metadataLog = metadataLog;
  }

  public TableMetadata addMetadataLogItem(MetadataLogInner metadataLogItem) {
    if (this.metadataLog == null) {
      this.metadataLog = new ArrayList<>();
    }

    this.metadataLog.add(metadataLogItem);
    return this;
  }

  public TableMetadata removeMetadataLogItem(MetadataLogInner metadataLogItem) {
    if (metadataLogItem != null && this.metadataLog != null) {
      this.metadataLog.remove(metadataLogItem);
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
    TableMetadata tableMetadata = (TableMetadata) o;
    return Objects.equals(this.formatVersion, tableMetadata.formatVersion) &&
        Objects.equals(this.tableUuid, tableMetadata.tableUuid) &&
        Objects.equals(this.location, tableMetadata.location) &&
        Objects.equals(this.lastUpdatedMs, tableMetadata.lastUpdatedMs) &&
        Objects.equals(this.properties, tableMetadata.properties) &&
        Objects.equals(this.schemas, tableMetadata.schemas) &&
        Objects.equals(this.currentSchemaId, tableMetadata.currentSchemaId) &&
        Objects.equals(this.lastColumnId, tableMetadata.lastColumnId) &&
        Objects.equals(this.partitionSpecs, tableMetadata.partitionSpecs) &&
        Objects.equals(this.defaultSpecId, tableMetadata.defaultSpecId) &&
        Objects.equals(this.lastPartitionId, tableMetadata.lastPartitionId) &&
        Objects.equals(this.sortOrders, tableMetadata.sortOrders) &&
        Objects.equals(this.defaultSortOrderId, tableMetadata.defaultSortOrderId) &&
        Objects.equals(this.snapshots, tableMetadata.snapshots) &&
        Objects.equals(this.refs, tableMetadata.refs) &&
        Objects.equals(this.currentSnapshotId, tableMetadata.currentSnapshotId) &&
        Objects.equals(this.snapshotLog, tableMetadata.snapshotLog) &&
        Objects.equals(this.metadataLog, tableMetadata.metadataLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatVersion, tableUuid, location, lastUpdatedMs, properties, schemas, currentSchemaId, lastColumnId, partitionSpecs, defaultSpecId, lastPartitionId, sortOrders, defaultSortOrderId, snapshots, refs, currentSnapshotId, snapshotLog, metadataLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableMetadata {\n");
    
    sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
    sb.append("    tableUuid: ").append(toIndentedString(tableUuid)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    lastUpdatedMs: ").append(toIndentedString(lastUpdatedMs)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    currentSchemaId: ").append(toIndentedString(currentSchemaId)).append("\n");
    sb.append("    lastColumnId: ").append(toIndentedString(lastColumnId)).append("\n");
    sb.append("    partitionSpecs: ").append(toIndentedString(partitionSpecs)).append("\n");
    sb.append("    defaultSpecId: ").append(toIndentedString(defaultSpecId)).append("\n");
    sb.append("    lastPartitionId: ").append(toIndentedString(lastPartitionId)).append("\n");
    sb.append("    sortOrders: ").append(toIndentedString(sortOrders)).append("\n");
    sb.append("    defaultSortOrderId: ").append(toIndentedString(defaultSortOrderId)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
    sb.append("    refs: ").append(toIndentedString(refs)).append("\n");
    sb.append("    currentSnapshotId: ").append(toIndentedString(currentSnapshotId)).append("\n");
    sb.append("    snapshotLog: ").append(toIndentedString(snapshotLog)).append("\n");
    sb.append("    metadataLog: ").append(toIndentedString(metadataLog)).append("\n");
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

