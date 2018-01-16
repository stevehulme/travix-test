package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.adapter.FromRequestAdapter;
import com.travix.medusa.busyflights.adapter.ToResponseAdapter;
import com.travix.medusa.busyflights.domain.SupplierRequest;
import com.travix.medusa.busyflights.domain.SupplierResponse;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Stream;

public class BaseSupplierSearch<Q extends SupplierRequest, S extends SupplierResponse> implements SupplierSearch {

    private String url;

    private FromRequestAdapter<Q> fromRequestAdapter;

    private ToResponseAdapter<S> toResponseAdapter;

    private RestTemplate restTemplate;

    public BaseSupplierSearch(String url, FromRequestAdapter fromRequestAdapter,
                              ToResponseAdapter toResponseAdapter, RestTemplate restTemplate) {
        this.url = url;
        this.fromRequestAdapter = fromRequestAdapter;
        this.toResponseAdapter = toResponseAdapter;
        this.restTemplate = restTemplate;
    }

    @Override
    public Stream<BusyFlightsResponse> getFlights(BusyFlightsRequest busyFlightsRequest) {
        return search(fromRequestAdapter.adapt(busyFlightsRequest)).stream().map(toResponseAdapter::adapt);
    }

    private List<S> search(Q request) {
        return exchangeAsList(url, request, new ParameterizedTypeReference<List<S>>() {});
    }

    private   List<S> exchangeAsList(String uri, Q request, ParameterizedTypeReference<List<S>> responseType) {
        return restTemplate.exchange(uri, HttpMethod.POST, null, responseType).getBody();
    }
}
