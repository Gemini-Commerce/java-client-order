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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * OrderPrintOrdersLabelsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T16:50:50.918819528Z[Etc/UTC]")
public class OrderPrintOrdersLabelsRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ORDER_NUMBERS = "orderNumbers";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBERS)
  private List<String> orderNumbers = new ArrayList<>();

  public OrderPrintOrdersLabelsRequest() {
  }

  public OrderPrintOrdersLabelsRequest tenantId(String tenantId) {
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


  public OrderPrintOrdersLabelsRequest orderNumbers(List<String> orderNumbers) {
    this.orderNumbers = orderNumbers;
    return this;
  }

  public OrderPrintOrdersLabelsRequest addOrderNumbersItem(String orderNumbersItem) {
    if (this.orderNumbers == null) {
      this.orderNumbers = new ArrayList<>();
    }
    this.orderNumbers.add(orderNumbersItem);
    return this;
  }

   /**
   * Get orderNumbers
   * @return orderNumbers
  **/
  @javax.annotation.Nonnull
  public List<String> getOrderNumbers() {
    return orderNumbers;
  }

  public void setOrderNumbers(List<String> orderNumbers) {
    this.orderNumbers = orderNumbers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPrintOrdersLabelsRequest orderPrintOrdersLabelsRequest = (OrderPrintOrdersLabelsRequest) o;
    return Objects.equals(this.tenantId, orderPrintOrdersLabelsRequest.tenantId) &&
        Objects.equals(this.orderNumbers, orderPrintOrdersLabelsRequest.orderNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, orderNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPrintOrdersLabelsRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    orderNumbers: ").append(toIndentedString(orderNumbers)).append("\n");
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
    openapiFields.add("orderNumbers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("orderNumbers");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderPrintOrdersLabelsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderPrintOrdersLabelsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderPrintOrdersLabelsRequest is not found in the empty JSON string", OrderPrintOrdersLabelsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderPrintOrdersLabelsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderPrintOrdersLabelsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderPrintOrdersLabelsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("orderNumbers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("orderNumbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("orderNumbers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderPrintOrdersLabelsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderPrintOrdersLabelsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderPrintOrdersLabelsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderPrintOrdersLabelsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderPrintOrdersLabelsRequest>() {
           @Override
           public void write(JsonWriter out, OrderPrintOrdersLabelsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderPrintOrdersLabelsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderPrintOrdersLabelsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderPrintOrdersLabelsRequest
  * @throws IOException if the JSON string is invalid with respect to OrderPrintOrdersLabelsRequest
  */
  public static OrderPrintOrdersLabelsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderPrintOrdersLabelsRequest.class);
  }

 /**
  * Convert an instance of OrderPrintOrdersLabelsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
