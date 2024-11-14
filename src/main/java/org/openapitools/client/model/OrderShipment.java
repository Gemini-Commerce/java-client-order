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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.OrderPostalAddress;
import org.openapitools.client.model.OrderShipmentItem;
import org.openapitools.client.model.ShipmentTracking;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Order.JSON;

/**
 * OrderShipment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T11:11:08.866010172Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderShipment {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderShipmentItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private OrderPostalAddress address;

  public static final String SERIALIZED_NAME_FROM_ADDRESS = "fromAddress";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS)
  private OrderPostalAddress fromAddress;

  public static final String SERIALIZED_NAME_RETURN_ADDRESS = "returnAddress";
  @SerializedName(SERIALIZED_NAME_RETURN_ADDRESS)
  private OrderPostalAddress returnAddress;

  public static final String SERIALIZED_NAME_TRACKING = "tracking";
  @SerializedName(SERIALIZED_NAME_TRACKING)
  private List<ShipmentTracking> tracking = new ArrayList<>();

  public static final String SERIALIZED_NAME_RETURN_TRACKING = "returnTracking";
  @SerializedName(SERIALIZED_NAME_RETURN_TRACKING)
  private List<ShipmentTracking> returnTracking = new ArrayList<>();

  public OrderShipment() {
  }

  public OrderShipment(
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }



  public OrderShipment orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
   */
  @javax.annotation.Nullable
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public OrderShipment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public OrderShipment status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public OrderShipment items(List<OrderShipmentItem> items) {
    this.items = items;
    return this;
  }

  public OrderShipment addItemsItem(OrderShipmentItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @javax.annotation.Nullable
  public List<OrderShipmentItem> getItems() {
    return items;
  }

  public void setItems(List<OrderShipmentItem> items) {
    this.items = items;
  }


  public OrderShipment address(OrderPostalAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public OrderPostalAddress getAddress() {
    return address;
  }

  public void setAddress(OrderPostalAddress address) {
    this.address = address;
  }


  public OrderShipment fromAddress(OrderPostalAddress fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

  /**
   * Get fromAddress
   * @return fromAddress
   */
  @javax.annotation.Nullable
  public OrderPostalAddress getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(OrderPostalAddress fromAddress) {
    this.fromAddress = fromAddress;
  }


  public OrderShipment returnAddress(OrderPostalAddress returnAddress) {
    this.returnAddress = returnAddress;
    return this;
  }

  /**
   * Get returnAddress
   * @return returnAddress
   */
  @javax.annotation.Nullable
  public OrderPostalAddress getReturnAddress() {
    return returnAddress;
  }

  public void setReturnAddress(OrderPostalAddress returnAddress) {
    this.returnAddress = returnAddress;
  }


  public OrderShipment tracking(List<ShipmentTracking> tracking) {
    this.tracking = tracking;
    return this;
  }

  public OrderShipment addTrackingItem(ShipmentTracking trackingItem) {
    if (this.tracking == null) {
      this.tracking = new ArrayList<>();
    }
    this.tracking.add(trackingItem);
    return this;
  }

  /**
   * Get tracking
   * @return tracking
   */
  @javax.annotation.Nullable
  public List<ShipmentTracking> getTracking() {
    return tracking;
  }

  public void setTracking(List<ShipmentTracking> tracking) {
    this.tracking = tracking;
  }


  public OrderShipment returnTracking(List<ShipmentTracking> returnTracking) {
    this.returnTracking = returnTracking;
    return this;
  }

  public OrderShipment addReturnTrackingItem(ShipmentTracking returnTrackingItem) {
    if (this.returnTracking == null) {
      this.returnTracking = new ArrayList<>();
    }
    this.returnTracking.add(returnTrackingItem);
    return this;
  }

  /**
   * Get returnTracking
   * @return returnTracking
   */
  @javax.annotation.Nullable
  public List<ShipmentTracking> getReturnTracking() {
    return returnTracking;
  }

  public void setReturnTracking(List<ShipmentTracking> returnTracking) {
    this.returnTracking = returnTracking;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the OrderShipment instance itself
   */
  public OrderShipment putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderShipment orderShipment = (OrderShipment) o;
    return Objects.equals(this.createdAt, orderShipment.createdAt) &&
        Objects.equals(this.updatedAt, orderShipment.updatedAt) &&
        Objects.equals(this.orderId, orderShipment.orderId) &&
        Objects.equals(this.id, orderShipment.id) &&
        Objects.equals(this.status, orderShipment.status) &&
        Objects.equals(this.items, orderShipment.items) &&
        Objects.equals(this.address, orderShipment.address) &&
        Objects.equals(this.fromAddress, orderShipment.fromAddress) &&
        Objects.equals(this.returnAddress, orderShipment.returnAddress) &&
        Objects.equals(this.tracking, orderShipment.tracking) &&
        Objects.equals(this.returnTracking, orderShipment.returnTracking)&&
        Objects.equals(this.additionalProperties, orderShipment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, orderId, id, status, items, address, fromAddress, returnAddress, tracking, returnTracking, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderShipment {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    returnAddress: ").append(toIndentedString(returnAddress)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    returnTracking: ").append(toIndentedString(returnTracking)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("orderId");
    openapiFields.add("id");
    openapiFields.add("status");
    openapiFields.add("items");
    openapiFields.add("address");
    openapiFields.add("fromAddress");
    openapiFields.add("returnAddress");
    openapiFields.add("tracking");
    openapiFields.add("returnTracking");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderShipment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderShipment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderShipment is not found in the empty JSON string", OrderShipment.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
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
      if (jsonObj.get("tracking") != null && !jsonObj.get("tracking").isJsonNull()) {
        JsonArray jsonArraytracking = jsonObj.getAsJsonArray("tracking");
        if (jsonArraytracking != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tracking").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tracking` to be an array in the JSON string but got `%s`", jsonObj.get("tracking").toString()));
          }

          // validate the optional field `tracking` (array)
          for (int i = 0; i < jsonArraytracking.size(); i++) {
            ShipmentTracking.validateJsonElement(jsonArraytracking.get(i));
          };
        }
      }
      if (jsonObj.get("returnTracking") != null && !jsonObj.get("returnTracking").isJsonNull()) {
        JsonArray jsonArrayreturnTracking = jsonObj.getAsJsonArray("returnTracking");
        if (jsonArrayreturnTracking != null) {
          // ensure the json data is an array
          if (!jsonObj.get("returnTracking").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `returnTracking` to be an array in the JSON string but got `%s`", jsonObj.get("returnTracking").toString()));
          }

          // validate the optional field `returnTracking` (array)
          for (int i = 0; i < jsonArrayreturnTracking.size(); i++) {
            ShipmentTracking.validateJsonElement(jsonArrayreturnTracking.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderShipment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderShipment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderShipment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderShipment.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderShipment>() {
           @Override
           public void write(JsonWriter out, OrderShipment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderShipment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OrderShipment instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderShipment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderShipment
   * @throws IOException if the JSON string is invalid with respect to OrderShipment
   */
  public static OrderShipment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderShipment.class);
  }

  /**
   * Convert an instance of OrderShipment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

