package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@Service
public class SearchFlightsService {

    private List<SupplierSearch> supplierSearches;

    @Autowired
    public SearchFlightsService(List<SupplierSearch> supplierSearches) {
        this.supplierSearches = supplierSearches;
    }

    public Stream<BusyFlightsResponse> findFlights(BusyFlightsRequest busyFlightsRequest) {
       return supplierSearches.parallelStream()
               .flatMap(supplierSearch -> supplierSearch.getFlights(busyFlightsRequest).stream())
               .sorted(Comparator.comparingDouble(BusyFlightsResponse::getFare));
    }
}
