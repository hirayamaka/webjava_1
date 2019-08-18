package jp.co.systena.tigerscave.springtest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.springtest.Service.ListService;
import jp.co.systena.tigerscave.springtest.model.Item;

@Controller
public class ListController {

  @Autowired
  HttpSession session; // セッション管理

  @RequestMapping(value = "/itemlist", method = RequestMethod.GET) // URLとのマッピング
  public ModelAndView index(ModelAndView mav) {

    //商品一覧を取得
    Map<Integer, Item> itemListMap = getItemListMap();
    mav.addObject("itemList", itemListMap);

    /*Cart cart = getCart();
    mav.addObject("orderList", cart.getOrderList());

    // 合計金額計算
    int totalPrice = 0;
    for (Order order : cart.getOrderList()) {
      if (itemListMap.containsKey(order.getItemId())) {
        totalPrice += order.getItemQuantity() * itemListMap.get(order.getItemId()).getItemPrice();
      }
    }
    mav.addObject("totalPrice", totalPrice);*/

    mav.setViewName("ListView");
    return mav;
  }

  //商品一覧を取得
  private Map<Integer, Item> getItemListMap() {
    ListService service = new ListService();
    List<Item> itemList = service.getItemList();

    // 商品一覧をMapに入れ直し
    Map<Integer, Item> itemListMap = new HashMap<Integer, Item>();
    for (Item item : itemList) {
      itemListMap.put(item.getItemId(), item);
    }

    return itemListMap;
  }

}