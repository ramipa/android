// Code generated by moshi-kotlin-codegen. Do not edit.
package com.tawabsoft.taxi.common.networking.socket.interfaces

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class RemoteErrorJsonAdapter(
  moshi: Moshi
) : JsonAdapter<RemoteError>() {
  private val options: JsonReader.Options = JsonReader.Options.of("status", "message")

  private val errorStatusAdapter: JsonAdapter<ErrorStatus> = moshi.adapter(ErrorStatus::class.java,
      emptySet(), "status")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "message")

  @Volatile
  private var constructorRef: Constructor<RemoteError>? = null

  override fun toString(): String = buildString(33) {
      append("GeneratedJsonAdapter(").append("RemoteError").append(')') }

  override fun fromJson(reader: JsonReader): RemoteError {
    var status: ErrorStatus? = null
    var message: String? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> status = errorStatusAdapter.fromJson(reader) ?: throw Util.unexpectedNull("status",
            "status", reader)
        1 -> {
          message = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
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
    val localConstructor: Constructor<RemoteError> = this.constructorRef ?:
        RemoteError::class.java.getDeclaredConstructor(ErrorStatus::class.java, String::class.java,
        Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef =
        it }
    return localConstructor.newInstance(
        status ?: throw Util.missingProperty("status", "status", reader),
        message,
        mask0,
        null
    )
  }

  override fun toJson(writer: JsonWriter, value: RemoteError?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("status")
    errorStatusAdapter.toJson(writer, value.status)
    writer.name("message")
    nullableStringAdapter.toJson(writer, value.message)
    writer.endObject()
  }
}