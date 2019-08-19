package com.vv.challenge.web.controller;

import com.vv.challenge.service.PaymentsCalculatorService;
import com.vv.challenge.web.model.PaymentViewModel;
import com.vv.challenge.web.model.PaymentsRequestViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="calculator",
        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PaymentsCalculatorController {

    @Autowired
    private PaymentsCalculatorService service;

    @PostMapping("/calculatePayments")
    public ResponseEntity<List<PaymentViewModel>> calculatePayments(
            @RequestBody PaymentsRequestViewModel viewModel) {
        return new ResponseEntity<>(service.calculatePayments(), HttpStatus.OK);
    }

}
