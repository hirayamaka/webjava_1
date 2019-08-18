package jp.co.systena.tigerscave.springtest.model;

public class Item {

  private int    itemId;    //商品ID
  private String name;       //商品名
  private int    price;     //価格

  //コンストラクタ
  public Item() {

  }

  //商品IDを返す
  public int getItemId() {
    return itemId;
  }

  //商品名を返す
  public String getItemName() {
    return name;
  }

  //価格を返す
  public int getItemPrice() {
    return price;
  }

  //商品IDを設定
  public void setItemId(int itemId) {
    this.itemId = itemId;
  }

  //商品名を設定
  public void setItemName(String name) {
    this.name = name;
  }

  //価格を設定
  public void setItemPrice(int price) {
    this.price = price;
  }

  //Itemクラスを作成
  public Item(int itemId, String name, int price) {
    this.itemId = itemId;
    this.name = name;
    this.price = price;
  }

}
