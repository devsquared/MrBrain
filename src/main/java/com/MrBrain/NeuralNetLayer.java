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

	public NeuralNetLayer(int id, SignalCollector signalCollector, ActivationFunction activationFunction, int numberOfNeurons)
	{
		this.id = id;
		this.numberOfNeurons = numberOfNeurons;

		for (int i = 0; i < numberOfNeurons; i++)
		{
			Neuron neuron = new Neuron(id, signalCollector, activationFunction);

			neurons.add(neuron);
		}
	}
}
