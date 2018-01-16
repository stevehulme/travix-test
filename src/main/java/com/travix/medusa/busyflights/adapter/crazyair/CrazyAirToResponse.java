package com.travix.medusa.busyflights.adapter.crazyair;

import com.travix.medusa.busyflights.adapter.ToResponseAdapter;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;
import org.springframework.stereotype.Component;

public class CrazyAirToResponse implements ToResponseAdapter<CrazyAirResponse> {

    @Override
    public BusyFlightsResponse adapt(CrazyAirResponse supplierResponse) {
        return null;
    }
}
