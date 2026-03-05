package Firm;

/**
 *
 * @author ghevira
 */
public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // Constructor
    public Commission(String name, String address, String phone,
                      String socialSecurityNumber, double hourlyRate, double commissionRate) {
        super(name, address, phone, socialSecurityNumber, hourlyRate);
        this.commissionRate = commissionRate;
        this.totalSales = 0.0;
    }

    // Menambahkan total penjualan
    public void addSales(double sales) {
        totalSales += sales;
    }

    // Hitung gaji + komisi
    public double pay() {
        double payment = super.pay(); // gaji per jam
        payment += totalSales * commissionRate; // tambahkan komisi
        totalSales = 0; // reset total sales
        return payment;
    }

    // Info pegawai
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: $" + totalSales;
        return result;
    }
}
