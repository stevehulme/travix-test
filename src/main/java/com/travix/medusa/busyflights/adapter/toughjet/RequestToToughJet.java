package com.travix.medusa.busyflights.adapter.toughjet;

import com.travix.medusa.busyflights.adapter.FromRequestAdapter;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetRequest;
import org.springframework.stereotype.Component;

public class RequestToToughJet implements FromRequestAdapter{

    public ToughJetRequest adapt(BusyFlightsRequest busyFlightsRequest) {
        return null;
    }
}
