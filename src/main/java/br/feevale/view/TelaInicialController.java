package br.feevale.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import br.feevale.App;

public class TelaInicialController {

    @FXML
    private Button btnPedido;

    @FXML
    private void initialize() {
        btnPedido.setOnAction(event -> {
            try {
                App.setRoot("TelaItens"); // depois você cria esta tela
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
