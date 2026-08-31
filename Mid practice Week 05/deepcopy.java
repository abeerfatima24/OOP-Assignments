class Data {
    int value;

    Data(int val) {
        this.value = val;
    }

    // Deep copy helper for Data class
    Data(Data other) {
        this.value = other.value;
    }
}

class DeepExample implements Cloneable {
    Data data;

    DeepExample(int val) {
        this.data = new Data(val);
    }

    // Custom clone method for DEEP COPY
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepExample cloned = (DeepExample) super.clone();
        // Manually creating a new Data object so references are separate
        cloned.data = new Data(this.data);
        return cloned;
    }

    void display() {
        System.out.println("Value: " + data.value + " | Reference Hash: " + System.identityHashCode(data));
    }
}
