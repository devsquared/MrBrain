package com.MrBrain;

import com.MrBrain.ActivationFunctions.ActivationFunction;
import com.MrBrain.SignalCollectors.SignalCollector;

import java.util.ArrayList;
import java.util.List;

/**
 * Neural Network layer. This is the structure that contains all neurons of a given layer in the network.
 */
// TODO: Add interface over the top
public class NeuralNetLayer
{
	private int id;
	private List<Neuron> neurons;
	private int numberOfNeurons;
	private ActivationFunction activationFunction;
	private SignalCollector signalCollector;

	/**
	 * Constructor with a given id for numbering the layers.
	 *
	 * @param id
	 * 			int for the number of layer
	 */
	public NeuralNetLayer(int id)
	{
		this.id = id;
		neurons = new ArrayList<>();
	}

	/**
	 * Constructor with given id and list of neurons.
	 *
	 * @param id
	 * 			int for the number of the layer
	 * @param neurons
	 * 			list of neurons
	 */
	public NeuralNetLayer(int id, List<Neuron> neurons)
	{
		this.id = id;
		this.neurons = neurons;
		this.numberOfNeurons = neurons.size();
	}

	/**
	 * Constructor with given id and number of neurons to be created.
	 *
	 * @param id
	 * 			int for the number of the layer
	 * @param numberOfNeurons
	 * 			int for the number of neurons in the layer
	 */
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

	/**
	 * Constructor with given id and number of neurons. Also takes in a signal collector and activation function that
	 * are to be assigned to each neuron created within the layer.
	 *
	 * @param id
	 * 			int for the number of the layer
	 * @param signalCollector
	 * 			signal collector for all neurons in the layer
	 * @param activationFunction
	 * 			activation function for all neurons in the layer
	 * @param numberOfNeurons
	 * 			int for the number of neurons in the layer
	 */
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

	/**
	 * Get the ID of the layer.
	 *
	 * @return
	 * 			int for the number of the layer
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Set the ID of the layer.
	 *
	 * @param id
	 * 			int for the number of the layer
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * Get the list of neurons in the layer.
	 *
	 * @return
	 * 			list of neurons in the layer
	 */
	public List<Neuron> getNeurons()
	{
		return neurons;
	}

	/**
	 * Set the list of neurons in the layer.
	 *
	 * @param neurons
	 * 			list of neurons in the layer
	 */
	public void setNeurons(List<Neuron> neurons)
	{
		this.neurons = neurons;
	}

	/**
	 * Get the number of neurons in the layer.
	 *
	 * @return
	 * 			int of the number of neurons in layer
	 */
	public int getNumberOfNeurons()
	{
		return numberOfNeurons;
	}

	/**
	 * Set the number of neurons in the layer.
	 *
	 * @param numberOfNeurons
	 * 			int of the number of neurons in layer
	 */
	public void setNumberOfNeurons(int numberOfNeurons)
	{
		this.numberOfNeurons = numberOfNeurons;
	}

	/**
	 * Get the activation function of the layer.
	 *
	 * @return
	 * 			activation function of the layer
	 */
	public ActivationFunction getActivationFunction()
	{
		return activationFunction;
	}

	/**
	 * Set the activation function of the layer and apply it to all neurons (if neurons are set).
	 *
	 * @param activationFunction
	 * 			activation function of the layer
	 */
	public void setActivationFunction(ActivationFunction activationFunction)
	{
		this.activationFunction = activationFunction;

		// The following should be broken out into its own function.
		for (Neuron neuron : neurons)
		{
			neuron.setActivationFunction(activationFunction);
		}
	}

	/**
	 * Get the signal collector of the layer.
	 *
	 * @return
	 * 			signal collector of the layer
	 */
	public SignalCollector getSignalCollector()
	{
		return signalCollector;
	}

	/**
	 * Set the signal collector of the layer and apply it to all neurons (if neurons are set).
	 *
	 * @param signalCollector
	 */
	public void setSignalCollector(SignalCollector signalCollector)
	{
		this.signalCollector = signalCollector;

		// The following should be broken out into its own function.
		for (Neuron neuron : neurons)
		{
			neuron.setSignalCollector(signalCollector);
		}
	}
}
