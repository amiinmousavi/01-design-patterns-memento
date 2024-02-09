public class Main {
    public static void main(String[] args) {
        var document = new Document();
        document.setText("Introduction");
        System.out.println(document.getText());

        document.setText("Content Section 1");
        System.out.println(document.getText());

        document.setText("Conclusion");
        System.out.println(document.getText());
    }
}
