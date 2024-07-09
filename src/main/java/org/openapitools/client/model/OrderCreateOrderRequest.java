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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.CreateOrderRequestInitialPayment;
import org.openapitools.client.model.OrderCurrency;
import org.openapitools.client.model.OrderDataCustomerInfo;
import org.openapitools.client.model.OrderDataPaymentInfo;
import org.openapitools.client.model.OrderDataPromotionInfo;
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
 * OrderCreateOrderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-09T08:27:48.551903220Z[Etc/UTC]")
public class OrderCreateOrderRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

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

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderOrderDataItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYMENTS_INFO = "paymentsInfo";
  @SerializedName(SERIALIZED_NAME_PAYMENTS_INFO)
  private List<OrderDataPaymentInfo> paymentsInfo;

  public static final String SERIALIZED_NAME_SHIPMENTS_INFO = "shipmentsInfo";
  @SerializedName(SERIALIZED_NAME_SHIPMENTS_INFO)
  private List<OrderDataShipmentInfo> shipmentsInfo;

  public static final String SERIALIZED_NAME_PROMOTIONS = "promotions";
  @SerializedName(SERIALIZED_NAME_PROMOTIONS)
  private List<OrderDataPromotionInfo> promotions;

  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  private List<CreateOrderRequestInitialPayment> payments;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private OrderCurrency currency = OrderCurrency.XXX;

  public static final String SERIALIZED_NAME_SUBTOTALS = "subtotals";
  @SerializedName(SERIALIZED_NAME_SUBTOTALS)
  private Map<String, OrderDataSubtotal> subtotals = new HashMap<>();

  public static final String SERIALIZED_NAME_TOTALS = "totals";
  @SerializedName(SERIALIZED_NAME_TOTALS)
  private Map<String, OrderDataTotal> totals = new HashMap<>();

  public static final String SERIALIZED_NAME_VAT_INCLUDED = "vatIncluded";
  @SerializedName(SERIALIZED_NAME_VAT_INCLUDED)
  private Boolean vatIncluded;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private OrderPostalAddress billingAddress;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "shippingAddress";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
  private OrderPostalAddress shippingAddress;

  public static final String SERIALIZED_NAME_CUSTOMER_INFO = "customerInfo";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_INFO)
  private OrderDataCustomerInfo customerInfo;

  public static final String SERIALIZED_NAME_CART_GRN = "cartGrn";
  @SerializedName(SERIALIZED_NAME_CART_GRN)
  private String cartGrn;

  public static final String SERIALIZED_NAME_ON_HOLD = "onHold";
  @SerializedName(SERIALIZED_NAME_ON_HOLD)
  private Boolean onHold;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public OrderCreateOrderRequest() {
  }

  public OrderCreateOrderRequest tenantId(String tenantId) {
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


  public OrderCreateOrderRequest number(String number) {
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


  public OrderCreateOrderRequest channel(String channel) {
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


  public OrderCreateOrderRequest market(String market) {
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


  public OrderCreateOrderRequest locale(String locale) {
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


  public OrderCreateOrderRequest items(List<OrderOrderDataItem> items) {
    this.items = items;
    return this;
  }

  public OrderCreateOrderRequest addItemsItem(OrderOrderDataItem itemsItem) {
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


  public OrderCreateOrderRequest paymentsInfo(List<OrderDataPaymentInfo> paymentsInfo) {
    this.paymentsInfo = paymentsInfo;
    return this;
  }

  public OrderCreateOrderRequest addPaymentsInfoItem(OrderDataPaymentInfo paymentsInfoItem) {
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
  @javax.annotation.Nullable
  public List<OrderDataPaymentInfo> getPaymentsInfo() {
    return paymentsInfo;
  }

  public void setPaymentsInfo(List<OrderDataPaymentInfo> paymentsInfo) {
    this.paymentsInfo = paymentsInfo;
  }


  public OrderCreateOrderRequest shipmentsInfo(List<OrderDataShipmentInfo> shipmentsInfo) {
    this.shipmentsInfo = shipmentsInfo;
    return this;
  }

  public OrderCreateOrderRequest addShipmentsInfoItem(OrderDataShipmentInfo shipmentsInfoItem) {
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
  @javax.annotation.Nullable
  public List<OrderDataShipmentInfo> getShipmentsInfo() {
    return shipmentsInfo;
  }

  public void setShipmentsInfo(List<OrderDataShipmentInfo> shipmentsInfo) {
    this.shipmentsInfo = shipmentsInfo;
  }


  public OrderCreateOrderRequest promotions(List<OrderDataPromotionInfo> promotions) {
    this.promotions = promotions;
    return this;
  }

  public OrderCreateOrderRequest addPromotionsItem(OrderDataPromotionInfo promotionsItem) {
    if (this.promotions == null) {
      this.promotions = new ArrayList<>();
    }
    this.promotions.add(promotionsItem);
    return this;
  }

   /**
   * Get promotions
   * @return promotions
  **/
  @javax.annotation.Nullable
  public List<OrderDataPromotionInfo> getPromotions() {
    return promotions;
  }

  public void setPromotions(List<OrderDataPromotionInfo> promotions) {
    this.promotions = promotions;
  }


  public OrderCreateOrderRequest payments(List<CreateOrderRequestInitialPayment> payments) {
    this.payments = payments;
    return this;
  }

  public OrderCreateOrderRequest addPaymentsItem(CreateOrderRequestInitialPayment paymentsItem) {
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
  @javax.annotation.Nullable
  public List<CreateOrderRequestInitialPayment> getPayments() {
    return payments;
  }

  public void setPayments(List<CreateOrderRequestInitialPayment> payments) {
    this.payments = payments;
  }


  public OrderCreateOrderRequest currency(OrderCurrency currency) {
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


  public OrderCreateOrderRequest subtotals(Map<String, OrderDataSubtotal> subtotals) {
    this.subtotals = subtotals;
    return this;
  }

  public OrderCreateOrderRequest putSubtotalsItem(String key, OrderDataSubtotal subtotalsItem) {
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


  public OrderCreateOrderRequest totals(Map<String, OrderDataTotal> totals) {
    this.totals = totals;
    return this;
  }

  public OrderCreateOrderRequest putTotalsItem(String key, OrderDataTotal totalsItem) {
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


  public OrderCreateOrderRequest vatIncluded(Boolean vatIncluded) {
    this.vatIncluded = vatIncluded;
    return this;
  }

   /**
   * Get vatIncluded
   * @return vatIncluded
  **/
  @javax.annotation.Nonnull
  public Boolean getVatIncluded() {
    return vatIncluded;
  }

  public void setVatIncluded(Boolean vatIncluded) {
    this.vatIncluded = vatIncluded;
  }


  public OrderCreateOrderRequest billingAddress(OrderPostalAddress billingAddress) {
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


  public OrderCreateOrderRequest shippingAddress(OrderPostalAddress shippingAddress) {
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


  public OrderCreateOrderRequest customerInfo(OrderDataCustomerInfo customerInfo) {
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


  public OrderCreateOrderRequest cartGrn(String cartGrn) {
    this.cartGrn = cartGrn;
    return this;
  }

   /**
   * Get cartGrn
   * @return cartGrn
  **/
  @javax.annotation.Nullable
  public String getCartGrn() {
    return cartGrn;
  }

  public void setCartGrn(String cartGrn) {
    this.cartGrn = cartGrn;
  }


  public OrderCreateOrderRequest onHold(Boolean onHold) {
    this.onHold = onHold;
    return this;
  }

   /**
   * Get onHold
   * @return onHold
  **/
  @javax.annotation.Nullable
  public Boolean getOnHold() {
    return onHold;
  }

  public void setOnHold(Boolean onHold) {
    this.onHold = onHold;
  }


  public OrderCreateOrderRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateOrderRequest orderCreateOrderRequest = (OrderCreateOrderRequest) o;
    return Objects.equals(this.tenantId, orderCreateOrderRequest.tenantId) &&
        Objects.equals(this.number, orderCreateOrderRequest.number) &&
        Objects.equals(this.channel, orderCreateOrderRequest.channel) &&
        Objects.equals(this.market, orderCreateOrderRequest.market) &&
        Objects.equals(this.locale, orderCreateOrderRequest.locale) &&
        Objects.equals(this.items, orderCreateOrderRequest.items) &&
        Objects.equals(this.paymentsInfo, orderCreateOrderRequest.paymentsInfo) &&
        Objects.equals(this.shipmentsInfo, orderCreateOrderRequest.shipmentsInfo) &&
        Objects.equals(this.promotions, orderCreateOrderRequest.promotions) &&
        Objects.equals(this.payments, orderCreateOrderRequest.payments) &&
        Objects.equals(this.currency, orderCreateOrderRequest.currency) &&
        Objects.equals(this.subtotals, orderCreateOrderRequest.subtotals) &&
        Objects.equals(this.totals, orderCreateOrderRequest.totals) &&
        Objects.equals(this.vatIncluded, orderCreateOrderRequest.vatIncluded) &&
        Objects.equals(this.billingAddress, orderCreateOrderRequest.billingAddress) &&
        Objects.equals(this.shippingAddress, orderCreateOrderRequest.shippingAddress) &&
        Objects.equals(this.customerInfo, orderCreateOrderRequest.customerInfo) &&
        Objects.equals(this.cartGrn, orderCreateOrderRequest.cartGrn) &&
        Objects.equals(this.onHold, orderCreateOrderRequest.onHold) &&
        Objects.equals(this.notes, orderCreateOrderRequest.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, number, channel, market, locale, items, paymentsInfo, shipmentsInfo, promotions, payments, currency, subtotals, totals, vatIncluded, billingAddress, shippingAddress, customerInfo, cartGrn, onHold, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateOrderRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    paymentsInfo: ").append(toIndentedString(paymentsInfo)).append("\n");
    sb.append("    shipmentsInfo: ").append(toIndentedString(shipmentsInfo)).append("\n");
    sb.append("    promotions: ").append(toIndentedString(promotions)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    subtotals: ").append(toIndentedString(subtotals)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
    sb.append("    vatIncluded: ").append(toIndentedString(vatIncluded)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
    sb.append("    cartGrn: ").append(toIndentedString(cartGrn)).append("\n");
    sb.append("    onHold: ").append(toIndentedString(onHold)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("number");
    openapiFields.add("channel");
    openapiFields.add("market");
    openapiFields.add("locale");
    openapiFields.add("items");
    openapiFields.add("paymentsInfo");
    openapiFields.add("shipmentsInfo");
    openapiFields.add("promotions");
    openapiFields.add("payments");
    openapiFields.add("currency");
    openapiFields.add("subtotals");
    openapiFields.add("totals");
    openapiFields.add("vatIncluded");
    openapiFields.add("billingAddress");
    openapiFields.add("shippingAddress");
    openapiFields.add("customerInfo");
    openapiFields.add("cartGrn");
    openapiFields.add("onHold");
    openapiFields.add("notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("market");
    openapiRequiredFields.add("locale");
    openapiRequiredFields.add("items");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("subtotals");
    openapiRequiredFields.add("totals");
    openapiRequiredFields.add("vatIncluded");
    openapiRequiredFields.add("billingAddress");
    openapiRequiredFields.add("shippingAddress");
    openapiRequiredFields.add("customerInfo");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateOrderRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateOrderRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateOrderRequest is not found in the empty JSON string", OrderCreateOrderRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateOrderRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateOrderRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderCreateOrderRequest.openapiRequiredFields) {
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
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        OrderOrderDataItem.validateJsonElement(jsonArrayitems.get(i));
      };
      if (jsonObj.get("paymentsInfo") != null && !jsonObj.get("paymentsInfo").isJsonNull()) {
        JsonArray jsonArraypaymentsInfo = jsonObj.getAsJsonArray("paymentsInfo");
        if (jsonArraypaymentsInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("paymentsInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `paymentsInfo` to be an array in the JSON string but got `%s`", jsonObj.get("paymentsInfo").toString()));
          }

          // validate the optional field `paymentsInfo` (array)
          for (int i = 0; i < jsonArraypaymentsInfo.size(); i++) {
            OrderDataPaymentInfo.validateJsonElement(jsonArraypaymentsInfo.get(i));
          };
        }
      }
      if (jsonObj.get("shipmentsInfo") != null && !jsonObj.get("shipmentsInfo").isJsonNull()) {
        JsonArray jsonArrayshipmentsInfo = jsonObj.getAsJsonArray("shipmentsInfo");
        if (jsonArrayshipmentsInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipmentsInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipmentsInfo` to be an array in the JSON string but got `%s`", jsonObj.get("shipmentsInfo").toString()));
          }

          // validate the optional field `shipmentsInfo` (array)
          for (int i = 0; i < jsonArrayshipmentsInfo.size(); i++) {
            OrderDataShipmentInfo.validateJsonElement(jsonArrayshipmentsInfo.get(i));
          };
        }
      }
      if (jsonObj.get("promotions") != null && !jsonObj.get("promotions").isJsonNull()) {
        JsonArray jsonArraypromotions = jsonObj.getAsJsonArray("promotions");
        if (jsonArraypromotions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("promotions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `promotions` to be an array in the JSON string but got `%s`", jsonObj.get("promotions").toString()));
          }

          // validate the optional field `promotions` (array)
          for (int i = 0; i < jsonArraypromotions.size(); i++) {
            OrderDataPromotionInfo.validateJsonElement(jsonArraypromotions.get(i));
          };
        }
      }
      if (jsonObj.get("payments") != null && !jsonObj.get("payments").isJsonNull()) {
        JsonArray jsonArraypayments = jsonObj.getAsJsonArray("payments");
        if (jsonArraypayments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payments` to be an array in the JSON string but got `%s`", jsonObj.get("payments").toString()));
          }

          // validate the optional field `payments` (array)
          for (int i = 0; i < jsonArraypayments.size(); i++) {
            CreateOrderRequestInitialPayment.validateJsonElement(jsonArraypayments.get(i));
          };
        }
      }
      // validate the required field `currency`
      OrderCurrency.validateJsonElement(jsonObj.get("currency"));
      // validate the required field `billingAddress`
      OrderPostalAddress.validateJsonElement(jsonObj.get("billingAddress"));
      // validate the required field `shippingAddress`
      OrderPostalAddress.validateJsonElement(jsonObj.get("shippingAddress"));
      // validate the required field `customerInfo`
      OrderDataCustomerInfo.validateJsonElement(jsonObj.get("customerInfo"));
      if ((jsonObj.get("cartGrn") != null && !jsonObj.get("cartGrn").isJsonNull()) && !jsonObj.get("cartGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cartGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cartGrn").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateOrderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateOrderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateOrderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateOrderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateOrderRequest>() {
           @Override
           public void write(JsonWriter out, OrderCreateOrderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateOrderRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateOrderRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateOrderRequest
  * @throws IOException if the JSON string is invalid with respect to OrderCreateOrderRequest
  */
  public static OrderCreateOrderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateOrderRequest.class);
  }

 /**
  * Convert an instance of OrderCreateOrderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

