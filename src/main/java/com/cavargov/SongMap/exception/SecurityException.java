package com.cavargov.SongMap.exception;

import java.io.Serial;

public class SecurityException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public SecurityException(String message) {
        super(message);
    }

    public SecurityException(String message, Throwable cause) {
        super(message, cause);
    }

}
