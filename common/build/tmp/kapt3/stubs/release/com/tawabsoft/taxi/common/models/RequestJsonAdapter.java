package com.tawabsoft.taxi.common.models;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010&\u001a\u00020\fH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/tawabsoft/taxi/common/models/RequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/tawabsoft/taxi/common/models/Request;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "constructorRef", "Ljava/lang/reflect/Constructor;", "listOfLatLngAdapter", "", "Lcom/google/android/gms/maps/model/LatLng;", "listOfStringAdapter", "", "nullableDoubleAdapter", "", "nullableDriverAdapter", "Lcom/tawabsoft/taxi/common/models/Driver;", "nullableIntAdapter", "", "nullableLongAdapter", "", "nullableRiderAdapter", "Lcom/tawabsoft/taxi/common/models/Rider;", "nullableServiceAdapter", "Lcom/tawabsoft/taxi/common/models/Service;", "nullableStatusAdapter", "Lcom/tawabsoft/taxi/common/models/Request$Status;", "nullableStringAdapter", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "common_release"})
public final class RequestJsonAdapter extends com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Request> {
    private final com.squareup.moshi.JsonReader.Options options = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Driver> nullableDriverAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Rider> nullableRiderAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Double> nullableDoubleAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Long> nullableLongAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.String> nullableStringAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Integer> nullableIntAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> listOfStringAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.google.android.gms.maps.model.LatLng>> listOfLatLngAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Request.Status> nullableStatusAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.tawabsoft.taxi.common.models.Service> nullableServiceAdapter = null;
    private volatile java.lang.reflect.Constructor<com.tawabsoft.taxi.common.models.Request> constructorRef;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tawabsoft.taxi.common.models.Request fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.common.models.Request value) {
    }
    
    public RequestJsonAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
}