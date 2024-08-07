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
import org.openapitools.client.model.OptionImage;
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
 * ProductConfigurationStepOption
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-09T08:27:48.551903220Z[Etc/UTC]")
public class ProductConfigurationStepOption {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GRN = "grn";
  @SerializedName(SERIALIZED_NAME_GRN)
  private String grn;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_PRICE_VARIATION = "priceVariation";
  @SerializedName(SERIALIZED_NAME_PRICE_VARIATION)
  private OrderMoney priceVariation;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private OptionImage image;

  public static final String SERIALIZED_NAME_HAS_QUANTITY = "hasQuantity";
  @SerializedName(SERIALIZED_NAME_HAS_QUANTITY)
  private Boolean hasQuantity;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Long quantity;

  public ProductConfigurationStepOption() {
  }

  public ProductConfigurationStepOption id(String id) {
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


  public ProductConfigurationStepOption grn(String grn) {
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


  public ProductConfigurationStepOption label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public ProductConfigurationStepOption priceVariation(OrderMoney priceVariation) {
    this.priceVariation = priceVariation;
    return this;
  }

   /**
   * Get priceVariation
   * @return priceVariation
  **/
  @javax.annotation.Nullable
  public OrderMoney getPriceVariation() {
    return priceVariation;
  }

  public void setPriceVariation(OrderMoney priceVariation) {
    this.priceVariation = priceVariation;
  }


  public ProductConfigurationStepOption image(OptionImage image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  public OptionImage getImage() {
    return image;
  }

  public void setImage(OptionImage image) {
    this.image = image;
  }


  public ProductConfigurationStepOption hasQuantity(Boolean hasQuantity) {
    this.hasQuantity = hasQuantity;
    return this;
  }

   /**
   * Get hasQuantity
   * @return hasQuantity
  **/
  @javax.annotation.Nullable
  public Boolean getHasQuantity() {
    return hasQuantity;
  }

  public void setHasQuantity(Boolean hasQuantity) {
    this.hasQuantity = hasQuantity;
  }


  public ProductConfigurationStepOption quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductConfigurationStepOption productConfigurationStepOption = (ProductConfigurationStepOption) o;
    return Objects.equals(this.id, productConfigurationStepOption.id) &&
        Objects.equals(this.grn, productConfigurationStepOption.grn) &&
        Objects.equals(this.label, productConfigurationStepOption.label) &&
        Objects.equals(this.priceVariation, productConfigurationStepOption.priceVariation) &&
        Objects.equals(this.image, productConfigurationStepOption.image) &&
        Objects.equals(this.hasQuantity, productConfigurationStepOption.hasQuantity) &&
        Objects.equals(this.quantity, productConfigurationStepOption.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, grn, label, priceVariation, image, hasQuantity, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductConfigurationStepOption {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    grn: ").append(toIndentedString(grn)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    priceVariation: ").append(toIndentedString(priceVariation)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    hasQuantity: ").append(toIndentedString(hasQuantity)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
    openapiFields.add("grn");
    openapiFields.add("label");
    openapiFields.add("priceVariation");
    openapiFields.add("image");
    openapiFields.add("hasQuantity");
    openapiFields.add("quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductConfigurationStepOption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductConfigurationStepOption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductConfigurationStepOption is not found in the empty JSON string", ProductConfigurationStepOption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductConfigurationStepOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductConfigurationStepOption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("grn") != null && !jsonObj.get("grn").isJsonNull()) && !jsonObj.get("grn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grn").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      // validate the optional field `priceVariation`
      if (jsonObj.get("priceVariation") != null && !jsonObj.get("priceVariation").isJsonNull()) {
        OrderMoney.validateJsonElement(jsonObj.get("priceVariation"));
      }
      // validate the optional field `image`
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) {
        OptionImage.validateJsonElement(jsonObj.get("image"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductConfigurationStepOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductConfigurationStepOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductConfigurationStepOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductConfigurationStepOption.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductConfigurationStepOption>() {
           @Override
           public void write(JsonWriter out, ProductConfigurationStepOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductConfigurationStepOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductConfigurationStepOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductConfigurationStepOption
  * @throws IOException if the JSON string is invalid with respect to ProductConfigurationStepOption
  */
  public static ProductConfigurationStepOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductConfigurationStepOption.class);
  }

 /**
  * Convert an instance of ProductConfigurationStepOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

