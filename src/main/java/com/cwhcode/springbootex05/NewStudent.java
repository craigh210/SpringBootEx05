package com.cwhcode.springbootex05;

public class NewStudent {
    private String studentId;
    private String name;
    private String addressStreet;
    private String addressTown;
    private String addressState;
    private long addressZipCode;

    public NewStudent() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressTown() {
        return addressTown;
    }

    public void setAddressTown(String addressTown) {
        this.addressTown = addressTown;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public long getAddressZipCode() {
        return addressZipCode;
    }

    public void setAddressZipCode(long addressZipCode) {
        this.addressZipCode = addressZipCode;
    }
}
