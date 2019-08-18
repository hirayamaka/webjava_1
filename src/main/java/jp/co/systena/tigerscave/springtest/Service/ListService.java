package jp.co.systena.tigerscave.springtest.Service;

import java.util.ArrayList;
import java.util.List;
import jp.co.systena.tigerscave.springtest.model.Item;

public class ListService {

  //商品一覧を取得する
  public List<Item> getItemList() {

    List<Item> itemList = new ArrayList<Item>();

    //商品オブジェクトを生成
    Item item1 = new Item();
    Item item2 = new Item();
    Item item3 = new Item();

    //1番目の商品
    item1.setItemId(1);
    item1.setItemName("a");
    item1.setItemPrice(1000);
    itemList.add(item1);

    //2番目の商品
    item2.setItemId(2);
    item2.setItemName("b");
    item2.setItemPrice(2000);
    itemList.add(item2);

    //3番目の商品
    item3.setItemId(3);
    item3.setItemName("c");
    item3.setItemPrice(3000);
    itemList.add(item3);

    Item item4 = new Item(4,"d",4000);
    itemList.add(item4);

    return itemList;
  }

}