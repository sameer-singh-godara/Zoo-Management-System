package org.example;

public class Discount extends Offer {
    private String code;
    private int lowerAge;
    private int upperAge;
    private float percentage;
    private int id;
    private int isOpen;


    public Discount(String code, int lowerAge, int upperAge, int percentage, int id, int isOpen) {
        this.code = code;
        this.lowerAge = lowerAge;
        this.upperAge = upperAge;
        this.percentage = percentage;
        this.id = id;
        this.isOpen = isOpen;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getLowerAge() {
        return lowerAge;
    }

    public void setLowerAge(int lowerAge) {
        this.lowerAge = lowerAge;
    }

    public int getUpperAge() {
        return upperAge;
    }

    public void setUpperAge(int upperAge) {
        this.upperAge = upperAge;
    }

    @Override
    public float getPercentage() {
        return percentage;
    }

    @Override
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getIsOpen() {
        return isOpen;
    }

    @Override
    public void setIsOpen(int isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return "Discount Percentage: " + this.getPercentage() + "% ; Coupon-Code: " + this.getCode();
    }
}
