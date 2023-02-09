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



@JsonTypeName("TimerResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class TimerResult   {
  private @Valid String timeUnit;
  private @Valid Long count;
  private @Valid Long totalDuration;

  /**
   **/
  public TimerResult timeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("time-unit")
  @NotNull
  public String getTimeUnit() {
    return timeUnit;
  }

  @JsonProperty("time-unit")
  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }

  /**
   **/
  public TimerResult count(Long count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("count")
  @NotNull
  public Long getCount() {
    return count;
  }

  @JsonProperty("count")
  public void setCount(Long count) {
    this.count = count;
  }

  /**
   **/
  public TimerResult totalDuration(Long totalDuration) {
    this.totalDuration = totalDuration;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("total-duration")
  @NotNull
  public Long getTotalDuration() {
    return totalDuration;
  }

  @JsonProperty("total-duration")
  public void setTotalDuration(Long totalDuration) {
    this.totalDuration = totalDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimerResult timerResult = (TimerResult) o;
    return Objects.equals(this.timeUnit, timerResult.timeUnit) &&
        Objects.equals(this.count, timerResult.count) &&
        Objects.equals(this.totalDuration, timerResult.totalDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeUnit, count, totalDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimerResult {\n");
    
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalDuration: ").append(toIndentedString(totalDuration)).append("\n");
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

