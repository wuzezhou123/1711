package com.bw.pojo;

public class Movie {
	private Integer id;
	private String name;
	private String direct;
	private Double price;
	private String time;
	private Integer timelong;
	private String type;
	private Integer years;
	private String area;
	private Integer status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirect() {
		return direct;
	}
	public void setDirect(String direct) {
		this.direct = direct;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getTimelong() {
		return timelong;
	}
	public void setTimelong(Integer timelong) {
		this.timelong = timelong;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getYears() {
		return years;
	}
	public void setYears(Integer years) {
		this.years = years;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", direct=" + direct + ", price=" + price + ", time=" + time
				+ ", timelong=" + timelong + ", type=" + type + ", years=" + years + ", area=" + area + ", status="
				+ status + "]";
	}
	public Movie(Integer id, String name, String direct, Double price, String time, Integer timelong, String type,
			Integer years, String area, Integer status) {
		super();
		this.id = id;
		this.name = name;
		this.direct = direct;
		this.price = price;
		this.time = time;
		this.timelong = timelong;
		this.type = type;
		this.years = years;
		this.area = area;
		this.status = status;
	}
	public Movie() {
		super();
	}
	
}
