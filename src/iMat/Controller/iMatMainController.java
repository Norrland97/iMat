package iMat.Controller;

import javafx.fxml.FXML;
import javafx.scene.layout.FlowPane;
import se.chalmers.cse.dat216.project.IMatDataHandler;
import se.chalmers.cse.dat216.project.Product;

import java.util.HashMap;
import java.util.Map;

public class iMatMainController {


    private Map<String, iMatProductController> recipeListItemMap = new HashMap<String, iMatProductController>();
    @FXML
    FlowPane productsFlowPane;



    private void updateRecipeList(){
        productsFlowPane.getChildren().clear();
        for(Product product : IMatDataHandler.getInstance().getProducts()){
            productsFlowPane.getChildren().add(recipeListItemMap.get(product.getName()));
        }
    }
}
