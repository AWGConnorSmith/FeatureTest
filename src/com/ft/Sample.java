package com.ft;

public class Sample {

  private String name;
  private String description;

  public Sample() {}

  public Sample(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }
  
  public String toJson() {
	  StringBuilder sb = new StringBuilder();
	  sb.append("{");
	  sb.append("\"name\":\"");
	  sb.append(name);
	  sb.append("\",");
	  sb.append("\"description\":\"");
	  sb.append(description);
	  sb.append("\"");
	  sb.append("}");
	  return sb.toString();
  }
  
}
