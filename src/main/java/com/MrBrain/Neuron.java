package com.MrBrain;

import java.util.ArrayList;
import java.util.List;

import com.MrBrain.ActivationFunctions.ActivationFunction;
import com.MrBrain.SignalCollectors.SignalCollector;

// TODO: Add interface over the top
public class Neuron
{
    private int id;

    protected List<NeuronConnection> inputConnections;

    protected List<NeuronConnection> outputConnections;

    protected SignalCollector signalCollector;

    protected ActivationFunction activationFunction;

    public Neuron()
    {
        inputConnections = new ArrayList<>();
        outputConnections = new ArrayList<>();
    }

    public Neuron(int id)
    {
        this.id = id;

        inputConnections = new ArrayList<>();
        outputConnections = new ArrayList<>();
    }

    public Neuron(int id, ArrayList<NeuronConnection> inputConnections, ArrayList<NeuronConnection> outputConnections)
    {
        this.id = id;
        this.inputConnections = inputConnections;
        this.outputConnections = outputConnections;
    }

    public double calculateOutput()
    {
        double totalInput = signalCollector.collectPrevLayerOutput(inputConnections);
        return activationFunction.calculateOutput(totalInput);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public java.util.List<NeuronConnection> getInputConnections()
    {
        return inputConnections;
    }

    public void setInputConnections(java.util.List<NeuronConnection> inputConnections)
    {
        this.inputConnections = inputConnections;
    }

    public java.util.List<NeuronConnection> getOutputConnections()
    {
        return outputConnections;
    }

    public void setOutputConnections(java.util.List<NeuronConnection> outputConnections)
    {
        this.outputConnections = outputConnections;
    }

	public com.MrBrain.SignalCollectors.SignalCollector getSignalCollector()
    {
        return signalCollector;
    }

	public void setSignalCollector(com.MrBrain.SignalCollectors.SignalCollector signalCollector)
    {
        this.signalCollector = signalCollector;
    }

	public com.MrBrain.ActivationFunctions.ActivationFunction getActivationFunction()
    {
        return activationFunction;
    }

	public void setActivationFunction(com.MrBrain.ActivationFunctions.ActivationFunction activationFunction)
    {
        this.activationFunction = activationFunction;
    }
}
