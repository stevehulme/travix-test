package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.SupplierRequest;
import com.travix.medusa.busyflights.domain.SupplierResponse;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;

import java.util.stream.Stream;

public interface SupplierSearch {

    Stream<BusyFlightsResponse> getFlights(BusyFlightsRequest busyFlightsRequest);
}
