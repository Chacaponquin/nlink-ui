/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cu.edu.cujae.ceis.nlink.ui.utilities;

/**
 *
 * @author Hector Angel Gomez
 */
public class TrainerData {
    private float neuron1;
    private float neuron2;
    private float neuron3;
    private float neuron4;
    private String result;
    
    public TrainerData(float n1, float n2, float n3, float n4, String result){
        this.neuron1 = n1;
        this.neuron2 = n2;
        this.neuron3 = n3;
        this.neuron4 = n4;
        this.result = result;
    }
    
    public void printData(){
        System.out.println();
        System.out.println("Neuron 1: " + String.valueOf(this.neuron1));
        System.out.println("Neuron 2: " + String.valueOf(this.neuron2));
        System.out.println("Neuron 3: " + String.valueOf(this.neuron3));
        System.out.println("Neuron 4: " + String.valueOf(this.neuron4));
        System.out.println("Result: " + this.result);
        System.out.println();
    }
    
    public float getNeuronOneValue(){
        return this.neuron1;
    }
    
    public void setNeuronOneValue(float v){
        this.neuron1 = v;
    }
    
    public float getNeuronSecondValue(){
        return this.neuron2;
    }
    
    public void setNeuronSecondValue(float v){
        this.neuron2 = v;
    }
    
    public float getNeuronThirdValue(){
        return this.neuron3;
    }
    
    public void setNeuronThridValue(float v){
        this.neuron3 = v;
    }
    
    public float getNeuronForthValue(){
        return this.neuron4;
    }
    
    public void setNeuronForthValue(float v){
        this.neuron4 = v;
    }
    
    public void setResult(String v){
        this.result = v;
    }
    
    public String getResult(){
        return this.result;
    }
}
