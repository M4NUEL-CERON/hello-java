package basic.c04_conditionals_done;

/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var joven = 18;
        var viejo = 73;

        if (joven >= 18){
            System.out.println("puede votar porque tiene 18 o mas años");
        } else {
            System.out.println("no puede botar porque tiene menos de 18");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        if (viejo == joven){
            System.out.println("Resulta que la edad del joven y del viejo son la misma");

        } else {
            System.out.println("tiene diferente edad wow, el joven tiene: " + joven +  "y el mayor tiene: " + viejo);

        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        if ((viejo % 2) == 0 ){
           System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        var numero = 0;
        if ((numero % 2) == 0 ){
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        var numeroIsInRange = 101;
        if (numeroIsInRange < 100 && numeroIsInRange > 0){
            System.out.println("el numero: "+ numeroIsInRange + " esta en el rango de 1 100");
        } else {
            System.out.println("el numero: "+ numeroIsInRange + " no esta en el rango de 1 100");        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var day = "martes";
        switch (day){
            case "lunes":
                System.out.println("el dia es lunes");
                break;
                case "martes":
                    System.out.println("el dia es martes");
                break;
                case "miercoles":
                    System.out.println("el dia es miercoles");
                    break;
                    case "jueves":
                        System.out.println("el dia es jueves");
                        break;
                        case "viernes":
                            System.out.println("el dia es viernes");
                            break;
                            case "sabado":
                                System.out.println("el dia es sabado");
                                break;
                                case "domingo":
                                    System.out.println("el dia es Domingo");
                                    break;

        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        var nota = 0;
        var estado = "aprovado";


        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        Boolean acompañado = false;
        var edad = 14;

        if (acompañado || (edad > 15)){
            System.out.println(" puedes pasar parce porque tienes una de las dos cosas, tienes  al menos 15 años o vas acompañada");
        } else {
            System.out.println("no puedes pasar parce porque no tienes ninguna de las 2 cosas");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char vocal = 'a';
        char consonante = 'b';

        if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o'|| vocal == 'u'){
            System.out.println("el caracter es una vocal: a, e, i, o, u. ");

        } else {
            System.out.println("el caracter no es una vocal es una consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        var a = 1;
        var b = 2;
        var c = 3;

        if (a > b && a > c ){
            System.out.println("el numero 1 de la varible A, este es el numero superior");
        } else if (b > a && b > c ){
            System.out.println("el numero 2 de la varible B, este es el numero superior");
        } else {
            System.out.println("el numero 3 de la varible C, este es el numero superior");
        }

    }
}
