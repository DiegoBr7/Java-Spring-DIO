package br.com.dio.dto;

import java.util.List;

public record BoardDetailDTO(
        Long id ,
        String name,
        List<BoardColumnDTO> columns


) {

}
