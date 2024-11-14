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
import org.openapitools.client.model.OrderMoney;

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
 * OrderDataPromotionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T10:56:55.125435784Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderDataPromotionInfo {
  public static final String SERIALIZED_NAME_PROMOTION_GRN = "promotionGrn";
  @SerializedName(SERIALIZED_NAME_PROMOTION_GRN)
  private String promotionGrn;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private OrderMoney amount;

  public static final String SERIALIZED_NAME_COUPON_CODE = "couponCode";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  public static final String SERIALIZED_NAME_VAT_AMOUNT = "vatAmount";
  @SerializedName(SERIALIZED_NAME_VAT_AMOUNT)
  private OrderMoney vatAmount;

  public static final String SERIALIZED_NAME_VAT_PERCENTAGE = "vatPercentage";
  @SerializedName(SERIALIZED_NAME_VAT_PERCENTAGE)
  private Float vatPercentage;

  public static final String SERIALIZED_NAME_VAT_INACCURATE = "vatInaccurate";
  @SerializedName(SERIALIZED_NAME_VAT_INACCURATE)
  private Boolean vatInaccurate;

  public static final String SERIALIZED_NAME_VAT_CALCULATED = "vatCalculated";
  @SerializedName(SERIALIZED_NAME_VAT_CALCULATED)
  private Boolean vatCalculated;

  public OrderDataPromotionInfo() {
  }

  public OrderDataPromotionInfo promotionGrn(String promotionGrn) {
    this.promotionGrn = promotionGrn;
    return this;
  }

  /**
   * Get promotionGrn
   * @return promotionGrn
   */
  @javax.annotation.Nullable
  public String getPromotionGrn() {
    return promotionGrn;
  }

  public void setPromotionGrn(String promotionGrn) {
    this.promotionGrn = promotionGrn;
  }


  public OrderDataPromotionInfo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public OrderDataPromotionInfo additionalInfo(String additionalInfo) {
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


  public OrderDataPromotionInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public OrderDataPromotionInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public OrderDataPromotionInfo amount(OrderMoney amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nonnull
  public OrderMoney getAmount() {
    return amount;
  }

  public void setAmount(OrderMoney amount) {
    this.amount = amount;
  }


  public OrderDataPromotionInfo couponCode(String couponCode) {
    this.couponCode = couponCode;
    return this;
  }

  /**
   * Get couponCode
   * @return couponCode
   */
  @javax.annotation.Nullable
  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public OrderDataPromotionInfo vatAmount(OrderMoney vatAmount) {
    this.vatAmount = vatAmount;
    return this;
  }

  /**
   * Get vatAmount
   * @return vatAmount
   */
  @javax.annotation.Nullable
  public OrderMoney getVatAmount() {
    return vatAmount;
  }

  public void setVatAmount(OrderMoney vatAmount) {
    this.vatAmount = vatAmount;
  }


  public OrderDataPromotionInfo vatPercentage(Float vatPercentage) {
    this.vatPercentage = vatPercentage;
    return this;
  }

  /**
   * Get vatPercentage
   * @return vatPercentage
   */
  @javax.annotation.Nullable
  public Float getVatPercentage() {
    return vatPercentage;
  }

  public void setVatPercentage(Float vatPercentage) {
    this.vatPercentage = vatPercentage;
  }


  public OrderDataPromotionInfo vatInaccurate(Boolean vatInaccurate) {
    this.vatInaccurate = vatInaccurate;
    return this;
  }

  /**
   * Get vatInaccurate
   * @return vatInaccurate
   */
  @javax.annotation.Nullable
  public Boolean getVatInaccurate() {
    return vatInaccurate;
  }

  public void setVatInaccurate(Boolean vatInaccurate) {
    this.vatInaccurate = vatInaccurate;
  }


  public OrderDataPromotionInfo vatCalculated(Boolean vatCalculated) {
    this.vatCalculated = vatCalculated;
    return this;
  }

  /**
   * Get vatCalculated
   * @return vatCalculated
   */
  @javax.annotation.Nullable
  public Boolean getVatCalculated() {
    return vatCalculated;
  }

  public void setVatCalculated(Boolean vatCalculated) {
    this.vatCalculated = vatCalculated;
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
   * @return the OrderDataPromotionInfo instance itself
   */
  public OrderDataPromotionInfo putAdditionalProperty(String key, Object value) {
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
    OrderDataPromotionInfo orderDataPromotionInfo = (OrderDataPromotionInfo) o;
    return Objects.equals(this.promotionGrn, orderDataPromotionInfo.promotionGrn) &&
        Objects.equals(this.type, orderDataPromotionInfo.type) &&
        Objects.equals(this.additionalInfo, orderDataPromotionInfo.additionalInfo) &&
        Objects.equals(this.name, orderDataPromotionInfo.name) &&
        Objects.equals(this.description, orderDataPromotionInfo.description) &&
        Objects.equals(this.amount, orderDataPromotionInfo.amount) &&
        Objects.equals(this.couponCode, orderDataPromotionInfo.couponCode) &&
        Objects.equals(this.vatAmount, orderDataPromotionInfo.vatAmount) &&
        Objects.equals(this.vatPercentage, orderDataPromotionInfo.vatPercentage) &&
        Objects.equals(this.vatInaccurate, orderDataPromotionInfo.vatInaccurate) &&
        Objects.equals(this.vatCalculated, orderDataPromotionInfo.vatCalculated)&&
        Objects.equals(this.additionalProperties, orderDataPromotionInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionGrn, type, additionalInfo, name, description, amount, couponCode, vatAmount, vatPercentage, vatInaccurate, vatCalculated, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDataPromotionInfo {\n");
    sb.append("    promotionGrn: ").append(toIndentedString(promotionGrn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    vatPercentage: ").append(toIndentedString(vatPercentage)).append("\n");
    sb.append("    vatInaccurate: ").append(toIndentedString(vatInaccurate)).append("\n");
    sb.append("    vatCalculated: ").append(toIndentedString(vatCalculated)).append("\n");
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
    openapiFields.add("promotionGrn");
    openapiFields.add("type");
    openapiFields.add("additionalInfo");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("amount");
    openapiFields.add("couponCode");
    openapiFields.add("vatAmount");
    openapiFields.add("vatPercentage");
    openapiFields.add("vatInaccurate");
    openapiFields.add("vatCalculated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("amount");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderDataPromotionInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDataPromotionInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDataPromotionInfo is not found in the empty JSON string", OrderDataPromotionInfo.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderDataPromotionInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("promotionGrn") != null && !jsonObj.get("promotionGrn").isJsonNull()) && !jsonObj.get("promotionGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotionGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promotionGrn").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) && !jsonObj.get("additionalInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `amount`
      OrderMoney.validateJsonElement(jsonObj.get("amount"));
      if ((jsonObj.get("couponCode") != null && !jsonObj.get("couponCode").isJsonNull()) && !jsonObj.get("couponCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("couponCode").toString()));
      }
      // validate the optional field `vatAmount`
      if (jsonObj.get("vatAmount") != null && !jsonObj.get("vatAmount").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("vatAmount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDataPromotionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDataPromotionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDataPromotionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDataPromotionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDataPromotionInfo>() {
           @Override
           public void write(JsonWriter out, OrderDataPromotionInfo value) throws IOException {
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
           public OrderDataPromotionInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OrderDataPromotionInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of OrderDataPromotionInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderDataPromotionInfo
   * @throws IOException if the JSON string is invalid with respect to OrderDataPromotionInfo
   */
  public static OrderDataPromotionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDataPromotionInfo.class);
  }

  /**
   * Convert an instance of OrderDataPromotionInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

