package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.adapter.crazyair.CrazyAirToResponse;
import com.travix.medusa.busyflights.adapter.crazyair.RequestToCrazyAir;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class CrazyAirSearch implements SupplierSearch {

    private String url;

    private CrazyAirToResponse crazyAirToResponse;

    private RequestToCrazyAir requestToCrazyAir;

    @Autowired
    public CrazyAirSearch(final CrazyAirToResponse crazyAirToResponse,
                          final RequestToCrazyAir requestToCrazyAir,
                           @Value("crazy.air.url") final String url) {
        this.crazyAirToResponse = crazyAirToResponse;
        this.requestToCrazyAir = requestToCrazyAir;
        this.url = url;
    }

    @Override
    public Stream<BusyFlightsResponse> getFlights(BusyFlightsRequest busyFlightsRequest) {
        return null;
    }
}
