package com.travix.medusa.busyflights.adapter;

import com.travix.medusa.busyflights.domain.SupplierResponse;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;

public interface ToResponseAdapter <T extends SupplierResponse>  {

  BusyFlightsResponse adapt(T supplierResponse);
}
