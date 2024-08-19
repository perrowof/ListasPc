import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        ListaPilaDatos listaPilaDatos = new ListaPilaDatos();
        ListaColaDatos listado = new ListaColaDatos();

        System.out.print("Ingresa la cantidad de personas que quieres registrar: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++){
            System.out.println("Ingresa el usuario" + " " + i);
            System.out.print("Codigo del usuario: ");
            int codigo = scanner.nextInt();
            System.out.print("Nombre del usuario: ");
            String nombre = scanner.next();
            System.out.print("Telefono del usuario: ");
            int telefono = scanner.nextInt();
            System.out.print("Edad del usuario: ");
            int edad = scanner.nextInt();
            Usuario usuario = new Usuario(codigo, nombre, telefono, edad);
            listaPilaDatos.apilar(usuario);
            listado.ingresarUsuario(usuario);
        }

        System.out.println("Personas registradas en la lista organizados en tipo pila son: ");
        listaPilaDatos.mostrarDatos();
        System.out.println();

        System.out.println("Personas registradas en la lista organizada en tipo cola son: ");
        listado.visualizar();
        System.out.println();

        System.out.println("Lista de registro actualizada: ");
        listaPilaDatos.desapilar();
        listaPilaDatos.mostrarDatos();
        System.out.println();

        System.out.println("ListaC de registro actualizada: ");
        listado.eliminarDatosUsuario();
        listado.visualizar();
        System.out.println();

        System.out.println("numero de personas registradas: " + listaPilaDatos.numeroDatos());

        scanner.close();
    }
}
