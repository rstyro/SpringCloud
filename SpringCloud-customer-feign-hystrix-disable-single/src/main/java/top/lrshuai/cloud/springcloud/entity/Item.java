package top.lrshuai.cloud.springcloud.entity;

public class Item {
	private String id;
	private String name;
	private String desc;
	
	public Item() {
		super();
	}

	public Item(String id) {
		super();
		this.id = id;
		this.name = "name"+id;
		this.desc = "desc"+id;
	}
	
	public Item(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}
	
}
