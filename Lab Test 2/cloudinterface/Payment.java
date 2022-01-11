package cloudinterface;

import model.InsufficientAmount;

public interface Payment {
    public double doPayment(double payment) throws InsufficientAmount;
}