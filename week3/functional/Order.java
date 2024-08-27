package week3.functional;

public class Order {

  private String name;
  private Double amount;

  public Order(String name, Double i) {
    this.name = name;
    this.amount = i;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}