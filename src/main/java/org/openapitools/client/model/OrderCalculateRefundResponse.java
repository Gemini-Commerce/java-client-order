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
import org.openapitools.client.model.OrderCreateRefundRequest;

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
 * OrderCalculateRefundResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T08:57:36.631247747Z[Etc/UTC]")
public class OrderCalculateRefundResponse {
  public static final String SERIALIZED_NAME_CREATE_REFUND_REQUEST = "createRefundRequest";
  @SerializedName(SERIALIZED_NAME_CREATE_REFUND_REQUEST)
  private OrderCreateRefundRequest createRefundRequest;

  public OrderCalculateRefundResponse() {
  }

  public OrderCalculateRefundResponse createRefundRequest(OrderCreateRefundRequest createRefundRequest) {
    this.createRefundRequest = createRefundRequest;
    return this;
  }

   /**
   * Get createRefundRequest
   * @return createRefundRequest
  **/
  @javax.annotation.Nullable
  public OrderCreateRefundRequest getCreateRefundRequest() {
    return createRefundRequest;
  }

  public void setCreateRefundRequest(OrderCreateRefundRequest createRefundRequest) {
    this.createRefundRequest = createRefundRequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCalculateRefundResponse orderCalculateRefundResponse = (OrderCalculateRefundResponse) o;
    return Objects.equals(this.createRefundRequest, orderCalculateRefundResponse.createRefundRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createRefundRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCalculateRefundResponse {\n");
    sb.append("    createRefundRequest: ").append(toIndentedString(createRefundRequest)).append("\n");
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
    openapiFields.add("createRefundRequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCalculateRefundResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCalculateRefundResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCalculateRefundResponse is not found in the empty JSON string", OrderCalculateRefundResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCalculateRefundResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCalculateRefundResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `createRefundRequest`
      if (jsonObj.get("createRefundRequest") != null && !jsonObj.get("createRefundRequest").isJsonNull()) {
        OrderCreateRefundRequest.validateJsonElement(jsonObj.get("createRefundRequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCalculateRefundResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCalculateRefundResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCalculateRefundResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCalculateRefundResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCalculateRefundResponse>() {
           @Override
           public void write(JsonWriter out, OrderCalculateRefundResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCalculateRefundResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCalculateRefundResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCalculateRefundResponse
  * @throws IOException if the JSON string is invalid with respect to OrderCalculateRefundResponse
  */
  public static OrderCalculateRefundResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCalculateRefundResponse.class);
  }

 /**
  * Convert an instance of OrderCalculateRefundResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

