package data.response;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u001a\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0014J\t\u0010\u0015\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bH\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001c"}, d2 = {"Ldata/response/EventResponse;", "Landroid/os/Parcelable;", "listUserTimeline", "", "Ldata/response/UserTimeLine;", "(Ljava/util/List;)V", "getListUserTimeline", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "formatEventDate", "", "str", "groupDataIntoHashMap", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_developDebug"})
public final class EventResponse implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "userTimeline")
    private final java.util.List<data.response.UserTimeLine> listUserTimeline = null;
    public static final android.os.Parcelable.Creator<data.response.EventResponse> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<data.response.UserTimeLine>> groupDataIntoHashMap() {
        return null;
    }
    
    private final java.lang.String formatEventDate(java.lang.String str) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<data.response.UserTimeLine> getListUserTimeline() {
        return null;
    }
    
    public EventResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<data.response.UserTimeLine> listUserTimeline) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<data.response.UserTimeLine> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final data.response.EventResponse copy(@org.jetbrains.annotations.NotNull()
    java.util.List<data.response.UserTimeLine> listUserTimeline) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<data.response.EventResponse> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final data.response.EventResponse[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final data.response.EventResponse createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}