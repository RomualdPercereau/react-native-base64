import { NativeModules } from "react-native";
const { Base64 } = NativeModules;

export function decode(str: string): string {
  return Base64.decode(str);
}

export function encode(str: string): string {
  return Base64.encode(str);
}
