public class ShoppingCart {
    private String _Name;
    private double _unitPrice;
    private double _gst;
    private int _qty;

    public ShoppingCart(String productName, double unitPrice, double gst, int qty) {
        _Name = productName;
        _unitPrice = unitPrice;
        _gst = gst;
        _qty = qty;
    }

    public void productName(String name) {
        this._Name = name;
    }

    public String ProductName() {
        return _Name;
    }

    public double UnitPrice() {
        return _unitPrice;
    }

    public double GST() {
        return _gst;
    }

    public int Qty() {
        return _qty;
    }
}
