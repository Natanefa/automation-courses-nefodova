package homework_dz9;

import java.util.Random;

public class res_constr {
    public static void main(String[] args) {
        hw_task1 stringGen = new hw_task1();
        System.out.println(stringGen.stringGenerator("numeric", 10));
        System.out.println(stringGen.stringGenerator("alphanumeric" , 10));
        System.out.println(stringGen.stringGenerator("alpha", 10));

        }

}
