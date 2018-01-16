package com.travix.medusa.busyflights.config;

import com.travix.medusa.busyflights.adapter.crazyair.CrazyAirToResponse;
import com.travix.medusa.busyflights.adapter.crazyair.RequestToCrazyAir;
import com.travix.medusa.busyflights.adapter.toughjet.RequestToToughJet;
import com.travix.medusa.busyflights.adapter.toughjet.ToughJetToResponse;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetRequest;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;
import com.travix.medusa.busyflights.service.BaseSupplierSearch;
import com.travix.medusa.busyflights.service.SupplierSearch;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BusyFlightsConfig {

    public static final String URL = "http://localhost:8080/serch";

    @Bean
    public CrazyAirToResponse crazyAirToResponse() {
        return new CrazyAirToResponse();
    }

    @Bean
    public RequestToCrazyAir requestToCrazyAir() {
        return new RequestToCrazyAir();
    }

    @Bean
    public ToughJetToResponse toughJetToResponse() {
        return new ToughJetToResponse();
    }

    @Bean
    public RequestToToughJet requestToToughJet() {
        return new RequestToToughJet();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public SupplierSearch toughJetSupplierSearch() {
        return new BaseSupplierSearch<ToughJetRequest, ToughJetResponse>(URL, requestToToughJet(), toughJetToResponse(), restTemplate());
    }

    @Bean
    public SupplierSearch crazyAirSupplierSearch() {
        return new BaseSupplierSearch<CrazyAirRequest, CrazyAirResponse>(URL, requestToCrazyAir(), crazyAirToResponse(), restTemplate());
    }
}
