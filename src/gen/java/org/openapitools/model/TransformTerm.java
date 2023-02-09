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



@JsonTypeName("TransformTerm")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class TransformTerm   {
  public enum TypeEnum {

    TRANSFORM(String.valueOf("transform"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid TypeEnum type;
  private @Valid String transform;
  private @Valid String term;

  /**
   **/
  public TransformTerm type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public TransformTerm transform(String transform) {
    this.transform = transform;
    return this;
  }

  
  @ApiModelProperty(example = "[\"identity\",\"year\",\"month\",\"day\",\"hour\",\"bucket[256]\",\"truncate[16]\"]", required = true, value = "")
  @JsonProperty("transform")
  @NotNull
  public String getTransform() {
    return transform;
  }

  @JsonProperty("transform")
  public void setTransform(String transform) {
    this.transform = transform;
  }

  /**
   **/
  public TransformTerm term(String term) {
    this.term = term;
    return this;
  }

  
  @ApiModelProperty(example = "[\"column-name\"]", required = true, value = "")
  @JsonProperty("term")
  @NotNull
  public String getTerm() {
    return term;
  }

  @JsonProperty("term")
  public void setTerm(String term) {
    this.term = term;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransformTerm transformTerm = (TransformTerm) o;
    return Objects.equals(this.type, transformTerm.type) &&
        Objects.equals(this.transform, transformTerm.transform) &&
        Objects.equals(this.term, transformTerm.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, transform, term);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransformTerm {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

