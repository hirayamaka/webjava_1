package jp.co.systena.tigerscave.springtest.model;

public class Order {

  public int itemId;//商品ID
  public int num;   //個数

  //商品IDを返す
  public int getItemId() {
    return itemId;
  }

  //個数を返す
  public int getItemQuantity() {
    return num;
  }

  //商品IDを設定
  public void setItemId(int itemId) {
    this.itemId = itemId;
  }

  //個数を設定
  public void setItemQuantity(int num) {
    this.num = num;
  }

}
