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
import org.openapitools.client.model.UpdateOrderRequestPayload;

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
 * OrderUpdateOrderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-09T08:27:48.551903220Z[Etc/UTC]")
public class OrderUpdateOrderRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private UpdateOrderRequestPayload payload;

  public static final String SERIALIZED_NAME_FIELD_MASK = "fieldMask";
  @SerializedName(SERIALIZED_NAME_FIELD_MASK)
  private String fieldMask;

  public OrderUpdateOrderRequest() {
  }

  public OrderUpdateOrderRequest tenantId(String tenantId) {
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


  public OrderUpdateOrderRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public OrderUpdateOrderRequest payload(UpdateOrderRequestPayload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  public UpdateOrderRequestPayload getPayload() {
    return payload;
  }

  public void setPayload(UpdateOrderRequestPayload payload) {
    this.payload = payload;
  }


  public OrderUpdateOrderRequest fieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

   /**
   * Get fieldMask
   * @return fieldMask
  **/
  @javax.annotation.Nullable
  public String getFieldMask() {
    return fieldMask;
  }

  public void setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderUpdateOrderRequest orderUpdateOrderRequest = (OrderUpdateOrderRequest) o;
    return Objects.equals(this.tenantId, orderUpdateOrderRequest.tenantId) &&
        Objects.equals(this.id, orderUpdateOrderRequest.id) &&
        Objects.equals(this.payload, orderUpdateOrderRequest.payload) &&
        Objects.equals(this.fieldMask, orderUpdateOrderRequest.fieldMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, id, payload, fieldMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderUpdateOrderRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    fieldMask: ").append(toIndentedString(fieldMask)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("payload");
    openapiFields.add("fieldMask");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderUpdateOrderRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderUpdateOrderRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderUpdateOrderRequest is not found in the empty JSON string", OrderUpdateOrderRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderUpdateOrderRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderUpdateOrderRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderUpdateOrderRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `payload`
      if (jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) {
        UpdateOrderRequestPayload.validateJsonElement(jsonObj.get("payload"));
      }
      if ((jsonObj.get("fieldMask") != null && !jsonObj.get("fieldMask").isJsonNull()) && !jsonObj.get("fieldMask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldMask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldMask").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderUpdateOrderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderUpdateOrderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderUpdateOrderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderUpdateOrderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderUpdateOrderRequest>() {
           @Override
           public void write(JsonWriter out, OrderUpdateOrderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderUpdateOrderRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderUpdateOrderRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderUpdateOrderRequest
  * @throws IOException if the JSON string is invalid with respect to OrderUpdateOrderRequest
  */
  public static OrderUpdateOrderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderUpdateOrderRequest.class);
  }

 /**
  * Convert an instance of OrderUpdateOrderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

