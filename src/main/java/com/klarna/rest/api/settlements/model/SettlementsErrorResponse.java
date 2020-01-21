/*
 * Klarna Settlements API
 * This API gives you access to your payouts and transactions.     Resources are split into two broad types:     * Collections, including pagination information:      collections are queryable, typically by the attributes of the sub-resource      as well as pagination.    * Entity resources containing a single entity.
 *
 * OpenAPI spec version: 1.0.0-rc2
 * Contact: integration@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.settlements.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SettlementsErrorResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:18:02.332Z")
public class SettlementsErrorResponse {
  @JsonProperty("error_code")
  private String errorCode = null;

  @JsonProperty("error_messages")
  private List<String> errorMessages = new ArrayList<String>();

  @JsonProperty("correlation_id")
  private String correlationId = null;

  public SettlementsErrorResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * ERROR_CODE
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "ERROR_CODE")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public SettlementsErrorResponse errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public SettlementsErrorResponse addErrorMessagesItem(String errorMessagesItem) {
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

   /**
   * Array of error messages
   * @return errorMessages
  **/
  @ApiModelProperty(required = true, value = "Array of error messages")
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public SettlementsErrorResponse correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Unique id for this request used for troubleshooting.
   * @return correlationId
  **/
  @ApiModelProperty(example = "2fe0311b-adc5-45e5-ac2b-963dac83c88b", required = true, value = "Unique id for this request used for troubleshooting.")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementsErrorResponse errorResponse = (SettlementsErrorResponse) o;
    return Objects.equals(this.errorCode, errorResponse.errorCode) &&
        Objects.equals(this.errorMessages, errorResponse.errorMessages) &&
        Objects.equals(this.correlationId, errorResponse.correlationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessages, correlationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementsErrorResponse {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
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

