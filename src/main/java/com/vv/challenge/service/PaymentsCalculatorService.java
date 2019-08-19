package com.vv.challenge.service;

import com.vv.challenge.web.model.PaymentViewModel;

import java.util.List;

public interface PaymentsCalculatorService {

    public List<PaymentViewModel> calculatePayments();

}
