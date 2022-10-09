package com.quadcode.desafio.initial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.quadcode.desafio.model.Anuncio;
import com.quadcode.desafio.model.Vendedor;
import com.quadcode.desafio.service.AnuncioService;
import com.quadcode.desafio.service.VendedorService;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    private AnuncioService anuncioService;

    @Autowired
    private VendedorService vendedorService;
    
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Herbert Chagas");
        vendedor1.setContato("219333333");

        vendedorService.adicionar(vendedor1); 

        Anuncio anuncio1 = new Anuncio();
        anuncio1.setNome("Apartamento à venda com 40m², 1 quarto e sem vaga");
        anuncio1.setDescricao("O condomínio fica localizado em Rua São Paulo no bairro Liberdade em São Paulo. É bem localizado, próximo de EMEF Duque de Caxias, CEI Quintal da Criança, Santa Margiore, Museu do Tribunal de Justiça SP, Hospital Sancta Maggiore e Sesc Carmo.");
        anuncio1.setLocalizacao("Rua São Paulo, Liberdade, São Paulo");
        anuncio1.setValor( 180000.00);
        anuncio1.setVendedor(vendedor1);
        anuncioService.adicionar(anuncio1);

        Anuncio anuncio2 = new Anuncio();
        anuncio2.setNome("Apartamento à venda com 105m², 3 quartos e 1 vaga");
        anuncio2.setDescricao("O apartamento está a 6 minutos do Shopping Ibirapuera e Metrô. Próximo á: Supermercados, Hortifruti, Bancos, Posto de Gasolina, restaurantes, salão de beleza, tudo que é necessário para abastecer a sua casa sem usar carro.");
        anuncio2.setLocalizacao("Rua Inhambu, Vila Uberabinha, São Paulo");
        anuncio2.setValor(400000.00);
        anuncio2.setVendedor(vendedor1);
        anuncioService.adicionar(anuncio2);
    }
    
}
