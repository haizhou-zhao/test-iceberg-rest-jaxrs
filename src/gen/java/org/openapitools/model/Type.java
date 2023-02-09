package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ListType;
import org.openapitools.model.MapType;
import org.openapitools.model.StructField;
import org.openapitools.model.StructType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class Type   {
  public enum TypeEnum {

    MAP(String.valueOf("map"));


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
  private @Valid List<StructField> fields = new ArrayList<>();
  private @Valid Integer elementId;
  private @Valid Type element;
  private @Valid Boolean elementRequired;
  private @Valid Integer keyId;
  private @Valid Type key;
  private @Valid Integer valueId;
  private @Valid Type value;
  private @Valid Boolean valueRequired;

  /**
   **/
  public Type type(TypeEnum type) {
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
  public Type fields(List<StructField> fields) {
    this.fields = fields;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("fields")
  @NotNull
  public List<StructField> getFields() {
    return fields;
  }

  @JsonProperty("fields")
  public void setFields(List<StructField> fields) {
    this.fields = fields;
  }

  public Type addFieldsItem(StructField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }

    this.fields.add(fieldsItem);
    return this;
  }

  public Type removeFieldsItem(StructField fieldsItem) {
    if (fieldsItem != null && this.fields != null) {
      this.fields.remove(fieldsItem);
    }

    return this;
  }
  /**
   **/
  public Type elementId(Integer elementId) {
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
  public Type element(Type element) {
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
  public Type elementRequired(Boolean elementRequired) {
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

  /**
   **/
  public Type keyId(Integer keyId) {
    this.keyId = keyId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("key-id")
  @NotNull
  public Integer getKeyId() {
    return keyId;
  }

  @JsonProperty("key-id")
  public void setKeyId(Integer keyId) {
    this.keyId = keyId;
  }

  /**
   **/
  public Type key(Type key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("key")
  @NotNull
  public Type getKey() {
    return key;
  }

  @JsonProperty("key")
  public void setKey(Type key) {
    this.key = key;
  }

  /**
   **/
  public Type valueId(Integer valueId) {
    this.valueId = valueId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("value-id")
  @NotNull
  public Integer getValueId() {
    return valueId;
  }

  @JsonProperty("value-id")
  public void setValueId(Integer valueId) {
    this.valueId = valueId;
  }

  /**
   **/
  public Type value(Type value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("value")
  @NotNull
  public Type getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(Type value) {
    this.value = value;
  }

  /**
   **/
  public Type valueRequired(Boolean valueRequired) {
    this.valueRequired = valueRequired;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("value-required")
  @NotNull
  public Boolean getValueRequired() {
    return valueRequired;
  }

  @JsonProperty("value-required")
  public void setValueRequired(Boolean valueRequired) {
    this.valueRequired = valueRequired;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Type type = (Type) o;
    return Objects.equals(this.type, type.type) &&
        Objects.equals(this.fields, type.fields) &&
        Objects.equals(this.elementId, type.elementId) &&
        Objects.equals(this.element, type.element) &&
        Objects.equals(this.elementRequired, type.elementRequired) &&
        Objects.equals(this.keyId, type.keyId) &&
        Objects.equals(this.key, type.key) &&
        Objects.equals(this.valueId, type.valueId) &&
        Objects.equals(this.value, type.value) &&
        Objects.equals(this.valueRequired, type.valueRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, fields, elementId, element, elementRequired, keyId, key, valueId, value, valueRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Type {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
    sb.append("    elementRequired: ").append(toIndentedString(elementRequired)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    valueId: ").append(toIndentedString(valueId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueRequired: ").append(toIndentedString(valueRequired)).append("\n");
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

