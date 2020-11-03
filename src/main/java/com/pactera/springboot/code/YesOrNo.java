package com.pactera.springboot.code;

public enum YesOrNo {
    YES("是", "Y"),
    NO("否", "N");

    private String label;
    private String value;

    YesOrNo(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
