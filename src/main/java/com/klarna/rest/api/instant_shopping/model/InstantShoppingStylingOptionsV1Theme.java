/*
 * Klarna Instant Shopping
 * The Instant Shopping API is serving two purposes:  to manage the orders as they result from the Instant Shopping purchase flow  to generate Instant Shopping Button keys necessary for setting up the Instant Shopping flow both onsite and offsite    The 'authorizations' endpoint is relevant to authorize the orders. The 'buttons' endpoint is relevant to manage the button setup options.   Note that as soon as a purchase initiated through Instant Shopping is authorized with Klarna, the order should be read and handled using the Order Management API.    Button Setup Options is the library for creating and maintaining Instant Shopping Button Keys.  The API is accessible through a few different URLS. There are different URLs for testing and for making live purchases as well as different URLs for depending on if you are based in Europe or in the U.S.  All interaction with Klarna's APIs must be done over HTTPS. To authenticate with Klarna you use your API Credentials and HTTP Basic auth.  The credentials consist of two elements:  Username - Consists of your Merchant ID (eid) - a unique number that identifies your e-store, combined with a random string.  Password - a string which is associated with your Merchant ID and is used to authorize use of Klarna's APIs  Note: The API credentials are separate from your Merchant ID, and it is possible to have several API credentials associated with the same Merchant ID.  The credentials should be sent as an authorization header for every request with the username and password.  You receive both your live and test credentials by contacting Klarna sales for your country.  If the credentials are missing or wrong Klarna will respond with 401 Unauthorized. You can read more about HTTP Basic auth in the Wikipedia article. The username and password the username:password in base64. [https://gist.github.com/brandonmwest/a2632d0a65088a20c00a](Examples)   You can read more about Klarna Data types at https://developers.klarna.com/api/#data-types, e.g. the date format is ISO 8601
 *
 * OpenAPI spec version: 1.0.0
 * Contact: instant.shopping.e@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.instant_shopping.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InstantShoppingStylingOptionsV1Theme
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-20T10:47:29.611Z")
public class InstantShoppingStylingOptionsV1Theme {
  /**
   * Choose between Klarna themes
   */
  public enum VariationEnum {
    KLARNA("klarna"),
    
    DARK("dark"),
    
    LIGHT("light");

    private String value;

    VariationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VariationEnum fromValue(String text) {
      for (VariationEnum b : VariationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("variation")
  private VariationEnum variation = VariationEnum.KLARNA;

  /**
   * Choose the color of the tagline, which appears below the button.
   */
  public enum TaglineEnum {
    DARK("dark"),
    
    LIGHT("light");

    private String value;

    TaglineEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TaglineEnum fromValue(String text) {
      for (TaglineEnum b : TaglineEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("tagline")
  private TaglineEnum tagline = TaglineEnum.DARK;

  /**
   * Choose between types that affect the text of the button
   */
  public enum TypeEnum {
    BUY("buy"),
    
    EXPRESS("express"),
    
    PAY("pay"),
    
    DONATION("donation");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = TypeEnum.EXPRESS;

  public InstantShoppingStylingOptionsV1Theme variation(VariationEnum variation) {
    this.variation = variation;
    return this;
  }

   /**
   * Choose between Klarna themes
   * @return variation
  **/
  @ApiModelProperty(value = "Choose between Klarna themes")
  public VariationEnum getVariation() {
    return variation;
  }

  public void setVariation(VariationEnum variation) {
    this.variation = variation;
  }

  public InstantShoppingStylingOptionsV1Theme tagline(TaglineEnum tagline) {
    this.tagline = tagline;
    return this;
  }

   /**
   * Choose the color of the tagline, which appears below the button.
   * @return tagline
  **/
  @ApiModelProperty(value = "Choose the color of the tagline, which appears below the button.")
  public TaglineEnum getTagline() {
    return tagline;
  }

  public void setTagline(TaglineEnum tagline) {
    this.tagline = tagline;
  }

  public InstantShoppingStylingOptionsV1Theme type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Choose between types that affect the text of the button
   * @return type
  **/
  @ApiModelProperty(value = "Choose between types that affect the text of the button")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstantShoppingStylingOptionsV1Theme stylingOptionsV1Theme = (InstantShoppingStylingOptionsV1Theme) o;
    return Objects.equals(this.variation, stylingOptionsV1Theme.variation) &&
        Objects.equals(this.tagline, stylingOptionsV1Theme.tagline) &&
        Objects.equals(this.type, stylingOptionsV1Theme.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variation, tagline, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantShoppingStylingOptionsV1Theme {\n");
    
    sb.append("    variation: ").append(toIndentedString(variation)).append("\n");
    sb.append("    tagline: ").append(toIndentedString(tagline)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
