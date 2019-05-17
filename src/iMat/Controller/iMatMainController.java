package iMat.Controller;


import iMat.Model.iMatModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.FlowPane;
import se.chalmers.cse.dat216.project.*;

import java.awt.*;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

public class iMatMainController implements Initializable, ShoppingCartListener {


    private Map<String, iMatProductController> recipeListItemMap = new HashMap<String, iMatProductController>();
    @FXML
    FlowPane productsFlowPane;

    private final iMatModel model = iMatModel.getInstance();


    private void updateProductList(List<Product> products){
        productsFlowPane.getChildren().clear();
        for( Product product : products){
            productsFlowPane.getChildren().add(recipeListItemMap.get(product.getName()));
        }
    }

    private void updateCreditCard() {

        CreditCard card = model.getCreditCard();

        /*card.setCardNumber(numberTextField.getText());
        card.setHoldersName(nameTextField.getText());

        String selectedValue = (String) cardTypeCombo.getSelectionModel().getSelectedItem();
        card.setCardType(selectedValue);

        selectedValue = (String) monthCombo.getSelectionModel().getSelectedItem();
        card.setValidMonth(Integer.parseInt(selectedValue));

        selectedValue = (String) yearCombo.getSelectionModel().getSelectedItem();
        card.setValidYear(Integer.parseInt(selectedValue));

        card.setVerificationCode(Integer.parseInt(cvcField.getText()));*/

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        model.getShoppingCart().addShoppingCartListener(this);

        updateProductList(model.getProducts());
        updateBottomPanel();

        setupAccountPane();
    }

    private void setupAccountPane() {

    }

    private void updateBottomPanel() {
        ShoppingCart shoppingCart = model.getShoppingCart();

        //TODO - Fixa metoder
        //setNumberOfItems("Antal varor: " + shoppingCart.getItems().size());
        //setTotalCosttLabel("Kostnad: " + String.format("%.2f",shoppingCart.getTotal()));

    }

    @Override
    public void shoppingCartChanged(CartEvent cartEvent) {

    }
}
