package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("updateProperties_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class UpdateProperties200Response   {
  private @Valid Set<String> updated = new LinkedHashSet<>();
  private @Valid List<String> removed = new ArrayList<>();
  private @Valid List<String> missing = null;

  /**
   * List of property keys that were added or updated
   **/
  public UpdateProperties200Response updated(Set<String> updated) {
    this.updated = updated;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of property keys that were added or updated")
  @JsonProperty("updated")
  @NotNull
  public Set<String> getUpdated() {
    return updated;
  }

  @JsonProperty("updated")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setUpdated(Set<String> updated) {
    this.updated = updated;
  }

  public UpdateProperties200Response addUpdatedItem(String updatedItem) {
    if (this.updated == null) {
      this.updated = new LinkedHashSet<>();
    }

    this.updated.add(updatedItem);
    return this;
  }

  public UpdateProperties200Response removeUpdatedItem(String updatedItem) {
    if (updatedItem != null && this.updated != null) {
      this.updated.remove(updatedItem);
    }

    return this;
  }
  /**
   * List of properties that were removed
   **/
  public UpdateProperties200Response removed(List<String> removed) {
    this.removed = removed;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of properties that were removed")
  @JsonProperty("removed")
  @NotNull
  public List<String> getRemoved() {
    return removed;
  }

  @JsonProperty("removed")
  public void setRemoved(List<String> removed) {
    this.removed = removed;
  }

  public UpdateProperties200Response addRemovedItem(String removedItem) {
    if (this.removed == null) {
      this.removed = new ArrayList<>();
    }

    this.removed.add(removedItem);
    return this;
  }

  public UpdateProperties200Response removeRemovedItem(String removedItem) {
    if (removedItem != null && this.removed != null) {
      this.removed.remove(removedItem);
    }

    return this;
  }
  /**
   * List of properties requested for removal that were not found in the namespace&#39;s properties. Represents a partial success response. Server&#39;s do not need to implement this.
   **/
  public UpdateProperties200Response missing(List<String> missing) {
    this.missing = missing;
    return this;
  }

  
  @ApiModelProperty(value = "List of properties requested for removal that were not found in the namespace's properties. Represents a partial success response. Server's do not need to implement this.")
  @JsonProperty("missing")
  public List<String> getMissing() {
    return missing;
  }

  @JsonProperty("missing")
  public void setMissing(List<String> missing) {
    this.missing = missing;
  }

  public UpdateProperties200Response addMissingItem(String missingItem) {
    if (this.missing == null) {
      this.missing = null;
    }

    this.missing.add(missingItem);
    return this;
  }

  public UpdateProperties200Response removeMissingItem(String missingItem) {
    if (missingItem != null && this.missing != null) {
      this.missing.remove(missingItem);
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
    UpdateProperties200Response updateProperties200Response = (UpdateProperties200Response) o;
    return Objects.equals(this.updated, updateProperties200Response.updated) &&
        Objects.equals(this.removed, updateProperties200Response.removed) &&
        Objects.equals(this.missing, updateProperties200Response.missing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updated, removed, missing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProperties200Response {\n");
    
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    missing: ").append(toIndentedString(missing)).append("\n");
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

