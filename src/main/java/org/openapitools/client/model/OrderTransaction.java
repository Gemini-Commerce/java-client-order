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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.OrderTransactionType;

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
 * OrderTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-09T08:27:48.551903220Z[Etc/UTC]")
public class OrderTransaction {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "paymentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private OrderTransactionType type = OrderTransactionType.UNKNOWN;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_CHILD_TRANSACTIONS = "childTransactions";
  @SerializedName(SERIALIZED_NAME_CHILD_TRANSACTIONS)
  private List<OrderTransaction> childTransactions;

  public OrderTransaction() {
  }

  public OrderTransaction(
     OffsetDateTime createdAt
  ) {
    this();
    this.createdAt = createdAt;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  public OrderTransaction paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Get paymentId
   * @return paymentId
  **/
  @javax.annotation.Nullable
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public OrderTransaction id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public OrderTransaction type(OrderTransactionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public OrderTransactionType getType() {
    return type;
  }

  public void setType(OrderTransactionType type) {
    this.type = type;
  }


  public OrderTransaction additionalInfo(String additionalInfo) {
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


  public OrderTransaction childTransactions(List<OrderTransaction> childTransactions) {
    this.childTransactions = childTransactions;
    return this;
  }

  public OrderTransaction addChildTransactionsItem(OrderTransaction childTransactionsItem) {
    if (this.childTransactions == null) {
      this.childTransactions = new ArrayList<>();
    }
    this.childTransactions.add(childTransactionsItem);
    return this;
  }

   /**
   * Get childTransactions
   * @return childTransactions
  **/
  @javax.annotation.Nullable
  public List<OrderTransaction> getChildTransactions() {
    return childTransactions;
  }

  public void setChildTransactions(List<OrderTransaction> childTransactions) {
    this.childTransactions = childTransactions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderTransaction orderTransaction = (OrderTransaction) o;
    return Objects.equals(this.createdAt, orderTransaction.createdAt) &&
        Objects.equals(this.paymentId, orderTransaction.paymentId) &&
        Objects.equals(this.id, orderTransaction.id) &&
        Objects.equals(this.type, orderTransaction.type) &&
        Objects.equals(this.additionalInfo, orderTransaction.additionalInfo) &&
        Objects.equals(this.childTransactions, orderTransaction.childTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, paymentId, id, type, additionalInfo, childTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderTransaction {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    childTransactions: ").append(toIndentedString(childTransactions)).append("\n");
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
    openapiFields.add("createdAt");
    openapiFields.add("paymentId");
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("additionalInfo");
    openapiFields.add("childTransactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderTransaction
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderTransaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderTransaction is not found in the empty JSON string", OrderTransaction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderTransaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderTransaction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("paymentId") != null && !jsonObj.get("paymentId").isJsonNull()) && !jsonObj.get("paymentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        OrderTransactionType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) && !jsonObj.get("additionalInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
      }
      if (jsonObj.get("childTransactions") != null && !jsonObj.get("childTransactions").isJsonNull()) {
        JsonArray jsonArraychildTransactions = jsonObj.getAsJsonArray("childTransactions");
        if (jsonArraychildTransactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("childTransactions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `childTransactions` to be an array in the JSON string but got `%s`", jsonObj.get("childTransactions").toString()));
          }

          // validate the optional field `childTransactions` (array)
          for (int i = 0; i < jsonArraychildTransactions.size(); i++) {
            OrderTransaction.validateJsonElement(jsonArraychildTransactions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderTransaction>() {
           @Override
           public void write(JsonWriter out, OrderTransaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderTransaction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderTransaction
  * @throws IOException if the JSON string is invalid with respect to OrderTransaction
  */
  public static OrderTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderTransaction.class);
  }

 /**
  * Convert an instance of OrderTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

