package com.handmadecode.amam.model;

import lombok.*;

import java.util.List;

@Getter @Setter
@RequiredArgsConstructor
public class ApiResponse<T> {
    @NonNull private T data;
    private List<String> errs;
}
