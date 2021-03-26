package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Response {
    private boolean success;
    private Object object;
    private String message;

}
