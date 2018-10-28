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

    public Neuron(int id, SignalCollector signalCollector, ActivationFunction activationFunction)
	{
		this.id = id;
		this.signalCollector = signalCollector;
		this.activationFunction = activationFunction;

		inputConnections = new ArrayList<>();
		outputConnections = new ArrayList<>();
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

    public List<NeuronConnection> getInputConnections()
    {
        return inputConnections;
    }

    public void setInputConnections(List<NeuronConnection> inputConnections)
    {
        this.inputConnections = inputConnections;
    }

    public List<NeuronConnection> getOutputConnections()
    {
        return outputConnections;
    }

    public void setOutputConnections(java.util.List<NeuronConnection> outputConnections)
    {
        this.outputConnections = outputConnections;
    }

	public SignalCollector getSignalCollector()
    {
        return signalCollector;
    }

	public void setSignalCollector(SignalCollector signalCollector)
    {
        this.signalCollector = signalCollector;
    }

	public ActivationFunction getActivationFunction()
    {
        return activationFunction;
    }

	public void setActivationFunction(ActivationFunction activationFunction)
    {
        this.activationFunction = activationFunction;
    }
}
