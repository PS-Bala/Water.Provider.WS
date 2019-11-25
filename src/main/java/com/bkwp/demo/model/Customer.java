package com.bkwp.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
    @Id
    private String id;
    private String name;
    private long contactNumber;
    private String address;
    private ShoppedItem[] shoppedItems;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public long getContactNumber() { return contactNumber; }
    public void setContactNumber(long value) { this.contactNumber = value; }

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }

    public String getAddress() { return address; }
    public void setAddress(String value) { this.address = value; }

    public ShoppedItem[] getShoppedItems() { return shoppedItems; }
    public void setShoppedItems(ShoppedItem[] value) { this.shoppedItems = value; }
}

// ShoppedItem.java

class ShoppedItem {
    private String id;
    private long count;

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }

    public long getCount() { return count; }
    public void setCount(long value) { this.count = value; }
}
