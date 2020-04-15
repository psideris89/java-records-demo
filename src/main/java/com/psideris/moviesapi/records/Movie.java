package com.psideris.moviesapi.records;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Movie(@JsonProperty("id") String id, @JsonProperty("director") Director director, @JsonProperty("released") Boolean released) {
}
