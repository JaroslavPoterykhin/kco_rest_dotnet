/*
 * HPP
 * Hosted Payment Page
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.hosted_payment_page.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * HPPBackgroundImageV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-20T10:31:07.217Z")
public class HPPBackgroundImageV1 {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("width")
  private Long width = null;

  public HPPBackgroundImageV1 url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Url for the image
   * @return url
  **/
  @ApiModelProperty(value = "Url for the image")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public HPPBackgroundImageV1 width(Long width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the image
   * @return width
  **/
  @ApiModelProperty(value = "Width of the image")
  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HPPBackgroundImageV1 backgroundImageV1 = (HPPBackgroundImageV1) o;
    return Objects.equals(this.url, backgroundImageV1.url) &&
        Objects.equals(this.width, backgroundImageV1.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HPPBackgroundImageV1 {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

