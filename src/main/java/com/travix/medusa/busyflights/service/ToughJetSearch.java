package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.adapter.crazyair.CrazyAirToResponse;
import com.travix.medusa.busyflights.adapter.crazyair.RequestToCrazyAir;
import com.travix.medusa.busyflights.adapter.toughjet.RequestToToughJet;
import com.travix.medusa.busyflights.adapter.toughjet.ToughJetToResponse;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetRequest;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Component
public class ToughJetSearch implements SupplierSearch {

    private String url;

    private ToughJetToResponse toughJetToResponse;

    private RequestToToughJet requestToToughJet;

    private RestTemplate restTemplate;

    @Autowired
    public ToughJetSearch(final ToughJetToResponse toughJetToResponse,
                          final RequestToToughJet requestToToughJet,
                          @Value("crazy.air.url") final String url,
                          final RestTemplate restTemplate) {
        this.toughJetToResponse = toughJetToResponse;
        this.requestToToughJet = requestToToughJet;
        this.url = url;
        this.restTemplate = restTemplate;
    }

    @Override
    public Stream<BusyFlightsResponse> getFlights(BusyFlightsRequest busyFlightsRequest) {
        return search(requestToToughJet.adapt(busyFlightsRequest)).stream().map(toughJetToResponse::adapt);
    }

    private List<ToughJetResponse> search(ToughJetRequest toughJetRequest) {
        return Arrays.asList(restTemplate.getForObject(url, ToughJetResponse[].class));
    }
}
