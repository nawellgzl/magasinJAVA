package com.nawell.magasin.config;

import com.nawell.magasin.repositories.CategoryRepository;
import com.nawell.magasin.repositories.ClientRepository;
import com.nawell.magasin.repositories.CommandeRepository;
import com.nawell.magasin.repositories.ProduitRepository;
import com.nawell.magasin.services.CategoryService;
import com.nawell.magasin.services.ClientService;
import com.nawell.magasin.services.CommandeService;
import com.nawell.magasin.services.ProduitService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ClientService clientServiceFactory(ClientRepository repository){
        return new ClientService(repository);
    }

    @Bean
    public CommandeService commandeServiceFactory(CommandeRepository repository){
        return new CommandeService(repository);
    }

    @Bean
    public ProduitService produitServiceFactory(ProduitRepository repository){
        return new ProduitService(repository);
    }

    @Bean
    public CategoryService categoryServiceFactory(CategoryRepository repository){
        return new CategoryService(repository);
    }


}
