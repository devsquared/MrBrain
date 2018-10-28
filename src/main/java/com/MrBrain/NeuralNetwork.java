package com.MrBrain;

import com.MrBrain.ActivationFunctions.ActivationFunction;
import com.MrBrain.SignalCollectors.SignalCollector;

import java.util.List;

//TODO: Add interface over the top
public class NeuralNetwork
{
	protected List<NeuralNetLayer> layers;

	protected int numberOfLayers;

	public NeuralNetwork(List<NeuralNetLayer> layers)
	{
		this.layers = layers;
		this.numberOfLayers = layers.size();
	}

	public NeuralNetwork(int numberOfLayers)
	{
		this.numberOfLayers = numberOfLayers;

		for (int i = 0; i < numberOfLayers; i++)
		{
			// set the id as the number of layer it is
			this.layers.add(new NeuralNetLayer(i + 1));
		}
	}

	public void addLayer()
	{
		this.layers.add(new NeuralNetLayer(numberOfLayers));
		this.numberOfLayers += 1;
	}

	public void addLayer(NeuralNetLayer layer)
	{
		this.layers.add(layer);
		this.numberOfLayers += 1;
	}

	public void addLayerWith(SignalCollector signalCollector, ActivationFunction activationFunction, int numberOfNeurons)
	{
		NeuralNetLayer layer = new NeuralNetLayer(numberOfLayers, signalCollector, activationFunction, numberOfNeurons);

		this.layers.add(layer);
		this.numberOfLayers += 1;
	}

	public int getNumberOfLayers()
	{
		return numberOfLayers;
	}

	public void setNumberOfLayers(int numberOfLayers)
	{
		this.numberOfLayers = numberOfLayers;
	}

	public List<NeuralNetLayer> getLayers()
	{
		return layers;
	}

	public void setLayers(List<NeuralNetLayer> layers)
	{
		this.layers = layers;
	}
}
