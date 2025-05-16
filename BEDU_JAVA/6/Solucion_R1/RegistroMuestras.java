package Solucion_R1;

import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {

        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        System.out.println("Muestras recibidas en orden:");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println((i + 1) + ". " + muestras.get(i));
        }

        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        System.out.println("\nEspecies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        HashMap<String, String> muestrasInvestigador = new HashMap<>();
        muestrasInvestigador.put("M-001", "Dra. López");
        muestrasInvestigador.put("M-002", "Dr. Hernández");
        muestrasInvestigador.put("M-003", "Dra. Rivera");

        System.out.println("\nAsignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        String idBuscar = "M-002";
        System.out.println("\nInvestigador responsable de la muestra " + idBuscar + ": "
                + muestrasInvestigador.get(idBuscar));
    }
}
