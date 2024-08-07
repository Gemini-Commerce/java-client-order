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
 * OrderShipmentItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-09T08:27:48.551903220Z[Etc/UTC]")
public class OrderShipmentItem {
  public static final String SERIALIZED_NAME_ORDER_ITEM_ID = "orderItemId";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_ID)
  private String orderItemId;

  public static final String SERIALIZED_NAME_QTY = "qty";
  @SerializedName(SERIALIZED_NAME_QTY)
  private Long qty;

  public static final String SERIALIZED_NAME_ROW_WEIGHT = "rowWeight";
  @SerializedName(SERIALIZED_NAME_ROW_WEIGHT)
  private String rowWeight;

  public OrderShipmentItem() {
  }

  public OrderShipmentItem orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * Get orderItemId
   * @return orderItemId
  **/
  @javax.annotation.Nullable
  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }


  public OrderShipmentItem qty(Long qty) {
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @javax.annotation.Nullable
  public Long getQty() {
    return qty;
  }

  public void setQty(Long qty) {
    this.qty = qty;
  }


  public OrderShipmentItem rowWeight(String rowWeight) {
    this.rowWeight = rowWeight;
    return this;
  }

   /**
   * Get rowWeight
   * @return rowWeight
  **/
  @javax.annotation.Nullable
  public String getRowWeight() {
    return rowWeight;
  }

  public void setRowWeight(String rowWeight) {
    this.rowWeight = rowWeight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderShipmentItem orderShipmentItem = (OrderShipmentItem) o;
    return Objects.equals(this.orderItemId, orderShipmentItem.orderItemId) &&
        Objects.equals(this.qty, orderShipmentItem.qty) &&
        Objects.equals(this.rowWeight, orderShipmentItem.rowWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemId, qty, rowWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderShipmentItem {\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    rowWeight: ").append(toIndentedString(rowWeight)).append("\n");
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
    openapiFields.add("orderItemId");
    openapiFields.add("qty");
    openapiFields.add("rowWeight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderShipmentItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderShipmentItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderShipmentItem is not found in the empty JSON string", OrderShipmentItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderShipmentItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderShipmentItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("orderItemId") != null && !jsonObj.get("orderItemId").isJsonNull()) && !jsonObj.get("orderItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderItemId").toString()));
      }
      if ((jsonObj.get("rowWeight") != null && !jsonObj.get("rowWeight").isJsonNull()) && !jsonObj.get("rowWeight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rowWeight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rowWeight").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderShipmentItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderShipmentItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderShipmentItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderShipmentItem.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderShipmentItem>() {
           @Override
           public void write(JsonWriter out, OrderShipmentItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderShipmentItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderShipmentItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderShipmentItem
  * @throws IOException if the JSON string is invalid with respect to OrderShipmentItem
  */
  public static OrderShipmentItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderShipmentItem.class);
  }

 /**
  * Convert an instance of OrderShipmentItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

