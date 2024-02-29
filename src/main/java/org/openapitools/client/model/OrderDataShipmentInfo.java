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
 * OrderDataShipmentInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T15:22:43.018455504Z[Etc/UTC]")
public class OrderDataShipmentInfo {
  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

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

  public static final String SERIALIZED_NAME_GRN = "grn";
  @SerializedName(SERIALIZED_NAME_GRN)
  private String grn;

  public static final String SERIALIZED_NAME_FROM_ADDRESS = "fromAddress";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS)
  private OrderPostalAddress fromAddress;

  public static final String SERIALIZED_NAME_RETURN_ADDRESS = "returnAddress";
  @SerializedName(SERIALIZED_NAME_RETURN_ADDRESS)
  private OrderPostalAddress returnAddress;

  public OrderDataShipmentInfo() {
  }

  public OrderDataShipmentInfo reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  public OrderDataShipmentInfo code(String code) {
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


  public OrderDataShipmentInfo method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  public OrderDataShipmentInfo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public OrderDataShipmentInfo additionalInfo(String additionalInfo) {
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


  public OrderDataShipmentInfo amount(OrderMoney amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  public OrderMoney getAmount() {
    return amount;
  }

  public void setAmount(OrderMoney amount) {
    this.amount = amount;
  }


  public OrderDataShipmentInfo fee(OrderMoney fee) {
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


  public OrderDataShipmentInfo vatAmount(OrderMoney vatAmount) {
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


  public OrderDataShipmentInfo vatPercentage(Float vatPercentage) {
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


  public OrderDataShipmentInfo vatInaccurate(Boolean vatInaccurate) {
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


  public OrderDataShipmentInfo vatCalculated(Boolean vatCalculated) {
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


  public OrderDataShipmentInfo grn(String grn) {
    this.grn = grn;
    return this;
  }

   /**
   * Get grn
   * @return grn
  **/
  @javax.annotation.Nullable
  public String getGrn() {
    return grn;
  }

  public void setGrn(String grn) {
    this.grn = grn;
  }


  public OrderDataShipmentInfo fromAddress(OrderPostalAddress fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Get fromAddress
   * @return fromAddress
  **/
  @javax.annotation.Nullable
  public OrderPostalAddress getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(OrderPostalAddress fromAddress) {
    this.fromAddress = fromAddress;
  }


  public OrderDataShipmentInfo returnAddress(OrderPostalAddress returnAddress) {
    this.returnAddress = returnAddress;
    return this;
  }

   /**
   * Get returnAddress
   * @return returnAddress
  **/
  @javax.annotation.Nullable
  public OrderPostalAddress getReturnAddress() {
    return returnAddress;
  }

  public void setReturnAddress(OrderPostalAddress returnAddress) {
    this.returnAddress = returnAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDataShipmentInfo orderDataShipmentInfo = (OrderDataShipmentInfo) o;
    return Objects.equals(this.reference, orderDataShipmentInfo.reference) &&
        Objects.equals(this.code, orderDataShipmentInfo.code) &&
        Objects.equals(this.method, orderDataShipmentInfo.method) &&
        Objects.equals(this.title, orderDataShipmentInfo.title) &&
        Objects.equals(this.additionalInfo, orderDataShipmentInfo.additionalInfo) &&
        Objects.equals(this.amount, orderDataShipmentInfo.amount) &&
        Objects.equals(this.fee, orderDataShipmentInfo.fee) &&
        Objects.equals(this.vatAmount, orderDataShipmentInfo.vatAmount) &&
        Objects.equals(this.vatPercentage, orderDataShipmentInfo.vatPercentage) &&
        Objects.equals(this.vatInaccurate, orderDataShipmentInfo.vatInaccurate) &&
        Objects.equals(this.vatCalculated, orderDataShipmentInfo.vatCalculated) &&
        Objects.equals(this.grn, orderDataShipmentInfo.grn) &&
        Objects.equals(this.fromAddress, orderDataShipmentInfo.fromAddress) &&
        Objects.equals(this.returnAddress, orderDataShipmentInfo.returnAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, code, method, title, additionalInfo, amount, fee, vatAmount, vatPercentage, vatInaccurate, vatCalculated, grn, fromAddress, returnAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDataShipmentInfo {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    vatPercentage: ").append(toIndentedString(vatPercentage)).append("\n");
    sb.append("    vatInaccurate: ").append(toIndentedString(vatInaccurate)).append("\n");
    sb.append("    vatCalculated: ").append(toIndentedString(vatCalculated)).append("\n");
    sb.append("    grn: ").append(toIndentedString(grn)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    returnAddress: ").append(toIndentedString(returnAddress)).append("\n");
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
    openapiFields.add("reference");
    openapiFields.add("code");
    openapiFields.add("method");
    openapiFields.add("title");
    openapiFields.add("additionalInfo");
    openapiFields.add("amount");
    openapiFields.add("fee");
    openapiFields.add("vatAmount");
    openapiFields.add("vatPercentage");
    openapiFields.add("vatInaccurate");
    openapiFields.add("vatCalculated");
    openapiFields.add("grn");
    openapiFields.add("fromAddress");
    openapiFields.add("returnAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDataShipmentInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDataShipmentInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDataShipmentInfo is not found in the empty JSON string", OrderDataShipmentInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDataShipmentInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDataShipmentInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) && !jsonObj.get("additionalInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
      }
      // validate the optional field `amount`
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("amount"));
      }
      // validate the optional field `fee`
      if (jsonObj.get("fee") != null && !jsonObj.get("fee").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("fee"));
      }
      // validate the optional field `vatAmount`
      if (jsonObj.get("vatAmount") != null && !jsonObj.get("vatAmount").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("vatAmount"));
      }
      if ((jsonObj.get("grn") != null && !jsonObj.get("grn").isJsonNull()) && !jsonObj.get("grn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grn").toString()));
      }
      // validate the optional field `fromAddress`
      if (jsonObj.get("fromAddress") != null && !jsonObj.get("fromAddress").isJsonNull()) {
        OrderPostalAddress.validateJsonElement(jsonObj.get("fromAddress"));
      }
      // validate the optional field `returnAddress`
      if (jsonObj.get("returnAddress") != null && !jsonObj.get("returnAddress").isJsonNull()) {
        OrderPostalAddress.validateJsonElement(jsonObj.get("returnAddress"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDataShipmentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDataShipmentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDataShipmentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDataShipmentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDataShipmentInfo>() {
           @Override
           public void write(JsonWriter out, OrderDataShipmentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDataShipmentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDataShipmentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDataShipmentInfo
  * @throws IOException if the JSON string is invalid with respect to OrderDataShipmentInfo
  */
  public static OrderDataShipmentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDataShipmentInfo.class);
  }

 /**
  * Convert an instance of OrderDataShipmentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

