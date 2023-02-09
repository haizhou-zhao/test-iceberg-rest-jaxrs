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



@JsonTypeName("StructField")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class StructField   {
  private @Valid Integer id;
  private @Valid String name;
  private @Valid Type type;
  private @Valid Boolean required;
  private @Valid String doc;

  /**
   **/
  public StructField id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public StructField name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public StructField type(Type type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  public Type getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(Type type) {
    this.type = type;
  }

  /**
   **/
  public StructField required(Boolean required) {
    this.required = required;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("required")
  @NotNull
  public Boolean getRequired() {
    return required;
  }

  @JsonProperty("required")
  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   **/
  public StructField doc(String doc) {
    this.doc = doc;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("doc")
  public String getDoc() {
    return doc;
  }

  @JsonProperty("doc")
  public void setDoc(String doc) {
    this.doc = doc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructField structField = (StructField) o;
    return Objects.equals(this.id, structField.id) &&
        Objects.equals(this.name, structField.name) &&
        Objects.equals(this.type, structField.type) &&
        Objects.equals(this.required, structField.required) &&
        Objects.equals(this.doc, structField.doc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, required, doc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructField {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    doc: ").append(toIndentedString(doc)).append("\n");
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

