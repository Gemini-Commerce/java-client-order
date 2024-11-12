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
import org.openapitools.client.model.OrderPostalAddress;

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
 * UpdateOrderRequestPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T15:15:23.622602582Z[Etc/UTC]")
public class UpdateOrderRequestPayload {
  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private OrderPostalAddress billingAddress;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "shippingAddress";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
  private OrderPostalAddress shippingAddress;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private Object additionalInfo;

  public UpdateOrderRequestPayload() {
  }

  public UpdateOrderRequestPayload billingAddress(OrderPostalAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  public OrderPostalAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(OrderPostalAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  public UpdateOrderRequestPayload shippingAddress(OrderPostalAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @javax.annotation.Nullable
  public OrderPostalAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(OrderPostalAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public UpdateOrderRequestPayload additionalInfo(Object additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  public Object getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Object additionalInfo) {
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
    UpdateOrderRequestPayload updateOrderRequestPayload = (UpdateOrderRequestPayload) o;
    return Objects.equals(this.billingAddress, updateOrderRequestPayload.billingAddress) &&
        Objects.equals(this.shippingAddress, updateOrderRequestPayload.shippingAddress) &&
        Objects.equals(this.additionalInfo, updateOrderRequestPayload.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, shippingAddress, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderRequestPayload {\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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
    openapiFields.add("billingAddress");
    openapiFields.add("shippingAddress");
    openapiFields.add("additionalInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateOrderRequestPayload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateOrderRequestPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateOrderRequestPayload is not found in the empty JSON string", UpdateOrderRequestPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateOrderRequestPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateOrderRequestPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `billingAddress`
      if (jsonObj.get("billingAddress") != null && !jsonObj.get("billingAddress").isJsonNull()) {
        OrderPostalAddress.validateJsonElement(jsonObj.get("billingAddress"));
      }
      // validate the optional field `shippingAddress`
      if (jsonObj.get("shippingAddress") != null && !jsonObj.get("shippingAddress").isJsonNull()) {
        OrderPostalAddress.validateJsonElement(jsonObj.get("shippingAddress"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateOrderRequestPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateOrderRequestPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateOrderRequestPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateOrderRequestPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateOrderRequestPayload>() {
           @Override
           public void write(JsonWriter out, UpdateOrderRequestPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateOrderRequestPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateOrderRequestPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateOrderRequestPayload
  * @throws IOException if the JSON string is invalid with respect to UpdateOrderRequestPayload
  */
  public static UpdateOrderRequestPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateOrderRequestPayload.class);
  }

 /**
  * Convert an instance of UpdateOrderRequestPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

