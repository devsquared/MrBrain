package com.OpenMLava.NeuralNetwork;

/**
 * The Neuron Connection between neurons within the network. The main purpose of this is to hold the weight
 * and to properly keep the neurons in order.
 */
public class NeuronConnection
{
	private Neuron fromNeuron;
	private Neuron toNeuron;
	private double weight;

	/**
	 * Constructor with to and from Neurons given.
	 *
	 * @param fromNeuron
	 * 			neuron on left
	 * @param toNeuron
	 * 			neuron on right
	 */
	public NeuronConnection(Neuron fromNeuron, Neuron toNeuron)
	{
		this.fromNeuron = fromNeuron;
		this.toNeuron = toNeuron;
		this.weight = Math.random();
	}

	/**
	 * Constructor with to and from Neurons with a weight.
	 *
	 * @param fromNeuron
	 * 			neuron on left
	 * @param toNeuron
	 * 			neuron on right
	 * @param weight
	 * 			weight for this connection
	 */
	public NeuronConnection(Neuron fromNeuron, Neuron toNeuron, double weight)
	{
		this.fromNeuron = fromNeuron;
		this.toNeuron = toNeuron;
		this.weight = weight;
	}

	/**
	 * Get from neuron.
	 *
	 * @return
	 * 			neuron on left
	 */
	public Neuron getFromNeuron()
	{
		return fromNeuron;
	}

	/**
	 * Settter for the from neuron.
	 *
	 * @param fromNeuron
	 * 			neuron to be on left
	 */
	public void setFromNeuron(Neuron fromNeuron)
	{
		this.fromNeuron = fromNeuron;
	}

	/**
	 * Get to neuron.
	 *
	 * @return
	 * 			neuron on right
	 */
	public Neuron getToNeuron()
	{
		return toNeuron;
	}

	/**
	 * Setter for the neuron on the right.
	 *
	 * @param toNeuron
	 * 			neuron to be on right
	 */
	public void setToNeuron(Neuron toNeuron)
	{
		this.toNeuron = toNeuron;
	}

	/**
	 * Get weight for connection.
	 *
	 * @return
	 * 			double value for weight
	 */
	public double getWeight()
	{
		return weight;
	}

	/**
	 * Setter for the weight of the connection.
	 *
	 * @param weight
	 * 			double value for weight
	 */
	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	/**
	 * Get the input to connection. This is simply the output of the from neuron.
	 *
	 * @return
	 * 			double value of input to connection
	 */
	public double getInput()
	{
		return fromNeuron.calculateOutput();
	}

	/**
	 * Get the weighted input of the connection. This is simply the output of the from neuron multiplied by the weight.
	 *
	 * @return
	 * 			double value of the weighted input to connection
	 */
	public double getWeightedInput()
	{
		return fromNeuron.calculateOutput() * weight;
	}
}
