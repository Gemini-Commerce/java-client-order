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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets BehaviorOptionsPaymentAction
 */
@JsonAdapter(BehaviorOptionsPaymentAction.Adapter.class)
public enum BehaviorOptionsPaymentAction {
  
  UNKNOWN("UNKNOWN"),
  
  DO_NOT_HANDLE("DO_NOT_HANDLE");

  private String value;

  BehaviorOptionsPaymentAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BehaviorOptionsPaymentAction fromValue(String value) {
    for (BehaviorOptionsPaymentAction b : BehaviorOptionsPaymentAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BehaviorOptionsPaymentAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final BehaviorOptionsPaymentAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BehaviorOptionsPaymentAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BehaviorOptionsPaymentAction.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    BehaviorOptionsPaymentAction.fromValue(value);
  }
}

