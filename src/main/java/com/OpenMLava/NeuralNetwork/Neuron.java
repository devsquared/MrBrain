package com.OpenMLava.NeuralNetwork;

import java.util.ArrayList;
import java.util.List;

import com.OpenMLava.NeuralNetwork.ActivationFunctions.ActivationFunction;
import com.OpenMLava.NeuralNetwork.SignalCollectors.SignalCollector;

/**
 * Neuron that stores the signal collector, activation function, and references to all connections.
 */
// TODO: Add interface over the top
public class Neuron
{
	private int id;
	private List<NeuronConnection> inputConnections;
	private List<NeuronConnection> outputConnections;
	private SignalCollector signalCollector;
	private ActivationFunction activationFunction;

	/**
	 * Default constructor.
	 */
	public Neuron()
	{
		inputConnections = new ArrayList<>();
		outputConnections = new ArrayList<>();
	}

	/**
	 * Constructor that takes in a known id.
	 *
	 * @param id
	 * 			int to number neuron
	 */
	Neuron(int id)
	{
		this.id = id;

		inputConnections = new ArrayList<>();
		outputConnections = new ArrayList<>();
	}

	/**
	 * Constructor that takes in a known id, a list of input connections, and a list of output connections.
	 *
	 * @param id
	 * 			int to number neuron
	 * @param inputConnections
	 * 			list of input connections
	 * @param outputConnections
	 * 			list of output connections
	 */
	public Neuron(int id, ArrayList<NeuronConnection> inputConnections, ArrayList<NeuronConnection> outputConnections)
	{
		this.id = id;
		this.inputConnections = inputConnections;
		this.outputConnections = outputConnections;
	}

	/**
	 * Constructor that takes in a known id, signal collector, and activation function.
	 *
	 * @param id
	 * 			int to number neuron
	 * @param signalCollector
	 * 			implemented signal collector
	 * @param activationFunction
	 * 			implemented activation function
	 */
	Neuron(int id, SignalCollector signalCollector, ActivationFunction activationFunction)
	{
		this.id = id;
		this.signalCollector = signalCollector;
		this.activationFunction = activationFunction;

		inputConnections = new ArrayList<>();
		outputConnections = new ArrayList<>();
	}

	/**
	 * Based on signal collector and activation function on neuron, calculate output.
	 *
	 * @return
	 * 			double value for output
	 */
	double calculateOutput()
	{
		double totalInput = signalCollector.collectPrevLayerOutput(inputConnections);
		return activationFunction.calculateOutput(totalInput);
	}

	/**
	 * Getter for the id of the neuron.
	 *
	 * @return
	 * 			int of the number for the neuron
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Set the id for the neuron.
	 *
	 * @param id
	 * 			int to number the neuron
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * Get the list of input connections.
	 *
	 * @return
	 * 			list of input connections
	 */
	public List<NeuronConnection> getInputConnections()
	{
		return inputConnections;
	}

	/**
	 * Set the input connections.
	 *
	 * @param inputConnections
	 * 			list of connections
	 */
	public void setInputConnections(List<NeuronConnection> inputConnections)
	{
		this.inputConnections = inputConnections;
	}

	/**
	 * Get the output connections of the neuron.
	 *
	 * @return
	 * 			list of output connections
	 */
	public List<NeuronConnection> getOutputConnections()
	{
		return outputConnections;
	}

	/**
	 * Set the output connections.
	 *
	 * @param outputConnections
	 * 			list of connections
	 */
	public void setOutputConnections(java.util.List<NeuronConnection> outputConnections)
	{
		this.outputConnections = outputConnections;
	}

	/**
	 * Get the signal collector of the neuron.
	 *
	 * @return
	 * 			Signal Collector for neuron
	 */
	public SignalCollector getSignalCollector()
	{
		return signalCollector;
	}

	/**
	 * Set the single collector for the neuron.
	 *
	 * @param signalCollector
	 * 			Signal Collector for neuron
	 */
	void setSignalCollector(SignalCollector signalCollector)
	{
		this.signalCollector = signalCollector;
	}

	/**
	 * Get the activation function for the neuron.
	 *
	 * @return
	 * 			activation function for neuron
	 */
	public ActivationFunction getActivationFunction()
	{
		return activationFunction;
	}

	/**
	 * Set the activation function for the neuron.
	 *
	 * @param activationFunction
	 * 			activation function for neuron
	 */
	void setActivationFunction(ActivationFunction activationFunction)
	{
		this.activationFunction = activationFunction;
	}
}
