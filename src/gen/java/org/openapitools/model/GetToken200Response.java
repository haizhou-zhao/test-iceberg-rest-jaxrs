package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TokenType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("getToken_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class GetToken200Response   {
  private @Valid String accessToken;
  public enum TokenTypeEnum {

    BEARER(String.valueOf("bearer")), MAC(String.valueOf("mac")), N_A(String.valueOf("N_A"));


    private String value;

    TokenTypeEnum (String v) {
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
	public static TokenTypeEnum fromString(String s) {
        for (TokenTypeEnum b : TokenTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static TokenTypeEnum fromValue(String value) {
        for (TokenTypeEnum b : TokenTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid TokenTypeEnum tokenType;
  private @Valid Integer expiresIn;
  private @Valid TokenType issuedTokenType;
  private @Valid String refreshToken;
  private @Valid String scope;

  /**
   * The access token, for client credentials or token exchange
   **/
  public GetToken200Response accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The access token, for client credentials or token exchange")
  @JsonProperty("access_token")
  @NotNull
  public String getAccessToken() {
    return accessToken;
  }

  @JsonProperty("access_token")
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * Access token type for client credentials or token exchange  See https://datatracker.ietf.org/doc/html/rfc6749#section-7.1
   **/
  public GetToken200Response tokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Access token type for client credentials or token exchange  See https://datatracker.ietf.org/doc/html/rfc6749#section-7.1")
  @JsonProperty("token_type")
  @NotNull
  public TokenTypeEnum getTokenType() {
    return tokenType;
  }

  @JsonProperty("token_type")
  public void setTokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
  }

  /**
   * Lifetime of the access token in seconds for client credentials or token exchange
   **/
  public GetToken200Response expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  
  @ApiModelProperty(value = "Lifetime of the access token in seconds for client credentials or token exchange")
  @JsonProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  @JsonProperty("expires_in")
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  /**
   **/
  public GetToken200Response issuedTokenType(TokenType issuedTokenType) {
    this.issuedTokenType = issuedTokenType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("issued_token_type")
  public TokenType getIssuedTokenType() {
    return issuedTokenType;
  }

  @JsonProperty("issued_token_type")
  public void setIssuedTokenType(TokenType issuedTokenType) {
    this.issuedTokenType = issuedTokenType;
  }

  /**
   * Refresh token for client credentials or token exchange
   **/
  public GetToken200Response refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  
  @ApiModelProperty(value = "Refresh token for client credentials or token exchange")
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }

  @JsonProperty("refresh_token")
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /**
   * Authorization scope for client credentials or token exchange
   **/
  public GetToken200Response scope(String scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(value = "Authorization scope for client credentials or token exchange")
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  @JsonProperty("scope")
  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetToken200Response getToken200Response = (GetToken200Response) o;
    return Objects.equals(this.accessToken, getToken200Response.accessToken) &&
        Objects.equals(this.tokenType, getToken200Response.tokenType) &&
        Objects.equals(this.expiresIn, getToken200Response.expiresIn) &&
        Objects.equals(this.issuedTokenType, getToken200Response.issuedTokenType) &&
        Objects.equals(this.refreshToken, getToken200Response.refreshToken) &&
        Objects.equals(this.scope, getToken200Response.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, expiresIn, issuedTokenType, refreshToken, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetToken200Response {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    issuedTokenType: ").append(toIndentedString(issuedTokenType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

