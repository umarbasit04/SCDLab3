package labtasks;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab Task 5: A simple shopping cart supporting add/remove/clear operations.
 */
public class ShoppingCart {

    private final List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }
}
