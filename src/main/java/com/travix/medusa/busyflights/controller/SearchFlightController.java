package com.travix.medusa.busyflights.controller;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.service.SearchFlightsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class SearchFlightController {

    private SearchFlightsService searchFlightsService;

    public SearchFlightController(SearchFlightsService searchFlightsService) {
        this.searchFlightsService = searchFlightsService;
    }

    @RequestMapping(value = "/search", method = POST)
    public ResponseEntity<List<BusyFlightsResponse>> getFlights(@Valid BusyFlightsRequest busyFlightsRequest) {
        return new ResponseEntity(searchFlightsService.findFlights(busyFlightsRequest).collect(Collectors.toList()), HttpStatus.OK);
    }
}
