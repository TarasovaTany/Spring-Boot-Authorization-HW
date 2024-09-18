package ru.netology.springbootauthorization.exeption;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<List<String>> handlerInvalidCredentials(InvalidCredentials e) {
        return ResponseEntity.badRequest().body(List.of(e.getMessage()));
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<List<String>> handlerUnauthorizedUser(UnauthorizedUser e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(List.of(e.getMessage()));

    }
}
