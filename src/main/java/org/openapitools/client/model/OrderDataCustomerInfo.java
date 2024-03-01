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
 * OrderDataCustomerInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T09:30:33.882650478Z[Etc/UTC]")
public class OrderDataCustomerInfo {
  public static final String SERIALIZED_NAME_GRN = "grn";
  @SerializedName(SERIALIZED_NAME_GRN)
  private String grn;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_SEGMENT = "segment";
  @SerializedName(SERIALIZED_NAME_SEGMENT)
  private String segment;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_CERTIFIED_EMAIL = "certifiedEmail";
  @SerializedName(SERIALIZED_NAME_CERTIFIED_EMAIL)
  private String certifiedEmail;

  public static final String SERIALIZED_NAME_TAX_CODE = "taxCode";
  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private String taxCode;

  public static final String SERIALIZED_NAME_SDI_CODE = "sdiCode";
  @SerializedName(SERIALIZED_NAME_SDI_CODE)
  private String sdiCode;

  public static final String SERIALIZED_NAME_FISCAL_CODE = "fiscalCode";
  @SerializedName(SERIALIZED_NAME_FISCAL_CODE)
  private String fiscalCode;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_AGENT_GRN = "agentGrn";
  @SerializedName(SERIALIZED_NAME_AGENT_GRN)
  private String agentGrn;

  public OrderDataCustomerInfo() {
  }

  public OrderDataCustomerInfo grn(String grn) {
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


  public OrderDataCustomerInfo firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @javax.annotation.Nonnull
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public OrderDataCustomerInfo lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @javax.annotation.Nonnull
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public OrderDataCustomerInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public OrderDataCustomerInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public OrderDataCustomerInfo segment(String segment) {
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @javax.annotation.Nullable
  public String getSegment() {
    return segment;
  }

  public void setSegment(String segment) {
    this.segment = segment;
  }


  public OrderDataCustomerInfo data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  public OrderDataCustomerInfo certifiedEmail(String certifiedEmail) {
    this.certifiedEmail = certifiedEmail;
    return this;
  }

   /**
   * Get certifiedEmail
   * @return certifiedEmail
  **/
  @javax.annotation.Nullable
  public String getCertifiedEmail() {
    return certifiedEmail;
  }

  public void setCertifiedEmail(String certifiedEmail) {
    this.certifiedEmail = certifiedEmail;
  }


  public OrderDataCustomerInfo taxCode(String taxCode) {
    this.taxCode = taxCode;
    return this;
  }

   /**
   * Get taxCode
   * @return taxCode
  **/
  @javax.annotation.Nullable
  public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }


  public OrderDataCustomerInfo sdiCode(String sdiCode) {
    this.sdiCode = sdiCode;
    return this;
  }

   /**
   * Get sdiCode
   * @return sdiCode
  **/
  @javax.annotation.Nullable
  public String getSdiCode() {
    return sdiCode;
  }

  public void setSdiCode(String sdiCode) {
    this.sdiCode = sdiCode;
  }


  public OrderDataCustomerInfo fiscalCode(String fiscalCode) {
    this.fiscalCode = fiscalCode;
    return this;
  }

   /**
   * Get fiscalCode
   * @return fiscalCode
  **/
  @javax.annotation.Nullable
  public String getFiscalCode() {
    return fiscalCode;
  }

  public void setFiscalCode(String fiscalCode) {
    this.fiscalCode = fiscalCode;
  }


  public OrderDataCustomerInfo companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public OrderDataCustomerInfo agentGrn(String agentGrn) {
    this.agentGrn = agentGrn;
    return this;
  }

   /**
   * Get agentGrn
   * @return agentGrn
  **/
  @javax.annotation.Nullable
  public String getAgentGrn() {
    return agentGrn;
  }

  public void setAgentGrn(String agentGrn) {
    this.agentGrn = agentGrn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDataCustomerInfo orderDataCustomerInfo = (OrderDataCustomerInfo) o;
    return Objects.equals(this.grn, orderDataCustomerInfo.grn) &&
        Objects.equals(this.firstname, orderDataCustomerInfo.firstname) &&
        Objects.equals(this.lastname, orderDataCustomerInfo.lastname) &&
        Objects.equals(this.email, orderDataCustomerInfo.email) &&
        Objects.equals(this.phone, orderDataCustomerInfo.phone) &&
        Objects.equals(this.segment, orderDataCustomerInfo.segment) &&
        Objects.equals(this.data, orderDataCustomerInfo.data) &&
        Objects.equals(this.certifiedEmail, orderDataCustomerInfo.certifiedEmail) &&
        Objects.equals(this.taxCode, orderDataCustomerInfo.taxCode) &&
        Objects.equals(this.sdiCode, orderDataCustomerInfo.sdiCode) &&
        Objects.equals(this.fiscalCode, orderDataCustomerInfo.fiscalCode) &&
        Objects.equals(this.companyName, orderDataCustomerInfo.companyName) &&
        Objects.equals(this.agentGrn, orderDataCustomerInfo.agentGrn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grn, firstname, lastname, email, phone, segment, data, certifiedEmail, taxCode, sdiCode, fiscalCode, companyName, agentGrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDataCustomerInfo {\n");
    sb.append("    grn: ").append(toIndentedString(grn)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    certifiedEmail: ").append(toIndentedString(certifiedEmail)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    sdiCode: ").append(toIndentedString(sdiCode)).append("\n");
    sb.append("    fiscalCode: ").append(toIndentedString(fiscalCode)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    agentGrn: ").append(toIndentedString(agentGrn)).append("\n");
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
    openapiFields.add("grn");
    openapiFields.add("firstname");
    openapiFields.add("lastname");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("segment");
    openapiFields.add("data");
    openapiFields.add("certifiedEmail");
    openapiFields.add("taxCode");
    openapiFields.add("sdiCode");
    openapiFields.add("fiscalCode");
    openapiFields.add("companyName");
    openapiFields.add("agentGrn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("firstname");
    openapiRequiredFields.add("lastname");
    openapiRequiredFields.add("email");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDataCustomerInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDataCustomerInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDataCustomerInfo is not found in the empty JSON string", OrderDataCustomerInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDataCustomerInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDataCustomerInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderDataCustomerInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("grn") != null && !jsonObj.get("grn").isJsonNull()) && !jsonObj.get("grn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grn").toString()));
      }
      if (!jsonObj.get("firstname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstname").toString()));
      }
      if (!jsonObj.get("lastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastname").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("segment") != null && !jsonObj.get("segment").isJsonNull()) && !jsonObj.get("segment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `segment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("segment").toString()));
      }
      if ((jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if ((jsonObj.get("certifiedEmail") != null && !jsonObj.get("certifiedEmail").isJsonNull()) && !jsonObj.get("certifiedEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certifiedEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certifiedEmail").toString()));
      }
      if ((jsonObj.get("taxCode") != null && !jsonObj.get("taxCode").isJsonNull()) && !jsonObj.get("taxCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxCode").toString()));
      }
      if ((jsonObj.get("sdiCode") != null && !jsonObj.get("sdiCode").isJsonNull()) && !jsonObj.get("sdiCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdiCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdiCode").toString()));
      }
      if ((jsonObj.get("fiscalCode") != null && !jsonObj.get("fiscalCode").isJsonNull()) && !jsonObj.get("fiscalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fiscalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fiscalCode").toString()));
      }
      if ((jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonNull()) && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if ((jsonObj.get("agentGrn") != null && !jsonObj.get("agentGrn").isJsonNull()) && !jsonObj.get("agentGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentGrn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDataCustomerInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDataCustomerInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDataCustomerInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDataCustomerInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDataCustomerInfo>() {
           @Override
           public void write(JsonWriter out, OrderDataCustomerInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDataCustomerInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDataCustomerInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDataCustomerInfo
  * @throws IOException if the JSON string is invalid with respect to OrderDataCustomerInfo
  */
  public static OrderDataCustomerInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDataCustomerInfo.class);
  }

 /**
  * Convert an instance of OrderDataCustomerInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

