package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AddPartitionSpecUpdate;
import org.openapitools.model.AddSchemaUpdate;
import org.openapitools.model.AddSnapshotUpdate;
import org.openapitools.model.AddSortOrderUpdate;
import org.openapitools.model.PartitionSpec;
import org.openapitools.model.RemovePropertiesUpdate;
import org.openapitools.model.RemoveSnapshotRefUpdate;
import org.openapitools.model.RemoveSnapshotsUpdate;
import org.openapitools.model.Schema;
import org.openapitools.model.SetCurrentSchemaUpdate;
import org.openapitools.model.SetDefaultSortOrderUpdate;
import org.openapitools.model.SetDefaultSpecUpdate;
import org.openapitools.model.SetLocationUpdate;
import org.openapitools.model.SetPropertiesUpdate;
import org.openapitools.model.SetSnapshotRefUpdate;
import org.openapitools.model.Snapshot;
import org.openapitools.model.SortOrder;
import org.openapitools.model.UpgradeFormatVersionUpdate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TableUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class TableUpdate   {
  public enum ActionEnum {

    UPGRADE_FORMAT_VERSION(String.valueOf("upgrade-format-version")), ADD_SCHEMA(String.valueOf("add-schema")), SET_CURRENT_SCHEMA(String.valueOf("set-current-schema")), ADD_SPEC(String.valueOf("add-spec")), SET_DEFAULT_SPEC(String.valueOf("set-default-spec")), ADD_SORT_ORDER(String.valueOf("add-sort-order")), SET_DEFAULT_SORT_ORDER(String.valueOf("set-default-sort-order")), ADD_SNAPSHOT(String.valueOf("add-snapshot")), SET_SNAPSHOT_REF(String.valueOf("set-snapshot-ref")), REMOVE_SNAPSHOTS(String.valueOf("remove-snapshots")), REMOVE_SNAPSHOT_REF(String.valueOf("remove-snapshot-ref")), SET_LOCATION(String.valueOf("set-location")), SET_PROPERTIES(String.valueOf("set-properties")), REMOVE_PROPERTIES(String.valueOf("remove-properties"));


    private String value;

    ActionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static ActionEnum fromString(String s) {
        for (ActionEnum b : ActionEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static ActionEnum fromValue(String value) {
        for (ActionEnum b : ActionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid ActionEnum action;
  private @Valid Integer formatVersion;
  private @Valid Schema schema;
  private @Valid Integer schemaId;
  private @Valid PartitionSpec spec;
  private @Valid Integer specId;
  private @Valid SortOrder sortOrder;
  private @Valid Integer sortOrderId;
  private @Valid Snapshot snapshot;
  public enum TypeEnum {

    TAG(String.valueOf("tag")), BRANCH(String.valueOf("branch"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid TypeEnum type;
  private @Valid Long snapshotId;
  private @Valid Long maxRefAgeMs;
  private @Valid Long maxSnapshotAgeMs;
  private @Valid Integer minSnapshotsToKeep;
  private @Valid String refName;
  private @Valid List<Long> snapshotIds = new ArrayList<>();
  private @Valid String location;
  private @Valid Map<String, String> updates = new HashMap<>();
  private @Valid List<String> removals = new ArrayList<>();

  /**
   **/
  public TableUpdate action(ActionEnum action) {
    this.action = action;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("action")
  @NotNull
  public ActionEnum getAction() {
    return action;
  }

  @JsonProperty("action")
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  /**
   **/
  public TableUpdate formatVersion(Integer formatVersion) {
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

  /**
   **/
  public TableUpdate schema(Schema schema) {
    this.schema = schema;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("schema")
  @NotNull
  public Schema getSchema() {
    return schema;
  }

  @JsonProperty("schema")
  public void setSchema(Schema schema) {
    this.schema = schema;
  }

  /**
   * Schema ID to set as current, or -1 to set last added schema
   **/
  public TableUpdate schemaId(Integer schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Schema ID to set as current, or -1 to set last added schema")
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
  public TableUpdate spec(PartitionSpec spec) {
    this.spec = spec;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("spec")
  @NotNull
  public PartitionSpec getSpec() {
    return spec;
  }

  @JsonProperty("spec")
  public void setSpec(PartitionSpec spec) {
    this.spec = spec;
  }

  /**
   * Partition spec ID to set as the default, or -1 to set last added spec
   **/
  public TableUpdate specId(Integer specId) {
    this.specId = specId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Partition spec ID to set as the default, or -1 to set last added spec")
  @JsonProperty("spec-id")
  @NotNull
  public Integer getSpecId() {
    return specId;
  }

  @JsonProperty("spec-id")
  public void setSpecId(Integer specId) {
    this.specId = specId;
  }

  /**
   **/
  public TableUpdate sortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sort-order")
  @NotNull
  public SortOrder getSortOrder() {
    return sortOrder;
  }

  @JsonProperty("sort-order")
  public void setSortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }

  /**
   * Sort order ID to set as the default, or -1 to set last added sort order
   **/
  public TableUpdate sortOrderId(Integer sortOrderId) {
    this.sortOrderId = sortOrderId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Sort order ID to set as the default, or -1 to set last added sort order")
  @JsonProperty("sort-order-id")
  @NotNull
  public Integer getSortOrderId() {
    return sortOrderId;
  }

  @JsonProperty("sort-order-id")
  public void setSortOrderId(Integer sortOrderId) {
    this.sortOrderId = sortOrderId;
  }

  /**
   **/
  public TableUpdate snapshot(Snapshot snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("snapshot")
  @NotNull
  public Snapshot getSnapshot() {
    return snapshot;
  }

  @JsonProperty("snapshot")
  public void setSnapshot(Snapshot snapshot) {
    this.snapshot = snapshot;
  }

  /**
   **/
  public TableUpdate type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public TableUpdate snapshotId(Long snapshotId) {
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
  public TableUpdate maxRefAgeMs(Long maxRefAgeMs) {
    this.maxRefAgeMs = maxRefAgeMs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max-ref-age-ms")
  public Long getMaxRefAgeMs() {
    return maxRefAgeMs;
  }

  @JsonProperty("max-ref-age-ms")
  public void setMaxRefAgeMs(Long maxRefAgeMs) {
    this.maxRefAgeMs = maxRefAgeMs;
  }

  /**
   **/
  public TableUpdate maxSnapshotAgeMs(Long maxSnapshotAgeMs) {
    this.maxSnapshotAgeMs = maxSnapshotAgeMs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max-snapshot-age-ms")
  public Long getMaxSnapshotAgeMs() {
    return maxSnapshotAgeMs;
  }

  @JsonProperty("max-snapshot-age-ms")
  public void setMaxSnapshotAgeMs(Long maxSnapshotAgeMs) {
    this.maxSnapshotAgeMs = maxSnapshotAgeMs;
  }

  /**
   **/
  public TableUpdate minSnapshotsToKeep(Integer minSnapshotsToKeep) {
    this.minSnapshotsToKeep = minSnapshotsToKeep;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("min-snapshots-to-keep")
  public Integer getMinSnapshotsToKeep() {
    return minSnapshotsToKeep;
  }

  @JsonProperty("min-snapshots-to-keep")
  public void setMinSnapshotsToKeep(Integer minSnapshotsToKeep) {
    this.minSnapshotsToKeep = minSnapshotsToKeep;
  }

  /**
   **/
  public TableUpdate refName(String refName) {
    this.refName = refName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ref-name")
  @NotNull
  public String getRefName() {
    return refName;
  }

  @JsonProperty("ref-name")
  public void setRefName(String refName) {
    this.refName = refName;
  }

  /**
   **/
  public TableUpdate snapshotIds(List<Long> snapshotIds) {
    this.snapshotIds = snapshotIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("snapshot-ids")
  @NotNull
  public List<Long> getSnapshotIds() {
    return snapshotIds;
  }

  @JsonProperty("snapshot-ids")
  public void setSnapshotIds(List<Long> snapshotIds) {
    this.snapshotIds = snapshotIds;
  }

  public TableUpdate addSnapshotIdsItem(Long snapshotIdsItem) {
    if (this.snapshotIds == null) {
      this.snapshotIds = new ArrayList<>();
    }

    this.snapshotIds.add(snapshotIdsItem);
    return this;
  }

  public TableUpdate removeSnapshotIdsItem(Long snapshotIdsItem) {
    if (snapshotIdsItem != null && this.snapshotIds != null) {
      this.snapshotIds.remove(snapshotIdsItem);
    }

    return this;
  }
  /**
   **/
  public TableUpdate location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("location")
  @NotNull
  public String getLocation() {
    return location;
  }

  @JsonProperty("location")
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   **/
  public TableUpdate updates(Map<String, String> updates) {
    this.updates = updates;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("updates")
  @NotNull
  public Map<String, String> getUpdates() {
    return updates;
  }

  @JsonProperty("updates")
  public void setUpdates(Map<String, String> updates) {
    this.updates = updates;
  }

  public TableUpdate putUpdatesItem(String key, String updatesItem) {
    if (this.updates == null) {
      this.updates = new HashMap<>();
    }

    this.updates.put(key, updatesItem);
    return this;
  }

  public TableUpdate removeUpdatesItem(String updatesItem) {
    if (updatesItem != null && this.updates != null) {
      this.updates.remove(updatesItem);
    }

    return this;
  }
  /**
   **/
  public TableUpdate removals(List<String> removals) {
    this.removals = removals;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("removals")
  @NotNull
  public List<String> getRemovals() {
    return removals;
  }

  @JsonProperty("removals")
  public void setRemovals(List<String> removals) {
    this.removals = removals;
  }

  public TableUpdate addRemovalsItem(String removalsItem) {
    if (this.removals == null) {
      this.removals = new ArrayList<>();
    }

    this.removals.add(removalsItem);
    return this;
  }

  public TableUpdate removeRemovalsItem(String removalsItem) {
    if (removalsItem != null && this.removals != null) {
      this.removals.remove(removalsItem);
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
    TableUpdate tableUpdate = (TableUpdate) o;
    return Objects.equals(this.action, tableUpdate.action) &&
        Objects.equals(this.formatVersion, tableUpdate.formatVersion) &&
        Objects.equals(this.schema, tableUpdate.schema) &&
        Objects.equals(this.schemaId, tableUpdate.schemaId) &&
        Objects.equals(this.spec, tableUpdate.spec) &&
        Objects.equals(this.specId, tableUpdate.specId) &&
        Objects.equals(this.sortOrder, tableUpdate.sortOrder) &&
        Objects.equals(this.sortOrderId, tableUpdate.sortOrderId) &&
        Objects.equals(this.snapshot, tableUpdate.snapshot) &&
        Objects.equals(this.type, tableUpdate.type) &&
        Objects.equals(this.snapshotId, tableUpdate.snapshotId) &&
        Objects.equals(this.maxRefAgeMs, tableUpdate.maxRefAgeMs) &&
        Objects.equals(this.maxSnapshotAgeMs, tableUpdate.maxSnapshotAgeMs) &&
        Objects.equals(this.minSnapshotsToKeep, tableUpdate.minSnapshotsToKeep) &&
        Objects.equals(this.refName, tableUpdate.refName) &&
        Objects.equals(this.snapshotIds, tableUpdate.snapshotIds) &&
        Objects.equals(this.location, tableUpdate.location) &&
        Objects.equals(this.updates, tableUpdate.updates) &&
        Objects.equals(this.removals, tableUpdate.removals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, formatVersion, schema, schemaId, spec, specId, sortOrder, sortOrderId, snapshot, type, snapshotId, maxRefAgeMs, maxSnapshotAgeMs, minSnapshotsToKeep, refName, snapshotIds, location, updates, removals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableUpdate {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    specId: ").append(toIndentedString(specId)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortOrderId: ").append(toIndentedString(sortOrderId)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    maxRefAgeMs: ").append(toIndentedString(maxRefAgeMs)).append("\n");
    sb.append("    maxSnapshotAgeMs: ").append(toIndentedString(maxSnapshotAgeMs)).append("\n");
    sb.append("    minSnapshotsToKeep: ").append(toIndentedString(minSnapshotsToKeep)).append("\n");
    sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
    sb.append("    snapshotIds: ").append(toIndentedString(snapshotIds)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
    sb.append("    removals: ").append(toIndentedString(removals)).append("\n");
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

