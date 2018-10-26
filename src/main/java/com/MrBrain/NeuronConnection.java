package com.MrBrain;

public class NeuronConnection
{
	protected Neuron fromNeuron;

	protected Neuron toNeuron;

	protected double weight;

	public NeuronConnection(Neuron fromNeuron, Neuron toNeuron)
	{
		this.fromNeuron = fromNeuron;
		this.toNeuron = toNeuron;
		this.weight = Math.random();
	}

	public NeuronConnection(Neuron fromNeuron, Neuron toNeuron, double weight)
	{
		this.fromNeuron = fromNeuron;
		this.toNeuron = toNeuron;
		this.weight = weight;
	}

	public Neuron getFromNeuron()
	{
		return fromNeuron;
	}

	public void setFromNeuron(Neuron fromNeuron)
	{
		this.fromNeuron = fromNeuron;
	}

	public Neuron getToNeuron()
	{
		return toNeuron;
	}

	public void setToNeuron(Neuron toNeuron)
	{
		this.toNeuron = toNeuron;
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public double getInput()
	{
		return fromNeuron.calculateOutput();
	}

	public double getWeightedInput()
	{
		return fromNeuron.calculateOutput() * weight;
	}
}
