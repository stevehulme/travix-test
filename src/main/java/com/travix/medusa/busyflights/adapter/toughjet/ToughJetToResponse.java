package com.travix.medusa.busyflights.adapter.toughjet;

import com.travix.medusa.busyflights.adapter.ToResponseAdapter;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;
import org.springframework.stereotype.Component;

public class ToughJetToResponse implements ToResponseAdapter<ToughJetResponse>{

    @Override
    public BusyFlightsResponse adapt(ToughJetResponse supplierResponse) {
        return null;
    }
}
