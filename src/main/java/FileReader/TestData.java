package FileReader;

public class TestData {
    private String name;
    private String data;

    public String getName() {
        return name;
    }

    public TestData(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public String getData() {
        return data;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return name + ',' + data;
    }

    public static TestData fromString(String line) {
        String[] parts = line.split(",");
        String name = parts[0];
        String data = parts[1];
        return new TestData(name, data);
    }



}
