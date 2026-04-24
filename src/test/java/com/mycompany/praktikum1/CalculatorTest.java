package com.mycompany.praktikum1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
/**
 *
 * @author user
 */
public class CalculatorTest {

    @Test
    void testTambah() {
        Calculator calc = new Calculator();
        // Cek apakah 2 + 3 hasilnya benar 5 [cite: 30]
        assertEquals(5, calc.tambah(2, 3));
    }

    @Test
    void testBagi() {
        Calculator calc = new Calculator();
        // Cek apakah 4 / 2 hasilnya benar 2 [cite: 30]
        assertEquals(2, calc.bagi(4, 2));
    }
    
    @Test
    void testBagiDenganNol() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
        calc.bagi(4, 0);
   });
}

}

