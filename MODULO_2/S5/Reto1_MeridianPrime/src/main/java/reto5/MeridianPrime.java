package reto5;

import reactor.core.publisher.Flux;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class MeridianPrime {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();

        Flux<String> trafico = Flux.interval(Duration.ofMillis(500))
            .map(i -> rand.nextInt(101))
            .filter(n -> n > 70)
            .map(n -> "🚗 Alerta: Congestión del " + n + "% en Avenida Solar");

        Flux<String> contaminacion = Flux.interval(Duration.ofMillis(600))
            .map(i -> rand.nextInt(100))
            .filter(n -> n > 50)
            .map(n -> "🌫️ Alerta: Contaminación alta (PM2.5: " + n + " ug/m3)");

        Flux<String> accidentes = Flux.interval(Duration.ofMillis(800))
            .map(i -> List.of("Baja", "Media", "Alta").get(rand.nextInt(3)))
            .filter(prioridad -> prioridad.equals("Alta"))
            .map(p -> "🚑 Emergencia vial: Accidente con prioridad Alta");

        Flux<String> trenes = Flux.interval(Duration.ofMillis(700))
            .map(i -> rand.nextInt(11))
            .filter(n -> n > 5)
            .map(n -> "🚝 Tren maglev con retraso crítico: " + n + " minutos");

        Flux<String> semaforos = Flux.interval(Duration.ofMillis(400))
            .map(i -> List.of("Verde", "Amarillo", "Rojo").get(rand.nextInt(3)))
            .buffer(3, 1)
            .filter(l -> l.stream().allMatch(e -> e.equals("Rojo")))
            .map(l -> "🚦 Semáforo en Rojo detectado 3 veces seguidas en cruce Norte");

        Flux.merge(trafico, contaminacion, accidentes, trenes, semaforos)
            .subscribe(System.out::println);

        Thread.sleep(10000);
    }
}
