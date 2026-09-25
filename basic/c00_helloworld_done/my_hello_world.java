package basic.c00_helloworld_done;

/*
esto es un comentario de varias lienas
no se ejecutara nada de lo que este aqui adentro
 */

public class my_hello_world {

    public static void main(){
            System.out.println("hola mundo");
            // escribe mi primer hola mundo
        division();
            main2();
        division();
            main3();
        division();
        explorer();
    }

    public static void main2(){
        System.out.println("Manuel Ceron");
        //escribe mi nombrre
    }
    public static void main3(){
        System.out.println("Hola");
        System.out.println("Mundo");
        // escribe dos lineas
    }
    public static void division(){
        System.out.println("-------------------");
        //escribe una liena para dividir los print
    }
    public static void explorer(){
        System.err.println("no se que hace esto pero lo estoy probando parce ");

    }

}
// simempre debe haber un metodo main definido en una clase o de lo contrario fallara el
// compitalador, el jwm porque busca siempre el main para ejecutar desde ese punto


// me canbia automaticamente el editor de codigo el nombre de mi archivo al nombre de la clase
// si cambio el nombre del arcivo me cambia el nombre de la vlase de forma aotomatica