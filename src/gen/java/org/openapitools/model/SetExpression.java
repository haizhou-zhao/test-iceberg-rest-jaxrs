package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Term;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SetExpression")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SetExpression   {
  private @Valid String type;
  private @Valid Term term;
  private @Valid List<Object> values = new ArrayList<>();

  /**
   **/
  public SetExpression type(String type) {
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
  public SetExpression term(Term term) {
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
  public SetExpression values(List<Object> values) {
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

  public SetExpression addValuesItem(Object valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }

    this.values.add(valuesItem);
    return this;
  }

  public SetExpression removeValuesItem(Object valuesItem) {
    if (valuesItem != null && this.values != null) {
      this.values.remove(valuesItem);
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
    SetExpression setExpression = (SetExpression) o;
    return Objects.equals(this.type, setExpression.type) &&
        Objects.equals(this.term, setExpression.term) &&
        Objects.equals(this.values, setExpression.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, term, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetExpression {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

