package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Expression;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("NotExpression")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class NotExpression   {
  private @Valid String type;
  private @Valid Expression child;

  /**
   **/
  public NotExpression type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "[\"eq\",\"and\",\"or\",\"not\",\"in\",\"not-in\",\"lt\",\"lt-eq\",\"gt\",\"gt-eq\",\"not-eq\",\"starts-with\",\"not-starts-with\",\"is-null\",\"not-null\",\"is-nan\",\"not-nan\"]", required = true, value = "")
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public NotExpression child(Expression child) {
    this.child = child;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("child")
  @NotNull
  public Expression getChild() {
    return child;
  }

  @JsonProperty("child")
  public void setChild(Expression child) {
    this.child = child;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotExpression notExpression = (NotExpression) o;
    return Objects.equals(this.type, notExpression.type) &&
        Objects.equals(this.child, notExpression.child);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, child);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotExpression {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
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

