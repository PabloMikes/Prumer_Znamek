package com.example.demo2;

public class Converter {
    public static double prumerZnamek(String pole) throws Exception {
        String[] znamky = pole.split(",");
        for (String check : znamky) {
            if(check.toLowerCase().matches(".*[a-zA-Z]+.*")){
                throw new Exception("Contains a letter");
            }
            if(Integer.parseInt(check) > 5 || Integer.parseInt(check) < 0){
                throw new Exception("Number is not in range");
            }
        }
        double result = 0;
        for (int i = 0; i < znamky.length; i++) {
            result += Integer.parseInt(znamky[i]);
            if(i == znamky.length - 1){
                result /= i + 1;
            }
        }
        return result;
    }
}
