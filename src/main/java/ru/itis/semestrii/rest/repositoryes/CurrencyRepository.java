package ru.itis.semestrii.rest.repositoryes;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.itis.semestrii.rest.model.Currency;

import java.util.List;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {

    @Query("SELECT c FROM Currency c")
    List<Currency> findAll();

}
