
// PACKAGE/IMPORTS --------------------------------------------------
package gk.code.java;

public class RemoveAllSpaces {

    public static void main(String[] args) {
        String str = "Gaurav Kumar Singh";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
