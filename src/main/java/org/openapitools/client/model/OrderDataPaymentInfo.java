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
import org.openapitools.client.model.OrderLocalizedText;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Order.JSON;

/**
 * OrderDataPaymentInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T08:52:24.392095764Z[Etc/UTC]")
public class OrderDataPaymentInfo {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private OrderMoney amount;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private OrderMoney fee;

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

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private OrderLocalizedText title;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private OrderLocalizedText label;

  public OrderDataPaymentInfo() {
  }

  public OrderDataPaymentInfo code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public OrderDataPaymentInfo additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public OrderDataPaymentInfo amount(OrderMoney amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  public OrderMoney getAmount() {
    return amount;
  }

  public void setAmount(OrderMoney amount) {
    this.amount = amount;
  }


  public OrderDataPaymentInfo fee(OrderMoney fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nullable
  public OrderMoney getFee() {
    return fee;
  }

  public void setFee(OrderMoney fee) {
    this.fee = fee;
  }


  public OrderDataPaymentInfo vatAmount(OrderMoney vatAmount) {
    this.vatAmount = vatAmount;
    return this;
  }

   /**
   * Get vatAmount
   * @return vatAmount
  **/
  @javax.annotation.Nullable
  public OrderMoney getVatAmount() {
    return vatAmount;
  }

  public void setVatAmount(OrderMoney vatAmount) {
    this.vatAmount = vatAmount;
  }


  public OrderDataPaymentInfo vatPercentage(Float vatPercentage) {
    this.vatPercentage = vatPercentage;
    return this;
  }

   /**
   * Get vatPercentage
   * @return vatPercentage
  **/
  @javax.annotation.Nullable
  public Float getVatPercentage() {
    return vatPercentage;
  }

  public void setVatPercentage(Float vatPercentage) {
    this.vatPercentage = vatPercentage;
  }


  public OrderDataPaymentInfo vatInaccurate(Boolean vatInaccurate) {
    this.vatInaccurate = vatInaccurate;
    return this;
  }

   /**
   * Get vatInaccurate
   * @return vatInaccurate
  **/
  @javax.annotation.Nullable
  public Boolean getVatInaccurate() {
    return vatInaccurate;
  }

  public void setVatInaccurate(Boolean vatInaccurate) {
    this.vatInaccurate = vatInaccurate;
  }


  public OrderDataPaymentInfo vatCalculated(Boolean vatCalculated) {
    this.vatCalculated = vatCalculated;
    return this;
  }

   /**
   * Get vatCalculated
   * @return vatCalculated
  **/
  @javax.annotation.Nullable
  public Boolean getVatCalculated() {
    return vatCalculated;
  }

  public void setVatCalculated(Boolean vatCalculated) {
    this.vatCalculated = vatCalculated;
  }


  public OrderDataPaymentInfo title(OrderLocalizedText title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  public OrderLocalizedText getTitle() {
    return title;
  }

  public void setTitle(OrderLocalizedText title) {
    this.title = title;
  }


  public OrderDataPaymentInfo label(OrderLocalizedText label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  public OrderLocalizedText getLabel() {
    return label;
  }

  public void setLabel(OrderLocalizedText label) {
    this.label = label;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDataPaymentInfo orderDataPaymentInfo = (OrderDataPaymentInfo) o;
    return Objects.equals(this.code, orderDataPaymentInfo.code) &&
        Objects.equals(this.additionalInfo, orderDataPaymentInfo.additionalInfo) &&
        Objects.equals(this.amount, orderDataPaymentInfo.amount) &&
        Objects.equals(this.fee, orderDataPaymentInfo.fee) &&
        Objects.equals(this.vatAmount, orderDataPaymentInfo.vatAmount) &&
        Objects.equals(this.vatPercentage, orderDataPaymentInfo.vatPercentage) &&
        Objects.equals(this.vatInaccurate, orderDataPaymentInfo.vatInaccurate) &&
        Objects.equals(this.vatCalculated, orderDataPaymentInfo.vatCalculated) &&
        Objects.equals(this.title, orderDataPaymentInfo.title) &&
        Objects.equals(this.label, orderDataPaymentInfo.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, additionalInfo, amount, fee, vatAmount, vatPercentage, vatInaccurate, vatCalculated, title, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDataPaymentInfo {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    vatPercentage: ").append(toIndentedString(vatPercentage)).append("\n");
    sb.append("    vatInaccurate: ").append(toIndentedString(vatInaccurate)).append("\n");
    sb.append("    vatCalculated: ").append(toIndentedString(vatCalculated)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("fee");
    openapiFields.add("vatAmount");
    openapiFields.add("vatPercentage");
    openapiFields.add("vatInaccurate");
    openapiFields.add("vatCalculated");
    openapiFields.add("title");
    openapiFields.add("label");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDataPaymentInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDataPaymentInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDataPaymentInfo is not found in the empty JSON string", OrderDataPaymentInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDataPaymentInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDataPaymentInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderDataPaymentInfo.openapiRequiredFields) {
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
      // validate the required field `amount`
      OrderMoney.validateJsonElement(jsonObj.get("amount"));
      // validate the optional field `fee`
      if (jsonObj.get("fee") != null && !jsonObj.get("fee").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("fee"));
      }
      // validate the optional field `vatAmount`
      if (jsonObj.get("vatAmount") != null && !jsonObj.get("vatAmount").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("vatAmount"));
      }
      // validate the optional field `title`
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) {
        OrderLocalizedText.validateJsonElement(jsonObj.get("title"));
      }
      // validate the optional field `label`
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) {
        OrderLocalizedText.validateJsonElement(jsonObj.get("label"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDataPaymentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDataPaymentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDataPaymentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDataPaymentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDataPaymentInfo>() {
           @Override
           public void write(JsonWriter out, OrderDataPaymentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDataPaymentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDataPaymentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDataPaymentInfo
  * @throws IOException if the JSON string is invalid with respect to OrderDataPaymentInfo
  */
  public static OrderDataPaymentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDataPaymentInfo.class);
  }

 /**
  * Convert an instance of OrderDataPaymentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

