package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SetPropertiesUpdate_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SetPropertiesUpdateAllOf   {
  private @Valid Map<String, String> updates = new HashMap<>();

  /**
   **/
  public SetPropertiesUpdateAllOf updates(Map<String, String> updates) {
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

  public SetPropertiesUpdateAllOf putUpdatesItem(String key, String updatesItem) {
    if (this.updates == null) {
      this.updates = new HashMap<>();
    }

    this.updates.put(key, updatesItem);
    return this;
  }

  public SetPropertiesUpdateAllOf removeUpdatesItem(String updatesItem) {
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
    SetPropertiesUpdateAllOf setPropertiesUpdateAllOf = (SetPropertiesUpdateAllOf) o;
    return Objects.equals(this.updates, setPropertiesUpdateAllOf.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetPropertiesUpdateAllOf {\n");
    
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

