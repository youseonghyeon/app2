package converter;

import exception.NumberOverflowException;
import exception.NumberUnderflowException;

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
            double d = (double) arg;
            if (d > Integer.MAX_VALUE) {
                throw new NumberOverflowException("Arg is bigger than integer max value");
            }
            if (d < Integer.MIN_VALUE) {
                throw new NumberUnderflowException("Arg is lower than integer min value");
            }
            return (int) Math.floor(d);
        }
        if (arg instanceof Float) {
            float f = (Float) arg;
            return (int) f;
        }
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
        if (arg instanceof Double) {
            double d = (double) arg;
            return (float) d;
        }
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

    @SafeVarargs
    public final <T> List<T> toList(T... args) {
        if (args == null) {
            return null;
        }
        return List.of(args);
    }


}
