package com.java.zenyoga.dto.Response;

import java.util.List;

import java.util.Collections;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BasicResponse<T> {
    private String message;
    @Builder.Default
    private List<T> dataList = Collections.emptyList();
    private T data;
}
