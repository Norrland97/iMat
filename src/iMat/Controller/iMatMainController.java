package iMat.Controller;


import iMat.Model.iMatModel;
import javafx.fxml.FXML;
import javafx.scene.layout.FlowPane;
import se.chalmers.cse.dat216.project.CreditCard;
import se.chalmers.cse.dat216.project.IMatDataHandler;
import se.chalmers.cse.dat216.project.Product;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class iMatMainController {


    private Map<String, iMatProductController> recipeListItemMap = new HashMap<String, iMatProductController>();
    @FXML
    FlowPane productsFlowPane;

    private final iMatModel model = iMatModel.getInstance();


    private void updateRecipeList(){
        productsFlowPane.getChildren().clear();
        for(Product product : IMatDataHandler.getInstance().getProducts()){
            productsFlowPane.getChildren().add(recipeListItemMap.get(product.getName()));
        }
    }

    private void updateCreditCard() {

        CreditCard card = model.getCreditCard();

        card.setCardNumber(numberTextField.getText());
        card.setHoldersName(nameTextField.getText());

        String selectedValue = (String) cardTypeCombo.getSelectionModel().getSelectedItem();
        card.setCardType(selectedValue);

        selectedValue = (String) monthCombo.getSelectionModel().getSelectedItem();
        card.setValidMonth(Integer.parseInt(selectedValue));

        selectedValue = (String) yearCombo.getSelectionModel().getSelectedItem();
        card.setValidYear(Integer.parseInt(selectedValue));

        card.setVerificationCode(Integer.parseInt(cvcField.getText()));

    }
}
