package com.MrBrain;

import java.util.List;

//TODO: Add interface over the top
public class NeuralNetwork
{
	protected List<NeuralNetLayer> layers;

	public NeuralNetwork(List<NeuralNetLayer> layers)
	{
		this.layers = layers;
	}

	public NeuralNetwork(int numberOfLayers)
	{
		for (int i = 0; i < numberOfLayers; i++)
		{
			// set the id as the number of layer it is
			this.layers.add(new NeuralNetLayer(i + 1));
		}
	}
}
