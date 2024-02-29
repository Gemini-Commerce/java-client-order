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
 * OrderDataDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T16:50:50.918819528Z[Etc/UTC]")
public class OrderDataDocument {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_ASSET_GRN = "assetGrn";
  @SerializedName(SERIALIZED_NAME_ASSET_GRN)
  private String assetGrn;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_INSERTED_AT = "insertedAt";
  @SerializedName(SERIALIZED_NAME_INSERTED_AT)
  private OffsetDateTime insertedAt;

  public OrderDataDocument() {
  }

  public OrderDataDocument(
     OffsetDateTime insertedAt
  ) {
    this();
    this.insertedAt = insertedAt;
  }

  public OrderDataDocument code(String code) {
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


  public OrderDataDocument label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public OrderDataDocument assetGrn(String assetGrn) {
    this.assetGrn = assetGrn;
    return this;
  }

   /**
   * Get assetGrn
   * @return assetGrn
  **/
  @javax.annotation.Nullable
  public String getAssetGrn() {
    return assetGrn;
  }

  public void setAssetGrn(String assetGrn) {
    this.assetGrn = assetGrn;
  }


  public OrderDataDocument url(String url) {
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


   /**
   * Get insertedAt
   * @return insertedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getInsertedAt() {
    return insertedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDataDocument orderDataDocument = (OrderDataDocument) o;
    return Objects.equals(this.code, orderDataDocument.code) &&
        Objects.equals(this.label, orderDataDocument.label) &&
        Objects.equals(this.assetGrn, orderDataDocument.assetGrn) &&
        Objects.equals(this.url, orderDataDocument.url) &&
        Objects.equals(this.insertedAt, orderDataDocument.insertedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label, assetGrn, url, insertedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDataDocument {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    assetGrn: ").append(toIndentedString(assetGrn)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    insertedAt: ").append(toIndentedString(insertedAt)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("label");
    openapiFields.add("assetGrn");
    openapiFields.add("url");
    openapiFields.add("insertedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDataDocument
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDataDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDataDocument is not found in the empty JSON string", OrderDataDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDataDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDataDocument` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("assetGrn") != null && !jsonObj.get("assetGrn").isJsonNull()) && !jsonObj.get("assetGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetGrn").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDataDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDataDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDataDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDataDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDataDocument>() {
           @Override
           public void write(JsonWriter out, OrderDataDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDataDocument read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDataDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDataDocument
  * @throws IOException if the JSON string is invalid with respect to OrderDataDocument
  */
  public static OrderDataDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDataDocument.class);
  }

 /**
  * Convert an instance of OrderDataDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
