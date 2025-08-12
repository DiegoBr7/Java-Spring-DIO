package br.com.dio.dto;

import java.time.OffsetDateTime;

public record CardDetails(

        long aLong,
        String title,
        String description,
        boolean blocked,
        OffsetDateTime blockedAt,
        String blockReason,
        int blocksAmount,
        Long columnId,
        String columnName
) {}
