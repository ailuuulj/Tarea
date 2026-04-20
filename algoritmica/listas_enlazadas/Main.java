
public class Main {
    public static void main(String[] args){  
        DoublyLinkedList<String> listString = new DoublyLinkedList<>();

        String a = "hola";
        String a1 = "mundo";

        listString.addLast(a);
        listString.addLast(a1);
        
        String e = listString.first();
        String e1 = listString.last();

        System.out.println("primero en lista:"+e);
        System.out.println("ultimo en lista:"+e1);


        DoublyLinkedList<Integer> listInt = new DoublyLinkedList<>();

        int num = 20;
        int num1 = 30;
        int num2 = 40;
        int num3 = 50;
        
        listInt.addLast(num);      
        listInt.addLast(num1);      
        listInt.addLast(num2);      
        listInt.addLast(num3); 

        int size = listInt.size(); 
        for (int i = 0; i < size ; i++){
            System.out.println(listInt.first());
            listInt.removeFirst();
        }

        System.out.printf("IsEmpty: %b", listInt.isEmpty());
    }

}
