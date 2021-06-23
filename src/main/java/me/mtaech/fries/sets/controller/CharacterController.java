package me.mtaech.fries.sets.controller;

import me.mtaech.fries.common.controller.BaseController;
import me.mtaech.fries.sets.entity.Characters;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value = "/character")
public class CharacterController extends BaseController<Characters> {

    @Override
    @PostMapping("/save")
    public String save(@RequestBody Characters characters) {
        return super.save(characters);
    }
}
