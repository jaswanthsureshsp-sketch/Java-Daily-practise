interface Payment {
    void pay();
}

interface OnlinepPayment extends Payment  {
    void refund();
}

class UPI implements OnlinepPayment {
    public void pay(){
        System.out.println("Payment SuccessFull");
    }
    public void refund(){
        System.out.println("refund SuccessFull");
    }
}

class Geeks39 {
    public static void main(String[] args) {
        UPI upi = new UPI();
        upi.pay();
        upi.refund();
    }
}