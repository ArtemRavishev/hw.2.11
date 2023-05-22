package sky.pro.hw2_11.store.shoppingСart;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;


@Component
@SessionScope
public class Cart {
    private List<Integer> cart = new ArrayList<>();

    public void addAll(List<Integer>value){
        cart.addAll(value);
    }

    public List<Integer> getAll() {
        return cart;
    }


}
