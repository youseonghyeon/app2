package converter;

import exception.NumOverflowException;

import java.util.List;

public class EasyConverter {

    public <T> String toString(T arg) {
        if (arg == null)
            return null;
        return String.valueOf(arg);
    }

    public <T> Integer toInt(T arg) {
        if (arg == null)
            return null;
        if (arg instanceof Double) {
            long l = Math.round((Double) arg);
            if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
                throw new NumOverflowException("Arg is bigger than integer max value");
            }
            return (int) Math.round((Double) arg);
        }
        if (arg instanceof Float)
            return Math.round((Float) arg);
        return Integer.valueOf(toString(arg));
    }

    public <T> Long toLong(T arg) {
        if (arg == null)
            return null;
        if (arg instanceof Double) {
            return Math.round((Double) arg);
        }
        if (arg instanceof Float) {

            return (long) Math.round((Float) arg);
        }
        return Long.valueOf(toString(arg));
    }

    public <T> Double toDouble(T arg) {
        if (arg == null)
            return null;
        return Double.valueOf(toString(arg));
    }

    public <T> Float toFloat(T arg) {
        if (arg == null)
            return null;
        return Float.valueOf(toString(arg));
    }

    public <T> Character toChar(T arg) {
        if (arg == null)
            return null;
        String str = toString(arg);
        if (str.length() != 1) {
            throw new IllegalArgumentException("cant convert to Character {arg=" + arg + "}");
        }
        return str.charAt(0);
    }

    public <T> List<T> toList(T... args) {
        if (args == null) {
            return null;
        }
        return List.of(args);
    }

//    public <E, T> E toType(Class<E> targetClass, T target) {
//
//    }

}
