package com.example.myfuckingpc.gigshub1.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventUpdateItem {
    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("City")
    @Expose
    private String city;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Artist")
    @Expose
    private String artist;
    @SerializedName("NumberOfAttender")
    @Expose
    private Integer numberOfAttender;
    @SerializedName("Rating")
    @Expose
    private Integer rating;
    @SerializedName("Price")
    @Expose
    private Integer price;
    @SerializedName("IsDeleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("IsSale")
    @Expose
    private Boolean isSale;
    @SerializedName("OwnerName")
    @Expose
    private String ownerName;
    @SerializedName("OwnderFullname")
    @Expose
    private String ownderFullname;
    @SerializedName("ICusVerified")
    @Expose
    private Boolean iCusVerified;
    @SerializedName("Category")
    @Expose
    private String category;
    @SerializedName("DateTime")
    @Expose
    private String dateTime;
    @SerializedName("ImgPath")
    @Expose
    private String imgPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getNumberOfAttender() {
        return numberOfAttender;
    }

    public void setNumberOfAttender(Integer numberOfAttender) {
        this.numberOfAttender = numberOfAttender;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsSale() {
        return isSale;
    }

    public void setIsSale(Boolean isSale) {
        this.isSale = isSale;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnderFullname() {
        return ownderFullname;
    }

    public void setOwnderFullname(String ownderFullname) {
        this.ownderFullname = ownderFullname;
    }

    public Boolean getICusVerified() {
        return iCusVerified;
    }

    public void setICusVerified(Boolean iCusVerified) {
        this.iCusVerified = iCusVerified;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}