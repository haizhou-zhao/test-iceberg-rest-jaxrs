package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Server-provided configuration for the catalog.
 **/
@ApiModel(description = "Server-provided configuration for the catalog.")
@JsonTypeName("CatalogConfig")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T15:39:51.511559-08:00[America/Los_Angeles]")
public class CatalogConfig   {
  private @Valid Map<String, String> overrides = new HashMap<>();
  private @Valid Map<String, String> defaults = new HashMap<>();

  /**
   * Properties that should be used to override client configuration; applied after defaults and client configuration.
   **/
  public CatalogConfig overrides(Map<String, String> overrides) {
    this.overrides = overrides;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Properties that should be used to override client configuration; applied after defaults and client configuration.")
  @JsonProperty("overrides")
  @NotNull
  public Map<String, String> getOverrides() {
    return overrides;
  }

  @JsonProperty("overrides")
  public void setOverrides(Map<String, String> overrides) {
    this.overrides = overrides;
  }

  public CatalogConfig putOverridesItem(String key, String overridesItem) {
    if (this.overrides == null) {
      this.overrides = new HashMap<>();
    }

    this.overrides.put(key, overridesItem);
    return this;
  }

  public CatalogConfig removeOverridesItem(String overridesItem) {
    if (overridesItem != null && this.overrides != null) {
      this.overrides.remove(overridesItem);
    }

    return this;
  }
  /**
   * Properties that should be used as default configuration; applied before client configuration.
   **/
  public CatalogConfig defaults(Map<String, String> defaults) {
    this.defaults = defaults;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Properties that should be used as default configuration; applied before client configuration.")
  @JsonProperty("defaults")
  @NotNull
  public Map<String, String> getDefaults() {
    return defaults;
  }

  @JsonProperty("defaults")
  public void setDefaults(Map<String, String> defaults) {
    this.defaults = defaults;
  }

  public CatalogConfig putDefaultsItem(String key, String defaultsItem) {
    if (this.defaults == null) {
      this.defaults = new HashMap<>();
    }

    this.defaults.put(key, defaultsItem);
    return this;
  }

  public CatalogConfig removeDefaultsItem(String defaultsItem) {
    if (defaultsItem != null && this.defaults != null) {
      this.defaults.remove(defaultsItem);
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
    CatalogConfig catalogConfig = (CatalogConfig) o;
    return Objects.equals(this.overrides, catalogConfig.overrides) &&
        Objects.equals(this.defaults, catalogConfig.defaults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrides, defaults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogConfig {\n");
    
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
    sb.append("    defaults: ").append(toIndentedString(defaults)).append("\n");
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

