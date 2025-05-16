package Ejemplo4;

public sealed class Vehiculo permits Auto, Camion { }

final class Auto extends Vehiculo { }
final class Camion extends Vehiculo { }


