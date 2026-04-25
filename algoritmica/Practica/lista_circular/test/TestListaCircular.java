package test;

import lista_circular.*;

public class TestListaCircular {
    public static void main(){
        ListaCircular<String> l = new ListaCircular<>();
        l.addLast("Hola");
        l.addLast("mundo");
        l.addLast("como");
        l.addFirst("Hey!");
        l.addBetween(3, "y");
        l.addLast("va");
        l.addLast("hoy");
        l.addBetween(4, "Chiqui Tapia");

        String expected = "[\"Hey!\",\"Hola\",\"Chiqui Tapia\",\"y\",\"mundo\",\"como\",\"va\",\"hoy\"]";
        if (l.toString().equals(expected)){
            System.out.println("Lista circular doble enlazada de strings funciona segun lo esperado:\n" + l);
        }else{
             System.out.println("ERROR: Lista circular doble enlazada de strings no funciona segun lo esperado:\nValor esperado: "+expected +"\nObtenido: "+ l);
        }

        //---------------------------------------------------------------------------------------------------
        ListaCircular<Integer> l1 = new ListaCircular<>();
        l1.addLast(1);
        l1.addLast(2);
        l1.addBetween(1, 10);
        l1.addFirst(0);

        expected = "[0,1,10,2]";
        if (l1.toString().equals(expected)){
            System.out.println("Lista circular doble enlazada de enteros funciona segun lo esperado:\n" + l1);
        }else{
             System.out.println("ERROR: Lista circular doble enlazada de enteros no funciona segun lo esperado:\nValor esperado: "+expected +"\nObtenido: "+ l1);
        }

        //---------------------------------------------------------------------------------------------------   
        ListaCircular<Object> l2 = new ListaCircular<>();
        l2.addLast(30);
        l2.addLast("hola");
        l2.addFirst(4.33455);
        
        expected = "[\"4.33455\",\"30\",\"hola\"]";
        if (l2.toString().equals(expected)){
            System.out.println("Lista circular doble enlazada de genericos funciona segun lo esperado:\n" + l2);
        }else{
             System.out.println("ERROR: Lista circular doble enlazada de genericos no funciona segun lo esperado:\nValor esperado: "+expected +"\nObtenido: "+ l2);
        }
    }
}
