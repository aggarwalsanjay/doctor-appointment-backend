package com.example.demo.reponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
@Setter
public class ErrorMessage extends Exception {
    String errorMessage;
    HttpStatus code;

    public ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
