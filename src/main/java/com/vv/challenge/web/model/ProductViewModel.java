package com.vv.challenge.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ProductViewModel {

    @JsonProperty("codigo")
    private Integer code;
    @JsonProperty("nome")
    private String name;
    @JsonProperty("valor")
    private BigDecimal value;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
