package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UpdateNamespacePropertiesRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class UpdateNamespacePropertiesRequest   {
  private @Valid Set<String> removals = null;
  private @Valid Map<String, String> updates = null;

  /**
   **/
  public UpdateNamespacePropertiesRequest removals(Set<String> removals) {
    this.removals = removals;
    return this;
  }

  
  @ApiModelProperty(example = "[\"department\",\"access_group\"]", value = "")
  @JsonProperty("removals")
  public Set<String> getRemovals() {
    return removals;
  }

  @JsonProperty("removals")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setRemovals(Set<String> removals) {
    this.removals = removals;
  }

  public UpdateNamespacePropertiesRequest addRemovalsItem(String removalsItem) {
    if (this.removals == null) {
      this.removals = new LinkedHashSet<>();
    }

    this.removals.add(removalsItem);
    return this;
  }

  public UpdateNamespacePropertiesRequest removeRemovalsItem(String removalsItem) {
    if (removalsItem != null && this.removals != null) {
      this.removals.remove(removalsItem);
    }

    return this;
  }
  /**
   **/
  public UpdateNamespacePropertiesRequest updates(Map<String, String> updates) {
    this.updates = updates;
    return this;
  }

  
  @ApiModelProperty(example = "{\"owner\":\"Hank Bendickson\"}", value = "")
  @JsonProperty("updates")
  public Map<String, String> getUpdates() {
    return updates;
  }

  @JsonProperty("updates")
  public void setUpdates(Map<String, String> updates) {
    this.updates = updates;
  }

  public UpdateNamespacePropertiesRequest putUpdatesItem(String key, String updatesItem) {
    if (this.updates == null) {
      this.updates = new HashMap<>();
    }

    this.updates.put(key, updatesItem);
    return this;
  }

  public UpdateNamespacePropertiesRequest removeUpdatesItem(String updatesItem) {
    if (updatesItem != null && this.updates != null) {
      this.updates.remove(updatesItem);
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
    UpdateNamespacePropertiesRequest updateNamespacePropertiesRequest = (UpdateNamespacePropertiesRequest) o;
    return Objects.equals(this.removals, updateNamespacePropertiesRequest.removals) &&
        Objects.equals(this.updates, updateNamespacePropertiesRequest.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removals, updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNamespacePropertiesRequest {\n");
    
    sb.append("    removals: ").append(toIndentedString(removals)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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

