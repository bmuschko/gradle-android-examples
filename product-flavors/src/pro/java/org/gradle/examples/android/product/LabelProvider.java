package org.gradle.examples.android.product;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

public class LabelProvider {
    public static String getVersion() {
        return "Pro";
    }
    
    public static String getKey() {
        return new String(Hex.encodeHex(DigestUtils.sha("secretkey")));       
    }
}