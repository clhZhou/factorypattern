package com.upluis.homework.payscene;

/**
 * @author luis
 * @date 2020/2/24
 */
public class AliPay implements IPay{

    @Override
    public void ToPay() {
        System.out.println("欢迎使用阿里支付");
    }
}