package com.MrBrain;

import com.MrBrain.ActivationFunctions.ActivationFunction;
import com.MrBrain.SignalCollectors.SignalCollector;

import java.util.List;

//TODO: Add interface over the top
public class NeuralNetwork
{
	public static class Builder
	{
		private List<NeuralNetLayer> layers;
		private int numberOfLayers;

		public Builder()
		{

		}

		public Builder withGivenNumberOfLayers(int numberOfLayers)
		{
			this.numberOfLayers = numberOfLayers;

			for (int i = 0; i < numberOfLayers; i++)
			{
				NeuralNetLayer layer = new NeuralNetLayer(i + 1);

				layers.add(layer);
			}

			return this;
		}


		public Builder addLayer()
		{

			this.layers.add(new NeuralNetLayer(numberOfLayers + 1));
			this.numberOfLayers += 1;

			return this;
		}

		public Builder addLayer(NeuralNetLayer layer)
		{
			layer.setId(numberOfLayers + 1);

			this.layers.add(layer);
			this.numberOfLayers += 1;

			return this;
		}

		public Builder addLayerWithGivenNumberOfNeurons(int numberOfNeurons)
		{
			NeuralNetLayer layer = new NeuralNetLayer(numberOfLayers + 1, numberOfNeurons);

			layers.add(layer);

			return this;
		}

		public Builder setLayerActivationFunction(int layer, ActivationFunction activationFunction)
		{
			this.layers.get(layer).setActivationFunction(activationFunction);

			return this;
		}

		public Builder setLayerSignalCollector(int layer, SignalCollector signalCollector)
		{
			this.layers.get(layer).setSignalCollector(signalCollector);

			return this;
		}

		public NeuralNetwork build()
		{
			NeuralNetwork network = new NeuralNetwork();
			network.setLayers(this.layers);
			network.setNumberOfLayers(this.numberOfLayers);

			return network;
		}
	}

	protected List<NeuralNetLayer> layers;

	protected int numberOfLayers;

	private NeuralNetwork()
	{

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
