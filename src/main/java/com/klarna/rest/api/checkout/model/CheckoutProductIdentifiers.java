/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.checkout.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CheckoutProductIdentifiers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-20T10:12:28.827Z")
public class CheckoutProductIdentifiers {
  @JsonProperty("category_path")
  private String categoryPath = null;

  @JsonProperty("global_trade_item_number")
  private String globalTradeItemNumber = null;

  @JsonProperty("manufacturer_part_number")
  private String manufacturerPartNumber = null;

  @JsonProperty("brand")
  private String brand = null;

  public CheckoutProductIdentifiers categoryPath(String categoryPath) {
    this.categoryPath = categoryPath;
    return this;
  }

   /**
   * The product&#39;s category path as used in the merchant&#39;s webshop. Include the full and most detailed category and separate the segments with &#39; &gt; &#39;. (max 750 characters)  Example: \&quot;Electronics Store &gt; Computers &amp; Tablets &gt; Desktops\&quot;
   * @return categoryPath
  **/
  @ApiModelProperty(example = "Electronics Store > Computers & Tablets > Desktops", value = "The product's category path as used in the merchant's webshop. Include the full and most detailed category and separate the segments with ' > '. (max 750 characters)  Example: \"Electronics Store > Computers & Tablets > Desktops\"")
  public String getCategoryPath() {
    return categoryPath;
  }

  public void setCategoryPath(String categoryPath) {
    this.categoryPath = categoryPath;
  }

  public CheckoutProductIdentifiers globalTradeItemNumber(String globalTradeItemNumber) {
    this.globalTradeItemNumber = globalTradeItemNumber;
    return this;
  }

   /**
   * The product&#39;s Global Trade Item Number (GTIN). Common types of GTIN are EAN, ISBN or UPC. Exclude dashes and spaces, where possible
   * @return globalTradeItemNumber
  **/
  @ApiModelProperty(example = "735858293167", value = "The product's Global Trade Item Number (GTIN). Common types of GTIN are EAN, ISBN or UPC. Exclude dashes and spaces, where possible")
  public String getGlobalTradeItemNumber() {
    return globalTradeItemNumber;
  }

  public void setGlobalTradeItemNumber(String globalTradeItemNumber) {
    this.globalTradeItemNumber = globalTradeItemNumber;
  }

  public CheckoutProductIdentifiers manufacturerPartNumber(String manufacturerPartNumber) {
    this.manufacturerPartNumber = manufacturerPartNumber;
    return this;
  }

   /**
   * The product&#39;s Manufacturer Part Number (MPN), which - together with the brand - uniquely identifies a product. Only submit MPNs assigned by a manufacturer and use the most specific MPN possible
   * @return manufacturerPartNumber
  **/
  @ApiModelProperty(example = "BOXNUC5CPYH", value = "The product's Manufacturer Part Number (MPN), which - together with the brand - uniquely identifies a product. Only submit MPNs assigned by a manufacturer and use the most specific MPN possible")
  public String getManufacturerPartNumber() {
    return manufacturerPartNumber;
  }

  public void setManufacturerPartNumber(String manufacturerPartNumber) {
    this.manufacturerPartNumber = manufacturerPartNumber;
  }

  public CheckoutProductIdentifiers brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The product&#39;s brand name as generally recognized by consumers. If no brand is available for a product, do not supply any value.
   * @return brand
  **/
  @ApiModelProperty(example = "Intel", value = "The product's brand name as generally recognized by consumers. If no brand is available for a product, do not supply any value.")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutProductIdentifiers productIdentifiers = (CheckoutProductIdentifiers) o;
    return Objects.equals(this.categoryPath, productIdentifiers.categoryPath) &&
        Objects.equals(this.globalTradeItemNumber, productIdentifiers.globalTradeItemNumber) &&
        Objects.equals(this.manufacturerPartNumber, productIdentifiers.manufacturerPartNumber) &&
        Objects.equals(this.brand, productIdentifiers.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryPath, globalTradeItemNumber, manufacturerPartNumber, brand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutProductIdentifiers {\n");
    
    sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
    sb.append("    globalTradeItemNumber: ").append(toIndentedString(globalTradeItemNumber)).append("\n");
    sb.append("    manufacturerPartNumber: ").append(toIndentedString(manufacturerPartNumber)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
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

