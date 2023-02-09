package org.openapitools.model;

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

/**
 * Assertions from the client that must be valid for the commit to succeed. Assertions are identified by &#x60;type&#x60; - - &#x60;assert-create&#x60; - the table must not already exist; used for create transactions - &#x60;assert-table-uuid&#x60; - the table UUID must match the requirement&#39;s &#x60;uuid&#x60; - &#x60;assert-ref-snapshot-id&#x60; - the table branch or tag identified by the requirement&#39;s &#x60;ref&#x60; must reference the requirement&#39;s &#x60;snapshot-id&#x60;; if &#x60;snapshot-id&#x60; is &#x60;null&#x60; or missing, the ref must not already exist - &#x60;assert-last-assigned-field-id&#x60; - the table&#39;s last assigned column id must match the requirement&#39;s &#x60;last-assigned-field-id&#x60; - &#x60;assert-current-schema-id&#x60; - the table&#39;s current schema id must match the requirement&#39;s &#x60;current-schema-id&#x60; - &#x60;assert-last-assigned-partition-id&#x60; - the table&#39;s last assigned partition id must match the requirement&#39;s &#x60;last-assigned-partition-id&#x60; - &#x60;assert-default-spec-id&#x60; - the table&#39;s default spec id must match the requirement&#39;s &#x60;default-spec-id&#x60; - &#x60;assert-default-sort-order-id&#x60; - the table&#39;s default sort order id must match the requirement&#39;s &#x60;default-sort-order-id&#x60;
 **/
@ApiModel(description = "Assertions from the client that must be valid for the commit to succeed. Assertions are identified by `type` - - `assert-create` - the table must not already exist; used for create transactions - `assert-table-uuid` - the table UUID must match the requirement's `uuid` - `assert-ref-snapshot-id` - the table branch or tag identified by the requirement's `ref` must reference the requirement's `snapshot-id`; if `snapshot-id` is `null` or missing, the ref must not already exist - `assert-last-assigned-field-id` - the table's last assigned column id must match the requirement's `last-assigned-field-id` - `assert-current-schema-id` - the table's current schema id must match the requirement's `current-schema-id` - `assert-last-assigned-partition-id` - the table's last assigned partition id must match the requirement's `last-assigned-partition-id` - `assert-default-spec-id` - the table's default spec id must match the requirement's `default-spec-id` - `assert-default-sort-order-id` - the table's default sort order id must match the requirement's `default-sort-order-id`")
@JsonTypeName("TableRequirement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class TableRequirement   {
  public enum RequirementEnum {

    CREATE(String.valueOf("assert-create")), TABLE_UUID(String.valueOf("assert-table-uuid")), REF_SNAPSHOT_ID(String.valueOf("assert-ref-snapshot-id")), LAST_ASSIGNED_FIELD_ID(String.valueOf("assert-last-assigned-field-id")), CURRENT_SCHEMA_ID(String.valueOf("assert-current-schema-id")), LAST_ASSIGNED_PARTITION_ID(String.valueOf("assert-last-assigned-partition-id")), DEFAULT_SPEC_ID(String.valueOf("assert-default-spec-id")), DEFAULT_SORT_ORDER_ID(String.valueOf("assert-default-sort-order-id"));


    private String value;

    RequirementEnum (String v) {
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
	public static RequirementEnum fromString(String s) {
        for (RequirementEnum b : RequirementEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static RequirementEnum fromValue(String value) {
        for (RequirementEnum b : RequirementEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid RequirementEnum requirement;
  private @Valid String ref;
  private @Valid String uuid;
  private @Valid Long snapshotId;
  private @Valid Integer lastAssignedFieldId;
  private @Valid Integer currentSchemaId;
  private @Valid Integer lastAssignedPartitionId;
  private @Valid Integer defaultSpecId;
  private @Valid Integer defaultSortOrderId;

  /**
   **/
  public TableRequirement requirement(RequirementEnum requirement) {
    this.requirement = requirement;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("requirement")
  @NotNull
  public RequirementEnum getRequirement() {
    return requirement;
  }

  @JsonProperty("requirement")
  public void setRequirement(RequirementEnum requirement) {
    this.requirement = requirement;
  }

  /**
   **/
  public TableRequirement ref(String ref) {
    this.ref = ref;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ref")
  public String getRef() {
    return ref;
  }

  @JsonProperty("ref")
  public void setRef(String ref) {
    this.ref = ref;
  }

  /**
   **/
  public TableRequirement uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }

  @JsonProperty("uuid")
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  public TableRequirement snapshotId(Long snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("snapshot-id")
  public Long getSnapshotId() {
    return snapshotId;
  }

  @JsonProperty("snapshot-id")
  public void setSnapshotId(Long snapshotId) {
    this.snapshotId = snapshotId;
  }

  /**
   **/
  public TableRequirement lastAssignedFieldId(Integer lastAssignedFieldId) {
    this.lastAssignedFieldId = lastAssignedFieldId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("last-assigned-field-id")
  public Integer getLastAssignedFieldId() {
    return lastAssignedFieldId;
  }

  @JsonProperty("last-assigned-field-id")
  public void setLastAssignedFieldId(Integer lastAssignedFieldId) {
    this.lastAssignedFieldId = lastAssignedFieldId;
  }

  /**
   **/
  public TableRequirement currentSchemaId(Integer currentSchemaId) {
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
  public TableRequirement lastAssignedPartitionId(Integer lastAssignedPartitionId) {
    this.lastAssignedPartitionId = lastAssignedPartitionId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("last-assigned-partition-id")
  public Integer getLastAssignedPartitionId() {
    return lastAssignedPartitionId;
  }

  @JsonProperty("last-assigned-partition-id")
  public void setLastAssignedPartitionId(Integer lastAssignedPartitionId) {
    this.lastAssignedPartitionId = lastAssignedPartitionId;
  }

  /**
   **/
  public TableRequirement defaultSpecId(Integer defaultSpecId) {
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
  public TableRequirement defaultSortOrderId(Integer defaultSortOrderId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRequirement tableRequirement = (TableRequirement) o;
    return Objects.equals(this.requirement, tableRequirement.requirement) &&
        Objects.equals(this.ref, tableRequirement.ref) &&
        Objects.equals(this.uuid, tableRequirement.uuid) &&
        Objects.equals(this.snapshotId, tableRequirement.snapshotId) &&
        Objects.equals(this.lastAssignedFieldId, tableRequirement.lastAssignedFieldId) &&
        Objects.equals(this.currentSchemaId, tableRequirement.currentSchemaId) &&
        Objects.equals(this.lastAssignedPartitionId, tableRequirement.lastAssignedPartitionId) &&
        Objects.equals(this.defaultSpecId, tableRequirement.defaultSpecId) &&
        Objects.equals(this.defaultSortOrderId, tableRequirement.defaultSortOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirement, ref, uuid, snapshotId, lastAssignedFieldId, currentSchemaId, lastAssignedPartitionId, defaultSpecId, defaultSortOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRequirement {\n");
    
    sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    lastAssignedFieldId: ").append(toIndentedString(lastAssignedFieldId)).append("\n");
    sb.append("    currentSchemaId: ").append(toIndentedString(currentSchemaId)).append("\n");
    sb.append("    lastAssignedPartitionId: ").append(toIndentedString(lastAssignedPartitionId)).append("\n");
    sb.append("    defaultSpecId: ").append(toIndentedString(defaultSpecId)).append("\n");
    sb.append("    defaultSortOrderId: ").append(toIndentedString(defaultSortOrderId)).append("\n");
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

