package com.ws.controller;

import com.ws.testService.Service;

public class WebController {

    public static void main(String[] args) {
        Service service = new Service();
        Service.getService("web");
        while (true) {
            for (int i = 999999999; i > 0; i--) {
                for (int j = 0; j < 99999999; j++) {
                    System.out.println(i * j * i * j);
                }
            }
        }
    }
}
