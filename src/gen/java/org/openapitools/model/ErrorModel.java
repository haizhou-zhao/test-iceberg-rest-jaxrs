package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * JSON error payload returned in a response with further details on the error
 **/
@ApiModel(description = "JSON error payload returned in a response with further details on the error")
@JsonTypeName("ErrorModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class ErrorModel   {
  private @Valid String message;
  private @Valid String type;
  private @Valid Integer code;
  private @Valid List<String> stack = null;

  /**
   * Human-readable error message
   **/
  public ErrorModel message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Human-readable error message")
  @JsonProperty("message")
  @NotNull
  public String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Internal type definition of the error
   **/
  public ErrorModel type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "NoSuchNamespaceException", required = true, value = "Internal type definition of the error")
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
   * HTTP response code
   * minimum: 400
   * maximum: 600
   **/
  public ErrorModel code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "404", required = true, value = "HTTP response code")
  @JsonProperty("code")
  @NotNull
 @Min(400) @Max(600)  public Integer getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   **/
  public ErrorModel stack(List<String> stack) {
    this.stack = stack;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stack")
  public List<String> getStack() {
    return stack;
  }

  @JsonProperty("stack")
  public void setStack(List<String> stack) {
    this.stack = stack;
  }

  public ErrorModel addStackItem(String stackItem) {
    if (this.stack == null) {
      this.stack = new ArrayList<>();
    }

    this.stack.add(stackItem);
    return this;
  }

  public ErrorModel removeStackItem(String stackItem) {
    if (stackItem != null && this.stack != null) {
      this.stack.remove(stackItem);
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
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(this.message, errorModel.message) &&
        Objects.equals(this.type, errorModel.type) &&
        Objects.equals(this.code, errorModel.code) &&
        Objects.equals(this.stack, errorModel.stack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, type, code, stack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
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

