package data.response;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fH\u00c6\u0003Ju\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010)\u001a\u00020$H\u00d6\u0001J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f\u00a8\u00060"}, d2 = {"Ldata/response/EverydayHealth;", "Landroid/os/Parcelable;", "activityClass", "", "activityId", "activitySubType", "activityType", "endTime", "remarks", "schoolId", "startTime", "referenceObject", "Ldata/response/ReferenceObject;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldata/response/ReferenceObject;)V", "getActivityClass", "()Ljava/lang/String;", "getActivityId", "getActivitySubType", "getActivityType", "getEndTime", "getReferenceObject", "()Ldata/response/ReferenceObject;", "getRemarks", "getSchoolId", "getStartTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_developDebug"})
public final class EverydayHealth implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "activityClass")
    private final java.lang.String activityClass = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "activityId")
    private final java.lang.String activityId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "activitySubType")
    private final java.lang.String activitySubType = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "activityType")
    private final java.lang.String activityType = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "endTime")
    private final java.lang.String endTime = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "remarks")
    private final java.lang.String remarks = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "schoolId")
    private final java.lang.String schoolId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "startTime")
    private final java.lang.String startTime = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "referenceObject")
    private final data.response.ReferenceObject referenceObject = null;
    public static final android.os.Parcelable.Creator<data.response.EverydayHealth> CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActivityClass() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActivityId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActivitySubType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActivityType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEndTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemarks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSchoolId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStartTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final data.response.ReferenceObject getReferenceObject() {
        return null;
    }
    
    public EverydayHealth(@org.jetbrains.annotations.Nullable()
    java.lang.String activityClass, @org.jetbrains.annotations.Nullable()
    java.lang.String activityId, @org.jetbrains.annotations.Nullable()
    java.lang.String activitySubType, @org.jetbrains.annotations.Nullable()
    java.lang.String activityType, @org.jetbrains.annotations.Nullable()
    java.lang.String endTime, @org.jetbrains.annotations.Nullable()
    java.lang.String remarks, @org.jetbrains.annotations.Nullable()
    java.lang.String schoolId, @org.jetbrains.annotations.Nullable()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    data.response.ReferenceObject referenceObject) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final data.response.ReferenceObject component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final data.response.EverydayHealth copy(@org.jetbrains.annotations.Nullable()
    java.lang.String activityClass, @org.jetbrains.annotations.Nullable()
    java.lang.String activityId, @org.jetbrains.annotations.Nullable()
    java.lang.String activitySubType, @org.jetbrains.annotations.Nullable()
    java.lang.String activityType, @org.jetbrains.annotations.Nullable()
    java.lang.String endTime, @org.jetbrains.annotations.Nullable()
    java.lang.String remarks, @org.jetbrains.annotations.Nullable()
    java.lang.String schoolId, @org.jetbrains.annotations.Nullable()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    data.response.ReferenceObject referenceObject) {
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
    public static final class Creator implements android.os.Parcelable.Creator<data.response.EverydayHealth> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final data.response.EverydayHealth[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final data.response.EverydayHealth createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}