/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author user
 */
public class ParamTest {
   @ParameterizedTest
   @ValueSource(ints = {2, 4, 6})
   void testGenap(int angka) {
       assertTrue(angka % 2 == 0);
   }
}

