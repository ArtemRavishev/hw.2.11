package sky.pro.hw2_11.store.Service;

import org.springframework.stereotype.Service;
import sky.pro.hw2_11.store.shoppingСart.Cart;

import java.util.List;

@Service
public class StoreService {
    private final Cart cart;

    public StoreService(Cart cart) {
        this.cart = cart;
    }

    public void addAll(List<Integer> values) {
        cart.addAll(values);
    }

    public List<Integer> getAll() {
        return cart.getAll();
    }
}
