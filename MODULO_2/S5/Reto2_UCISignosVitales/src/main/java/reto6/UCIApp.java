package reto6;

import reactor.core.publisher.Flux;
import java.time.Duration;
import java.util.Random;

public class UCIApp {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();

        Flux<String> paciente1 = generarSignos(1);
        Flux<String> paciente2 = generarSignos(2);
        Flux<String> paciente3 = generarSignos(3);

        Flux.merge(paciente1, paciente2, paciente3)
            .delayElements(Duration.ofSeconds(1))
            .subscribe(System.out::println);

        Thread.sleep(15000);
    }

    public static Flux<String> generarSignos(int id) {
        Random rand = new Random();

        return Flux.interval(Duration.ofMillis(300))
            .map(i -> {
                int fc = 40 + rand.nextInt(100); // 40-140
                int paSys = 80 + rand.nextInt(80); // 80-160
                int paDia = 50 + rand.nextInt(50); // 50-100
                int spo2 = 85 + rand.nextInt(15);  // 85-100

                if (fc < 50 || fc > 120) return "⚠️ Paciente " + id + " - FC crítica: " + fc + " bpm";
                if (paSys < 90 || paSys > 140 || paDia < 60 || paDia > 90)
                    return "⚠️ Paciente " + id + " - PA crítica: " + paSys + "/" + paDia + " mmHg";
                if (spo2 < 90) return "⚠️ Paciente " + id + " - SpO2 baja: " + spo2 + "%";

                return null;
            })
            .filter(msg -> msg != null);
    }
}
