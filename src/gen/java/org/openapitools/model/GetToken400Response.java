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



@JsonTypeName("getToken_400_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class GetToken400Response   {
  public enum ErrorEnum {

    INVALID_REQUEST(String.valueOf("invalid_request")), INVALID_CLIENT(String.valueOf("invalid_client")), INVALID_GRANT(String.valueOf("invalid_grant")), UNAUTHORIZED_CLIENT(String.valueOf("unauthorized_client")), UNSUPPORTED_GRANT_TYPE(String.valueOf("unsupported_grant_type")), INVALID_SCOPE(String.valueOf("invalid_scope"));


    private String value;

    ErrorEnum (String v) {
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
	public static ErrorEnum fromString(String s) {
        for (ErrorEnum b : ErrorEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static ErrorEnum fromValue(String value) {
        for (ErrorEnum b : ErrorEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid ErrorEnum error;
  private @Valid String errorDescription;
  private @Valid String errorUri;

  /**
   **/
  public GetToken400Response error(ErrorEnum error) {
    this.error = error;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("error")
  @NotNull
  public ErrorEnum getError() {
    return error;
  }

  @JsonProperty("error")
  public void setError(ErrorEnum error) {
    this.error = error;
  }

  /**
   **/
  public GetToken400Response errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("error_description")
  public String getErrorDescription() {
    return errorDescription;
  }

  @JsonProperty("error_description")
  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  /**
   **/
  public GetToken400Response errorUri(String errorUri) {
    this.errorUri = errorUri;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("error_uri")
  public String getErrorUri() {
    return errorUri;
  }

  @JsonProperty("error_uri")
  public void setErrorUri(String errorUri) {
    this.errorUri = errorUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetToken400Response getToken400Response = (GetToken400Response) o;
    return Objects.equals(this.error, getToken400Response.error) &&
        Objects.equals(this.errorDescription, getToken400Response.errorDescription) &&
        Objects.equals(this.errorUri, getToken400Response.errorUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription, errorUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetToken400Response {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    errorUri: ").append(toIndentedString(errorUri)).append("\n");
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

