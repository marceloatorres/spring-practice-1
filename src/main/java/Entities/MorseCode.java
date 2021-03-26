package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MorseCode {
    private String words;
    private String morseCode;
}
