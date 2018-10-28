package com.MrBrain;

import com.MrBrain.ActivationFunctions.ActivationFunction;
import com.MrBrain.SignalCollectors.SignalCollector;

import java.util.ArrayList;
import java.util.List;

// TODO: Add interface over the top
public class NeuralNetLayer
{
	private int id;

	protected List<Neuron> neurons;

	protected int numberOfNeurons;

	protected ActivationFunction activationFunction;

	protected SignalCollector signalCollector;

	public NeuralNetLayer(int id)
	{
		this.id = id;
		neurons = new ArrayList<>();
	}

	public NeuralNetLayer(int id, List<Neuron> neurons)
	{
		this.id = id;
		this.neurons = neurons;
		this.numberOfNeurons = neurons.size();
	}

	public NeuralNetLayer(int id, int numberOfNeurons)
	{
		this.id = id;
		this.numberOfNeurons = numberOfNeurons;

		for (int i = 0; i < numberOfNeurons; i++)
		{
			Neuron neuron = new Neuron(i + 1);

			neurons.add(neuron);
		}
	}

	public NeuralNetLayer(int id, SignalCollector signalCollector, ActivationFunction activationFunction, int numberOfNeurons)
	{
		this.id = id;
		this.numberOfNeurons = numberOfNeurons;

		for (int i = 0; i < numberOfNeurons; i++)
		{
			Neuron neuron = new Neuron(i + 1, signalCollector, activationFunction);

			neurons.add(neuron);
		}
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public List<Neuron> getNeurons()
	{
		return neurons;
	}

	public void setNeurons(List<Neuron> neurons)
	{
		this.neurons = neurons;
	}

	public int getNumberOfNeurons()
	{
		return numberOfNeurons;
	}

	public void setNumberOfNeurons(int numberOfNeurons)
	{
		this.numberOfNeurons = numberOfNeurons;
	}

	public ActivationFunction getActivationFunction()
	{
		return activationFunction;
	}

	public void setActivationFunction(ActivationFunction activationFunction)
	{
		this.activationFunction = activationFunction;

		for (Neuron neuron : neurons)
		{
			neuron.setActivationFunction(activationFunction);
		}
	}

	public SignalCollector getSignalCollector()
	{
		return signalCollector;
	}

	public void setSignalCollector(SignalCollector signalCollector)
	{
		this.signalCollector = signalCollector;

		for (Neuron neuron : neurons)
		{
			neuron.setSignalCollector(signalCollector);
		}
	}
}
