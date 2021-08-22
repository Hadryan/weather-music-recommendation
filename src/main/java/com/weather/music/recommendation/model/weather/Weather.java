package com.weather.music.recommendation.model.weather;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "WEATHER", schema = "dbo")
public class Weather implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SEARCH_ID")
    private Long searchId;

    @Column(name = "MAIN")
    private String main;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ICON_ID")
    private String icon;
}
