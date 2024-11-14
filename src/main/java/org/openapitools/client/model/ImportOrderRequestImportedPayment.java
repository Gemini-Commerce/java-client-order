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
import org.openapitools.client.model.OrderPaymentAmount;
import org.openapitools.client.model.PaymentCcInfo;

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
 * ImportOrderRequestImportedPayment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T10:56:55.125435784Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ImportOrderRequestImportedPayment {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_AMOUNTS = "amounts";
  @SerializedName(SERIALIZED_NAME_AMOUNTS)
  private List<OrderPaymentAmount> amounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_CC_INFO = "ccInfo";
  @SerializedName(SERIALIZED_NAME_CC_INFO)
  private PaymentCcInfo ccInfo;

  public static final String SERIALIZED_NAME_IS_UPFRONT = "isUpfront";
  @SerializedName(SERIALIZED_NAME_IS_UPFRONT)
  private Boolean isUpfront;

  public ImportOrderRequestImportedPayment() {
  }

  public ImportOrderRequestImportedPayment code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public ImportOrderRequestImportedPayment additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public ImportOrderRequestImportedPayment amounts(List<OrderPaymentAmount> amounts) {
    this.amounts = amounts;
    return this;
  }

  public ImportOrderRequestImportedPayment addAmountsItem(OrderPaymentAmount amountsItem) {
    if (this.amounts == null) {
      this.amounts = new ArrayList<>();
    }
    this.amounts.add(amountsItem);
    return this;
  }

  /**
   * Get amounts
   * @return amounts
   */
  @javax.annotation.Nonnull
  public List<OrderPaymentAmount> getAmounts() {
    return amounts;
  }

  public void setAmounts(List<OrderPaymentAmount> amounts) {
    this.amounts = amounts;
  }


  public ImportOrderRequestImportedPayment ccInfo(PaymentCcInfo ccInfo) {
    this.ccInfo = ccInfo;
    return this;
  }

  /**
   * Get ccInfo
   * @return ccInfo
   */
  @javax.annotation.Nullable
  public PaymentCcInfo getCcInfo() {
    return ccInfo;
  }

  public void setCcInfo(PaymentCcInfo ccInfo) {
    this.ccInfo = ccInfo;
  }


  public ImportOrderRequestImportedPayment isUpfront(Boolean isUpfront) {
    this.isUpfront = isUpfront;
    return this;
  }

  /**
   * Get isUpfront
   * @return isUpfront
   */
  @javax.annotation.Nullable
  public Boolean getIsUpfront() {
    return isUpfront;
  }

  public void setIsUpfront(Boolean isUpfront) {
    this.isUpfront = isUpfront;
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
   * @return the ImportOrderRequestImportedPayment instance itself
   */
  public ImportOrderRequestImportedPayment putAdditionalProperty(String key, Object value) {
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
    ImportOrderRequestImportedPayment importOrderRequestImportedPayment = (ImportOrderRequestImportedPayment) o;
    return Objects.equals(this.code, importOrderRequestImportedPayment.code) &&
        Objects.equals(this.additionalInfo, importOrderRequestImportedPayment.additionalInfo) &&
        Objects.equals(this.amounts, importOrderRequestImportedPayment.amounts) &&
        Objects.equals(this.ccInfo, importOrderRequestImportedPayment.ccInfo) &&
        Objects.equals(this.isUpfront, importOrderRequestImportedPayment.isUpfront)&&
        Objects.equals(this.additionalProperties, importOrderRequestImportedPayment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, additionalInfo, amounts, ccInfo, isUpfront, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportOrderRequestImportedPayment {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    amounts: ").append(toIndentedString(amounts)).append("\n");
    sb.append("    ccInfo: ").append(toIndentedString(ccInfo)).append("\n");
    sb.append("    isUpfront: ").append(toIndentedString(isUpfront)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("additionalInfo");
    openapiFields.add("amounts");
    openapiFields.add("ccInfo");
    openapiFields.add("isUpfront");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("amounts");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImportOrderRequestImportedPayment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImportOrderRequestImportedPayment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportOrderRequestImportedPayment is not found in the empty JSON string", ImportOrderRequestImportedPayment.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportOrderRequestImportedPayment.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) && !jsonObj.get("additionalInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("amounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `amounts` to be an array in the JSON string but got `%s`", jsonObj.get("amounts").toString()));
      }

      JsonArray jsonArrayamounts = jsonObj.getAsJsonArray("amounts");
      // validate the required field `amounts` (array)
      for (int i = 0; i < jsonArrayamounts.size(); i++) {
        OrderPaymentAmount.validateJsonElement(jsonArrayamounts.get(i));
      };
      // validate the optional field `ccInfo`
      if (jsonObj.get("ccInfo") != null && !jsonObj.get("ccInfo").isJsonNull()) {
        PaymentCcInfo.validateJsonElement(jsonObj.get("ccInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportOrderRequestImportedPayment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportOrderRequestImportedPayment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportOrderRequestImportedPayment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportOrderRequestImportedPayment.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportOrderRequestImportedPayment>() {
           @Override
           public void write(JsonWriter out, ImportOrderRequestImportedPayment value) throws IOException {
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
           public ImportOrderRequestImportedPayment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ImportOrderRequestImportedPayment instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ImportOrderRequestImportedPayment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImportOrderRequestImportedPayment
   * @throws IOException if the JSON string is invalid with respect to ImportOrderRequestImportedPayment
   */
  public static ImportOrderRequestImportedPayment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportOrderRequestImportedPayment.class);
  }

  /**
   * Convert an instance of ImportOrderRequestImportedPayment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

