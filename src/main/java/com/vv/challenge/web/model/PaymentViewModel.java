package com.vv.challenge.web.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentViewModel {

    @JsonProperty("numeroParcela")
    private Integer number;
    @JsonProperty("valor")
    private BigDecimal value;
    @JsonProperty("taxaJurosAoMes")
    private BigDecimal interestRate;

    public PaymentViewModel() {
    }

    public PaymentViewModel(Integer number, BigDecimal value, BigDecimal interestRate) {
        this.number = number;
        this.value = value;
        this.interestRate = interestRate;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }
}
