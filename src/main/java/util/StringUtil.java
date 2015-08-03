package util;

/**
 * Created by hadoop on 2015/7/22.
 */
public class StringUtil {


    /**
     * unicode转中文字符串
     *
     * @param unicode 待转换的 unicode
     * @return 返回中文
     */
    public static String decodeUnicode(String unicode) {
        char[] chars = unicode.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0, len = chars.length; i < len; ) {
            char c = chars[i++];
            switch (c) {
                case 0:
                case '\n':
                case '\r':
                    break;
                case '\\':
                    c = chars[i++];
                    switch (c) {
                        case 'b':
                            buffer.append('\b');
                            break;
                        case 't':
                            buffer.append('\t');
                            break;
                        case 'n':
                            buffer.append('\n');
                            break;
                        case 'f':
                            buffer.append('\f');
                            break;
                        case 'r':
                            buffer.append('\r');
                            break;
                        case 'u':
                            buffer.append((char) Integer.parseInt(new String(new char[]{//
                                    chars[i++], chars[i++], chars[i++], chars[i++] //
                            }), 16));//
                            break;
                        case 'x':
                            buffer.append((char) Integer.parseInt(new String(new char[]{//
                                    chars[i++], chars[i++] //
                            }), 16));//
                            break;
                        default:
                            buffer.append(c);
                    }
                    break;
                default:
                    buffer.append(c);
            }
        }
        return buffer.toString();
    }
}
