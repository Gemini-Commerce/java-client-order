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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.ImportOrderRequestImportedPayment;
import org.openapitools.client.model.OrderCurrency;
import org.openapitools.client.model.OrderDataCustomerInfo;
import org.openapitools.client.model.OrderDataPaymentInfo;
import org.openapitools.client.model.OrderDataShipmentInfo;
import org.openapitools.client.model.OrderDataSubtotal;
import org.openapitools.client.model.OrderDataTotal;
import org.openapitools.client.model.OrderOrderDataItem;
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
 * OrderImportOrderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T15:01:22.022764061Z[Etc/UTC]")
public class OrderImportOrderRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_MARKET = "market";
  @SerializedName(SERIALIZED_NAME_MARKET)
  private String market;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_CUSTOMER_INFO = "customerInfo";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_INFO)
  private OrderDataCustomerInfo customerInfo;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "shippingAddress";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
  private OrderPostalAddress shippingAddress;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private OrderPostalAddress billingAddress;

  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  private List<ImportOrderRequestImportedPayment> payments = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYMENTS_INFO = "paymentsInfo";
  @SerializedName(SERIALIZED_NAME_PAYMENTS_INFO)
  private List<OrderDataPaymentInfo> paymentsInfo = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHIPMENTS_INFO = "shipmentsInfo";
  @SerializedName(SERIALIZED_NAME_SHIPMENTS_INFO)
  private List<OrderDataShipmentInfo> shipmentsInfo = new ArrayList<>();

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderOrderDataItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBTOTALS = "subtotals";
  @SerializedName(SERIALIZED_NAME_SUBTOTALS)
  private Map<String, OrderDataSubtotal> subtotals = new HashMap<>();

  public static final String SERIALIZED_NAME_TOTALS = "totals";
  @SerializedName(SERIALIZED_NAME_TOTALS)
  private Map<String, OrderDataTotal> totals = new HashMap<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private OrderCurrency currency = OrderCurrency.XXX;

  public static final String SERIALIZED_NAME_VAT_INCLUDED = "vatIncluded";
  @SerializedName(SERIALIZED_NAME_VAT_INCLUDED)
  private Boolean vatIncluded;

  public OrderImportOrderRequest() {
  }

  public OrderImportOrderRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nonnull
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public OrderImportOrderRequest createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public OrderImportOrderRequest number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nonnull
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  public OrderImportOrderRequest channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  public OrderImportOrderRequest market(String market) {
    this.market = market;
    return this;
  }

   /**
   * Get market
   * @return market
  **/
  @javax.annotation.Nonnull
  public String getMarket() {
    return market;
  }

  public void setMarket(String market) {
    this.market = market;
  }


  public OrderImportOrderRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nonnull
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  public OrderImportOrderRequest customerInfo(OrderDataCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
    return this;
  }

   /**
   * Get customerInfo
   * @return customerInfo
  **/
  @javax.annotation.Nonnull
  public OrderDataCustomerInfo getCustomerInfo() {
    return customerInfo;
  }

  public void setCustomerInfo(OrderDataCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }


  public OrderImportOrderRequest shippingAddress(OrderPostalAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @javax.annotation.Nonnull
  public OrderPostalAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(OrderPostalAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public OrderImportOrderRequest billingAddress(OrderPostalAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nonnull
  public OrderPostalAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(OrderPostalAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  public OrderImportOrderRequest payments(List<ImportOrderRequestImportedPayment> payments) {
    this.payments = payments;
    return this;
  }

  public OrderImportOrderRequest addPaymentsItem(ImportOrderRequestImportedPayment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @javax.annotation.Nonnull
  public List<ImportOrderRequestImportedPayment> getPayments() {
    return payments;
  }

  public void setPayments(List<ImportOrderRequestImportedPayment> payments) {
    this.payments = payments;
  }


  public OrderImportOrderRequest paymentsInfo(List<OrderDataPaymentInfo> paymentsInfo) {
    this.paymentsInfo = paymentsInfo;
    return this;
  }

  public OrderImportOrderRequest addPaymentsInfoItem(OrderDataPaymentInfo paymentsInfoItem) {
    if (this.paymentsInfo == null) {
      this.paymentsInfo = new ArrayList<>();
    }
    this.paymentsInfo.add(paymentsInfoItem);
    return this;
  }

   /**
   * Get paymentsInfo
   * @return paymentsInfo
  **/
  @javax.annotation.Nonnull
  public List<OrderDataPaymentInfo> getPaymentsInfo() {
    return paymentsInfo;
  }

  public void setPaymentsInfo(List<OrderDataPaymentInfo> paymentsInfo) {
    this.paymentsInfo = paymentsInfo;
  }


  public OrderImportOrderRequest shipmentsInfo(List<OrderDataShipmentInfo> shipmentsInfo) {
    this.shipmentsInfo = shipmentsInfo;
    return this;
  }

  public OrderImportOrderRequest addShipmentsInfoItem(OrderDataShipmentInfo shipmentsInfoItem) {
    if (this.shipmentsInfo == null) {
      this.shipmentsInfo = new ArrayList<>();
    }
    this.shipmentsInfo.add(shipmentsInfoItem);
    return this;
  }

   /**
   * Get shipmentsInfo
   * @return shipmentsInfo
  **/
  @javax.annotation.Nonnull
  public List<OrderDataShipmentInfo> getShipmentsInfo() {
    return shipmentsInfo;
  }

  public void setShipmentsInfo(List<OrderDataShipmentInfo> shipmentsInfo) {
    this.shipmentsInfo = shipmentsInfo;
  }


  public OrderImportOrderRequest items(List<OrderOrderDataItem> items) {
    this.items = items;
    return this;
  }

  public OrderImportOrderRequest addItemsItem(OrderOrderDataItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  public List<OrderOrderDataItem> getItems() {
    return items;
  }

  public void setItems(List<OrderOrderDataItem> items) {
    this.items = items;
  }


  public OrderImportOrderRequest subtotals(Map<String, OrderDataSubtotal> subtotals) {
    this.subtotals = subtotals;
    return this;
  }

  public OrderImportOrderRequest putSubtotalsItem(String key, OrderDataSubtotal subtotalsItem) {
    if (this.subtotals == null) {
      this.subtotals = new HashMap<>();
    }
    this.subtotals.put(key, subtotalsItem);
    return this;
  }

   /**
   * Get subtotals
   * @return subtotals
  **/
  @javax.annotation.Nonnull
  public Map<String, OrderDataSubtotal> getSubtotals() {
    return subtotals;
  }

  public void setSubtotals(Map<String, OrderDataSubtotal> subtotals) {
    this.subtotals = subtotals;
  }


  public OrderImportOrderRequest totals(Map<String, OrderDataTotal> totals) {
    this.totals = totals;
    return this;
  }

  public OrderImportOrderRequest putTotalsItem(String key, OrderDataTotal totalsItem) {
    if (this.totals == null) {
      this.totals = new HashMap<>();
    }
    this.totals.put(key, totalsItem);
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @javax.annotation.Nonnull
  public Map<String, OrderDataTotal> getTotals() {
    return totals;
  }

  public void setTotals(Map<String, OrderDataTotal> totals) {
    this.totals = totals;
  }


  public OrderImportOrderRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public OrderImportOrderRequest currency(OrderCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  public OrderCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(OrderCurrency currency) {
    this.currency = currency;
  }


  public OrderImportOrderRequest vatIncluded(Boolean vatIncluded) {
    this.vatIncluded = vatIncluded;
    return this;
  }

   /**
   * Get vatIncluded
   * @return vatIncluded
  **/
  @javax.annotation.Nullable
  public Boolean getVatIncluded() {
    return vatIncluded;
  }

  public void setVatIncluded(Boolean vatIncluded) {
    this.vatIncluded = vatIncluded;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderImportOrderRequest orderImportOrderRequest = (OrderImportOrderRequest) o;
    return Objects.equals(this.tenantId, orderImportOrderRequest.tenantId) &&
        Objects.equals(this.createdAt, orderImportOrderRequest.createdAt) &&
        Objects.equals(this.number, orderImportOrderRequest.number) &&
        Objects.equals(this.channel, orderImportOrderRequest.channel) &&
        Objects.equals(this.market, orderImportOrderRequest.market) &&
        Objects.equals(this.locale, orderImportOrderRequest.locale) &&
        Objects.equals(this.customerInfo, orderImportOrderRequest.customerInfo) &&
        Objects.equals(this.shippingAddress, orderImportOrderRequest.shippingAddress) &&
        Objects.equals(this.billingAddress, orderImportOrderRequest.billingAddress) &&
        Objects.equals(this.payments, orderImportOrderRequest.payments) &&
        Objects.equals(this.paymentsInfo, orderImportOrderRequest.paymentsInfo) &&
        Objects.equals(this.shipmentsInfo, orderImportOrderRequest.shipmentsInfo) &&
        Objects.equals(this.items, orderImportOrderRequest.items) &&
        Objects.equals(this.subtotals, orderImportOrderRequest.subtotals) &&
        Objects.equals(this.totals, orderImportOrderRequest.totals) &&
        Objects.equals(this.status, orderImportOrderRequest.status) &&
        Objects.equals(this.currency, orderImportOrderRequest.currency) &&
        Objects.equals(this.vatIncluded, orderImportOrderRequest.vatIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, createdAt, number, channel, market, locale, customerInfo, shippingAddress, billingAddress, payments, paymentsInfo, shipmentsInfo, items, subtotals, totals, status, currency, vatIncluded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderImportOrderRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    paymentsInfo: ").append(toIndentedString(paymentsInfo)).append("\n");
    sb.append("    shipmentsInfo: ").append(toIndentedString(shipmentsInfo)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    subtotals: ").append(toIndentedString(subtotals)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    vatIncluded: ").append(toIndentedString(vatIncluded)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("createdAt");
    openapiFields.add("number");
    openapiFields.add("channel");
    openapiFields.add("market");
    openapiFields.add("locale");
    openapiFields.add("customerInfo");
    openapiFields.add("shippingAddress");
    openapiFields.add("billingAddress");
    openapiFields.add("payments");
    openapiFields.add("paymentsInfo");
    openapiFields.add("shipmentsInfo");
    openapiFields.add("items");
    openapiFields.add("subtotals");
    openapiFields.add("totals");
    openapiFields.add("status");
    openapiFields.add("currency");
    openapiFields.add("vatIncluded");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("market");
    openapiRequiredFields.add("locale");
    openapiRequiredFields.add("customerInfo");
    openapiRequiredFields.add("shippingAddress");
    openapiRequiredFields.add("billingAddress");
    openapiRequiredFields.add("payments");
    openapiRequiredFields.add("paymentsInfo");
    openapiRequiredFields.add("shipmentsInfo");
    openapiRequiredFields.add("items");
    openapiRequiredFields.add("subtotals");
    openapiRequiredFields.add("totals");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("currency");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderImportOrderRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderImportOrderRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderImportOrderRequest is not found in the empty JSON string", OrderImportOrderRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderImportOrderRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderImportOrderRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderImportOrderRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if (!jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if (!jsonObj.get("market").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `market` to be a primitive type in the JSON string but got `%s`", jsonObj.get("market").toString()));
      }
      if (!jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      // validate the required field `customerInfo`
      OrderDataCustomerInfo.validateJsonElement(jsonObj.get("customerInfo"));
      // validate the required field `shippingAddress`
      OrderPostalAddress.validateJsonElement(jsonObj.get("shippingAddress"));
      // validate the required field `billingAddress`
      OrderPostalAddress.validateJsonElement(jsonObj.get("billingAddress"));
      // ensure the json data is an array
      if (!jsonObj.get("payments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `payments` to be an array in the JSON string but got `%s`", jsonObj.get("payments").toString()));
      }

      JsonArray jsonArraypayments = jsonObj.getAsJsonArray("payments");
      // validate the required field `payments` (array)
      for (int i = 0; i < jsonArraypayments.size(); i++) {
        ImportOrderRequestImportedPayment.validateJsonElement(jsonArraypayments.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("paymentsInfo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentsInfo` to be an array in the JSON string but got `%s`", jsonObj.get("paymentsInfo").toString()));
      }

      JsonArray jsonArraypaymentsInfo = jsonObj.getAsJsonArray("paymentsInfo");
      // validate the required field `paymentsInfo` (array)
      for (int i = 0; i < jsonArraypaymentsInfo.size(); i++) {
        OrderDataPaymentInfo.validateJsonElement(jsonArraypaymentsInfo.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("shipmentsInfo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipmentsInfo` to be an array in the JSON string but got `%s`", jsonObj.get("shipmentsInfo").toString()));
      }

      JsonArray jsonArrayshipmentsInfo = jsonObj.getAsJsonArray("shipmentsInfo");
      // validate the required field `shipmentsInfo` (array)
      for (int i = 0; i < jsonArrayshipmentsInfo.size(); i++) {
        OrderDataShipmentInfo.validateJsonElement(jsonArrayshipmentsInfo.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        OrderOrderDataItem.validateJsonElement(jsonArrayitems.get(i));
      };
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `currency`
      OrderCurrency.validateJsonElement(jsonObj.get("currency"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderImportOrderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderImportOrderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderImportOrderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderImportOrderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderImportOrderRequest>() {
           @Override
           public void write(JsonWriter out, OrderImportOrderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderImportOrderRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderImportOrderRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderImportOrderRequest
  * @throws IOException if the JSON string is invalid with respect to OrderImportOrderRequest
  */
  public static OrderImportOrderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderImportOrderRequest.class);
  }

 /**
  * Convert an instance of OrderImportOrderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

