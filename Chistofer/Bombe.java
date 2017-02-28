

import java.util.Scanner;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Bombe {

  static final String keyword = "HEIHITLER";
    public static void main(String[] args) {
        ENIGMA enigma = new ENIGMA();
        Scanner in = new Scanner(System.in);
        System.out.print("insert cyphertext: ");
       System.out.print(searchKey(in.nextLine()));
        System.out.println();
        System.out.println("Input key : ");
        
        
        enigma.encodeEnigma(in.nextLine(),in.nextLine(),in.nextLine());

    }

    public static char[] searchKey(String cyphertext) {
ENIGMA enigma = new ENIGMA();
        char key[] = new char[3];
        key[0] = 'A';
        key[1] = 'A';
        key[2] = 'A';
        for (key[0] = 'A'; key[0] <= 'Z'; key[0]++) {
            for (key[1] = 'A'; key[1] <= 'Z'; key[1]++) {
                for (key[2] = 'A'; key[2] <= 'Z'; key[2]++) {

                    String k1 = "" + key[0];
                    String k2 = "" + key[1];
                    String k3 = "" + key[2];

 
for (int i = 0, index = 0; i <= cyphertext.length() - keyword.length(); i++) {
            index = i;
            String word = "";
            for (int j = 0; j < keyword.length(); j++, index++) {

                word = word + enigma.decodeEnigma(k1, k2, k3, cyphertext).charAt(index);

            }
            if(word.equals(keyword)){
            return key;
            }

        }
                   
                }

            }
        }
        
        return key;

    }
}
