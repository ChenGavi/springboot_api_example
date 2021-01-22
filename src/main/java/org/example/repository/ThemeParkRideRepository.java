package org.example.repository;

import org.example.entity.ThemeParkRide;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {
    List<ThemeParkRide> findByName(String name);
}
