package org.knit.lab1;

public class SimpleUrl {
    private String protocol;
    private String address;

    public SimpleUrl(String protocol, String address) {
        this.protocol = protocol;
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "protocol ='" + protocol + '\'' +
                ", address='" + address + '\''
                ;
    }

    public SimpleUrl() {
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address
        ;
    }
}
