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



@JsonTypeName("SetDefaultSortOrderUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SetDefaultSortOrderUpdate   {
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
  private @Valid Integer sortOrderId;

  /**
   **/
  public SetDefaultSortOrderUpdate action(ActionEnum action) {
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
   * Sort order ID to set as the default, or -1 to set last added sort order
   **/
  public SetDefaultSortOrderUpdate sortOrderId(Integer sortOrderId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDefaultSortOrderUpdate setDefaultSortOrderUpdate = (SetDefaultSortOrderUpdate) o;
    return Objects.equals(this.action, setDefaultSortOrderUpdate.action) &&
        Objects.equals(this.sortOrderId, setDefaultSortOrderUpdate.sortOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, sortOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDefaultSortOrderUpdate {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    sortOrderId: ").append(toIndentedString(sortOrderId)).append("\n");
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

