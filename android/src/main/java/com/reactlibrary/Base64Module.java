package com.reactlibrary.base64;

import android.util.Log;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Base64Module extends ReactContextBaseJavaModule {
    private static final String E_FORMAT_ERROR = "E_FORMAT_ERROR";
    public Base64Module(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    @Override
    public String getName() {
        return "Base64";
    }
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String encode(String str) {
        try {
            return new String(Base64.encode(str.getBytes(), Base64.DEFAULT), "UTF-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return "";
        }
    }
    
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String decode(String str) {
        try {
            return new String(Base64.decode(str, 0), "UTF-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return "This is not a base64 data";
        }
    }
}
