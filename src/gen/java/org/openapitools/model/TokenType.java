package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Token type identifier, from RFC 8693 Section 3  See https://datatracker.ietf.org/doc/html/rfc8693#section-3
 */
public enum TokenType {
  
  ACCESS_TOKEN("urn:ietf:params:oauth:token-type:access_token"),
  
  REFRESH_TOKEN("urn:ietf:params:oauth:token-type:refresh_token"),
  
  ID_TOKEN("urn:ietf:params:oauth:token-type:id_token"),
  
  SAML1("urn:ietf:params:oauth:token-type:saml1"),
  
  SAML2("urn:ietf:params:oauth:token-type:saml2"),
  
  JWT("urn:ietf:params:oauth:token-type:jwt");

  private String value;

  TokenType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static TokenType fromString(String s) {
      for (TokenType b : TokenType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TokenType fromValue(String value) {
    for (TokenType b : TokenType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


