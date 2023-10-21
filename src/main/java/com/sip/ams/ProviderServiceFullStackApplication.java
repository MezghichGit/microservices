package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.sip.ams.entities.Product;
import com.sip.ams.repositories.ProductRepository;

import java.util.stream.Stream;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderServiceFullStackApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProviderServiceFullStackApplication.class, args);
	}

	@Override
    public void run(String ... strings) throws Exception {
        Stream.of("Pencil", "Book", "Eraser").forEach(s->productRepository.save(new Product(s)));
        productRepository.findAll().forEach(s->System.out.println(s.getName()));
    }

    @Autowired
    private ProductRepository productRepository;

}
