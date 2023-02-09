package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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



@JsonTypeName("Snapshot_summary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class SnapshotSummary   {
  public enum OperationEnum {

    APPEND(String.valueOf("append")), REPLACE(String.valueOf("replace")), OVERWRITE(String.valueOf("overwrite")), DELETE(String.valueOf("delete"));


    private String value;

    OperationEnum (String v) {
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
	public static OperationEnum fromString(String s) {
        for (OperationEnum b : OperationEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static OperationEnum fromValue(String value) {
        for (OperationEnum b : OperationEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid OperationEnum operation;
  private @Valid String additionalProperties;

  /**
   **/
  public SnapshotSummary operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull
  public OperationEnum getOperation() {
    return operation;
  }

  @JsonProperty("operation")
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   **/
  public SnapshotSummary additionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("additionalProperties")
  public String getAdditionalProperties() {
    return additionalProperties;
  }

  @JsonProperty("additionalProperties")
  public void setAdditionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotSummary snapshotSummary = (SnapshotSummary) o;
    return Objects.equals(this.operation, snapshotSummary.operation) &&
        Objects.equals(this.additionalProperties, snapshotSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotSummary {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

