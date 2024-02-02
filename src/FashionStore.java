/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class FashionStore extends JFrame {
    private Map<Integer, FashionProduct> fashionProducts = new HashMap<>();
    private int productIdCounter = 1;

    private JTextArea productTextArea;

    public FashionStore() {
        setTitle("Fashion Store");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        productTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(productTextArea);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton addProductButton = new JButton("Add Product");
        JButton viewProductsButton = new JButton("View Products");
        JButton exitButton = new JButton("Exit");

        addProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addPropertyChangeListener();
            }

            private void addPropertyChangeListener() {

            }
        });

        viewProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBounds();
            }

            private void setBounds() {

            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        class fashionStore {
            private Map<String, Product> products;


            public fashionStore() {
                products = new HashMap<>();
            }

            public void addProduct(String productId, Product product) {
                products.put(productId, product);
            }

            public Product getProduct(String productId) {
                return products.get(productId);
            }


            public void displayProducts() {
                System.out.println("Fashion Products:");
                for (Map.Entry<String, Product> entry : products.entrySet()) {
                    String productId = entry.getKey();
                    Product product = entry.getValue();
                    System.out.println("Product ID: " + productId);
                    System.out.println("Name: " + product.getName());
                    System.out.println("Price: rs" + product.getPrice());
                    System.out.println();
                }
            }

            public static void main(String[] args) {
                fashionStore store = new fashionStore();
                store.addProduct("1", new Product("earrings", 25));
                store.addProduct("2", new Product("bangles", 50));
                store.addProduct("3", new Product("lipsticks", 100));
                store.displayProducts();
                String productId = "2";
                Product product = store.getProduct(productId);
                if (product != null) {
                    System.out.println("Product " + productId + ": " + product.getName() + " - rs" + product.getPrice());
                } else {
                    System.out.println("Product with ID " + productId + " not found.");
                }
            }
        }
    }

    private class FashionProduct {
    }
}
*/
