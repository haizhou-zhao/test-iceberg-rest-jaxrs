package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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



@JsonTypeName("RemoveSnapshotsUpdate_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class RemoveSnapshotsUpdateAllOf   {
  private @Valid List<Long> snapshotIds = new ArrayList<>();

  /**
   **/
  public RemoveSnapshotsUpdateAllOf snapshotIds(List<Long> snapshotIds) {
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

  public RemoveSnapshotsUpdateAllOf addSnapshotIdsItem(Long snapshotIdsItem) {
    if (this.snapshotIds == null) {
      this.snapshotIds = new ArrayList<>();
    }

    this.snapshotIds.add(snapshotIdsItem);
    return this;
  }

  public RemoveSnapshotsUpdateAllOf removeSnapshotIdsItem(Long snapshotIdsItem) {
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
    RemoveSnapshotsUpdateAllOf removeSnapshotsUpdateAllOf = (RemoveSnapshotsUpdateAllOf) o;
    return Objects.equals(this.snapshotIds, removeSnapshotsUpdateAllOf.snapshotIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveSnapshotsUpdateAllOf {\n");
    
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

