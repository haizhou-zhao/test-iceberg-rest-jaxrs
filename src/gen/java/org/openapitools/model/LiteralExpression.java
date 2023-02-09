package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Term;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("LiteralExpression")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class LiteralExpression   {
  private @Valid String type;
  private @Valid Term term;
  private @Valid Object value;

  /**
   **/
  public LiteralExpression type(String type) {
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
  public LiteralExpression term(Term term) {
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
  public LiteralExpression value(Object value) {
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
    LiteralExpression literalExpression = (LiteralExpression) o;
    return Objects.equals(this.type, literalExpression.type) &&
        Objects.equals(this.term, literalExpression.term) &&
        Objects.equals(this.value, literalExpression.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, term, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiteralExpression {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

