package com.travix.medusa.busyflights.adapter;

import com.travix.medusa.busyflights.domain.SupplierRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;

public interface FromRequestAdapter<T extends SupplierRequest> {

    T adapt(BusyFlightsRequest busyFlightsRequest);

}
