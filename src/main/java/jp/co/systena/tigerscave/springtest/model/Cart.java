package jp.co.systena.tigerscave.springtest.model;

import java.util.ArrayList;

public class Cart {

  //購入する商品のリスト
  private ArrayList<Order> orderList;

  //購入する商品リストを取得
  public ArrayList<Order> getOrderList(){
     return orderList;
  }

  //購入する商品リストを追加
  public void addOrderList(Order order){
     orderList.add(order);
  }

  //合計金額を取得する
  public int getTotalPrice() {
    int totalPrice = 0;

    for(Order order : this.orderList) {

    }

    return totalPrice;
  }

}