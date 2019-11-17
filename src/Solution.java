/*
 *   Christian Overton (cto5068@psu.edu) & Amish Prajapati (avp5564@psu.edu)
 *   Assignment 2
 *   CMPSC 444
 *   09/26/19
 */

import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class Solution {

    public static void main(String[] args)
        throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException,
        IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {

        PasswordVault passwordVault = new PasswordVault(5,1);

        System.out.println("Welcome to password master 5000 mark 42!");

        try {
            FileReader reader = new FileReader("master.txt");
            reader.close();
            passwordVault.login();
        } catch (FileNotFoundException e) {
            passwordVault.signUp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
