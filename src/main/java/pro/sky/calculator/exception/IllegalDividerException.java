package pro.sky.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IllegalDividerException extends IllegalArgumentException {

    public IllegalDividerException(String s) {
        super(s);
    }

    public IllegalDividerException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalDividerException(Throwable cause) {
        super(cause);
    }

    public IllegalDividerException() {
    }
}
