package com.vv.challenge.service;

import com.vv.challenge.web.model.PaymentViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class PaymentsCalculatorServiceImpl implements PaymentsCalculatorService {


    @Override
    public List<PaymentViewModel> calculatePayments() {

        return dummyList();
    }

    private List<PaymentViewModel> dummyList() {
        List<PaymentViewModel> list = new ArrayList<>();
        IntStream.range(1, 6).forEach(value ->
                list.add(new PaymentViewModel(value, new BigDecimal(value * 1000), new BigDecimal(value / 100)))
        );
        return list;
    }



}
