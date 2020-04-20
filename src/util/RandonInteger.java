/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;
import java.util.Random;

/**
 *
 * @author Diego Sebastian
 */
public class RandonInteger {

    public static int getInt(List<Integer> notIncludedValues) {
        Random random = new Random();
        while (true) {
            int a = random.nextInt(notIncludedValues.size()) + 1000; // this will give numbers between 1 and 50.
            if (!notIncludedValues.contains(a)) {
                return a;
            }
        }
    }

}
