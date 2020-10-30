// Code generated by moshi-kotlin-codegen. Do not edit.
package com.tawabsoft.taxi.common.models

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class WalletItemJsonAdapter(
  moshi: Moshi
) : JsonAdapter<WalletItem>() {
  private val options: JsonReader.Options = JsonReader.Options.of("id", "amount", "currency")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "id")

  private val doubleAdapter: JsonAdapter<Double> = moshi.adapter(Double::class.java, emptySet(),
      "amount")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "currency")

  @Volatile
  private var constructorRef: Constructor<WalletItem>? = null

  override fun toString(): String = buildString(32) {
      append("GeneratedJsonAdapter(").append("WalletItem").append(')') }

  override fun fromJson(reader: JsonReader): WalletItem {
    var id: Int? = null
    var amount: Double? = 0.0
    var currency: String? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> id = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("id", "id", reader)
        1 -> {
          amount = doubleAdapter.fromJson(reader) ?: throw Util.unexpectedNull("amount", "amount",
              reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          currency = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    @Suppress("UNCHECKED_CAST")
    val localConstructor: Constructor<WalletItem> = this.constructorRef ?:
        WalletItem::class.java.getDeclaredConstructor(Int::class.javaPrimitiveType,
        Double::class.javaPrimitiveType, String::class.java, Int::class.javaPrimitiveType,
        Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }
    return localConstructor.newInstance(
        id ?: throw Util.missingProperty("id", "id", reader),
        amount,
        currency,
        mask0,
        null
    )
  }

  override fun toJson(writer: JsonWriter, value: WalletItem?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("id")
    intAdapter.toJson(writer, value.id)
    writer.name("amount")
    doubleAdapter.toJson(writer, value.amount)
    writer.name("currency")
    nullableStringAdapter.toJson(writer, value.currency)
    writer.endObject()
  }
}