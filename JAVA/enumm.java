enum Status {
    PENDING(200), PROCESSING(300), COMPLETED, FAILED(400);

    private int price;

    Status() {
        price = 100;
    }

    Status(int p) {
        price = p;
    }

    public void setprice(int p)
    {
        this.price = p;
    }

    public int getPrice() {
        return price;
    }

    public static int getPrice(String status) {
        try {
            return valueOf(status).getPrice();
        } catch (IllegalArgumentException e) {
            // Handle the case where the status is not found
            return -1;
        }
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Status s = Status.COMPLETED;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] arr = Status.values();
        for (Status i : arr) {
            System.out.println(i + ": " + i.getPrice());
        }

        System.out.println(Status.getPrice("COMPLETED"));
    }
}
