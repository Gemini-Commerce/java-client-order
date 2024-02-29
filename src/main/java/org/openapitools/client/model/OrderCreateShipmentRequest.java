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
import org.openapitools.client.model.OrderPostalAddress;
import org.openapitools.client.model.OrderShipmentItem;

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
 * OrderCreateShipmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T15:22:43.018455504Z[Etc/UTC]")
public class OrderCreateShipmentRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderShipmentItem> items;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private OrderPostalAddress address;

  public static final String SERIALIZED_NAME_FROM_ADDRESS = "fromAddress";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS)
  private OrderPostalAddress fromAddress;

  public static final String SERIALIZED_NAME_RETURN_ADDRESS = "returnAddress";
  @SerializedName(SERIALIZED_NAME_RETURN_ADDRESS)
  private OrderPostalAddress returnAddress;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public OrderCreateShipmentRequest() {
  }

  public OrderCreateShipmentRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public OrderCreateShipmentRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public OrderCreateShipmentRequest items(List<OrderShipmentItem> items) {
    this.items = items;
    return this;
  }

  public OrderCreateShipmentRequest addItemsItem(OrderShipmentItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  public List<OrderShipmentItem> getItems() {
    return items;
  }

  public void setItems(List<OrderShipmentItem> items) {
    this.items = items;
  }


  public OrderCreateShipmentRequest address(OrderPostalAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public OrderPostalAddress getAddress() {
    return address;
  }

  public void setAddress(OrderPostalAddress address) {
    this.address = address;
  }


  public OrderCreateShipmentRequest fromAddress(OrderPostalAddress fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Get fromAddress
   * @return fromAddress
  **/
  @javax.annotation.Nullable
  public OrderPostalAddress getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(OrderPostalAddress fromAddress) {
    this.fromAddress = fromAddress;
  }


  public OrderCreateShipmentRequest returnAddress(OrderPostalAddress returnAddress) {
    this.returnAddress = returnAddress;
    return this;
  }

   /**
   * Get returnAddress
   * @return returnAddress
  **/
  @javax.annotation.Nullable
  public OrderPostalAddress getReturnAddress() {
    return returnAddress;
  }

  public void setReturnAddress(OrderPostalAddress returnAddress) {
    this.returnAddress = returnAddress;
  }


  public OrderCreateShipmentRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public OrderCreateShipmentRequest method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateShipmentRequest orderCreateShipmentRequest = (OrderCreateShipmentRequest) o;
    return Objects.equals(this.tenantId, orderCreateShipmentRequest.tenantId) &&
        Objects.equals(this.orderId, orderCreateShipmentRequest.orderId) &&
        Objects.equals(this.items, orderCreateShipmentRequest.items) &&
        Objects.equals(this.address, orderCreateShipmentRequest.address) &&
        Objects.equals(this.fromAddress, orderCreateShipmentRequest.fromAddress) &&
        Objects.equals(this.returnAddress, orderCreateShipmentRequest.returnAddress) &&
        Objects.equals(this.code, orderCreateShipmentRequest.code) &&
        Objects.equals(this.method, orderCreateShipmentRequest.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, orderId, items, address, fromAddress, returnAddress, code, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateShipmentRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    returnAddress: ").append(toIndentedString(returnAddress)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("address");
    openapiFields.add("fromAddress");
    openapiFields.add("returnAddress");
    openapiFields.add("code");
    openapiFields.add("method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateShipmentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateShipmentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateShipmentRequest is not found in the empty JSON string", OrderCreateShipmentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateShipmentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateShipmentRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            OrderShipmentItem.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        OrderPostalAddress.validateJsonElement(jsonObj.get("address"));
      }
      // validate the optional field `fromAddress`
      if (jsonObj.get("fromAddress") != null && !jsonObj.get("fromAddress").isJsonNull()) {
        OrderPostalAddress.validateJsonElement(jsonObj.get("fromAddress"));
      }
      // validate the optional field `returnAddress`
      if (jsonObj.get("returnAddress") != null && !jsonObj.get("returnAddress").isJsonNull()) {
        OrderPostalAddress.validateJsonElement(jsonObj.get("returnAddress"));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateShipmentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateShipmentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateShipmentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateShipmentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateShipmentRequest>() {
           @Override
           public void write(JsonWriter out, OrderCreateShipmentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateShipmentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateShipmentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateShipmentRequest
  * @throws IOException if the JSON string is invalid with respect to OrderCreateShipmentRequest
  */
  public static OrderCreateShipmentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateShipmentRequest.class);
  }

 /**
  * Convert an instance of OrderCreateShipmentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

