package org.knit.lab9;
import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {

            field.setAccessible(true);
            Object value = field.get(obj);

            if (field.isAnnotationPresent(NotNull.class)&&(value == null)) {
                System.out.println("Поле " + field.getName() + " не должно быть null.");
            }

            if (field.isAnnotationPresent(MaxLength.class)&& value != null && value instanceof String) {
                int maxLength = field.getAnnotation(MaxLength.class).value();
                String strValue = (String) value;
                if (strValue.length() > maxLength) {
                    System.out.println("Поле " + field.getName() + " превышает максимальную длину " + maxLength + ".");
                }
            }

            if (field.isAnnotationPresent(Min.class)&&(value != null && (value instanceof Integer || value instanceof Long || value instanceof Short || value instanceof Byte))) {
                int minValue = field.getAnnotation(Min.class).value();
                long numericValue = 0;
                if (value instanceof Integer) {
                    numericValue = (Integer) value;
                } else if (value instanceof Long) {
                    numericValue = (Long) value;
                } else if (value instanceof Short) {
                    numericValue = (Short) value;
                } else if (value instanceof Byte) {
                    numericValue = (Byte) value;
                }

                if (numericValue < minValue) {
                    System.out.println("Поле " + field.getName() + " должно быть не меньше " + minValue + ".");
                }

            }
        }
    }
}