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
 * Gets or Sets BehaviorOptionsInventoryAction
 */
@JsonAdapter(BehaviorOptionsInventoryAction.Adapter.class)
public enum BehaviorOptionsInventoryAction {
  
  UNKNOWN("UNKNOWN"),
  
  DO_NOT_HANDLE("DO_NOT_HANDLE");

  private String value;

  BehaviorOptionsInventoryAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BehaviorOptionsInventoryAction fromValue(String value) {
    for (BehaviorOptionsInventoryAction b : BehaviorOptionsInventoryAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BehaviorOptionsInventoryAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final BehaviorOptionsInventoryAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BehaviorOptionsInventoryAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BehaviorOptionsInventoryAction.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    BehaviorOptionsInventoryAction.fromValue(value);
  }
}

