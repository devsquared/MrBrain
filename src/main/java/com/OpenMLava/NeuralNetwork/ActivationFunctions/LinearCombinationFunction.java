package com.OpenMLava.NeuralNetwork.ActivationFunctions;

public class LinearCombinationFunction implements ActivationFunction
{
	private double bias;

	@Override
	public double calculateOutput(double summedInput)
	{
		return summedInput + bias;
	}

	/**
	 * Getter for bias.
	 *
	 * @return
	 * 			double value for bias
	 */
	public double getBias()
	{
		return bias;
	}

	/**
	 * Setter for bias.
	 *
	 * @param bias
	 * 			double value for bias
	 */
	public void setBias(double bias)
	{
		this.bias = bias;
	}
}
