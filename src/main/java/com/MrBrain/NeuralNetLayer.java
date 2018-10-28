package com.MrBrain;

import java.util.ArrayList;
import java.util.List;

// TODO: Add interface over the top
public class NeuralNetLayer
{
	private int id;

	protected List<Neuron> neurons;

	public NeuralNetLayer(int id)
	{
		this.id = id;
		neurons = new ArrayList<>();
	}

	public NeuralNetLayer(int id, List<Neuron> neurons)
	{
		this.id = id;
		this.neurons = neurons;
	}
}
