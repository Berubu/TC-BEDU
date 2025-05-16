package Ejemplo_04;

// esta clase es de base sellada, eso quiere decir que las clases permitidas pueden extenderla
public sealed class Vehiculo permits Auto, Camion { }

final class Auto extends Vehiculo { }
final class Camion extends Vehiculo { }
//class Moto extends Vehiculo { }

