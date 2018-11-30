package com.example.tyanai.gmap;

public class CouponData {
    private String mUserId;
    private String mDate;
    private String mPeriod;
    private String mKey;
    private String mAddressX;
    private String mAddressY;
    private String mStoreName;
    private String mStoreImageView;
    private String mContentsImageView;
    private String mContents;
    private String mContentsBackGroundColor;
    private String mDifference;
    //いくら割引されるのか、何%offなのか

    public String getUserId() {
        return mUserId;
    }
    public String getDate() {
        return mDate;
    }
    public String getPeriod() {
        return mPeriod;
    }
    public String getKey() {
        return mKey;
    }
    public String getAddressX() {
        return mAddressX;
    }
    public String getAddressY() {
        return mAddressY;
    }
    public String getStoreName() {
        return mStoreName;
    }
    public String getStoreImageView() {
        return mStoreImageView;
    }
    public String getContentsImageView() {
        return mContentsImageView;
    }
    public String getContents() {
        return mContents;
    }
    public String getContentsBackGroundColor() {
        return mContentsBackGroundColor;
    }

    public CouponData(String addressX,String addressY,String storeName){
        mAddressX = addressX;
        mAddressY = addressY;
        mStoreName = storeName;
    }
}
