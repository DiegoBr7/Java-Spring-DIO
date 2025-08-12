package br.com.dio.dto;

import br.com.dio.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
                             String name,
                             int anInt, BoardColumnKindEnum kind,
                             int cardsAmount
                             ) {
}
