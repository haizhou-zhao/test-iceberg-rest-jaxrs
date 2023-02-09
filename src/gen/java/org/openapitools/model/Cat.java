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



@JsonTypeName("Cat")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T11:34:29.236122-08:00[America/Los_Angeles]")
public class Cat   {
  private @Valid Boolean hunts;
  private @Valid Integer age;

  /**
   **/
  public Cat hunts(Boolean hunts) {
    this.hunts = hunts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hunts")
  public Boolean getHunts() {
    return hunts;
  }

  @JsonProperty("hunts")
  public void setHunts(Boolean hunts) {
    this.hunts = hunts;
  }

  /**
   **/
  public Cat age(Integer age) {
    this.age = age;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }

  @JsonProperty("age")
  public void setAge(Integer age) {
    this.age = age;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cat cat = (Cat) o;
    return Objects.equals(this.hunts, cat.hunts) &&
        Objects.equals(this.age, cat.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hunts, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cat {\n");
    
    sb.append("    hunts: ").append(toIndentedString(hunts)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

