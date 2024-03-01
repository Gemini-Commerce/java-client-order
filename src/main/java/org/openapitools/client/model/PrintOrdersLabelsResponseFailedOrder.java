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
 * PrintOrdersLabelsResponseFailedOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T08:52:24.392095764Z[Etc/UTC]")
public class PrintOrdersLabelsResponseFailedOrder {
  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public PrintOrdersLabelsResponseFailedOrder() {
  }

  public PrintOrdersLabelsResponseFailedOrder orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public PrintOrdersLabelsResponseFailedOrder errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public PrintOrdersLabelsResponseFailedOrder errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrintOrdersLabelsResponseFailedOrder printOrdersLabelsResponseFailedOrder = (PrintOrdersLabelsResponseFailedOrder) o;
    return Objects.equals(this.orderNumber, printOrdersLabelsResponseFailedOrder.orderNumber) &&
        Objects.equals(this.errorMessage, printOrdersLabelsResponseFailedOrder.errorMessage) &&
        Objects.equals(this.errorCode, printOrdersLabelsResponseFailedOrder.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNumber, errorMessage, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrintOrdersLabelsResponseFailedOrder {\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
    openapiFields.add("orderNumber");
    openapiFields.add("errorMessage");
    openapiFields.add("errorCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PrintOrdersLabelsResponseFailedOrder
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PrintOrdersLabelsResponseFailedOrder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrintOrdersLabelsResponseFailedOrder is not found in the empty JSON string", PrintOrdersLabelsResponseFailedOrder.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PrintOrdersLabelsResponseFailedOrder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrintOrdersLabelsResponseFailedOrder` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("orderNumber") != null && !jsonObj.get("orderNumber").isJsonNull()) && !jsonObj.get("orderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderNumber").toString()));
      }
      if ((jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonNull()) && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
      if ((jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonNull()) && !jsonObj.get("errorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrintOrdersLabelsResponseFailedOrder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrintOrdersLabelsResponseFailedOrder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrintOrdersLabelsResponseFailedOrder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrintOrdersLabelsResponseFailedOrder.class));

       return (TypeAdapter<T>) new TypeAdapter<PrintOrdersLabelsResponseFailedOrder>() {
           @Override
           public void write(JsonWriter out, PrintOrdersLabelsResponseFailedOrder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrintOrdersLabelsResponseFailedOrder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PrintOrdersLabelsResponseFailedOrder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PrintOrdersLabelsResponseFailedOrder
  * @throws IOException if the JSON string is invalid with respect to PrintOrdersLabelsResponseFailedOrder
  */
  public static PrintOrdersLabelsResponseFailedOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrintOrdersLabelsResponseFailedOrder.class);
  }

 /**
  * Convert an instance of PrintOrdersLabelsResponseFailedOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

