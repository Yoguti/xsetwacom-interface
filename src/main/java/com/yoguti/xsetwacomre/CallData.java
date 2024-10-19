/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoguti.xsetwacomre;

/**
 *
 * @author schneider
 */
class CallData {
    private String device;
    private String parameter;
    private String value;

    public CallData(String device, String parameter, String value) {
        this.device = device;
        this.parameter = parameter;
        this.value = value;
    }

    public String getDevice() { return device; }
    public String getParameter() { return parameter; }
    public String getValue() { return value; }
}
