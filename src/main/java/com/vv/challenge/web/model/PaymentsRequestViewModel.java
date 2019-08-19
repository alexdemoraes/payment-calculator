package com.vv.challenge.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentsRequestViewModel {

    @JsonProperty("produto")
    private ProductViewModel product;
    @JsonProperty("condicaoPagamento")
    private PaymentTermsViewModel paymentTerms;

    public ProductViewModel getProduct() {
        return product;
    }

    public void setProduct(ProductViewModel product) {
        this.product = product;
    }

    public PaymentTermsViewModel getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(PaymentTermsViewModel paymentTerms) {
        this.paymentTerms = paymentTerms;
    }
}

