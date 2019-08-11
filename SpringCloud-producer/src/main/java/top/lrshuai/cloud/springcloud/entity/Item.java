package top.lrshuai.cloud.springcloud.entity;

public class Item {
    private String id;
    private String port;

    public Item() {
        super();
    }


    public Item(String id, String port) {
        super();
        this.id = id;
        this.port = port;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }


    @Override
    public String toString() {
        return "Item [id=" + id + ", port=" + port + "]";
    }


}
