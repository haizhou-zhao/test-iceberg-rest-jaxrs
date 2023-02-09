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



@JsonTypeName("AndOrExpression")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class AndOrExpression   {
  private @Valid String type;
  private @Valid Expression left;
  private @Valid Expression right;

  /**
   **/
  public AndOrExpression type(String type) {
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
  public AndOrExpression left(Expression left) {
    this.left = left;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("left")
  @NotNull
  public Expression getLeft() {
    return left;
  }

  @JsonProperty("left")
  public void setLeft(Expression left) {
    this.left = left;
  }

  /**
   **/
  public AndOrExpression right(Expression right) {
    this.right = right;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("right")
  @NotNull
  public Expression getRight() {
    return right;
  }

  @JsonProperty("right")
  public void setRight(Expression right) {
    this.right = right;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AndOrExpression andOrExpression = (AndOrExpression) o;
    return Objects.equals(this.type, andOrExpression.type) &&
        Objects.equals(this.left, andOrExpression.left) &&
        Objects.equals(this.right, andOrExpression.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, left, right);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AndOrExpression {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
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

