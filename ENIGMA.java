
import java.util.ArrayList;
import java.util.Scanner;

public class ENIGMA {
    static ArrayList<String>  buffer = new ArrayList<String>();
    static ArrayList<String>  save = new ArrayList<String>();
public String decodeEnigma(String key1 , String key2 , String key3 , String cyphertext ){
 char[] code = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[][] Wheel1 = {{'L', 'E'}, {'M', 'S'}, {'N', 'U'}, {'O', 'F'}, {'P', 'N'}, {'Q', 'B'}, {'R', 'T'}, {'S', 'C'}, {'T', 'I'}, {'U', 'P'}, {'V', 'X'}, {'W', 'O'}, {'X', 'R'}, {'Y', 'Y'}, {'Z', 'W'}, {'A', 'A'}, {'B', 'J'}, {'C', 'Z'}, {'D', 'V'}, {'E', 'K'}, {'F', 'H'}, {'G', 'Q'}, {'H', 'L'}, {'I', 'M'}, {'J', 'D'}, {'K', 'G'}};
        char[][] Wheel2 = {{'C', 'B'}, {'D', 'S'}, {'E', 'I'}, {'F', 'O'}, {'G', 'H'}, {'H', 'E'}, {'I', 'P'}, {'J', 'Z'}, {'K', 'X'}, {'L', 'Y'}, {'M', 'J'}, {'N', 'F'}, {'O', 'Q'}, {'P', 'R'}, {'Q', 'C'}, {'R', 'T'}, {'S', 'W'}, {'T', 'K'}, {'U', 'L'}, {'V', 'U'}, {'W', 'A'}, {'X', 'V'}, {'Y', 'G'}, {'Z', 'M'}, {'A', 'D'}, {'B', 'N'}};
        char[][] Wheel3 = {{'M', 'A'}, {'N', 'H'}, {'O', 'N'}, {'P', 'C'}, {'Q', 'O'}, {'R', 'M'}, {'S', 'Q'}, {'T', 'V'}, {'U', 'B'}, {'V', 'F'}, {'W', 'S'}, {'X', 'P'}, {'Y', 'Z'}, {'Z', 'U'}, {'A', 'J'}, {'B', 'T'}, {'C', 'Y'}, {'D', 'G'}, {'E', 'W'}, {'F', 'E'}, {'G', 'L'}, {'H', 'I'}, {'I', 'R'}, {'J', 'X'}, {'K', 'D'}, {'L', 'K'}};
        char[] reflect = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'D', 'I', 'J', 'K', 'G', 'M', 'K', 'M', 'I', 'E', 'B', 'F', 'T', 'C', 'V', 'V', 'J', 'A', 'T'};
        Scanner input = new Scanner(System.in);
       /// System.out.print("please enter key : ");
      
     // Christopher cp = new Christopher();
        char k1 = key1.charAt(0);
       /// System.out.print("please enter key2 : ");

        char k2 = key2.charAt(0);
       /// System.out.print("please enter key3 : ");
      
        char k3 = key3.charAt(0);
       int count = 0; 
       String decode = "";
            ///System.out.print("please enter key : "+k1 + " " + k2 + " " + k3 + " ");
        int indexk1 = -1;
       
        for (int i = 0; i < 26; i++) {
            if (k1 == Wheel1[i][1]) {
                indexk1 = i;
            }
        }
        char newWheel1[][] = new char[26][26];
        {
            int j = 0;
            for (int i = indexk1; i < 26; i++, j++) {
                newWheel1[j][1] = Wheel1[i][1];
                newWheel1[j][0] = Wheel1[i][0];

            }
            for (int i =  0; i < indexk1; i++, j++) {
                newWheel1[j][1] = Wheel1[i][1];
                newWheel1[j][0] = Wheel1[i][0];

            }
        }
        int indexk2 = -1;
        for (int i = 0; i < 26; i++) {
            if (k2 == Wheel2[i][1]) {
                indexk2 = i;
            }
        }
        char newWheel2[][] = new char[26][26];
        {
            int j = 0;
            for (int i = indexk2; i < 26; i++, j++) {
                newWheel2[j][1] = Wheel2[i][1];
                newWheel2[j][0] = Wheel2[i][0];
            }
            for (int i = 0; i < indexk2; i++, j++) {
                newWheel2[j][1] = Wheel2[i][1];
                newWheel2[j][0] = Wheel2[i][0];
            }
        }

        int indexk3 = -1;
        for (int i = 0; i < 26; i++) {
            if (k3 == Wheel3[i][1]) {
                indexk3 = i;
            }
        }
        char newWheel3[][] = new char[26][26];
        {
            int j = 0;
            for (int i = indexk3; i < 26; i++, j++) {
                newWheel3[j][1] = Wheel3[i][1];
                newWheel3[j][0] = Wheel3[i][0];
            }
            for (int i = 0; i < indexk3; i++, j++) {
                newWheel3[j][1] = Wheel3[i][1];
                newWheel3[j][0] = Wheel3[i][0];
            }
        }
        int countWheel1 = 0;
        int indexWheel1 = -1;
        int countWheel2 = 0;
        int indexWheel2 = -1;
        int indexWheel3 = -1;
        int indexreflect = -1;
          
       
          for(int z = 0 ; z < cyphertext.length() ; z++){
            ///System.out.print("please enter character : ");
   
            char text = cyphertext.charAt(z);

            int indexChar = (int) text - 65;
            for (int i = 0; i < 26; i++) {
                if (newWheel1[indexChar][1] == newWheel1[i][0]) {
                    indexWheel1 = i;
                    countWheel1++;
                }
            }

            for (int i = 0; i < 26; i++) {
                if (newWheel2[indexWheel1][1] == newWheel2[i][0]) {
                    indexWheel2 = i;
                    countWheel2++;
                }
            }
            for (int i = 0; i < 26; i++) {
                if (newWheel3[indexWheel2][1] == newWheel3[i][0]) {
                    indexWheel3 = i;
                }
            }
            
                        for (int i = 0; i < 26; i++) {
                if (reflect[indexWheel3]== reflect[i]&&i!=indexWheel3) {
                    indexreflect = i;
                }
            }
                      for (int i = 0; i < 26; i++) {
                if (newWheel3[indexreflect][0] == newWheel3[i][1]) {
                    indexWheel3 = i;
                }
            }
                      for (int i = 0; i < 26; i++) {
                if (newWheel2[indexWheel3][0] == newWheel2[i][1]) {
                    indexWheel2 = i;
                }
            }
  
                    for (int i = 0; i < 26; i++) {
                if (newWheel1[indexWheel2][0] == newWheel1[i][1]) {
                    indexWheel1 = i;
                }
            }
                    
                     
                   /// System.out.println( "output : "+code[indexWheel1]);
                 
           decode+=code[indexWheel1];
           count++;
          
           if(count == cyphertext.length()){
               if(buffer.size() == 0 ){
           buffer.add(decode);
           
        break;
               }
               else{
                   buffer.remove(0);
                buffer.add(decode);
          break;
               }
           }
           
           
           /////////////////////////////////////////////////////// 
          
                           for (int i = 1; i < 26; i++) {
                char temp1 = newWheel1[i][1];
                newWheel1[i][1] = newWheel1[i - 1][1];
                newWheel1[i - 1][1] = temp1;
                char temp0 = newWheel1[i][0];
                newWheel1[i][0] = newWheel1[i - 1][0];
                newWheel1[i - 1][0] = temp0;
 
            }
            if (countWheel1 == 26) {
                for (int i = 1; i < 26; i++) {
                    char temp1 = newWheel2[i][1];
                    newWheel2[i][1] = newWheel2[i - 1][1];
                    newWheel2[i - 1][1] = temp1;
                    char temp0 = newWheel2[i][0];
                    newWheel2[i][0] = newWheel2[i - 1][0];
                    newWheel2[i - 1][0] = temp0;
                }
                countWheel2++;
                countWheel1 = 0;
            }
            if (countWheel2 == 26) {
                for (int i = 1; i < 26; i++) {
                    char temp1 = newWheel3[i][1];
                    newWheel3[i][1] = newWheel3[i - 1][1];
                    newWheel3[i - 1][1] = temp1;
                    char temp0 = newWheel3[i][0];
                    newWheel3[i][0] = newWheel3[i - 1][0];
                    newWheel3[i - 1][0] = temp0;
                }
                countWheel2 = 0;
            }
  

        }
     ///  System.out.println(decode);
                   
          String passDecode = buffer.get(0);          
          
          
        
     
      return passDecode; 

}

public void encodeEnigma(String key1 , String key2 , String key3 ){
 char[] code = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[][] Wheel1 = {{'L', 'E'}, {'M', 'S'}, {'N', 'U'}, {'O', 'F'}, {'P', 'N'}, {'Q', 'B'}, {'R', 'T'}, {'S', 'C'}, {'T', 'I'}, {'U', 'P'}, {'V', 'X'}, {'W', 'O'}, {'X', 'R'}, {'Y', 'Y'}, {'Z', 'W'}, {'A', 'A'}, {'B', 'J'}, {'C', 'Z'}, {'D', 'V'}, {'E', 'K'}, {'F', 'H'}, {'G', 'Q'}, {'H', 'L'}, {'I', 'M'}, {'J', 'D'}, {'K', 'G'}};
        char[][] Wheel2 = {{'C', 'B'}, {'D', 'S'}, {'E', 'I'}, {'F', 'O'}, {'G', 'H'}, {'H', 'E'}, {'I', 'P'}, {'J', 'Z'}, {'K', 'X'}, {'L', 'Y'}, {'M', 'J'}, {'N', 'F'}, {'O', 'Q'}, {'P', 'R'}, {'Q', 'C'}, {'R', 'T'}, {'S', 'W'}, {'T', 'K'}, {'U', 'L'}, {'V', 'U'}, {'W', 'A'}, {'X', 'V'}, {'Y', 'G'}, {'Z', 'M'}, {'A', 'D'}, {'B', 'N'}};
        char[][] Wheel3 = {{'M', 'A'}, {'N', 'H'}, {'O', 'N'}, {'P', 'C'}, {'Q', 'O'}, {'R', 'M'}, {'S', 'Q'}, {'T', 'V'}, {'U', 'B'}, {'V', 'F'}, {'W', 'S'}, {'X', 'P'}, {'Y', 'Z'}, {'Z', 'U'}, {'A', 'J'}, {'B', 'T'}, {'C', 'Y'}, {'D', 'G'}, {'E', 'W'}, {'F', 'E'}, {'G', 'L'}, {'H', 'I'}, {'I', 'R'}, {'J', 'X'}, {'K', 'D'}, {'L', 'K'}};
        char[] reflect = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'D', 'I', 'J', 'K', 'G', 'M', 'K', 'M', 'I', 'E', 'B', 'F', 'T', 'C', 'V', 'V', 'J', 'A', 'T'};
        Scanner input = new Scanner(System.in);
       /// System.out.print("please enter key : ");
      
        char k1 = key1.charAt(0);
       /// System.out.print("please enter key2 : ");

        char k2 = key2.charAt(0);
       /// System.out.print("please enter key3 : ");
      
        char k3 = key3.charAt(0);
            System.out.print("please enter key : "+k1 + " " + k2 + " " + k3 + " ");
        int indexk1 = -1;
        for (int i = 0; i < 26; i++) {
            if (k1 == Wheel1[i][1]) {
                indexk1 = i;
            }
        }
        char newWheel1[][] = new char[26][26];
        {
            int j = 0;
            for (int i = indexk1; i < 26; i++, j++) {
                newWheel1[j][1] = Wheel1[i][1];
                newWheel1[j][0] = Wheel1[i][0];

            }
            for (int i = 0; i < indexk1; i++, j++) {
                newWheel1[j][1] = Wheel1[i][1];
                newWheel1[j][0] = Wheel1[i][0];

            }
        }
        int indexk2 = -1;
        for (int i = 0; i < 26; i++) {
            if (k2 == Wheel2[i][1]) {
                indexk2 = i;
            }
        }
        char newWheel2[][] = new char[26][26];
        {
            int j = 0;
            for (int i = indexk2; i < 26; i++, j++) {
                newWheel2[j][1] = Wheel2[i][1];
                newWheel2[j][0] = Wheel2[i][0];
            }
            for (int i = 0; i < indexk2; i++, j++) {
                newWheel2[j][1] = Wheel2[i][1];
                newWheel2[j][0] = Wheel2[i][0];
            }
        }

        int indexk3 = -1;
        for (int i = 0; i < 26; i++) {
            if (k3 == Wheel3[i][1]) {
                indexk3 = i;
            }
        }
        char newWheel3[][] = new char[26][26];
        {
            int j = 0;
            for (int i = indexk3; i < 26; i++, j++) {
                newWheel3[j][1] = Wheel3[i][1];
                newWheel3[j][0] = Wheel3[i][0];
            }
            for (int i = 0; i < indexk3; i++, j++) {
                newWheel3[j][1] = Wheel3[i][1];
                newWheel3[j][0] = Wheel3[i][0];
            }
        }
        int countWheel1 = 0;
        int indexWheel1 = -1;
        int countWheel2 = 0;
        int indexWheel2 = -1;
        int indexWheel3 = -1;
        int indexreflect = -1;
        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.print("please enter character : ");
     String cyphertext = in.nextLine();
            char text = cyphertext.charAt(0);

            int indexChar = (int) text - 65;
            for (int i = 0; i < 26; i++) {
                if (newWheel1[indexChar][1] == newWheel1[i][0]) {
                    indexWheel1 = i;
                    countWheel1++;
                }
            }

            for (int i = 0; i < 26; i++) {
                if (newWheel2[indexWheel1][1] == newWheel2[i][0]) {
                    indexWheel2 = i;
                //m    countWheel2++;
                }
            }
            for (int i = 0; i < 26; i++) {
                if (newWheel3[indexWheel2][1] == newWheel3[i][0]) {
                    indexWheel3 = i;
                }
            }
            
                        for (int i = 0; i < 26; i++) {
                if (reflect[indexWheel3]== reflect[i]&&i!=indexWheel3) {
                    indexreflect = i;
                }
            }
                      for (int i = 0; i < 26; i++) {
                if (newWheel3[indexreflect][0] == newWheel3[i][1]) {
                    indexWheel3 = i;
                }
            }
                      for (int i = 0; i < 26; i++) {
                if (newWheel2[indexWheel3][0] == newWheel2[i][1]) {
                    indexWheel2 = i;
                }
            }
  
                    for (int i = 0; i < 26; i++) {
                if (newWheel1[indexWheel2][0] == newWheel1[i][1]) {
                    indexWheel1 = i;
                }
            }
                    

                    System.out.println( "output : "+code[indexWheel1]);
                
            
                           for (int i = 1; i < 26; i++) {
                char temp1 = newWheel1[i][1];
                newWheel1[i][1] = newWheel1[i - 1][1];
                newWheel1[i - 1][1] = temp1;
                char temp0 = newWheel1[i][0];
                newWheel1[i][0] = newWheel1[i - 1][0];
                newWheel1[i - 1][0] = temp0;
            }
            if (countWheel1 == 26) {
                for (int i = 1; i < 26; i++) {
                    char temp1 = newWheel2[i][1];
                    newWheel2[i][1] = newWheel2[i - 1][1];
                    newWheel2[i - 1][1] = temp1;
                    char temp0 = newWheel2[i][0];
                    newWheel2[i][0] = newWheel2[i - 1][0];
                    newWheel2[i - 1][0] = temp0;
                }
                countWheel2++;
                countWheel1 = 0;
            }
            if (countWheel2 == 26) {
                for (int i = 1; i < 26; i++) {
                    char temp1 = newWheel3[i][1];
                    newWheel3[i][1] = newWheel3[i - 1][1];
                    newWheel3[i - 1][1] = temp1;
                    char temp0 = newWheel3[i][0];
                    newWheel3[i][0] = newWheel3[i - 1][0];
                    newWheel3[i - 1][0] = temp0;
                }
                countWheel2 = 0;
            }


        }
 
}
    
public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
ENIGMA e = new ENIGMA();
    System.out.println("Key : ");
   e.encodeEnigma(in.nextLine(), in.nextLine(), in.nextLine());
    }
}
// A B C D E F G H I L K L M N O P Q R S T U V W X Y Z A