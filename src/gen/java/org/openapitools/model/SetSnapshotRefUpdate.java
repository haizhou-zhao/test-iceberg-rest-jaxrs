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



@JsonTypeName("SetSnapshotRefUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SetSnapshotRefUpdate   {
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

  /**
   **/
  public SetSnapshotRefUpdate action(ActionEnum action) {
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
  public SetSnapshotRefUpdate type(TypeEnum type) {
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
  public SetSnapshotRefUpdate snapshotId(Long snapshotId) {
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
  public SetSnapshotRefUpdate maxRefAgeMs(Long maxRefAgeMs) {
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
  public SetSnapshotRefUpdate maxSnapshotAgeMs(Long maxSnapshotAgeMs) {
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
  public SetSnapshotRefUpdate minSnapshotsToKeep(Integer minSnapshotsToKeep) {
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
  public SetSnapshotRefUpdate refName(String refName) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetSnapshotRefUpdate setSnapshotRefUpdate = (SetSnapshotRefUpdate) o;
    return Objects.equals(this.action, setSnapshotRefUpdate.action) &&
        Objects.equals(this.type, setSnapshotRefUpdate.type) &&
        Objects.equals(this.snapshotId, setSnapshotRefUpdate.snapshotId) &&
        Objects.equals(this.maxRefAgeMs, setSnapshotRefUpdate.maxRefAgeMs) &&
        Objects.equals(this.maxSnapshotAgeMs, setSnapshotRefUpdate.maxSnapshotAgeMs) &&
        Objects.equals(this.minSnapshotsToKeep, setSnapshotRefUpdate.minSnapshotsToKeep) &&
        Objects.equals(this.refName, setSnapshotRefUpdate.refName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, type, snapshotId, maxRefAgeMs, maxSnapshotAgeMs, minSnapshotsToKeep, refName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetSnapshotRefUpdate {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    maxRefAgeMs: ").append(toIndentedString(maxRefAgeMs)).append("\n");
    sb.append("    maxSnapshotAgeMs: ").append(toIndentedString(maxSnapshotAgeMs)).append("\n");
    sb.append("    minSnapshotsToKeep: ").append(toIndentedString(minSnapshotsToKeep)).append("\n");
    sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
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

