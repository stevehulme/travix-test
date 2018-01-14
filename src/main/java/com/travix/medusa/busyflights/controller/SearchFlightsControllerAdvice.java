package com.travix.medusa.busyflights.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Optional;

@ControllerAdvice("com.travix.medusa.busyflights.controller")
public class SearchFlightsControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> baseException(final Exception e) {
        return error(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<String> error(
            final Exception exception, final HttpStatus httpStatus) {
        final String message =
                Optional.of(exception.getMessage()).orElse(exception.getClass().getSimpleName());
        return new ResponseEntity<>(message, httpStatus);
    }
}
