package service;

public class CashierTest {
    public void test001() {
        Cashier c = new Cashier();
        double actual = c.getTotal(50);
        assert actual == 50;
    }
    public void test002() {
        Cashier c = new Cashier();
        double actual = c.getTotal(200);
        assert actual == 190.0;
    }
    public void test99() {
        Cashier c = new Cashier();
        double actual = c.getTotal(99);
        assert actual == 99;
    }
    public void test100() {
        Cashier c = new Cashier();
        double actual = c.getTotal(100);
        assert actual == 95;
    }
    double delta = 0.000001;
    public void test101() {
        Cashier c = new Cashier();
        double actual = c.getTotal(101);
        double start = 95.95 - delta;
        double end = 95.95 + delta;
        assert start <= actual && actual <= end;
    }
    public void testFail() {
        Cashier c = new Cashier();
        double actual = c.getTotal(-7.0);
        assert actual == 0.0;
    }
}