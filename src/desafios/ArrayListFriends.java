package desafios;

import java.util.ArrayList;

public class ArrayListFriends {
    public static void main(String[] args) {

        ArrayList<String> friends = new ArrayList<>();
        friends.add("Marcelo");
        friends.add("Fabiana");
        friends.add("Anthony");
        friends.add("Matheus");
        friends.add("João");


        System.out.println("Tamanho do array: " + friends.size());

        for (String friend : friends) {
            System.out.println("Amigos: " + friend);
        }
    }
}
// Sintaxe ArrayList
//  ArrayList <String>> contatos = new ArrayList <> ();
