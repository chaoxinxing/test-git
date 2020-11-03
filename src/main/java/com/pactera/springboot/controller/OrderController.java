package com.pactera.springboot.controller;

import com.pactera.springboot.model.Order;
import com.pactera.springboot.model.Product;
import com.pactera.springboot.service.OrderService;
import com.pactera.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author fseve
 * @Date 2020/10/30 14:37
 * @Version 1.0
 **/
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @Transactional
    @RequestMapping(value = "/submitOrder",method = RequestMethod.POST)
    public String submitOrder(Order order, Model model) {
        Product product = productService.findByPrimaryKey(order.getProductCode());
        Integer stock =product.getStockNumber();
        if(order.getNumber()==null){
            order.setNumber(1);
        }
        if(stock>=order.getNumber()){
            product.setStockNumber(stock-order.getNumber());
            productService.update(product);
            order.setOrderNo(System.currentTimeMillis() +order.getMemberCode());
            order.setName("订单");
            order.setDateTime(new Date());
            orderService.insert(order);
            model.addAttribute("msg","下单成功！");
            return "home";
        }else {
            model.addAttribute("product",product);
            model.addAttribute("msg","库存不足");
            return "order/addOrder";
        }
    }

    @RequestMapping("/listOrders/{id}")
    public String listOrders(@PathVariable("id")String id,Model model){
        List<Order> orders = orderService.findOrdersByMember(id);
//        List<Order> orders = orderService.select();
        model.addAttribute("orders",orders);
        return "order/listOrders";
    }
}
