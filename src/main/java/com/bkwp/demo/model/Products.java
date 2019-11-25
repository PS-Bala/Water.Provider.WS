package com.bkwp.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Products
 */
@Document
public class Products {
    @Id
    private String id;
    private String type;
    private byte size;
    private Rating rating;
    private boolean isBranded;
    private long price;
    private long availableCount;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public byte getSize() {
        return size;
    }

    public void setSize(Byte value) {
        this.size = value;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating value) {
        this.rating = value;
    }

    public boolean getIsBranded() {
        return isBranded;
    }

    public void setIsBranded(boolean value) {
        this.isBranded = value;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long value) {
        this.price = value;
    }

    public long getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(long value) {
        this.availableCount = value;
    }
}

// Rating.java

class Rating {
    private long value;
    private long count;

    public long getValue() {
        return value;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void setValue(long value) {
        this.value = value;
    }

}
