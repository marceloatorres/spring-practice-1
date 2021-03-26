package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RomanNumber {
    private int decimal;
    private String roman;
}
