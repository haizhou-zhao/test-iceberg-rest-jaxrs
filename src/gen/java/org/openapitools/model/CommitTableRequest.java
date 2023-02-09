package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TableRequirement;
import org.openapitools.model.TableUpdate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CommitTableRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class CommitTableRequest   {
  private @Valid List<TableRequirement> requirements = new ArrayList<>();
  private @Valid List<TableUpdate> updates = new ArrayList<>();

  /**
   **/
  public CommitTableRequest requirements(List<TableRequirement> requirements) {
    this.requirements = requirements;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("requirements")
  @NotNull
  public List<TableRequirement> getRequirements() {
    return requirements;
  }

  @JsonProperty("requirements")
  public void setRequirements(List<TableRequirement> requirements) {
    this.requirements = requirements;
  }

  public CommitTableRequest addRequirementsItem(TableRequirement requirementsItem) {
    if (this.requirements == null) {
      this.requirements = new ArrayList<>();
    }

    this.requirements.add(requirementsItem);
    return this;
  }

  public CommitTableRequest removeRequirementsItem(TableRequirement requirementsItem) {
    if (requirementsItem != null && this.requirements != null) {
      this.requirements.remove(requirementsItem);
    }

    return this;
  }
  /**
   **/
  public CommitTableRequest updates(List<TableUpdate> updates) {
    this.updates = updates;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("updates")
  @NotNull
  public List<TableUpdate> getUpdates() {
    return updates;
  }

  @JsonProperty("updates")
  public void setUpdates(List<TableUpdate> updates) {
    this.updates = updates;
  }

  public CommitTableRequest addUpdatesItem(TableUpdate updatesItem) {
    if (this.updates == null) {
      this.updates = new ArrayList<>();
    }

    this.updates.add(updatesItem);
    return this;
  }

  public CommitTableRequest removeUpdatesItem(TableUpdate updatesItem) {
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
    CommitTableRequest commitTableRequest = (CommitTableRequest) o;
    return Objects.equals(this.requirements, commitTableRequest.requirements) &&
        Objects.equals(this.updates, commitTableRequest.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirements, updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitTableRequest {\n");
    
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
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

