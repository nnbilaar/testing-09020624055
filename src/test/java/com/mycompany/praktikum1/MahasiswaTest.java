/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 *
 * @author user
 */
public class MahasiswaTest {

    @Test
    void testNilaiLulus() {
        Mahasiswa mhs = new Mahasiswa("Nabila", 95);
        assertTrue(mhs.isLulus(), "Harusnya lulus untuk nilai 95");
    }

    @Test
    void testNilaiTidakLulus() {
        Mahasiswa mhs = new Mahasiswa("Naufal", 50);
        assertFalse(mhs.isLulus(), "Harusnya tidak lulus untuk nilai 50");
    }
} 

