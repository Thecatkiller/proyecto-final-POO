/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.UUID;

/**
 *
 * @author Diego Sebastian
 */
public final class RandomStringUUID {

    public static String getUUID8() {
        return RandomStringUUID.getUUID().substring(0, 8);
    }

    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().substring(0, 8).toUpperCase();
    }
}
