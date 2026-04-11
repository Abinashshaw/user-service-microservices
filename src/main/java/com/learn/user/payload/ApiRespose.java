package com.learn.user.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ApiRespose {

    private String message;
    private boolean success;
    private HttpStatus status;

}
