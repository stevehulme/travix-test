package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;

import java.util.List;

public interface SupplierSearch {

    List<BusyFlightsResponse> getFlights(BusyFlightsRequest busyFlightsRequest);
}
