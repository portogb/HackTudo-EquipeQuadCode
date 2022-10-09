package com.quadcode.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quadcode.desafio.service.AnuncioService;
import com.quadcode.desafio.service.VendedorService;

@Controller
@RequestMapping("/anuncio")
public class AnuncioController {
    
    @Autowired
    private AnuncioService anuncioService;

    @Autowired
    private VendedorService vendedorService;

    @GetMapping("/imovel")
    public ModelAndView exibirImovel(){
        ModelAndView mv = new ModelAndView("anuncio/imovel");
        mv.addObject("imoveis", anuncioService.buscarTodos());
        mv.addObject("vendedores", vendedorService.buscarTodos());
        return mv;
    }
}
