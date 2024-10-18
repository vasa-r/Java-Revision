class DataTypes{
    public static void main(String[] args) {
        // Primitive Data Types
           byte byteVar = 100;
           short shortVar = 1000;
           int intVar = 100000;
           long longVar = 100000L;
           float floatVar = 10.5f;
           double doubleVar = 20.99;
           char charVar = 'A';
           boolean booleanVar = true;
   
           // Reference Data Types
           String str = "Hello, Java!";
           int[] arr = {1, 2, 3, 4, 5};
   
           // Printing values
           System.out.println("Byte: " + byteVar);
           System.out.println("Short: " + shortVar);
           System.out.println("Int: " + intVar);
           System.out.println("Long: " + longVar);
           System.out.println("Float: " + floatVar);
           System.out.println("Double: " + doubleVar);
           System.out.println("Char: " + charVar);
           System.out.println("Boolean: " + booleanVar);
           System.out.println("String: " + str);
           System.out.println("Array: ");
           for (int num : arr) {
               System.out.println(num);
           }
    }
}

