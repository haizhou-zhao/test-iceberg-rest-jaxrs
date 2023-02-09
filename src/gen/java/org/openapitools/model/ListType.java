package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Type;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ListType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class ListType   {
  public enum TypeEnum {

    LIST(String.valueOf("list"));


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
  private @Valid Integer elementId;
  private @Valid Type element;
  private @Valid Boolean elementRequired;

  /**
   **/
  public ListType type(TypeEnum type) {
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
  public ListType elementId(Integer elementId) {
    this.elementId = elementId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("element-id")
  @NotNull
  public Integer getElementId() {
    return elementId;
  }

  @JsonProperty("element-id")
  public void setElementId(Integer elementId) {
    this.elementId = elementId;
  }

  /**
   **/
  public ListType element(Type element) {
    this.element = element;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("element")
  @NotNull
  public Type getElement() {
    return element;
  }

  @JsonProperty("element")
  public void setElement(Type element) {
    this.element = element;
  }

  /**
   **/
  public ListType elementRequired(Boolean elementRequired) {
    this.elementRequired = elementRequired;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("element-required")
  @NotNull
  public Boolean getElementRequired() {
    return elementRequired;
  }

  @JsonProperty("element-required")
  public void setElementRequired(Boolean elementRequired) {
    this.elementRequired = elementRequired;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListType listType = (ListType) o;
    return Objects.equals(this.type, listType.type) &&
        Objects.equals(this.elementId, listType.elementId) &&
        Objects.equals(this.element, listType.element) &&
        Objects.equals(this.elementRequired, listType.elementRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, elementId, element, elementRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListType {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
    sb.append("    elementRequired: ").append(toIndentedString(elementRequired)).append("\n");
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

