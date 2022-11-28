package com.example.Controller;

import com.example.interfaces.IVem;
import com.example.interfaces.IVemState;
import com.example.interfaces.Observable;

public class ViemController {
    private IVem viem;
    private IVemState vemState;
    public ViemController(IVem viem,IVemState vemState){
        this.viem = viem;
        this.vemState= vemState;
        this.initController();
    }


    private void initController(){
        //this.viem.getjButton().addActionListener(e -> changeText());
        this.changeText();
    }

    private void changeText(){
        this.vemState.setTexto("Olá Mundo!");
        this.notifyListeners();
    }

    private void notifyListeners (){
        this.viem.update();
    }

}
