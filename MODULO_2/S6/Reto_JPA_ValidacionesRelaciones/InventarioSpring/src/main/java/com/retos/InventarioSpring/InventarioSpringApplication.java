package com.retos.InventarioSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class InventarioSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventarioSpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ProductoRepository productoRepo, MarcaRepository marcaRepo) {
        return (args) -> {
            Marca apple = new Marca("Apple");
            Marca samsung = new Marca("Samsung");
            marcaRepo.saveAll(List.of(apple, samsung));

            Producto p1 = new Producto("Laptop Lenovo", "Poderosa", 12500, samsung);
            Producto p2 = new Producto("Mouse Logitech", "Preciso", 350, apple);
            Producto p3 = new Producto("Teclado Mecánico", "Retroiluminado", 950, samsung);
            Producto p4 = new Producto("Monitor", "Alta definición", 3200, apple);
            productoRepo.saveAll(List.of(p1, p2, p3, p4));

            System.out.println("📦 Productos con precio mayor a 500:");
            productoRepo.findByPrecioGreaterThan(500)
                .forEach(System.out::println);

            System.out.println("\n🔍 Productos que contienen 'lap':");
            productoRepo.findByNombreContainingIgnoreCase("lap")
                .forEach(System.out::println);

            System.out.println("\n🎯 Productos con precio entre 400 y 1000:");
            productoRepo.findByPrecioBetween(400, 1000)
                .forEach(System.out::println);

            System.out.println("\n📘 Productos cuyo nombre empieza con 'm':");
            productoRepo.findByNombreStartingWithIgnoreCase("m")
                .forEach(System.out::println);

            System.out.println("\n📚 Productos por marca:");
            marcaRepo.findAll().forEach(marca -> {
                System.out.println("🏷️ " + marca.getNombre() + ":");
                productoRepo.findAll().stream()
                    .filter(p -> p.getMarca().getId().equals(marca.getId()))
                    .forEach(p -> System.out.println("   - " + p.getNombre()));
            });
        };
    }
}
