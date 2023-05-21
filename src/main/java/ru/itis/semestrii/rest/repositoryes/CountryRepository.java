package ru.itis.semestrii.rest.repositoryes;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ru.itis.semestrii.rest.model.Country;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Long> {

    @Query("SELECT c FROM Country c ")
    List<Country> getAll();

}

