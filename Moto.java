public class Moto  {
 String color;
 String marca;
 int KM;
 String placa ;
 
 public static void main(String[] args) {
  Moto Moto1;
  Moto1 = new Moto();
  Moto1.color="negro";
  Moto1.marca="fz";
  Moto1.KM=100;
  System.out.println("el color de la moto es:"+Moto1.color);
  System.out.println("la marca de la ,moto es:"+Moto1.marca);
  System.out.println("el kilometre de la moto es:"+Moto1.KM);
  System.out.println("la paca es:"+Moto1.placa);

  Moto Moto2;
  Moto2 = new Moto();
  Moto2.color="rojo";
  Moto2.marca="Honda";
  Moto2.KM=200;
  System.out.println("el color de la moto es:"+Moto2.color);
  System.out.println("la marca de la ,moto es:"+Moto2.marca);
  System.out.println("el kilometre de la moto es:"+Moto2.KM);
  System.out.println("la paca es:"+Moto2.placa);

  Moto Moto3;
  Moto3 = new Moto();
  Moto3.color="azul";
  Moto3.marca="Hero";
  Moto3.KM=1000;
  System.out.println("el color de la moto es:"+Moto3.color);
  System.out.println("la marca de la ,moto es:"+Moto3.marca);
  System.out.println("el kilometre de la moto es:"+Moto3.KM);
  System.out.println("la paca es:"+Moto3.placa);






 }
}