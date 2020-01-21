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
 * CheckoutCustomer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-20T10:12:28.827Z")
public class CheckoutCustomer {
  @JsonProperty("date_of_birth")
  private String dateOfBirth = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("organization_registration_id")
  private String organizationRegistrationId = null;

  @JsonProperty("gender")
  private String gender = null;

  public CheckoutCustomer dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Customer’s date of birth. The format is ‘yyyy-mm-dd’. ISO 8601 date.
   * @return dateOfBirth
  **/
  @ApiModelProperty(example = "1995-10-20", value = "Customer’s date of birth. The format is ‘yyyy-mm-dd’. ISO 8601 date.")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public CheckoutCustomer type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The default supported value is &#39;person&#39;. If B2B is enabled for the merchant, the value may be \&quot;organization\&quot;.
   * @return type
  **/
  @ApiModelProperty(example = "person", value = "The default supported value is 'person'. If B2B is enabled for the merchant, the value may be \"organization\".")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CheckoutCustomer organizationRegistrationId(String organizationRegistrationId) {
    this.organizationRegistrationId = organizationRegistrationId;
    return this;
  }

   /**
   * \&quot;The organization&#39;s official registration id (organization number).  Note: Applicable only for B2B orders.\&quot;
   * @return organizationRegistrationId
  **/
  @ApiModelProperty(example = "556737-0431", value = "\"The organization's official registration id (organization number).  Note: Applicable only for B2B orders.\"")
  public String getOrganizationRegistrationId() {
    return organizationRegistrationId;
  }

  public void setOrganizationRegistrationId(String organizationRegistrationId) {
    this.organizationRegistrationId = organizationRegistrationId;
  }

  public CheckoutCustomer gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Customer’s gender - ‘male’ or ‘female’.
   * @return gender
  **/
  @ApiModelProperty(example = "male", value = "Customer’s gender - ‘male’ or ‘female’.")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutCustomer customer = (CheckoutCustomer) o;
    return Objects.equals(this.dateOfBirth, customer.dateOfBirth) &&
        Objects.equals(this.type, customer.type) &&
        Objects.equals(this.organizationRegistrationId, customer.organizationRegistrationId) &&
        Objects.equals(this.gender, customer.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, type, organizationRegistrationId, gender);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutCustomer {\n");
    
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organizationRegistrationId: ").append(toIndentedString(organizationRegistrationId)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

