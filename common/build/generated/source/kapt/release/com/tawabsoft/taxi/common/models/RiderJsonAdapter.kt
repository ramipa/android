// Code generated by moshi-kotlin-codegen. Do not edit.
package com.tawabsoft.taxi.common.models

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class RiderJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Rider>() {
  private val options: JsonReader.Options = JsonReader.Options.of("id", "firstName", "lastName",
      "media", "mobileNumber", "status", "email", "gender", "wallet", "address")

  private val longAdapter: JsonAdapter<Long> = moshi.adapter(Long::class.java, emptySet(), "id")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "firstName")

  private val nullableMediaAdapter: JsonAdapter<Media?> = moshi.adapter(Media::class.java,
      emptySet(), "media")

  private val nullableGenderAdapter: JsonAdapter<Gender?> = moshi.adapter(Gender::class.java,
      emptySet(), "gender")

  private val nullableListOfWalletItemAdapter: JsonAdapter<List<WalletItem>?> =
      moshi.adapter(Types.newParameterizedType(List::class.java, WalletItem::class.java),
      emptySet(), "wallet")

  @Volatile
  private var constructorRef: Constructor<Rider>? = null

  override fun toString(): String = buildString(27) {
      append("GeneratedJsonAdapter(").append("Rider").append(')') }

  override fun fromJson(reader: JsonReader): Rider {
    var id: Long? = 0L
    var firstName: String? = null
    var lastName: String? = null
    var media: Media? = null
    var mobileNumber: Long? = 0L
    var status: String? = null
    var email: String? = null
    var gender: Gender? = null
    var wallet: List<WalletItem>? = null
    var address: String? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          id = longAdapter.fromJson(reader) ?: throw Util.unexpectedNull("id", "id", reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          firstName = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          lastName = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        3 -> {
          media = nullableMediaAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 3).inv()
          mask0 = mask0 and 0xfffffff7.toInt()
        }
        4 -> {
          mobileNumber = longAdapter.fromJson(reader) ?: throw Util.unexpectedNull("mobileNumber",
              "mobileNumber", reader)
          // $mask = $mask and (1 shl 4).inv()
          mask0 = mask0 and 0xffffffef.toInt()
        }
        5 -> {
          status = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 5).inv()
          mask0 = mask0 and 0xffffffdf.toInt()
        }
        6 -> {
          email = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 6).inv()
          mask0 = mask0 and 0xffffffbf.toInt()
        }
        7 -> {
          gender = nullableGenderAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 7).inv()
          mask0 = mask0 and 0xffffff7f.toInt()
        }
        8 -> {
          wallet = nullableListOfWalletItemAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 8).inv()
          mask0 = mask0 and 0xfffffeff.toInt()
        }
        9 -> {
          address = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 9).inv()
          mask0 = mask0 and 0xfffffdff.toInt()
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
    val localConstructor: Constructor<Rider> = this.constructorRef ?:
        Rider::class.java.getDeclaredConstructor(Long::class.javaPrimitiveType, String::class.java,
        String::class.java, Media::class.java, Long::class.javaPrimitiveType, String::class.java,
        String::class.java, Gender::class.java, List::class.java, String::class.java,
        Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef =
        it }
    return localConstructor.newInstance(
        id,
        firstName,
        lastName,
        media,
        mobileNumber,
        status,
        email,
        gender,
        wallet,
        address,
        mask0,
        null
    )
  }

  override fun toJson(writer: JsonWriter, value: Rider?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("id")
    longAdapter.toJson(writer, value.id)
    writer.name("firstName")
    nullableStringAdapter.toJson(writer, value.firstName)
    writer.name("lastName")
    nullableStringAdapter.toJson(writer, value.lastName)
    writer.name("media")
    nullableMediaAdapter.toJson(writer, value.media)
    writer.name("mobileNumber")
    longAdapter.toJson(writer, value.mobileNumber)
    writer.name("status")
    nullableStringAdapter.toJson(writer, value.status)
    writer.name("email")
    nullableStringAdapter.toJson(writer, value.email)
    writer.name("gender")
    nullableGenderAdapter.toJson(writer, value.gender)
    writer.name("wallet")
    nullableListOfWalletItemAdapter.toJson(writer, value.wallet)
    writer.name("address")
    nullableStringAdapter.toJson(writer, value.address)
    writer.endObject()
  }
}
