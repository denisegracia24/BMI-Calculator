package com.denisa.bmicalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMIController {
    // ... sisa kode di bawahnya ...

    @FXML
    private TextField txtWeight;

    @FXML
    private TextField txtHeight;

    @FXML
    private Label lblResult;

    @FXML
    private Label lblCategory;

    @FXML
    private void handleCalculate() {
        try {
            // Ambil nilai dari TextField
            double weight = Double.parseDouble(txtWeight.getText());
            double heightCm = Double.parseDouble(txtHeight.getText());

            if (weight <= 0 || heightCm <= 0) {
                lblResult.setText("Nilai harus lebih besar dari 0!");
                lblCategory.setText("Kategori: -");
                return;
            }

            // Konversi tinggi dari cm ke meter
            double heightM = heightCm / 100.0;
            
            // Rumus BMI: Berat (kg) / [Tinggi (m)]^2
            double bmi = weight / (heightM * heightM);

            // Tampilkan hasil (2 angka di belakang koma)
            lblResult.setText(String.format("Hasil BMI: %.2f", bmi));

            // Tentukan kategori berat badan
            String category;
            if (bmi < 18.5) {
                category = "Kekurangan Berat Badan (Underweight)";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                category = "Normal (Ideal)";
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                category = "Kelebihan Berat Badan (Overweight)";
            } else {
                category = "Obesitas (Obesity)";
            }

            lblCategory.setText("Kategori: " + category);

        } catch (NumberFormatException e) {
            lblResult.setText("Error: Masukkan angka yang valid!");
            lblCategory.setText("Kategori: -");
        }
    }
}
