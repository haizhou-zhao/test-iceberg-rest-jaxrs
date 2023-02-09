package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.StructField;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class Schema   {
  public enum TypeEnum {

    STRUCT(String.valueOf("struct"));


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
  private @Valid Integer schemaId;
  private @Valid List<Integer> identifierFieldIds = null;

  /**
   **/
  public Schema type(TypeEnum type) {
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
  public Schema fields(List<StructField> fields) {
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

  public Schema addFieldsItem(StructField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }

    this.fields.add(fieldsItem);
    return this;
  }

  public Schema removeFieldsItem(StructField fieldsItem) {
    if (fieldsItem != null && this.fields != null) {
      this.fields.remove(fieldsItem);
    }

    return this;
  }
  /**
   **/
  public Schema schemaId(Integer schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("schema-id")
  public Integer getSchemaId() {
    return schemaId;
  }

  @JsonProperty("schema-id")
  public void setSchemaId(Integer schemaId) {
    this.schemaId = schemaId;
  }

  /**
   **/
  public Schema identifierFieldIds(List<Integer> identifierFieldIds) {
    this.identifierFieldIds = identifierFieldIds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("identifier-field-ids")
  public List<Integer> getIdentifierFieldIds() {
    return identifierFieldIds;
  }

  @JsonProperty("identifier-field-ids")
  public void setIdentifierFieldIds(List<Integer> identifierFieldIds) {
    this.identifierFieldIds = identifierFieldIds;
  }

  public Schema addIdentifierFieldIdsItem(Integer identifierFieldIdsItem) {
    if (this.identifierFieldIds == null) {
      this.identifierFieldIds = new ArrayList<>();
    }

    this.identifierFieldIds.add(identifierFieldIdsItem);
    return this;
  }

  public Schema removeIdentifierFieldIdsItem(Integer identifierFieldIdsItem) {
    if (identifierFieldIdsItem != null && this.identifierFieldIds != null) {
      this.identifierFieldIds.remove(identifierFieldIdsItem);
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
    Schema schema = (Schema) o;
    return Objects.equals(this.type, schema.type) &&
        Objects.equals(this.fields, schema.fields) &&
        Objects.equals(this.schemaId, schema.schemaId) &&
        Objects.equals(this.identifierFieldIds, schema.identifierFieldIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, fields, schemaId, identifierFieldIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schema {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    identifierFieldIds: ").append(toIndentedString(identifierFieldIds)).append("\n");
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

