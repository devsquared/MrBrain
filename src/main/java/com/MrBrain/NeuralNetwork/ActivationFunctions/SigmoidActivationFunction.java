package com.MrBrain.NeuralNetwork.ActivationFunctions;

public class SigmoidActivationFunction implements ActivationFunction
{
	private double slope;

	/**
	 * Constructor for the Sigmoid activation function.
	 *
	 * @param slope
	 * 			given slope as double
	 */
	public SigmoidActivationFunction(double slope)
	{
		this.slope = slope;
	}

	@Override
	public double calculateOutput(double summedInput)
	{
		double denominator = 1 + Math.exp(-slope * summedInput);

		return (1d / denominator);
	}
}
