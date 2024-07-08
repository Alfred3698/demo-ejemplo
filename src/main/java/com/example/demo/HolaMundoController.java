/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.ui.Model;
import com.example.demo.dto.ImcDto;
import com.example.demo.service.ImcService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Imc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author jajimenez
 */
@Controller
public class HolaMundoController {



    @GetMapping("/holaMundo")
    public String holaMundo(Model modelo) {
        modelo.addAttribute("mensaje", "hola Alfredo");
        return "hola";
    }

    @PostMapping("/holaMundo")
    public void saveImc(@RequestBody ImcDto imcDto) {
        System.out.println("Hola desde saveImc--->" + imcDto.getNombre());
        Imc imc = new Imc();
        imc.setNombre(imcDto.getNombre());
        //imcService.saveImc(imc);
    }
}
