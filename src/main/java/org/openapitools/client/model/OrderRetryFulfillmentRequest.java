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
 * OrderRetryFulfillmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T15:01:22.022764061Z[Etc/UTC]")
public class OrderRetryFulfillmentRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_FULFILLMENT_ID = "fulfillmentId";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_ID)
  private String fulfillmentId;

  public OrderRetryFulfillmentRequest() {
  }

  public OrderRetryFulfillmentRequest tenantId(String tenantId) {
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


  public OrderRetryFulfillmentRequest fulfillmentId(String fulfillmentId) {
    this.fulfillmentId = fulfillmentId;
    return this;
  }

   /**
   * Get fulfillmentId
   * @return fulfillmentId
  **/
  @javax.annotation.Nonnull
  public String getFulfillmentId() {
    return fulfillmentId;
  }

  public void setFulfillmentId(String fulfillmentId) {
    this.fulfillmentId = fulfillmentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRetryFulfillmentRequest orderRetryFulfillmentRequest = (OrderRetryFulfillmentRequest) o;
    return Objects.equals(this.tenantId, orderRetryFulfillmentRequest.tenantId) &&
        Objects.equals(this.fulfillmentId, orderRetryFulfillmentRequest.fulfillmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, fulfillmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRetryFulfillmentRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    fulfillmentId: ").append(toIndentedString(fulfillmentId)).append("\n");
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
    openapiFields.add("fulfillmentId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("fulfillmentId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderRetryFulfillmentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderRetryFulfillmentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderRetryFulfillmentRequest is not found in the empty JSON string", OrderRetryFulfillmentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderRetryFulfillmentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderRetryFulfillmentRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderRetryFulfillmentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if (!jsonObj.get("fulfillmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillmentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderRetryFulfillmentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderRetryFulfillmentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderRetryFulfillmentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderRetryFulfillmentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderRetryFulfillmentRequest>() {
           @Override
           public void write(JsonWriter out, OrderRetryFulfillmentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderRetryFulfillmentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderRetryFulfillmentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderRetryFulfillmentRequest
  * @throws IOException if the JSON string is invalid with respect to OrderRetryFulfillmentRequest
  */
  public static OrderRetryFulfillmentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderRetryFulfillmentRequest.class);
  }

 /**
  * Convert an instance of OrderRetryFulfillmentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

