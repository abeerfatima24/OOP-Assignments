class Data {
    int value;

    Data(int val) {
        this.value = val;
    }
}

class ShallowExample implements Cloneable {
    Data data;

    ShallowExample(int val) {
        this.data = new Data(val);
    }

    // Default Object.clone() performs a Shallow Copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("Value: " + data.value + " | Reference Hash: " + System.identityHashCode(data));
    }
}