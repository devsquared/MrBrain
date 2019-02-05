package com.MrBrain.NeuralNetwork;

import com.MrBrain.NeuralNetwork.ActivationFunctions.ActivationFunction;
import com.MrBrain.NeuralNetwork.SignalCollectors.SignalCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Neural Network containing the layers of neurons.
 */
public class SimpleNeuralNetwork implements NeuralNetwork
{
	/**
	 * Builder class for Neural Network.
	 */
	public static class Builder
	{
		private List<NeuralNetLayer> layers;
		private int numberOfLayers;

		/**
		 * Default constructor for Buidler.
		 */
		public Builder()
		{
			this.layers = new ArrayList<>();
		}

		/**
		 * Add a number of layers to the network; id's are given as layers are created.
		 *
		 * @param numberOfLayers
		 * 			int of number of layers
		 * @return
		 * 			instance of Builder with a number of layers
		 */
		public Builder withGivenNumberOfLayers(int numberOfLayers)
		{
			this.numberOfLayers = numberOfLayers;

			IntStream.of(numberOfLayers).forEach(i -> layers.add(new NeuralNetLayer(i + 1)));

			return this;
		}

		/**
		 * Add a layer to the network.
		 *
		 * @return
		 * 			instance of Builder with an added layer
		 */
		public Builder addLayer()
		{

			this.layers.add(new NeuralNetLayer(numberOfLayers + 1));
			this.numberOfLayers += 1;

			return this;
		}

		/**
		 * Add a layer that has been set up elsewhere.
		 *
		 * @param layer
		 * 			Neural Network Layer
		 * @return
		 * 			instance of Buildcer with an added layer
		 */
		public Builder addLayer(NeuralNetLayer layer)
		{
			layer.setId(numberOfLayers + 1);

			this.layers.add(layer);
			this.numberOfLayers += 1;

			return this;
		}

		/**
		 * Add a layer with a given number of neurons.
		 *
		 * @param numberOfNeurons
		 * 			int of number of neurons
		 * @return
		 * 			instance of Builder with an added layer
		 */
		public Builder addLayerWithGivenNumberOfNeurons(int numberOfNeurons)
		{
			NeuralNetLayer layer = new NeuralNetLayer(numberOfLayers + 1, numberOfNeurons);

			layers.add(layer);

			return this;
		}

		/**
		 * Set the activation function of a given layer.
		 *
		 * @param layer
		 * 			int that selects layer to set its activation function
		 * @param activationFunction
		 * 			implemented activation function
		 * @return
		 * 			instance of Builder with a layer that has an activation function
		 */
		public Builder setLayerActivationFunction(int layer, ActivationFunction activationFunction)
		{
			this.layers.get(layer).setActivationFunction(activationFunction);

			return this;
		}

		/**
		 * Set the signal collector of a given layer.
		 *
		 * @param layer
		 * 			int that selects layer to set its signal collector
		 * @param signalCollector
		 * 			implemented signal collector
		 * @return
		 * 			instance of Builder with a layer that has a signal collector
		 */
		public Builder setLayerSignalCollector(int layer, SignalCollector signalCollector)
		{
			this.layers.get(layer).setSignalCollector(signalCollector);

			return this;
		}

		/**
		 * Build function for the builder.
		 *
		 * @return
		 * 			a fully built neural network
		 */
		public SimpleNeuralNetwork build()
		{
			SimpleNeuralNetwork network = new SimpleNeuralNetwork();
			network.setLayers(this.layers);
			network.setNumberOfLayers(this.numberOfLayers);

			return network;
		}
	}

	private List<NeuralNetLayer> layers;

	private int numberOfLayers;

	/**
	 * Default constructor.
	 */
	private SimpleNeuralNetwork()
	{
		this.layers = new ArrayList<>();
	}

	/**
	 * Get the number of layers.
	 *
	 * @return
	 * 			int of the number of layers in the network
	 */
	public int getNumberOfLayers()
	{
		return numberOfLayers;
	}

	/**
	 * Set the number of layers of the network.
	 *
	 * @param numberOfLayers
	 * 			int of the number of layers in the network
	 */
	private void setNumberOfLayers(int numberOfLayers)
	{
		this.numberOfLayers = numberOfLayers;
	}

	/**
	 * Get the list of layers of the network.
	 *
	 * @return
	 * 			list of layers of the network
	 */
	public List<NeuralNetLayer> getLayers()
	{
		return layers;
	}

	/**
	 * Set the layers of the network.
	 *
	 * @param layers
	 * 			list of layers
	 */
	private void setLayers(List<NeuralNetLayer> layers)
	{
		this.layers = layers;
	}

	@Override
	public void train(Object[][] data)
	{
		//implement train
	}

	@Override
	public double predict()
	{
		return 0;
	}
}
