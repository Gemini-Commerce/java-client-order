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
import org.openapitools.client.model.PrintOrdersLabelsResponseFailedOrder;

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
 * OrderPrintOrdersLabelsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T17:02:39.571052266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderPrintOrdersLabelsResponse {
  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "downloadUrl";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl;

  public static final String SERIALIZED_NAME_FAILED_ORDERS = "failedOrders";
  @SerializedName(SERIALIZED_NAME_FAILED_ORDERS)
  private List<PrintOrdersLabelsResponseFailedOrder> failedOrders = new ArrayList<>();

  public OrderPrintOrdersLabelsResponse() {
  }

  public OrderPrintOrdersLabelsResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * Get downloadUrl
   * @return downloadUrl
   */
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public OrderPrintOrdersLabelsResponse failedOrders(List<PrintOrdersLabelsResponseFailedOrder> failedOrders) {
    this.failedOrders = failedOrders;
    return this;
  }

  public OrderPrintOrdersLabelsResponse addFailedOrdersItem(PrintOrdersLabelsResponseFailedOrder failedOrdersItem) {
    if (this.failedOrders == null) {
      this.failedOrders = new ArrayList<>();
    }
    this.failedOrders.add(failedOrdersItem);
    return this;
  }

  /**
   * Get failedOrders
   * @return failedOrders
   */
  @javax.annotation.Nullable
  public List<PrintOrdersLabelsResponseFailedOrder> getFailedOrders() {
    return failedOrders;
  }

  public void setFailedOrders(List<PrintOrdersLabelsResponseFailedOrder> failedOrders) {
    this.failedOrders = failedOrders;
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
   * @return the OrderPrintOrdersLabelsResponse instance itself
   */
  public OrderPrintOrdersLabelsResponse putAdditionalProperty(String key, Object value) {
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
    OrderPrintOrdersLabelsResponse orderPrintOrdersLabelsResponse = (OrderPrintOrdersLabelsResponse) o;
    return Objects.equals(this.downloadUrl, orderPrintOrdersLabelsResponse.downloadUrl) &&
        Objects.equals(this.failedOrders, orderPrintOrdersLabelsResponse.failedOrders)&&
        Objects.equals(this.additionalProperties, orderPrintOrdersLabelsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl, failedOrders, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPrintOrdersLabelsResponse {\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    failedOrders: ").append(toIndentedString(failedOrders)).append("\n");
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
    openapiFields.add("downloadUrl");
    openapiFields.add("failedOrders");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderPrintOrdersLabelsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderPrintOrdersLabelsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderPrintOrdersLabelsResponse is not found in the empty JSON string", OrderPrintOrdersLabelsResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("downloadUrl") != null && !jsonObj.get("downloadUrl").isJsonNull()) && !jsonObj.get("downloadUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `downloadUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("downloadUrl").toString()));
      }
      if (jsonObj.get("failedOrders") != null && !jsonObj.get("failedOrders").isJsonNull()) {
        JsonArray jsonArrayfailedOrders = jsonObj.getAsJsonArray("failedOrders");
        if (jsonArrayfailedOrders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("failedOrders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `failedOrders` to be an array in the JSON string but got `%s`", jsonObj.get("failedOrders").toString()));
          }

          // validate the optional field `failedOrders` (array)
          for (int i = 0; i < jsonArrayfailedOrders.size(); i++) {
            PrintOrdersLabelsResponseFailedOrder.validateJsonElement(jsonArrayfailedOrders.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderPrintOrdersLabelsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderPrintOrdersLabelsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderPrintOrdersLabelsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderPrintOrdersLabelsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderPrintOrdersLabelsResponse>() {
           @Override
           public void write(JsonWriter out, OrderPrintOrdersLabelsResponse value) throws IOException {
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
           public OrderPrintOrdersLabelsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OrderPrintOrdersLabelsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of OrderPrintOrdersLabelsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderPrintOrdersLabelsResponse
   * @throws IOException if the JSON string is invalid with respect to OrderPrintOrdersLabelsResponse
   */
  public static OrderPrintOrdersLabelsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderPrintOrdersLabelsResponse.class);
  }

  /**
   * Convert an instance of OrderPrintOrdersLabelsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

