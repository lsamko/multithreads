/*
 * Copyright (c) 2024. Michael Pogrebinsky - Top Developer Academy
 * https://topdeveloperacademy.com
 * All rights reserved
 */

package threadCoordination;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        ComplexCalculation complexCalculation = new ComplexCalculation();
      BigInteger result =  complexCalculation.calculateResult(BigInteger.ONE,BigInteger.TEN,BigInteger.TWO,BigInteger.ZERO);
        System.out.println(result);
    }

}
