package Controllers;

import Entities.MorseCode;
import Entities.Response;
import Services.MorseCodeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class MorseCodeController {

    @GetMapping("/morse/{code}")
    public Response getMorseCode(@PathVariable String code) throws Exception {
        try{
            MorseCode morseCode = new MorseCode(code, MorseCodeService.convertToMorse(code.toLowerCase(Locale.ROOT)));
            Response response = new Response(true, morseCode,"");
            return response;
        }catch(Exception e ){
            return new Response(false, null, "Ocurrió un error al converir el texto a morse.");
        }
    }
}
