
import java.util.Scanner;
public class OrdenarCafe{ 
public static void main(String[] args) {	
  
    System.out.println("Bienvenido a la maquina de cafe, Cual desea que sea el tamaño de su vaso, pequeno,mediano o Grande (Porfavor escribir la opcion tal cual esta puesta en la sentencia.) ?");
    Cafetera cafetera;
	Vaso vasosPequeno;
	Vaso vasosMediano;
	Vaso vasosGrande;
	Azucarero azuquero;
	MaquinaDeCafe maquinaDeCafe;

    cafetera = new Cafetera(50);
    vasosPequeno = new Vaso(5, 10);
    vasosMediano = new Vaso(5, 20);
    vasosGrande = new Vaso(5, 30);
    azuquero = new Azucarero(20);
   Scanner ingreso = new Scanner(System.in);

   String Recipiente = ingreso.nextLine();
    System.out.print("Cuantos vasos desea?");
    int Cantidad = ingreso.nextInt();
    System.out.println("Cuanta azucar desea?");
    int CantAzucar = ingreso.nextInt();
    maquinaDeCafe = new MaquinaDeCafe();
    maquinaDeCafe.setCafetera(cafetera);
    maquinaDeCafe.setVasoPequeno(vasosPequeno);
    maquinaDeCafe.setVasoMediano(vasosMediano);
    maquinaDeCafe.setVasoGrande(vasosGrande);
    maquinaDeCafe.setAzucar(azuquero);


    Vaso vaso = maquinaDeCafe.getTipoVaso(Recipiente);
    String resultado = maquinaDeCafe.getVasoDeCafe(vaso, Cantidad, CantAzucar);

System.out.println(resultado);
System.out.println(".... Usted ordeno: ");
System.out.print("Vasos de tamaño: ");
System.out.println(Recipiente);
System.out.print("Cantidad de vasos: ");
System.out.println(Cantidad);
System.out.print("y cantidad de azucar: ");
System.out.println(CantAzucar);
System.out.println("Que tenga un buen dia!");
       }
    }