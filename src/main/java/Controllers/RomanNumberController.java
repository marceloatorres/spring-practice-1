package Controllers;

import Entities.Response;
import Entities.RomanNumber;
import Services.RomanNumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanNumberController {

    @GetMapping("/roman/{decimalNumber}")
    public Response getRoman(@PathVariable int decimalNumber) throws Exception{
        try{
            RomanNumber romanNumber = new RomanNumber(decimalNumber,RomanNumberService.printRoman(decimalNumber));
            Response response = new Response(true,romanNumber,"");
            return response;
        }catch(Exception e ){
            return new Response(false,null,"Ocurrió un error al intentar convertir decimal a romano.");
        }

    }
}
