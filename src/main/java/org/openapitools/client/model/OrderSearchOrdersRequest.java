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
import org.openapitools.client.model.OrderOrderBy;
import org.openapitools.client.model.OrderPaymentFilter;
import org.openapitools.client.model.OrderStatusFilter;

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
 * OrderSearchOrdersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T11:05:15.601530751Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderSearchOrdersRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_SEARCH_QUERY = "searchQuery";
  @SerializedName(SERIALIZED_NAME_SEARCH_QUERY)
  private String searchQuery;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize;

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "pageToken";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private String pageToken;

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private List<OrderOrderBy> orderBy = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS_FILTER = "statusFilter";
  @SerializedName(SERIALIZED_NAME_STATUS_FILTER)
  private OrderStatusFilter statusFilter;

  public static final String SERIALIZED_NAME_FROM_DATE = "fromDate";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private OffsetDateTime fromDate;

  public static final String SERIALIZED_NAME_TO_DATE = "toDate";
  @SerializedName(SERIALIZED_NAME_TO_DATE)
  private OffsetDateTime toDate;

  public static final String SERIALIZED_NAME_PAYMENT_FILTER = "paymentFilter";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FILTER)
  private OrderPaymentFilter paymentFilter;

  public static final String SERIALIZED_NAME_AGENT_GRN = "agentGrn";
  @SerializedName(SERIALIZED_NAME_AGENT_GRN)
  private String agentGrn;

  public static final String SERIALIZED_NAME_UPDATED_AT_FROM = "updatedAtFrom";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_FROM)
  private OffsetDateTime updatedAtFrom;

  public static final String SERIALIZED_NAME_UPDATED_AT_TO = "updatedAtTo";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_TO)
  private OffsetDateTime updatedAtTo;

  public static final String SERIALIZED_NAME_ON_HOLD = "onHold";
  @SerializedName(SERIALIZED_NAME_ON_HOLD)
  private Boolean onHold;

  public OrderSearchOrdersRequest() {
  }

  public OrderSearchOrdersRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nonnull
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public OrderSearchOrdersRequest searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  /**
   * Get searchQuery
   * @return searchQuery
   */
  @javax.annotation.Nullable
  public String getSearchQuery() {
    return searchQuery;
  }

  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }


  public OrderSearchOrdersRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The maximum number of orders to return. The service may return fewer than this value. If unspecified, at most 10 orders will be returned. The maximum value is 100; values above 100 will be coerced to 100.
   * @return pageSize
   */
  @javax.annotation.Nullable
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public OrderSearchOrdersRequest pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * A page token, received from a previous &#x60;ListOrders&#x60; call. Provide this to retrieve the subsequent page.   When paginating, all other parameters provided to &#x60;ListOrders&#x60; must match the call that provided the page token.
   * @return pageToken
   */
  @javax.annotation.Nullable
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }


  public OrderSearchOrdersRequest orderBy(List<OrderOrderBy> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public OrderSearchOrdersRequest addOrderByItem(OrderOrderBy orderByItem) {
    if (this.orderBy == null) {
      this.orderBy = new ArrayList<>();
    }
    this.orderBy.add(orderByItem);
    return this;
  }

  /**
   * Get orderBy
   * @return orderBy
   */
  @javax.annotation.Nullable
  public List<OrderOrderBy> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<OrderOrderBy> orderBy) {
    this.orderBy = orderBy;
  }


  public OrderSearchOrdersRequest statusFilter(OrderStatusFilter statusFilter) {
    this.statusFilter = statusFilter;
    return this;
  }

  /**
   * Get statusFilter
   * @return statusFilter
   */
  @javax.annotation.Nullable
  public OrderStatusFilter getStatusFilter() {
    return statusFilter;
  }

  public void setStatusFilter(OrderStatusFilter statusFilter) {
    this.statusFilter = statusFilter;
  }


  public OrderSearchOrdersRequest fromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  /**
   * Get fromDate
   * @return fromDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getFromDate() {
    return fromDate;
  }

  public void setFromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
  }


  public OrderSearchOrdersRequest toDate(OffsetDateTime toDate) {
    this.toDate = toDate;
    return this;
  }

  /**
   * Get toDate
   * @return toDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getToDate() {
    return toDate;
  }

  public void setToDate(OffsetDateTime toDate) {
    this.toDate = toDate;
  }


  public OrderSearchOrdersRequest paymentFilter(OrderPaymentFilter paymentFilter) {
    this.paymentFilter = paymentFilter;
    return this;
  }

  /**
   * Get paymentFilter
   * @return paymentFilter
   */
  @javax.annotation.Nullable
  public OrderPaymentFilter getPaymentFilter() {
    return paymentFilter;
  }

  public void setPaymentFilter(OrderPaymentFilter paymentFilter) {
    this.paymentFilter = paymentFilter;
  }


  public OrderSearchOrdersRequest agentGrn(String agentGrn) {
    this.agentGrn = agentGrn;
    return this;
  }

  /**
   * Get agentGrn
   * @return agentGrn
   */
  @javax.annotation.Nullable
  public String getAgentGrn() {
    return agentGrn;
  }

  public void setAgentGrn(String agentGrn) {
    this.agentGrn = agentGrn;
  }


  public OrderSearchOrdersRequest updatedAtFrom(OffsetDateTime updatedAtFrom) {
    this.updatedAtFrom = updatedAtFrom;
    return this;
  }

  /**
   * Get updatedAtFrom
   * @return updatedAtFrom
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAtFrom() {
    return updatedAtFrom;
  }

  public void setUpdatedAtFrom(OffsetDateTime updatedAtFrom) {
    this.updatedAtFrom = updatedAtFrom;
  }


  public OrderSearchOrdersRequest updatedAtTo(OffsetDateTime updatedAtTo) {
    this.updatedAtTo = updatedAtTo;
    return this;
  }

  /**
   * Get updatedAtTo
   * @return updatedAtTo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAtTo() {
    return updatedAtTo;
  }

  public void setUpdatedAtTo(OffsetDateTime updatedAtTo) {
    this.updatedAtTo = updatedAtTo;
  }


  public OrderSearchOrdersRequest onHold(Boolean onHold) {
    this.onHold = onHold;
    return this;
  }

  /**
   * Get onHold
   * @return onHold
   */
  @javax.annotation.Nullable
  public Boolean getOnHold() {
    return onHold;
  }

  public void setOnHold(Boolean onHold) {
    this.onHold = onHold;
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
   * @return the OrderSearchOrdersRequest instance itself
   */
  public OrderSearchOrdersRequest putAdditionalProperty(String key, Object value) {
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
    OrderSearchOrdersRequest orderSearchOrdersRequest = (OrderSearchOrdersRequest) o;
    return Objects.equals(this.tenantId, orderSearchOrdersRequest.tenantId) &&
        Objects.equals(this.searchQuery, orderSearchOrdersRequest.searchQuery) &&
        Objects.equals(this.pageSize, orderSearchOrdersRequest.pageSize) &&
        Objects.equals(this.pageToken, orderSearchOrdersRequest.pageToken) &&
        Objects.equals(this.orderBy, orderSearchOrdersRequest.orderBy) &&
        Objects.equals(this.statusFilter, orderSearchOrdersRequest.statusFilter) &&
        Objects.equals(this.fromDate, orderSearchOrdersRequest.fromDate) &&
        Objects.equals(this.toDate, orderSearchOrdersRequest.toDate) &&
        Objects.equals(this.paymentFilter, orderSearchOrdersRequest.paymentFilter) &&
        Objects.equals(this.agentGrn, orderSearchOrdersRequest.agentGrn) &&
        Objects.equals(this.updatedAtFrom, orderSearchOrdersRequest.updatedAtFrom) &&
        Objects.equals(this.updatedAtTo, orderSearchOrdersRequest.updatedAtTo) &&
        Objects.equals(this.onHold, orderSearchOrdersRequest.onHold)&&
        Objects.equals(this.additionalProperties, orderSearchOrdersRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, searchQuery, pageSize, pageToken, orderBy, statusFilter, fromDate, toDate, paymentFilter, agentGrn, updatedAtFrom, updatedAtTo, onHold, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSearchOrdersRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    statusFilter: ").append(toIndentedString(statusFilter)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    paymentFilter: ").append(toIndentedString(paymentFilter)).append("\n");
    sb.append("    agentGrn: ").append(toIndentedString(agentGrn)).append("\n");
    sb.append("    updatedAtFrom: ").append(toIndentedString(updatedAtFrom)).append("\n");
    sb.append("    updatedAtTo: ").append(toIndentedString(updatedAtTo)).append("\n");
    sb.append("    onHold: ").append(toIndentedString(onHold)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("searchQuery");
    openapiFields.add("pageSize");
    openapiFields.add("pageToken");
    openapiFields.add("orderBy");
    openapiFields.add("statusFilter");
    openapiFields.add("fromDate");
    openapiFields.add("toDate");
    openapiFields.add("paymentFilter");
    openapiFields.add("agentGrn");
    openapiFields.add("updatedAtFrom");
    openapiFields.add("updatedAtTo");
    openapiFields.add("onHold");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderSearchOrdersRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderSearchOrdersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderSearchOrdersRequest is not found in the empty JSON string", OrderSearchOrdersRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderSearchOrdersRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("searchQuery") != null && !jsonObj.get("searchQuery").isJsonNull()) && !jsonObj.get("searchQuery").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchQuery` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchQuery").toString()));
      }
      if ((jsonObj.get("pageToken") != null && !jsonObj.get("pageToken").isJsonNull()) && !jsonObj.get("pageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageToken").toString()));
      }
      if (jsonObj.get("orderBy") != null && !jsonObj.get("orderBy").isJsonNull()) {
        JsonArray jsonArrayorderBy = jsonObj.getAsJsonArray("orderBy");
        if (jsonArrayorderBy != null) {
          // ensure the json data is an array
          if (!jsonObj.get("orderBy").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `orderBy` to be an array in the JSON string but got `%s`", jsonObj.get("orderBy").toString()));
          }

          // validate the optional field `orderBy` (array)
          for (int i = 0; i < jsonArrayorderBy.size(); i++) {
            OrderOrderBy.validateJsonElement(jsonArrayorderBy.get(i));
          };
        }
      }
      // validate the optional field `statusFilter`
      if (jsonObj.get("statusFilter") != null && !jsonObj.get("statusFilter").isJsonNull()) {
        OrderStatusFilter.validateJsonElement(jsonObj.get("statusFilter"));
      }
      // validate the optional field `paymentFilter`
      if (jsonObj.get("paymentFilter") != null && !jsonObj.get("paymentFilter").isJsonNull()) {
        OrderPaymentFilter.validateJsonElement(jsonObj.get("paymentFilter"));
      }
      if ((jsonObj.get("agentGrn") != null && !jsonObj.get("agentGrn").isJsonNull()) && !jsonObj.get("agentGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentGrn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderSearchOrdersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderSearchOrdersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderSearchOrdersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderSearchOrdersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderSearchOrdersRequest>() {
           @Override
           public void write(JsonWriter out, OrderSearchOrdersRequest value) throws IOException {
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
           public OrderSearchOrdersRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OrderSearchOrdersRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of OrderSearchOrdersRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderSearchOrdersRequest
   * @throws IOException if the JSON string is invalid with respect to OrderSearchOrdersRequest
   */
  public static OrderSearchOrdersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderSearchOrdersRequest.class);
  }

  /**
   * Convert an instance of OrderSearchOrdersRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

