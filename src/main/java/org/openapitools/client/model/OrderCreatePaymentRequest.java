/*
 * order Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.OrderMoney;
import org.openapitools.client.model.PaymentCcInfo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Order.JSON;

/**
 * OrderCreatePaymentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-21T15:58:39.262121098Z[Etc/UTC]")
public class OrderCreatePaymentRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private OrderMoney amount;

  public static final String SERIALIZED_NAME_CC_INFO = "ccInfo";
  @SerializedName(SERIALIZED_NAME_CC_INFO)
  private PaymentCcInfo ccInfo;

  public OrderCreatePaymentRequest() {
  }

  public OrderCreatePaymentRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nonnull
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public OrderCreatePaymentRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nonnull
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public OrderCreatePaymentRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public OrderCreatePaymentRequest additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public OrderCreatePaymentRequest amount(OrderMoney amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  public OrderMoney getAmount() {
    return amount;
  }

  public void setAmount(OrderMoney amount) {
    this.amount = amount;
  }


  public OrderCreatePaymentRequest ccInfo(PaymentCcInfo ccInfo) {
    this.ccInfo = ccInfo;
    return this;
  }

   /**
   * Get ccInfo
   * @return ccInfo
  **/
  @javax.annotation.Nullable
  public PaymentCcInfo getCcInfo() {
    return ccInfo;
  }

  public void setCcInfo(PaymentCcInfo ccInfo) {
    this.ccInfo = ccInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreatePaymentRequest orderCreatePaymentRequest = (OrderCreatePaymentRequest) o;
    return Objects.equals(this.tenantId, orderCreatePaymentRequest.tenantId) &&
        Objects.equals(this.orderId, orderCreatePaymentRequest.orderId) &&
        Objects.equals(this.code, orderCreatePaymentRequest.code) &&
        Objects.equals(this.additionalInfo, orderCreatePaymentRequest.additionalInfo) &&
        Objects.equals(this.amount, orderCreatePaymentRequest.amount) &&
        Objects.equals(this.ccInfo, orderCreatePaymentRequest.ccInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, orderId, code, additionalInfo, amount, ccInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreatePaymentRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    ccInfo: ").append(toIndentedString(ccInfo)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tenantId");
    openapiFields.add("orderId");
    openapiFields.add("code");
    openapiFields.add("additionalInfo");
    openapiFields.add("amount");
    openapiFields.add("ccInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("orderId");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreatePaymentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreatePaymentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreatePaymentRequest is not found in the empty JSON string", OrderCreatePaymentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreatePaymentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreatePaymentRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderCreatePaymentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if (!jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) && !jsonObj.get("additionalInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
      }
      // validate the required field `amount`
      OrderMoney.validateJsonElement(jsonObj.get("amount"));
      // validate the optional field `ccInfo`
      if (jsonObj.get("ccInfo") != null && !jsonObj.get("ccInfo").isJsonNull()) {
        PaymentCcInfo.validateJsonElement(jsonObj.get("ccInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreatePaymentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreatePaymentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreatePaymentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreatePaymentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreatePaymentRequest>() {
           @Override
           public void write(JsonWriter out, OrderCreatePaymentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreatePaymentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreatePaymentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreatePaymentRequest
  * @throws IOException if the JSON string is invalid with respect to OrderCreatePaymentRequest
  */
  public static OrderCreatePaymentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreatePaymentRequest.class);
  }

 /**
  * Convert an instance of OrderCreatePaymentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

