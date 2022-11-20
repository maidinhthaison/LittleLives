package data.response;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001aH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\'"}, d2 = {"Ldata/response/CheckInOut;", "Landroid/os/Parcelable;", "checkinThumb", "", "checkinUrl", "schoolId", "msgParams", "Ldata/response/CheckInOut$MsgParams;", "referenceObject", "Ldata/response/ReferenceObject;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldata/response/CheckInOut$MsgParams;Ldata/response/ReferenceObject;)V", "getCheckinThumb", "()Ljava/lang/String;", "getCheckinUrl", "getMsgParams", "()Ldata/response/CheckInOut$MsgParams;", "getReferenceObject", "()Ldata/response/ReferenceObject;", "getSchoolId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "MsgParams", "app_developDebug"})
public final class CheckInOut implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "checkinThumb")
    private final java.lang.String checkinThumb = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "checkinUrl")
    private final java.lang.String checkinUrl = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "schoolId")
    private final java.lang.String schoolId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "msgParams")
    private final data.response.CheckInOut.MsgParams msgParams = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "referenceObject")
    private final data.response.ReferenceObject referenceObject = null;
    public static final android.os.Parcelable.Creator<data.response.CheckInOut> CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCheckinThumb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCheckinUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSchoolId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final data.response.CheckInOut.MsgParams getMsgParams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final data.response.ReferenceObject getReferenceObject() {
        return null;
    }
    
    public CheckInOut(@org.jetbrains.annotations.Nullable()
    java.lang.String checkinThumb, @org.jetbrains.annotations.Nullable()
    java.lang.String checkinUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String schoolId, @org.jetbrains.annotations.Nullable()
    data.response.CheckInOut.MsgParams msgParams, @org.jetbrains.annotations.Nullable()
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
    public final data.response.CheckInOut.MsgParams component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final data.response.ReferenceObject component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final data.response.CheckInOut copy(@org.jetbrains.annotations.Nullable()
    java.lang.String checkinThumb, @org.jetbrains.annotations.Nullable()
    java.lang.String checkinUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String schoolId, @org.jetbrains.annotations.Nullable()
    data.response.CheckInOut.MsgParams msgParams, @org.jetbrains.annotations.Nullable()
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
    public static final class Creator implements android.os.Parcelable.Creator<data.response.CheckInOut> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final data.response.CheckInOut[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final data.response.CheckInOut createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003J\t\u0010\u001f\u001a\u00020\u0016H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0016H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006&"}, d2 = {"Ldata/response/CheckInOut$MsgParams;", "Landroid/os/Parcelable;", "attendanceRecordId", "", "checkInDate", "childName", "rawCheckInDate", "schoolName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAttendanceRecordId", "()Ljava/lang/String;", "getCheckInDate", "getChildName", "getRawCheckInDate", "getSchoolName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "formatDateCheckInOut", "str", "formatDisplayCheckInOut", "originalString", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_developDebug"})
    public static final class MsgParams implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "attendanceRecordId")
        private final java.lang.String attendanceRecordId = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "checkInDate")
        private final java.lang.String checkInDate = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "childName")
        private final java.lang.String childName = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "rawCheckInDate")
        private final java.lang.String rawCheckInDate = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "schoolName")
        private final java.lang.String schoolName = null;
        public static final android.os.Parcelable.Creator<data.response.CheckInOut.MsgParams> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String formatDisplayCheckInOut(@org.jetbrains.annotations.NotNull()
        java.lang.String originalString) {
            return null;
        }
        
        private final java.lang.String formatDateCheckInOut(java.lang.String str) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAttendanceRecordId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCheckInDate() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getChildName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRawCheckInDate() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSchoolName() {
            return null;
        }
        
        public MsgParams(@org.jetbrains.annotations.Nullable()
        java.lang.String attendanceRecordId, @org.jetbrains.annotations.Nullable()
        java.lang.String checkInDate, @org.jetbrains.annotations.Nullable()
        java.lang.String childName, @org.jetbrains.annotations.Nullable()
        java.lang.String rawCheckInDate, @org.jetbrains.annotations.Nullable()
        java.lang.String schoolName) {
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
        
        @org.jetbrains.annotations.NotNull()
        public final data.response.CheckInOut.MsgParams copy(@org.jetbrains.annotations.Nullable()
        java.lang.String attendanceRecordId, @org.jetbrains.annotations.Nullable()
        java.lang.String checkInDate, @org.jetbrains.annotations.Nullable()
        java.lang.String childName, @org.jetbrains.annotations.Nullable()
        java.lang.String rawCheckInDate, @org.jetbrains.annotations.Nullable()
        java.lang.String schoolName) {
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
        public static final class Creator implements android.os.Parcelable.Creator<data.response.CheckInOut.MsgParams> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final data.response.CheckInOut.MsgParams[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final data.response.CheckInOut.MsgParams createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
}