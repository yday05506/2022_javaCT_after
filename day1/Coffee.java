package day1;

public class Coffee implements Comparable {
    private final String name;
    private final int price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Integer getPriceAsInteger() {
        return this.price;
    }

    public boolean equals(Object obj) {
        return((Coffee)obj).getPriceAsInteger().equals(getPriceAsInteger());
    }

    @Override
    public int compareTo(Object o) {
        Coffee e = (Coffee) o;
        // 값이 같으면 0, 주어진 객체 값보다 작으면 -1(음수), 주어진 객체값이 크면 1(양수)로 리턴
        return getPriceAsInteger().compareTo(e.getPriceAsInteger());
    }

    public String toString() {
        return "Coffee { " +
                "name = '" + name + '\'' +
                ", price = " + price +
                " }";
    }
}

