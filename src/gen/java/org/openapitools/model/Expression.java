package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AndOrExpression;
import org.openapitools.model.LiteralExpression;
import org.openapitools.model.NotExpression;
import org.openapitools.model.SetExpression;
import org.openapitools.model.Term;
import org.openapitools.model.UnaryExpression;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Expression")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class Expression   {
  private @Valid String type;
  private @Valid Expression left;
  private @Valid Expression right;
  private @Valid Expression child;
  private @Valid Term term;
  private @Valid List<Object> values = new ArrayList<>();
  private @Valid Object value;

  /**
   **/
  public Expression type(String type) {
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
  public Expression left(Expression left) {
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
  public Expression right(Expression right) {
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

  /**
   **/
  public Expression child(Expression child) {
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

  /**
   **/
  public Expression term(Term term) {
    this.term = term;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("term")
  @NotNull
  public Term getTerm() {
    return term;
  }

  @JsonProperty("term")
  public void setTerm(Term term) {
    this.term = term;
  }

  /**
   **/
  public Expression values(List<Object> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("values")
  @NotNull
  public List<Object> getValues() {
    return values;
  }

  @JsonProperty("values")
  public void setValues(List<Object> values) {
    this.values = values;
  }

  public Expression addValuesItem(Object valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }

    this.values.add(valuesItem);
    return this;
  }

  public Expression removeValuesItem(Object valuesItem) {
    if (valuesItem != null && this.values != null) {
      this.values.remove(valuesItem);
    }

    return this;
  }
  /**
   **/
  public Expression value(Object value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("value")
  @NotNull
  public Object getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expression expression = (Expression) o;
    return Objects.equals(this.type, expression.type) &&
        Objects.equals(this.left, expression.left) &&
        Objects.equals(this.right, expression.right) &&
        Objects.equals(this.child, expression.child) &&
        Objects.equals(this.term, expression.term) &&
        Objects.equals(this.values, expression.values) &&
        Objects.equals(this.value, expression.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, left, right, child, term, values, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expression {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

