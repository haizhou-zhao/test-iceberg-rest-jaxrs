/*
 * Apache Iceberg REST Catalog API
 * Defines the specification for the first version of the REST Catalog API. Implementations should ideally support both Iceberg table specs v1 and v2, with priority given to v2.
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Snapshot;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * AddSnapshotUpdate
 */
@JsonPropertyOrder({
  AddSnapshotUpdate.JSON_PROPERTY_ACTION,
  AddSnapshotUpdate.JSON_PROPERTY_SNAPSHOT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-02-09T17:36:38.183060-08:00[America/Los_Angeles]")
public class AddSnapshotUpdate   {
  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    UPGRADE_FORMAT_VERSION("upgrade-format-version"),
    
    ADD_SCHEMA("add-schema"),
    
    SET_CURRENT_SCHEMA("set-current-schema"),
    
    ADD_SPEC("add-spec"),
    
    SET_DEFAULT_SPEC("set-default-spec"),
    
    ADD_SORT_ORDER("add-sort-order"),
    
    SET_DEFAULT_SORT_ORDER("set-default-sort-order"),
    
    ADD_SNAPSHOT("add-snapshot"),
    
    SET_SNAPSHOT_REF("set-snapshot-ref"),
    
    REMOVE_SNAPSHOTS("remove-snapshots"),
    
    REMOVE_SNAPSHOT_REF("remove-snapshot-ref"),
    
    SET_LOCATION("set-location"),
    
    SET_PROPERTIES("set-properties"),
    
    REMOVE_PROPERTIES("remove-properties");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  public static final String JSON_PROPERTY_ACTION = "action";
  @JsonProperty(JSON_PROPERTY_ACTION)
  private ActionEnum action;

  public static final String JSON_PROPERTY_SNAPSHOT = "snapshot";
  @JsonProperty(JSON_PROPERTY_SNAPSHOT)
  private Snapshot snapshot;

  public AddSnapshotUpdate action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   **/
  @JsonProperty(value = "action")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public AddSnapshotUpdate snapshot(Snapshot snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  /**
   * Get snapshot
   * @return snapshot
   **/
  @JsonProperty(value = "snapshot")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public Snapshot getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(Snapshot snapshot) {
    this.snapshot = snapshot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddSnapshotUpdate addSnapshotUpdate = (AddSnapshotUpdate) o;
    return Objects.equals(this.action, addSnapshotUpdate.action) &&
        Objects.equals(this.snapshot, addSnapshotUpdate.snapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, snapshot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSnapshotUpdate {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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

