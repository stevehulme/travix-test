package com.travix.medusa.busyflights.adapter.crazyair;

import com.travix.medusa.busyflights.adapter.FromRequestAdapter;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirRequest;
import org.springframework.stereotype.Component;

public class RequestToCrazyAir implements FromRequestAdapter {

    public CrazyAirRequest adapt(BusyFlightsRequest busyFlightsRequest) {
        return null;
    }
}
