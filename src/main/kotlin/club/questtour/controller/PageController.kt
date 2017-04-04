package club.questtour.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by sargisazaryan on 3/15/17.
 */
@Controller
class PageController {
    @RequestMapping(value = "/")
    fun mainPage():String{
        return "index"
    }

}