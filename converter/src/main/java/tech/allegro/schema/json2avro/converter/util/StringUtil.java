package tech.allegro.schema.json2avro.converter.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class StringUtil {

  public static boolean isBase64(String value) {
    return value != null && value.matches("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)?$");
  }

  public static byte[] decodeBase64(String string) {
    if (isBase64(string)) {
      return Base64.getDecoder().decode(string);
    }
    return string.getBytes(StandardCharsets.UTF_8);
  }
}
