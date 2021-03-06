package com.weather.music.recommendation.repository;

import com.weather.music.recommendation.model.weather.Climate;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Produces;

@ApplicationScoped
public class ClimateRepository implements PanacheRepository<Climate> {

}
