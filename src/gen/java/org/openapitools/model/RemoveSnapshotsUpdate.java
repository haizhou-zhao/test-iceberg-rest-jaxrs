package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("RemoveSnapshotsUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class RemoveSnapshotsUpdate   {
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
  private @Valid List<Long> snapshotIds = new ArrayList<>();

  /**
   **/
  public RemoveSnapshotsUpdate action(ActionEnum action) {
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
  public RemoveSnapshotsUpdate snapshotIds(List<Long> snapshotIds) {
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

  public RemoveSnapshotsUpdate addSnapshotIdsItem(Long snapshotIdsItem) {
    if (this.snapshotIds == null) {
      this.snapshotIds = new ArrayList<>();
    }

    this.snapshotIds.add(snapshotIdsItem);
    return this;
  }

  public RemoveSnapshotsUpdate removeSnapshotIdsItem(Long snapshotIdsItem) {
    if (snapshotIdsItem != null && this.snapshotIds != null) {
      this.snapshotIds.remove(snapshotIdsItem);
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
    RemoveSnapshotsUpdate removeSnapshotsUpdate = (RemoveSnapshotsUpdate) o;
    return Objects.equals(this.action, removeSnapshotsUpdate.action) &&
        Objects.equals(this.snapshotIds, removeSnapshotsUpdate.snapshotIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, snapshotIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveSnapshotsUpdate {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    snapshotIds: ").append(toIndentedString(snapshotIds)).append("\n");
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

