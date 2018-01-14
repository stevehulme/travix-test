package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class ToughJetSupplier implements SupplierSearch {
    @Override
    public Stream<BusyFlightsResponse> getFlights(BusyFlightsRequest busyFlightsRequest) {
        return null;
    }
}
