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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Order.JSON;

/**
 * PaymentCcInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T11:56:24.788972479Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PaymentCcInfo {
  public static final String SERIALIZED_NAME_APPROVAL = "approval";
  @SerializedName(SERIALIZED_NAME_APPROVAL)
  private String approval;

  public static final String SERIALIZED_NAME_EXP_MONTH = "expMonth";
  @SerializedName(SERIALIZED_NAME_EXP_MONTH)
  private Integer expMonth;

  public static final String SERIALIZED_NAME_EXP_YEAR = "expYear";
  @SerializedName(SERIALIZED_NAME_EXP_YEAR)
  private String expYear;

  public static final String SERIALIZED_NAME_LAST4 = "last4";
  @SerializedName(SERIALIZED_NAME_LAST4)
  private String last4;

  public static final String SERIALIZED_NAME_NUMBER_ENC = "numberEnc";
  @SerializedName(SERIALIZED_NAME_NUMBER_ENC)
  private String numberEnc;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_AVS_STATUS = "avsStatus";
  @SerializedName(SERIALIZED_NAME_AVS_STATUS)
  private String avsStatus;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public PaymentCcInfo() {
  }

  public PaymentCcInfo approval(String approval) {
    this.approval = approval;
    return this;
  }

  /**
   * Get approval
   * @return approval
   */
  @javax.annotation.Nullable
  public String getApproval() {
    return approval;
  }

  public void setApproval(String approval) {
    this.approval = approval;
  }


  public PaymentCcInfo expMonth(Integer expMonth) {
    this.expMonth = expMonth;
    return this;
  }

  /**
   * Get expMonth
   * @return expMonth
   */
  @javax.annotation.Nullable
  public Integer getExpMonth() {
    return expMonth;
  }

  public void setExpMonth(Integer expMonth) {
    this.expMonth = expMonth;
  }


  public PaymentCcInfo expYear(String expYear) {
    this.expYear = expYear;
    return this;
  }

  /**
   * Get expYear
   * @return expYear
   */
  @javax.annotation.Nullable
  public String getExpYear() {
    return expYear;
  }

  public void setExpYear(String expYear) {
    this.expYear = expYear;
  }


  public PaymentCcInfo last4(String last4) {
    this.last4 = last4;
    return this;
  }

  /**
   * Get last4
   * @return last4
   */
  @javax.annotation.Nullable
  public String getLast4() {
    return last4;
  }

  public void setLast4(String last4) {
    this.last4 = last4;
  }


  public PaymentCcInfo numberEnc(String numberEnc) {
    this.numberEnc = numberEnc;
    return this;
  }

  /**
   * Get numberEnc
   * @return numberEnc
   */
  @javax.annotation.Nullable
  public String getNumberEnc() {
    return numberEnc;
  }

  public void setNumberEnc(String numberEnc) {
    this.numberEnc = numberEnc;
  }


  public PaymentCcInfo owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nullable
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  public PaymentCcInfo avsStatus(String avsStatus) {
    this.avsStatus = avsStatus;
    return this;
  }

  /**
   * Get avsStatus
   * @return avsStatus
   */
  @javax.annotation.Nullable
  public String getAvsStatus() {
    return avsStatus;
  }

  public void setAvsStatus(String avsStatus) {
    this.avsStatus = avsStatus;
  }


  public PaymentCcInfo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * card type MasterCard, Visa..
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return the PaymentCcInfo instance itself
   */
  public PaymentCcInfo putAdditionalProperty(String key, Object value) {
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
    PaymentCcInfo paymentCcInfo = (PaymentCcInfo) o;
    return Objects.equals(this.approval, paymentCcInfo.approval) &&
        Objects.equals(this.expMonth, paymentCcInfo.expMonth) &&
        Objects.equals(this.expYear, paymentCcInfo.expYear) &&
        Objects.equals(this.last4, paymentCcInfo.last4) &&
        Objects.equals(this.numberEnc, paymentCcInfo.numberEnc) &&
        Objects.equals(this.owner, paymentCcInfo.owner) &&
        Objects.equals(this.avsStatus, paymentCcInfo.avsStatus) &&
        Objects.equals(this.type, paymentCcInfo.type)&&
        Objects.equals(this.additionalProperties, paymentCcInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approval, expMonth, expYear, last4, numberEnc, owner, avsStatus, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCcInfo {\n");
    sb.append("    approval: ").append(toIndentedString(approval)).append("\n");
    sb.append("    expMonth: ").append(toIndentedString(expMonth)).append("\n");
    sb.append("    expYear: ").append(toIndentedString(expYear)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    numberEnc: ").append(toIndentedString(numberEnc)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    avsStatus: ").append(toIndentedString(avsStatus)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("approval");
    openapiFields.add("expMonth");
    openapiFields.add("expYear");
    openapiFields.add("last4");
    openapiFields.add("numberEnc");
    openapiFields.add("owner");
    openapiFields.add("avsStatus");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PaymentCcInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentCcInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentCcInfo is not found in the empty JSON string", PaymentCcInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("approval") != null && !jsonObj.get("approval").isJsonNull()) && !jsonObj.get("approval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approval").toString()));
      }
      if ((jsonObj.get("expYear") != null && !jsonObj.get("expYear").isJsonNull()) && !jsonObj.get("expYear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expYear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expYear").toString()));
      }
      if ((jsonObj.get("last4") != null && !jsonObj.get("last4").isJsonNull()) && !jsonObj.get("last4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last4").toString()));
      }
      if ((jsonObj.get("numberEnc") != null && !jsonObj.get("numberEnc").isJsonNull()) && !jsonObj.get("numberEnc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberEnc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberEnc").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("avsStatus") != null && !jsonObj.get("avsStatus").isJsonNull()) && !jsonObj.get("avsStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avsStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avsStatus").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentCcInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentCcInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentCcInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentCcInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentCcInfo>() {
           @Override
           public void write(JsonWriter out, PaymentCcInfo value) throws IOException {
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
           public PaymentCcInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PaymentCcInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of PaymentCcInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentCcInfo
   * @throws IOException if the JSON string is invalid with respect to PaymentCcInfo
   */
  public static PaymentCcInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentCcInfo.class);
  }

  /**
   * Convert an instance of PaymentCcInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

