package com.reactlibrary.base64;

import android.util.Log;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.util.Base64;
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
    @ReactMethod
    public byte[] encode(String str) {
        byte[] encodeValue = Base64.encode(str.getBytes(), Base64.DEFAULT);
        return (encodeValue);
    }
    @ReactMethod
    public String decode(String str) {
        byte[] decodeValue = Base64.decode(str, Base64.DEFAULT);
        String decodeValueString = new String(decodeValue, StandardCharsets.UTF_8);
        return (decodeValueString);
    }
}
