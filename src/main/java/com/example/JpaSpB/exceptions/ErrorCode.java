package com.example.JpaSpB.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION("Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY("Uncategorized error", HttpStatus.BAD_REQUEST),
    CATEGORY_EXISTED( "Category existed", HttpStatus.CONFLICT),
    USERNAME_INVALID( "Username must be at least {min} characters", HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD( "Password must be at least {min} characters", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED("User not existed", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED( "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED( "You do not have permission", HttpStatus.FORBIDDEN),
    INVALID_DOB( "Your age must be at least {min}", HttpStatus.BAD_REQUEST),

    ;

    ErrorCode(String message, HttpStatus statusCode) {

        this.message = message;
        this.statusCode = statusCode;
    }

    private int code;
    private String message;
    private HttpStatus statusCode;
}