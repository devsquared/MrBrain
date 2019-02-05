package com.OpenMLava.NeuralNetwork.ActivationFunctions;

/**
 * Rectified Linear activation function. This will return the max of zero and the summed input to the function.
 */
public class RectifiedLinearFunction implements ActivationFunction
{
	@Override
	public double calculateOutput(double summedInput)
	{
		return Math.max(0, summedInput);
	}
}
