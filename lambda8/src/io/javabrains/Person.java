package io.javabrains;

public class Person {
    private String fName;
    private String fNlName;
    private String address;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfNlName() {
        return fNlName;
    }

    public void setfNlName(String fNlName) {
        this.fNlName = fNlName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String fName, String fNlName, String address) {
        this.fName = fName;
        this.fNlName = fNlName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", fNlName='" + fNlName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
