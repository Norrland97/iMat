package iMat.Model;

import se.chalmers.cse.dat216.project.CreditCard;
import se.chalmers.cse.dat216.project.IMatDataHandler;
import se.chalmers.cse.dat216.project.Product;
import se.chalmers.cse.dat216.project.ShoppingCart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iMatModel {

    private static iMatModel instance = null;
    private IMatDataHandler iMatDataHandler;

    /**
     * info som fylls i för bankkort
     */
    private final ArrayList<String> availableCardTypes = new ArrayList<String>(Arrays.asList("MasterCard", "Visa"));
    private final ArrayList<String> months = new ArrayList<String>(Arrays.asList("1", "2","3", "4", "5", "6"));
    private final ArrayList<String> years = new ArrayList<String>(Arrays.asList("19", "20", "21", "22", "23", "24", "25"));

    protected iMatModel(){}

    public static iMatModel getInstance() {
        if (instance == null){
            instance = new iMatModel();
            instance.init();
        }
        return instance;
    }

    private void init() {
        iMatDataHandler = IMatDataHandler.getInstance();
    }

    public CreditCard getCreditCard() {
        return iMatDataHandler.getCreditCard();
    }

    public ShoppingCart getShoppingCart() {
        return iMatDataHandler.getShoppingCart();
    }

    public List<Product> getProducts() {
        return iMatDataHandler.getProducts();
    }
}
