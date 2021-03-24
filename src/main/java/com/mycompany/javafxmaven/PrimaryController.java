package com.mycompany.javafxmaven;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PrimaryController {

    @FXML
    private TextField mouse; 
    @FXML
    private TextField usb;
    @FXML
    private TextField charger;
    @FXML
    private TextField discount;
    @FXML
    private CheckBox mouseC;
    @FXML
    private CheckBox usbC;
    @FXML
    private CheckBox chargerC;
    @FXML
    private Text output;
    
    
    public PrimaryController(){
        
    }
    public void enMouse(ActionEvent ev){
        if(mouseC.isSelected()){
            mouse.setEditable(true);
        }
        else{
            mouse.setEditable(false);
            mouse.setText("");
        }
    }
    public void enUsb(ActionEvent ev){
        if(usbC.isSelected()){
            usb.setEditable(true);
        }
        else{
            usb.setEditable(false);
            usb.setText("");
        }
    }
    
    public void enCharger(ActionEvent ev){
        if(chargerC.isSelected()){
            charger.setEditable(true);
        }
        else{
            charger.setEditable(false);
            charger.setText("");
        }
    }
    
    public void total(ActionEvent ev){
        int mouseQ=0;
        if(mouse.getText().equals("")){
            mouseQ=0;
        }
        else{
            mouseQ=Integer.parseInt(mouse.getText());
        }
        int usbQ=0;
        if(usb.getText().equals("")){
            usbQ=0;
        }
        else{
            usbQ=Integer.parseInt(usb.getText());
        }
        int chargerQ=0;
        if(charger.getText().equals("")){
            chargerQ=0;
        }
        else{
            chargerQ=Integer.parseInt(charger.getText());
        }
        int discountA=0;
        if(discount.getText().equals("")){
            discountA=0;
        }
        else{
            discountA=Integer.parseInt(discount.getText());
        }
        int total=(mouseQ*10)+(usbQ*20)+(chargerQ*15)-discountA;
        if(mouseQ==0){
            output.setText("USB = $"+(usbQ*20)+"\nCharger = $"+(chargerQ*15)+"\nDiscount = $"+String.valueOf(discountA)+"\n--------------------------------\n"+"Total = $"+String.valueOf(total));
        }
        else{
            if(usbQ==0){
                output.setText("Mouse = $"+(mouseQ*10)+"\nCharger = $"+(chargerQ*15)+"\nDiscount = $"+String.valueOf(discountA)+"\n--------------------------------\n"+"Total = $"+String.valueOf(total));
            }
            else{
                if(chargerQ==0){
                    output.setText("Mouse = $"+(mouseQ*10)+"\nUSB = $"+(usbQ*20)+"\nDiscount = $"+String.valueOf(discountA)+"\n--------------------------------\n"+"Total = $"+String.valueOf(total));
                }
                else{
                    output.setText("Mouse = $"+(mouseQ*10)+"\nUSB = $"+(usbQ*20)+"\nCharger = $"+(chargerQ*15)+"\nDiscount = $"+String.valueOf(discountA)+"\n--------------------------------\n"+"Total = $"+String.valueOf(total));
                }
            }
        }
    }
    public void reset(ActionEvent ev){
        mouse.setText("");
        usb.setText("");
        charger.setText("");
        discount.setText("");
        output.setText("");
        mouseC.setSelected(false);
        usbC.setSelected(false);
        chargerC.setSelected(false);
        mouse.setEditable(false);
        usb.setEditable(false);
        charger.setEditable(false);
    }
    public void exit(ActionEvent ev){
        System.exit(0);
    }
    
}
