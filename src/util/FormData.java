/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Hector Angel Gomez
 */
public class FormData {
    private float inputOne;
    private float inputSecond;
    private float inputThird;
    private float inputForth;

    public FormData(float v1, float v2, float v3, float v4) {
        this.inputOne = v1;
        this.inputSecond = v2;
        this.inputThird = v3;
        this.inputForth = v4;
    }

    public float getInputOne() {
        return inputOne;
    }

    public void setInputOne(float inputOne) {
        this.inputOne = inputOne;
    }

    public float getInputSecond() {
        return inputSecond;
    }

    public void setInputSecond(float inputSecond) {
        this.inputSecond = inputSecond;
    }

    public float getInputThird() {
        return inputThird;
    }

    public void setInputThird(float inputThird) {
        this.inputThird = inputThird;
    }

    public float getInputForth() {
        return inputForth;
    }

    public void setInputForth(float inputForth) {
        this.inputForth = inputForth;
    }
    
    public void print(){
        System.out.println();
        System.out.println("Input 1: " + String.valueOf(this.inputOne));
        System.out.println("Input 2: " + String.valueOf(this.inputSecond));
        System.out.println("Input 3: " + String.valueOf(this.inputThird));
        System.out.println("Input 4: " + String.valueOf(this.inputForth));
        System.out.println();
    }
}
