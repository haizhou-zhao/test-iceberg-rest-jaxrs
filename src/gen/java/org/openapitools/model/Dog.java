package org.openapitools.model;

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



@JsonTypeName("Dog")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-02-09T11:34:29.236122-08:00[America/Los_Angeles]")
public class Dog   {
  private @Valid Boolean bark;
  public enum BreedEnum {

    DINGO(String.valueOf("Dingo")), HUSKY(String.valueOf("Husky")), RETRIEVER(String.valueOf("Retriever")), SHEPHERD(String.valueOf("Shepherd"));


    private String value;

    BreedEnum (String v) {
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
	public static BreedEnum fromString(String s) {
        for (BreedEnum b : BreedEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static BreedEnum fromValue(String value) {
        for (BreedEnum b : BreedEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid BreedEnum breed;

  /**
   **/
  public Dog bark(Boolean bark) {
    this.bark = bark;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bark")
  public Boolean getBark() {
    return bark;
  }

  @JsonProperty("bark")
  public void setBark(Boolean bark) {
    this.bark = bark;
  }

  /**
   **/
  public Dog breed(BreedEnum breed) {
    this.breed = breed;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("breed")
  public BreedEnum getBreed() {
    return breed;
  }

  @JsonProperty("breed")
  public void setBreed(BreedEnum breed) {
    this.breed = breed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dog dog = (Dog) o;
    return Objects.equals(this.bark, dog.bark) &&
        Objects.equals(this.breed, dog.breed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bark, breed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dog {\n");
    
    sb.append("    bark: ").append(toIndentedString(bark)).append("\n");
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
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

