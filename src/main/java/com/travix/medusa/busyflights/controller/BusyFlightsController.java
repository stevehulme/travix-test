package com.travix.medusa.busyflights.controller;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class BusyFlightsController {

    @RequestMapping(value = "/search", method = POST)
    public ResponseEntity<List<BusyFlightsResponse>> getFlights(@Valid BusyFlightsRequest busyFlightsRequest) {
        return null;
    }
}
