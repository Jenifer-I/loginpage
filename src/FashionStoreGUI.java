import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: $" + price;
    }
}

public class FashionStoreGUI extends JFrame {
    private Map<Integer, FashionProduct> fashionProducts = new HashMap<>();
    private int productIdCounter = 1;

    private JTextArea productTextArea;

    public FashionStoreGUI() {
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
                addProduct();
            }
        });

        viewProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewProducts();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        buttonPanel.add(addProductButton);
        buttonPanel.add(viewProductsButton);
        buttonPanel.add(exitButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void addProduct() {
        String name = JOptionPane.showInputDialog(this, "Enter the product name:");
        if (name == null || name.isEmpty()) {
            return;
        }

        String priceStr = JOptionPane.showInputDialog(this, "Enter the product price:");
        if (priceStr == null || priceStr.isEmpty()) {
            return;
        }

        try {
            double price = Double.parseDouble(priceStr);
            FashionProduct product = new FashionProduct(name, price);
            fashionProducts.put(productIdCounter++, product);

            JOptionPane.showMessageDialog(this, "Product added successfully!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid price format. Please enter a valid number.");
        }
    }

    private void viewProducts() {
        if (fashionProducts.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No products available.");
        } else {
            StringBuilder productsInfo = new StringBuilder("Fashion Products:\n");
            for (Map.Entry<Integer, FashionProduct> entry : fashionProducts.entrySet()) {
                productsInfo.append("ID: ").append(entry.getKey()).append(", ").append(entry.getValue()).append("\n");
            }
            productTextArea.setText(productsInfo.toString());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FashionStoreGUI().setVisible(true);
            }
        });
    }
}

