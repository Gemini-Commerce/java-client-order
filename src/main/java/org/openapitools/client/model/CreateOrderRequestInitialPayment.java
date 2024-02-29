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
import org.openapitools.client.model.InitialPaymentInitialTransaction;
import org.openapitools.client.model.OrderMoney;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Order.JSON;

/**
 * CreateOrderRequestInitialPayment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T16:50:50.918819528Z[Etc/UTC]")
public class CreateOrderRequestInitialPayment {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private OrderMoney amount;

  public static final String SERIALIZED_NAME_CC_INFO = "ccInfo";
  @SerializedName(SERIALIZED_NAME_CC_INFO)
  private PaymentCcInfo ccInfo;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private InitialPaymentInitialTransaction transaction;

  public CreateOrderRequestInitialPayment() {
  }

  public CreateOrderRequestInitialPayment code(String code) {
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


  public CreateOrderRequestInitialPayment additionalInfo(String additionalInfo) {
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


  public CreateOrderRequestInitialPayment amount(OrderMoney amount) {
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


  public CreateOrderRequestInitialPayment ccInfo(PaymentCcInfo ccInfo) {
    this.ccInfo = ccInfo;
    return this;
  }

   /**
   * Get ccInfo
   * @return ccInfo
  **/
  @javax.annotation.Nullable
  public PaymentCcInfo getCcInfo() {
    return ccInfo;
  }

  public void setCcInfo(PaymentCcInfo ccInfo) {
    this.ccInfo = ccInfo;
  }


  public CreateOrderRequestInitialPayment transaction(InitialPaymentInitialTransaction transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable
  public InitialPaymentInitialTransaction getTransaction() {
    return transaction;
  }

  public void setTransaction(InitialPaymentInitialTransaction transaction) {
    this.transaction = transaction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequestInitialPayment createOrderRequestInitialPayment = (CreateOrderRequestInitialPayment) o;
    return Objects.equals(this.code, createOrderRequestInitialPayment.code) &&
        Objects.equals(this.additionalInfo, createOrderRequestInitialPayment.additionalInfo) &&
        Objects.equals(this.amount, createOrderRequestInitialPayment.amount) &&
        Objects.equals(this.ccInfo, createOrderRequestInitialPayment.ccInfo) &&
        Objects.equals(this.transaction, createOrderRequestInitialPayment.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, additionalInfo, amount, ccInfo, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequestInitialPayment {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    ccInfo: ").append(toIndentedString(ccInfo)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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
    openapiFields.add("ccInfo");
    openapiFields.add("transaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateOrderRequestInitialPayment
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateOrderRequestInitialPayment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOrderRequestInitialPayment is not found in the empty JSON string", CreateOrderRequestInitialPayment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateOrderRequestInitialPayment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOrderRequestInitialPayment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateOrderRequestInitialPayment.openapiRequiredFields) {
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
      // validate the optional field `ccInfo`
      if (jsonObj.get("ccInfo") != null && !jsonObj.get("ccInfo").isJsonNull()) {
        PaymentCcInfo.validateJsonElement(jsonObj.get("ccInfo"));
      }
      // validate the optional field `transaction`
      if (jsonObj.get("transaction") != null && !jsonObj.get("transaction").isJsonNull()) {
        InitialPaymentInitialTransaction.validateJsonElement(jsonObj.get("transaction"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOrderRequestInitialPayment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOrderRequestInitialPayment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOrderRequestInitialPayment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOrderRequestInitialPayment.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOrderRequestInitialPayment>() {
           @Override
           public void write(JsonWriter out, CreateOrderRequestInitialPayment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOrderRequestInitialPayment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateOrderRequestInitialPayment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateOrderRequestInitialPayment
  * @throws IOException if the JSON string is invalid with respect to CreateOrderRequestInitialPayment
  */
  public static CreateOrderRequestInitialPayment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOrderRequestInitialPayment.class);
  }

 /**
  * Convert an instance of CreateOrderRequestInitialPayment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
