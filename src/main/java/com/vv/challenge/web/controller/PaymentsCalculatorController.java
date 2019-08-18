package com.vv.challenge.web.controller;

import com.vv.challenge.web.model.PaymentViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("calculator")
public class PaymentsCalculatorController {

    @GetMapping("/calculatePayments")
    public ResponseEntity<List<PaymentViewModel>> calculatePayments() {
        return new ResponseEntity<>(dummyList(), HttpStatus.OK);
    }


    private List<PaymentViewModel> dummyList() {
        List<PaymentViewModel> list = new ArrayList<>();
        IntStream.range(1, 6).forEach(value ->
                list.add(new PaymentViewModel(value, new BigDecimal(value * 1000), new BigDecimal(value / 100)))
        );
        return list;
    }
}
