package com.simplecalculiator.simplecalculiator;

import com.simplecalculiator.simplecalculiator.domain.Enter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController
{
    @GetMapping("/greeting")

    public String greeting()
    {
        return "greeting";
    }

    @PostMapping("calc")
    public String calc (
            @RequestParam Double NumberOne,
            @RequestParam Double NumberTwo,
            @RequestParam char Operation,
            Map<String, Object> model )
    {
        Enter enter=new Enter(NumberOne, NumberTwo, Operation);
        Double exit=enter.calc();

        model.put("exit",exit);
        return "greeting";




    }

}










    /*
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    )
    {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "hello, letsCode!");
        return "main";
    }
}*/