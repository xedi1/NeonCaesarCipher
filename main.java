// ===========
// EDI
// ===========

import java.util.Scanner;

public class main {
    private String String;
    private int k;
    private Scanner Input;

    public main(){
        this.Input = new Scanner(System.in);
    }

    public String encrypt(String S, int Shift){
        String result = "";
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (Character.isUpperCase(ch)) {
                char encryptedCh = (char) (((int) ch - 'A' + Shift) % 26 + 'A');
                result += encryptedCh;
            }
            else if (Character.isLowerCase(ch)) {
                char encryptedCh = (char) (((int) ch - 'a' + Shift) % 26 + 'a');
                result += encryptedCh;
            } else {
                result += ch;
            }
        }
        return result;
    }
// ===========
// EDI
// ===========
    public String decrypt(String S, int Shift){
        return encrypt(S, 26 - (Shift % 26));
    }

    public static void main(String[] args){
        main Start = new main();
        System.out.println("======= Encypt Decode System (Edi)========");
        System.out.println("Enter String:"); Start.String = Start.Input.next();
        System.out.println("Enter K(Count Movement)"); Start.k= Start.Input.nextInt();

        String Encrypted = Start.encrypt(Start.String, Start.k);
        System.out.printf("Encrypt Message:%s\n", Encrypted);

        String Decrypted = Start.decrypt(Encrypted, Start.k);
        System.out.printf("Decrypt Message:%s", Decrypted);

    }
}
