package org.example.java_professional_renewed.json.ex_002_gson.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ivan Maksimchuk.
 */
public class Currency {

    private String name;

    private String namePlural;

    private String code;

    private String symbol;

    @SerializedName("symbolNative")
    private String nativeSymbol;

    private int decimalDigits;

    private double rounding;

    public Currency(String name, String namePlural, String code, String symbol, String nativeSymbol, int decimalDigits, double rounding) {
        this.name = name;
        this.namePlural = namePlural;
        this.code = code;
        this.symbol = symbol;
        this.nativeSymbol = nativeSymbol;
        this.decimalDigits = decimalDigits;
        this.rounding = rounding;
    }

    public Currency() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePlural() {
        return namePlural;
    }

    public void setNamePlural(String namePlural) {
        this.namePlural = namePlural;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getNativeSymbol() {
        return nativeSymbol;
    }

    public void setNativeSymbol(String nativeSymbol) {
        this.nativeSymbol = nativeSymbol;
    }

    public int getDecimalDigits() {
        return decimalDigits;
    }

    public void setDecimalDigits(int decimalDigits) {
        this.decimalDigits = decimalDigits;
    }

    public double getRounding() {
        return rounding;
    }

    public void setRounding(double rounding) {
        this.rounding = rounding;
    }
}
