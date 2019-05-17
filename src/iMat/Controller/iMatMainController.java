package iMat.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.FlowPane;
import se.chalmers.cse.dat216.project.IMatDataHandler;
import se.chalmers.cse.dat216.project.Product;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

public class iMatMainController implements Initializable {

    IMatDataHandler dataHandler = IMatDataHandler.getInstance();


    @FXML
    private FlowPane productsFlowPane;

    private void updateProductList(List<Product> products) {

        productsFlowPane.getChildren().clear();

        for (Product product : products) {

            productsFlowPane.getChildren().add(new iMatProductController(product));
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

      updateProductList(dataHandler.getProducts());

    }
/*
    private void updateRecipeList(){
        productsFlowPane.getChildren().clear();
        for(Product product : IMatDataHandler.getInstance().getProducts()){
            productsFlowPane.getChildren().add(recipeListItemMap.get(product.getName()));
        }
    }
    */
}
