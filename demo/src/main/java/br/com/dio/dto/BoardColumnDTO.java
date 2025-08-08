package br.com.dio.dto;

import br.com.dio.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
                             String name,
                             int order,
                             BoardColumnKindEnum kind,
                             int cardsAmount
                             ) {
}
