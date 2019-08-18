package jp.co.systena.tigerscave.springtest.model;

public class ListForm {

  // 商品ID
  private int itemid;

  // 個数
  private int num;


  //商品IDを取得
  public int getItemId() {
    return itemid;
  }

  //個数を取得
  public int getItemQuantity() {
    return num;
  }

  //商品IDを設定
  public void setItemId(int itemid) {
    this.itemid = itemid;
  }

  //個数を設定
  public void setItemQuantity(int num) {
    this.num = num;
  }

}
