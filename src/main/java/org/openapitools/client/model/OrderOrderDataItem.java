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
import org.openapitools.client.model.ItemProductConfigurationStep;
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
 * OrderOrderDataItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T17:02:39.571052266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderOrderDataItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PRODUCT_GRN = "productGrn";
  @SerializedName(SERIALIZED_NAME_PRODUCT_GRN)
  private String productGrn;

  public static final String SERIALIZED_NAME_QTY_ORDERED = "qtyOrdered";
  @SerializedName(SERIALIZED_NAME_QTY_ORDERED)
  private Long qtyOrdered;

  public static final String SERIALIZED_NAME_FREE_QTY = "freeQty";
  @SerializedName(SERIALIZED_NAME_FREE_QTY)
  private Long freeQty;

  public static final String SERIALIZED_NAME_QTY_COMMITTED = "qtyCommitted";
  @SerializedName(SERIALIZED_NAME_QTY_COMMITTED)
  private Long qtyCommitted;

  public static final String SERIALIZED_NAME_UNIT_SALE_PRICE = "unitSalePrice";
  @SerializedName(SERIALIZED_NAME_UNIT_SALE_PRICE)
  private OrderMoney unitSalePrice;

  public static final String SERIALIZED_NAME_UNIT_LIST_PRICE = "unitListPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_LIST_PRICE)
  private OrderMoney unitListPrice;

  public static final String SERIALIZED_NAME_UNIT_BASE_PRICE = "unitBasePrice";
  @SerializedName(SERIALIZED_NAME_UNIT_BASE_PRICE)
  private OrderMoney unitBasePrice;

  public static final String SERIALIZED_NAME_UNIT_VAT_AMOUNT = "unitVatAmount";
  @SerializedName(SERIALIZED_NAME_UNIT_VAT_AMOUNT)
  private OrderMoney unitVatAmount;

  public static final String SERIALIZED_NAME_ROW_SALE_PRICE = "rowSalePrice";
  @SerializedName(SERIALIZED_NAME_ROW_SALE_PRICE)
  private OrderMoney rowSalePrice;

  public static final String SERIALIZED_NAME_ROW_LIST_PRICE = "rowListPrice";
  @SerializedName(SERIALIZED_NAME_ROW_LIST_PRICE)
  private OrderMoney rowListPrice;

  public static final String SERIALIZED_NAME_ROW_VAT_AMOUNT = "rowVatAmount";
  @SerializedName(SERIALIZED_NAME_ROW_VAT_AMOUNT)
  private OrderMoney rowVatAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discountAmount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private OrderMoney discountAmount;

  public static final String SERIALIZED_NAME_ROW_BASE_PRICE = "rowBasePrice";
  @SerializedName(SERIALIZED_NAME_ROW_BASE_PRICE)
  private OrderMoney rowBasePrice;

  public static final String SERIALIZED_NAME_UNIT_CUSTOM_PRICE = "unitCustomPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_CUSTOM_PRICE)
  private OrderMoney unitCustomPrice;

  public static final String SERIALIZED_NAME_ROW_CUSTOM_PRICE = "rowCustomPrice";
  @SerializedName(SERIALIZED_NAME_ROW_CUSTOM_PRICE)
  private OrderMoney rowCustomPrice;

  public static final String SERIALIZED_NAME_VAT_PERCENTAGE = "vatPercentage";
  @SerializedName(SERIALIZED_NAME_VAT_PERCENTAGE)
  private Float vatPercentage;

  public static final String SERIALIZED_NAME_VAT_INACCURATE = "vatInaccurate";
  @SerializedName(SERIALIZED_NAME_VAT_INACCURATE)
  private Boolean vatInaccurate;

  public static final String SERIALIZED_NAME_VAT_CALCULATED = "vatCalculated";
  @SerializedName(SERIALIZED_NAME_VAT_CALCULATED)
  private Boolean vatCalculated;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_PRODUCT_SKU = "productSku";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SKU)
  private String productSku;

  public static final String SERIALIZED_NAME_PRODUCT_OPTIONS = "productOptions";
  @SerializedName(SERIALIZED_NAME_PRODUCT_OPTIONS)
  private String productOptions;

  public static final String SERIALIZED_NAME_PRODUCT_IMG = "productImg";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMG)
  private String productImg;

  public static final String SERIALIZED_NAME_PRODUCT_DATA = "productData";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DATA)
  private String productData;

  public static final String SERIALIZED_NAME_SHIPMENT_INFO_REFERENCE = "shipmentInfoReference";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_INFO_REFERENCE)
  private String shipmentInfoReference;

  public static final String SERIALIZED_NAME_PROMOTION_GRN = "promotionGrn";
  @SerializedName(SERIALIZED_NAME_PROMOTION_GRN)
  private List<String> promotionGrn = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRODUCT_IS_VIRTUAL = "productIsVirtual";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IS_VIRTUAL)
  private Boolean productIsVirtual;

  public static final String SERIALIZED_NAME_PRODUCT_CONFIGURATION = "productConfiguration";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CONFIGURATION)
  private List<ItemProductConfigurationStep> productConfiguration = new ArrayList<>();

  public OrderOrderDataItem() {
  }

  public OrderOrderDataItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public OrderOrderDataItem productGrn(String productGrn) {
    this.productGrn = productGrn;
    return this;
  }

  /**
   * Get productGrn
   * @return productGrn
   */
  @javax.annotation.Nullable
  public String getProductGrn() {
    return productGrn;
  }

  public void setProductGrn(String productGrn) {
    this.productGrn = productGrn;
  }


  public OrderOrderDataItem qtyOrdered(Long qtyOrdered) {
    this.qtyOrdered = qtyOrdered;
    return this;
  }

  /**
   * Get qtyOrdered
   * @return qtyOrdered
   */
  @javax.annotation.Nullable
  public Long getQtyOrdered() {
    return qtyOrdered;
  }

  public void setQtyOrdered(Long qtyOrdered) {
    this.qtyOrdered = qtyOrdered;
  }


  public OrderOrderDataItem freeQty(Long freeQty) {
    this.freeQty = freeQty;
    return this;
  }

  /**
   * Get freeQty
   * @return freeQty
   */
  @javax.annotation.Nullable
  public Long getFreeQty() {
    return freeQty;
  }

  public void setFreeQty(Long freeQty) {
    this.freeQty = freeQty;
  }


  public OrderOrderDataItem qtyCommitted(Long qtyCommitted) {
    this.qtyCommitted = qtyCommitted;
    return this;
  }

  /**
   * Get qtyCommitted
   * @return qtyCommitted
   */
  @javax.annotation.Nullable
  public Long getQtyCommitted() {
    return qtyCommitted;
  }

  public void setQtyCommitted(Long qtyCommitted) {
    this.qtyCommitted = qtyCommitted;
  }


  public OrderOrderDataItem unitSalePrice(OrderMoney unitSalePrice) {
    this.unitSalePrice = unitSalePrice;
    return this;
  }

  /**
   * Get unitSalePrice
   * @return unitSalePrice
   */
  @javax.annotation.Nullable
  public OrderMoney getUnitSalePrice() {
    return unitSalePrice;
  }

  public void setUnitSalePrice(OrderMoney unitSalePrice) {
    this.unitSalePrice = unitSalePrice;
  }


  public OrderOrderDataItem unitListPrice(OrderMoney unitListPrice) {
    this.unitListPrice = unitListPrice;
    return this;
  }

  /**
   * Get unitListPrice
   * @return unitListPrice
   */
  @javax.annotation.Nullable
  public OrderMoney getUnitListPrice() {
    return unitListPrice;
  }

  public void setUnitListPrice(OrderMoney unitListPrice) {
    this.unitListPrice = unitListPrice;
  }


  public OrderOrderDataItem unitBasePrice(OrderMoney unitBasePrice) {
    this.unitBasePrice = unitBasePrice;
    return this;
  }

  /**
   * Get unitBasePrice
   * @return unitBasePrice
   */
  @javax.annotation.Nullable
  public OrderMoney getUnitBasePrice() {
    return unitBasePrice;
  }

  public void setUnitBasePrice(OrderMoney unitBasePrice) {
    this.unitBasePrice = unitBasePrice;
  }


  public OrderOrderDataItem unitVatAmount(OrderMoney unitVatAmount) {
    this.unitVatAmount = unitVatAmount;
    return this;
  }

  /**
   * Get unitVatAmount
   * @return unitVatAmount
   */
  @javax.annotation.Nullable
  public OrderMoney getUnitVatAmount() {
    return unitVatAmount;
  }

  public void setUnitVatAmount(OrderMoney unitVatAmount) {
    this.unitVatAmount = unitVatAmount;
  }


  public OrderOrderDataItem rowSalePrice(OrderMoney rowSalePrice) {
    this.rowSalePrice = rowSalePrice;
    return this;
  }

  /**
   * Get rowSalePrice
   * @return rowSalePrice
   */
  @javax.annotation.Nullable
  public OrderMoney getRowSalePrice() {
    return rowSalePrice;
  }

  public void setRowSalePrice(OrderMoney rowSalePrice) {
    this.rowSalePrice = rowSalePrice;
  }


  public OrderOrderDataItem rowListPrice(OrderMoney rowListPrice) {
    this.rowListPrice = rowListPrice;
    return this;
  }

  /**
   * Get rowListPrice
   * @return rowListPrice
   */
  @javax.annotation.Nullable
  public OrderMoney getRowListPrice() {
    return rowListPrice;
  }

  public void setRowListPrice(OrderMoney rowListPrice) {
    this.rowListPrice = rowListPrice;
  }


  public OrderOrderDataItem rowVatAmount(OrderMoney rowVatAmount) {
    this.rowVatAmount = rowVatAmount;
    return this;
  }

  /**
   * Get rowVatAmount
   * @return rowVatAmount
   */
  @javax.annotation.Nullable
  public OrderMoney getRowVatAmount() {
    return rowVatAmount;
  }

  public void setRowVatAmount(OrderMoney rowVatAmount) {
    this.rowVatAmount = rowVatAmount;
  }


  public OrderOrderDataItem discountAmount(OrderMoney discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

  /**
   * Get discountAmount
   * @return discountAmount
   */
  @javax.annotation.Nullable
  public OrderMoney getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(OrderMoney discountAmount) {
    this.discountAmount = discountAmount;
  }


  public OrderOrderDataItem rowBasePrice(OrderMoney rowBasePrice) {
    this.rowBasePrice = rowBasePrice;
    return this;
  }

  /**
   * Get rowBasePrice
   * @return rowBasePrice
   */
  @javax.annotation.Nullable
  public OrderMoney getRowBasePrice() {
    return rowBasePrice;
  }

  public void setRowBasePrice(OrderMoney rowBasePrice) {
    this.rowBasePrice = rowBasePrice;
  }


  public OrderOrderDataItem unitCustomPrice(OrderMoney unitCustomPrice) {
    this.unitCustomPrice = unitCustomPrice;
    return this;
  }

  /**
   * Get unitCustomPrice
   * @return unitCustomPrice
   */
  @javax.annotation.Nullable
  public OrderMoney getUnitCustomPrice() {
    return unitCustomPrice;
  }

  public void setUnitCustomPrice(OrderMoney unitCustomPrice) {
    this.unitCustomPrice = unitCustomPrice;
  }


  public OrderOrderDataItem rowCustomPrice(OrderMoney rowCustomPrice) {
    this.rowCustomPrice = rowCustomPrice;
    return this;
  }

  /**
   * Get rowCustomPrice
   * @return rowCustomPrice
   */
  @javax.annotation.Nullable
  public OrderMoney getRowCustomPrice() {
    return rowCustomPrice;
  }

  public void setRowCustomPrice(OrderMoney rowCustomPrice) {
    this.rowCustomPrice = rowCustomPrice;
  }


  public OrderOrderDataItem vatPercentage(Float vatPercentage) {
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


  public OrderOrderDataItem vatInaccurate(Boolean vatInaccurate) {
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


  public OrderOrderDataItem vatCalculated(Boolean vatCalculated) {
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


  public OrderOrderDataItem productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
   */
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public OrderOrderDataItem productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

  /**
   * Get productCode
   * @return productCode
   */
  @javax.annotation.Nullable
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public OrderOrderDataItem productSku(String productSku) {
    this.productSku = productSku;
    return this;
  }

  /**
   * Get productSku
   * @return productSku
   */
  @javax.annotation.Nullable
  public String getProductSku() {
    return productSku;
  }

  public void setProductSku(String productSku) {
    this.productSku = productSku;
  }


  public OrderOrderDataItem productOptions(String productOptions) {
    this.productOptions = productOptions;
    return this;
  }

  /**
   * Get productOptions
   * @return productOptions
   */
  @javax.annotation.Nullable
  public String getProductOptions() {
    return productOptions;
  }

  public void setProductOptions(String productOptions) {
    this.productOptions = productOptions;
  }


  public OrderOrderDataItem productImg(String productImg) {
    this.productImg = productImg;
    return this;
  }

  /**
   * Get productImg
   * @return productImg
   */
  @javax.annotation.Nullable
  public String getProductImg() {
    return productImg;
  }

  public void setProductImg(String productImg) {
    this.productImg = productImg;
  }


  public OrderOrderDataItem productData(String productData) {
    this.productData = productData;
    return this;
  }

  /**
   * Get productData
   * @return productData
   */
  @javax.annotation.Nullable
  public String getProductData() {
    return productData;
  }

  public void setProductData(String productData) {
    this.productData = productData;
  }


  public OrderOrderDataItem shipmentInfoReference(String shipmentInfoReference) {
    this.shipmentInfoReference = shipmentInfoReference;
    return this;
  }

  /**
   * Get shipmentInfoReference
   * @return shipmentInfoReference
   */
  @javax.annotation.Nullable
  public String getShipmentInfoReference() {
    return shipmentInfoReference;
  }

  public void setShipmentInfoReference(String shipmentInfoReference) {
    this.shipmentInfoReference = shipmentInfoReference;
  }


  public OrderOrderDataItem promotionGrn(List<String> promotionGrn) {
    this.promotionGrn = promotionGrn;
    return this;
  }

  public OrderOrderDataItem addPromotionGrnItem(String promotionGrnItem) {
    if (this.promotionGrn == null) {
      this.promotionGrn = new ArrayList<>();
    }
    this.promotionGrn.add(promotionGrnItem);
    return this;
  }

  /**
   * Get promotionGrn
   * @return promotionGrn
   */
  @javax.annotation.Nullable
  public List<String> getPromotionGrn() {
    return promotionGrn;
  }

  public void setPromotionGrn(List<String> promotionGrn) {
    this.promotionGrn = promotionGrn;
  }


  public OrderOrderDataItem productIsVirtual(Boolean productIsVirtual) {
    this.productIsVirtual = productIsVirtual;
    return this;
  }

  /**
   * Get productIsVirtual
   * @return productIsVirtual
   */
  @javax.annotation.Nullable
  public Boolean getProductIsVirtual() {
    return productIsVirtual;
  }

  public void setProductIsVirtual(Boolean productIsVirtual) {
    this.productIsVirtual = productIsVirtual;
  }


  public OrderOrderDataItem productConfiguration(List<ItemProductConfigurationStep> productConfiguration) {
    this.productConfiguration = productConfiguration;
    return this;
  }

  public OrderOrderDataItem addProductConfigurationItem(ItemProductConfigurationStep productConfigurationItem) {
    if (this.productConfiguration == null) {
      this.productConfiguration = new ArrayList<>();
    }
    this.productConfiguration.add(productConfigurationItem);
    return this;
  }

  /**
   * Get productConfiguration
   * @return productConfiguration
   */
  @javax.annotation.Nullable
  public List<ItemProductConfigurationStep> getProductConfiguration() {
    return productConfiguration;
  }

  public void setProductConfiguration(List<ItemProductConfigurationStep> productConfiguration) {
    this.productConfiguration = productConfiguration;
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
   * @return the OrderOrderDataItem instance itself
   */
  public OrderOrderDataItem putAdditionalProperty(String key, Object value) {
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
    OrderOrderDataItem orderOrderDataItem = (OrderOrderDataItem) o;
    return Objects.equals(this.id, orderOrderDataItem.id) &&
        Objects.equals(this.productGrn, orderOrderDataItem.productGrn) &&
        Objects.equals(this.qtyOrdered, orderOrderDataItem.qtyOrdered) &&
        Objects.equals(this.freeQty, orderOrderDataItem.freeQty) &&
        Objects.equals(this.qtyCommitted, orderOrderDataItem.qtyCommitted) &&
        Objects.equals(this.unitSalePrice, orderOrderDataItem.unitSalePrice) &&
        Objects.equals(this.unitListPrice, orderOrderDataItem.unitListPrice) &&
        Objects.equals(this.unitBasePrice, orderOrderDataItem.unitBasePrice) &&
        Objects.equals(this.unitVatAmount, orderOrderDataItem.unitVatAmount) &&
        Objects.equals(this.rowSalePrice, orderOrderDataItem.rowSalePrice) &&
        Objects.equals(this.rowListPrice, orderOrderDataItem.rowListPrice) &&
        Objects.equals(this.rowVatAmount, orderOrderDataItem.rowVatAmount) &&
        Objects.equals(this.discountAmount, orderOrderDataItem.discountAmount) &&
        Objects.equals(this.rowBasePrice, orderOrderDataItem.rowBasePrice) &&
        Objects.equals(this.unitCustomPrice, orderOrderDataItem.unitCustomPrice) &&
        Objects.equals(this.rowCustomPrice, orderOrderDataItem.rowCustomPrice) &&
        Objects.equals(this.vatPercentage, orderOrderDataItem.vatPercentage) &&
        Objects.equals(this.vatInaccurate, orderOrderDataItem.vatInaccurate) &&
        Objects.equals(this.vatCalculated, orderOrderDataItem.vatCalculated) &&
        Objects.equals(this.productName, orderOrderDataItem.productName) &&
        Objects.equals(this.productCode, orderOrderDataItem.productCode) &&
        Objects.equals(this.productSku, orderOrderDataItem.productSku) &&
        Objects.equals(this.productOptions, orderOrderDataItem.productOptions) &&
        Objects.equals(this.productImg, orderOrderDataItem.productImg) &&
        Objects.equals(this.productData, orderOrderDataItem.productData) &&
        Objects.equals(this.shipmentInfoReference, orderOrderDataItem.shipmentInfoReference) &&
        Objects.equals(this.promotionGrn, orderOrderDataItem.promotionGrn) &&
        Objects.equals(this.productIsVirtual, orderOrderDataItem.productIsVirtual) &&
        Objects.equals(this.productConfiguration, orderOrderDataItem.productConfiguration)&&
        Objects.equals(this.additionalProperties, orderOrderDataItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productGrn, qtyOrdered, freeQty, qtyCommitted, unitSalePrice, unitListPrice, unitBasePrice, unitVatAmount, rowSalePrice, rowListPrice, rowVatAmount, discountAmount, rowBasePrice, unitCustomPrice, rowCustomPrice, vatPercentage, vatInaccurate, vatCalculated, productName, productCode, productSku, productOptions, productImg, productData, shipmentInfoReference, promotionGrn, productIsVirtual, productConfiguration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderOrderDataItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productGrn: ").append(toIndentedString(productGrn)).append("\n");
    sb.append("    qtyOrdered: ").append(toIndentedString(qtyOrdered)).append("\n");
    sb.append("    freeQty: ").append(toIndentedString(freeQty)).append("\n");
    sb.append("    qtyCommitted: ").append(toIndentedString(qtyCommitted)).append("\n");
    sb.append("    unitSalePrice: ").append(toIndentedString(unitSalePrice)).append("\n");
    sb.append("    unitListPrice: ").append(toIndentedString(unitListPrice)).append("\n");
    sb.append("    unitBasePrice: ").append(toIndentedString(unitBasePrice)).append("\n");
    sb.append("    unitVatAmount: ").append(toIndentedString(unitVatAmount)).append("\n");
    sb.append("    rowSalePrice: ").append(toIndentedString(rowSalePrice)).append("\n");
    sb.append("    rowListPrice: ").append(toIndentedString(rowListPrice)).append("\n");
    sb.append("    rowVatAmount: ").append(toIndentedString(rowVatAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    rowBasePrice: ").append(toIndentedString(rowBasePrice)).append("\n");
    sb.append("    unitCustomPrice: ").append(toIndentedString(unitCustomPrice)).append("\n");
    sb.append("    rowCustomPrice: ").append(toIndentedString(rowCustomPrice)).append("\n");
    sb.append("    vatPercentage: ").append(toIndentedString(vatPercentage)).append("\n");
    sb.append("    vatInaccurate: ").append(toIndentedString(vatInaccurate)).append("\n");
    sb.append("    vatCalculated: ").append(toIndentedString(vatCalculated)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    productOptions: ").append(toIndentedString(productOptions)).append("\n");
    sb.append("    productImg: ").append(toIndentedString(productImg)).append("\n");
    sb.append("    productData: ").append(toIndentedString(productData)).append("\n");
    sb.append("    shipmentInfoReference: ").append(toIndentedString(shipmentInfoReference)).append("\n");
    sb.append("    promotionGrn: ").append(toIndentedString(promotionGrn)).append("\n");
    sb.append("    productIsVirtual: ").append(toIndentedString(productIsVirtual)).append("\n");
    sb.append("    productConfiguration: ").append(toIndentedString(productConfiguration)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("productGrn");
    openapiFields.add("qtyOrdered");
    openapiFields.add("freeQty");
    openapiFields.add("qtyCommitted");
    openapiFields.add("unitSalePrice");
    openapiFields.add("unitListPrice");
    openapiFields.add("unitBasePrice");
    openapiFields.add("unitVatAmount");
    openapiFields.add("rowSalePrice");
    openapiFields.add("rowListPrice");
    openapiFields.add("rowVatAmount");
    openapiFields.add("discountAmount");
    openapiFields.add("rowBasePrice");
    openapiFields.add("unitCustomPrice");
    openapiFields.add("rowCustomPrice");
    openapiFields.add("vatPercentage");
    openapiFields.add("vatInaccurate");
    openapiFields.add("vatCalculated");
    openapiFields.add("productName");
    openapiFields.add("productCode");
    openapiFields.add("productSku");
    openapiFields.add("productOptions");
    openapiFields.add("productImg");
    openapiFields.add("productData");
    openapiFields.add("shipmentInfoReference");
    openapiFields.add("promotionGrn");
    openapiFields.add("productIsVirtual");
    openapiFields.add("productConfiguration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderOrderDataItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderOrderDataItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderOrderDataItem is not found in the empty JSON string", OrderOrderDataItem.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("productGrn") != null && !jsonObj.get("productGrn").isJsonNull()) && !jsonObj.get("productGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productGrn").toString()));
      }
      // validate the optional field `unitSalePrice`
      if (jsonObj.get("unitSalePrice") != null && !jsonObj.get("unitSalePrice").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("unitSalePrice"));
      }
      // validate the optional field `unitListPrice`
      if (jsonObj.get("unitListPrice") != null && !jsonObj.get("unitListPrice").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("unitListPrice"));
      }
      // validate the optional field `unitBasePrice`
      if (jsonObj.get("unitBasePrice") != null && !jsonObj.get("unitBasePrice").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("unitBasePrice"));
      }
      // validate the optional field `unitVatAmount`
      if (jsonObj.get("unitVatAmount") != null && !jsonObj.get("unitVatAmount").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("unitVatAmount"));
      }
      // validate the optional field `rowSalePrice`
      if (jsonObj.get("rowSalePrice") != null && !jsonObj.get("rowSalePrice").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("rowSalePrice"));
      }
      // validate the optional field `rowListPrice`
      if (jsonObj.get("rowListPrice") != null && !jsonObj.get("rowListPrice").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("rowListPrice"));
      }
      // validate the optional field `rowVatAmount`
      if (jsonObj.get("rowVatAmount") != null && !jsonObj.get("rowVatAmount").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("rowVatAmount"));
      }
      // validate the optional field `discountAmount`
      if (jsonObj.get("discountAmount") != null && !jsonObj.get("discountAmount").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("discountAmount"));
      }
      // validate the optional field `rowBasePrice`
      if (jsonObj.get("rowBasePrice") != null && !jsonObj.get("rowBasePrice").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("rowBasePrice"));
      }
      // validate the optional field `unitCustomPrice`
      if (jsonObj.get("unitCustomPrice") != null && !jsonObj.get("unitCustomPrice").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("unitCustomPrice"));
      }
      // validate the optional field `rowCustomPrice`
      if (jsonObj.get("rowCustomPrice") != null && !jsonObj.get("rowCustomPrice").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("rowCustomPrice"));
      }
      if ((jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonNull()) && !jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("productSku") != null && !jsonObj.get("productSku").isJsonNull()) && !jsonObj.get("productSku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productSku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productSku").toString()));
      }
      if ((jsonObj.get("productOptions") != null && !jsonObj.get("productOptions").isJsonNull()) && !jsonObj.get("productOptions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productOptions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productOptions").toString()));
      }
      if ((jsonObj.get("productImg") != null && !jsonObj.get("productImg").isJsonNull()) && !jsonObj.get("productImg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productImg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productImg").toString()));
      }
      if ((jsonObj.get("productData") != null && !jsonObj.get("productData").isJsonNull()) && !jsonObj.get("productData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productData").toString()));
      }
      if ((jsonObj.get("shipmentInfoReference") != null && !jsonObj.get("shipmentInfoReference").isJsonNull()) && !jsonObj.get("shipmentInfoReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipmentInfoReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipmentInfoReference").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("promotionGrn") != null && !jsonObj.get("promotionGrn").isJsonNull() && !jsonObj.get("promotionGrn").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotionGrn` to be an array in the JSON string but got `%s`", jsonObj.get("promotionGrn").toString()));
      }
      if (jsonObj.get("productConfiguration") != null && !jsonObj.get("productConfiguration").isJsonNull()) {
        JsonArray jsonArrayproductConfiguration = jsonObj.getAsJsonArray("productConfiguration");
        if (jsonArrayproductConfiguration != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productConfiguration").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productConfiguration` to be an array in the JSON string but got `%s`", jsonObj.get("productConfiguration").toString()));
          }

          // validate the optional field `productConfiguration` (array)
          for (int i = 0; i < jsonArrayproductConfiguration.size(); i++) {
            ItemProductConfigurationStep.validateJsonElement(jsonArrayproductConfiguration.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderOrderDataItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderOrderDataItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderOrderDataItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderOrderDataItem.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderOrderDataItem>() {
           @Override
           public void write(JsonWriter out, OrderOrderDataItem value) throws IOException {
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
           public OrderOrderDataItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OrderOrderDataItem instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of OrderOrderDataItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderOrderDataItem
   * @throws IOException if the JSON string is invalid with respect to OrderOrderDataItem
   */
  public static OrderOrderDataItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderOrderDataItem.class);
  }

  /**
   * Convert an instance of OrderOrderDataItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

