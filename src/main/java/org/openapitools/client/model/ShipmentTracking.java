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
 * ShipmentTracking
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T15:22:43.018455504Z[Etc/UTC]")
public class ShipmentTracking {
  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrierCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_CARRIER_TITLE = "carrierTitle";
  @SerializedName(SERIALIZED_NAME_CARRIER_TITLE)
  private String carrierTitle;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_LABEL_URL = "labelUrl";
  @SerializedName(SERIALIZED_NAME_LABEL_URL)
  private String labelUrl;

  public ShipmentTracking() {
  }

  public ShipmentTracking carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * Get carrierCode
   * @return carrierCode
  **/
  @javax.annotation.Nullable
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  public ShipmentTracking carrierTitle(String carrierTitle) {
    this.carrierTitle = carrierTitle;
    return this;
  }

   /**
   * Get carrierTitle
   * @return carrierTitle
  **/
  @javax.annotation.Nullable
  public String getCarrierTitle() {
    return carrierTitle;
  }

  public void setCarrierTitle(String carrierTitle) {
    this.carrierTitle = carrierTitle;
  }


  public ShipmentTracking url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public ShipmentTracking number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  public ShipmentTracking labelUrl(String labelUrl) {
    this.labelUrl = labelUrl;
    return this;
  }

   /**
   * Get labelUrl
   * @return labelUrl
  **/
  @javax.annotation.Nullable
  public String getLabelUrl() {
    return labelUrl;
  }

  public void setLabelUrl(String labelUrl) {
    this.labelUrl = labelUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentTracking shipmentTracking = (ShipmentTracking) o;
    return Objects.equals(this.carrierCode, shipmentTracking.carrierCode) &&
        Objects.equals(this.carrierTitle, shipmentTracking.carrierTitle) &&
        Objects.equals(this.url, shipmentTracking.url) &&
        Objects.equals(this.number, shipmentTracking.number) &&
        Objects.equals(this.labelUrl, shipmentTracking.labelUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, carrierTitle, url, number, labelUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentTracking {\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    carrierTitle: ").append(toIndentedString(carrierTitle)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    labelUrl: ").append(toIndentedString(labelUrl)).append("\n");
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
    openapiFields.add("carrierCode");
    openapiFields.add("carrierTitle");
    openapiFields.add("url");
    openapiFields.add("number");
    openapiFields.add("labelUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ShipmentTracking
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ShipmentTracking.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShipmentTracking is not found in the empty JSON string", ShipmentTracking.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ShipmentTracking.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShipmentTracking` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("carrierCode") != null && !jsonObj.get("carrierCode").isJsonNull()) && !jsonObj.get("carrierCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierCode").toString()));
      }
      if ((jsonObj.get("carrierTitle") != null && !jsonObj.get("carrierTitle").isJsonNull()) && !jsonObj.get("carrierTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierTitle").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if ((jsonObj.get("labelUrl") != null && !jsonObj.get("labelUrl").isJsonNull()) && !jsonObj.get("labelUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labelUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labelUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShipmentTracking.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShipmentTracking' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShipmentTracking> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShipmentTracking.class));

       return (TypeAdapter<T>) new TypeAdapter<ShipmentTracking>() {
           @Override
           public void write(JsonWriter out, ShipmentTracking value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShipmentTracking read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShipmentTracking given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShipmentTracking
  * @throws IOException if the JSON string is invalid with respect to ShipmentTracking
  */
  public static ShipmentTracking fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShipmentTracking.class);
  }

 /**
  * Convert an instance of ShipmentTracking to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

