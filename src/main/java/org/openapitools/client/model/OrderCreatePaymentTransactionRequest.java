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
import org.openapitools.client.model.OrderTransactionType;

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
 * OrderCreatePaymentTransactionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-09T08:27:48.551903220Z[Etc/UTC]")
public class OrderCreatePaymentTransactionRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "paymentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private OrderTransactionType type = OrderTransactionType.UNKNOWN;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public OrderCreatePaymentTransactionRequest() {
  }

  public OrderCreatePaymentTransactionRequest tenantId(String tenantId) {
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


  public OrderCreatePaymentTransactionRequest paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Get paymentId
   * @return paymentId
  **/
  @javax.annotation.Nonnull
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public OrderCreatePaymentTransactionRequest type(OrderTransactionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public OrderTransactionType getType() {
    return type;
  }

  public void setType(OrderTransactionType type) {
    this.type = type;
  }


  public OrderCreatePaymentTransactionRequest additionalInfo(String additionalInfo) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreatePaymentTransactionRequest orderCreatePaymentTransactionRequest = (OrderCreatePaymentTransactionRequest) o;
    return Objects.equals(this.tenantId, orderCreatePaymentTransactionRequest.tenantId) &&
        Objects.equals(this.paymentId, orderCreatePaymentTransactionRequest.paymentId) &&
        Objects.equals(this.type, orderCreatePaymentTransactionRequest.type) &&
        Objects.equals(this.additionalInfo, orderCreatePaymentTransactionRequest.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, paymentId, type, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreatePaymentTransactionRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
    openapiFields.add("paymentId");
    openapiFields.add("type");
    openapiFields.add("additionalInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("paymentId");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreatePaymentTransactionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreatePaymentTransactionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreatePaymentTransactionRequest is not found in the empty JSON string", OrderCreatePaymentTransactionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreatePaymentTransactionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreatePaymentTransactionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderCreatePaymentTransactionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if (!jsonObj.get("paymentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentId").toString()));
      }
      // validate the required field `type`
      OrderTransactionType.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) && !jsonObj.get("additionalInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreatePaymentTransactionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreatePaymentTransactionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreatePaymentTransactionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreatePaymentTransactionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreatePaymentTransactionRequest>() {
           @Override
           public void write(JsonWriter out, OrderCreatePaymentTransactionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreatePaymentTransactionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreatePaymentTransactionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreatePaymentTransactionRequest
  * @throws IOException if the JSON string is invalid with respect to OrderCreatePaymentTransactionRequest
  */
  public static OrderCreatePaymentTransactionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreatePaymentTransactionRequest.class);
  }

 /**
  * Convert an instance of OrderCreatePaymentTransactionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

