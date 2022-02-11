package com.example.mockapp;

public class FieldDataClass
{
    public String podatak_1;
    public String podatak_2;
    public int field_data_value;

    public FieldDataClass(String podatak_1, String podatak_2, int field_data_value) {
        this.podatak_1 = podatak_1;
        this.podatak_2 = podatak_2;
        this.field_data_value = field_data_value;
    }

    public String getPodatak_1() {
        return podatak_1;
    }

    public String getPodatak_2() {
        return podatak_2;
    }

    public int getField_data_value() {
        return field_data_value;
    }

}
