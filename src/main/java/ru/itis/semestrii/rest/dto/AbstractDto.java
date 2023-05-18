package ru.itis.semestrii.rest.dto;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@MappedSuperclass
public class AbstractDto {
    private Long id;
}
