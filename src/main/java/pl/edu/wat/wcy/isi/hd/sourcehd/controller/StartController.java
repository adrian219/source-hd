package pl.edu.wat.wcy.isi.hd.sourcehd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.edu.wat.wcy.isi.hd.sourcehd.service.CustomerService;

@Controller
public class StartController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="/customers/add", method= RequestMethod.GET)
    public @ResponseBody String displayStartPage(@RequestParam Integer count){
        customerService.addRandomData(count);

        return "add " + count + " customers";
    }
}
